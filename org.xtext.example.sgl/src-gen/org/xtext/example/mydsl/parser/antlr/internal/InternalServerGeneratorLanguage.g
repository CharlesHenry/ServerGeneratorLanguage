/*
* generated by Xtext
*/
grammar InternalServerGeneratorLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
	    }
		lv_types_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getServerParserRuleCall_0()); 
    }
    this_Server_0=ruleServer
    { 
        $current = $this_Server_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getDomainModelParserRuleCall_1()); 
    }
    this_DomainModel_1=ruleDomainModel
    { 
        $current = $this_DomainModel_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleServer
entryRuleServer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServerRule()); }
	 iv_ruleServer=ruleServer 
	 { $current=$iv_ruleServer.current; } 
	 EOF 
;

// Rule Server
ruleServer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SERVER' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getServerAccess().getSERVERKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getServerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='CONFIG' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getServerAccess().getCONFIGKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServerAccess().getConfigsConfigParserRuleCall_5_0()); 
	    }
		lv_Configs_5_0=ruleConfig		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServerRule());
	        }
       		add(
       			$current, 
       			"Configs",
        		lv_Configs_5_0, 
        		"Config");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleConfig
entryRuleConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfigRule()); }
	 iv_ruleConfig=ruleConfig 
	 { $current=$iv_ruleConfig.current; } 
	 EOF 
;

// Rule Config
ruleConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getRootConfigParserRuleCall_0()); 
    }
    this_rootConfig_0=rulerootConfig
    { 
        $current = $this_rootConfig_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getHostNameConfigParserRuleCall_1()); 
    }
    this_hostNameConfig_1=rulehostNameConfig
    { 
        $current = $this_hostNameConfig_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getPortConfigParserRuleCall_2()); 
    }
    this_portConfig_2=ruleportConfig
    { 
        $current = $this_portConfig_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getLogConfigParserRuleCall_3()); 
    }
    this_logConfig_3=rulelogConfig
    { 
        $current = $this_logConfig_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getSqldbConfigParserRuleCall_4()); 
    }
    this_sqldbConfig_4=rulesqldbConfig
    { 
        $current = $this_sqldbConfig_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConfigAccess().getResourceConfigParserRuleCall_5()); 
    }
    this_resourceConfig_5=ruleresourceConfig
    { 
        $current = $this_resourceConfig_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulerootConfig
entryRulerootConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRootConfigRule()); }
	 iv_rulerootConfig=rulerootConfig 
	 { $current=$iv_rulerootConfig.current; } 
	 EOF 
;

// Rule rootConfig
rulerootConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ROOTDIR' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRootConfigAccess().getROOTDIRKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRootConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_CONFIGID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getRootConfigAccess().getNameCONFIGIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRootConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"CONFIGID");
	    }

)
))
;





// Entry rule entryRulehostNameConfig
entryRulehostNameConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHostNameConfigRule()); }
	 iv_rulehostNameConfig=rulehostNameConfig 
	 { $current=$iv_rulehostNameConfig.current; } 
	 EOF 
;

// Rule hostNameConfig
rulehostNameConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='HOSTNAME' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHostNameConfigAccess().getHOSTNAMEKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHostNameConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_IP
		{
			newLeafNode(lv_name_2_0, grammarAccess.getHostNameConfigAccess().getNameIPTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHostNameConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"IP");
	    }

)
))
;





// Entry rule entryRuleportConfig
entryRuleportConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPortConfigRule()); }
	 iv_ruleportConfig=ruleportConfig 
	 { $current=$iv_ruleportConfig.current; } 
	 EOF 
;

// Rule portConfig
ruleportConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='PORT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPortConfigAccess().getPORTKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPortConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_MYINT
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPortConfigAccess().getNameMYINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPortConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"MYINT");
	    }

)
))
;





// Entry rule entryRulelogConfig
entryRulelogConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLogConfigRule()); }
	 iv_rulelogConfig=rulelogConfig 
	 { $current=$iv_rulelogConfig.current; } 
	 EOF 
;

// Rule logConfig
rulelogConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='LOG' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLogConfigAccess().getLOGKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLogConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_CONFIGID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getLogConfigAccess().getNameCONFIGIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLogConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"CONFIGID");
	    }

)
))
;





