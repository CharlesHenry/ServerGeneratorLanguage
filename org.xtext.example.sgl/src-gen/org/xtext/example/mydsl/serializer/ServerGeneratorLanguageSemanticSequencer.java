package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel;
import org.xtext.example.mydsl.serverGeneratorLanguage.Entity;
import org.xtext.example.mydsl.serverGeneratorLanguage.ImageAttribute;
import org.xtext.example.mydsl.serverGeneratorLanguage.Model;
import org.xtext.example.mydsl.serverGeneratorLanguage.NumberAttribute;
import org.xtext.example.mydsl.serverGeneratorLanguage.Relationship;
import org.xtext.example.mydsl.serverGeneratorLanguage.Server;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;
import org.xtext.example.mydsl.serverGeneratorLanguage.StringAttribute;
import org.xtext.example.mydsl.serverGeneratorLanguage.hostNameConfig;
import org.xtext.example.mydsl.serverGeneratorLanguage.logConfig;
import org.xtext.example.mydsl.serverGeneratorLanguage.portConfig;
import org.xtext.example.mydsl.serverGeneratorLanguage.resourceConfig;
import org.xtext.example.mydsl.serverGeneratorLanguage.rootConfig;
import org.xtext.example.mydsl.serverGeneratorLanguage.sqldbConfig;
import org.xtext.example.mydsl.services.ServerGeneratorLanguageGrammarAccess;

@SuppressWarnings("all")
public class ServerGeneratorLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ServerGeneratorLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ServerGeneratorLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ServerGeneratorLanguagePackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.IMAGE_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getImageAttributeRule()) {
					sequence_ImageAttribute(context, (ImageAttribute) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.NUMBER_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getNumberAttributeRule()) {
					sequence_NumberAttribute(context, (NumberAttribute) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.RELATIONSHIP:
				if(context == grammarAccess.getRelationshipRule()) {
					sequence_Relationship(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.SERVER:
				if(context == grammarAccess.getServerRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Server(context, (Server) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.STRING_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getStringAttributeRule()) {
					sequence_StringAttribute(context, (StringAttribute) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.HOST_NAME_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getHostNameConfigRule()) {
					sequence_hostNameConfig(context, (hostNameConfig) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.LOG_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getLogConfigRule()) {
					sequence_logConfig(context, (logConfig) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.PORT_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getPortConfigRule()) {
					sequence_portConfig(context, (portConfig) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.RESOURCE_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getResourceConfigRule()) {
					sequence_resourceConfig(context, (resourceConfig) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.ROOT_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getRootConfigRule()) {
					sequence_rootConfig(context, (rootConfig) semanticObject); 
					return; 
				}
				else break;
			case ServerGeneratorLanguagePackage.SQLDB_CONFIG:
				if(context == grammarAccess.getConfigRule() ||
				   context == grammarAccess.getSqldbConfigRule()) {
					sequence_sqldbConfig(context, (sqldbConfig) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID Entitys+=Entity* Relationships+=Relationship*)
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ImageAttribute(EObject context, ImageAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     types+=Type*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NumberAttribute(EObject context, NumberAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Attribute|QualifiedName] refName=[Attribute|QualifiedName])
	 */
	protected void sequence_Relationship(EObject context, Relationship semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.RELATIONSHIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.RELATIONSHIP__NAME));
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.RELATIONSHIP__REF_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.RELATIONSHIP__REF_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationshipAccess().getNameAttributeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationshipAccess().getRefNameAttributeQualifiedNameParserRuleCall_2_0_1(), semanticObject.getRefName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Configs+=Config*)
	 */
	protected void sequence_Server(EObject context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StringAttribute(EObject context, StringAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_hostNameConfig(EObject context, hostNameConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHostNameConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_logConfig(EObject context, logConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_portConfig(EObject context, portConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_resourceConfig(EObject context, resourceConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_rootConfig(EObject context, rootConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_sqldbConfig(EObject context, sqldbConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServerGeneratorLanguagePackage.Literals.CONFIG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSqldbConfigAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}
