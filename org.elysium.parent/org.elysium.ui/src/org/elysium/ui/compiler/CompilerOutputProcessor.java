package org.elysium.ui.compiler;

import javax.util.process.OutputProcessor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.console.IHyperlink;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.console.LilyPondConsole;
import org.elysium.ui.compiler.problems.ProblemHyperlinkAdder;
import org.elysium.ui.compiler.problems.ProblemParser;
import org.elysium.ui.markers.MarkerAttributes;
import org.elysium.ui.markers.MarkerTypes;

/**
 * Processes the output of the LilyPond compiler.
 */
public class CompilerOutputProcessor implements OutputProcessor {

	/**
	 * The problem parser for the file being compiled.
	 */
	private final ProblemParser problemParser;

	/**
	 * The console to which the compiler's output is written.
	 */
	private final LilyPondConsole console;

	public CompilerOutputProcessor(IFile file, LilyPondConsole console) {
		this.console = console;
		this.problemParser=new ProblemParser(file);
	}

	@Override
	public void processOutput(String line) {
		console.print(line);
		IMarker problemMarker = problemParser.parse(line);
		IHyperlink wsExternalIssue =problemParser.getWorkspaceExternalHyperlink();
		if (problemMarker != null) {
			// If file already contains problem, delete it
			try {
				IMarker[] existingProblemMarkers = problemMarker.getResource().findMarkers(MarkerTypes.LILYPOND_PROBLEM, false, IResource.DEPTH_ZERO);
				for (IMarker existingProblemMarker : existingProblemMarkers) {
					if (!existingProblemMarker.equals(problemMarker) && line.equals(existingProblemMarker.getAttribute(MarkerAttributes.COMPILER_OUTPUT.name()))) {
						problemMarker.delete();
						problemMarker = existingProblemMarker;
						break;
					}
				}
			} catch (CoreException e) {
				Activator.logError("Couldn't query existing problem markers, there may be duplicate problem markers", e);
			}
			// Add hyperlink in any case
			ProblemHyperlinkAdder.add(console, problemMarker, line);
		} else if(wsExternalIssue != null) {
			ProblemHyperlinkAdder.add(console, wsExternalIssue, line);
		}
	}
}