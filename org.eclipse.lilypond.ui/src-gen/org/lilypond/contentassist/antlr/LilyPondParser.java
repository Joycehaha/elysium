/*
* generated by Xtext
*/
package org.lilypond.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.lilypond.services.LilyPondGrammarAccess;

public class LilyPondParser extends AbstractContentAssistParser {
	
	@Inject
	private LilyPondGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.lilypond.contentassist.antlr.internal.InternalLilyPondLexer createLexer(CharStream stream) {
		return new org.lilypond.contentassist.antlr.internal.InternalLilyPondLexer(stream);
	}
	
	@Override
	protected org.lilypond.contentassist.antlr.internal.InternalLilyPondParser createParser() {
		org.lilypond.contentassist.antlr.internal.InternalLilyPondParser result = new org.lilypond.contentassist.antlr.internal.InternalLilyPondParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getLilyPondAccess().getContentAssignment(), "rule__LilyPond__ContentAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.lilypond.contentassist.antlr.internal.InternalLilyPondParser typedParser = (org.lilypond.contentassist.antlr.internal.InternalLilyPondParser) parser;
			typedParser.entryRuleLilyPond();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public LilyPondGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
