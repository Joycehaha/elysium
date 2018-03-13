package org.elysium.ui.compiler;

import static org.elysium.ui.compiler.CompilerJob.removeOutdatedMarker;
import static org.elysium.ui.markers.MarkerTypes.UP_TO_DATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Performs automatic incremental build on LilyPond source files.
 */
public class LilyPondBuilder implements IXtextBuilderParticipant {

	private static final AtomicLong jobCount=new AtomicLong(0);
	@Inject
	private IPreferenceStore preferences;
	@Inject
	private ImportUriResolver importResolver;

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		Set<IFile> filesToCompile = new HashSet<IFile>();
		Set<IFile> filesMarkedAsOutdated = new HashSet<IFile>();
		for (Delta delta : context.getDeltas()) {
			URI uri = delta.getUri();
			boolean lilyPond = LilyPondConstants.EXTENSIONS.contains(uri.fileExtension());
			if (lilyPond) {
				IResource resource = ResourceUtils.findPlatformResource(uri);
				if ((resource != null) && (resource instanceof IFile)) {
					IFile file = (IFile)resource;
					boolean resourcesChangedOrCreated = delta.getNew() != null;
					boolean descriptionsChanged = delta.haveEObjectDescriptionsChanged();
					if (resourcesChangedOrCreated && descriptionsChanged) {
						filesToCompile.add(file);
					} else {
						filesMarkedAsOutdated.add(file);
					}
				}
			}
		}
		ResourceSet rs=new ResourceSetImpl();
		boolean doLilyPondCompile=preferences.getBoolean(CompilerPreferenceConstants.COMPILE_DURING_BUILD.name());
		boolean doDeleteMarkersIfCompilerIsInactive=preferences.getBoolean(CompilerPreferenceConstants.DELETE_ELYSIUM_MARKERS.name());
		compile(filesToCompile, rs, doLilyPondCompile, doLilyPondCompile || doDeleteMarkersIfCompilerIsInactive);
		removeOutdatedMarkers(filesMarkedAsOutdated, rs);
	}

	public void compile(Set<IFile> files) {
		compile(files, new ResourceSetImpl(), true, true);
	}

	private void compile(Set<IFile> files, ResourceSet resourceSetToUse, boolean executeLilyPondCompilation, boolean deleteMarkers) {
		int maxParallelCalls = Activator.getInstance().getPreferenceStore().getInt(CompilerPreferenceConstants.PARALLEL_COMPILES.name());
		addAllIncludingFiles(files,resourceSetToUse);
		List<IFile> sortedFiles=new ArrayList<IFile>(files);
		Collections.sort(sortedFiles, new Comparator<IFile>() {
			@Override
			public int compare(IFile o1, IFile o2) {
				return o1.getFileExtension().compareTo(o2.getFileExtension());
			}
		});
		for (IFile file : sortedFiles) {
			CompilerJob compilerJob = new CompilerJob(file, executeLilyPondCompilation, deleteMarkers);
			Job[] oldCompilerJobs = Job.getJobManager().find(compilerJob);
			for (Job oldCompilerJob : oldCompilerJobs) {
				oldCompilerJob.cancel();
			}
			long ruleIndex=jobCount.incrementAndGet()%maxParallelCalls;
			ISchedulingRule parallelExecutionRule=new NumberedQueueSchedulingRule(ruleIndex);
			compilerJob.setRule(parallelExecutionRule);
			compilerJob.schedule();
		}
	}

	private void removeOutdatedMarkers(final Set<IFile> files, ResourceSet resourceSetToUse) throws CoreException {
		addAllIncludingFiles(files, resourceSetToUse);
		for (IFile file : files) {
			removeOutdatedMarker(file);
			file.createMarker(UP_TO_DATE); // Prevent readding outdated marker
		}
	}

	/**
	 * Adds all files in the workspace to the given list of files which (even
	 * indirectly) include any file in the list.
	 */
	public void addAllIncludingFiles(Set<IFile> files) {
		addAllIncludingFiles(files, new ResourceSetImpl());
	}

	private void addAllIncludingFiles(Set<IFile> files, ResourceSet resourceSetToUse) {
		Set<IProject> projects = new HashSet<IProject>();
		for (IFile file : files) {
			projects.add(file.getProject());
		}
		//TODO the project reference is not sufficient,
		//it may not be set even if there is an include relation
		for (IProject project : projects) {
			projects.addAll(Arrays.asList(project.getReferencingProjects()));
		}
		Set<IFile> directIncludesAlreadyCalculated=new HashSet<IFile>();
		for (IProject project : projects) {
			for (IFile file : org.eclipse.util.ResourceUtils.getAllFiles(project)) {
				addIfNecessary(file, files, directIncludesAlreadyCalculated ,resourceSetToUse);
			}
		}
	}

	/**
	 * Adds the given file to the list of files to build if it (even indirectly)
	 * includes any of the files to build.
	 */
	private void addIfNecessary(IFile file, Set<IFile> filesToBuild, Set<IFile> directIncludesAlreadyCalculated, ResourceSet resourceSetToUse) {
		if (!filesToBuild.contains(file) && LilyPondConstants.EXTENSIONS.contains(file.getFileExtension())) {
			if(directIncludesAlreadyCalculated.contains(file)){
				return;
			}
			Set<IFile> includedFiles = getIncludedFiles(file, resourceSetToUse);
			directIncludesAlreadyCalculated.add(file);
			for (IFile includedFile : includedFiles) {
				if (!includedFile.equals(file)) {
					if (filesToBuild.contains(includedFile)) {
						filesToBuild.add(file);
					} else {
						addIfNecessary(includedFile, filesToBuild, directIncludesAlreadyCalculated, resourceSetToUse);
						if (filesToBuild.contains(includedFile)) {
							filesToBuild.add(file);
						}
					}
				}
			}
		}
	}

	/**
	 * Returns the files directly included in the given file.
	 */
	private Set<IFile> getIncludedFiles(IFile file, ResourceSet resourceSetToUse) {
		Set<IFile> result = new HashSet<IFile>();
		Resource eResource = resourceSetToUse.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		if (eResource != null) {
			for (EObject eObject : EcoreUtil2.eAllContentsAsList(eResource)) {
				if (eObject instanceof Include) {
					Include include = (Include)eObject;
					if(include.getImportURI() != null){
						String resolved = importResolver.resolve(include);
						URI uri = URI.createURI(resolved);
						if(uri.isFile()) {
							Path path = new Path(uri.toFileString());
							IFile inclFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
							if(inclFile!=null && inclFile.exists()) {
								result.add(inclFile);
							}
						}
					}
				}
			}
		}
		return result;
	}
}
