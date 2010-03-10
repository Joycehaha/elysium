/*
* generated by Xtext
*/
grammar InternalLilyPond;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.lilypond.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.lilypond.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.lilypond.services.LilyPondGrammarAccess;

}

@parser::members {
 
 	private LilyPondGrammarAccess grammarAccess;
 	
    public InternalLilyPondParser(TokenStream input, IAstFactory factory, LilyPondGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/lilypond/parser/antlr/internal/InternalLilyPond.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "LilyPond";	
   	} 
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleLilyPond
entryRuleLilyPond returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getLilyPondRule(), currentNode); }
	 iv_ruleLilyPond=ruleLilyPond 
	 { $current=$iv_ruleLilyPond.current; } 
	 EOF 
;

// Rule LilyPond
ruleLilyPond returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    lv_expressions_0=	RULE_TOPLEVELEXPRESSION
	{
		createLeafNode(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionTerminalRuleCall_0(), "expressions"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLilyPondRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		add($current, "expressions", lv_expressions_0, "ToplevelExpression", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)*;







RULE_TOPLEVELEXPRESSION : ~(RULE_WS_CHAR)+;

RULE_WS_CHAR : (' '|'\t'|'\r'|'\n');

RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';


