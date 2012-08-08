package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.elysium.LilyPondConstants;

/**
 * Updates references to a LilyPond source file when it is moved.
 */
public class MoveLilyPondFileParticipant extends MoveParticipant {

	private IFile file;

	@Override
	protected boolean initialize(Object element) {
		file = (IFile)element;
		return LilyPondConstants.EXTENSIONS.contains(file.getFileExtension());
	}

	@Override
	public String getName() {
		return "Move LilyPond Source File";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		IContainer destination = (IContainer)getArguments().getDestination();
		return ReferenceUpdater.createChange(file, file.getName(), destination);
	}

}