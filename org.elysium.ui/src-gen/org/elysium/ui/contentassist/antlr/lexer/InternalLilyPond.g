
/*
* generated by Xtext
*/
lexer grammar InternalLilyPond;


@header {
package org.elysium.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_29 : 'markuplines';

KEYWORD_27 : 'include';

KEYWORD_28 : 'version';

KEYWORD_26 : 'markup';

KEYWORD_19 : '#:';

KEYWORD_20 : '#\\';

KEYWORD_21 : '#{';

KEYWORD_22 : '#}';

KEYWORD_23 : '<<';

KEYWORD_24 : '>>';

KEYWORD_25 : '\\\\';

KEYWORD_1 : '!';

KEYWORD_2 : '#';

KEYWORD_3 : '$';

KEYWORD_4 : '\'';

KEYWORD_5 : '(';

KEYWORD_6 : ')';

KEYWORD_7 : '+';

KEYWORD_8 : ',';

KEYWORD_9 : '<';

KEYWORD_10 : '=';

KEYWORD_11 : '>';

KEYWORD_12 : '[';

KEYWORD_13 : '\\';

KEYWORD_14 : ']';

KEYWORD_15 : '`';

KEYWORD_16 : '{';

KEYWORD_17 : '}';

KEYWORD_18 : '~';



RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_INT : ('0'..'9')+;

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-')*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

RULE_SCHEME_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_SCHEME_ML_COMMENT : '#!' ( options {greedy=false;} : . )*'!#';

RULE_ANY_OTHER : .;



