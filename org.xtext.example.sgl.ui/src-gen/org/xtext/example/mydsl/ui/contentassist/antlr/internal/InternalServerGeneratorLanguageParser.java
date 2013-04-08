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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SERVER'", "'{'", "'CONFIG'", "'}'", "'ROOTDIR'", "'='", "'HOSTNAME'", "'PORT'", "'LOG'", "'SQLDB'", "'RESOURCE'", "'DOMAINMODEL'", "'ENTITYS'", "'ENTITY_RELATIONSHIP'", "'STRING'", "'NUMBER'", "'IMAGE'", "'.'", "'->'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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

                if ( (LA1_0==11||LA1_0==22) ) {
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:564:1: rule__Type__Alternatives : ( ( ruleServer ) | ( ruleDomainModel ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:568:1: ( ( ruleServer ) | ( ruleDomainModel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:569:1: ( ruleServer )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:569:1: ( ruleServer )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:570:1: ruleServer
                    {
                     before(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServer_in_rule__Type__Alternatives1151);
                    ruleServer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:575:6: ( ruleDomainModel )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:575:6: ( ruleDomainModel )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:576:1: ruleDomainModel
                    {
                     before(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDomainModel_in_rule__Type__Alternatives1168);
                    ruleDomainModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 

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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:586:1: rule__Config__Alternatives : ( ( rulerootConfig ) | ( rulehostNameConfig ) | ( ruleportConfig ) | ( rulelogConfig ) | ( rulesqldbConfig ) | ( ruleresourceConfig ) );
    public final void rule__Config__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:590:1: ( ( rulerootConfig ) | ( rulehostNameConfig ) | ( ruleportConfig ) | ( rulelogConfig ) | ( rulesqldbConfig ) | ( ruleresourceConfig ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
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
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:591:1: ( rulerootConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:591:1: ( rulerootConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:592:1: rulerootConfig
                    {
                     before(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulerootConfig_in_rule__Config__Alternatives1200);
                    rulerootConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:597:6: ( rulehostNameConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:597:6: ( rulehostNameConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:598:1: rulehostNameConfig
                    {
                     before(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulehostNameConfig_in_rule__Config__Alternatives1217);
                    rulehostNameConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:603:6: ( ruleportConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:603:6: ( ruleportConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:604:1: ruleportConfig
                    {
                     before(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleportConfig_in_rule__Config__Alternatives1234);
                    ruleportConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:609:6: ( rulelogConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:609:6: ( rulelogConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:610:1: rulelogConfig
                    {
                     before(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulelogConfig_in_rule__Config__Alternatives1251);
                    rulelogConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:615:6: ( rulesqldbConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:615:6: ( rulesqldbConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:616:1: rulesqldbConfig
                    {
                     before(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulesqldbConfig_in_rule__Config__Alternatives1268);
                    rulesqldbConfig();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:621:6: ( ruleresourceConfig )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:621:6: ( ruleresourceConfig )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:622:1: ruleresourceConfig
                    {
                     before(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleresourceConfig_in_rule__Config__Alternatives1285);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:632:1: rule__Attribute__Alternatives : ( ( ruleStringAttribute ) | ( ruleNumberAttribute ) | ( ruleImageAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:636:1: ( ( ruleStringAttribute ) | ( ruleNumberAttribute ) | ( ruleImageAttribute ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
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
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:637:1: ( ruleStringAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:637:1: ( ruleStringAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:638:1: ruleStringAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1317);
                    ruleStringAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:643:6: ( ruleNumberAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:643:6: ( ruleNumberAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:644:1: ruleNumberAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberAttribute_in_rule__Attribute__Alternatives1334);
                    ruleNumberAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:649:6: ( ruleImageAttribute )
                    {
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:649:6: ( ruleImageAttribute )
                    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:650:1: ruleImageAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImageAttribute_in_rule__Attribute__Alternatives1351);
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


    // $ANTLR start "rule__Server__Group__0"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:662:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:666:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:667:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__01381);
            rule__Server__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__1_in_rule__Server__Group__01384);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:674:1: rule__Server__Group__0__Impl : ( 'SERVER' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:678:1: ( ( 'SERVER' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:679:1: ( 'SERVER' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:679:1: ( 'SERVER' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:680:1: 'SERVER'
            {
             before(grammarAccess.getServerAccess().getSERVERKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Server__Group__0__Impl1412); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:693:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:697:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:698:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__11443);
            rule__Server__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__2_in_rule__Server__Group__11446);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:705:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:709:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:710:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:710:1: ( ( rule__Server__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:711:1: ( rule__Server__NameAssignment_1 )
            {
             before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:712:1: ( rule__Server__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:712:2: rule__Server__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl1473);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:722:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:726:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:727:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__21503);
            rule__Server__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__3_in_rule__Server__Group__21506);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:734:1: rule__Server__Group__2__Impl : ( '{' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:738:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:739:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:739:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:740:1: '{'
            {
             before(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Server__Group__2__Impl1534); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:753:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:757:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:758:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__31565);
            rule__Server__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__4_in_rule__Server__Group__31568);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:765:1: rule__Server__Group__3__Impl : ( 'CONFIG' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:769:1: ( ( 'CONFIG' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:770:1: ( 'CONFIG' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:770:1: ( 'CONFIG' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:771:1: 'CONFIG'
            {
             before(grammarAccess.getServerAccess().getCONFIGKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Server__Group__3__Impl1596); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:784:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:788:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:789:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__41627);
            rule__Server__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__5_in_rule__Server__Group__41630);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:796:1: rule__Server__Group__4__Impl : ( '{' ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:800:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:801:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:801:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:802:1: '{'
            {
             before(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Server__Group__4__Impl1658); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:815:1: rule__Server__Group__5 : rule__Server__Group__5__Impl rule__Server__Group__6 ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:819:1: ( rule__Server__Group__5__Impl rule__Server__Group__6 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:820:2: rule__Server__Group__5__Impl rule__Server__Group__6
            {
            pushFollow(FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__51689);
            rule__Server__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__6_in_rule__Server__Group__51692);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:827:1: rule__Server__Group__5__Impl : ( ( rule__Server__ConfigsAssignment_5 )* ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:831:1: ( ( ( rule__Server__ConfigsAssignment_5 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:832:1: ( ( rule__Server__ConfigsAssignment_5 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:832:1: ( ( rule__Server__ConfigsAssignment_5 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:833:1: ( rule__Server__ConfigsAssignment_5 )*
            {
             before(grammarAccess.getServerAccess().getConfigsAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:834:1: ( rule__Server__ConfigsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||(LA5_0>=17 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:834:2: rule__Server__ConfigsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Server__ConfigsAssignment_5_in_rule__Server__Group__5__Impl1719);
            	    rule__Server__ConfigsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:844:1: rule__Server__Group__6 : rule__Server__Group__6__Impl rule__Server__Group__7 ;
    public final void rule__Server__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:848:1: ( rule__Server__Group__6__Impl rule__Server__Group__7 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:849:2: rule__Server__Group__6__Impl rule__Server__Group__7
            {
            pushFollow(FOLLOW_rule__Server__Group__6__Impl_in_rule__Server__Group__61750);
            rule__Server__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Server__Group__7_in_rule__Server__Group__61753);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:856:1: rule__Server__Group__6__Impl : ( '}' ) ;
    public final void rule__Server__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:860:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:861:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:861:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:862:1: '}'
            {
             before(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Server__Group__6__Impl1781); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:875:1: rule__Server__Group__7 : rule__Server__Group__7__Impl ;
    public final void rule__Server__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:879:1: ( rule__Server__Group__7__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:880:2: rule__Server__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Server__Group__7__Impl_in_rule__Server__Group__71812);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:886:1: rule__Server__Group__7__Impl : ( '}' ) ;
    public final void rule__Server__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:890:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:891:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:891:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:892:1: '}'
            {
             before(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Server__Group__7__Impl1840); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:921:1: rule__RootConfig__Group__0 : rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1 ;
    public final void rule__RootConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:925:1: ( rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:926:2: rule__RootConfig__Group__0__Impl rule__RootConfig__Group__1
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__0__Impl_in_rule__RootConfig__Group__01887);
            rule__RootConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootConfig__Group__1_in_rule__RootConfig__Group__01890);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:933:1: rule__RootConfig__Group__0__Impl : ( 'ROOTDIR' ) ;
    public final void rule__RootConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:937:1: ( ( 'ROOTDIR' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:938:1: ( 'ROOTDIR' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:938:1: ( 'ROOTDIR' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:939:1: 'ROOTDIR'
            {
             before(grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__RootConfig__Group__0__Impl1918); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:952:1: rule__RootConfig__Group__1 : rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2 ;
    public final void rule__RootConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:956:1: ( rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:957:2: rule__RootConfig__Group__1__Impl rule__RootConfig__Group__2
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__1__Impl_in_rule__RootConfig__Group__11949);
            rule__RootConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootConfig__Group__2_in_rule__RootConfig__Group__11952);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:964:1: rule__RootConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__RootConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:968:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:969:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:969:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:970:1: '='
            {
             before(grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__RootConfig__Group__1__Impl1980); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:983:1: rule__RootConfig__Group__2 : rule__RootConfig__Group__2__Impl ;
    public final void rule__RootConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:987:1: ( rule__RootConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:988:2: rule__RootConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootConfig__Group__2__Impl_in_rule__RootConfig__Group__22011);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:994:1: rule__RootConfig__Group__2__Impl : ( ( rule__RootConfig__NameAssignment_2 ) ) ;
    public final void rule__RootConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:998:1: ( ( ( rule__RootConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( ( rule__RootConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( ( rule__RootConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1000:1: ( rule__RootConfig__NameAssignment_2 )
            {
             before(grammarAccess.getRootConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1001:1: ( rule__RootConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1001:2: rule__RootConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RootConfig__NameAssignment_2_in_rule__RootConfig__Group__2__Impl2038);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1017:1: rule__HostNameConfig__Group__0 : rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1 ;
    public final void rule__HostNameConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1021:1: ( rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1022:2: rule__HostNameConfig__Group__0__Impl rule__HostNameConfig__Group__1
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__0__Impl_in_rule__HostNameConfig__Group__02074);
            rule__HostNameConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HostNameConfig__Group__1_in_rule__HostNameConfig__Group__02077);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1029:1: rule__HostNameConfig__Group__0__Impl : ( 'HOSTNAME' ) ;
    public final void rule__HostNameConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1033:1: ( ( 'HOSTNAME' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1034:1: ( 'HOSTNAME' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1034:1: ( 'HOSTNAME' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1035:1: 'HOSTNAME'
            {
             before(grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__HostNameConfig__Group__0__Impl2105); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1048:1: rule__HostNameConfig__Group__1 : rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2 ;
    public final void rule__HostNameConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1052:1: ( rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1053:2: rule__HostNameConfig__Group__1__Impl rule__HostNameConfig__Group__2
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__1__Impl_in_rule__HostNameConfig__Group__12136);
            rule__HostNameConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HostNameConfig__Group__2_in_rule__HostNameConfig__Group__12139);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1060:1: rule__HostNameConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__HostNameConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1064:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1065:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1065:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1066:1: '='
            {
             before(grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__HostNameConfig__Group__1__Impl2167); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1079:1: rule__HostNameConfig__Group__2 : rule__HostNameConfig__Group__2__Impl ;
    public final void rule__HostNameConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1083:1: ( rule__HostNameConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1084:2: rule__HostNameConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HostNameConfig__Group__2__Impl_in_rule__HostNameConfig__Group__22198);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1090:1: rule__HostNameConfig__Group__2__Impl : ( ( rule__HostNameConfig__NameAssignment_2 ) ) ;
    public final void rule__HostNameConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1094:1: ( ( ( rule__HostNameConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1095:1: ( ( rule__HostNameConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1095:1: ( ( rule__HostNameConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1096:1: ( rule__HostNameConfig__NameAssignment_2 )
            {
             before(grammarAccess.getHostNameConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1097:1: ( rule__HostNameConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1097:2: rule__HostNameConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HostNameConfig__NameAssignment_2_in_rule__HostNameConfig__Group__2__Impl2225);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1113:1: rule__PortConfig__Group__0 : rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1 ;
    public final void rule__PortConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1117:1: ( rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1118:2: rule__PortConfig__Group__0__Impl rule__PortConfig__Group__1
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__0__Impl_in_rule__PortConfig__Group__02261);
            rule__PortConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PortConfig__Group__1_in_rule__PortConfig__Group__02264);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1125:1: rule__PortConfig__Group__0__Impl : ( 'PORT' ) ;
    public final void rule__PortConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1129:1: ( ( 'PORT' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1130:1: ( 'PORT' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1130:1: ( 'PORT' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1131:1: 'PORT'
            {
             before(grammarAccess.getPortConfigAccess().getPORTKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__PortConfig__Group__0__Impl2292); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1144:1: rule__PortConfig__Group__1 : rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2 ;
    public final void rule__PortConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1148:1: ( rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1149:2: rule__PortConfig__Group__1__Impl rule__PortConfig__Group__2
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__1__Impl_in_rule__PortConfig__Group__12323);
            rule__PortConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PortConfig__Group__2_in_rule__PortConfig__Group__12326);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1156:1: rule__PortConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__PortConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1160:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1161:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1161:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1162:1: '='
            {
             before(grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__PortConfig__Group__1__Impl2354); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1175:1: rule__PortConfig__Group__2 : rule__PortConfig__Group__2__Impl ;
    public final void rule__PortConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1179:1: ( rule__PortConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1180:2: rule__PortConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PortConfig__Group__2__Impl_in_rule__PortConfig__Group__22385);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1186:1: rule__PortConfig__Group__2__Impl : ( ( rule__PortConfig__NameAssignment_2 ) ) ;
    public final void rule__PortConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1190:1: ( ( ( rule__PortConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1191:1: ( ( rule__PortConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1191:1: ( ( rule__PortConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1192:1: ( rule__PortConfig__NameAssignment_2 )
            {
             before(grammarAccess.getPortConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1193:1: ( rule__PortConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1193:2: rule__PortConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PortConfig__NameAssignment_2_in_rule__PortConfig__Group__2__Impl2412);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1209:1: rule__LogConfig__Group__0 : rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1 ;
    public final void rule__LogConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1213:1: ( rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1214:2: rule__LogConfig__Group__0__Impl rule__LogConfig__Group__1
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__0__Impl_in_rule__LogConfig__Group__02448);
            rule__LogConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogConfig__Group__1_in_rule__LogConfig__Group__02451);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1221:1: rule__LogConfig__Group__0__Impl : ( 'LOG' ) ;
    public final void rule__LogConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1225:1: ( ( 'LOG' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1226:1: ( 'LOG' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1226:1: ( 'LOG' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1227:1: 'LOG'
            {
             before(grammarAccess.getLogConfigAccess().getLOGKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__LogConfig__Group__0__Impl2479); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1240:1: rule__LogConfig__Group__1 : rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2 ;
    public final void rule__LogConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1244:1: ( rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1245:2: rule__LogConfig__Group__1__Impl rule__LogConfig__Group__2
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__1__Impl_in_rule__LogConfig__Group__12510);
            rule__LogConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogConfig__Group__2_in_rule__LogConfig__Group__12513);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1252:1: rule__LogConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__LogConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1256:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1257:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1257:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1258:1: '='
            {
             before(grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__LogConfig__Group__1__Impl2541); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1271:1: rule__LogConfig__Group__2 : rule__LogConfig__Group__2__Impl ;
    public final void rule__LogConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1275:1: ( rule__LogConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1276:2: rule__LogConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LogConfig__Group__2__Impl_in_rule__LogConfig__Group__22572);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1282:1: rule__LogConfig__Group__2__Impl : ( ( rule__LogConfig__NameAssignment_2 ) ) ;
    public final void rule__LogConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1286:1: ( ( ( rule__LogConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1287:1: ( ( rule__LogConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1287:1: ( ( rule__LogConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1288:1: ( rule__LogConfig__NameAssignment_2 )
            {
             before(grammarAccess.getLogConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1289:1: ( rule__LogConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1289:2: rule__LogConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LogConfig__NameAssignment_2_in_rule__LogConfig__Group__2__Impl2599);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1305:1: rule__SqldbConfig__Group__0 : rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1 ;
    public final void rule__SqldbConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1309:1: ( rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1310:2: rule__SqldbConfig__Group__0__Impl rule__SqldbConfig__Group__1
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__0__Impl_in_rule__SqldbConfig__Group__02635);
            rule__SqldbConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SqldbConfig__Group__1_in_rule__SqldbConfig__Group__02638);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1317:1: rule__SqldbConfig__Group__0__Impl : ( 'SQLDB' ) ;
    public final void rule__SqldbConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1321:1: ( ( 'SQLDB' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1322:1: ( 'SQLDB' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1322:1: ( 'SQLDB' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1323:1: 'SQLDB'
            {
             before(grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SqldbConfig__Group__0__Impl2666); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1336:1: rule__SqldbConfig__Group__1 : rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2 ;
    public final void rule__SqldbConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1340:1: ( rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1341:2: rule__SqldbConfig__Group__1__Impl rule__SqldbConfig__Group__2
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__1__Impl_in_rule__SqldbConfig__Group__12697);
            rule__SqldbConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SqldbConfig__Group__2_in_rule__SqldbConfig__Group__12700);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1348:1: rule__SqldbConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__SqldbConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1352:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1353:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1353:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1354:1: '='
            {
             before(grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__SqldbConfig__Group__1__Impl2728); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1367:1: rule__SqldbConfig__Group__2 : rule__SqldbConfig__Group__2__Impl ;
    public final void rule__SqldbConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1371:1: ( rule__SqldbConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1372:2: rule__SqldbConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SqldbConfig__Group__2__Impl_in_rule__SqldbConfig__Group__22759);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1378:1: rule__SqldbConfig__Group__2__Impl : ( ( rule__SqldbConfig__NameAssignment_2 ) ) ;
    public final void rule__SqldbConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1382:1: ( ( ( rule__SqldbConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1383:1: ( ( rule__SqldbConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1383:1: ( ( rule__SqldbConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1384:1: ( rule__SqldbConfig__NameAssignment_2 )
            {
             before(grammarAccess.getSqldbConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1385:1: ( rule__SqldbConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1385:2: rule__SqldbConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SqldbConfig__NameAssignment_2_in_rule__SqldbConfig__Group__2__Impl2786);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1401:1: rule__ResourceConfig__Group__0 : rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1 ;
    public final void rule__ResourceConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1405:1: ( rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1406:2: rule__ResourceConfig__Group__0__Impl rule__ResourceConfig__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__0__Impl_in_rule__ResourceConfig__Group__02822);
            rule__ResourceConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceConfig__Group__1_in_rule__ResourceConfig__Group__02825);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1413:1: rule__ResourceConfig__Group__0__Impl : ( 'RESOURCE' ) ;
    public final void rule__ResourceConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1417:1: ( ( 'RESOURCE' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1418:1: ( 'RESOURCE' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1418:1: ( 'RESOURCE' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1419:1: 'RESOURCE'
            {
             before(grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ResourceConfig__Group__0__Impl2853); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1432:1: rule__ResourceConfig__Group__1 : rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2 ;
    public final void rule__ResourceConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1436:1: ( rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1437:2: rule__ResourceConfig__Group__1__Impl rule__ResourceConfig__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__1__Impl_in_rule__ResourceConfig__Group__12884);
            rule__ResourceConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceConfig__Group__2_in_rule__ResourceConfig__Group__12887);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1444:1: rule__ResourceConfig__Group__1__Impl : ( '=' ) ;
    public final void rule__ResourceConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1448:1: ( ( '=' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1449:1: ( '=' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1449:1: ( '=' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1450:1: '='
            {
             before(grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ResourceConfig__Group__1__Impl2915); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1463:1: rule__ResourceConfig__Group__2 : rule__ResourceConfig__Group__2__Impl ;
    public final void rule__ResourceConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1467:1: ( rule__ResourceConfig__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1468:2: rule__ResourceConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceConfig__Group__2__Impl_in_rule__ResourceConfig__Group__22946);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1474:1: rule__ResourceConfig__Group__2__Impl : ( ( rule__ResourceConfig__NameAssignment_2 ) ) ;
    public final void rule__ResourceConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1478:1: ( ( ( rule__ResourceConfig__NameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1479:1: ( ( rule__ResourceConfig__NameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1479:1: ( ( rule__ResourceConfig__NameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1480:1: ( rule__ResourceConfig__NameAssignment_2 )
            {
             before(grammarAccess.getResourceConfigAccess().getNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1481:1: ( rule__ResourceConfig__NameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1481:2: rule__ResourceConfig__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ResourceConfig__NameAssignment_2_in_rule__ResourceConfig__Group__2__Impl2973);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1497:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1501:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1502:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__03009);
            rule__DomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__03012);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1509:1: rule__DomainModel__Group__0__Impl : ( 'DOMAINMODEL' ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1513:1: ( ( 'DOMAINMODEL' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1514:1: ( 'DOMAINMODEL' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1514:1: ( 'DOMAINMODEL' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1515:1: 'DOMAINMODEL'
            {
             before(grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DomainModel__Group__0__Impl3040); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1528:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1532:1: ( rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1533:2: rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__13071);
            rule__DomainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__2_in_rule__DomainModel__Group__13074);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1540:1: rule__DomainModel__Group__1__Impl : ( ( rule__DomainModel__NameAssignment_1 ) ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1544:1: ( ( ( rule__DomainModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1545:1: ( ( rule__DomainModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1545:1: ( ( rule__DomainModel__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1546:1: ( rule__DomainModel__NameAssignment_1 )
            {
             before(grammarAccess.getDomainModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1547:1: ( rule__DomainModel__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1547:2: rule__DomainModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainModel__NameAssignment_1_in_rule__DomainModel__Group__1__Impl3101);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1557:1: rule__DomainModel__Group__2 : rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 ;
    public final void rule__DomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1561:1: ( rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1562:2: rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__2__Impl_in_rule__DomainModel__Group__23131);
            rule__DomainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__3_in_rule__DomainModel__Group__23134);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1569:1: rule__DomainModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1573:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1574:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1574:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1575:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__DomainModel__Group__2__Impl3162); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1588:1: rule__DomainModel__Group__3 : rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 ;
    public final void rule__DomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1592:1: ( rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1593:2: rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__3__Impl_in_rule__DomainModel__Group__33193);
            rule__DomainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__4_in_rule__DomainModel__Group__33196);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1600:1: rule__DomainModel__Group__3__Impl : ( 'ENTITYS' ) ;
    public final void rule__DomainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1604:1: ( ( 'ENTITYS' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1605:1: ( 'ENTITYS' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1605:1: ( 'ENTITYS' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1606:1: 'ENTITYS'
            {
             before(grammarAccess.getDomainModelAccess().getENTITYSKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__DomainModel__Group__3__Impl3224); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1619:1: rule__DomainModel__Group__4 : rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 ;
    public final void rule__DomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1623:1: ( rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1624:2: rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__4__Impl_in_rule__DomainModel__Group__43255);
            rule__DomainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__5_in_rule__DomainModel__Group__43258);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1631:1: rule__DomainModel__Group__4__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1635:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1636:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1636:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1637:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__DomainModel__Group__4__Impl3286); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1650:1: rule__DomainModel__Group__5 : rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 ;
    public final void rule__DomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1654:1: ( rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1655:2: rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__5__Impl_in_rule__DomainModel__Group__53317);
            rule__DomainModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__6_in_rule__DomainModel__Group__53320);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1662:1: rule__DomainModel__Group__5__Impl : ( ( rule__DomainModel__EntitysAssignment_5 )* ) ;
    public final void rule__DomainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1666:1: ( ( ( rule__DomainModel__EntitysAssignment_5 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1667:1: ( ( rule__DomainModel__EntitysAssignment_5 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1667:1: ( ( rule__DomainModel__EntitysAssignment_5 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1668:1: ( rule__DomainModel__EntitysAssignment_5 )*
            {
             before(grammarAccess.getDomainModelAccess().getEntitysAssignment_5()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1669:1: ( rule__DomainModel__EntitysAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1669:2: rule__DomainModel__EntitysAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__EntitysAssignment_5_in_rule__DomainModel__Group__5__Impl3347);
            	    rule__DomainModel__EntitysAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1679:1: rule__DomainModel__Group__6 : rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7 ;
    public final void rule__DomainModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1683:1: ( rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1684:2: rule__DomainModel__Group__6__Impl rule__DomainModel__Group__7
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__6__Impl_in_rule__DomainModel__Group__63378);
            rule__DomainModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__7_in_rule__DomainModel__Group__63381);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1691:1: rule__DomainModel__Group__6__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1695:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1696:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1696:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1697:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__DomainModel__Group__6__Impl3409); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1710:1: rule__DomainModel__Group__7 : rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8 ;
    public final void rule__DomainModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1714:1: ( rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1715:2: rule__DomainModel__Group__7__Impl rule__DomainModel__Group__8
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__7__Impl_in_rule__DomainModel__Group__73440);
            rule__DomainModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__8_in_rule__DomainModel__Group__73443);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1722:1: rule__DomainModel__Group__7__Impl : ( 'ENTITY_RELATIONSHIP' ) ;
    public final void rule__DomainModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1726:1: ( ( 'ENTITY_RELATIONSHIP' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1727:1: ( 'ENTITY_RELATIONSHIP' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1727:1: ( 'ENTITY_RELATIONSHIP' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1728:1: 'ENTITY_RELATIONSHIP'
            {
             before(grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__DomainModel__Group__7__Impl3471); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1741:1: rule__DomainModel__Group__8 : rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9 ;
    public final void rule__DomainModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1745:1: ( rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1746:2: rule__DomainModel__Group__8__Impl rule__DomainModel__Group__9
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__8__Impl_in_rule__DomainModel__Group__83502);
            rule__DomainModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__9_in_rule__DomainModel__Group__83505);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1753:1: rule__DomainModel__Group__8__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1757:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1758:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1758:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1759:1: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_12_in_rule__DomainModel__Group__8__Impl3533); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1772:1: rule__DomainModel__Group__9 : rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10 ;
    public final void rule__DomainModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1776:1: ( rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1777:2: rule__DomainModel__Group__9__Impl rule__DomainModel__Group__10
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__9__Impl_in_rule__DomainModel__Group__93564);
            rule__DomainModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__10_in_rule__DomainModel__Group__93567);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1784:1: rule__DomainModel__Group__9__Impl : ( ( rule__DomainModel__RelationshipsAssignment_9 )* ) ;
    public final void rule__DomainModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1788:1: ( ( ( rule__DomainModel__RelationshipsAssignment_9 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1789:1: ( ( rule__DomainModel__RelationshipsAssignment_9 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1789:1: ( ( rule__DomainModel__RelationshipsAssignment_9 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1790:1: ( rule__DomainModel__RelationshipsAssignment_9 )*
            {
             before(grammarAccess.getDomainModelAccess().getRelationshipsAssignment_9()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1791:1: ( rule__DomainModel__RelationshipsAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1791:2: rule__DomainModel__RelationshipsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__RelationshipsAssignment_9_in_rule__DomainModel__Group__9__Impl3594);
            	    rule__DomainModel__RelationshipsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1801:1: rule__DomainModel__Group__10 : rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11 ;
    public final void rule__DomainModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1805:1: ( rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1806:2: rule__DomainModel__Group__10__Impl rule__DomainModel__Group__11
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__10__Impl_in_rule__DomainModel__Group__103625);
            rule__DomainModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__11_in_rule__DomainModel__Group__103628);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1813:1: rule__DomainModel__Group__10__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1817:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1818:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1818:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1819:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__DomainModel__Group__10__Impl3656); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1832:1: rule__DomainModel__Group__11 : rule__DomainModel__Group__11__Impl ;
    public final void rule__DomainModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1836:1: ( rule__DomainModel__Group__11__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1837:2: rule__DomainModel__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__11__Impl_in_rule__DomainModel__Group__113687);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1843:1: rule__DomainModel__Group__11__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1847:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1848:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1848:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1849:1: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_14_in_rule__DomainModel__Group__11__Impl3715); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1886:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1890:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1891:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03770);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03773);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1898:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1902:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1903:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1903:1: ( ( rule__Entity__NameAssignment_0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1904:1: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1905:1: ( rule__Entity__NameAssignment_0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1905:2: rule__Entity__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl3800);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1915:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1919:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1920:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13830);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13833);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1927:1: rule__Entity__Group__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1931:1: ( ( '{' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1932:1: ( '{' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1932:1: ( '{' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1933:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__1__Impl3861); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1946:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1950:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1951:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23892);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23895);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1958:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__AttributesAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1962:1: ( ( ( rule__Entity__AttributesAssignment_2 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1963:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1963:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1964:1: ( rule__Entity__AttributesAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1965:1: ( rule__Entity__AttributesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1965:2: rule__Entity__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_2_in_rule__Entity__Group__2__Impl3922);
            	    rule__Entity__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1975:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1979:1: ( rule__Entity__Group__3__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1980:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33953);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1986:1: rule__Entity__Group__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1990:1: ( ( '}' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1991:1: ( '}' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1991:1: ( '}' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:1992:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__3__Impl3981); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2013:1: rule__StringAttribute__Group__0 : rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 ;
    public final void rule__StringAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2017:1: ( rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2018:2: rule__StringAttribute__Group__0__Impl rule__StringAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__StringAttribute__Group__0__Impl_in_rule__StringAttribute__Group__04020);
            rule__StringAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringAttribute__Group__1_in_rule__StringAttribute__Group__04023);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2025:1: rule__StringAttribute__Group__0__Impl : ( 'STRING' ) ;
    public final void rule__StringAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2029:1: ( ( 'STRING' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2030:1: ( 'STRING' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2030:1: ( 'STRING' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2031:1: 'STRING'
            {
             before(grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__StringAttribute__Group__0__Impl4051); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2044:1: rule__StringAttribute__Group__1 : rule__StringAttribute__Group__1__Impl ;
    public final void rule__StringAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2048:1: ( rule__StringAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2049:2: rule__StringAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringAttribute__Group__1__Impl_in_rule__StringAttribute__Group__14082);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2055:1: rule__StringAttribute__Group__1__Impl : ( ( rule__StringAttribute__NameAssignment_1 ) ) ;
    public final void rule__StringAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2059:1: ( ( ( rule__StringAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2060:1: ( ( rule__StringAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2060:1: ( ( rule__StringAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2061:1: ( rule__StringAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getStringAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2062:1: ( rule__StringAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2062:2: rule__StringAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringAttribute__NameAssignment_1_in_rule__StringAttribute__Group__1__Impl4109);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2076:1: rule__NumberAttribute__Group__0 : rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1 ;
    public final void rule__NumberAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2080:1: ( rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2081:2: rule__NumberAttribute__Group__0__Impl rule__NumberAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__NumberAttribute__Group__0__Impl_in_rule__NumberAttribute__Group__04143);
            rule__NumberAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberAttribute__Group__1_in_rule__NumberAttribute__Group__04146);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2088:1: rule__NumberAttribute__Group__0__Impl : ( 'NUMBER' ) ;
    public final void rule__NumberAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2092:1: ( ( 'NUMBER' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2093:1: ( 'NUMBER' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2093:1: ( 'NUMBER' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2094:1: 'NUMBER'
            {
             before(grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__NumberAttribute__Group__0__Impl4174); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2107:1: rule__NumberAttribute__Group__1 : rule__NumberAttribute__Group__1__Impl ;
    public final void rule__NumberAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2111:1: ( rule__NumberAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2112:2: rule__NumberAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberAttribute__Group__1__Impl_in_rule__NumberAttribute__Group__14205);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2118:1: rule__NumberAttribute__Group__1__Impl : ( ( rule__NumberAttribute__NameAssignment_1 ) ) ;
    public final void rule__NumberAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2122:1: ( ( ( rule__NumberAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2123:1: ( ( rule__NumberAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2123:1: ( ( rule__NumberAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2124:1: ( rule__NumberAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getNumberAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2125:1: ( rule__NumberAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2125:2: rule__NumberAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberAttribute__NameAssignment_1_in_rule__NumberAttribute__Group__1__Impl4232);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2139:1: rule__ImageAttribute__Group__0 : rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1 ;
    public final void rule__ImageAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2143:1: ( rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2144:2: rule__ImageAttribute__Group__0__Impl rule__ImageAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ImageAttribute__Group__0__Impl_in_rule__ImageAttribute__Group__04266);
            rule__ImageAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageAttribute__Group__1_in_rule__ImageAttribute__Group__04269);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2151:1: rule__ImageAttribute__Group__0__Impl : ( 'IMAGE' ) ;
    public final void rule__ImageAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2155:1: ( ( 'IMAGE' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2156:1: ( 'IMAGE' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2156:1: ( 'IMAGE' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2157:1: 'IMAGE'
            {
             before(grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ImageAttribute__Group__0__Impl4297); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2170:1: rule__ImageAttribute__Group__1 : rule__ImageAttribute__Group__1__Impl ;
    public final void rule__ImageAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2174:1: ( rule__ImageAttribute__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2175:2: rule__ImageAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageAttribute__Group__1__Impl_in_rule__ImageAttribute__Group__14328);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2181:1: rule__ImageAttribute__Group__1__Impl : ( ( rule__ImageAttribute__NameAssignment_1 ) ) ;
    public final void rule__ImageAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2185:1: ( ( ( rule__ImageAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2186:1: ( ( rule__ImageAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2186:1: ( ( rule__ImageAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2187:1: ( rule__ImageAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getImageAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2188:1: ( rule__ImageAttribute__NameAssignment_1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2188:2: rule__ImageAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ImageAttribute__NameAssignment_1_in_rule__ImageAttribute__Group__1__Impl4355);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2202:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2206:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2207:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04389);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04392);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2214:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2218:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2219:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2219:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2220:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4419); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2231:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2235:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2236:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14448);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2242:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2246:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2247:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2247:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2248:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2249:1: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2249:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4475);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2263:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2267:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2268:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04510);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04513);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2275:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2279:1: ( ( '.' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2280:1: ( '.' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2280:1: ( '.' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2281:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl4541); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2294:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2298:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2299:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14572);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2305:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2309:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2310:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2310:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2311:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4599); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2326:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2330:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2331:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04632);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04635);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2338:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__NameAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2342:1: ( ( ( rule__Relationship__NameAssignment_0 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2343:1: ( ( rule__Relationship__NameAssignment_0 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2343:1: ( ( rule__Relationship__NameAssignment_0 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2344:1: ( rule__Relationship__NameAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2345:1: ( rule__Relationship__NameAssignment_0 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2345:2: rule__Relationship__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__NameAssignment_0_in_rule__Relationship__Group__0__Impl4662);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2355:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2359:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2360:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14692);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14695);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2367:1: rule__Relationship__Group__1__Impl : ( '->' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2371:1: ( ( '->' ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2372:1: ( '->' )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2372:1: ( '->' )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2373:1: '->'
            {
             before(grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Relationship__Group__1__Impl4723); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2386:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2390:1: ( rule__Relationship__Group__2__Impl )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2391:2: rule__Relationship__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24754);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2397:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__RefNameAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2401:1: ( ( ( rule__Relationship__RefNameAssignment_2 ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2402:1: ( ( rule__Relationship__RefNameAssignment_2 ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2402:1: ( ( rule__Relationship__RefNameAssignment_2 ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2403:1: ( rule__Relationship__RefNameAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAssignment_2()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2404:1: ( rule__Relationship__RefNameAssignment_2 )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2404:2: rule__Relationship__RefNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__RefNameAssignment_2_in_rule__Relationship__Group__2__Impl4781);
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


    // $ANTLR start "rule__Model__TypesAssignment"
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2421:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2425:1: ( ( ruleType ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2426:1: ( ruleType )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2426:1: ( ruleType )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2427:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment4822);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2436:1: rule__Server__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2440:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2441:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2441:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2442:1: RULE_ID
            {
             before(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Server__NameAssignment_14853); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2451:1: rule__Server__ConfigsAssignment_5 : ( ruleConfig ) ;
    public final void rule__Server__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2455:1: ( ( ruleConfig ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2456:1: ( ruleConfig )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2456:1: ( ruleConfig )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2457:1: ruleConfig
            {
             before(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConfig_in_rule__Server__ConfigsAssignment_54884);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2466:1: rule__RootConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RootConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2470:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2471:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2471:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2472:1: RULE_ID
            {
             before(grammarAccess.getRootConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootConfig__NameAssignment_24915); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2481:1: rule__HostNameConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HostNameConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2485:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2486:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2486:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2487:1: RULE_ID
            {
             before(grammarAccess.getHostNameConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HostNameConfig__NameAssignment_24946); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2496:1: rule__PortConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PortConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2500:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2501:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2501:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2502:1: RULE_ID
            {
             before(grammarAccess.getPortConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PortConfig__NameAssignment_24977); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2511:1: rule__LogConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LogConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2515:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2516:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2516:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2517:1: RULE_ID
            {
             before(grammarAccess.getLogConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LogConfig__NameAssignment_25008); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2526:1: rule__SqldbConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SqldbConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2530:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2531:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2531:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2532:1: RULE_ID
            {
             before(grammarAccess.getSqldbConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SqldbConfig__NameAssignment_25039); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2541:1: rule__ResourceConfig__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ResourceConfig__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2545:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2546:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2546:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2547:1: RULE_ID
            {
             before(grammarAccess.getResourceConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceConfig__NameAssignment_25070); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2556:1: rule__DomainModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2560:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2561:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2561:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2562:1: RULE_ID
            {
             before(grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainModel__NameAssignment_15101); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2571:1: rule__DomainModel__EntitysAssignment_5 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitysAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2575:1: ( ( ruleEntity ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2576:1: ( ruleEntity )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2576:1: ( ruleEntity )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2577:1: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__DomainModel__EntitysAssignment_55132);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2586:1: rule__DomainModel__RelationshipsAssignment_9 : ( ruleRelationship ) ;
    public final void rule__DomainModel__RelationshipsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2590:1: ( ( ruleRelationship ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2591:1: ( ruleRelationship )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2591:1: ( ruleRelationship )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2592:1: ruleRelationship
            {
             before(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__DomainModel__RelationshipsAssignment_95163);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2601:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2605:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2606:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2606:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2607:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_05194); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2616:1: rule__Entity__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2620:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2621:1: ( ruleAttribute )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2621:1: ( ruleAttribute )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2622:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_25225);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2631:1: rule__StringAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2635:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2636:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2636:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2637:1: RULE_ID
            {
             before(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringAttribute__NameAssignment_15256); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2646:1: rule__NumberAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumberAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2650:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2651:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2651:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2652:1: RULE_ID
            {
             before(grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumberAttribute__NameAssignment_15287); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2661:1: rule__ImageAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImageAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2665:1: ( ( RULE_ID ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2666:1: ( RULE_ID )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2666:1: ( RULE_ID )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2667:1: RULE_ID
            {
             before(grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageAttribute__NameAssignment_15318); 
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2676:1: rule__Relationship__NameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2680:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2681:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2681:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2682:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2683:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2684:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationshipAccess().getNameAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relationship__NameAssignment_05353);
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
    // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2695:1: rule__Relationship__RefNameAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__RefNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2699:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2700:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2700:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2701:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2702:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalServerGeneratorLanguage.g:2703:1: ruleQualifiedName
            {
             before(grammarAccess.getRelationshipAccess().getRefNameAttributeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relationship__RefNameAssignment_25392);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000400802L});
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
    public static final BitSet FOLLOW_ruleServer_in_rule__Type__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_rule__Type__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_rule__Config__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_rule__Config__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_rule__Config__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_rule__Config__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_rule__Config__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_rule__Config__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_rule__Attribute__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_rule__Attribute__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__01381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Server__Group__1_in_rule__Server__Group__01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Server__Group__0__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__11443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Server__Group__2_in_rule__Server__Group__11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__21503 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Server__Group__3_in_rule__Server__Group__21506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Server__Group__2__Impl1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__31565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Server__Group__4_in_rule__Server__Group__31568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Server__Group__3__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__41627 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_rule__Server__Group__5_in_rule__Server__Group__41630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Server__Group__4__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__51689 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_rule__Server__Group__6_in_rule__Server__Group__51692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__ConfigsAssignment_5_in_rule__Server__Group__5__Impl1719 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_rule__Server__Group__6__Impl_in_rule__Server__Group__61750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Server__Group__7_in_rule__Server__Group__61753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Server__Group__6__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Server__Group__7__Impl_in_rule__Server__Group__71812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Server__Group__7__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__0__Impl_in_rule__RootConfig__Group__01887 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__1_in_rule__RootConfig__Group__01890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RootConfig__Group__0__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__1__Impl_in_rule__RootConfig__Group__11949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__2_in_rule__RootConfig__Group__11952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RootConfig__Group__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__Group__2__Impl_in_rule__RootConfig__Group__22011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootConfig__NameAssignment_2_in_rule__RootConfig__Group__2__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__0__Impl_in_rule__HostNameConfig__Group__02074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__1_in_rule__HostNameConfig__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HostNameConfig__Group__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__1__Impl_in_rule__HostNameConfig__Group__12136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__2_in_rule__HostNameConfig__Group__12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__HostNameConfig__Group__1__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__Group__2__Impl_in_rule__HostNameConfig__Group__22198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostNameConfig__NameAssignment_2_in_rule__HostNameConfig__Group__2__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__0__Impl_in_rule__PortConfig__Group__02261 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__1_in_rule__PortConfig__Group__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PortConfig__Group__0__Impl2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__1__Impl_in_rule__PortConfig__Group__12323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__2_in_rule__PortConfig__Group__12326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PortConfig__Group__1__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__Group__2__Impl_in_rule__PortConfig__Group__22385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortConfig__NameAssignment_2_in_rule__PortConfig__Group__2__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__0__Impl_in_rule__LogConfig__Group__02448 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__1_in_rule__LogConfig__Group__02451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogConfig__Group__0__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__1__Impl_in_rule__LogConfig__Group__12510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__2_in_rule__LogConfig__Group__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LogConfig__Group__1__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__Group__2__Impl_in_rule__LogConfig__Group__22572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogConfig__NameAssignment_2_in_rule__LogConfig__Group__2__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__0__Impl_in_rule__SqldbConfig__Group__02635 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__1_in_rule__SqldbConfig__Group__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SqldbConfig__Group__0__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__1__Impl_in_rule__SqldbConfig__Group__12697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__2_in_rule__SqldbConfig__Group__12700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SqldbConfig__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__Group__2__Impl_in_rule__SqldbConfig__Group__22759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SqldbConfig__NameAssignment_2_in_rule__SqldbConfig__Group__2__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__0__Impl_in_rule__ResourceConfig__Group__02822 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__1_in_rule__ResourceConfig__Group__02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ResourceConfig__Group__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__1__Impl_in_rule__ResourceConfig__Group__12884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__2_in_rule__ResourceConfig__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ResourceConfig__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__Group__2__Impl_in_rule__ResourceConfig__Group__22946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceConfig__NameAssignment_2_in_rule__ResourceConfig__Group__2__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__03009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DomainModel__Group__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__13071 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__2_in_rule__DomainModel__Group__13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__NameAssignment_1_in_rule__DomainModel__Group__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__2__Impl_in_rule__DomainModel__Group__23131 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__3_in_rule__DomainModel__Group__23134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DomainModel__Group__2__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__3__Impl_in_rule__DomainModel__Group__33193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__4_in_rule__DomainModel__Group__33196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DomainModel__Group__3__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__4__Impl_in_rule__DomainModel__Group__43255 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__5_in_rule__DomainModel__Group__43258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DomainModel__Group__4__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__5__Impl_in_rule__DomainModel__Group__53317 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__6_in_rule__DomainModel__Group__53320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__EntitysAssignment_5_in_rule__DomainModel__Group__5__Impl3347 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__6__Impl_in_rule__DomainModel__Group__63378 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__7_in_rule__DomainModel__Group__63381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainModel__Group__6__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__7__Impl_in_rule__DomainModel__Group__73440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__8_in_rule__DomainModel__Group__73443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DomainModel__Group__7__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__8__Impl_in_rule__DomainModel__Group__83502 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__9_in_rule__DomainModel__Group__83505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DomainModel__Group__8__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__9__Impl_in_rule__DomainModel__Group__93564 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__10_in_rule__DomainModel__Group__93567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__RelationshipsAssignment_9_in_rule__DomainModel__Group__9__Impl3594 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__10__Impl_in_rule__DomainModel__Group__103625 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__11_in_rule__DomainModel__Group__103628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainModel__Group__10__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__11__Impl_in_rule__DomainModel__Group__113687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainModel__Group__11__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03770 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13830 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__1__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23892 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_2_in_rule__Entity__Group__2__Impl3922 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__3__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__0__Impl_in_rule__StringAttribute__Group__04020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__1_in_rule__StringAttribute__Group__04023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StringAttribute__Group__0__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__Group__1__Impl_in_rule__StringAttribute__Group__14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__NameAssignment_1_in_rule__StringAttribute__Group__1__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__0__Impl_in_rule__NumberAttribute__Group__04143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__1_in_rule__NumberAttribute__Group__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NumberAttribute__Group__0__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__Group__1__Impl_in_rule__NumberAttribute__Group__14205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberAttribute__NameAssignment_1_in_rule__NumberAttribute__Group__1__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__0__Impl_in_rule__ImageAttribute__Group__04266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__1_in_rule__ImageAttribute__Group__04269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ImageAttribute__Group__0__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__Group__1__Impl_in_rule__ImageAttribute__Group__14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageAttribute__NameAssignment_1_in_rule__ImageAttribute__Group__1__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04389 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4475 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04632 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__NameAssignment_0_in_rule__Relationship__Group__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relationship__Group__1__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__RefNameAssignment_2_in_rule__Relationship__Group__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Server__NameAssignment_14853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_rule__Server__ConfigsAssignment_54884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootConfig__NameAssignment_24915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HostNameConfig__NameAssignment_24946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PortConfig__NameAssignment_24977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LogConfig__NameAssignment_25008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SqldbConfig__NameAssignment_25039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceConfig__NameAssignment_25070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainModel__NameAssignment_15101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainModel__EntitysAssignment_55132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__DomainModel__RelationshipsAssignment_95163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_25225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringAttribute__NameAssignment_15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumberAttribute__NameAssignment_15287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageAttribute__NameAssignment_15318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__NameAssignment_05353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__RefNameAssignment_25392 = new BitSet(new long[]{0x0000000000000002L});

}