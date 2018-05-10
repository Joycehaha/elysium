package org.elysium.ui.refactoring;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.elysium.ui.refactoring.LilyPondRefactoringDelegate.Operation;

public class DeleteFileParticipant extends DeleteParticipant {

	@Inject
	LilyPondRefactoringInjects injects;
	LilyPondRefactoringDelegate delegate;

	private IFile sourceFile;

	@Override
	protected boolean initialize(Object element) {
		sourceFile = (IFile)element;
		return injects.isSource(sourceFile) && !injects.isLinked(sourceFile);
	}

	@Override
	public String getName() {
		return LilyPondRefactoringDelegate.NAME;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		delegate=LilyPondRefactoringDelegate.get(Operation.delete, context, injects);
		delegate.addFileToRefactor(sourceFile , getArguments());
		return new RefactoringStatus();
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return delegate.apply(pm);
	}
}