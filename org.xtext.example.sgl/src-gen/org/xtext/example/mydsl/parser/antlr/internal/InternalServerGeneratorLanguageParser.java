package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ServerGeneratorLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServerGeneratorLanguageParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g"; }



     	private ServerGeneratorLanguageGrammarAccess grammarAccess;
     	
        public InternalServerGeneratorLanguageParser(TokenStream input, ServerGeneratorLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ServerGeneratorLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:76:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:79:28: ( ( (lv_types_0_0= ruleType ) )* )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:80:1: ( (lv_types_0_0= ruleType ) )*
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:80:1: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:81:1: (lv_types_0_0= ruleType )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:81:1: (lv_types_0_0= ruleType )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:82:3: lv_types_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel130);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:106:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:107:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:108:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:115:1: ruleType returns [EObject current=null] : (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Server_0 = null;

        EObject this_DomainModel_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:118:28: ( (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:119:1: (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:119:1: (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel )
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
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:120:5: this_Server_0= ruleServer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleServer_in_ruleType223);
                    this_Server_0=ruleServer();

                    state._fsp--;

                     
                            current = this_Server_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:130:5: this_DomainModel_1= ruleDomainModel
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDomainModel_in_ruleType250);
                    this_DomainModel_1=ruleDomainModel();

                    state._fsp--;

                     
                            current = this_DomainModel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleServer"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:146:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:147:2: (iv_ruleServer= ruleServer EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:148:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_ruleServer_in_entryRuleServer285);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServer295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:155:1: ruleServer returns [EObject current=null] : (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_Configs_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:158:28: ( (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:159:1: (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:159:1: (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:159:3: otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleServer332); 

                	newLeafNode(otherlv_0, grammarAccess.getServerAccess().getSERVERKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:164:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServer349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleServer366); 

                	newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleServer378); 

                	newLeafNode(otherlv_3, grammarAccess.getServerAccess().getCONFIGKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleServer390); 

                	newLeafNode(otherlv_4, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:193:1: ( (lv_Configs_5_0= ruleConfig ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=17 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:194:1: (lv_Configs_5_0= ruleConfig )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:194:1: (lv_Configs_5_0= ruleConfig )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:195:3: lv_Configs_5_0= ruleConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfig_in_ruleServer411);
            	    lv_Configs_5_0=ruleConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Configs",
            	            		lv_Configs_5_0, 
            	            		"Config");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleServer424); 

                	newLeafNode(otherlv_6, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleServer436); 

                	newLeafNode(otherlv_7, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:227:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:228:2: (iv_ruleConfig= ruleConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:229:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig472);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:236:1: ruleConfig returns [EObject current=null] : (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        EObject this_rootConfig_0 = null;

        EObject this_hostNameConfig_1 = null;

        EObject this_portConfig_2 = null;

        EObject this_logConfig_3 = null;

        EObject this_sqldbConfig_4 = null;

        EObject this_resourceConfig_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:239:28: ( (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:240:1: (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:240:1: (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case 21:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:241:5: this_rootConfig_0= rulerootConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulerootConfig_in_ruleConfig529);
                    this_rootConfig_0=rulerootConfig();

                    state._fsp--;

                     
                            current = this_rootConfig_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:251:5: this_hostNameConfig_1= rulehostNameConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulehostNameConfig_in_ruleConfig556);
                    this_hostNameConfig_1=rulehostNameConfig();

                    state._fsp--;

                     
                            current = this_hostNameConfig_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:261:5: this_portConfig_2= ruleportConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleportConfig_in_ruleConfig583);
                    this_portConfig_2=ruleportConfig();

                    state._fsp--;

                     
                            current = this_portConfig_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:271:5: this_logConfig_3= rulelogConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulelogConfig_in_ruleConfig610);
                    this_logConfig_3=rulelogConfig();

                    state._fsp--;

                     
                            current = this_logConfig_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:281:5: this_sqldbConfig_4= rulesqldbConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulesqldbConfig_in_ruleConfig637);
                    this_sqldbConfig_4=rulesqldbConfig();

                    state._fsp--;

                     
                            current = this_sqldbConfig_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:291:5: this_resourceConfig_5= ruleresourceConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleresourceConfig_in_ruleConfig664);
                    this_resourceConfig_5=ruleresourceConfig();

                    state._fsp--;

                     
                            current = this_resourceConfig_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRulerootConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:307:1: entryRulerootConfig returns [EObject current=null] : iv_rulerootConfig= rulerootConfig EOF ;
    public final EObject entryRulerootConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerootConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:308:2: (iv_rulerootConfig= rulerootConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:309:2: iv_rulerootConfig= rulerootConfig EOF
            {
             newCompositeNode(grammarAccess.getRootConfigRule()); 
            pushFollow(FOLLOW_rulerootConfig_in_entryRulerootConfig699);
            iv_rulerootConfig=rulerootConfig();

            state._fsp--;

             current =iv_rulerootConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerootConfig709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerootConfig"


    // $ANTLR start "rulerootConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:316:1: rulerootConfig returns [EObject current=null] : (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulerootConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:319:28: ( (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:320:1: (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:320:1: (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:320:3: otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulerootConfig746); 

                	newLeafNode(otherlv_0, grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulerootConfig758); 

                	newLeafNode(otherlv_1, grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:328:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:329:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:329:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:330:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerootConfig775); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRootConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRootConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerootConfig"


    // $ANTLR start "entryRulehostNameConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:354:1: entryRulehostNameConfig returns [EObject current=null] : iv_rulehostNameConfig= rulehostNameConfig EOF ;
    public final EObject entryRulehostNameConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehostNameConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:355:2: (iv_rulehostNameConfig= rulehostNameConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:356:2: iv_rulehostNameConfig= rulehostNameConfig EOF
            {
             newCompositeNode(grammarAccess.getHostNameConfigRule()); 
            pushFollow(FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig816);
            iv_rulehostNameConfig=rulehostNameConfig();

            state._fsp--;

             current =iv_rulehostNameConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulehostNameConfig826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulehostNameConfig"


    // $ANTLR start "rulehostNameConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:363:1: rulehostNameConfig returns [EObject current=null] : (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulehostNameConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:366:28: ( (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:367:1: (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:367:1: (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:367:3: otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulehostNameConfig863); 

                	newLeafNode(otherlv_0, grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulehostNameConfig875); 

                	newLeafNode(otherlv_1, grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:375:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:376:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:376:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:377:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulehostNameConfig892); 

            			newLeafNode(lv_name_2_0, grammarAccess.getHostNameConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHostNameConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulehostNameConfig"


    // $ANTLR start "entryRuleportConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:401:1: entryRuleportConfig returns [EObject current=null] : iv_ruleportConfig= ruleportConfig EOF ;
    public final EObject entryRuleportConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleportConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:402:2: (iv_ruleportConfig= ruleportConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:403:2: iv_ruleportConfig= ruleportConfig EOF
            {
             newCompositeNode(grammarAccess.getPortConfigRule()); 
            pushFollow(FOLLOW_ruleportConfig_in_entryRuleportConfig933);
            iv_ruleportConfig=ruleportConfig();

            state._fsp--;

             current =iv_ruleportConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleportConfig943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleportConfig"


    // $ANTLR start "ruleportConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:410:1: ruleportConfig returns [EObject current=null] : (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleportConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:413:28: ( (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:414:1: (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:414:1: (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:414:3: otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleportConfig980); 

                	newLeafNode(otherlv_0, grammarAccess.getPortConfigAccess().getPORTKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleportConfig992); 

                	newLeafNode(otherlv_1, grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:422:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:423:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:423:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:424:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleportConfig1009); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPortConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleportConfig"


    // $ANTLR start "entryRulelogConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:448:1: entryRulelogConfig returns [EObject current=null] : iv_rulelogConfig= rulelogConfig EOF ;
    public final EObject entryRulelogConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:449:2: (iv_rulelogConfig= rulelogConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:450:2: iv_rulelogConfig= rulelogConfig EOF
            {
             newCompositeNode(grammarAccess.getLogConfigRule()); 
            pushFollow(FOLLOW_rulelogConfig_in_entryRulelogConfig1050);
            iv_rulelogConfig=rulelogConfig();

            state._fsp--;

             current =iv_rulelogConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelogConfig1060); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogConfig"


    // $ANTLR start "rulelogConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:457:1: rulelogConfig returns [EObject current=null] : (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulelogConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:460:28: ( (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:461:1: (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:461:1: (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:461:3: otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulelogConfig1097); 

                	newLeafNode(otherlv_0, grammarAccess.getLogConfigAccess().getLOGKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulelogConfig1109); 

                	newLeafNode(otherlv_1, grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:469:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:470:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:470:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:471:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelogConfig1126); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLogConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLogConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogConfig"


    // $ANTLR start "entryRulesqldbConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:495:1: entryRulesqldbConfig returns [EObject current=null] : iv_rulesqldbConfig= rulesqldbConfig EOF ;
    public final EObject entryRulesqldbConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesqldbConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:496:2: (iv_rulesqldbConfig= rulesqldbConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:497:2: iv_rulesqldbConfig= rulesqldbConfig EOF
            {
             newCompositeNode(grammarAccess.getSqldbConfigRule()); 
            pushFollow(FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig1167);
            iv_rulesqldbConfig=rulesqldbConfig();

            state._fsp--;

             current =iv_rulesqldbConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesqldbConfig1177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesqldbConfig"


    // $ANTLR start "rulesqldbConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:504:1: rulesqldbConfig returns [EObject current=null] : (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesqldbConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:507:28: ( (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:508:1: (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:508:1: (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:508:3: otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulesqldbConfig1214); 

                	newLeafNode(otherlv_0, grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulesqldbConfig1226); 

                	newLeafNode(otherlv_1, grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:516:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:517:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:517:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:518:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesqldbConfig1243); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSqldbConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSqldbConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesqldbConfig"


    // $ANTLR start "entryRuleresourceConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:542:1: entryRuleresourceConfig returns [EObject current=null] : iv_ruleresourceConfig= ruleresourceConfig EOF ;
    public final EObject entryRuleresourceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresourceConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:543:2: (iv_ruleresourceConfig= ruleresourceConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:544:2: iv_ruleresourceConfig= ruleresourceConfig EOF
            {
             newCompositeNode(grammarAccess.getResourceConfigRule()); 
            pushFollow(FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig1284);
            iv_ruleresourceConfig=ruleresourceConfig();

            state._fsp--;

             current =iv_ruleresourceConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresourceConfig1294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleresourceConfig"


    // $ANTLR start "ruleresourceConfig"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:551:1: ruleresourceConfig returns [EObject current=null] : (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleresourceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:554:28: ( (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:555:1: (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:555:1: (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:555:3: otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleresourceConfig1331); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleresourceConfig1343); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:563:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:564:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:564:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:565:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleresourceConfig1360); 

            			newLeafNode(lv_name_2_0, grammarAccess.getResourceConfigAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresourceConfig"


    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:589:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:590:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:591:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel1401);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel1411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:598:1: ruleDomainModel returns [EObject current=null] : (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_Entitys_5_0 = null;

        EObject lv_Relationships_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:601:28: ( (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:602:1: (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:602:1: (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:602:3: otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDomainModel1448); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:607:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:607:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainModel1465); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1482); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDomainModel1494); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getENTITYSKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1506); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:636:1: ( (lv_Entitys_5_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:637:1: (lv_Entitys_5_0= ruleEntity )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:637:1: (lv_Entitys_5_0= ruleEntity )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:638:3: lv_Entitys_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomainModel1527);
            	    lv_Entitys_5_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Entitys",
            	            		lv_Entitys_5_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1540); 

                	newLeafNode(otherlv_6, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleDomainModel1552); 

                	newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7());
                
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1564); 

                	newLeafNode(otherlv_8, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:666:1: ( (lv_Relationships_9_0= ruleRelationship ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:667:1: (lv_Relationships_9_0= ruleRelationship )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:667:1: (lv_Relationships_9_0= ruleRelationship )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:668:3: lv_Relationships_9_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleDomainModel1585);
            	    lv_Relationships_9_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Relationships",
            	            		lv_Relationships_9_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1598); 

                	newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1610); 

                	newLeafNode(otherlv_11, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:700:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:701:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:702:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1646);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:709:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:712:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:713:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:713:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:713:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:713:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:714:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:714:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:715:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1698); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEntity1715); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:735:1: ( (lv_Attributes_2_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:736:1: (lv_Attributes_2_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:736:1: (lv_Attributes_2_0= ruleAttribute )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:737:3: lv_Attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1736);
            	    lv_Attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Attributes",
            	            		lv_Attributes_2_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEntity1749); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:765:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:766:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:767:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1785);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1795); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:774:1: ruleAttribute returns [EObject current=null] : (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttribute_0 = null;

        EObject this_NumberAttribute_1 = null;

        EObject this_ImageAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:777:28: ( (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:778:1: (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:778:1: (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:779:5: this_StringAttribute_0= ruleStringAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttribute_in_ruleAttribute1842);
                    this_StringAttribute_0=ruleStringAttribute();

                    state._fsp--;

                     
                            current = this_StringAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:789:5: this_NumberAttribute_1= ruleNumberAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberAttribute_in_ruleAttribute1869);
                    this_NumberAttribute_1=ruleNumberAttribute();

                    state._fsp--;

                     
                            current = this_NumberAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:799:5: this_ImageAttribute_2= ruleImageAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImageAttribute_in_ruleAttribute1896);
                    this_ImageAttribute_2=ruleImageAttribute();

                    state._fsp--;

                     
                            current = this_ImageAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:815:1: entryRuleStringAttribute returns [EObject current=null] : iv_ruleStringAttribute= ruleStringAttribute EOF ;
    public final EObject entryRuleStringAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:816:2: (iv_ruleStringAttribute= ruleStringAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:817:2: iv_ruleStringAttribute= ruleStringAttribute EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeRule()); 
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1931);
            iv_ruleStringAttribute=ruleStringAttribute();

            state._fsp--;

             current =iv_ruleStringAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute1941); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:824:1: ruleStringAttribute returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStringAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:827:28: ( (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:828:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:828:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:828:3: otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStringAttribute1978); 

                	newLeafNode(otherlv_0, grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:832:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:833:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:833:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:834:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringAttribute1995); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleNumberAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:858:1: entryRuleNumberAttribute returns [EObject current=null] : iv_ruleNumberAttribute= ruleNumberAttribute EOF ;
    public final EObject entryRuleNumberAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:859:2: (iv_ruleNumberAttribute= ruleNumberAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:860:2: iv_ruleNumberAttribute= ruleNumberAttribute EOF
            {
             newCompositeNode(grammarAccess.getNumberAttributeRule()); 
            pushFollow(FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute2036);
            iv_ruleNumberAttribute=ruleNumberAttribute();

            state._fsp--;

             current =iv_ruleNumberAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberAttribute2046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberAttribute"


    // $ANTLR start "ruleNumberAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:867:1: ruleNumberAttribute returns [EObject current=null] : (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNumberAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:870:28: ( (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:871:1: (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:871:1: (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:871:3: otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleNumberAttribute2083); 

                	newLeafNode(otherlv_0, grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:875:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:876:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:876:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:877:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberAttribute2100); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberAttribute"


    // $ANTLR start "entryRuleImageAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:901:1: entryRuleImageAttribute returns [EObject current=null] : iv_ruleImageAttribute= ruleImageAttribute EOF ;
    public final EObject entryRuleImageAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:902:2: (iv_ruleImageAttribute= ruleImageAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:903:2: iv_ruleImageAttribute= ruleImageAttribute EOF
            {
             newCompositeNode(grammarAccess.getImageAttributeRule()); 
            pushFollow(FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute2141);
            iv_ruleImageAttribute=ruleImageAttribute();

            state._fsp--;

             current =iv_ruleImageAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageAttribute2151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageAttribute"


    // $ANTLR start "ruleImageAttribute"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:910:1: ruleImageAttribute returns [EObject current=null] : (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleImageAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:913:28: ( (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:914:1: (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:914:1: (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:914:3: otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleImageAttribute2188); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:918:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:919:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:919:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:920:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageAttribute2205); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:944:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:945:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:946:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2247);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:953:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:956:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:957:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:957:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:957:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2298); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:964:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:965:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName2317); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2332); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRelationship"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:985:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:986:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:987:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2379);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2389); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:994:1: ruleRelationship returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:997:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:998:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:998:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:998:2: ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:998:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:999:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1000:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelationship2437);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleRelationship2449); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1017:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1018:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1018:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1019:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelationship2472);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel130 = new BitSet(new long[]{0x0000000000400802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_entryRuleServer285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServer295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServer332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServer349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServer366 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleServer378 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServer390 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleServer411 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_14_in_ruleServer424 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleServer436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_ruleConfig529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_ruleConfig556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_ruleConfig583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_ruleConfig610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_ruleConfig637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_ruleConfig664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_entryRulerootConfig699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerootConfig709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulerootConfig746 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulerootConfig758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerootConfig775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehostNameConfig826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulehostNameConfig863 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulehostNameConfig875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulehostNameConfig892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_entryRuleportConfig933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleportConfig943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleportConfig980 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleportConfig992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleportConfig1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_entryRulelogConfig1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogConfig1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulelogConfig1097 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulelogConfig1109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelogConfig1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesqldbConfig1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulesqldbConfig1214 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulesqldbConfig1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesqldbConfig1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresourceConfig1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleresourceConfig1331 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleresourceConfig1343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleresourceConfig1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDomainModel1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainModel1465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1482 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDomainModel1494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1506 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainModel1527 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1540 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDomainModel1552 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1564 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleDomainModel1585 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1598 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1698 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1715 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1736 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_ruleAttribute1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_ruleAttribute1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_ruleAttribute1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStringAttribute1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringAttribute1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberAttribute2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNumberAttribute2083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberAttribute2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageAttribute2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImageAttribute2188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageAttribute2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2298 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2332 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship2437 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationship2449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship2472 = new BitSet(new long[]{0x0000000000000002L});

}