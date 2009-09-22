lexer grammar InternalLilyPond;
@header {
package org.lilypond.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

// $ANTLR src "../org.eclipse.lilypond.ui/src-gen/org/lilypond/contentassist/antlr/internal/InternalLilyPond.g" 105
RULE_DUMMY : (~('\n')* '\n')* ~('\n')*;