// Entry rule entryRulesqldbConfig
entryRulesqldbConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSqldbConfigRule()); }
	 iv_rulesqldbConfig=rulesqldbConfig 
	 { $current=$iv_rulesqldbConfig.current; } 
	 EOF 
;

// Rule sqldbConfig
rulesqldbConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SQLDB' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSqldbConfigAccess().getSQLDBKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSqldbConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_CONFIGID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getSqldbConfigAccess().getNameCONFIGIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSqldbConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"CONFIGID");
	    }

)
))
;





// Entry rule entryRuleresourceConfig
entryRuleresourceConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResourceConfigRule()); }
	 iv_ruleresourceConfig=ruleresourceConfig 
	 { $current=$iv_ruleresourceConfig.current; } 
	 EOF 
;

// Rule resourceConfig
ruleresourceConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='RESOURCE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getResourceConfigAccess().getRESOURCEKeyword_0());
    }
	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getResourceConfigAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_name_2_0=RULE_CONFIGID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getResourceConfigAccess().getNameCONFIGIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResourceConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"CONFIGID");
	    }

)
))
;





// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	 iv_ruleDomainModel=ruleDomainModel 
	 { $current=$iv_ruleDomainModel.current; } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DOMAINMODEL' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getDOMAINMODELKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDomainModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='ENTITYS' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getENTITYSKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainModelAccess().getEntitysEntityParserRuleCall_5_0()); 
	    }
		lv_Entitys_5_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainModelRule());
	        }
       		add(
       			$current, 
       			"Entitys",
        		lv_Entitys_5_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7='ENTITY_RELATIONSHIP' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getENTITY_RELATIONSHIPKeyword_7());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainModelAccess().getRelationshipsRelationshipParserRuleCall_9_0()); 
	    }
		lv_Relationships_9_0=ruleRelationship		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainModelRule());
	        }
       		add(
       			$current, 
       			"Relationships",
        		lv_Relationships_9_0, 
        		"Relationship");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_10());
    }
	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_11());
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
	    }
		lv_Attributes_2_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"Attributes",
        		lv_Attributes_2_0, 
        		"Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_0()); 
    }
    this_StringAttribute_0=ruleStringAttribute
    { 
        $current = $this_StringAttribute_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributeAccess().getNumberAttributeParserRuleCall_1()); 
    }
    this_NumberAttribute_1=ruleNumberAttribute
    { 
        $current = $this_NumberAttribute_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttributeAccess().getImageAttributeParserRuleCall_2()); 
    }
    this_ImageAttribute_2=ruleImageAttribute
    { 
        $current = $this_ImageAttribute_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringAttribute
entryRuleStringAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringAttributeRule()); }
	 iv_ruleStringAttribute=ruleStringAttribute 
	 { $current=$iv_ruleStringAttribute.current; } 
	 EOF 
;

// Rule StringAttribute
ruleStringAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='STRING' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStringAttributeAccess().getSTRINGKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleNumberAttribute
entryRuleNumberAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberAttributeRule()); }
	 iv_ruleNumberAttribute=ruleNumberAttribute 
	 { $current=$iv_ruleNumberAttribute.current; } 
	 EOF 
;

// Rule NumberAttribute
ruleNumberAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='NUMBER' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNumberAttributeAccess().getNUMBERKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNumberAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleImageAttribute
entryRuleImageAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImageAttributeRule()); }
	 iv_ruleImageAttribute=ruleImageAttribute 
	 { $current=$iv_ruleImageAttribute.current; } 
	 EOF 
;

// Rule ImageAttribute
ruleImageAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='IMAGE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImageAttributeAccess().getIMAGEKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImageAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	 iv_ruleRelationship=ruleRelationship 
	 { $current=$iv_ruleRelationship.current; } 
	 EOF 
;

// Rule Relationship
ruleRelationship returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationshipRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRelationshipAccess().getNameAttributeCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='->' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationshipRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRelationshipAccess().getRefNameAttributeCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





RULE_MYINT : '"' RULE_INT '"';

RULE_IP : '"' RULE_INT '.' RULE_INT '.' RULE_INT '.' RULE_INT '"';

RULE_CONFIGID : '"' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'/'|'.'|':'|'-')* '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


