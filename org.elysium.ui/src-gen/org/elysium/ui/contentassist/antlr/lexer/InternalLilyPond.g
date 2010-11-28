
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




KEYWORD_89 : 'grobdescriptions';

KEYWORD_87 : 'sourcefileline';

KEYWORD_88 : 'sourcefilename';

KEYWORD_85 : 'defaultchild';

KEYWORD_86 : 'simultaneous';

KEYWORD_82 : 'alternative';

KEYWORD_83 : 'description';

KEYWORD_84 : 'markuplines';

KEYWORD_80 : 'figuremode';

KEYWORD_81 : 'sequential';

KEYWORD_75 : 'addlyrics';

KEYWORD_76 : 'chordmode';

KEYWORD_77 : 'lyricmode';

KEYWORD_78 : 'maininput';

KEYWORD_79 : 'transpose';

KEYWORD_67 : 'bookpart';

KEYWORD_68 : 'consists';

KEYWORD_69 : 'drummode';

KEYWORD_70 : 'lyricsto';

KEYWORD_71 : 'notemode';

KEYWORD_72 : 'objectid';

KEYWORD_73 : 'override';

KEYWORD_74 : 'relative';

KEYWORD_60 : 'accepts';

KEYWORD_61 : 'context';

KEYWORD_62 : 'default';

KEYWORD_63 : 'figures';

KEYWORD_64 : 'include';

KEYWORD_65 : 'partial';

KEYWORD_66 : 'version';

KEYWORD_49 : 'change';

KEYWORD_50 : 'chords';

KEYWORD_51 : 'denies';

KEYWORD_52 : 'header';

KEYWORD_53 : 'layout';

KEYWORD_54 : 'lyrics';

KEYWORD_55 : 'markup';

KEYWORD_56 : 'octave';

KEYWORD_57 : 'remove';

KEYWORD_58 : 'repeat';

KEYWORD_59 : 'revert';

KEYWORD_42 : 'alias';

KEYWORD_43 : 'drums';

KEYWORD_44 : 'paper';

KEYWORD_45 : 'score';

KEYWORD_46 : 'tempo';

KEYWORD_47 : 'times';

KEYWORD_48 : 'unset';

KEYWORD_32 : 'book';

KEYWORD_33 : 'mark';

KEYWORD_34 : 'midi';

KEYWORD_35 : 'name';

KEYWORD_36 : 'once';

KEYWORD_37 : 'rest';

KEYWORD_38 : 'skip';

KEYWORD_39 : 'time';

KEYWORD_40 : 'type';

KEYWORD_41 : 'with';

KEYWORD_29 : 'key';

KEYWORD_30 : 'new';

KEYWORD_31 : 'set';

KEYWORD_21 : '#:';

KEYWORD_22 : '#\\';

KEYWORD_23 : '#{';

KEYWORD_24 : '#}';

KEYWORD_25 : '::';

KEYWORD_26 : '<<';

KEYWORD_27 : '>>';

KEYWORD_28 : '\\\\';

KEYWORD_1 : '!';

KEYWORD_2 : '#';

KEYWORD_3 : '$';

KEYWORD_4 : '\'';

KEYWORD_5 : '(';

KEYWORD_6 : ')';

KEYWORD_7 : '+';

KEYWORD_8 : ',';

KEYWORD_9 : '-';

KEYWORD_10 : ':';

KEYWORD_11 : '<';

KEYWORD_12 : '=';

KEYWORD_13 : '>';

KEYWORD_14 : '[';

KEYWORD_15 : '\\';

KEYWORD_16 : ']';

KEYWORD_17 : '`';

KEYWORD_18 : '{';

KEYWORD_19 : '}';

KEYWORD_20 : '~';



RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_INT : ('0'..'9')+;

RULE_ID : ('a'..'z'|'A'..'Z')+;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_SL_COMMENT : '%' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'%}';

RULE_SCHEME_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_SCHEME_ML_COMMENT : '#!' ( options {greedy=false;} : . )*'!#';

RULE_ANY_OTHER : .;



