package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServerGeneratorLanguageLexer extends Lexer {
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_ID=4;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int RULE_STRING=9;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__14=14;
    public static final int T__22=22;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int RULE_CONFIGID=5;
    public static final int RULE_WS=12;
    public static final int T__17=17;
    public static final int T__31=31;
    public static final int RULE_INT=8;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__24=24;
    public static final int T__26=26;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__25=25;
    public static final int RULE_IP=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_MYINT=7;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators

    public InternalServerGeneratorLanguageLexer() {;} 
    public InternalServerGeneratorLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalServerGeneratorLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:11:7: ( 'SERVER' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:11:9: 'SERVER'
            {
            match("SERVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:12:7: ( '{' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:13:7: ( 'CONFIG' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:13:9: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:14:7: ( '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:15:7: ( 'ROOTDIR' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:15:9: 'ROOTDIR'
            {
            match("ROOTDIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:16:7: ( '=' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:17:7: ( 'HOSTNAME' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:17:9: 'HOSTNAME'
            {
            match("HOSTNAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:18:7: ( 'PORT' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:18:9: 'PORT'
            {
            match("PORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:19:7: ( 'LOG' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:19:9: 'LOG'
            {
            match("LOG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:20:7: ( 'SQLDB' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:20:9: 'SQLDB'
            {
            match("SQLDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:21:7: ( 'RESOURCE' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:21:9: 'RESOURCE'
            {
            match("RESOURCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:22:7: ( 'DOMAINMODEL' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:22:9: 'DOMAINMODEL'
            {
            match("DOMAINMODEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:23:7: ( 'ENTITYS' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:23:9: 'ENTITYS'
            {
            match("ENTITYS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:24:7: ( 'ENTITY_RELATIONSHIP' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:24:9: 'ENTITY_RELATIONSHIP'
            {
            match("ENTITY_RELATIONSHIP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:25:7: ( 'STRING' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:25:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:26:7: ( 'NUMBER' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:26:9: 'NUMBER'
            {
            match("NUMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:27:7: ( 'IMAGE' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:27:9: 'IMAGE'
            {
            match("IMAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:28:7: ( '.' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:29:7: ( '->' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:29:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_MYINT"
    public final void mRULE_MYINT() throws RecognitionException {
        try {
            int _type = RULE_MYINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1039:12: ( '\"' RULE_INT '\"' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1039:14: '\"' RULE_INT '\"'
            {
            match('\"'); 
            mRULE_INT(); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MYINT"

    // $ANTLR start "RULE_IP"
    public final void mRULE_IP() throws RecognitionException {
        try {
            int _type = RULE_IP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1041:9: ( '\"' RULE_INT '.' RULE_INT '.' RULE_INT '.' RULE_INT '\"' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1041:11: '\"' RULE_INT '.' RULE_INT '.' RULE_INT '.' RULE_INT '\"'
            {
            match('\"'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IP"

    // $ANTLR start "RULE_CONFIGID"
    public final void mRULE_CONFIGID() throws RecognitionException {
        try {
            int _type = RULE_CONFIGID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1043:15: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '/' | '.' | ':' | '-' )* '\"' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1043:17: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '/' | '.' | ':' | '-' )* '\"'
            {
            match('\"'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1043:45: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '/' | '.' | ':' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<=':')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONFIGID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1045:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1045:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1045:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1045:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1045:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1047:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1047:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1047:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1047:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1049:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1051:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1051:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1051:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1051:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1053:41: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1055:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1057:16: ( . )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1057:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_MYINT | RULE_IP | RULE_CONFIGID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=29;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:124: RULE_MYINT
                {
                mRULE_MYINT(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:135: RULE_IP
                {
                mRULE_IP(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:143: RULE_CONFIGID
                {
                mRULE_CONFIGID(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:157: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:165: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:174: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:186: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:202: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:218: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1:226: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\7\33\1\uffff\3"+
        "\27\2\uffff\2\27\2\uffff\3\33\2\uffff\1\33\1\uffff\2\33\1\uffff"+
        "\7\33\11\uffff\10\33\1\113\4\33\4\uffff\7\33\1\132\1\uffff\4\33"+
        "\3\uffff\1\33\1\141\5\33\1\uffff\3\33\1\152\1\uffff\1\154\1\uffff"+
        "\1\155\1\156\5\33\1\165\5\uffff\1\167\3\33\1\173\1\33\3\uffff\1"+
        "\176\1\177\1\33\1\uffff\1\33\3\uffff\2\33\1\uffff\2\33\1\uffff\1"+
        "\u0088\1\33\1\uffff\7\33\1\u0091\1\uffff";
    static final String DFA13_eofS =
        "\u0092\uffff";
    static final String DFA13_minS =
        "\1\0\1\105\1\uffff\1\117\1\uffff\1\105\1\uffff\4\117\1\116\1\125"+
        "\1\115\1\uffff\1\76\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\122\1\114"+
        "\1\122\2\uffff\1\116\1\uffff\1\117\1\123\1\uffff\1\123\1\122\1\107"+
        "\1\115\1\124\1\115\1\101\2\uffff\2\0\5\uffff\1\126\1\104\1\111\1"+
        "\106\1\124\1\117\2\124\1\60\1\101\1\111\1\102\1\107\1\0\2\uffff"+
        "\1\0\1\105\1\102\1\116\1\111\1\104\1\125\1\116\1\60\1\uffff\1\111"+
        "\1\124\2\105\2\uffff\1\0\1\122\1\60\2\107\1\111\1\122\1\101\1\uffff"+
        "\1\116\1\131\1\122\1\60\1\0\1\60\1\uffff\2\60\1\122\1\103\2\115"+
        "\1\123\1\60\1\uffff\1\0\3\uffff\1\60\2\105\1\117\1\60\1\122\1\uffff"+
        "\1\0\1\uffff\2\60\1\104\1\uffff\1\105\1\0\2\uffff\1\105\1\114\1"+
        "\uffff\1\114\1\101\1\uffff\1\60\1\124\1\uffff\1\111\1\117\1\116"+
        "\1\123\1\110\1\111\1\120\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\124\1\uffff\1\117\1\uffff\1\117\1\uffff\4\117\1\116"+
        "\1\125\1\115\1\uffff\1\76\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff"+
        "\1\122\1\114\1\122\2\uffff\1\116\1\uffff\1\117\1\123\1\uffff\1\123"+
        "\1\122\1\107\1\115\1\124\1\115\1\101\2\uffff\2\uffff\5\uffff\1\126"+
        "\1\104\1\111\1\106\1\124\1\117\2\124\1\172\1\101\1\111\1\102\1\107"+
        "\1\uffff\2\uffff\1\uffff\1\105\1\102\1\116\1\111\1\104\1\125\1\116"+
        "\1\172\1\uffff\1\111\1\124\2\105\2\uffff\1\uffff\1\122\1\172\2\107"+
        "\1\111\1\122\1\101\1\uffff\1\116\1\131\1\122\1\172\1\uffff\1\172"+
        "\1\uffff\2\172\1\122\1\103\2\115\1\137\1\172\1\uffff\1\uffff\3\uffff"+
        "\1\172\2\105\1\117\1\172\1\122\1\uffff\1\uffff\1\uffff\2\172\1\104"+
        "\1\uffff\1\105\1\uffff\2\uffff\1\105\1\114\1\uffff\1\114\1\101\1"+
        "\uffff\1\172\1\124\1\uffff\1\111\1\117\1\116\1\123\1\110\1\111\1"+
        "\120\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\6\7\uffff\1\22\3\uffff\1\27"+
        "\1\30\2\uffff\1\34\1\35\3\uffff\1\27\1\2\1\uffff\1\4\2\uffff\1\6"+
        "\7\uffff\1\22\1\23\2\uffff\1\31\1\30\1\32\1\33\1\34\16\uffff\1\26"+
        "\1\24\11\uffff\1\11\4\uffff\1\26\1\24\10\uffff\1\10\6\uffff\1\12"+
        "\10\uffff\1\21\1\uffff\1\1\1\17\1\3\6\uffff\1\20\1\uffff\1\5\3\uffff"+
        "\1\15\2\uffff\1\13\1\7\2\uffff\1\25\2\uffff\1\25\2\uffff\1\14\10"+
        "\uffff\1\16";
    static final String DFA13_specialS =
        "\1\3\17\uffff\1\11\3\uffff\1\0\26\uffff\1\12\1\13\22\uffff\1\10"+
        "\2\uffff\1\6\17\uffff\1\7\14\uffff\1\5\13\uffff\1\4\12\uffff\1\2"+
        "\6\uffff\1\1\24\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\20\4\27\1\24\5\27\1"+
            "\17\1\16\1\25\12\23\3\27\1\6\3\27\2\22\1\3\1\12\1\13\2\22\1"+
            "\7\1\15\2\22\1\11\1\22\1\14\1\22\1\10\1\22\1\5\1\1\7\22\3\27"+
            "\1\21\1\22\1\27\32\22\1\2\1\27\1\4\uff82\27",
            "\1\30\13\uffff\1\31\2\uffff\1\32",
            "",
            "\1\35",
            "",
            "\1\40\11\uffff\1\37",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\52",
            "\60\55\12\54\7\55\32\53\4\55\1\53\1\55\32\53\uff85\55",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\55",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "\42\55\1\100\12\55\16\77\6\55\32\77\4\55\1\77\1\55\32\77\uff85"+
            "\55",
            "\42\55\1\101\13\55\1\102\1\55\12\54\uffc6\55",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\42\55\1\100\12\55\16\77\6\55\32\77\4\55\1\77\1\55\32\77\uff85"+
            "\55",
            "",
            "",
            "\60\55\12\122\uffc6\55",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\56\55\1\137\1\55\12\122\uffc6\55",
            "\1\140",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\60\55\12\153\uffc6\55",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163\13\uffff\1\164",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\56\55\1\166\1\55\12\153\uffc6\55",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\174",
            "",
            "\60\55\12\175\uffc6\55",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0080",
            "",
            "\1\u0081",
            "\42\55\1\u0082\15\55\12\175\uffc6\55",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_MYINT | RULE_IP | RULE_CONFIGID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_125 = input.LA(1);

                        s = -1;
                        if ( (LA13_125=='\"') ) {s = 130;}

                        else if ( ((LA13_125>='0' && LA13_125<='9')) ) {s = 125;}

                        else if ( ((LA13_125>='\u0000' && LA13_125<='!')||(LA13_125>='#' && LA13_125<='/')||(LA13_125>=':' && LA13_125<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_118 = input.LA(1);

                        s = -1;
                        if ( ((LA13_118>='0' && LA13_118<='9')) ) {s = 125;}

                        else if ( ((LA13_118>='\u0000' && LA13_118<='/')||(LA13_118>=':' && LA13_118<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='S') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='C') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='R') ) {s = 5;}

                        else if ( (LA13_0=='=') ) {s = 6;}

                        else if ( (LA13_0=='H') ) {s = 7;}

                        else if ( (LA13_0=='P') ) {s = 8;}

                        else if ( (LA13_0=='L') ) {s = 9;}

                        else if ( (LA13_0=='D') ) {s = 10;}

                        else if ( (LA13_0=='E') ) {s = 11;}

                        else if ( (LA13_0=='N') ) {s = 12;}

                        else if ( (LA13_0=='I') ) {s = 13;}

                        else if ( (LA13_0=='.') ) {s = 14;}

                        else if ( (LA13_0=='-') ) {s = 15;}

                        else if ( (LA13_0=='\"') ) {s = 16;}

                        else if ( (LA13_0=='^') ) {s = 17;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='F' && LA13_0<='G')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='M'||LA13_0=='O'||LA13_0=='Q'||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_107 = input.LA(1);

                        s = -1;
                        if ( ((LA13_107>='\u0000' && LA13_107<='-')||LA13_107=='/'||(LA13_107>=':' && LA13_107<='\uFFFF')) ) {s = 45;}

                        else if ( (LA13_107=='.') ) {s = 118;}

                        else if ( ((LA13_107>='0' && LA13_107<='9')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_95 = input.LA(1);

                        s = -1;
                        if ( ((LA13_95>='\u0000' && LA13_95<='/')||(LA13_95>=':' && LA13_95<='\uFFFF')) ) {s = 45;}

                        else if ( ((LA13_95>='0' && LA13_95<='9')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_66 = input.LA(1);

                        s = -1;
                        if ( ((LA13_66>='0' && LA13_66<='9')) ) {s = 82;}

                        else if ( ((LA13_66>='\u0000' && LA13_66<='/')||(LA13_66>=':' && LA13_66<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_82 = input.LA(1);

                        s = -1;
                        if ( (LA13_82=='.') ) {s = 95;}

                        else if ( ((LA13_82>='0' && LA13_82<='9')) ) {s = 82;}

                        else if ( ((LA13_82>='\u0000' && LA13_82<='-')||LA13_82=='/'||(LA13_82>=':' && LA13_82<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_63 = input.LA(1);

                        s = -1;
                        if ( (LA13_63=='\"') ) {s = 64;}

                        else if ( ((LA13_63>='-' && LA13_63<=':')||(LA13_63>='A' && LA13_63<='Z')||LA13_63=='_'||(LA13_63>='a' && LA13_63<='z')) ) {s = 63;}

                        else if ( ((LA13_63>='\u0000' && LA13_63<='!')||(LA13_63>='#' && LA13_63<=',')||(LA13_63>=';' && LA13_63<='@')||(LA13_63>='[' && LA13_63<='^')||LA13_63=='`'||(LA13_63>='{' && LA13_63<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='A' && LA13_16<='Z')||LA13_16=='_'||(LA13_16>='a' && LA13_16<='z')) ) {s = 43;}

                        else if ( ((LA13_16>='0' && LA13_16<='9')) ) {s = 44;}

                        else if ( ((LA13_16>='\u0000' && LA13_16<='/')||(LA13_16>=':' && LA13_16<='@')||(LA13_16>='[' && LA13_16<='^')||LA13_16=='`'||(LA13_16>='{' && LA13_16<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_43 = input.LA(1);

                        s = -1;
                        if ( ((LA13_43>='-' && LA13_43<=':')||(LA13_43>='A' && LA13_43<='Z')||LA13_43=='_'||(LA13_43>='a' && LA13_43<='z')) ) {s = 63;}

                        else if ( (LA13_43=='\"') ) {s = 64;}

                        else if ( ((LA13_43>='\u0000' && LA13_43<='!')||(LA13_43>='#' && LA13_43<=',')||(LA13_43>=';' && LA13_43<='@')||(LA13_43>='[' && LA13_43<='^')||LA13_43=='`'||(LA13_43>='{' && LA13_43<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_44 = input.LA(1);

                        s = -1;
                        if ( (LA13_44=='\"') ) {s = 65;}

                        else if ( ((LA13_44>='0' && LA13_44<='9')) ) {s = 44;}

                        else if ( (LA13_44=='.') ) {s = 66;}

                        else if ( ((LA13_44>='\u0000' && LA13_44<='!')||(LA13_44>='#' && LA13_44<='-')||LA13_44=='/'||(LA13_44>=':' && LA13_44<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}