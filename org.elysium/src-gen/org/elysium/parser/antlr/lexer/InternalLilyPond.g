
/*
* generated by Xtext
*/
lexer grammar InternalLilyPond;


@header {
package org.elysium.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




KEYWORD_86 : 'grobdescriptions';

KEYWORD_84 : 'sourcefileline';

KEYWORD_85 : 'sourcefilename';

KEYWORD_82 : 'defaultchild';

KEYWORD_83 : 'simultaneous';

KEYWORD_79 : 'alternative';

KEYWORD_80 : 'description';

KEYWORD_81 : 'markuplines';

KEYWORD_77 : 'figuremode';

KEYWORD_78 : 'sequential';

KEYWORD_72 : 'addlyrics';

KEYWORD_73 : 'chordmode';

KEYWORD_74 : 'lyricmode';

KEYWORD_75 : 'maininput';

KEYWORD_76 : 'transpose';

KEYWORD_64 : 'bookpart';

KEYWORD_65 : 'consists';

KEYWORD_66 : 'drummode';

KEYWORD_67 : 'lyricsto';

KEYWORD_68 : 'notemode';

KEYWORD_69 : 'objectid';

KEYWORD_70 : 'override';

KEYWORD_71 : 'relative';

KEYWORD_57 : 'accepts';

KEYWORD_58 : 'context';

KEYWORD_59 : 'default';

KEYWORD_60 : 'figures';

KEYWORD_61 : 'include';

KEYWORD_62 : 'partial';

KEYWORD_63 : 'version';

KEYWORD_46 : 'change';

KEYWORD_47 : 'chords';

KEYWORD_48 : 'denies';

KEYWORD_49 : 'header';

KEYWORD_50 : 'layout';

KEYWORD_51 : 'lyrics';

KEYWORD_52 : 'markup';

KEYWORD_53 : 'octave';

KEYWORD_54 : 'remove';

KEYWORD_55 : 'repeat';

KEYWORD_56 : 'revert';

KEYWORD_39 : 'alias';

KEYWORD_40 : 'drums';

KEYWORD_41 : 'paper';

KEYWORD_42 : 'score';

KEYWORD_43 : 'tempo';

KEYWORD_44 : 'times';

KEYWORD_45 : 'unset';

KEYWORD_29 : 'book';

KEYWORD_30 : 'mark';

KEYWORD_31 : 'midi';

KEYWORD_32 : 'name';

KEYWORD_33 : 'once';

KEYWORD_34 : 'rest';

KEYWORD_35 : 'skip';

KEYWORD_36 : 'time';

KEYWORD_37 : 'type';

KEYWORD_38 : 'with';

KEYWORD_26 : 'key';

KEYWORD_27 : 'new';

KEYWORD_28 : 'set';

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



