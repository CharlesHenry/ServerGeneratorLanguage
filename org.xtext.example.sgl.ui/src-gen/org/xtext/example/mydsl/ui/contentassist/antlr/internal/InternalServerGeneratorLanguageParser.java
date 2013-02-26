package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.ServerGeneratorLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServerGeneratorLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'id'", "'SERVER'", "'{'", "'CONFIG'", "'}'", "'ROOTDIR'", "'='", "'HOSTNAME'", "'PORT'", "'LOG'", "'SQLDB'", "'RESOURCE'", "'DOMAINMODEL'", "'ENTITYS'", "'ENTITY_RELATIONSHIP'", "'STRING'", "'NUMBER'", "'IMAGE'", "'.'", "'->'", "'GUI'", "'LAYOUT'", "'LABEL'", "'TEXT'", "'DATA'", "'BUTTON'", "'FUNCTION'", "'INPUT'", "'TYPE'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalServerGeneratorLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServerGeneratorLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServerGeneratorLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g"; }


     
     	private ServerGeneratorLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ServerGeneratorLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:69:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:73:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:74:1: ( ( rule__Model__TypesAssignment )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:74:1: ( ( rule__Model__TypesAssignment )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:75:1: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:76:1: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==25||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:76:2: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_in_ruleModel94);
            	    rule__Model__TypesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:89:1: ( ruleType EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType122);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:97:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:104:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleServer"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:116:1: entryRuleServer : ruleServer EOF ;
    public final void entryRuleServer() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:117:1: ( ruleServer EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:118:1: ruleServer EOF
            {
             before(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_ruleServer_in_entryRuleServer182);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getServerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServer189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:125:1: ruleServer : ( ( rule__Server__Group__0 ) ) ;
    public final void ruleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:129:2: ( ( ( rule__Server__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:130:1: ( ( rule__Server__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:130:1: ( ( rule__Server__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:131:1: ( rule__Server__Group__0 )
            {
             before(grammarAccess.getServerAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:132:1: ( rule__Server__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:132:2: rule__Server__Group__0
            {
            pushFollow(FOLLOW_rule__Server__Group__0_in_ruleServer215);
            rule__Server__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:144:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:145:1: ( ruleConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:146:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig242);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:153:1: ruleConfig : ( ( rule__Config__Alternatives ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:157:2: ( ( ( rule__Config__Alternatives ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:158:1: ( ( rule__Config__Alternatives ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:158:1: ( ( rule__Config__Alternatives ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:159:1: ( rule__Config__Alternatives )
            {
             before(grammarAccess.getConfigAccess().getAlternatives()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:160:1: ( rule__Config__Alternatives )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:160:2: rule__Config__Alternatives
            {
            pushFollow(FOLLOW_rule__Config__Alternatives_in_ruleConfig275);
            rule__Config__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRulerootConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:172:1: entryRulerootConfig : rulerootConfig EOF ;
    public final void entryRulerootConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:173:1: ( rulerootConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:174:1: rulerootConfig EOF
            {
             before(grammarAccess.getRootConfigRule()); 
            pushFollow(FOLLOW_rulerootConfig_in_entryRulerootConfig302);
            rulerootConfig();

            state._fsp--;

             after(grammarAccess.getRootConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerootConfig309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerootConfig"


    // $ANTLR start "rulerootConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:181:1: rulerootConfig : ( ( rule__RootConfig__Group__0 ) ) ;
    public final void rulerootConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:185:2: ( ( ( rule__RootConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:186:1: ( ( rule__RootConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:186:1: ( ( rule__RootConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:187:1: ( rule__RootConfig__Group__0 )
            {
             before(grammarAccess.getRootConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:188:1: ( rule__RootConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:188:2: rule__RootConfig__Group__0
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__0_in_rulerootConfig335);
            rule__RootConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerootConfig"


    // $ANTLR start "entryRulehostNameConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:200:1: entryRulehostNameConfig : rulehostNameConfig EOF ;
    public final void entryRulehostNameConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:201:1: ( rulehostNameConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:202:1: rulehostNameConfig EOF
            {
             before(grammarAccess.getHostNameConfigRule()); 
            pushFollow(FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig362);
            rulehostNameConfig();

            state._fsp--;

             after(grammarAccess.getHostNameConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulehostNameConfig369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulehostNameConfig"


    // $ANTLR start "rulehostNameConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:209:1: rulehostNameConfig : ( ( rule__HostNameConfig__Group__0 ) ) ;
    public final void rulehostNameConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:213:2: ( ( ( rule__HostNameConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:214:1: ( ( rule__HostNameConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:214:1: ( ( rule__HostNameConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:215:1: ( rule__HostNameConfig__Group__0 )
            {
             before(grammarAccess.getHostNameConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:216:1: ( rule__HostNameConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:216:2: rule__HostNameConfig__Group__0
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__0_in_rulehostNameConfig395);
            rule__HostNameConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHostNameConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehostNameConfig"


    // $ANTLR start "entryRuleportConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:228:1: entryRuleportConfig : ruleportConfig EOF ;
    public final void entryRuleportConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:229:1: ( ruleportConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:230:1: ruleportConfig EOF
            {
             before(grammarAccess.getPortConfigRule()); 
            pushFollow(FOLLOW_ruleportConfig_in_entryRuleportConfig422);
            ruleportConfig();

            state._fsp--;

             after(grammarAccess.getPortConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleportConfig429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleportConfig"


    // $ANTLR start "ruleportConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:237:1: ruleportConfig : ( ( rule__PortConfig__Group__0 ) ) ;
    public final void ruleportConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:241:2: ( ( ( rule__PortConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:242:1: ( ( rule__PortConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:242:1: ( ( rule__PortConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:243:1: ( rule__PortConfig__Group__0 )
            {
             before(grammarAccess.getPortConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:244:1: ( rule__PortConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:244:2: rule__PortConfig__Group__0
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__0_in_ruleportConfig455);
            rule__PortConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleportConfig"


    // $ANTLR start "entryRulelogConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:256:1: entryRulelogConfig : rulelogConfig EOF ;
    public final void entryRulelogConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:257:1: ( rulelogConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:258:1: rulelogConfig EOF
            {
             before(grammarAccess.getLogConfigRule()); 
            pushFollow(FOLLOW_rulelogConfig_in_entryRulelogConfig482);
            rulelogConfig();

            state._fsp--;

             after(grammarAccess.getLogConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelogConfig489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelogConfig"


    // $ANTLR start "rulelogConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:265:1: rulelogConfig : ( ( rule__LogConfig__Group__0 ) ) ;
    public final void rulelogConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:269:2: ( ( ( rule__LogConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:270:1: ( ( rule__LogConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:270:1: ( ( rule__LogConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:271:1: ( rule__LogConfig__Group__0 )
            {
             before(grammarAccess.getLogConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:272:1: ( rule__LogConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:272:2: rule__LogConfig__Group__0
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__0_in_rulelogConfig515);
            rule__LogConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelogConfig"


    // $ANTLR start "entryRulesqldbConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:284:1: entryRulesqldbConfig : rulesqldbConfig EOF ;
    public final void entryRulesqldbConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:285:1: ( rulesqldbConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:286:1: rulesqldbConfig EOF
            {
             before(grammarAccess.getSqldbConfigRule()); 
            pushFollow(FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig542);
            rulesqldbConfig();

            state._fsp--;

             after(grammarAccess.getSqldbConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesqldbConfig549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesqldbConfig"


    // $ANTLR start "rulesqldbConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:293:1: rulesqldbConfig : ( ( rule__SqldbConfig__Group__0 ) ) ;
    public final void rulesqldbConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:297:2: ( ( ( rule__SqldbConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:298:1: ( ( rule__SqldbConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:298:1: ( ( rule__SqldbConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:299:1: ( rule__SqldbConfig__Group__0 )
            {
             before(grammarAccess.getSqldbConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:300:1: ( rule__SqldbConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:300:2: rule__SqldbConfig__Group__0
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__0_in_rulesqldbConfig575);
            rule__SqldbConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSqldbConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesqldbConfig"


    // $ANTLR start "entryRuleresourceConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:312:1: entryRuleresourceConfig : ruleresourceConfig EOF ;
    public final void entryRuleresourceConfig() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:313:1: ( ruleresourceConfig EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:314:1: ruleresourceConfig EOF
            {
             before(grammarAccess.getResourceConfigRule()); 
            pushFollow(FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig602);
            ruleresourceConfig();

            state._fsp--;

             after(grammarAccess.getResourceConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresourceConfig609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleresourceConfig"


    // $ANTLR start "ruleresourceConfig"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:321:1: ruleresourceConfig : ( ( rule__ResourceConfig__Group__0 ) ) ;
    public final void ruleresourceConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:325:2: ( ( ( rule__ResourceConfig__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:326:1: ( ( rule__ResourceConfig__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:326:1: ( ( rule__ResourceConfig__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:327:1: ( rule__ResourceConfig__Group__0 )
            {
             before(grammarAccess.getResourceConfigAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:328:1: ( rule__ResourceConfig__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:328:2: rule__ResourceConfig__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__0_in_ruleresourceConfig635);
            rule__ResourceConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleresourceConfig"


    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:340:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:341:1: ( ruleDomainModel EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:342:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel662);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:349:1: ruleDomainModel : ( ( rule__DomainModel__Group__0 ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:353:2: ( ( ( rule__DomainModel__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:354:1: ( ( rule__DomainModel__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:354:1: ( ( rule__DomainModel__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:355:1: ( rule__DomainModel__Group__0 )
            {
             before(grammarAccess.getDomainModelAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:356:1: ( rule__DomainModel__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:356:2: rule__DomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel695);
            rule__DomainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:368:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:369:1: ( ruleEntity EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:370:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity722);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:377:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:381:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:382:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:382:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:383:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:384:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:384:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity755);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:396:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:397:1: ( ruleAttribute EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:398:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute782);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:405:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:409:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:410:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:410:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:411:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:412:1: ( rule__Attribute__Alternatives )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:412:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute815);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:424:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:425:1: ( ruleStringAttribute EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:426:1: ruleStringAttribute EOF
            {
             before(grammarAccess.getStringAttributeRule()); 
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute842);
            ruleStringAttribute();

            state._fsp--;

             after(grammarAccess.getStringAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:433:1: ruleStringAttribute : ( ( rule__StringAttribute__Group__0 ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:437:2: ( ( ( rule__StringAttribute__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:438:1: ( ( rule__StringAttribute__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:438:1: ( ( rule__StringAttribute__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:439:1: ( rule__StringAttribute__Group__0 )
            {
             before(grammarAccess.getStringAttributeAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:440:1: ( rule__StringAttribute__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:440:2: rule__StringAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__StringAttribute__Group__0_in_ruleStringAttribute875);
            rule__StringAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleNumberAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:452:1: entryRuleNumberAttribute : ruleNumberAttribute EOF ;
    public final void entryRuleNumberAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:453:1: ( ruleNumberAttribute EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:454:1: ruleNumberAttribute EOF
            {
             before(grammarAccess.getNumberAttributeRule()); 
            pushFollow(FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute902);
            ruleNumberAttribute();

            state._fsp--;

             after(grammarAccess.getNumberAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberAttribute909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberAttribute"


    // $ANTLR start "ruleNumberAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:461:1: ruleNumberAttribute : ( ( rule__NumberAttribute__Group__0 ) ) ;
    public final void ruleNumberAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:465:2: ( ( ( rule__NumberAttribute__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:466:1: ( ( rule__NumberAttribute__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:466:1: ( ( rule__NumberAttribute__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:467:1: ( rule__NumberAttribute__Group__0 )
            {
             before(grammarAccess.getNumberAttributeAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:468:1: ( rule__NumberAttribute__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:468:2: rule__NumberAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__NumberAttribute__Group__0_in_ruleNumberAttribute935);
            rule__NumberAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberAttribute"


    // $ANTLR start "entryRuleImageAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:480:1: entryRuleImageAttribute : ruleImageAttribute EOF ;
    public final void entryRuleImageAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:481:1: ( ruleImageAttribute EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:482:1: ruleImageAttribute EOF
            {
             before(grammarAccess.getImageAttributeRule()); 
            pushFollow(FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute962);
            ruleImageAttribute();

            state._fsp--;

             after(grammarAccess.getImageAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageAttribute969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageAttribute"


    // $ANTLR start "ruleImageAttribute"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:489:1: ruleImageAttribute : ( ( rule__ImageAttribute__Group__0 ) ) ;
    public final void ruleImageAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:493:2: ( ( ( rule__ImageAttribute__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:494:1: ( ( rule__ImageAttribute__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:494:1: ( ( rule__ImageAttribute__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:495:1: ( rule__ImageAttribute__Group__0 )
            {
             before(grammarAccess.getImageAttributeAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:496:1: ( rule__ImageAttribute__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:496:2: rule__ImageAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ImageAttribute__Group__0_in_ruleImageAttribute995);
            rule__ImageAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:508:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:509:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:510:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1022);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:517:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:521:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:523:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:524:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:524:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1055);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRelationship"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:536:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:537:1: ( ruleRelationship EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:538:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1082);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:545:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:549:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:550:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:550:1: ( ( rule__Relationship__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:551:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:552:1: ( rule__Relationship__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:552:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship1115);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleGui"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:564:1: entryRuleGui : ruleGui EOF ;
    public final void entryRuleGui() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:565:1: ( ruleGui EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:566:1: ruleGui EOF
            {
             before(grammarAccess.getGuiRule()); 
            pushFollow(FOLLOW_ruleGui_in_entryRuleGui1142);
            ruleGui();

            state._fsp--;

             after(grammarAccess.getGuiRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGui1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGui"


    // $ANTLR start "ruleGui"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:573:1: ruleGui : ( ( rule__Gui__Group__0 ) ) ;
    public final void ruleGui() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:577:2: ( ( ( rule__Gui__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:578:1: ( ( rule__Gui__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:578:1: ( ( rule__Gui__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:579:1: ( rule__Gui__Group__0 )
            {
             before(grammarAccess.getGuiAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:580:1: ( rule__Gui__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:580:2: rule__Gui__Group__0
            {
            pushFollow(FOLLOW_rule__Gui__Group__0_in_ruleGui1175);
            rule__Gui__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGui"


    // $ANTLR start "entryRuleGuiFeature"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:592:1: entryRuleGuiFeature : ruleGuiFeature EOF ;
    public final void entryRuleGuiFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:593:1: ( ruleGuiFeature EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:594:1: ruleGuiFeature EOF
            {
             before(grammarAccess.getGuiFeatureRule()); 
            pushFollow(FOLLOW_ruleGuiFeature_in_entryRuleGuiFeature1202);
            ruleGuiFeature();

            state._fsp--;

             after(grammarAccess.getGuiFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiFeature1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuiFeature"


    // $ANTLR start "ruleGuiFeature"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:601:1: ruleGuiFeature : ( ( rule__GuiFeature__Alternatives ) ) ;
    public final void ruleGuiFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:605:2: ( ( ( rule__GuiFeature__Alternatives ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:606:1: ( ( rule__GuiFeature__Alternatives ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:606:1: ( ( rule__GuiFeature__Alternatives ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:607:1: ( rule__GuiFeature__Alternatives )
            {
             before(grammarAccess.getGuiFeatureAccess().getAlternatives()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:608:1: ( rule__GuiFeature__Alternatives )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:608:2: rule__GuiFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__GuiFeature__Alternatives_in_ruleGuiFeature1235);
            rule__GuiFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGuiFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiFeature"


    // $ANTLR start "entryRuleGuiLabel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:620:1: entryRuleGuiLabel : ruleGuiLabel EOF ;
    public final void entryRuleGuiLabel() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:621:1: ( ruleGuiLabel EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:622:1: ruleGuiLabel EOF
            {
             before(grammarAccess.getGuiLabelRule()); 
            pushFollow(FOLLOW_ruleGuiLabel_in_entryRuleGuiLabel1262);
            ruleGuiLabel();

            state._fsp--;

             after(grammarAccess.getGuiLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiLabel1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuiLabel"


    // $ANTLR start "ruleGuiLabel"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:629:1: ruleGuiLabel : ( ( rule__GuiLabel__Group__0 ) ) ;
    public final void ruleGuiLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:633:2: ( ( ( rule__GuiLabel__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:634:1: ( ( rule__GuiLabel__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:634:1: ( ( rule__GuiLabel__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:635:1: ( rule__GuiLabel__Group__0 )
            {
             before(grammarAccess.getGuiLabelAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:636:1: ( rule__GuiLabel__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:636:2: rule__GuiLabel__Group__0
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__0_in_ruleGuiLabel1295);
            rule__GuiLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuiLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiLabel"


    // $ANTLR start "entryRuleGuiButton"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:648:1: entryRuleGuiButton : ruleGuiButton EOF ;
    public final void entryRuleGuiButton() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:649:1: ( ruleGuiButton EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:650:1: ruleGuiButton EOF
            {
             before(grammarAccess.getGuiButtonRule()); 
            pushFollow(FOLLOW_ruleGuiButton_in_entryRuleGuiButton1322);
            ruleGuiButton();

            state._fsp--;

             after(grammarAccess.getGuiButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiButton1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuiButton"


    // $ANTLR start "ruleGuiButton"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:657:1: ruleGuiButton : ( ( rule__GuiButton__Group__0 ) ) ;
    public final void ruleGuiButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:661:2: ( ( ( rule__GuiButton__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:662:1: ( ( rule__GuiButton__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:662:1: ( ( rule__GuiButton__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:663:1: ( rule__GuiButton__Group__0 )
            {
             before(grammarAccess.getGuiButtonAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:664:1: ( rule__GuiButton__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:664:2: rule__GuiButton__Group__0
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__0_in_ruleGuiButton1355);
            rule__GuiButton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuiButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiButton"


    // $ANTLR start "entryRuleGuiInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:676:1: entryRuleGuiInput : ruleGuiInput EOF ;
    public final void entryRuleGuiInput() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:677:1: ( ruleGuiInput EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:678:1: ruleGuiInput EOF
            {
             before(grammarAccess.getGuiInputRule()); 
            pushFollow(FOLLOW_ruleGuiInput_in_entryRuleGuiInput1382);
            ruleGuiInput();

            state._fsp--;

             after(grammarAccess.getGuiInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiInput1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuiInput"


    // $ANTLR start "ruleGuiInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:685:1: ruleGuiInput : ( ( rule__GuiInput__Group__0 ) ) ;
    public final void ruleGuiInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:689:2: ( ( ( rule__GuiInput__Group__0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:690:1: ( ( rule__GuiInput__Group__0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:690:1: ( ( rule__GuiInput__Group__0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:691:1: ( rule__GuiInput__Group__0 )
            {
             before(grammarAccess.getGuiInputAccess().getGroup()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:692:1: ( rule__GuiInput__Group__0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:692:2: rule__GuiInput__Group__0
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__0_in_ruleGuiInput1415);
            rule__GuiInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuiInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuiInput"


    // $ANTLR start "entryRuleInputType"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:704:1: entryRuleInputType : ruleInputType EOF ;
    public final void entryRuleInputType() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:705:1: ( ruleInputType EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:706:1: ruleInputType EOF
            {
             before(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_ruleInputType_in_entryRuleInputType1442);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getInputTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputType1449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputType"


    // $ANTLR start "ruleInputType"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:713:1: ruleInputType : ( ( rule__InputType__Alternatives ) ) ;
    public final void ruleInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:717:2: ( ( ( rule__InputType__Alternatives ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:718:1: ( ( rule__InputType__Alternatives ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:718:1: ( ( rule__InputType__Alternatives ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:719:1: ( rule__InputType__Alternatives )
            {
             before(grammarAccess.getInputTypeAccess().getAlternatives()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:720:1: ( rule__InputType__Alternatives )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:720:2: rule__InputType__Alternatives
            {
            pushFollow(FOLLOW_rule__InputType__Alternatives_in_ruleInputType1475);
            rule__InputType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputType"


    // $ANTLR start "entryRuleStringInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:732:1: entryRuleStringInput : ruleStringInput EOF ;
    public final void entryRuleStringInput() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:733:1: ( ruleStringInput EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:734:1: ruleStringInput EOF
            {
             before(grammarAccess.getStringInputRule()); 
            pushFollow(FOLLOW_ruleStringInput_in_entryRuleStringInput1502);
            ruleStringInput();

            state._fsp--;

             after(grammarAccess.getStringInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringInput1509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringInput"


    // $ANTLR start "ruleStringInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:741:1: ruleStringInput : ( 'string' ) ;
    public final void ruleStringInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:745:2: ( ( 'string' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:746:1: ( 'string' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:746:1: ( 'string' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:747:1: 'string'
            {
             before(grammarAccess.getStringInputAccess().getStringKeyword()); 
            match(input,11,FOLLOW_11_in_ruleStringInput1536); 
             after(grammarAccess.getStringInputAccess().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringInput"


    // $ANTLR start "entryRuleIntegerInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:762:1: entryRuleIntegerInput : ruleIntegerInput EOF ;
    public final void entryRuleIntegerInput() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:763:1: ( ruleIntegerInput EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:764:1: ruleIntegerInput EOF
            {
             before(grammarAccess.getIntegerInputRule()); 
            pushFollow(FOLLOW_ruleIntegerInput_in_entryRuleIntegerInput1564);
            ruleIntegerInput();

            state._fsp--;

             after(grammarAccess.getIntegerInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerInput1571); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerInput"


    // $ANTLR start "ruleIntegerInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:771:1: ruleIntegerInput : ( 'int' ) ;
    public final void ruleIntegerInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:775:2: ( ( 'int' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:776:1: ( 'int' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:776:1: ( 'int' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:777:1: 'int'
            {
             before(grammarAccess.getIntegerInputAccess().getIntKeyword()); 
            match(input,12,FOLLOW_12_in_ruleIntegerInput1598); 
             after(grammarAccess.getIntegerInputAccess().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerInput"


    // $ANTLR start "entryRuleIdInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:792:1: entryRuleIdInput : ruleIdInput EOF ;
    public final void entryRuleIdInput() throws RecognitionException {
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:793:1: ( ruleIdInput EOF )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:794:1: ruleIdInput EOF
            {
             before(grammarAccess.getIdInputRule()); 
            pushFollow(FOLLOW_ruleIdInput_in_entryRuleIdInput1626);
            ruleIdInput();

            state._fsp--;

             after(grammarAccess.getIdInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdInput1633); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdInput"


    // $ANTLR start "ruleIdInput"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:801:1: ruleIdInput : ( 'id' ) ;
    public final void ruleIdInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:805:2: ( ( 'id' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:806:1: ( 'id' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:806:1: ( 'id' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:807:1: 'id'
            {
             before(grammarAccess.getIdInputAccess().getIdKeyword()); 
            match(input,13,FOLLOW_13_in_ruleIdInput1660); 
             after(grammarAccess.getIdInputAccess().getIdKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdInput"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:822:1: rule__Type__Alternatives : ( ( ruleServer ) | ( ruleDomainModel ) | ( ruleGui ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:826:1: ( ( ruleServer ) | ( ruleDomainModel ) | ( ruleGui ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:827:1: ( ruleServer )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:827:1: ( ruleServer )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:828:1: ruleServer
                    {
                     before(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServer_in_rule__Type__Alternatives1697);
                    ruleServer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:833:6: ( ruleDomainModel )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:833:6: ( ruleDomainModel )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:834:1: ruleDomainModel
                    {
                     before(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDomainModel_in_rule__Type__Alternatives1714);
                    ruleDomainModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:839:6: ( ruleGui )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:839:6: ( ruleGui )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:840:1: ruleGui
                    {
                     before(grammarAccess.getTypeAccess().getGuiParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGui_in_rule__Type__Alternatives1731);
                    ruleGui();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getGuiParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Config__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:850:1: rule__Config__Alternatives : ( ( rulerootConfig ) | ( rulehostNameConfig ) | ( ruleportConfig ) | ( rulelogConfig ) | ( rulesqldbConfig ) | ( ruleresourceConfig ) );
    public final void rule__Config__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:854:1: ( ( rulerootConfig ) | ( rulehostNameConfig ) | ( ruleportConfig ) | ( rulelogConfig ) | ( rulesqldbConfig ) | ( ruleresourceConfig ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:855:1: ( rulerootConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:855:1: ( rulerootConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:856:1: rulerootConfig
                    {
                     before(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulerootConfig_in_rule__Config__Alternatives1763);
                    rulerootConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:861:6: ( rulehostNameConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:861:6: ( rulehostNameConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:862:1: rulehostNameConfig
                    {
                     before(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulehostNameConfig_in_rule__Config__Alternatives1780);
                    rulehostNameConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:867:6: ( ruleportConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:867:6: ( ruleportConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:868:1: ruleportConfig
                    {
                     before(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleportConfig_in_rule__Config__Alternatives1797);
                    ruleportConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:873:6: ( rulelogConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:873:6: ( rulelogConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:874:1: rulelogConfig
                    {
                     before(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulelogConfig_in_rule__Config__Alternatives1814);
                    rulelogConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:879:6: ( rulesqldbConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:879:6: ( rulesqldbConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:880:1: rulesqldbConfig
                    {
                     before(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulesqldbConfig_in_rule__Config__Alternatives1831);
                    rulesqldbConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:885:6: ( ruleresourceConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:885:6: ( ruleresourceConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:886:1: ruleresourceConfig
                    {
                     before(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleresourceConfig_in_rule__Config__Alternatives1848);
                    ruleresourceConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:896:1: rule__Attribute__Alternatives : ( ( ruleStringAttribute ) | ( ruleNumberAttribute ) | ( ruleImageAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:900:1: ( ( ruleStringAttribute ) | ( ruleNumberAttribute ) | ( ruleImageAttribute ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:901:1: ( ruleStringAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:901:1: ( ruleStringAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:902:1: ruleStringAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1880);
                    ruleStringAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:907:6: ( ruleNumberAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:907:6: ( ruleNumberAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:908:1: ruleNumberAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberAttribute_in_rule__Attribute__Alternatives1897);
                    ruleNumberAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:913:6: ( ruleImageAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:913:6: ( ruleImageAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:914:1: ruleImageAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImageAttribute_in_rule__Attribute__Alternatives1914);
                    ruleImageAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__GuiFeature__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:924:1: rule__GuiFeature__Alternatives : ( ( ruleGuiLabel ) | ( ruleGuiButton ) | ( ruleGuiInput ) );
    public final void rule__GuiFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:928:1: ( ( ruleGuiLabel ) | ( ruleGuiButton ) | ( ruleGuiInput ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:929:1: ( ruleGuiLabel )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:929:1: ( ruleGuiLabel )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:930:1: ruleGuiLabel
                    {
                     before(grammarAccess.getGuiFeatureAccess().getGuiLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGuiLabel_in_rule__GuiFeature__Alternatives1946);
                    ruleGuiLabel();

                    state._fsp--;

                     after(grammarAccess.getGuiFeatureAccess().getGuiLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:935:6: ( ruleGuiButton )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:935:6: ( ruleGuiButton )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:936:1: ruleGuiButton
                    {
                     before(grammarAccess.getGuiFeatureAccess().getGuiButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGuiButton_in_rule__GuiFeature__Alternatives1963);
                    ruleGuiButton();

                    state._fsp--;

                     after(grammarAccess.getGuiFeatureAccess().getGuiButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:941:6: ( ruleGuiInput )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:941:6: ( ruleGuiInput )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:942:1: ruleGuiInput
                    {
                     before(grammarAccess.getGuiFeatureAccess().getGuiInputParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGuiInput_in_rule__GuiFeature__Alternatives1980);
                    ruleGuiInput();

                    state._fsp--;

                     after(grammarAccess.getGuiFeatureAccess().getGuiInputParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiFeature__Alternatives"


    // $ANTLR start "rule__InputType__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:952:1: rule__InputType__Alternatives : ( ( ruleStringInput ) | ( ruleIntegerInput ) | ( ruleIdInput ) );
    public final void rule__InputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:956:1: ( ( ruleStringInput ) | ( ruleIntegerInput ) | ( ruleIdInput ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:957:1: ( ruleStringInput )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:957:1: ( ruleStringInput )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:958:1: ruleStringInput
                    {
                     before(grammarAccess.getInputTypeAccess().getStringInputParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringInput_in_rule__InputType__Alternatives2012);
                    ruleStringInput();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getStringInputParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:963:6: ( ruleIntegerInput )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:963:6: ( ruleIntegerInput )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:964:1: ruleIntegerInput
                    {
                     before(grammarAccess.getInputTypeAccess().getIntegerInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerInput_in_rule__InputType__Alternatives2029);
                    ruleIntegerInput();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getIntegerInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:969:6: ( ruleIdInput )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:969:6: ( ruleIdInput )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:970:1: ruleIdInput
                    {
                     before(grammarAccess.getInputTypeAccess().getIdInputParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdInput_in_rule__InputType__Alternatives2046);
                    ruleIdInput();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getIdInputParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Alternatives"


    // $ANTLR start "rule__Server__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:982:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:986:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:987:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__02076);
            rule__Server__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__1_in_rule__Server__Group__02079);
            rule__Server__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0"


    // $ANTLR start "rule__Server__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:994:1: rule__Server__Group__0__Impl : ( 'SERVER' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:998:1: ( ( 'SERVER' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( 'SERVER' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( 'SERVER' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1000:1: 'SERVER'
            {
             before(grammarAccess.getServerAccess().getSERVERKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Server__Group__0__Impl2107); 
             after(grammarAccess.getServerAccess().getSERVERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0__Impl"


    // $ANTLR start "rule__Server__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1013:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1017:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1018:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__12138);
            rule__Server__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__2_in_rule__Server__Group__12141);
            rule__Server__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1"


    // $ANTLR start "rule__Server__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1025:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1029:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1030:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1030:1: ( ( rule__Server__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1031:1: ( rule__Server__NameAssignment_1 )
            {
             before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1032:1: ( rule__Server__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1032:2: rule__Server__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl2168);
            rule__Server__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1__Impl"


    // $ANTLR start "rule__Server__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1042:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1046:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1047:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__22198);
            rule__Server__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__3_in_rule__Server__Group__22201);
            rule__Server__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2"


    // $ANTLR start "rule__Server__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1054:1: rule__Server__Group__2__Impl : ( '{' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1058:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1059:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1059:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1060:1: '{'
            {
             before(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Server__Group__2__Impl2229); 
             after(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2__Impl"


    // $ANTLR start "rule__Server__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1073:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1077:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1078:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__32260);
            rule__Server__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__4_in_rule__Server__Group__32263);
            rule__Server__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3"


    // $ANTLR start "rule__Server__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1085:1: rule__Server__Group__3__Impl : ( 'CONFIG' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1089:1: ( ( 'CONFIG' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1090:1: ( 'CONFIG' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1090:1: ( 'CONFIG' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1091:1: 'CONFIG'
            {
             before(grammarAccess.getServerAccess().getCONFIGKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Server__Group__3__Impl2291); 
             after(grammarAccess.getServerAccess().getCONFIGKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3__Impl"


    // $ANTLR start "rule__Server__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1104:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1108:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1109:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__42322);
            rule__Server__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__5_in_rule__Server__Group__42325);
            rule__Server__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4"


    // $ANTLR start "rule__Server__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1116:1: rule__Server__Group__4__Impl : ( '{' ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1120:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1121:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1121:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1122:1: '{'
            {
             before(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Server__Group__4__Impl2353); 
             after(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4__Impl"


    // $ANTLR start "rule__Server__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1135:1: rule__Server__Group__5 : rule__Server__Group__5__Impl rule__Server__Group__6 ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1139:1: ( rule__Server__Group__5__Impl rule__Server__Group__6 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1140:2: rule__Server__Group__5__Impl rule__Server__Group__6
            {
            pushFollow(FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__52384);
            rule__Server__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__6_in_rule__Server__Group__52387);
            rule__Server__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5"


    // $ANTLR start "rule__Server__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1147:1: rule__Server__Group__5__Impl : ( ( rule__Server__ConfigsAssignment_5 )* ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1151:1: ( ( ( rule__Server__ConfigsAssignment_5 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1152:1: ( ( rule__Server__ConfigsAssignment_5 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1152:1: ( ( rule__Server__ConfigsAssignment_5 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1153:1: ( rule__Server__ConfigsAssignment_5 )*
            {
             before(grammarAccess.getServerAccess().getConfigsAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1154:1: ( rule__Server__ConfigsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||(LA7_0>=20 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1154:2: rule__Server__ConfigsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Server__ConfigsAssignment_5_in_rule__Server__Group__5__Impl2414);
            	    rule__Server__ConfigsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getServerAccess().getConfigsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5__Impl"


    // $ANTLR start "rule__Server__Group__6"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1164:1: rule__Server__Group__6 : rule__Server__Group__6__Impl rule__Server__Group__7 ;
    public final void rule__Server__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1168:1: ( rule__Server__Group__6__Impl rule__Server__Group__7 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1169:2: rule__Server__Group__6__Impl rule__Server__Group__7
            {
            pushFollow(FOLLOW_rule__Server__Group__6__Impl_in_rule__Server__Group__62445);
            rule__Server__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__7_in_rule__Server__Group__62448);
            rule__Server__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__6"


    // $ANTLR start "rule__Server__Group__6__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1176:1: rule__Server__Group__6__Impl : ( '}' ) ;
    public final void rule__Server__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1180:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1181:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1181:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1182:1: '}'
            {
             before(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Server__Group__6__Impl2476); 
             after(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__6__Impl"


    // $ANTLR start "rule__Server__Group__7"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1195:1: rule__Server__Group__7 : rule__Server__Group__7__Impl ;
    public final void rule__Server__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1199:1: ( rule__Server__Group__7__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1200:2: rule__Server__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Server__Group__7__Impl_in_rule__Server__Group__72507);
            rule__Server__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__7"


    // $ANTLR start "rule__Server__Group__7__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1206:1: rule__Server__Group__7__Impl : ( '}' ) ;
    public final void rule__Server__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1210:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1211:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1211:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1212:1: '}'
            {
             before(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Server__Group__7__Impl2535); 
             after(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__7__Impl"


    // $ANTLR start "rule__RootConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1241:1: rule__RootConfig__Group__0 : rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1 ;
    public final void rule__RootConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1245:1: ( rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1246:2: rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__0__Impl_in_rule__RootConfig__Group__02582);
            rule__RootConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootConfig__Group__1_in_rule__RootConfig__Group__02585);
            rule__RootConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__0"


    // $ANTLR start "rule__RootConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1253:1: rule__RootConfig__Group__0__Impl : ( 'ROOTDIR' ) ;
    public final void rule__RootConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1257:1: ( ( 'ROOTDIR' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1258:1: ( 'ROOTDIR' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1258:1: ( 'ROOTDIR' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1259:1: 'ROOTDIR'
            {
             before(grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__RootConfig__Group__0__Impl2613); 
             after(grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__0__Impl"


    // $ANTLR start "rule__RootConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1272:1: rule__RootConfig__Group__1 : rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2 ;
    public final void rule__RootConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1276:1: ( rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1277:2: rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__1__Impl_in_rule__RootConfig__Group__12644);
            rule__RootConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootConfig__Group__2_in_rule__RootConfig__Group__12647);
            rule__RootConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__1"


    // $ANTLR start "rule__RootConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1284:1: rule__RootConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__RootConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1288:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1289:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1289:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1290:1: '='
            {
             before(grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__RootConfig__Group__1__Impl2675); 
             after(grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__1__Impl"


    // $ANTLR start "rule__RootConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1303:1: rule__RootConfig__Group__2 : rule__RootConfig__Group__2__Impl ;
    public final void rule__RootConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1307:1: ( rule__RootConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1308:2: rule__RootConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__2__Impl_in_rule__RootConfig__Group__22706);
            rule__RootConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__2"


    // $ANTLR start "rule__RootConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1314:1: rule__RootConfig__Group__2__Impl : ( ( rule__RootConfig__NameAssignment_2 ) ) ;
    public final void rule__RootConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1318:1: ( ( ( rule__RootConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1319:1: ( ( rule__RootConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1319:1: ( ( rule__RootConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1320:1: ( rule__RootConfig__NameAssignment_2 )
            {
             before(grammarAccess.getRootConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1321:1: ( rule__RootConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1321:2: rule__RootConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RootConfig__NameAssignment_2_in_rule__RootConfig__Group__2__Impl2733);
            rule__RootConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__Group__2__Impl"


    // $ANTLR start "rule__HostNameConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1337:1: rule__HostNameConfig__Group__0 : rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1 ;
    public final void rule__HostNameConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1341:1: ( rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1342:2: rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__0__Impl_in_rule__HostNameConfig__Group__02769);
            rule__HostNameConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HostNameConfig__Group__1_in_rule__HostNameConfig__Group__02772);
            rule__HostNameConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__0"


    // $ANTLR start "rule__HostNameConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1349:1: rule__HostNameConfig__Group__0__Impl : ( 'HOSTNAME' ) ;
    public final void rule__HostNameConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1353:1: ( ( 'HOSTNAME' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1354:1: ( 'HOSTNAME' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1354:1: ( 'HOSTNAME' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1355:1: 'HOSTNAME'
            {
             before(grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__HostNameConfig__Group__0__Impl2800); 
             after(grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__0__Impl"


    // $ANTLR start "rule__HostNameConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1368:1: rule__HostNameConfig__Group__1 : rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2 ;
    public final void rule__HostNameConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1372:1: ( rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1373:2: rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__1__Impl_in_rule__HostNameConfig__Group__12831);
            rule__HostNameConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HostNameConfig__Group__2_in_rule__HostNameConfig__Group__12834);
            rule__HostNameConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__1"


    // $ANTLR start "rule__HostNameConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1380:1: rule__HostNameConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__HostNameConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1384:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1385:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1385:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1386:1: '='
            {
             before(grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__HostNameConfig__Group__1__Impl2862); 
             after(grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__1__Impl"


    // $ANTLR start "rule__HostNameConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1399:1: rule__HostNameConfig__Group__2 : rule__HostNameConfig__Group__2__Impl ;
    public final void rule__HostNameConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1403:1: ( rule__HostNameConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1404:2: rule__HostNameConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__2__Impl_in_rule__HostNameConfig__Group__22893);
            rule__HostNameConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__2"


    // $ANTLR start "rule__HostNameConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1410:1: rule__HostNameConfig__Group__2__Impl : ( ( rule__HostNameConfig__NameAssignment_2 ) ) ;
    public final void rule__HostNameConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1414:1: ( ( ( rule__HostNameConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1415:1: ( ( rule__HostNameConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1415:1: ( ( rule__HostNameConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1416:1: ( rule__HostNameConfig__NameAssignment_2 )
            {
             before(grammarAccess.getHostNameConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1417:1: ( rule__HostNameConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1417:2: rule__HostNameConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HostNameConfig__NameAssignment_2_in_rule__HostNameConfig__Group__2__Impl2920);
            rule__HostNameConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHostNameConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__Group__2__Impl"


    // $ANTLR start "rule__PortConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1433:1: rule__PortConfig__Group__0 : rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1 ;
    public final void rule__PortConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1437:1: ( rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1438:2: rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__0__Impl_in_rule__PortConfig__Group__02956);
            rule__PortConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PortConfig__Group__1_in_rule__PortConfig__Group__02959);
            rule__PortConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__0"


    // $ANTLR start "rule__PortConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1445:1: rule__PortConfig__Group__0__Impl : ( 'PORT' ) ;
    public final void rule__PortConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1449:1: ( ( 'PORT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1450:1: ( 'PORT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1450:1: ( 'PORT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1451:1: 'PORT'
            {
             before(grammarAccess.getPortConfigAccess().getPORTKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__PortConfig__Group__0__Impl2987); 
             after(grammarAccess.getPortConfigAccess().getPORTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__0__Impl"


    // $ANTLR start "rule__PortConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1464:1: rule__PortConfig__Group__1 : rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2 ;
    public final void rule__PortConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1468:1: ( rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1469:2: rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__1__Impl_in_rule__PortConfig__Group__13018);
            rule__PortConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PortConfig__Group__2_in_rule__PortConfig__Group__13021);
            rule__PortConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__1"


    // $ANTLR start "rule__PortConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1476:1: rule__PortConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__PortConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1480:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1481:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1481:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1482:1: '='
            {
             before(grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__PortConfig__Group__1__Impl3049); 
             after(grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__1__Impl"


    // $ANTLR start "rule__PortConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1495:1: rule__PortConfig__Group__2 : rule__PortConfig__Group__2__Impl ;
    public final void rule__PortConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1499:1: ( rule__PortConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1500:2: rule__PortConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__2__Impl_in_rule__PortConfig__Group__23080);
            rule__PortConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__2"


    // $ANTLR start "rule__PortConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1506:1: rule__PortConfig__Group__2__Impl : ( ( rule__PortConfig__NameAssignment_2 ) ) ;
    public final void rule__PortConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1510:1: ( ( ( rule__PortConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1511:1: ( ( rule__PortConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1511:1: ( ( rule__PortConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1512:1: ( rule__PortConfig__NameAssignment_2 )
            {
             before(grammarAccess.getPortConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1513:1: ( rule__PortConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1513:2: rule__PortConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PortConfig__NameAssignment_2_in_rule__PortConfig__Group__2__Impl3107);
            rule__PortConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__Group__2__Impl"


    // $ANTLR start "rule__LogConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1529:1: rule__LogConfig__Group__0 : rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1 ;
    public final void rule__LogConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1533:1: ( rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1534:2: rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__0__Impl_in_rule__LogConfig__Group__03143);
            rule__LogConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogConfig__Group__1_in_rule__LogConfig__Group__03146);
            rule__LogConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__0"


    // $ANTLR start "rule__LogConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1541:1: rule__LogConfig__Group__0__Impl : ( 'LOG' ) ;
    public final void rule__LogConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1545:1: ( ( 'LOG' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1546:1: ( 'LOG' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1546:1: ( 'LOG' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1547:1: 'LOG'
            {
             before(grammarAccess.getLogConfigAccess().getLOGKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__LogConfig__Group__0__Impl3174); 
             after(grammarAccess.getLogConfigAccess().getLOGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__0__Impl"


    // $ANTLR start "rule__LogConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1560:1: rule__LogConfig__Group__1 : rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2 ;
    public final void rule__LogConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1564:1: ( rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1565:2: rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__1__Impl_in_rule__LogConfig__Group__13205);
            rule__LogConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogConfig__Group__2_in_rule__LogConfig__Group__13208);
            rule__LogConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__1"


    // $ANTLR start "rule__LogConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1572:1: rule__LogConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__LogConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1576:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1577:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1577:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1578:1: '='
            {
             before(grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__LogConfig__Group__1__Impl3236); 
             after(grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__1__Impl"


    // $ANTLR start "rule__LogConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1591:1: rule__LogConfig__Group__2 : rule__LogConfig__Group__2__Impl ;
    public final void rule__LogConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1595:1: ( rule__LogConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1596:2: rule__LogConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__2__Impl_in_rule__LogConfig__Group__23267);
            rule__LogConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__2"


    // $ANTLR start "rule__LogConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1602:1: rule__LogConfig__Group__2__Impl : ( ( rule__LogConfig__NameAssignment_2 ) ) ;
    public final void rule__LogConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1606:1: ( ( ( rule__LogConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1607:1: ( ( rule__LogConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1607:1: ( ( rule__LogConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1608:1: ( rule__LogConfig__NameAssignment_2 )
            {
             before(grammarAccess.getLogConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1609:1: ( rule__LogConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1609:2: rule__LogConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LogConfig__NameAssignment_2_in_rule__LogConfig__Group__2__Impl3294);
            rule__LogConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__Group__2__Impl"


    // $ANTLR start "rule__SqldbConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1625:1: rule__SqldbConfig__Group__0 : rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1 ;
    public final void rule__SqldbConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1629:1: ( rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1630:2: rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__0__Impl_in_rule__SqldbConfig__Group__03330);
            rule__SqldbConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SqldbConfig__Group__1_in_rule__SqldbConfig__Group__03333);
            rule__SqldbConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__0"


    // $ANTLR start "rule__SqldbConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1637:1: rule__SqldbConfig__Group__0__Impl : ( 'SQLDB' ) ;
    public final void rule__SqldbConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1641:1: ( ( 'SQLDB' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1642:1: ( 'SQLDB' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1642:1: ( 'SQLDB' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1643:1: 'SQLDB'
            {
             before(grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__SqldbConfig__Group__0__Impl3361); 
             after(grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__0__Impl"


    // $ANTLR start "rule__SqldbConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1656:1: rule__SqldbConfig__Group__1 : rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2 ;
    public final void rule__SqldbConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1660:1: ( rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1661:2: rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__1__Impl_in_rule__SqldbConfig__Group__13392);
            rule__SqldbConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SqldbConfig__Group__2_in_rule__SqldbConfig__Group__13395);
            rule__SqldbConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__1"


    // $ANTLR start "rule__SqldbConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1668:1: rule__SqldbConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__SqldbConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1672:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1673:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1673:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1674:1: '='
            {
             before(grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__SqldbConfig__Group__1__Impl3423); 
             after(grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__1__Impl"


    // $ANTLR start "rule__SqldbConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1687:1: rule__SqldbConfig__Group__2 : rule__SqldbConfig__Group__2__Impl ;
    public final void rule__SqldbConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1691:1: ( rule__SqldbConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1692:2: rule__SqldbConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__2__Impl_in_rule__SqldbConfig__Group__23454);
            rule__SqldbConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__2"


    // $ANTLR start "rule__SqldbConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1698:1: rule__SqldbConfig__Group__2__Impl : ( ( rule__SqldbConfig__NameAssignment_2 ) ) ;
    public final void rule__SqldbConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1702:1: ( ( ( rule__SqldbConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1703:1: ( ( rule__SqldbConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1703:1: ( ( rule__SqldbConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1704:1: ( rule__SqldbConfig__NameAssignment_2 )
            {
             before(grammarAccess.getSqldbConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1705:1: ( rule__SqldbConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1705:2: rule__SqldbConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SqldbConfig__NameAssignment_2_in_rule__SqldbConfig__Group__2__Impl3481);
            rule__SqldbConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSqldbConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__Group__2__Impl"


    // $ANTLR start "rule__ResourceConfig__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1721:1: rule__ResourceConfig__Group__0 : rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1 ;
    public final void rule__ResourceConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1725:1: ( rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1726:2: rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__0__Impl_in_rule__ResourceConfig__Group__03517);
            rule__ResourceConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceConfig__Group__1_in_rule__ResourceConfig__Group__03520);
            rule__ResourceConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__0"


    // $ANTLR start "rule__ResourceConfig__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1733:1: rule__ResourceConfig__Group__0__Impl : ( 'RESOURCE' ) ;
    public final void rule__ResourceConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1737:1: ( ( 'RESOURCE' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1738:1: ( 'RESOURCE' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1738:1: ( 'RESOURCE' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1739:1: 'RESOURCE'
            {
             before(grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ResourceConfig__Group__0__Impl3548); 
             after(grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__0__Impl"


    // $ANTLR start "rule__ResourceConfig__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1752:1: rule__ResourceConfig__Group__1 : rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2 ;
    public final void rule__ResourceConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1756:1: ( rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1757:2: rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__1__Impl_in_rule__ResourceConfig__Group__13579);
            rule__ResourceConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceConfig__Group__2_in_rule__ResourceConfig__Group__13582);
            rule__ResourceConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__1"


    // $ANTLR start "rule__ResourceConfig__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1764:1: rule__ResourceConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__ResourceConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1768:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1769:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1769:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1770:1: '='
            {
             before(grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ResourceConfig__Group__1__Impl3610); 
             after(grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__1__Impl"


    // $ANTLR start "rule__ResourceConfig__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1783:1: rule__ResourceConfig__Group__2 : rule__ResourceConfig__Group__2__Impl ;
    public final void rule__ResourceConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1787:1: ( rule__ResourceConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1788:2: rule__ResourceConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__2__Impl_in_rule__ResourceConfig__Group__23641);
            rule__ResourceConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__2"


    // $ANTLR start "rule__ResourceConfig__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1794:1: rule__ResourceConfig__Group__2__Impl : ( ( rule__ResourceConfig__NameAssignment_2 ) ) ;
    public final void rule__ResourceConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1798:1: ( ( ( rule__ResourceConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1799:1: ( ( rule__ResourceConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1799:1: ( ( rule__ResourceConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1800:1: ( rule__ResourceConfig__NameAssignment_2 )
            {
             before(grammarAccess.getResourceConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1801:1: ( rule__ResourceConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1801:2: rule__ResourceConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ResourceConfig__NameAssignment_2_in_rule__ResourceConfig__Group__2__Impl3668);
            rule__ResourceConfig__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceConfigAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1817:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1821:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1822:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__03704);
            rule__DomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__03707);
            rule__DomainModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__0"


    // $ANTLR start "rule__DomainModel__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1829:1: rule__DomainModel__Group__0__Impl : ( 'DOMAINMODEL' ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1833:1: ( ( 'DOMAINMODEL' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1834:1: ( 'DOMAINMODEL' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1834:1: ( 'DOMAINMODEL' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1835:1: 'DOMAINMODEL'
            {
             before(grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__DomainModel__Group__0__Impl3735); 
             after(grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__0__Impl"


    // $ANTLR start "rule__DomainModel__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1848:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1852:1: ( rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1853:2: rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__13766);
            rule__DomainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__2_in_rule__DomainModel__Group__13769);
            rule__DomainModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__1"


    // $ANTLR start "rule__DomainModel__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1860:1: rule__DomainModel__Group__1__Impl : ( ( rule__DomainModel__NameAssignment_1 ) ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1864:1: ( ( ( rule__DomainModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1865:1: ( ( rule__DomainModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1865:1: ( ( rule__DomainModel__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1866:1: ( rule__DomainModel__NameAssignment_1 )
            {
             before(grammarAccess.getDomainModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1867:1: ( rule__DomainModel__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1867:2: rule__DomainModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainModel__NameAssignment_1_in_rule__DomainModel__Group__1__Impl3796);
            rule__DomainModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1877:1: rule__DomainModel__Group__2 : rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 ;
    public final void rule__DomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1881:1: ( rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1882:2: rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__2__Impl_in_rule__DomainModel__Group__23826);
            rule__DomainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__3_in_rule__DomainModel__Group__23829);
            rule__DomainModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__2"


    // $ANTLR start "rule__DomainModel__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1889:1: rule__DomainModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1893:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1894:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1894:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1895:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__DomainModel__Group__2__Impl3857); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1908:1: rule__DomainModel__Group__3 : rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 ;
    public final void rule__DomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1912:1: ( rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1913:2: rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__3__Impl_in_rule__DomainModel__Group__33888);
            rule__DomainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__4_in_rule__DomainModel__Group__33891);
            rule__DomainModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__3"


    // $ANTLR start "rule__DomainModel__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1920:1: rule__DomainModel__Group__3__Impl : ( 'ENTITYS' ) ;
    public final void rule__DomainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1924:1: ( ( 'ENTITYS' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1925:1: ( 'ENTITYS' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1925:1: ( 'ENTITYS' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1926:1: 'ENTITYS'
            {
             before(grammarAccess.getDomainModelAccess().getENTITYSKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__DomainModel__Group__3__Impl3919); 
             after(grammarAccess.getDomainModelAccess().getENTITYSKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__3__Impl"


    // $ANTLR start "rule__DomainModel__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1939:1: rule__DomainModel__Group__4 : rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 ;
    public final void rule__DomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1943:1: ( rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1944:2: rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__4__Impl_in_rule__DomainModel__Group__43950);
            rule__DomainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__5_in_rule__DomainModel__Group__43953);
            rule__DomainModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__4"


    // $ANTLR start "rule__DomainModel__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1951:1: rule__DomainModel__Group__4__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1955:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1956:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1956:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1957:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__DomainModel__Group__4__Impl3981); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__4__Impl"


    // $ANTLR start "rule__DomainModel__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1970:1: rule__DomainModel__Group__5 : rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 ;
    public final void rule__DomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1974:1: ( rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1975:2: rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__5__Impl_in_rule__DomainModel__Group__54012);
            rule__DomainModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__6_in_rule__DomainModel__Group__54015);
            rule__DomainModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__5"


    // $ANTLR start "rule__DomainModel__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1982:1: rule__DomainModel__Group__5__Impl : ( ( rule__DomainModel__EntitysAssignment_5 )* ) ;
    public final void rule__DomainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1986:1: ( ( ( rule__DomainModel__EntitysAssignment_5 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1987:1: ( ( rule__DomainModel__EntitysAssignment_5 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1987:1: ( ( rule__DomainModel__EntitysAssignment_5 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1988:1: ( rule__DomainModel__EntitysAssignment_5 )*
            {
             before(grammarAccess.getDomainModelAccess().getEntitysAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1989:1: ( rule__DomainModel__EntitysAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1989:2: rule__DomainModel__EntitysAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__EntitysAssignment_5_in_rule__DomainModel__Group__5__Impl4042);
            	    rule__DomainModel__EntitysAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getEntitysAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__5__Impl"


    // $ANTLR start "rule__DomainModel__Group__6"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1999:1: rule__DomainModel__Group__6 : rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7 ;
    public final void rule__DomainModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2003:1: ( rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2004:2: rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__6__Impl_in_rule__DomainModel__Group__64073);
            rule__DomainModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__7_in_rule__DomainModel__Group__64076);
            rule__DomainModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__6"


    // $ANTLR start "rule__DomainModel__Group__6__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2011:1: rule__DomainModel__Group__6__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2015:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2016:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2016:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2017:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__DomainModel__Group__6__Impl4104); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__6__Impl"


    // $ANTLR start "rule__DomainModel__Group__7"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2030:1: rule__DomainModel__Group__7 : rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8 ;
    public final void rule__DomainModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2034:1: ( rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2035:2: rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__7__Impl_in_rule__DomainModel__Group__74135);
            rule__DomainModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__8_in_rule__DomainModel__Group__74138);
            rule__DomainModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__7"


    // $ANTLR start "rule__DomainModel__Group__7__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2042:1: rule__DomainModel__Group__7__Impl : ( 'ENTITY_RELATIONSHIP' ) ;
    public final void rule__DomainModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2046:1: ( ( 'ENTITY_RELATIONSHIP' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2047:1: ( 'ENTITY_RELATIONSHIP' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2047:1: ( 'ENTITY_RELATIONSHIP' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2048:1: 'ENTITY_RELATIONSHIP'
            {
             before(grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__DomainModel__Group__7__Impl4166); 
             after(grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__7__Impl"


    // $ANTLR start "rule__DomainModel__Group__8"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2061:1: rule__DomainModel__Group__8 : rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9 ;
    public final void rule__DomainModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2065:1: ( rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2066:2: rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__8__Impl_in_rule__DomainModel__Group__84197);
            rule__DomainModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__9_in_rule__DomainModel__Group__84200);
            rule__DomainModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__8"


    // $ANTLR start "rule__DomainModel__Group__8__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2073:1: rule__DomainModel__Group__8__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2077:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2078:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2078:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2079:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__DomainModel__Group__8__Impl4228); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__8__Impl"


    // $ANTLR start "rule__DomainModel__Group__9"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2092:1: rule__DomainModel__Group__9 : rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10 ;
    public final void rule__DomainModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2096:1: ( rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2097:2: rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__9__Impl_in_rule__DomainModel__Group__94259);
            rule__DomainModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__10_in_rule__DomainModel__Group__94262);
            rule__DomainModel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__9"


    // $ANTLR start "rule__DomainModel__Group__9__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2104:1: rule__DomainModel__Group__9__Impl : ( ( rule__DomainModel__RelationshipsAssignment_9 )* ) ;
    public final void rule__DomainModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2108:1: ( ( ( rule__DomainModel__RelationshipsAssignment_9 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2109:1: ( ( rule__DomainModel__RelationshipsAssignment_9 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2109:1: ( ( rule__DomainModel__RelationshipsAssignment_9 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2110:1: ( rule__DomainModel__RelationshipsAssignment_9 )*
            {
             before(grammarAccess.getDomainModelAccess().getRelationshipsAssignment_9()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2111:1: ( rule__DomainModel__RelationshipsAssignment_9 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2111:2: rule__DomainModel__RelationshipsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__RelationshipsAssignment_9_in_rule__DomainModel__Group__9__Impl4289);
            	    rule__DomainModel__RelationshipsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getRelationshipsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__9__Impl"


    // $ANTLR start "rule__DomainModel__Group__10"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2121:1: rule__DomainModel__Group__10 : rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11 ;
    public final void rule__DomainModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2125:1: ( rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2126:2: rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__10__Impl_in_rule__DomainModel__Group__104320);
            rule__DomainModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__11_in_rule__DomainModel__Group__104323);
            rule__DomainModel__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__10"


    // $ANTLR start "rule__DomainModel__Group__10__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2133:1: rule__DomainModel__Group__10__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2137:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2138:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2138:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2139:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__DomainModel__Group__10__Impl4351); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__10__Impl"


    // $ANTLR start "rule__DomainModel__Group__11"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2152:1: rule__DomainModel__Group__11 : rule__DomainModel__Group__11__Impl ;
    public final void rule__DomainModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2156:1: ( rule__DomainModel__Group__11__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2157:2: rule__DomainModel__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__11__Impl_in_rule__DomainModel__Group__114382);
            rule__DomainModel__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__11"


    // $ANTLR start "rule__DomainModel__Group__11__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2163:1: rule__DomainModel__Group__11__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2167:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2168:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2168:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2169:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__DomainModel__Group__11__Impl4410); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__11__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2206:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2210:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2211:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04465);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04468);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2218:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2222:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2223:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2223:1: ( ( rule__Entity__NameAssignment_0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2224:1: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2225:1: ( rule__Entity__NameAssignment_0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2225:2: rule__Entity__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl4495);
            rule__Entity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2235:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2239:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2240:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14525);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14528);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2247:1: rule__Entity__Group__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2251:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2252:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2252:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2253:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__1__Impl4556); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2266:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2270:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2271:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24587);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24590);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2278:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__AttributesAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2282:1: ( ( ( rule__Entity__AttributesAssignment_2 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2283:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2283:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2284:1: ( rule__Entity__AttributesAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2285:1: ( rule__Entity__AttributesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=28 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2285:2: rule__Entity__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_2_in_rule__Entity__Group__2__Impl4617);
            	    rule__Entity__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2295:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2299:1: ( rule__Entity__Group__3__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2300:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34648);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2306:1: rule__Entity__Group__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2310:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2311:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2311:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2312:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__3__Impl4676); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__StringAttribute__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2333:1: rule__StringAttribute__Group__0 : rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 ;
    public final void rule__StringAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2337:1: ( rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2338:2: rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__StringAttribute__Group__0__Impl_in_rule__StringAttribute__Group__04715);
            rule__StringAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringAttribute__Group__1_in_rule__StringAttribute__Group__04718);
            rule__StringAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__0"


    // $ANTLR start "rule__StringAttribute__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2345:1: rule__StringAttribute__Group__0__Impl : ( 'STRING' ) ;
    public final void rule__StringAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2349:1: ( ( 'STRING' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2350:1: ( 'STRING' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2350:1: ( 'STRING' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2351:1: 'STRING'
            {
             before(grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__StringAttribute__Group__0__Impl4746); 
             after(grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__0__Impl"


    // $ANTLR start "rule__StringAttribute__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2364:1: rule__StringAttribute__Group__1 : rule__StringAttribute__Group__1__Impl ;
    public final void rule__StringAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2368:1: ( rule__StringAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2369:2: rule__StringAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringAttribute__Group__1__Impl_in_rule__StringAttribute__Group__14777);
            rule__StringAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__1"


    // $ANTLR start "rule__StringAttribute__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2375:1: rule__StringAttribute__Group__1__Impl : ( ( rule__StringAttribute__NameAssignment_1 ) ) ;
    public final void rule__StringAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2379:1: ( ( ( rule__StringAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2380:1: ( ( rule__StringAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2380:1: ( ( rule__StringAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2381:1: ( rule__StringAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getStringAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2382:1: ( rule__StringAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2382:2: rule__StringAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringAttribute__NameAssignment_1_in_rule__StringAttribute__Group__1__Impl4804);
            rule__StringAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__Group__1__Impl"


    // $ANTLR start "rule__NumberAttribute__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2396:1: rule__NumberAttribute__Group__0 : rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1 ;
    public final void rule__NumberAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2400:1: ( rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2401:2: rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__NumberAttribute__Group__0__Impl_in_rule__NumberAttribute__Group__04838);
            rule__NumberAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberAttribute__Group__1_in_rule__NumberAttribute__Group__04841);
            rule__NumberAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAttribute__Group__0"


    // $ANTLR start "rule__NumberAttribute__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2408:1: rule__NumberAttribute__Group__0__Impl : ( 'NUMBER' ) ;
    public final void rule__NumberAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2412:1: ( ( 'NUMBER' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2413:1: ( 'NUMBER' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2413:1: ( 'NUMBER' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2414:1: 'NUMBER'
            {
             before(grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__NumberAttribute__Group__0__Impl4869); 
             after(grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAttribute__Group__0__Impl"


    // $ANTLR start "rule__NumberAttribute__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2427:1: rule__NumberAttribute__Group__1 : rule__NumberAttribute__Group__1__Impl ;
    public final void rule__NumberAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2431:1: ( rule__NumberAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2432:2: rule__NumberAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberAttribute__Group__1__Impl_in_rule__NumberAttribute__Group__14900);
            rule__NumberAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAttribute__Group__1"


    // $ANTLR start "rule__NumberAttribute__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2438:1: rule__NumberAttribute__Group__1__Impl : ( ( rule__NumberAttribute__NameAssignment_1 ) ) ;
    public final void rule__NumberAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2442:1: ( ( ( rule__NumberAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2443:1: ( ( rule__NumberAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2443:1: ( ( rule__NumberAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2444:1: ( rule__NumberAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getNumberAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2445:1: ( rule__NumberAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2445:2: rule__NumberAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberAttribute__NameAssignment_1_in_rule__NumberAttribute__Group__1__Impl4927);
            rule__NumberAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAttribute__Group__1__Impl"


    // $ANTLR start "rule__ImageAttribute__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2459:1: rule__ImageAttribute__Group__0 : rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1 ;
    public final void rule__ImageAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2463:1: ( rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2464:2: rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ImageAttribute__Group__0__Impl_in_rule__ImageAttribute__Group__04961);
            rule__ImageAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageAttribute__Group__1_in_rule__ImageAttribute__Group__04964);
            rule__ImageAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageAttribute__Group__0"


    // $ANTLR start "rule__ImageAttribute__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2471:1: rule__ImageAttribute__Group__0__Impl : ( 'IMAGE' ) ;
    public final void rule__ImageAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2475:1: ( ( 'IMAGE' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2476:1: ( 'IMAGE' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2476:1: ( 'IMAGE' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2477:1: 'IMAGE'
            {
             before(grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ImageAttribute__Group__0__Impl4992); 
             after(grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageAttribute__Group__0__Impl"


    // $ANTLR start "rule__ImageAttribute__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2490:1: rule__ImageAttribute__Group__1 : rule__ImageAttribute__Group__1__Impl ;
    public final void rule__ImageAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2494:1: ( rule__ImageAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2495:2: rule__ImageAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageAttribute__Group__1__Impl_in_rule__ImageAttribute__Group__15023);
            rule__ImageAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageAttribute__Group__1"


    // $ANTLR start "rule__ImageAttribute__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2501:1: rule__ImageAttribute__Group__1__Impl : ( ( rule__ImageAttribute__NameAssignment_1 ) ) ;
    public final void rule__ImageAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2505:1: ( ( ( rule__ImageAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2506:1: ( ( rule__ImageAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2506:1: ( ( rule__ImageAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2507:1: ( rule__ImageAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getImageAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2508:1: ( rule__ImageAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2508:2: rule__ImageAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ImageAttribute__NameAssignment_1_in_rule__ImageAttribute__Group__1__Impl5050);
            rule__ImageAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageAttribute__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2522:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2526:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2527:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05084);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05087);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2534:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2538:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2539:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2539:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2540:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5114); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2551:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2555:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2556:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15143);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2562:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2566:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2567:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2567:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2568:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2569:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2569:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5170);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2583:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2587:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2588:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05205);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05208);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2595:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2599:1: ( ( '.' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2600:1: ( '.' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2600:1: ( '.' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2601:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl5236); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2614:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2618:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2619:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15267);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2625:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2629:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2630:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2630:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2631:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5294); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2646:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2650:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2651:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__05327);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__05330);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2658:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__NameAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2662:1: ( ( ( rule__Relationship__NameAssignment_0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2663:1: ( ( rule__Relationship__NameAssignment_0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2663:1: ( ( rule__Relationship__NameAssignment_0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2664:1: ( rule__Relationship__NameAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2665:1: ( rule__Relationship__NameAssignment_0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2665:2: rule__Relationship__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__NameAssignment_0_in_rule__Relationship__Group__0__Impl5357);
            rule__Relationship__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2675:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2679:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2680:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15387);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15390);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2687:1: rule__Relationship__Group__1__Impl : ( '->' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2691:1: ( ( '->' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2692:1: ( '->' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2692:1: ( '->' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2693:1: '->'
            {
             before(grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Relationship__Group__1__Impl5418); 
             after(grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2706:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2710:1: ( rule__Relationship__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2711:2: rule__Relationship__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25449);
            rule__Relationship__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2717:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__RefNameAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2721:1: ( ( ( rule__Relationship__RefNameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2722:1: ( ( rule__Relationship__RefNameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2722:1: ( ( rule__Relationship__RefNameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2723:1: ( rule__Relationship__RefNameAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2724:1: ( rule__Relationship__RefNameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2724:2: rule__Relationship__RefNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__RefNameAssignment_2_in_rule__Relationship__Group__2__Impl5476);
            rule__Relationship__RefNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getRefNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Gui__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2740:1: rule__Gui__Group__0 : rule__Gui__Group__0__Impl rule__Gui__Group__1 ;
    public final void rule__Gui__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2744:1: ( rule__Gui__Group__0__Impl rule__Gui__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2745:2: rule__Gui__Group__0__Impl rule__Gui__Group__1
            {
            pushFollow(FOLLOW_rule__Gui__Group__0__Impl_in_rule__Gui__Group__05512);
            rule__Gui__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__1_in_rule__Gui__Group__05515);
            rule__Gui__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__0"


    // $ANTLR start "rule__Gui__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2752:1: rule__Gui__Group__0__Impl : ( 'GUI' ) ;
    public final void rule__Gui__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2756:1: ( ( 'GUI' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2757:1: ( 'GUI' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2757:1: ( 'GUI' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2758:1: 'GUI'
            {
             before(grammarAccess.getGuiAccess().getGUIKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Gui__Group__0__Impl5543); 
             after(grammarAccess.getGuiAccess().getGUIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__0__Impl"


    // $ANTLR start "rule__Gui__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2771:1: rule__Gui__Group__1 : rule__Gui__Group__1__Impl rule__Gui__Group__2 ;
    public final void rule__Gui__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2775:1: ( rule__Gui__Group__1__Impl rule__Gui__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2776:2: rule__Gui__Group__1__Impl rule__Gui__Group__2
            {
            pushFollow(FOLLOW_rule__Gui__Group__1__Impl_in_rule__Gui__Group__15574);
            rule__Gui__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__2_in_rule__Gui__Group__15577);
            rule__Gui__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__1"


    // $ANTLR start "rule__Gui__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2783:1: rule__Gui__Group__1__Impl : ( ( rule__Gui__NameAssignment_1 ) ) ;
    public final void rule__Gui__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2787:1: ( ( ( rule__Gui__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2788:1: ( ( rule__Gui__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2788:1: ( ( rule__Gui__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2789:1: ( rule__Gui__NameAssignment_1 )
            {
             before(grammarAccess.getGuiAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2790:1: ( rule__Gui__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2790:2: rule__Gui__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Gui__NameAssignment_1_in_rule__Gui__Group__1__Impl5604);
            rule__Gui__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__1__Impl"


    // $ANTLR start "rule__Gui__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2800:1: rule__Gui__Group__2 : rule__Gui__Group__2__Impl rule__Gui__Group__3 ;
    public final void rule__Gui__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2804:1: ( rule__Gui__Group__2__Impl rule__Gui__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2805:2: rule__Gui__Group__2__Impl rule__Gui__Group__3
            {
            pushFollow(FOLLOW_rule__Gui__Group__2__Impl_in_rule__Gui__Group__25634);
            rule__Gui__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__3_in_rule__Gui__Group__25637);
            rule__Gui__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__2"


    // $ANTLR start "rule__Gui__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2812:1: rule__Gui__Group__2__Impl : ( 'SERVER' ) ;
    public final void rule__Gui__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2816:1: ( ( 'SERVER' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2817:1: ( 'SERVER' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2817:1: ( 'SERVER' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2818:1: 'SERVER'
            {
             before(grammarAccess.getGuiAccess().getSERVERKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Gui__Group__2__Impl5665); 
             after(grammarAccess.getGuiAccess().getSERVERKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__2__Impl"


    // $ANTLR start "rule__Gui__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2831:1: rule__Gui__Group__3 : rule__Gui__Group__3__Impl rule__Gui__Group__4 ;
    public final void rule__Gui__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2835:1: ( rule__Gui__Group__3__Impl rule__Gui__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2836:2: rule__Gui__Group__3__Impl rule__Gui__Group__4
            {
            pushFollow(FOLLOW_rule__Gui__Group__3__Impl_in_rule__Gui__Group__35696);
            rule__Gui__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__4_in_rule__Gui__Group__35699);
            rule__Gui__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__3"


    // $ANTLR start "rule__Gui__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2843:1: rule__Gui__Group__3__Impl : ( ( rule__Gui__ServerAssignment_3 ) ) ;
    public final void rule__Gui__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2847:1: ( ( ( rule__Gui__ServerAssignment_3 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2848:1: ( ( rule__Gui__ServerAssignment_3 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2848:1: ( ( rule__Gui__ServerAssignment_3 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2849:1: ( rule__Gui__ServerAssignment_3 )
            {
             before(grammarAccess.getGuiAccess().getServerAssignment_3()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2850:1: ( rule__Gui__ServerAssignment_3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2850:2: rule__Gui__ServerAssignment_3
            {
            pushFollow(FOLLOW_rule__Gui__ServerAssignment_3_in_rule__Gui__Group__3__Impl5726);
            rule__Gui__ServerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getServerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__3__Impl"


    // $ANTLR start "rule__Gui__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2860:1: rule__Gui__Group__4 : rule__Gui__Group__4__Impl rule__Gui__Group__5 ;
    public final void rule__Gui__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2864:1: ( rule__Gui__Group__4__Impl rule__Gui__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2865:2: rule__Gui__Group__4__Impl rule__Gui__Group__5
            {
            pushFollow(FOLLOW_rule__Gui__Group__4__Impl_in_rule__Gui__Group__45756);
            rule__Gui__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__5_in_rule__Gui__Group__45759);
            rule__Gui__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__4"


    // $ANTLR start "rule__Gui__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2872:1: rule__Gui__Group__4__Impl : ( 'LAYOUT' ) ;
    public final void rule__Gui__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2876:1: ( ( 'LAYOUT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2877:1: ( 'LAYOUT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2877:1: ( 'LAYOUT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2878:1: 'LAYOUT'
            {
             before(grammarAccess.getGuiAccess().getLAYOUTKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__Gui__Group__4__Impl5787); 
             after(grammarAccess.getGuiAccess().getLAYOUTKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__4__Impl"


    // $ANTLR start "rule__Gui__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2891:1: rule__Gui__Group__5 : rule__Gui__Group__5__Impl rule__Gui__Group__6 ;
    public final void rule__Gui__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2895:1: ( rule__Gui__Group__5__Impl rule__Gui__Group__6 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2896:2: rule__Gui__Group__5__Impl rule__Gui__Group__6
            {
            pushFollow(FOLLOW_rule__Gui__Group__5__Impl_in_rule__Gui__Group__55818);
            rule__Gui__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__6_in_rule__Gui__Group__55821);
            rule__Gui__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__5"


    // $ANTLR start "rule__Gui__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2903:1: rule__Gui__Group__5__Impl : ( ( rule__Gui__LayoutAssignment_5 ) ) ;
    public final void rule__Gui__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2907:1: ( ( ( rule__Gui__LayoutAssignment_5 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2908:1: ( ( rule__Gui__LayoutAssignment_5 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2908:1: ( ( rule__Gui__LayoutAssignment_5 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2909:1: ( rule__Gui__LayoutAssignment_5 )
            {
             before(grammarAccess.getGuiAccess().getLayoutAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2910:1: ( rule__Gui__LayoutAssignment_5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2910:2: rule__Gui__LayoutAssignment_5
            {
            pushFollow(FOLLOW_rule__Gui__LayoutAssignment_5_in_rule__Gui__Group__5__Impl5848);
            rule__Gui__LayoutAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGuiAccess().getLayoutAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__5__Impl"


    // $ANTLR start "rule__Gui__Group__6"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2920:1: rule__Gui__Group__6 : rule__Gui__Group__6__Impl rule__Gui__Group__7 ;
    public final void rule__Gui__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2924:1: ( rule__Gui__Group__6__Impl rule__Gui__Group__7 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2925:2: rule__Gui__Group__6__Impl rule__Gui__Group__7
            {
            pushFollow(FOLLOW_rule__Gui__Group__6__Impl_in_rule__Gui__Group__65878);
            rule__Gui__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__7_in_rule__Gui__Group__65881);
            rule__Gui__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__6"


    // $ANTLR start "rule__Gui__Group__6__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2932:1: rule__Gui__Group__6__Impl : ( '{' ) ;
    public final void rule__Gui__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2936:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2937:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2937:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2938:1: '{'
            {
             before(grammarAccess.getGuiAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Gui__Group__6__Impl5909); 
             after(grammarAccess.getGuiAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__6__Impl"


    // $ANTLR start "rule__Gui__Group__7"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2951:1: rule__Gui__Group__7 : rule__Gui__Group__7__Impl rule__Gui__Group__8 ;
    public final void rule__Gui__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2955:1: ( rule__Gui__Group__7__Impl rule__Gui__Group__8 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2956:2: rule__Gui__Group__7__Impl rule__Gui__Group__8
            {
            pushFollow(FOLLOW_rule__Gui__Group__7__Impl_in_rule__Gui__Group__75940);
            rule__Gui__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gui__Group__8_in_rule__Gui__Group__75943);
            rule__Gui__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__7"


    // $ANTLR start "rule__Gui__Group__7__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2963:1: rule__Gui__Group__7__Impl : ( ( rule__Gui__GuiFeaturesAssignment_7 )* ) ;
    public final void rule__Gui__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2967:1: ( ( ( rule__Gui__GuiFeaturesAssignment_7 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2968:1: ( ( rule__Gui__GuiFeaturesAssignment_7 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2968:1: ( ( rule__Gui__GuiFeaturesAssignment_7 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2969:1: ( rule__Gui__GuiFeaturesAssignment_7 )*
            {
             before(grammarAccess.getGuiAccess().getGuiFeaturesAssignment_7()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2970:1: ( rule__Gui__GuiFeaturesAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35||LA12_0==38||LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2970:2: rule__Gui__GuiFeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Gui__GuiFeaturesAssignment_7_in_rule__Gui__Group__7__Impl5970);
            	    rule__Gui__GuiFeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGuiAccess().getGuiFeaturesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__7__Impl"


    // $ANTLR start "rule__Gui__Group__8"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2980:1: rule__Gui__Group__8 : rule__Gui__Group__8__Impl ;
    public final void rule__Gui__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2984:1: ( rule__Gui__Group__8__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2985:2: rule__Gui__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Gui__Group__8__Impl_in_rule__Gui__Group__86001);
            rule__Gui__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__8"


    // $ANTLR start "rule__Gui__Group__8__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2991:1: rule__Gui__Group__8__Impl : ( '}' ) ;
    public final void rule__Gui__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2995:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2996:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2996:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2997:1: '}'
            {
             before(grammarAccess.getGuiAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Gui__Group__8__Impl6029); 
             after(grammarAccess.getGuiAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__Group__8__Impl"


    // $ANTLR start "rule__GuiLabel__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3028:1: rule__GuiLabel__Group__0 : rule__GuiLabel__Group__0__Impl rule__GuiLabel__Group__1 ;
    public final void rule__GuiLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3032:1: ( rule__GuiLabel__Group__0__Impl rule__GuiLabel__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3033:2: rule__GuiLabel__Group__0__Impl rule__GuiLabel__Group__1
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__0__Impl_in_rule__GuiLabel__Group__06078);
            rule__GuiLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiLabel__Group__1_in_rule__GuiLabel__Group__06081);
            rule__GuiLabel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__0"


    // $ANTLR start "rule__GuiLabel__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3040:1: rule__GuiLabel__Group__0__Impl : ( 'LABEL' ) ;
    public final void rule__GuiLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3044:1: ( ( 'LABEL' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3045:1: ( 'LABEL' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3045:1: ( 'LABEL' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3046:1: 'LABEL'
            {
             before(grammarAccess.getGuiLabelAccess().getLABELKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__GuiLabel__Group__0__Impl6109); 
             after(grammarAccess.getGuiLabelAccess().getLABELKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__0__Impl"


    // $ANTLR start "rule__GuiLabel__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3059:1: rule__GuiLabel__Group__1 : rule__GuiLabel__Group__1__Impl rule__GuiLabel__Group__2 ;
    public final void rule__GuiLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3063:1: ( rule__GuiLabel__Group__1__Impl rule__GuiLabel__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3064:2: rule__GuiLabel__Group__1__Impl rule__GuiLabel__Group__2
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__1__Impl_in_rule__GuiLabel__Group__16140);
            rule__GuiLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiLabel__Group__2_in_rule__GuiLabel__Group__16143);
            rule__GuiLabel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__1"


    // $ANTLR start "rule__GuiLabel__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3071:1: rule__GuiLabel__Group__1__Impl : ( ( rule__GuiLabel__NameAssignment_1 ) ) ;
    public final void rule__GuiLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3075:1: ( ( ( rule__GuiLabel__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3076:1: ( ( rule__GuiLabel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3076:1: ( ( rule__GuiLabel__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3077:1: ( rule__GuiLabel__NameAssignment_1 )
            {
             before(grammarAccess.getGuiLabelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3078:1: ( rule__GuiLabel__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3078:2: rule__GuiLabel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuiLabel__NameAssignment_1_in_rule__GuiLabel__Group__1__Impl6170);
            rule__GuiLabel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuiLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__1__Impl"


    // $ANTLR start "rule__GuiLabel__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3088:1: rule__GuiLabel__Group__2 : rule__GuiLabel__Group__2__Impl rule__GuiLabel__Group__3 ;
    public final void rule__GuiLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3092:1: ( rule__GuiLabel__Group__2__Impl rule__GuiLabel__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3093:2: rule__GuiLabel__Group__2__Impl rule__GuiLabel__Group__3
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__2__Impl_in_rule__GuiLabel__Group__26200);
            rule__GuiLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiLabel__Group__3_in_rule__GuiLabel__Group__26203);
            rule__GuiLabel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__2"


    // $ANTLR start "rule__GuiLabel__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3100:1: rule__GuiLabel__Group__2__Impl : ( 'TEXT' ) ;
    public final void rule__GuiLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3104:1: ( ( 'TEXT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3105:1: ( 'TEXT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3105:1: ( 'TEXT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3106:1: 'TEXT'
            {
             before(grammarAccess.getGuiLabelAccess().getTEXTKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__GuiLabel__Group__2__Impl6231); 
             after(grammarAccess.getGuiLabelAccess().getTEXTKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__2__Impl"


    // $ANTLR start "rule__GuiLabel__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3119:1: rule__GuiLabel__Group__3 : rule__GuiLabel__Group__3__Impl rule__GuiLabel__Group__4 ;
    public final void rule__GuiLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3123:1: ( rule__GuiLabel__Group__3__Impl rule__GuiLabel__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3124:2: rule__GuiLabel__Group__3__Impl rule__GuiLabel__Group__4
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__3__Impl_in_rule__GuiLabel__Group__36262);
            rule__GuiLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiLabel__Group__4_in_rule__GuiLabel__Group__36265);
            rule__GuiLabel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__3"


    // $ANTLR start "rule__GuiLabel__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3131:1: rule__GuiLabel__Group__3__Impl : ( ( rule__GuiLabel__TextAssignment_3 ) ) ;
    public final void rule__GuiLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3135:1: ( ( ( rule__GuiLabel__TextAssignment_3 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3136:1: ( ( rule__GuiLabel__TextAssignment_3 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3136:1: ( ( rule__GuiLabel__TextAssignment_3 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3137:1: ( rule__GuiLabel__TextAssignment_3 )
            {
             before(grammarAccess.getGuiLabelAccess().getTextAssignment_3()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3138:1: ( rule__GuiLabel__TextAssignment_3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3138:2: rule__GuiLabel__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__GuiLabel__TextAssignment_3_in_rule__GuiLabel__Group__3__Impl6292);
            rule__GuiLabel__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuiLabelAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__3__Impl"


    // $ANTLR start "rule__GuiLabel__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3148:1: rule__GuiLabel__Group__4 : rule__GuiLabel__Group__4__Impl rule__GuiLabel__Group__5 ;
    public final void rule__GuiLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3152:1: ( rule__GuiLabel__Group__4__Impl rule__GuiLabel__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3153:2: rule__GuiLabel__Group__4__Impl rule__GuiLabel__Group__5
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__4__Impl_in_rule__GuiLabel__Group__46322);
            rule__GuiLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiLabel__Group__5_in_rule__GuiLabel__Group__46325);
            rule__GuiLabel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__4"


    // $ANTLR start "rule__GuiLabel__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3160:1: rule__GuiLabel__Group__4__Impl : ( 'DATA' ) ;
    public final void rule__GuiLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3164:1: ( ( 'DATA' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3165:1: ( 'DATA' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3165:1: ( 'DATA' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3166:1: 'DATA'
            {
             before(grammarAccess.getGuiLabelAccess().getDATAKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__GuiLabel__Group__4__Impl6353); 
             after(grammarAccess.getGuiLabelAccess().getDATAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__4__Impl"


    // $ANTLR start "rule__GuiLabel__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3179:1: rule__GuiLabel__Group__5 : rule__GuiLabel__Group__5__Impl ;
    public final void rule__GuiLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3183:1: ( rule__GuiLabel__Group__5__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3184:2: rule__GuiLabel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GuiLabel__Group__5__Impl_in_rule__GuiLabel__Group__56384);
            rule__GuiLabel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__5"


    // $ANTLR start "rule__GuiLabel__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3190:1: rule__GuiLabel__Group__5__Impl : ( ( rule__GuiLabel__ElementAssignment_5 ) ) ;
    public final void rule__GuiLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3194:1: ( ( ( rule__GuiLabel__ElementAssignment_5 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3195:1: ( ( rule__GuiLabel__ElementAssignment_5 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3195:1: ( ( rule__GuiLabel__ElementAssignment_5 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3196:1: ( rule__GuiLabel__ElementAssignment_5 )
            {
             before(grammarAccess.getGuiLabelAccess().getElementAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3197:1: ( rule__GuiLabel__ElementAssignment_5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3197:2: rule__GuiLabel__ElementAssignment_5
            {
            pushFollow(FOLLOW_rule__GuiLabel__ElementAssignment_5_in_rule__GuiLabel__Group__5__Impl6411);
            rule__GuiLabel__ElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGuiLabelAccess().getElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__Group__5__Impl"


    // $ANTLR start "rule__GuiButton__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3219:1: rule__GuiButton__Group__0 : rule__GuiButton__Group__0__Impl rule__GuiButton__Group__1 ;
    public final void rule__GuiButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3223:1: ( rule__GuiButton__Group__0__Impl rule__GuiButton__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3224:2: rule__GuiButton__Group__0__Impl rule__GuiButton__Group__1
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__0__Impl_in_rule__GuiButton__Group__06453);
            rule__GuiButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiButton__Group__1_in_rule__GuiButton__Group__06456);
            rule__GuiButton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__0"


    // $ANTLR start "rule__GuiButton__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3231:1: rule__GuiButton__Group__0__Impl : ( 'BUTTON' ) ;
    public final void rule__GuiButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3235:1: ( ( 'BUTTON' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3236:1: ( 'BUTTON' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3236:1: ( 'BUTTON' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3237:1: 'BUTTON'
            {
             before(grammarAccess.getGuiButtonAccess().getBUTTONKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__GuiButton__Group__0__Impl6484); 
             after(grammarAccess.getGuiButtonAccess().getBUTTONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__0__Impl"


    // $ANTLR start "rule__GuiButton__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3250:1: rule__GuiButton__Group__1 : rule__GuiButton__Group__1__Impl rule__GuiButton__Group__2 ;
    public final void rule__GuiButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3254:1: ( rule__GuiButton__Group__1__Impl rule__GuiButton__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3255:2: rule__GuiButton__Group__1__Impl rule__GuiButton__Group__2
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__1__Impl_in_rule__GuiButton__Group__16515);
            rule__GuiButton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiButton__Group__2_in_rule__GuiButton__Group__16518);
            rule__GuiButton__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__1"


    // $ANTLR start "rule__GuiButton__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3262:1: rule__GuiButton__Group__1__Impl : ( ( rule__GuiButton__NameAssignment_1 ) ) ;
    public final void rule__GuiButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3266:1: ( ( ( rule__GuiButton__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3267:1: ( ( rule__GuiButton__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3267:1: ( ( rule__GuiButton__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3268:1: ( rule__GuiButton__NameAssignment_1 )
            {
             before(grammarAccess.getGuiButtonAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3269:1: ( rule__GuiButton__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3269:2: rule__GuiButton__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuiButton__NameAssignment_1_in_rule__GuiButton__Group__1__Impl6545);
            rule__GuiButton__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuiButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__1__Impl"


    // $ANTLR start "rule__GuiButton__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3279:1: rule__GuiButton__Group__2 : rule__GuiButton__Group__2__Impl rule__GuiButton__Group__3 ;
    public final void rule__GuiButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3283:1: ( rule__GuiButton__Group__2__Impl rule__GuiButton__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3284:2: rule__GuiButton__Group__2__Impl rule__GuiButton__Group__3
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__2__Impl_in_rule__GuiButton__Group__26575);
            rule__GuiButton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiButton__Group__3_in_rule__GuiButton__Group__26578);
            rule__GuiButton__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__2"


    // $ANTLR start "rule__GuiButton__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3291:1: rule__GuiButton__Group__2__Impl : ( 'TEXT' ) ;
    public final void rule__GuiButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3295:1: ( ( 'TEXT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3296:1: ( 'TEXT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3296:1: ( 'TEXT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3297:1: 'TEXT'
            {
             before(grammarAccess.getGuiButtonAccess().getTEXTKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__GuiButton__Group__2__Impl6606); 
             after(grammarAccess.getGuiButtonAccess().getTEXTKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__2__Impl"


    // $ANTLR start "rule__GuiButton__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3310:1: rule__GuiButton__Group__3 : rule__GuiButton__Group__3__Impl rule__GuiButton__Group__4 ;
    public final void rule__GuiButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3314:1: ( rule__GuiButton__Group__3__Impl rule__GuiButton__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3315:2: rule__GuiButton__Group__3__Impl rule__GuiButton__Group__4
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__3__Impl_in_rule__GuiButton__Group__36637);
            rule__GuiButton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiButton__Group__4_in_rule__GuiButton__Group__36640);
            rule__GuiButton__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__3"


    // $ANTLR start "rule__GuiButton__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3322:1: rule__GuiButton__Group__3__Impl : ( ( rule__GuiButton__TextAssignment_3 ) ) ;
    public final void rule__GuiButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3326:1: ( ( ( rule__GuiButton__TextAssignment_3 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3327:1: ( ( rule__GuiButton__TextAssignment_3 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3327:1: ( ( rule__GuiButton__TextAssignment_3 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3328:1: ( rule__GuiButton__TextAssignment_3 )
            {
             before(grammarAccess.getGuiButtonAccess().getTextAssignment_3()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3329:1: ( rule__GuiButton__TextAssignment_3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3329:2: rule__GuiButton__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__GuiButton__TextAssignment_3_in_rule__GuiButton__Group__3__Impl6667);
            rule__GuiButton__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuiButtonAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__3__Impl"


    // $ANTLR start "rule__GuiButton__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3339:1: rule__GuiButton__Group__4 : rule__GuiButton__Group__4__Impl rule__GuiButton__Group__5 ;
    public final void rule__GuiButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3343:1: ( rule__GuiButton__Group__4__Impl rule__GuiButton__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3344:2: rule__GuiButton__Group__4__Impl rule__GuiButton__Group__5
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__4__Impl_in_rule__GuiButton__Group__46697);
            rule__GuiButton__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiButton__Group__5_in_rule__GuiButton__Group__46700);
            rule__GuiButton__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__4"


    // $ANTLR start "rule__GuiButton__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3351:1: rule__GuiButton__Group__4__Impl : ( 'FUNCTION' ) ;
    public final void rule__GuiButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3355:1: ( ( 'FUNCTION' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3356:1: ( 'FUNCTION' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3356:1: ( 'FUNCTION' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3357:1: 'FUNCTION'
            {
             before(grammarAccess.getGuiButtonAccess().getFUNCTIONKeyword_4()); 
            match(input,39,FOLLOW_39_in_rule__GuiButton__Group__4__Impl6728); 
             after(grammarAccess.getGuiButtonAccess().getFUNCTIONKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__4__Impl"


    // $ANTLR start "rule__GuiButton__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3370:1: rule__GuiButton__Group__5 : rule__GuiButton__Group__5__Impl ;
    public final void rule__GuiButton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3374:1: ( rule__GuiButton__Group__5__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3375:2: rule__GuiButton__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GuiButton__Group__5__Impl_in_rule__GuiButton__Group__56759);
            rule__GuiButton__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__5"


    // $ANTLR start "rule__GuiButton__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3381:1: rule__GuiButton__Group__5__Impl : ( ( rule__GuiButton__FuncAssignment_5 ) ) ;
    public final void rule__GuiButton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3385:1: ( ( ( rule__GuiButton__FuncAssignment_5 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3386:1: ( ( rule__GuiButton__FuncAssignment_5 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3386:1: ( ( rule__GuiButton__FuncAssignment_5 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3387:1: ( rule__GuiButton__FuncAssignment_5 )
            {
             before(grammarAccess.getGuiButtonAccess().getFuncAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3388:1: ( rule__GuiButton__FuncAssignment_5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3388:2: rule__GuiButton__FuncAssignment_5
            {
            pushFollow(FOLLOW_rule__GuiButton__FuncAssignment_5_in_rule__GuiButton__Group__5__Impl6786);
            rule__GuiButton__FuncAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGuiButtonAccess().getFuncAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__Group__5__Impl"


    // $ANTLR start "rule__GuiInput__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3410:1: rule__GuiInput__Group__0 : rule__GuiInput__Group__0__Impl rule__GuiInput__Group__1 ;
    public final void rule__GuiInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3414:1: ( rule__GuiInput__Group__0__Impl rule__GuiInput__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3415:2: rule__GuiInput__Group__0__Impl rule__GuiInput__Group__1
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__0__Impl_in_rule__GuiInput__Group__06828);
            rule__GuiInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiInput__Group__1_in_rule__GuiInput__Group__06831);
            rule__GuiInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__0"


    // $ANTLR start "rule__GuiInput__Group__0__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3422:1: rule__GuiInput__Group__0__Impl : ( 'INPUT' ) ;
    public final void rule__GuiInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3426:1: ( ( 'INPUT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3427:1: ( 'INPUT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3427:1: ( 'INPUT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3428:1: 'INPUT'
            {
             before(grammarAccess.getGuiInputAccess().getINPUTKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__GuiInput__Group__0__Impl6859); 
             after(grammarAccess.getGuiInputAccess().getINPUTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__0__Impl"


    // $ANTLR start "rule__GuiInput__Group__1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3441:1: rule__GuiInput__Group__1 : rule__GuiInput__Group__1__Impl rule__GuiInput__Group__2 ;
    public final void rule__GuiInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3445:1: ( rule__GuiInput__Group__1__Impl rule__GuiInput__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3446:2: rule__GuiInput__Group__1__Impl rule__GuiInput__Group__2
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__1__Impl_in_rule__GuiInput__Group__16890);
            rule__GuiInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiInput__Group__2_in_rule__GuiInput__Group__16893);
            rule__GuiInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__1"


    // $ANTLR start "rule__GuiInput__Group__1__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3453:1: rule__GuiInput__Group__1__Impl : ( ( rule__GuiInput__NameAssignment_1 ) ) ;
    public final void rule__GuiInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3457:1: ( ( ( rule__GuiInput__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3458:1: ( ( rule__GuiInput__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3458:1: ( ( rule__GuiInput__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3459:1: ( rule__GuiInput__NameAssignment_1 )
            {
             before(grammarAccess.getGuiInputAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3460:1: ( rule__GuiInput__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3460:2: rule__GuiInput__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuiInput__NameAssignment_1_in_rule__GuiInput__Group__1__Impl6920);
            rule__GuiInput__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuiInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__1__Impl"


    // $ANTLR start "rule__GuiInput__Group__2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3470:1: rule__GuiInput__Group__2 : rule__GuiInput__Group__2__Impl rule__GuiInput__Group__3 ;
    public final void rule__GuiInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3474:1: ( rule__GuiInput__Group__2__Impl rule__GuiInput__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3475:2: rule__GuiInput__Group__2__Impl rule__GuiInput__Group__3
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__2__Impl_in_rule__GuiInput__Group__26950);
            rule__GuiInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiInput__Group__3_in_rule__GuiInput__Group__26953);
            rule__GuiInput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__2"


    // $ANTLR start "rule__GuiInput__Group__2__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3482:1: rule__GuiInput__Group__2__Impl : ( 'TYPE' ) ;
    public final void rule__GuiInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3486:1: ( ( 'TYPE' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3487:1: ( 'TYPE' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3487:1: ( 'TYPE' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3488:1: 'TYPE'
            {
             before(grammarAccess.getGuiInputAccess().getTYPEKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__GuiInput__Group__2__Impl6981); 
             after(grammarAccess.getGuiInputAccess().getTYPEKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__2__Impl"


    // $ANTLR start "rule__GuiInput__Group__3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3501:1: rule__GuiInput__Group__3 : rule__GuiInput__Group__3__Impl rule__GuiInput__Group__4 ;
    public final void rule__GuiInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3505:1: ( rule__GuiInput__Group__3__Impl rule__GuiInput__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3506:2: rule__GuiInput__Group__3__Impl rule__GuiInput__Group__4
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__3__Impl_in_rule__GuiInput__Group__37012);
            rule__GuiInput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiInput__Group__4_in_rule__GuiInput__Group__37015);
            rule__GuiInput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__3"


    // $ANTLR start "rule__GuiInput__Group__3__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3513:1: rule__GuiInput__Group__3__Impl : ( '(' ) ;
    public final void rule__GuiInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3517:1: ( ( '(' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3518:1: ( '(' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3518:1: ( '(' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3519:1: '('
            {
             before(grammarAccess.getGuiInputAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__GuiInput__Group__3__Impl7043); 
             after(grammarAccess.getGuiInputAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__3__Impl"


    // $ANTLR start "rule__GuiInput__Group__4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3532:1: rule__GuiInput__Group__4 : rule__GuiInput__Group__4__Impl rule__GuiInput__Group__5 ;
    public final void rule__GuiInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3536:1: ( rule__GuiInput__Group__4__Impl rule__GuiInput__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3537:2: rule__GuiInput__Group__4__Impl rule__GuiInput__Group__5
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__4__Impl_in_rule__GuiInput__Group__47074);
            rule__GuiInput__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuiInput__Group__5_in_rule__GuiInput__Group__47077);
            rule__GuiInput__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__4"


    // $ANTLR start "rule__GuiInput__Group__4__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3544:1: rule__GuiInput__Group__4__Impl : ( ( rule__GuiInput__InputTypeAssignment_4 ) ) ;
    public final void rule__GuiInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3548:1: ( ( ( rule__GuiInput__InputTypeAssignment_4 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3549:1: ( ( rule__GuiInput__InputTypeAssignment_4 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3549:1: ( ( rule__GuiInput__InputTypeAssignment_4 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3550:1: ( rule__GuiInput__InputTypeAssignment_4 )
            {
             before(grammarAccess.getGuiInputAccess().getInputTypeAssignment_4()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3551:1: ( rule__GuiInput__InputTypeAssignment_4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3551:2: rule__GuiInput__InputTypeAssignment_4
            {
            pushFollow(FOLLOW_rule__GuiInput__InputTypeAssignment_4_in_rule__GuiInput__Group__4__Impl7104);
            rule__GuiInput__InputTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGuiInputAccess().getInputTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__4__Impl"


    // $ANTLR start "rule__GuiInput__Group__5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3561:1: rule__GuiInput__Group__5 : rule__GuiInput__Group__5__Impl ;
    public final void rule__GuiInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3565:1: ( rule__GuiInput__Group__5__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3566:2: rule__GuiInput__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GuiInput__Group__5__Impl_in_rule__GuiInput__Group__57134);
            rule__GuiInput__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__5"


    // $ANTLR start "rule__GuiInput__Group__5__Impl"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3572:1: rule__GuiInput__Group__5__Impl : ( ')' ) ;
    public final void rule__GuiInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3576:1: ( ( ')' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3577:1: ( ')' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3577:1: ( ')' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3578:1: ')'
            {
             before(grammarAccess.getGuiInputAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__GuiInput__Group__5__Impl7162); 
             after(grammarAccess.getGuiInputAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__Group__5__Impl"


    // $ANTLR start "rule__Model__TypesAssignment"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3604:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3608:1: ( ( ruleType ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3609:1: ( ruleType )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3609:1: ( ruleType )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3610:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment7210);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment"


    // $ANTLR start "rule__Server__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3619:1: rule__Server__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3623:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3624:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3624:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3625:1: RULE_ID
            {
             before(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Server__NameAssignment_17241); 
             after(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__NameAssignment_1"


    // $ANTLR start "rule__Server__ConfigsAssignment_5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3634:1: rule__Server__ConfigsAssignment_5 : ( ruleConfig ) ;
    public final void rule__Server__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3638:1: ( ( ruleConfig ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3639:1: ( ruleConfig )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3639:1: ( ruleConfig )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3640:1: ruleConfig
            {
             before(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Server__ConfigsAssignment_57272);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__ConfigsAssignment_5"


    // $ANTLR start "rule__RootConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3649:1: rule__RootConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RootConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3653:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3654:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3654:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3655:1: RULE_ID
            {
             before(grammarAccess.getRootConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootConfig__NameAssignment_27303); 
             after(grammarAccess.getRootConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootConfig__NameAssignment_2"


    // $ANTLR start "rule__HostNameConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3664:1: rule__HostNameConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HostNameConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3668:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3669:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3669:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3670:1: RULE_ID
            {
             before(grammarAccess.getHostNameConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HostNameConfig__NameAssignment_27334); 
             after(grammarAccess.getHostNameConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostNameConfig__NameAssignment_2"


    // $ANTLR start "rule__PortConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3679:1: rule__PortConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PortConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3683:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3684:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3684:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3685:1: RULE_ID
            {
             before(grammarAccess.getPortConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PortConfig__NameAssignment_27365); 
             after(grammarAccess.getPortConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortConfig__NameAssignment_2"


    // $ANTLR start "rule__LogConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3694:1: rule__LogConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LogConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3698:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3699:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3699:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3700:1: RULE_ID
            {
             before(grammarAccess.getLogConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LogConfig__NameAssignment_27396); 
             after(grammarAccess.getLogConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogConfig__NameAssignment_2"


    // $ANTLR start "rule__SqldbConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3709:1: rule__SqldbConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SqldbConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3713:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3714:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3714:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3715:1: RULE_ID
            {
             before(grammarAccess.getSqldbConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SqldbConfig__NameAssignment_27427); 
             after(grammarAccess.getSqldbConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqldbConfig__NameAssignment_2"


    // $ANTLR start "rule__ResourceConfig__NameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3724:1: rule__ResourceConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ResourceConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3728:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3729:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3729:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3730:1: RULE_ID
            {
             before(grammarAccess.getResourceConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceConfig__NameAssignment_27458); 
             after(grammarAccess.getResourceConfigAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceConfig__NameAssignment_2"


    // $ANTLR start "rule__DomainModel__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3739:1: rule__DomainModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3743:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3744:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3744:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3745:1: RULE_ID
            {
             before(grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainModel__NameAssignment_17489); 
             after(grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__NameAssignment_1"


    // $ANTLR start "rule__DomainModel__EntitysAssignment_5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3754:1: rule__DomainModel__EntitysAssignment_5 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitysAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3758:1: ( ( ruleEntity ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3759:1: ( ruleEntity )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3759:1: ( ruleEntity )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3760:1: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__DomainModel__EntitysAssignment_57520);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__EntitysAssignment_5"


    // $ANTLR start "rule__DomainModel__RelationshipsAssignment_9"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3769:1: rule__DomainModel__RelationshipsAssignment_9 : ( ruleRelationship ) ;
    public final void rule__DomainModel__RelationshipsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3773:1: ( ( ruleRelationship ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3774:1: ( ruleRelationship )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3774:1: ( ruleRelationship )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3775:1: ruleRelationship
            {
             before(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__DomainModel__RelationshipsAssignment_97551);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__RelationshipsAssignment_9"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3784:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3788:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3789:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3789:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3790:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_07582); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_0"


    // $ANTLR start "rule__Entity__AttributesAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3799:1: rule__Entity__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3803:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3804:1: ( ruleAttribute )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3804:1: ( ruleAttribute )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3805:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_27613);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_2"


    // $ANTLR start "rule__StringAttribute__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3814:1: rule__StringAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3818:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3819:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3819:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3820:1: RULE_ID
            {
             before(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringAttribute__NameAssignment_17644); 
             after(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringAttribute__NameAssignment_1"


    // $ANTLR start "rule__NumberAttribute__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3829:1: rule__NumberAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumberAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3833:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3834:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3834:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3835:1: RULE_ID
            {
             before(grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumberAttribute__NameAssignment_17675); 
             after(grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAttribute__NameAssignment_1"


    // $ANTLR start "rule__ImageAttribute__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3844:1: rule__ImageAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImageAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3848:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3849:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3849:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3850:1: RULE_ID
            {
             before(grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageAttribute__NameAssignment_17706); 
             after(grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageAttribute__NameAssignment_1"


    // $ANTLR start "rule__Relationship__NameAssignment_0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3859:1: rule__Relationship__NameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3863:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3864:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3864:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3865:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3866:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3867:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationshipAccess().getNameAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relationship__NameAssignment_07741);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getNameAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__NameAssignment_0"


    // $ANTLR start "rule__Relationship__RefNameAssignment_2"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3878:1: rule__Relationship__RefNameAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__RefNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3882:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3883:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3883:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3884:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3885:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3886:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAttributeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relationship__RefNameAssignment_27780);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getRefNameAttributeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RefNameAssignment_2"


    // $ANTLR start "rule__Gui__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3897:1: rule__Gui__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Gui__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3901:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3902:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3902:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3903:1: RULE_ID
            {
             before(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Gui__NameAssignment_17815); 
             after(grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__NameAssignment_1"


    // $ANTLR start "rule__Gui__ServerAssignment_3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3912:1: rule__Gui__ServerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Gui__ServerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3916:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3917:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3917:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3918:1: ( RULE_ID )
            {
             before(grammarAccess.getGuiAccess().getServerServerCrossReference_3_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3919:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3920:1: RULE_ID
            {
             before(grammarAccess.getGuiAccess().getServerServerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Gui__ServerAssignment_37850); 
             after(grammarAccess.getGuiAccess().getServerServerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuiAccess().getServerServerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__ServerAssignment_3"


    // $ANTLR start "rule__Gui__LayoutAssignment_5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3931:1: rule__Gui__LayoutAssignment_5 : ( RULE_INT ) ;
    public final void rule__Gui__LayoutAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3935:1: ( ( RULE_INT ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3936:1: ( RULE_INT )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3936:1: ( RULE_INT )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3937:1: RULE_INT
            {
             before(grammarAccess.getGuiAccess().getLayoutINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gui__LayoutAssignment_57885); 
             after(grammarAccess.getGuiAccess().getLayoutINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__LayoutAssignment_5"


    // $ANTLR start "rule__Gui__GuiFeaturesAssignment_7"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3946:1: rule__Gui__GuiFeaturesAssignment_7 : ( ruleGuiFeature ) ;
    public final void rule__Gui__GuiFeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3950:1: ( ( ruleGuiFeature ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3951:1: ( ruleGuiFeature )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3951:1: ( ruleGuiFeature )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3952:1: ruleGuiFeature
            {
             before(grammarAccess.getGuiAccess().getGuiFeaturesGuiFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleGuiFeature_in_rule__Gui__GuiFeaturesAssignment_77916);
            ruleGuiFeature();

            state._fsp--;

             after(grammarAccess.getGuiAccess().getGuiFeaturesGuiFeatureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gui__GuiFeaturesAssignment_7"


    // $ANTLR start "rule__GuiLabel__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3961:1: rule__GuiLabel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuiLabel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3965:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3966:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3966:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3967:1: RULE_ID
            {
             before(grammarAccess.getGuiLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuiLabel__NameAssignment_17947); 
             after(grammarAccess.getGuiLabelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__NameAssignment_1"


    // $ANTLR start "rule__GuiLabel__TextAssignment_3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3976:1: rule__GuiLabel__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__GuiLabel__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3980:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3981:1: ( RULE_STRING )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3981:1: ( RULE_STRING )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3982:1: RULE_STRING
            {
             before(grammarAccess.getGuiLabelAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GuiLabel__TextAssignment_37978); 
             after(grammarAccess.getGuiLabelAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__TextAssignment_3"


    // $ANTLR start "rule__GuiLabel__ElementAssignment_5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3991:1: rule__GuiLabel__ElementAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GuiLabel__ElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3995:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3996:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3996:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3997:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGuiLabelAccess().getElementAttributeCrossReference_5_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3998:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:3999:1: ruleQualifiedName
            {
             before(grammarAccess.getGuiLabelAccess().getElementAttributeQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GuiLabel__ElementAssignment_58013);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGuiLabelAccess().getElementAttributeQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGuiLabelAccess().getElementAttributeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiLabel__ElementAssignment_5"


    // $ANTLR start "rule__GuiButton__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4010:1: rule__GuiButton__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuiButton__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4014:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4015:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4015:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4016:1: RULE_ID
            {
             before(grammarAccess.getGuiButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuiButton__NameAssignment_18048); 
             after(grammarAccess.getGuiButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__NameAssignment_1"


    // $ANTLR start "rule__GuiButton__TextAssignment_3"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4025:1: rule__GuiButton__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__GuiButton__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4029:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4030:1: ( RULE_STRING )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4030:1: ( RULE_STRING )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4031:1: RULE_STRING
            {
             before(grammarAccess.getGuiButtonAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GuiButton__TextAssignment_38079); 
             after(grammarAccess.getGuiButtonAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__TextAssignment_3"


    // $ANTLR start "rule__GuiButton__FuncAssignment_5"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4040:1: rule__GuiButton__FuncAssignment_5 : ( RULE_STRING ) ;
    public final void rule__GuiButton__FuncAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4044:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4045:1: ( RULE_STRING )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4045:1: ( RULE_STRING )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4046:1: RULE_STRING
            {
             before(grammarAccess.getGuiButtonAccess().getFuncSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GuiButton__FuncAssignment_58110); 
             after(grammarAccess.getGuiButtonAccess().getFuncSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiButton__FuncAssignment_5"


    // $ANTLR start "rule__GuiInput__NameAssignment_1"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4055:1: rule__GuiInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuiInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4059:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4060:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4060:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4061:1: RULE_ID
            {
             before(grammarAccess.getGuiInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuiInput__NameAssignment_18141); 
             after(grammarAccess.getGuiInputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__NameAssignment_1"


    // $ANTLR start "rule__GuiInput__InputTypeAssignment_4"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4070:1: rule__GuiInput__InputTypeAssignment_4 : ( ruleInputType ) ;
    public final void rule__GuiInput__InputTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4074:1: ( ( ruleInputType ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4075:1: ( ruleInputType )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4075:1: ( ruleInputType )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:4076:1: ruleInputType
            {
             before(grammarAccess.getGuiInputAccess().getInputTypeInputTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInputType_in_rule__GuiInput__InputTypeAssignment_48172);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getGuiInputAccess().getInputTypeInputTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuiInput__InputTypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000202004002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_entryRuleServer182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServer189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__0_in_ruleServer215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Alternatives_in_ruleConfig275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_entryRulerootConfig302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerootConfig309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__0_in_rulerootConfig335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehostNameConfig369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__0_in_rulehostNameConfig395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_entryRuleportConfig422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleportConfig429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__0_in_ruleportConfig455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_entryRulelogConfig482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogConfig489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__0_in_rulelogConfig515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesqldbConfig549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__0_in_rulesqldbConfig575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresourceConfig609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__0_in_ruleresourceConfig635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__0_in_ruleStringAttribute875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberAttribute909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__0_in_ruleNumberAttribute935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageAttribute969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__0_in_ruleImageAttribute995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGui_in_entryRuleGui1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGui1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__0_in_ruleGui1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiFeature_in_entryRuleGuiFeature1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiFeature1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiFeature__Alternatives_in_ruleGuiFeature1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiLabel_in_entryRuleGuiLabel1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiLabel1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__0_in_ruleGuiLabel1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiButton_in_entryRuleGuiButton1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiButton1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__0_in_ruleGuiButton1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiInput_in_entryRuleGuiInput1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiInput1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__0_in_ruleGuiInput1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputType_in_entryRuleInputType1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputType1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Alternatives_in_ruleInputType1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringInput_in_entryRuleStringInput1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringInput1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStringInput1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInput_in_entryRuleIntegerInput1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerInput1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleIntegerInput1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdInput_in_entryRuleIdInput1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdInput1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleIdInput1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_rule__Type__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_rule__Type__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGui_in_rule__Type__Alternatives1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_rule__Config__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_rule__Config__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_rule__Config__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_rule__Config__Alternatives1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_rule__Config__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_rule__Config__Alternatives1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_rule__Attribute__Alternatives1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_rule__Attribute__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiLabel_in_rule__GuiFeature__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiButton_in_rule__GuiFeature__Alternatives1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiInput_in_rule__GuiFeature__Alternatives1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringInput_in_rule__InputType__Alternatives2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInput_in_rule__InputType__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdInput_in_rule__InputType__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__02076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Server__Group__1_in_rule__Server__Group__02079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Server__Group__0__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__12138 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Server__Group__2_in_rule__Server__Group__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__22198 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Server__Group__3_in_rule__Server__Group__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Server__Group__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__32260 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Server__Group__4_in_rule__Server__Group__32263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Server__Group__3__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__42322 = new BitSet(new long[]{0x0000000001F60000L});
    public static final BitSet FOLLOW_rule__Server__Group__5_in_rule__Server__Group__42325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Server__Group__4__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__52384 = new BitSet(new long[]{0x0000000001F60000L});
    public static final BitSet FOLLOW_rule__Server__Group__6_in_rule__Server__Group__52387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__ConfigsAssignment_5_in_rule__Server__Group__5__Impl2414 = new BitSet(new long[]{0x0000000001F40002L});
    public static final BitSet FOLLOW_rule__Server__Group__6__Impl_in_rule__Server__Group__62445 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Server__Group__7_in_rule__Server__Group__62448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Server__Group__6__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__7__Impl_in_rule__Server__Group__72507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Server__Group__7__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__0__Impl_in_rule__RootConfig__Group__02582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__1_in_rule__RootConfig__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RootConfig__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__1__Impl_in_rule__RootConfig__Group__12644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__2_in_rule__RootConfig__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RootConfig__Group__1__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__2__Impl_in_rule__RootConfig__Group__22706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__NameAssignment_2_in_rule__RootConfig__Group__2__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__0__Impl_in_rule__HostNameConfig__Group__02769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__1_in_rule__HostNameConfig__Group__02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HostNameConfig__Group__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__1__Impl_in_rule__HostNameConfig__Group__12831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__2_in_rule__HostNameConfig__Group__12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HostNameConfig__Group__1__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__2__Impl_in_rule__HostNameConfig__Group__22893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__NameAssignment_2_in_rule__HostNameConfig__Group__2__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__0__Impl_in_rule__PortConfig__Group__02956 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__1_in_rule__PortConfig__Group__02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PortConfig__Group__0__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__1__Impl_in_rule__PortConfig__Group__13018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__2_in_rule__PortConfig__Group__13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PortConfig__Group__1__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__2__Impl_in_rule__PortConfig__Group__23080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__NameAssignment_2_in_rule__PortConfig__Group__2__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__0__Impl_in_rule__LogConfig__Group__03143 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__1_in_rule__LogConfig__Group__03146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LogConfig__Group__0__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__1__Impl_in_rule__LogConfig__Group__13205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__2_in_rule__LogConfig__Group__13208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogConfig__Group__1__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__2__Impl_in_rule__LogConfig__Group__23267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__NameAssignment_2_in_rule__LogConfig__Group__2__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__0__Impl_in_rule__SqldbConfig__Group__03330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__1_in_rule__SqldbConfig__Group__03333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SqldbConfig__Group__0__Impl3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__1__Impl_in_rule__SqldbConfig__Group__13392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__2_in_rule__SqldbConfig__Group__13395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SqldbConfig__Group__1__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__2__Impl_in_rule__SqldbConfig__Group__23454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__NameAssignment_2_in_rule__SqldbConfig__Group__2__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__0__Impl_in_rule__ResourceConfig__Group__03517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__1_in_rule__ResourceConfig__Group__03520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ResourceConfig__Group__0__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__1__Impl_in_rule__ResourceConfig__Group__13579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__2_in_rule__ResourceConfig__Group__13582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ResourceConfig__Group__1__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__2__Impl_in_rule__ResourceConfig__Group__23641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__NameAssignment_2_in_rule__ResourceConfig__Group__2__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__03704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DomainModel__Group__0__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__13766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__2_in_rule__DomainModel__Group__13769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__NameAssignment_1_in_rule__DomainModel__Group__1__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__2__Impl_in_rule__DomainModel__Group__23826 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__3_in_rule__DomainModel__Group__23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainModel__Group__2__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__3__Impl_in_rule__DomainModel__Group__33888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__4_in_rule__DomainModel__Group__33891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DomainModel__Group__3__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__4__Impl_in_rule__DomainModel__Group__43950 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__5_in_rule__DomainModel__Group__43953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainModel__Group__4__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__5__Impl_in_rule__DomainModel__Group__54012 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__6_in_rule__DomainModel__Group__54015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__EntitysAssignment_5_in_rule__DomainModel__Group__5__Impl4042 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__6__Impl_in_rule__DomainModel__Group__64073 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__7_in_rule__DomainModel__Group__64076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainModel__Group__6__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__7__Impl_in_rule__DomainModel__Group__74135 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__8_in_rule__DomainModel__Group__74138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DomainModel__Group__7__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__8__Impl_in_rule__DomainModel__Group__84197 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__9_in_rule__DomainModel__Group__84200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainModel__Group__8__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__9__Impl_in_rule__DomainModel__Group__94259 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__10_in_rule__DomainModel__Group__94262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__RelationshipsAssignment_9_in_rule__DomainModel__Group__9__Impl4289 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__10__Impl_in_rule__DomainModel__Group__104320 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__11_in_rule__DomainModel__Group__104323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainModel__Group__10__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__11__Impl_in_rule__DomainModel__Group__114382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainModel__Group__11__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04465 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14525 = new BitSet(new long[]{0x0000000070020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__1__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24587 = new BitSet(new long[]{0x0000000070020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_2_in_rule__Entity__Group__2__Impl4617 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__3__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__0__Impl_in_rule__StringAttribute__Group__04715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__1_in_rule__StringAttribute__Group__04718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringAttribute__Group__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__1__Impl_in_rule__StringAttribute__Group__14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__NameAssignment_1_in_rule__StringAttribute__Group__1__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__0__Impl_in_rule__NumberAttribute__Group__04838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__1_in_rule__NumberAttribute__Group__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NumberAttribute__Group__0__Impl4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__1__Impl_in_rule__NumberAttribute__Group__14900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__NameAssignment_1_in_rule__NumberAttribute__Group__1__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__0__Impl_in_rule__ImageAttribute__Group__04961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__1_in_rule__ImageAttribute__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ImageAttribute__Group__0__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__1__Impl_in_rule__ImageAttribute__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__NameAssignment_1_in_rule__ImageAttribute__Group__1__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05084 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5170 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__05327 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__05330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__NameAssignment_0_in_rule__Relationship__Group__0__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relationship__Group__1__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__RefNameAssignment_2_in_rule__Relationship__Group__2__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__0__Impl_in_rule__Gui__Group__05512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gui__Group__1_in_rule__Gui__Group__05515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Gui__Group__0__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__1__Impl_in_rule__Gui__Group__15574 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Gui__Group__2_in_rule__Gui__Group__15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__NameAssignment_1_in_rule__Gui__Group__1__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__2__Impl_in_rule__Gui__Group__25634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gui__Group__3_in_rule__Gui__Group__25637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Gui__Group__2__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__3__Impl_in_rule__Gui__Group__35696 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Gui__Group__4_in_rule__Gui__Group__35699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__ServerAssignment_3_in_rule__Gui__Group__3__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__4__Impl_in_rule__Gui__Group__45756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gui__Group__5_in_rule__Gui__Group__45759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Gui__Group__4__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__5__Impl_in_rule__Gui__Group__55818 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Gui__Group__6_in_rule__Gui__Group__55821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__LayoutAssignment_5_in_rule__Gui__Group__5__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__6__Impl_in_rule__Gui__Group__65878 = new BitSet(new long[]{0x0000014800020000L});
    public static final BitSet FOLLOW_rule__Gui__Group__7_in_rule__Gui__Group__65881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Gui__Group__6__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__7__Impl_in_rule__Gui__Group__75940 = new BitSet(new long[]{0x0000014800020000L});
    public static final BitSet FOLLOW_rule__Gui__Group__8_in_rule__Gui__Group__75943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gui__GuiFeaturesAssignment_7_in_rule__Gui__Group__7__Impl5970 = new BitSet(new long[]{0x0000014800000002L});
    public static final BitSet FOLLOW_rule__Gui__Group__8__Impl_in_rule__Gui__Group__86001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Gui__Group__8__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__0__Impl_in_rule__GuiLabel__Group__06078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__1_in_rule__GuiLabel__Group__06081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GuiLabel__Group__0__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__1__Impl_in_rule__GuiLabel__Group__16140 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__2_in_rule__GuiLabel__Group__16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__NameAssignment_1_in_rule__GuiLabel__Group__1__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__2__Impl_in_rule__GuiLabel__Group__26200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__3_in_rule__GuiLabel__Group__26203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GuiLabel__Group__2__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__3__Impl_in_rule__GuiLabel__Group__36262 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__4_in_rule__GuiLabel__Group__36265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__TextAssignment_3_in_rule__GuiLabel__Group__3__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__4__Impl_in_rule__GuiLabel__Group__46322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__5_in_rule__GuiLabel__Group__46325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GuiLabel__Group__4__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__Group__5__Impl_in_rule__GuiLabel__Group__56384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiLabel__ElementAssignment_5_in_rule__GuiLabel__Group__5__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__0__Impl_in_rule__GuiButton__Group__06453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__1_in_rule__GuiButton__Group__06456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GuiButton__Group__0__Impl6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__1__Impl_in_rule__GuiButton__Group__16515 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__2_in_rule__GuiButton__Group__16518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__NameAssignment_1_in_rule__GuiButton__Group__1__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__2__Impl_in_rule__GuiButton__Group__26575 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__3_in_rule__GuiButton__Group__26578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GuiButton__Group__2__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__3__Impl_in_rule__GuiButton__Group__36637 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__4_in_rule__GuiButton__Group__36640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__TextAssignment_3_in_rule__GuiButton__Group__3__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__4__Impl_in_rule__GuiButton__Group__46697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__5_in_rule__GuiButton__Group__46700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__GuiButton__Group__4__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__Group__5__Impl_in_rule__GuiButton__Group__56759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiButton__FuncAssignment_5_in_rule__GuiButton__Group__5__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__0__Impl_in_rule__GuiInput__Group__06828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__1_in_rule__GuiInput__Group__06831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__GuiInput__Group__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__1__Impl_in_rule__GuiInput__Group__16890 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__2_in_rule__GuiInput__Group__16893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__NameAssignment_1_in_rule__GuiInput__Group__1__Impl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__2__Impl_in_rule__GuiInput__Group__26950 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__3_in_rule__GuiInput__Group__26953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__GuiInput__Group__2__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__3__Impl_in_rule__GuiInput__Group__37012 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__4_in_rule__GuiInput__Group__37015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__GuiInput__Group__3__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__4__Impl_in_rule__GuiInput__Group__47074 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__5_in_rule__GuiInput__Group__47077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__InputTypeAssignment_4_in_rule__GuiInput__Group__4__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuiInput__Group__5__Impl_in_rule__GuiInput__Group__57134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__GuiInput__Group__5__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Server__NameAssignment_17241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Server__ConfigsAssignment_57272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootConfig__NameAssignment_27303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HostNameConfig__NameAssignment_27334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PortConfig__NameAssignment_27365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LogConfig__NameAssignment_27396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SqldbConfig__NameAssignment_27427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceConfig__NameAssignment_27458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainModel__NameAssignment_17489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainModel__EntitysAssignment_57520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__DomainModel__RelationshipsAssignment_97551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_07582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_27613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringAttribute__NameAssignment_17644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumberAttribute__NameAssignment_17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageAttribute__NameAssignment_17706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__NameAssignment_07741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__RefNameAssignment_27780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Gui__NameAssignment_17815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Gui__ServerAssignment_37850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gui__LayoutAssignment_57885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiFeature_in_rule__Gui__GuiFeaturesAssignment_77916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuiLabel__NameAssignment_17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GuiLabel__TextAssignment_37978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GuiLabel__ElementAssignment_58013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuiButton__NameAssignment_18048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GuiButton__TextAssignment_38079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GuiButton__FuncAssignment_58110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuiInput__NameAssignment_18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputType_in_rule__GuiInput__InputTypeAssignment_48172 = new BitSet(new long[]{0x0000000000000002L});

}