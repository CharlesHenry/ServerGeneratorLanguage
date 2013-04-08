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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SERVER'", "'{'", "'CONFIG'", "'}'", "'ROOTDIR'", "'='", "'HOSTNAME'", "'PORT'", "'LOG'", "'SQLDB'", "'RESOURCE'", "'DOMAINMODEL'", "'ENTITYS'", "'ENTITY_RELATIONSHIP'", "'STRING'", "'NUMBER'", "'IMAGE'", "'.'", "'->'", "'GUI'", "'LAYOUT'", "'LABEL'", "'TEXT'", "'DATA'", "'BUTTON'", "'FUNCTION'", "'INPUT'", "'TYPE'", "'('", "')'", "'string'", "'int'", "'id'"
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

                if ( (LA1_0==11||LA1_0==22||LA1_0==30) ) {
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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:115:1: ruleType returns [EObject current=null] : (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel | this_Gui_2= ruleGui ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Server_0 = null;

        EObject this_DomainModel_1 = null;

        EObject this_Gui_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:118:28: ( (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel | this_Gui_2= ruleGui ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:119:1: (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel | this_Gui_2= ruleGui )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:119:1: (this_Server_0= ruleServer | this_DomainModel_1= ruleDomainModel | this_Gui_2= ruleGui )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 30:
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
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:140:5: this_Gui_2= ruleGui
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getGuiParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGui_in_ruleType277);
                    this_Gui_2=ruleGui();

                    state._fsp--;

                     
                            current = this_Gui_2; 
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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:156:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:157:2: (iv_ruleServer= ruleServer EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:158:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_ruleServer_in_entryRuleServer312);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServer322); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:165:1: ruleServer returns [EObject current=null] : (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' ) ;
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
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:168:28: ( (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:169:1: (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:169:1: (otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:169:3: otherlv_0= 'SERVER' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'CONFIG' otherlv_4= '{' ( (lv_Configs_5_0= ruleConfig ) )* otherlv_6= '}' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleServer359); 

                	newLeafNode(otherlv_0, grammarAccess.getServerAccess().getSERVERKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:173:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:174:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:174:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:175:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServer376); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleServer393); 

                	newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleServer405); 

                	newLeafNode(otherlv_3, grammarAccess.getServerAccess().getCONFIGKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleServer417); 

                	newLeafNode(otherlv_4, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:203:1: ( (lv_Configs_5_0= ruleConfig ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=17 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:204:1: (lv_Configs_5_0= ruleConfig )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:204:1: (lv_Configs_5_0= ruleConfig )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:205:3: lv_Configs_5_0= ruleConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfig_in_ruleServer438);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleServer451); 

                	newLeafNode(otherlv_6, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleServer463); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:237:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:238:2: (iv_ruleConfig= ruleConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:239:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig499);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig509); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:246:1: ruleConfig returns [EObject current=null] : (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig ) ;
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
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:249:28: ( (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:250:1: (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:250:1: (this_rootConfig_0= rulerootConfig | this_hostNameConfig_1= rulehostNameConfig | this_portConfig_2= ruleportConfig | this_logConfig_3= rulelogConfig | this_sqldbConfig_4= rulesqldbConfig | this_resourceConfig_5= ruleresourceConfig )
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
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:251:5: this_rootConfig_0= rulerootConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulerootConfig_in_ruleConfig556);
                    this_rootConfig_0=rulerootConfig();

                    state._fsp--;

                     
                            current = this_rootConfig_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:261:5: this_hostNameConfig_1= rulehostNameConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulehostNameConfig_in_ruleConfig583);
                    this_hostNameConfig_1=rulehostNameConfig();

                    state._fsp--;

                     
                            current = this_hostNameConfig_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:271:5: this_portConfig_2= ruleportConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleportConfig_in_ruleConfig610);
                    this_portConfig_2=ruleportConfig();

                    state._fsp--;

                     
                            current = this_portConfig_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:281:5: this_logConfig_3= rulelogConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulelogConfig_in_ruleConfig637);
                    this_logConfig_3=rulelogConfig();

                    state._fsp--;

                     
                            current = this_logConfig_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:291:5: this_sqldbConfig_4= rulesqldbConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulesqldbConfig_in_ruleConfig664);
                    this_sqldbConfig_4=rulesqldbConfig();

                    state._fsp--;

                     
                            current = this_sqldbConfig_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:301:5: this_resourceConfig_5= ruleresourceConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleresourceConfig_in_ruleConfig691);
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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:317:1: entryRulerootConfig returns [EObject current=null] : iv_rulerootConfig= rulerootConfig EOF ;
    public final EObject entryRulerootConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerootConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:318:2: (iv_rulerootConfig= rulerootConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:319:2: iv_rulerootConfig= rulerootConfig EOF
            {
             newCompositeNode(grammarAccess.getRootConfigRule()); 
            pushFollow(FOLLOW_rulerootConfig_in_entryRulerootConfig726);
            iv_rulerootConfig=rulerootConfig();

            state._fsp--;

             current =iv_rulerootConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerootConfig736); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:326:1: rulerootConfig returns [EObject current=null] : (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulerootConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:329:28: ( (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:330:1: (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:330:1: (otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:330:3: otherlv_0= 'ROOTDIR' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulerootConfig773); 

                	newLeafNode(otherlv_0, grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulerootConfig785); 

                	newLeafNode(otherlv_1, grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:338:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:339:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:339:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:340:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerootConfig802); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:364:1: entryRulehostNameConfig returns [EObject current=null] : iv_rulehostNameConfig= rulehostNameConfig EOF ;
    public final EObject entryRulehostNameConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehostNameConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:365:2: (iv_rulehostNameConfig= rulehostNameConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:366:2: iv_rulehostNameConfig= rulehostNameConfig EOF
            {
             newCompositeNode(grammarAccess.getHostNameConfigRule()); 
            pushFollow(FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig843);
            iv_rulehostNameConfig=rulehostNameConfig();

            state._fsp--;

             current =iv_rulehostNameConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulehostNameConfig853); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:373:1: rulehostNameConfig returns [EObject current=null] : (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulehostNameConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:376:28: ( (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:377:1: (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:377:1: (otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:377:3: otherlv_0= 'HOSTNAME' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulehostNameConfig890); 

                	newLeafNode(otherlv_0, grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulehostNameConfig902); 

                	newLeafNode(otherlv_1, grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:385:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:386:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:386:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:387:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulehostNameConfig919); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:411:1: entryRuleportConfig returns [EObject current=null] : iv_ruleportConfig= ruleportConfig EOF ;
    public final EObject entryRuleportConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleportConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:412:2: (iv_ruleportConfig= ruleportConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:413:2: iv_ruleportConfig= ruleportConfig EOF
            {
             newCompositeNode(grammarAccess.getPortConfigRule()); 
            pushFollow(FOLLOW_ruleportConfig_in_entryRuleportConfig960);
            iv_ruleportConfig=ruleportConfig();

            state._fsp--;

             current =iv_ruleportConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleportConfig970); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:420:1: ruleportConfig returns [EObject current=null] : (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleportConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:423:28: ( (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:424:1: (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:424:1: (otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:424:3: otherlv_0= 'PORT' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleportConfig1007); 

                	newLeafNode(otherlv_0, grammarAccess.getPortConfigAccess().getPORTKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleportConfig1019); 

                	newLeafNode(otherlv_1, grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:432:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:433:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:433:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleportConfig1036); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:458:1: entryRulelogConfig returns [EObject current=null] : iv_rulelogConfig= rulelogConfig EOF ;
    public final EObject entryRulelogConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:459:2: (iv_rulelogConfig= rulelogConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:460:2: iv_rulelogConfig= rulelogConfig EOF
            {
             newCompositeNode(grammarAccess.getLogConfigRule()); 
            pushFollow(FOLLOW_rulelogConfig_in_entryRulelogConfig1077);
            iv_rulelogConfig=rulelogConfig();

            state._fsp--;

             current =iv_rulelogConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelogConfig1087); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:467:1: rulelogConfig returns [EObject current=null] : (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulelogConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:470:28: ( (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:471:1: (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:471:1: (otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:471:3: otherlv_0= 'LOG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulelogConfig1124); 

                	newLeafNode(otherlv_0, grammarAccess.getLogConfigAccess().getLOGKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulelogConfig1136); 

                	newLeafNode(otherlv_1, grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:479:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:480:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:480:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:481:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelogConfig1153); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:505:1: entryRulesqldbConfig returns [EObject current=null] : iv_rulesqldbConfig= rulesqldbConfig EOF ;
    public final EObject entryRulesqldbConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesqldbConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:506:2: (iv_rulesqldbConfig= rulesqldbConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:507:2: iv_rulesqldbConfig= rulesqldbConfig EOF
            {
             newCompositeNode(grammarAccess.getSqldbConfigRule()); 
            pushFollow(FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig1194);
            iv_rulesqldbConfig=rulesqldbConfig();

            state._fsp--;

             current =iv_rulesqldbConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesqldbConfig1204); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:514:1: rulesqldbConfig returns [EObject current=null] : (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesqldbConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:517:28: ( (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:518:1: (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:518:1: (otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:518:3: otherlv_0= 'SQLDB' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulesqldbConfig1241); 

                	newLeafNode(otherlv_0, grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulesqldbConfig1253); 

                	newLeafNode(otherlv_1, grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:526:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:527:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:527:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:528:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesqldbConfig1270); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:552:1: entryRuleresourceConfig returns [EObject current=null] : iv_ruleresourceConfig= ruleresourceConfig EOF ;
    public final EObject entryRuleresourceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresourceConfig = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:553:2: (iv_ruleresourceConfig= ruleresourceConfig EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:554:2: iv_ruleresourceConfig= ruleresourceConfig EOF
            {
             newCompositeNode(grammarAccess.getResourceConfigRule()); 
            pushFollow(FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig1311);
            iv_ruleresourceConfig=ruleresourceConfig();

            state._fsp--;

             current =iv_ruleresourceConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleresourceConfig1321); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:561:1: ruleresourceConfig returns [EObject current=null] : (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleresourceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:564:28: ( (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:565:1: (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:565:1: (otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:565:3: otherlv_0= 'RESOURCE' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleresourceConfig1358); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleresourceConfig1370); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:573:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:574:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:574:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:575:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleresourceConfig1387); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:599:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:600:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:601:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel1428);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel1438); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:608:1: ruleDomainModel returns [EObject current=null] : (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' ) ;
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
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:611:28: ( (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:612:1: (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:612:1: (otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:612:3: otherlv_0= 'DOMAINMODEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ENTITYS' otherlv_4= '{' ( (lv_Entitys_5_0= ruleEntity ) )* otherlv_6= '}' otherlv_7= 'ENTITY_RELATIONSHIP' otherlv_8= '{' ( (lv_Relationships_9_0= ruleRelationship ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDomainModel1475); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:616:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:617:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:617:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:618:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainModel1492); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1509); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDomainModel1521); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getENTITYSKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1533); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:646:1: ( (lv_Entitys_5_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:647:1: (lv_Entitys_5_0= ruleEntity )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:647:1: (lv_Entitys_5_0= ruleEntity )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:648:3: lv_Entitys_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomainModel1554);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1567); 

                	newLeafNode(otherlv_6, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleDomainModel1579); 

                	newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7());
                
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel1591); 

                	newLeafNode(otherlv_8, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:676:1: ( (lv_Relationships_9_0= ruleRelationship ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:677:1: (lv_Relationships_9_0= ruleRelationship )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:677:1: (lv_Relationships_9_0= ruleRelationship )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:678:3: lv_Relationships_9_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleDomainModel1612);
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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1625); 

                	newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel1637); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:710:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:711:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:712:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1673);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1683); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:719:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:722:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:723:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_Attributes_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:723:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:724:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:724:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:725:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1725); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEntity1742); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:745:1: ( (lv_Attributes_2_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:746:1: (lv_Attributes_2_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:746:1: (lv_Attributes_2_0= ruleAttribute )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:747:3: lv_Attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1763);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEntity1776); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:775:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:776:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:777:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1812);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1822); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:784:1: ruleAttribute returns [EObject current=null] : (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_StringAttribute_0 = null;

        EObject this_NumberAttribute_1 = null;

        EObject this_ImageAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:787:28: ( (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:788:1: (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:788:1: (this_StringAttribute_0= ruleStringAttribute | this_NumberAttribute_1= ruleNumberAttribute | this_ImageAttribute_2= ruleImageAttribute )
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
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:789:5: this_StringAttribute_0= ruleStringAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringAttribute_in_ruleAttribute1869);
                    this_StringAttribute_0=ruleStringAttribute();

                    state._fsp--;

                     
                            current = this_StringAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:799:5: this_NumberAttribute_1= ruleNumberAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberAttribute_in_ruleAttribute1896);
                    this_NumberAttribute_1=ruleNumberAttribute();

                    state._fsp--;

                     
                            current = this_NumberAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:809:5: this_ImageAttribute_2= ruleImageAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImageAttribute_in_ruleAttribute1923);
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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:825:1: entryRuleStringAttribute returns [EObject current=null] : iv_ruleStringAttribute= ruleStringAttribute EOF ;
    public final EObject entryRuleStringAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:826:2: (iv_ruleStringAttribute= ruleStringAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:827:2: iv_ruleStringAttribute= ruleStringAttribute EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeRule()); 
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1958);
            iv_ruleStringAttribute=ruleStringAttribute();

            state._fsp--;

             current =iv_ruleStringAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute1968); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:834:1: ruleStringAttribute returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStringAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:837:28: ( (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:838:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:838:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:838:3: otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStringAttribute2005); 

                	newLeafNode(otherlv_0, grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:842:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:843:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:843:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringAttribute2022); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:868:1: entryRuleNumberAttribute returns [EObject current=null] : iv_ruleNumberAttribute= ruleNumberAttribute EOF ;
    public final EObject entryRuleNumberAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:869:2: (iv_ruleNumberAttribute= ruleNumberAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:870:2: iv_ruleNumberAttribute= ruleNumberAttribute EOF
            {
             newCompositeNode(grammarAccess.getNumberAttributeRule()); 
            pushFollow(FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute2063);
            iv_ruleNumberAttribute=ruleNumberAttribute();

            state._fsp--;

             current =iv_ruleNumberAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberAttribute2073); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:877:1: ruleNumberAttribute returns [EObject current=null] : (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNumberAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:880:28: ( (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:881:1: (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:881:1: (otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:881:3: otherlv_0= 'NUMBER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleNumberAttribute2110); 

                	newLeafNode(otherlv_0, grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:885:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:886:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:886:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:887:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberAttribute2127); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:911:1: entryRuleImageAttribute returns [EObject current=null] : iv_ruleImageAttribute= ruleImageAttribute EOF ;
    public final EObject entryRuleImageAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageAttribute = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:912:2: (iv_ruleImageAttribute= ruleImageAttribute EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:913:2: iv_ruleImageAttribute= ruleImageAttribute EOF
            {
             newCompositeNode(grammarAccess.getImageAttributeRule()); 
            pushFollow(FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute2168);
            iv_ruleImageAttribute=ruleImageAttribute();

            state._fsp--;

             current =iv_ruleImageAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageAttribute2178); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:920:1: ruleImageAttribute returns [EObject current=null] : (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleImageAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:923:28: ( (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:924:1: (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:924:1: (otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:924:3: otherlv_0= 'IMAGE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleImageAttribute2215); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:928:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:929:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:929:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:930:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageAttribute2232); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:954:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:955:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:956:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2274);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2285); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:963:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:966:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:967:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:967:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:967:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2325); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:974:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:975:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName2344); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2359); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:995:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:996:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:997:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2406);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2416); 

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
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1004:1: ruleRelationship returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1007:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1008:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1008:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1008:2: ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1008:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1009:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1009:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1010:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelationship2464);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleRelationship2476); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1027:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1028:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1028:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1029:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationshipRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelationship2499);
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


    // $ANTLR start "entryRuleGui"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1050:1: entryRuleGui returns [EObject current=null] : iv_ruleGui= ruleGui EOF ;
    public final EObject entryRuleGui() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGui = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1051:2: (iv_ruleGui= ruleGui EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1052:2: iv_ruleGui= ruleGui EOF
            {
             newCompositeNode(grammarAccess.getGuiRule()); 
            pushFollow(FOLLOW_ruleGui_in_entryRuleGui2535);
            iv_ruleGui=ruleGui();

            state._fsp--;

             current =iv_ruleGui; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGui2545); 

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
    // $ANTLR end "entryRuleGui"


    // $ANTLR start "ruleGui"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1059:1: ruleGui returns [EObject current=null] : (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SERVER' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'LAYOUT' ( (lv_layout_5_0= RULE_INT ) ) otherlv_6= '{' ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )* otherlv_8= '}' ) ;
    public final EObject ruleGui() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_layout_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_GuiFeatures_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1062:28: ( (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SERVER' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'LAYOUT' ( (lv_layout_5_0= RULE_INT ) ) otherlv_6= '{' ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1063:1: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SERVER' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'LAYOUT' ( (lv_layout_5_0= RULE_INT ) ) otherlv_6= '{' ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1063:1: (otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SERVER' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'LAYOUT' ( (lv_layout_5_0= RULE_INT ) ) otherlv_6= '{' ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )* otherlv_8= '}' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1063:3: otherlv_0= 'GUI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SERVER' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'LAYOUT' ( (lv_layout_5_0= RULE_INT ) ) otherlv_6= '{' ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGui2582); 

                	newLeafNode(otherlv_0, grammarAccess.getGuiAccess().getGUIKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1067:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1068:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1068:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1069:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGui2599); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuiAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleGui2616); 

                	newLeafNode(otherlv_2, grammarAccess.getGuiAccess().getSERVERKeyword_2());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1089:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1090:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1090:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1091:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGui2636); 

            		newLeafNode(otherlv_3, grammarAccess.getGuiAccess().getServerServerCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleGui2648); 

                	newLeafNode(otherlv_4, grammarAccess.getGuiAccess().getLAYOUTKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1106:1: ( (lv_layout_5_0= RULE_INT ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1107:1: (lv_layout_5_0= RULE_INT )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1107:1: (lv_layout_5_0= RULE_INT )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1108:3: lv_layout_5_0= RULE_INT
            {
            lv_layout_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGui2665); 

            			newLeafNode(lv_layout_5_0, grammarAccess.getGuiAccess().getLayoutINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"layout",
                    		lv_layout_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleGui2682); 

                	newLeafNode(otherlv_6, grammarAccess.getGuiAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1128:1: ( (lv_GuiFeatures_7_0= ruleGuiFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||LA10_0==35||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1129:1: (lv_GuiFeatures_7_0= ruleGuiFeature )
            	    {
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1129:1: (lv_GuiFeatures_7_0= ruleGuiFeature )
            	    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1130:3: lv_GuiFeatures_7_0= ruleGuiFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGuiAccess().getGuiFeaturesGuiFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuiFeature_in_ruleGui2703);
            	    lv_GuiFeatures_7_0=ruleGuiFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGuiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GuiFeatures",
            	            		lv_GuiFeatures_7_0, 
            	            		"GuiFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleGui2716); 

                	newLeafNode(otherlv_8, grammarAccess.getGuiAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleGui"


    // $ANTLR start "entryRuleGuiFeature"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1158:1: entryRuleGuiFeature returns [EObject current=null] : iv_ruleGuiFeature= ruleGuiFeature EOF ;
    public final EObject entryRuleGuiFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiFeature = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1159:2: (iv_ruleGuiFeature= ruleGuiFeature EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1160:2: iv_ruleGuiFeature= ruleGuiFeature EOF
            {
             newCompositeNode(grammarAccess.getGuiFeatureRule()); 
            pushFollow(FOLLOW_ruleGuiFeature_in_entryRuleGuiFeature2752);
            iv_ruleGuiFeature=ruleGuiFeature();

            state._fsp--;

             current =iv_ruleGuiFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiFeature2762); 

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
    // $ANTLR end "entryRuleGuiFeature"


    // $ANTLR start "ruleGuiFeature"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1167:1: ruleGuiFeature returns [EObject current=null] : (this_GuiLabel_0= ruleGuiLabel | this_GuiButton_1= ruleGuiButton | this_GuiInput_2= ruleGuiInput ) ;
    public final EObject ruleGuiFeature() throws RecognitionException {
        EObject current = null;

        EObject this_GuiLabel_0 = null;

        EObject this_GuiButton_1 = null;

        EObject this_GuiInput_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1170:28: ( (this_GuiLabel_0= ruleGuiLabel | this_GuiButton_1= ruleGuiButton | this_GuiInput_2= ruleGuiInput ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1171:1: (this_GuiLabel_0= ruleGuiLabel | this_GuiButton_1= ruleGuiButton | this_GuiInput_2= ruleGuiInput )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1171:1: (this_GuiLabel_0= ruleGuiLabel | this_GuiButton_1= ruleGuiButton | this_GuiInput_2= ruleGuiInput )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1172:5: this_GuiLabel_0= ruleGuiLabel
                    {
                     
                            newCompositeNode(grammarAccess.getGuiFeatureAccess().getGuiLabelParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGuiLabel_in_ruleGuiFeature2809);
                    this_GuiLabel_0=ruleGuiLabel();

                    state._fsp--;

                     
                            current = this_GuiLabel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1182:5: this_GuiButton_1= ruleGuiButton
                    {
                     
                            newCompositeNode(grammarAccess.getGuiFeatureAccess().getGuiButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGuiButton_in_ruleGuiFeature2836);
                    this_GuiButton_1=ruleGuiButton();

                    state._fsp--;

                     
                            current = this_GuiButton_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1192:5: this_GuiInput_2= ruleGuiInput
                    {
                     
                            newCompositeNode(grammarAccess.getGuiFeatureAccess().getGuiInputParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGuiInput_in_ruleGuiFeature2863);
                    this_GuiInput_2=ruleGuiInput();

                    state._fsp--;

                     
                            current = this_GuiInput_2; 
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
    // $ANTLR end "ruleGuiFeature"


    // $ANTLR start "entryRuleGuiLabel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1208:1: entryRuleGuiLabel returns [EObject current=null] : iv_ruleGuiLabel= ruleGuiLabel EOF ;
    public final EObject entryRuleGuiLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiLabel = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1209:2: (iv_ruleGuiLabel= ruleGuiLabel EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1210:2: iv_ruleGuiLabel= ruleGuiLabel EOF
            {
             newCompositeNode(grammarAccess.getGuiLabelRule()); 
            pushFollow(FOLLOW_ruleGuiLabel_in_entryRuleGuiLabel2898);
            iv_ruleGuiLabel=ruleGuiLabel();

            state._fsp--;

             current =iv_ruleGuiLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiLabel2908); 

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
    // $ANTLR end "entryRuleGuiLabel"


    // $ANTLR start "ruleGuiLabel"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1217:1: ruleGuiLabel returns [EObject current=null] : (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'DATA' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGuiLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1220:28: ( (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'DATA' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1221:1: (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'DATA' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1221:1: (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'DATA' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1221:3: otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'DATA' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGuiLabel2945); 

                	newLeafNode(otherlv_0, grammarAccess.getGuiLabelAccess().getLABELKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1226:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1226:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuiLabel2962); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuiLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleGuiLabel2979); 

                	newLeafNode(otherlv_2, grammarAccess.getGuiLabelAccess().getTEXTKeyword_2());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1247:1: ( (lv_text_3_0= RULE_STRING ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1248:1: (lv_text_3_0= RULE_STRING )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1248:1: (lv_text_3_0= RULE_STRING )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1249:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuiLabel2996); 

            			newLeafNode(lv_text_3_0, grammarAccess.getGuiLabelAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleGuiLabel3013); 

                	newLeafNode(otherlv_4, grammarAccess.getGuiLabelAccess().getDATAKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1269:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1270:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1270:1: ( ruleQualifiedName )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1271:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiLabelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGuiLabelAccess().getElementAttributeCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGuiLabel3036);
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
    // $ANTLR end "ruleGuiLabel"


    // $ANTLR start "entryRuleGuiButton"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1292:1: entryRuleGuiButton returns [EObject current=null] : iv_ruleGuiButton= ruleGuiButton EOF ;
    public final EObject entryRuleGuiButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiButton = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1293:2: (iv_ruleGuiButton= ruleGuiButton EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1294:2: iv_ruleGuiButton= ruleGuiButton EOF
            {
             newCompositeNode(grammarAccess.getGuiButtonRule()); 
            pushFollow(FOLLOW_ruleGuiButton_in_entryRuleGuiButton3072);
            iv_ruleGuiButton=ruleGuiButton();

            state._fsp--;

             current =iv_ruleGuiButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiButton3082); 

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
    // $ANTLR end "entryRuleGuiButton"


    // $ANTLR start "ruleGuiButton"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1301:1: ruleGuiButton returns [EObject current=null] : (otherlv_0= 'BUTTON' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'FUNCTION' ( (lv_func_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuiButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token lv_func_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1304:28: ( (otherlv_0= 'BUTTON' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'FUNCTION' ( (lv_func_5_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1305:1: (otherlv_0= 'BUTTON' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'FUNCTION' ( (lv_func_5_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1305:1: (otherlv_0= 'BUTTON' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'FUNCTION' ( (lv_func_5_0= RULE_STRING ) ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1305:3: otherlv_0= 'BUTTON' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TEXT' ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= 'FUNCTION' ( (lv_func_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleGuiButton3119); 

                	newLeafNode(otherlv_0, grammarAccess.getGuiButtonAccess().getBUTTONKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1309:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1310:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1310:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1311:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuiButton3136); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuiButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleGuiButton3153); 

                	newLeafNode(otherlv_2, grammarAccess.getGuiButtonAccess().getTEXTKeyword_2());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1331:1: ( (lv_text_3_0= RULE_STRING ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1332:1: (lv_text_3_0= RULE_STRING )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1332:1: (lv_text_3_0= RULE_STRING )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1333:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuiButton3170); 

            			newLeafNode(lv_text_3_0, grammarAccess.getGuiButtonAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleGuiButton3187); 

                	newLeafNode(otherlv_4, grammarAccess.getGuiButtonAccess().getFUNCTIONKeyword_4());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1353:1: ( (lv_func_5_0= RULE_STRING ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1354:1: (lv_func_5_0= RULE_STRING )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1354:1: (lv_func_5_0= RULE_STRING )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1355:3: lv_func_5_0= RULE_STRING
            {
            lv_func_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuiButton3204); 

            			newLeafNode(lv_func_5_0, grammarAccess.getGuiButtonAccess().getFuncSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"func",
                    		lv_func_5_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleGuiButton"


    // $ANTLR start "entryRuleGuiInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1379:1: entryRuleGuiInput returns [EObject current=null] : iv_ruleGuiInput= ruleGuiInput EOF ;
    public final EObject entryRuleGuiInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiInput = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1380:2: (iv_ruleGuiInput= ruleGuiInput EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1381:2: iv_ruleGuiInput= ruleGuiInput EOF
            {
             newCompositeNode(grammarAccess.getGuiInputRule()); 
            pushFollow(FOLLOW_ruleGuiInput_in_entryRuleGuiInput3245);
            iv_ruleGuiInput=ruleGuiInput();

            state._fsp--;

             current =iv_ruleGuiInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuiInput3255); 

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
    // $ANTLR end "entryRuleGuiInput"


    // $ANTLR start "ruleGuiInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1388:1: ruleGuiInput returns [EObject current=null] : (otherlv_0= 'INPUT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TYPE' otherlv_3= '(' ( (lv_inputType_4_0= ruleInputType ) ) otherlv_5= ')' ) ;
    public final EObject ruleGuiInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_inputType_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1391:28: ( (otherlv_0= 'INPUT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TYPE' otherlv_3= '(' ( (lv_inputType_4_0= ruleInputType ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1392:1: (otherlv_0= 'INPUT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TYPE' otherlv_3= '(' ( (lv_inputType_4_0= ruleInputType ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1392:1: (otherlv_0= 'INPUT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TYPE' otherlv_3= '(' ( (lv_inputType_4_0= ruleInputType ) ) otherlv_5= ')' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1392:3: otherlv_0= 'INPUT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'TYPE' otherlv_3= '(' ( (lv_inputType_4_0= ruleInputType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleGuiInput3292); 

                	newLeafNode(otherlv_0, grammarAccess.getGuiInputAccess().getINPUTKeyword_0());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1396:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1397:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1397:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1398:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuiInput3309); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuiInputAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuiInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleGuiInput3326); 

                	newLeafNode(otherlv_2, grammarAccess.getGuiInputAccess().getTYPEKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleGuiInput3338); 

                	newLeafNode(otherlv_3, grammarAccess.getGuiInputAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1422:1: ( (lv_inputType_4_0= ruleInputType ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1423:1: (lv_inputType_4_0= ruleInputType )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1423:1: (lv_inputType_4_0= ruleInputType )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1424:3: lv_inputType_4_0= ruleInputType
            {
             
            	        newCompositeNode(grammarAccess.getGuiInputAccess().getInputTypeInputTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInputType_in_ruleGuiInput3359);
            lv_inputType_4_0=ruleInputType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuiInputRule());
            	        }
                   		set(
                   			current, 
                   			"inputType",
                    		lv_inputType_4_0, 
                    		"InputType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleGuiInput3371); 

                	newLeafNode(otherlv_5, grammarAccess.getGuiInputAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleGuiInput"


    // $ANTLR start "entryRuleInputType"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1452:1: entryRuleInputType returns [String current=null] : iv_ruleInputType= ruleInputType EOF ;
    public final String entryRuleInputType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInputType = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1453:2: (iv_ruleInputType= ruleInputType EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1454:2: iv_ruleInputType= ruleInputType EOF
            {
             newCompositeNode(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_ruleInputType_in_entryRuleInputType3408);
            iv_ruleInputType=ruleInputType();

            state._fsp--;

             current =iv_ruleInputType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputType3419); 

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
    // $ANTLR end "entryRuleInputType"


    // $ANTLR start "ruleInputType"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1461:1: ruleInputType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringInput_0= ruleStringInput | this_IntegerInput_1= ruleIntegerInput | this_IdInput_2= ruleIdInput ) ;
    public final AntlrDatatypeRuleToken ruleInputType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_StringInput_0 = null;

        AntlrDatatypeRuleToken this_IntegerInput_1 = null;

        AntlrDatatypeRuleToken this_IdInput_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1464:28: ( (this_StringInput_0= ruleStringInput | this_IntegerInput_1= ruleIntegerInput | this_IdInput_2= ruleIdInput ) )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1465:1: (this_StringInput_0= ruleStringInput | this_IntegerInput_1= ruleIntegerInput | this_IdInput_2= ruleIdInput )
            {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1465:1: (this_StringInput_0= ruleStringInput | this_IntegerInput_1= ruleIntegerInput | this_IdInput_2= ruleIdInput )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1466:5: this_StringInput_0= ruleStringInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputTypeAccess().getStringInputParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringInput_in_ruleInputType3466);
                    this_StringInput_0=ruleStringInput();

                    state._fsp--;


                    		current.merge(this_StringInput_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1478:5: this_IntegerInput_1= ruleIntegerInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputTypeAccess().getIntegerInputParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerInput_in_ruleInputType3499);
                    this_IntegerInput_1=ruleIntegerInput();

                    state._fsp--;


                    		current.merge(this_IntegerInput_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1490:5: this_IdInput_2= ruleIdInput
                    {
                     
                            newCompositeNode(grammarAccess.getInputTypeAccess().getIdInputParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdInput_in_ruleInputType3532);
                    this_IdInput_2=ruleIdInput();

                    state._fsp--;


                    		current.merge(this_IdInput_2);
                        
                     
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
    // $ANTLR end "ruleInputType"


    // $ANTLR start "entryRuleStringInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1508:1: entryRuleStringInput returns [String current=null] : iv_ruleStringInput= ruleStringInput EOF ;
    public final String entryRuleStringInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringInput = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1509:2: (iv_ruleStringInput= ruleStringInput EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1510:2: iv_ruleStringInput= ruleStringInput EOF
            {
             newCompositeNode(grammarAccess.getStringInputRule()); 
            pushFollow(FOLLOW_ruleStringInput_in_entryRuleStringInput3578);
            iv_ruleStringInput=ruleStringInput();

            state._fsp--;

             current =iv_ruleStringInput.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringInput3589); 

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
    // $ANTLR end "entryRuleStringInput"


    // $ANTLR start "ruleStringInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1517:1: ruleStringInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'string' ;
    public final AntlrDatatypeRuleToken ruleStringInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1520:28: (kw= 'string' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1522:2: kw= 'string'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleStringInput3626); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStringInputAccess().getStringKeyword()); 
                

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
    // $ANTLR end "ruleStringInput"


    // $ANTLR start "entryRuleIntegerInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1535:1: entryRuleIntegerInput returns [String current=null] : iv_ruleIntegerInput= ruleIntegerInput EOF ;
    public final String entryRuleIntegerInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerInput = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1536:2: (iv_ruleIntegerInput= ruleIntegerInput EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1537:2: iv_ruleIntegerInput= ruleIntegerInput EOF
            {
             newCompositeNode(grammarAccess.getIntegerInputRule()); 
            pushFollow(FOLLOW_ruleIntegerInput_in_entryRuleIntegerInput3666);
            iv_ruleIntegerInput=ruleIntegerInput();

            state._fsp--;

             current =iv_ruleIntegerInput.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerInput3677); 

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
    // $ANTLR end "entryRuleIntegerInput"


    // $ANTLR start "ruleIntegerInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1544:1: ruleIntegerInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'int' ;
    public final AntlrDatatypeRuleToken ruleIntegerInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1547:28: (kw= 'int' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1549:2: kw= 'int'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleIntegerInput3714); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIntegerInputAccess().getIntKeyword()); 
                

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
    // $ANTLR end "ruleIntegerInput"


    // $ANTLR start "entryRuleIdInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1562:1: entryRuleIdInput returns [String current=null] : iv_ruleIdInput= ruleIdInput EOF ;
    public final String entryRuleIdInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdInput = null;


        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1563:2: (iv_ruleIdInput= ruleIdInput EOF )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1564:2: iv_ruleIdInput= ruleIdInput EOF
            {
             newCompositeNode(grammarAccess.getIdInputRule()); 
            pushFollow(FOLLOW_ruleIdInput_in_entryRuleIdInput3754);
            iv_ruleIdInput=ruleIdInput();

            state._fsp--;

             current =iv_ruleIdInput.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdInput3765); 

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
    // $ANTLR end "entryRuleIdInput"


    // $ANTLR start "ruleIdInput"
    // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1571:1: ruleIdInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'id' ;
    public final AntlrDatatypeRuleToken ruleIdInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1574:28: (kw= 'id' )
            // ../org.xtext.example.sgl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalServerGeneratorLanguage.g:1576:2: kw= 'id'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleIdInput3802); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIdInputAccess().getIdKeyword()); 
                

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
    // $ANTLR end "ruleIdInput"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel130 = new BitSet(new long[]{0x0000000040400802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGui_in_ruleType277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServer_in_entryRuleServer312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServer322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServer359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServer376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServer393 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleServer405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServer417 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleServer438 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_14_in_ruleServer451 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleServer463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_ruleConfig556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_ruleConfig583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_ruleConfig610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_ruleConfig637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_ruleConfig664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_ruleConfig691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerootConfig_in_entryRulerootConfig726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerootConfig736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulerootConfig773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulerootConfig785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerootConfig802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehostNameConfig_in_entryRulehostNameConfig843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehostNameConfig853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulehostNameConfig890 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulehostNameConfig902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulehostNameConfig919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleportConfig_in_entryRuleportConfig960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleportConfig970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleportConfig1007 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleportConfig1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleportConfig1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogConfig_in_entryRulelogConfig1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogConfig1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulelogConfig1124 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulelogConfig1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelogConfig1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqldbConfig_in_entryRulesqldbConfig1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesqldbConfig1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulesqldbConfig1241 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulesqldbConfig1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesqldbConfig1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleresourceConfig_in_entryRuleresourceConfig1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleresourceConfig1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleresourceConfig1358 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleresourceConfig1370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleresourceConfig1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDomainModel1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainModel1492 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDomainModel1521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1533 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainModel1554 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1567 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDomainModel1579 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel1591 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleDomainModel1612 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1625 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1725 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1742 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1763 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_ruleAttribute1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_ruleAttribute1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_ruleAttribute1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStringAttribute2005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringAttribute2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAttribute_in_entryRuleNumberAttribute2063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberAttribute2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNumberAttribute2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberAttribute2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageAttribute_in_entryRuleImageAttribute2168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageAttribute2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImageAttribute2215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageAttribute2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2325 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName2344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2359 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship2464 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationship2476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGui_in_entryRuleGui2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGui2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGui2582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGui2599 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGui2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGui2636 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleGui2648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGui2665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGui2682 = new BitSet(new long[]{0x0000002900004000L});
    public static final BitSet FOLLOW_ruleGuiFeature_in_ruleGui2703 = new BitSet(new long[]{0x0000002900004000L});
    public static final BitSet FOLLOW_14_in_ruleGui2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiFeature_in_entryRuleGuiFeature2752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiFeature2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiLabel_in_ruleGuiFeature2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiButton_in_ruleGuiFeature2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiInput_in_ruleGuiFeature2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiLabel_in_entryRuleGuiLabel2898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiLabel2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGuiLabel2945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuiLabel2962 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleGuiLabel2979 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuiLabel2996 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGuiLabel3013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGuiLabel3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiButton_in_entryRuleGuiButton3072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiButton3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleGuiButton3119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuiButton3136 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleGuiButton3153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuiButton3170 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGuiButton3187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuiButton3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuiInput_in_entryRuleGuiInput3245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuiInput3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGuiInput3292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuiInput3309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGuiInput3326 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleGuiInput3338 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_ruleInputType_in_ruleGuiInput3359 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleGuiInput3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputType_in_entryRuleInputType3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputType3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringInput_in_ruleInputType3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInput_in_ruleInputType3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdInput_in_ruleInputType3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringInput_in_entryRuleStringInput3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringInput3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleStringInput3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerInput_in_entryRuleIntegerInput3666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerInput3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntegerInput3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdInput_in_entryRuleIdInput3754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdInput3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIdInput3802 = new BitSet(new long[]{0x0000000000000002L});

}