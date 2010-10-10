package org.elysium.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_ID=92;
    public static final int RULE_SCHEME_SL_COMMENT=96;
    public static final int RULE_ANY_OTHER=98;
    public static final int KEYWORD_56=44;
    public static final int KEYWORD_55=43;
    public static final int KEYWORD_54=42;
    public static final int KEYWORD_53=41;
    public static final int KEYWORD_52=40;
    public static final int KEYWORD_51=39;
    public static final int KEYWORD_50=38;
    public static final int EOF=-1;
    public static final int KEYWORD_59=29;
    public static final int KEYWORD_58=28;
    public static final int KEYWORD_57=27;
    public static final int KEYWORD_65=20;
    public static final int RULE_SCHEME_ML_COMMENT=97;
    public static final int KEYWORD_64=19;
    public static final int KEYWORD_67=22;
    public static final int KEYWORD_66=21;
    public static final int KEYWORD_61=31;
    public static final int KEYWORD_60=30;
    public static final int KEYWORD_63=33;
    public static final int KEYWORD_62=32;
    public static final int KEYWORD_69=24;
    public static final int KEYWORD_68=23;
    public static final int KEYWORD_30=53;
    public static final int KEYWORD_34=57;
    public static final int KEYWORD_33=56;
    public static final int KEYWORD_32=55;
    public static final int KEYWORD_31=54;
    public static final int KEYWORD_38=61;
    public static final int KEYWORD_37=60;
    public static final int KEYWORD_36=59;
    public static final int KEYWORD_35=58;
    public static final int RULE_ML_COMMENT=95;
    public static final int KEYWORD_39=45;
    public static final int RULE_STRING=90;
    public static final int KEYWORD_41=47;
    public static final int KEYWORD_40=46;
    public static final int KEYWORD_43=49;
    public static final int KEYWORD_42=48;
    public static final int KEYWORD_45=51;
    public static final int KEYWORD_44=50;
    public static final int KEYWORD_47=35;
    public static final int KEYWORD_46=34;
    public static final int KEYWORD_49=37;
    public static final int KEYWORD_48=36;
    public static final int KEYWORD_19=65;
    public static final int KEYWORD_17=88;
    public static final int KEYWORD_18=89;
    public static final int KEYWORD_15=86;
    public static final int KEYWORD_16=87;
    public static final int KEYWORD_13=84;
    public static final int KEYWORD_14=85;
    public static final int KEYWORD_11=82;
    public static final int KEYWORD_12=83;
    public static final int KEYWORD_10=81;
    public static final int KEYWORD_6=77;
    public static final int KEYWORD_7=78;
    public static final int KEYWORD_8=79;
    public static final int KEYWORD_9=80;
    public static final int KEYWORD_28=64;
    public static final int KEYWORD_29=52;
    public static final int RULE_INT=91;
    public static final int KEYWORD_24=70;
    public static final int KEYWORD_25=71;
    public static final int KEYWORD_26=62;
    public static final int KEYWORD_27=63;
    public static final int KEYWORD_20=66;
    public static final int KEYWORD_21=67;
    public static final int KEYWORD_22=68;
    public static final int KEYWORD_23=69;
    public static final int KEYWORD_79=9;
    public static final int KEYWORD_71=26;
    public static final int KEYWORD_72=14;
    public static final int KEYWORD_73=15;
    public static final int KEYWORD_74=16;
    public static final int KEYWORD_75=17;
    public static final int KEYWORD_76=18;
    public static final int KEYWORD_77=12;
    public static final int KEYWORD_78=13;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int KEYWORD_70=25;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int Tokens=99;
    public static final int RULE_SL_COMMENT=94;
    public static final int KEYWORD_84=5;
    public static final int KEYWORD_85=6;
    public static final int KEYWORD_82=7;
    public static final int KEYWORD_83=8;
    public static final int KEYWORD_86=4;
    public static final int KEYWORD_81=11;
    public static final int KEYWORD_80=10;
    public static final int RULE_WS=93;
    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g"; }

    // $ANTLR start KEYWORD_86
    public final void mKEYWORD_86() throws RecognitionException {
        try {
            int _type = KEYWORD_86;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:19:12: ( 'grobdescriptions' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:19:14: 'grobdescriptions'
            {
            match("grobdescriptions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_86

    // $ANTLR start KEYWORD_84
    public final void mKEYWORD_84() throws RecognitionException {
        try {
            int _type = KEYWORD_84;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:21:12: ( 'sourcefileline' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:21:14: 'sourcefileline'
            {
            match("sourcefileline"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_84

    // $ANTLR start KEYWORD_85
    public final void mKEYWORD_85() throws RecognitionException {
        try {
            int _type = KEYWORD_85;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:23:12: ( 'sourcefilename' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:23:14: 'sourcefilename'
            {
            match("sourcefilename"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_85

    // $ANTLR start KEYWORD_82
    public final void mKEYWORD_82() throws RecognitionException {
        try {
            int _type = KEYWORD_82;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:25:12: ( 'defaultchild' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:25:14: 'defaultchild'
            {
            match("defaultchild"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_82

    // $ANTLR start KEYWORD_83
    public final void mKEYWORD_83() throws RecognitionException {
        try {
            int _type = KEYWORD_83;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:27:12: ( 'simultaneous' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:27:14: 'simultaneous'
            {
            match("simultaneous"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_83

    // $ANTLR start KEYWORD_79
    public final void mKEYWORD_79() throws RecognitionException {
        try {
            int _type = KEYWORD_79;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:29:12: ( 'alternative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:29:14: 'alternative'
            {
            match("alternative"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_79

    // $ANTLR start KEYWORD_80
    public final void mKEYWORD_80() throws RecognitionException {
        try {
            int _type = KEYWORD_80;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:31:12: ( 'description' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:31:14: 'description'
            {
            match("description"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_80

    // $ANTLR start KEYWORD_81
    public final void mKEYWORD_81() throws RecognitionException {
        try {
            int _type = KEYWORD_81;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:33:12: ( 'markuplines' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:33:14: 'markuplines'
            {
            match("markuplines"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_81

    // $ANTLR start KEYWORD_77
    public final void mKEYWORD_77() throws RecognitionException {
        try {
            int _type = KEYWORD_77;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:35:12: ( 'figuremode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:35:14: 'figuremode'
            {
            match("figuremode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_77

    // $ANTLR start KEYWORD_78
    public final void mKEYWORD_78() throws RecognitionException {
        try {
            int _type = KEYWORD_78;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:37:12: ( 'sequential' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:37:14: 'sequential'
            {
            match("sequential"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_78

    // $ANTLR start KEYWORD_72
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:39:12: ( 'addlyrics' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:39:14: 'addlyrics'
            {
            match("addlyrics"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_72

    // $ANTLR start KEYWORD_73
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:41:12: ( 'chordmode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:41:14: 'chordmode'
            {
            match("chordmode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_73

    // $ANTLR start KEYWORD_74
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:43:12: ( 'lyricmode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:43:14: 'lyricmode'
            {
            match("lyricmode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_74

    // $ANTLR start KEYWORD_75
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:45:12: ( 'maininput' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:45:14: 'maininput'
            {
            match("maininput"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_75

    // $ANTLR start KEYWORD_76
    public final void mKEYWORD_76() throws RecognitionException {
        try {
            int _type = KEYWORD_76;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:47:12: ( 'transpose' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:47:14: 'transpose'
            {
            match("transpose"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_76

    // $ANTLR start KEYWORD_64
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:49:12: ( 'bookpart' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:49:14: 'bookpart'
            {
            match("bookpart"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_64

    // $ANTLR start KEYWORD_65
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:51:12: ( 'consists' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:51:14: 'consists'
            {
            match("consists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_65

    // $ANTLR start KEYWORD_66
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:53:12: ( 'drummode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:53:14: 'drummode'
            {
            match("drummode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_66

    // $ANTLR start KEYWORD_67
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:55:12: ( 'lyricsto' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:55:14: 'lyricsto'
            {
            match("lyricsto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_67

    // $ANTLR start KEYWORD_68
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:57:12: ( 'notemode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:57:14: 'notemode'
            {
            match("notemode"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_68

    // $ANTLR start KEYWORD_69
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:59:12: ( 'objectid' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:59:14: 'objectid'
            {
            match("objectid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_69

    // $ANTLR start KEYWORD_70
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:61:12: ( 'override' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:61:14: 'override'
            {
            match("override"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_70

    // $ANTLR start KEYWORD_71
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:63:12: ( 'relative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:63:14: 'relative'
            {
            match("relative"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_71

    // $ANTLR start KEYWORD_57
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:65:12: ( 'accepts' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:65:14: 'accepts'
            {
            match("accepts"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_57

    // $ANTLR start KEYWORD_58
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:67:12: ( 'context' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:67:14: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_58

    // $ANTLR start KEYWORD_59
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:69:12: ( 'default' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:69:14: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_59

    // $ANTLR start KEYWORD_60
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:71:12: ( 'figures' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:71:14: 'figures'
            {
            match("figures"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_60

    // $ANTLR start KEYWORD_61
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:73:12: ( 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:73:14: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_61

    // $ANTLR start KEYWORD_62
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:75:12: ( 'partial' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:75:14: 'partial'
            {
            match("partial"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_62

    // $ANTLR start KEYWORD_63
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:77:12: ( 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:77:14: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_63

    // $ANTLR start KEYWORD_46
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:12: ( 'change' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:79:14: 'change'
            {
            match("change"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_46

    // $ANTLR start KEYWORD_47
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:12: ( 'chords' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:81:14: 'chords'
            {
            match("chords"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_47

    // $ANTLR start KEYWORD_48
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:83:12: ( 'denies' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:83:14: 'denies'
            {
            match("denies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_48

    // $ANTLR start KEYWORD_49
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:85:12: ( 'header' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:85:14: 'header'
            {
            match("header"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_49

    // $ANTLR start KEYWORD_50
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:12: ( 'layout' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:87:14: 'layout'
            {
            match("layout"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_50

    // $ANTLR start KEYWORD_51
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:12: ( 'lyrics' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:89:14: 'lyrics'
            {
            match("lyrics"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_51

    // $ANTLR start KEYWORD_52
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:12: ( 'markup' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:91:14: 'markup'
            {
            match("markup"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_52

    // $ANTLR start KEYWORD_53
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:12: ( 'octave' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:93:14: 'octave'
            {
            match("octave"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_53

    // $ANTLR start KEYWORD_54
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:95:12: ( 'remove' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:95:14: 'remove'
            {
            match("remove"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_54

    // $ANTLR start KEYWORD_55
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:97:12: ( 'repeat' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:97:14: 'repeat'
            {
            match("repeat"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_55

    // $ANTLR start KEYWORD_56
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:99:12: ( 'revert' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:99:14: 'revert'
            {
            match("revert"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_56

    // $ANTLR start KEYWORD_39
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:101:12: ( 'alias' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:101:14: 'alias'
            {
            match("alias"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_39

    // $ANTLR start KEYWORD_40
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:103:12: ( 'drums' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:103:14: 'drums'
            {
            match("drums"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_40

    // $ANTLR start KEYWORD_41
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:105:12: ( 'paper' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:105:14: 'paper'
            {
            match("paper"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_41

    // $ANTLR start KEYWORD_42
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:107:12: ( 'score' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:107:14: 'score'
            {
            match("score"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_42

    // $ANTLR start KEYWORD_43
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:109:12: ( 'tempo' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:109:14: 'tempo'
            {
            match("tempo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_43

    // $ANTLR start KEYWORD_44
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:111:12: ( 'times' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:111:14: 'times'
            {
            match("times"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_44

    // $ANTLR start KEYWORD_45
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:113:12: ( 'unset' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:113:14: 'unset'
            {
            match("unset"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_45

    // $ANTLR start KEYWORD_29
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:115:12: ( 'book' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:115:14: 'book'
            {
            match("book"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_29

    // $ANTLR start KEYWORD_30
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:117:12: ( 'mark' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:117:14: 'mark'
            {
            match("mark"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_30

    // $ANTLR start KEYWORD_31
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:119:12: ( 'midi' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:119:14: 'midi'
            {
            match("midi"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_31

    // $ANTLR start KEYWORD_32
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:121:12: ( 'name' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:121:14: 'name'
            {
            match("name"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_32

    // $ANTLR start KEYWORD_33
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:123:12: ( 'once' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:123:14: 'once'
            {
            match("once"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_33

    // $ANTLR start KEYWORD_34
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:125:12: ( 'rest' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:125:14: 'rest'
            {
            match("rest"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_34

    // $ANTLR start KEYWORD_35
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:127:12: ( 'skip' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:127:14: 'skip'
            {
            match("skip"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_35

    // $ANTLR start KEYWORD_36
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:129:12: ( 'time' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:129:14: 'time'
            {
            match("time"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_36

    // $ANTLR start KEYWORD_37
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:131:12: ( 'type' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:131:14: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_37

    // $ANTLR start KEYWORD_38
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:133:12: ( 'with' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:133:14: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_38

    // $ANTLR start KEYWORD_26
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:135:12: ( 'key' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:135:14: 'key'
            {
            match("key"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_26

    // $ANTLR start KEYWORD_27
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:137:12: ( 'new' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:137:14: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_27

    // $ANTLR start KEYWORD_28
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:139:12: ( 'set' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:139:14: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_28

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:141:12: ( '#:' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:141:14: '#:'
            {
            match("#:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:143:12: ( '#\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:143:14: '#\\\\'
            {
            match("#\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_21
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:145:12: ( '#{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:145:14: '#{'
            {
            match("#{"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_21

    // $ANTLR start KEYWORD_22
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:147:12: ( '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:147:14: '#}'
            {
            match("#}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_22

    // $ANTLR start KEYWORD_23
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:149:12: ( '<<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:149:14: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_23

    // $ANTLR start KEYWORD_24
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:151:12: ( '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:151:14: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_24

    // $ANTLR start KEYWORD_25
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:153:12: ( '\\\\\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:153:14: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_25

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:155:11: ( '!' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:155:13: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:157:11: ( '#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:157:13: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:159:11: ( '$' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:159:13: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:161:11: ( '\\'' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:161:13: '\\''
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:163:11: ( '(' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:163:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:165:11: ( ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:165:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:167:11: ( '+' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:167:13: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:169:11: ( ',' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:169:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:171:11: ( '<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:171:13: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:173:12: ( '=' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:173:14: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:175:12: ( '>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:175:14: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:177:12: ( '[' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:177:14: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:179:12: ( '\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:179:14: '\\\\'
            {
            match('\\'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:181:12: ( ']' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:181:14: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:183:12: ( '`' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:183:14: '`'
            {
            match('`'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:185:12: ( '{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:185:14: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:187:12: ( '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:187:14: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:189:12: ( '~' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:189:14: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:193:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:193:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:193:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:193:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:193:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:195:10: ( ( '0' .. '9' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:195:12: ( '0' .. '9' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:195:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:195:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:197:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:197:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:197:31: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:199:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:199:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:199:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:40: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:201:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:203:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:203:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:203:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='%') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='}') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='|')||(LA8_1>='~' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='$')||(LA8_0>='&' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:203:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("%}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SCHEME_SL_COMMENT
    public final void mRULE_SCHEME_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SCHEME_SL_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:24: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:26: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:46: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:47: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:47: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:205:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCHEME_SL_COMMENT

    // $ANTLR start RULE_SCHEME_ML_COMMENT
    public final void mRULE_SCHEME_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SCHEME_ML_COMMENT;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:207:24: ( '#!' ( options {greedy=false; } : . )* '!#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:207:26: '#!' ( options {greedy=false; } : . )* '!#'
            {
            match("#!"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:207:31: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='!') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='#') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='\"')||(LA12_1>='$' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=' ')||(LA12_0>='\"' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:207:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("!#"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCHEME_ML_COMMENT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:209:16: ( . )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:209:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:8: ( KEYWORD_86 | KEYWORD_84 | KEYWORD_85 | KEYWORD_82 | KEYWORD_83 | KEYWORD_79 | KEYWORD_80 | KEYWORD_81 | KEYWORD_77 | KEYWORD_78 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_76 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_71 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_SL_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER )
        int alt13=95;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:10: KEYWORD_86
                {
                mKEYWORD_86(); 

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:21: KEYWORD_84
                {
                mKEYWORD_84(); 

                }
                break;
            case 3 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:32: KEYWORD_85
                {
                mKEYWORD_85(); 

                }
                break;
            case 4 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:43: KEYWORD_82
                {
                mKEYWORD_82(); 

                }
                break;
            case 5 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:54: KEYWORD_83
                {
                mKEYWORD_83(); 

                }
                break;
            case 6 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:65: KEYWORD_79
                {
                mKEYWORD_79(); 

                }
                break;
            case 7 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:76: KEYWORD_80
                {
                mKEYWORD_80(); 

                }
                break;
            case 8 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:87: KEYWORD_81
                {
                mKEYWORD_81(); 

                }
                break;
            case 9 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:98: KEYWORD_77
                {
                mKEYWORD_77(); 

                }
                break;
            case 10 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:109: KEYWORD_78
                {
                mKEYWORD_78(); 

                }
                break;
            case 11 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:120: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 12 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:131: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 13 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:142: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 14 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:153: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 15 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:164: KEYWORD_76
                {
                mKEYWORD_76(); 

                }
                break;
            case 16 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:175: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 17 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:186: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 18 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:197: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 19 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:208: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 20 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:219: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 21 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:230: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 22 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:241: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 23 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:252: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 24 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:263: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 25 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:274: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 26 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:285: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 27 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:296: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 28 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:307: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 29 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:318: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 30 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:329: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 31 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:340: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 32 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:351: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 33 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:362: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 34 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:373: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 35 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:384: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 36 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:395: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 37 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:406: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 38 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:417: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 39 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:428: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 40 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:439: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 41 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:450: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 42 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:461: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 43 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:472: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 44 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:483: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 45 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:494: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 46 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:505: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 47 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:516: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 48 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:527: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 49 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:538: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 50 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:549: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 51 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:560: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 52 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:571: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 53 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:582: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 54 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:593: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 55 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:604: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 56 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:615: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 57 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:626: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 58 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:637: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 59 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:648: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 60 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:659: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 61 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:670: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 62 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:681: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 63 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:692: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 64 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:703: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 65 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:714: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 66 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:725: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 67 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:736: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 68 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:747: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 69 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:758: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 70 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:768: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 71 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:778: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 72 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:788: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 73 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:798: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 74 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:808: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 75 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:818: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 76 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:828: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 77 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:838: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 78 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:848: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 79 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:859: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 80 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:870: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 81 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:881: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 82 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:892: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 83 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:903: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 84 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:914: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 85 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:925: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 86 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:936: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 87 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:947: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:959: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 89 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:968: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 90 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:976: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:984: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:1000: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:1016: RULE_SCHEME_SL_COMMENT
                {
                mRULE_SCHEME_SL_COMMENT(); 

                }
                break;
            case 94 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:1039: RULE_SCHEME_ML_COMMENT
                {
                mRULE_SCHEME_ML_COMMENT(); 

                }
                break;
            case 95 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/lexer/InternalLilyPond.g:1:1062: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\24\57\1\132\1\134\1\136\1\140\16\uffff\1\55\3\uffff\1\163"+
        "\2\uffff\1\57\1\uffff\45\57\35\uffff\1\163\2\uffff\5\57\1\u00af"+
        "\30\57\1\u00c9\21\57\1\u00db\1\uffff\3\163\5\57\1\uffff\1\u00e3"+
        "\10\57\1\u00ee\1\57\1\u00f0\7\57\1\u00f9\2\57\1\u00fc\1\u00fe\1"+
        "\u00ff\1\uffff\2\57\1\u0102\5\57\1\u0108\7\57\1\u0110\2\uffff\1"+
        "\163\2\57\1\u0113\2\57\1\uffff\4\57\1\u011a\1\57\1\u011c\3\57\1"+
        "\uffff\1\57\1\uffff\7\57\1\u012a\1\uffff\1\u012b\1\57\1\uffff\1"+
        "\57\2\uffff\2\57\1\uffff\5\57\1\uffff\3\57\1\u0138\2\57\1\u013b"+
        "\1\uffff\2\57\1\uffff\4\57\1\u0142\1\57\1\uffff\1\57\1\uffff\2\57"+
        "\1\u0148\3\57\1\u014d\1\u014e\2\57\1\u0151\1\57\1\u0154\2\uffff"+
        "\3\57\1\u0158\2\57\1\u015b\1\57\1\u015d\1\u015e\2\57\1\uffff\1\57"+
        "\1\u0162\1\uffff\4\57\1\u0168\1\57\1\uffff\3\57\1\u016d\1\57\1\uffff"+
        "\1\57\1\u0170\2\57\2\uffff\1\u0173\1\57\1\uffff\2\57\1\uffff\3\57"+
        "\1\uffff\2\57\1\uffff\1\57\2\uffff\1\u017d\1\u017e\1\u017f\1\uffff"+
        "\5\57\1\uffff\1\57\1\u0186\2\57\1\uffff\2\57\1\uffff\2\57\1\uffff"+
        "\1\u018d\1\57\1\u018f\1\57\1\u0191\1\u0192\1\u0193\1\u0194\1\u0195"+
        "\3\uffff\6\57\1\uffff\1\57\1\u019d\1\57\1\u019f\1\57\1\u01a1\1\uffff"+
        "\1\u01a2\1\uffff\1\u01a3\5\uffff\3\57\1\u01a8\3\57\1\uffff\1\57"+
        "\1\uffff\1\u01ad\3\uffff\4\57\1\uffff\1\57\1\u01b3\1\u01b4\1\u01b5"+
        "\1\uffff\3\57\1\u01b9\1\u01ba\3\uffff\3\57\2\uffff\1\57\1\u01bf"+
        "\1\u01c0\1\57\2\uffff\1\u01c2\1\uffff";
    static final String DFA13_eofS =
        "\u01c3\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\143\1\145\1\143\1\141\1\151\1\150\1\141\1\145\1\157"+
        "\1\141\1\142\1\145\1\156\1\141\2\145\1\156\1\151\1\145\1\41\1\74"+
        "\1\76\1\134\16\uffff\1\0\3\uffff\1\173\2\uffff\1\157\1\uffff\1\165"+
        "\1\157\1\155\1\161\1\151\1\146\1\165\1\151\1\144\1\143\1\151\1\144"+
        "\1\147\1\141\1\156\1\171\1\162\2\155\1\141\1\160\1\157\1\155\1\167"+
        "\2\164\1\143\1\152\1\145\1\154\1\143\1\160\1\162\1\141\1\163\1\164"+
        "\1\171\35\uffff\1\0\2\uffff\1\142\2\162\2\165\1\55\1\160\1\141\1"+
        "\143\1\151\1\155\1\145\1\141\1\154\1\145\1\153\1\156\1\151\1\165"+
        "\1\162\1\156\1\163\1\157\1\151\1\145\1\160\1\156\1\145\1\153\1\145"+
        "\1\55\1\145\1\141\2\145\1\162\1\145\1\141\1\145\1\164\1\157\1\154"+
        "\1\164\1\145\1\163\1\144\1\145\1\150\1\55\4\0\1\144\1\143\1\145"+
        "\1\154\1\145\1\uffff\1\55\1\165\1\162\1\145\1\155\1\162\1\163\1"+
        "\171\1\160\1\55\1\151\1\55\1\162\1\144\1\147\1\145\1\151\1\165\1"+
        "\143\1\55\1\157\1\163\3\55\1\uffff\1\155\1\166\1\55\1\143\1\162"+
        "\1\141\1\164\1\162\1\55\1\166\1\165\1\151\1\162\1\151\1\145\1\164"+
        "\1\55\2\uffff\1\0\2\145\1\55\1\164\1\156\1\uffff\1\154\1\151\1\163"+
        "\1\157\1\55\1\156\1\55\1\162\1\164\1\160\1\uffff\1\156\1\uffff\1"+
        "\145\1\155\1\145\1\170\1\163\1\164\1\155\1\55\1\uffff\1\55\1\160"+
        "\1\uffff\1\141\2\uffff\1\157\1\145\1\uffff\1\164\1\151\1\164\1\151"+
        "\1\164\1\uffff\1\145\1\144\1\141\1\55\1\157\1\162\1\55\1\uffff\1"+
        "\163\1\146\1\uffff\1\141\2\164\1\160\1\55\1\144\1\uffff\1\141\1"+
        "\uffff\1\151\1\163\1\55\1\160\1\155\1\157\2\55\2\164\1\55\1\157"+
        "\1\55\2\uffff\1\157\1\162\1\144\1\55\1\151\1\144\1\55\1\166\2\55"+
        "\1\145\1\154\1\uffff\1\156\1\55\1\uffff\1\143\1\151\1\156\1\151"+
        "\1\55\1\164\1\uffff\1\145\1\164\1\143\1\55\1\151\1\uffff\1\165\1"+
        "\55\1\157\1\144\2\uffff\1\55\1\163\1\uffff\1\144\1\157\1\uffff\1"+
        "\163\1\164\1\145\1\uffff\1\144\1\145\1\uffff\1\145\2\uffff\3\55"+
        "\1\uffff\1\162\1\154\1\145\1\141\1\150\1\uffff\1\151\1\55\1\151"+
        "\1\163\1\uffff\1\156\1\164\1\uffff\1\144\1\145\1\uffff\1\55\1\145"+
        "\1\55\1\145\5\55\3\uffff\1\151\1\145\1\157\1\154\1\151\1\157\1\uffff"+
        "\1\166\1\55\1\145\1\55\1\145\1\55\1\uffff\1\55\1\uffff\1\55\5\uffff"+
        "\1\160\1\154\1\165\1\55\1\154\1\156\1\145\1\uffff\1\163\1\uffff"+
        "\1\55\3\uffff\1\164\1\141\1\151\1\163\1\uffff\1\144\3\55\1\uffff"+
        "\1\151\1\155\1\156\2\55\3\uffff\1\157\2\145\2\uffff\1\156\2\55\1"+
        "\163\2\uffff\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\162\1\157\1\162\1\154\2\151\1\157\2\171\2\157\1\166\1"+
        "\145\1\156\1\141\2\145\1\156\1\151\1\145\1\175\1\74\1\76\1\134\16"+
        "\uffff\1\ufffe\3\uffff\1\173\2\uffff\1\157\1\uffff\1\165\1\157\1"+
        "\155\1\164\1\151\1\163\1\165\1\164\1\144\1\143\1\162\1\144\1\147"+
        "\1\157\1\156\1\171\1\162\2\155\1\141\1\160\1\157\1\155\1\167\2\164"+
        "\1\143\1\152\1\145\1\166\1\143\2\162\1\141\1\163\1\164\1\171\35"+
        "\uffff\1\ufffe\2\uffff\1\142\2\162\2\165\1\172\1\160\1\141\1\143"+
        "\1\151\1\155\1\145\1\141\1\154\1\145\1\153\1\156\1\151\1\165\1\162"+
        "\1\156\1\164\1\157\1\151\1\145\1\160\1\156\1\145\1\153\1\145\1\172"+
        "\1\145\1\141\2\145\1\162\1\145\1\141\1\145\1\164\1\157\1\154\1\164"+
        "\1\145\1\163\1\144\1\145\1\150\1\172\4\ufffe\1\144\1\143\1\145\1"+
        "\154\1\145\1\uffff\1\172\1\165\1\162\1\145\1\163\1\162\1\163\1\171"+
        "\1\160\1\172\1\151\1\172\1\162\1\144\1\147\1\145\1\151\1\165\1\143"+
        "\1\172\1\157\1\163\3\172\1\uffff\1\155\1\166\1\172\1\143\1\162\1"+
        "\141\1\164\1\162\1\172\1\166\1\165\1\151\1\162\1\151\1\145\1\164"+
        "\1\172\2\uffff\1\ufffe\2\145\1\172\1\164\1\156\1\uffff\1\154\1\151"+
        "\1\163\1\157\1\172\1\156\1\172\1\162\1\164\1\160\1\uffff\1\156\1"+
        "\uffff\1\145\1\163\1\145\1\170\1\163\1\164\1\163\1\172\1\uffff\1"+
        "\172\1\160\1\uffff\1\141\2\uffff\1\157\1\145\1\uffff\1\164\1\151"+
        "\1\164\1\151\1\164\1\uffff\1\145\1\144\1\141\1\172\1\157\1\162\1"+
        "\172\1\uffff\1\163\1\146\1\uffff\1\141\2\164\1\160\1\172\1\144\1"+
        "\uffff\1\141\1\uffff\1\151\1\163\1\172\1\160\1\163\1\157\2\172\2"+
        "\164\1\172\1\157\1\172\2\uffff\1\157\1\162\1\144\1\172\1\151\1\144"+
        "\1\172\1\166\2\172\1\145\1\154\1\uffff\1\156\1\172\1\uffff\1\143"+
        "\1\151\1\156\1\151\1\172\1\164\1\uffff\1\145\1\164\1\143\1\172\1"+
        "\151\1\uffff\1\165\1\172\1\157\1\144\2\uffff\1\172\1\163\1\uffff"+
        "\1\144\1\157\1\uffff\1\163\1\164\1\145\1\uffff\1\144\1\145\1\uffff"+
        "\1\145\2\uffff\3\172\1\uffff\1\162\1\154\1\145\1\141\1\150\1\uffff"+
        "\1\151\1\172\1\151\1\163\1\uffff\1\156\1\164\1\uffff\1\144\1\145"+
        "\1\uffff\1\172\1\145\1\172\1\145\5\172\3\uffff\1\151\1\145\1\157"+
        "\1\154\1\151\1\157\1\uffff\1\166\1\172\1\145\1\172\1\145\1\172\1"+
        "\uffff\1\172\1\uffff\1\172\5\uffff\1\160\1\156\1\165\1\172\1\154"+
        "\1\156\1\145\1\uffff\1\163\1\uffff\1\172\3\uffff\1\164\1\141\1\151"+
        "\1\163\1\uffff\1\144\3\172\1\uffff\1\151\1\155\1\156\2\172\3\uffff"+
        "\1\157\2\145\2\uffff\1\156\2\172\1\163\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\31\uffff\1\105\1\107\1\110\1\111\1\112\1\113\1\114\1\116\1\120"+
        "\1\122\1\123\1\124\1\125\1\126\1\uffff\1\130\1\131\1\132\1\uffff"+
        "\1\135\1\137\1\uffff\1\131\45\uffff\1\136\1\101\1\100\1\77\1\76"+
        "\1\106\1\102\1\115\1\103\1\117\1\104\1\121\1\105\1\107\1\110\1\111"+
        "\1\112\1\113\1\114\1\116\1\120\1\122\1\123\1\124\1\125\1\126\1\127"+
        "\1\130\1\132\1\uffff\1\133\1\135\72\uffff\1\75\31\uffff\1\74\21"+
        "\uffff\1\73\1\134\6\uffff\1\67\12\uffff\1\62\1\uffff\1\63\10\uffff"+
        "\1\70\2\uffff\1\71\1\uffff\1\61\1\64\2\uffff\1\65\5\uffff\1\66\7"+
        "\uffff\1\72\2\uffff\1\55\6\uffff\1\53\1\uffff\1\52\15\uffff\1\57"+
        "\1\56\14\uffff\1\54\2\uffff\1\60\6\uffff\1\41\5\uffff\1\45\4\uffff"+
        "\1\40\1\37\2\uffff\1\43\2\uffff\1\44\3\uffff\1\46\2\uffff\1\50\1"+
        "\uffff\1\51\1\47\3\uffff\1\42\5\uffff\1\32\4\uffff\1\30\2\uffff"+
        "\1\33\2\uffff\1\31\11\uffff\1\34\1\35\1\36\6\uffff\1\22\6\uffff"+
        "\1\21\1\uffff\1\23\1\uffff\1\20\1\24\1\25\1\26\1\27\7\uffff\1\13"+
        "\1\uffff\1\16\1\uffff\1\14\1\15\1\17\4\uffff\1\12\4\uffff\1\11\5"+
        "\uffff\1\7\1\6\1\10\3\uffff\1\5\1\4\4\uffff\1\3\1\2\1\uffff\1\1";
    static final String DFA13_specialS =
        "\u01c3\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\55\2\52\2\55\1\52\22\55\1\52\1\31\1\47\1\25\1\32\1\53\1"+
            "\55\1\33\1\34\1\35\1\55\1\36\1\37\3\55\12\50\1\55\1\54\1\26"+
            "\1\40\1\27\2\55\32\51\1\41\1\30\1\42\2\55\1\43\1\4\1\12\1\7"+
            "\1\3\1\51\1\6\1\1\1\21\1\16\1\51\1\24\1\10\1\5\1\13\1\14\1\17"+
            "\1\51\1\15\1\2\1\11\1\22\1\20\1\23\3\51\1\44\1\55\1\45\1\46"+
            "\uff80\55",
            "\1\56",
            "\1\61\1\uffff\1\63\3\uffff\1\62\1\uffff\1\64\3\uffff\1\60",
            "\1\65\14\uffff\1\66",
            "\1\71\1\70\7\uffff\1\67",
            "\1\72\7\uffff\1\73",
            "\1\74",
            "\1\75\6\uffff\1\76",
            "\1\77\27\uffff\1\100",
            "\1\102\3\uffff\1\101\10\uffff\1\103\6\uffff\1\104",
            "\1\105",
            "\1\106\3\uffff\1\107\11\uffff\1\110",
            "\1\113\1\111\12\uffff\1\112\7\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\30\uffff\1\131\41\uffff\1\130\36\uffff\1\127\1\uffff"+
            "\1\126",
            "\1\133",
            "\1\135",
            "\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\uffff\157",
            "",
            "",
            "",
            "\1\162",
            "",
            "",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\2\uffff\1\172",
            "\1\173",
            "\1\174\7\uffff\1\176\4\uffff\1\175",
            "\1\177",
            "\1\u0081\12\uffff\1\u0080",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\10\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\15\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u009a\1\u009d\2\uffff\1\u0099\2\uffff\1\u009c\2\uffff\1\u009b",
            "\1\u009e",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a9\1\u00a7\2\u00a9\1\u00a6\27\u00a9\1\u00a8\uffd9\u00a9",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00c0\1\u00bf",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\12\u00dc\1\u00a7\ufff4\u00dc",
            "\uffff\u00dc",
            "\12\u00a9\1\u00a7\2\u00a9\1\u00a6\27\u00a9\1\u00a8\127\u00a9"+
            "\1\u00dd\uff81\u00a9",
            "\12\u00a9\1\u00a7\2\u00a9\1\u00a6\27\u00a9\1\u00a8\uffd9\u00a9",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7\5\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\57\23\uffff\32\57\6\uffff\24\57\1\u00ed\5\57",
            "\1\u00ef",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\57\23\uffff\32\57\6\uffff\22\57\1\u00f8\7\57",
            "\1\u00fa",
            "\1\u00fb",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\17\57\1\u00fd\12\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "",
            "\12\u00a9\1\u00a7\2\u00a9\1\u00a6\27\u00a9\1\u00a8\uffd9\u00a9",
            "\1\u0111",
            "\1\u0112",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u011b",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122\5\uffff\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128\5\uffff\1\u0129",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0139",
            "\1\u013a",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0143",
            "",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\57\23\uffff\32\57\6\uffff\13\57\1\u0147\16\57",
            "\1\u0149",
            "\1\u014b\5\uffff\1\u014a",
            "\1\u014c",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u014f",
            "\1\u0150",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0152",
            "\1\57\23\uffff\32\57\6\uffff\23\57\1\u0153\6\57",
            "",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0159",
            "\1\u015a",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u015c",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\57\23\uffff\32\57\6\uffff\2\57\1\u0167\27\57",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u018e",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u0190",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "",
            "",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u019e",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u01a0",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a4",
            "\1\u01a6\1\uffff\1\u01a5",
            "\1\u01a7",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "",
            "",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "",
            "\1\u01be",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            "\1\u01c1",
            "",
            "",
            "\1\57\23\uffff\32\57\6\uffff\32\57",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_86 | KEYWORD_84 | KEYWORD_85 | KEYWORD_82 | KEYWORD_83 | KEYWORD_79 | KEYWORD_80 | KEYWORD_81 | KEYWORD_77 | KEYWORD_78 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_76 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_71 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_SL_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER );";
        }
    }
 

}