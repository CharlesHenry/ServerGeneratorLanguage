/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.ServerGeneratorLanguageGrammarAccess;

public class ServerGeneratorLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private ServerGeneratorLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalServerGeneratorLanguageParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalServerGeneratorLanguageParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalServerGeneratorLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getConfigAccess().getAlternatives(), "rule__Config__Alternatives");
					put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
					put(grammarAccess.getGuiFeatureAccess().getAlternatives(), "rule__GuiFeature__Alternatives");
					put(grammarAccess.getInputTypeAccess().getAlternatives(), "rule__InputType__Alternatives");
					put(grammarAccess.getServerAccess().getGroup(), "rule__Server__Group__0");
					put(grammarAccess.getRootConfigAccess().getGroup(), "rule__RootConfig__Group__0");
					put(grammarAccess.getHostNameConfigAccess().getGroup(), "rule__HostNameConfig__Group__0");
					put(grammarAccess.getPortConfigAccess().getGroup(), "rule__PortConfig__Group__0");
					put(grammarAccess.getLogConfigAccess().getGroup(), "rule__LogConfig__Group__0");
					put(grammarAccess.getSqldbConfigAccess().getGroup(), "rule__SqldbConfig__Group__0");
					put(grammarAccess.getResourceConfigAccess().getGroup(), "rule__ResourceConfig__Group__0");
					put(grammarAccess.getDomainModelAccess().getGroup(), "rule__DomainModel__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getStringAttributeAccess().getGroup(), "rule__StringAttribute__Group__0");
					put(grammarAccess.getNumberAttributeAccess().getGroup(), "rule__NumberAttribute__Group__0");
					put(grammarAccess.getImageAttributeAccess().getGroup(), "rule__ImageAttribute__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getGuiAccess().getGroup(), "rule__Gui__Group__0");
					put(grammarAccess.getGuiLabelAccess().getGroup(), "rule__GuiLabel__Group__0");
					put(grammarAccess.getGuiButtonAccess().getGroup(), "rule__GuiButton__Group__0");
					put(grammarAccess.getGuiInputAccess().getGroup(), "rule__GuiInput__Group__0");
					put(grammarAccess.getModelAccess().getTypesAssignment(), "rule__Model__TypesAssignment");
					put(grammarAccess.getServerAccess().getNameAssignment_1(), "rule__Server__NameAssignment_1");
					put(grammarAccess.getServerAccess().getConfigsAssignment_5(), "rule__Server__ConfigsAssignment_5");
					put(grammarAccess.getRootConfigAccess().getNameAssignment_2(), "rule__RootConfig__NameAssignment_2");
					put(grammarAccess.getHostNameConfigAccess().getNameAssignment_2(), "rule__HostNameConfig__NameAssignment_2");
					put(grammarAccess.getPortConfigAccess().getNameAssignment_2(), "rule__PortConfig__NameAssignment_2");
					put(grammarAccess.getLogConfigAccess().getNameAssignment_2(), "rule__LogConfig__NameAssignment_2");
					put(grammarAccess.getSqldbConfigAccess().getNameAssignment_2(), "rule__SqldbConfig__NameAssignment_2");
					put(grammarAccess.getResourceConfigAccess().getNameAssignment_2(), "rule__ResourceConfig__NameAssignment_2");
					put(grammarAccess.getDomainModelAccess().getNameAssignment_1(), "rule__DomainModel__NameAssignment_1");
					put(grammarAccess.getDomainModelAccess().getEntitysAssignment_5(), "rule__DomainModel__EntitysAssignment_5");
					put(grammarAccess.getDomainModelAccess().getRelationshipsAssignment_9(), "rule__DomainModel__RelationshipsAssignment_9");
					put(grammarAccess.getEntityAccess().getNameAssignment_0(), "rule__Entity__NameAssignment_0");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_2(), "rule__Entity__AttributesAssignment_2");
					put(grammarAccess.getStringAttributeAccess().getNameAssignment_1(), "rule__StringAttribute__NameAssignment_1");
					put(grammarAccess.getNumberAttributeAccess().getNameAssignment_1(), "rule__NumberAttribute__NameAssignment_1");
					put(grammarAccess.getImageAttributeAccess().getNameAssignment_1(), "rule__ImageAttribute__NameAssignment_1");
					put(grammarAccess.getRelationshipAccess().getNameAssignment_0(), "rule__Relationship__NameAssignment_0");
					put(grammarAccess.getRelationshipAccess().getRefNameAssignment_2(), "rule__Relationship__RefNameAssignment_2");
					put(grammarAccess.getGuiAccess().getNameAssignment_1(), "rule__Gui__NameAssignment_1");
					put(grammarAccess.getGuiAccess().getServerAssignment_3(), "rule__Gui__ServerAssignment_3");
					put(grammarAccess.getGuiAccess().getLayoutAssignment_5(), "rule__Gui__LayoutAssignment_5");
					put(grammarAccess.getGuiAccess().getGuiFeaturesAssignment_7(), "rule__Gui__GuiFeaturesAssignment_7");
					put(grammarAccess.getGuiLabelAccess().getNameAssignment_1(), "rule__GuiLabel__NameAssignment_1");
					put(grammarAccess.getGuiLabelAccess().getTextAssignment_3(), "rule__GuiLabel__TextAssignment_3");
					put(grammarAccess.getGuiLabelAccess().getElementAssignment_5(), "rule__GuiLabel__ElementAssignment_5");
					put(grammarAccess.getGuiButtonAccess().getNameAssignment_1(), "rule__GuiButton__NameAssignment_1");
					put(grammarAccess.getGuiButtonAccess().getTextAssignment_3(), "rule__GuiButton__TextAssignment_3");
					put(grammarAccess.getGuiButtonAccess().getFuncAssignment_5(), "rule__GuiButton__FuncAssignment_5");
					put(grammarAccess.getGuiInputAccess().getNameAssignment_1(), "rule__GuiInput__NameAssignment_1");
					put(grammarAccess.getGuiInputAccess().getInputTypeAssignment_4(), "rule__GuiInput__InputTypeAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalServerGeneratorLanguageParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalServerGeneratorLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ServerGeneratorLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ServerGeneratorLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}