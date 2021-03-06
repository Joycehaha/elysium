package org.elysium.ui.refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.IConditionChecker;
import org.eclipse.ltk.core.refactoring.participants.RefactoringArguments;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.xtext.resource.IResourceDescription;
import org.elysium.ui.Activator;
import org.elysium.ui.LilyPondPerspective;
import org.elysium.ui.preferences.LilyPondRefactoringPreferencePage;

import com.google.common.base.Joiner;

/**
 * wrapper for a single refactoring operation
 * 
 * ... regardless of the type of refactoring and how many resources are involved
 * */
class LilyPondRefactoringDelegate implements IConditionChecker{

	public static final String NAME = "Update LilyPond references";

	static enum Operation{
		delete, move, rename;
	}

	private final LilyPondRefactoringInjects refactoringSupport;
	private LilyPondRefactoring ref;

	private List<LilyPondSourceFileRefactoring> handlers=new ArrayList<LilyPondSourceFileRefactoring>();
	private boolean preChangeAlreadyCreated=false;
	private boolean changeAlreadyCreated=false;

	private LilyPondRefactoringDelegate(Operation op, LilyPondRefactoringInjects refactoringSupport) {
		this.refactoringSupport=refactoringSupport;
		ref=new LilyPondRefactoring(op, refactoringSupport);
	}

	public static LilyPondRefactoringDelegate get(Operation op, CheckConditionsContext context, LilyPondRefactoringInjects refactorings){
		//ensure that the same instance is used for the refactoring, even if multiple files and folders are involved
		LilyPondRefactoringDelegate refactoringDelegate = (LilyPondRefactoringDelegate)context.getChecker(LilyPondRefactoringDelegate.class);
		if(refactoringDelegate==null){
			refactoringDelegate=createDelegate(op, refactorings);
			try {
				context.add(refactoringDelegate);
				refactoringDelegate.initCompiledFiles(context);
			} catch (CoreException e) {
				Activator.logError("error initializing LilyPond RefactoringManager", e);
			}
		}
		return refactoringDelegate;
	}

	private static LilyPondRefactoringDelegate createDelegate(Operation op, LilyPondRefactoringInjects refactorings) {
		if(refactorings.getPreference(LilyPondRefactoringPreferencePage.REFACTORING_IS_ENABLED)) {
			return new LilyPondRefactoringDelegate(op, refactorings);
		} else {
			return new NullImpl(op, refactorings);
		}
	}

	private void initCompiledFiles(CheckConditionsContext context){
		IConditionChecker checker = context.getChecker(ResourceChangeChecker.class);
		if (checker instanceof ResourceChangeChecker) {
			ResourceChangeChecker resourceChangeChecker = (ResourceChangeChecker)checker;
			IResourceDelta delta = resourceChangeChecker.getDeltaFactory().getDelta();
			try {
				delta.accept(new IResourceDeltaVisitor() {
					@Override
					public boolean visit(IResourceDelta delta) throws CoreException {
						IResource resource = delta.getResource();
						if (resource!=null && resource.getType()==IResource.FILE) {
							IFile file=(IFile)resource;
							if(refactoringSupport.isCompiled(file)){
								addFileToRefactor(file, null);
							}
						}
						return true;
					}
				});
			} catch (CoreException e) {
				Activator.logError("Can't check whether multiple LilyPond files are being moved", e);
			}
		}
	}

	@Override
	public RefactoringStatus check(IProgressMonitor monitor)
			throws CoreException {
		initHandlers(monitor);
		RefactoringStatus result=new RefactoringStatus();
		List<String> refactoredOpenDirtyFiles = getRefactoredOpenDirtyFiles();
		if(refactoredOpenDirtyFiles.isEmpty()) {
			addHandlerIssues(result, monitor);
			ref.addSearchPathAffectedIssues(result);
		}else {
			result.addFatalError("Refactoring involves open unsaved files: "+Joiner.on(", ").join(refactoredOpenDirtyFiles));
		}
		return result;
	}

	private List<String> getRefactoredOpenDirtyFiles(){
		Set<IFile> refactoredOpenDirtyFile=new HashSet<>();
		List<IFile> allOpenDirtyFiles = LilyPondPerspective.getAllOpenDirtyFiles();
		for (LilyPondSourceFileRefactoring handler : handlers) {
			refactoredOpenDirtyFile.addAll(handler.getRefactoredFiles(allOpenDirtyFiles));
		}
		List<String> result=new ArrayList<>();
		for (IFile iFile : refactoredOpenDirtyFile) {
			result.add(iFile.getName());
		}
		Collections.sort(result);
		return result;
	}


	private void addHandlerIssues(RefactoringStatus status, IProgressMonitor monitor) {
		for (LilyPondSourceFileRefactoring handler : handlers) {
			if(monitor.isCanceled()){
				break;
			}
			handler.addIssues(status);
		}
	}

	private void initHandlers(IProgressMonitor monitor){
		for (IResourceDescription desc : refactoringSupport.getAllResourceDescriptions()) {
			if(monitor.isCanceled()){
				break;
			}
			if(refactoringSupport.isSource(desc.getURI().fileExtension())){
				handlers.add(new LilyPondSourceFileRefactoring(desc, ref));
			}
		}
	}

	public void addFileToRefactor(IFile file, RefactoringArguments arguments) {
		ref.addFileToRefactor(file, arguments);
	}

	public void addContainerToRefactor(IContainer container, RefactoringArguments arguments) {
		ref.addContainerToRefactor(container, arguments);
	}

	public Change adaptIncludes(IProgressMonitor monitor){
		boolean adaptIncludes=refactoringSupport.getPreference(LilyPondRefactoringPreferencePage.REFACTORING_ADAPT_INCLUDES);
		if(preChangeAlreadyCreated || monitor.isCanceled() || !adaptIncludes){
			return null;
		}
		CompositeChange result = new CompositeChange("\\include statements");
		for (LilyPondSourceFileRefactoring handler : handlers) {
			if(!monitor.isCanceled()){
				handler.adaptIncludes(result);
			}
		}
		preChangeAlreadyCreated=true;
		if(result.getChildren().length==0){
			return null;
		}else{
			return result;
		}
	}

	public Change apply(IProgressMonitor monitor) throws CoreException{
		if(ref==null || changeAlreadyCreated || monitor.isCanceled()){
			return null;
		}else{
			changeAlreadyCreated=true;
			return ref.apply(monitor);
		}
	}

	private static class NullImpl extends LilyPondRefactoringDelegate{
		public NullImpl(Operation op, LilyPondRefactoringInjects refactorings) {
			super(op, refactorings);
		}
		@Override
		public void addContainerToRefactor(IContainer container, RefactoringArguments arguments) {}
		@Override
		public void addFileToRefactor(IFile file, RefactoringArguments arguments) {}
		@Override
		public Change adaptIncludes(IProgressMonitor monitor) {
			return null;
		}
		@Override
		public Change apply(IProgressMonitor monitor) throws CoreException {
			return null;
		}
		@Override
		public RefactoringStatus check(IProgressMonitor monitor) throws CoreException {
			return new RefactoringStatus();
		}
	}
}