/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ServerGeneratorLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "serverGeneratorLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/ServerGeneratorLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "serverGeneratorLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServerGeneratorLanguagePackage eINSTANCE = org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ModelImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.TypeImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerImpl <em>Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getServer()
   * @generated
   */
  int SERVER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__CONFIGS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__NAME = 0;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.rootConfigImpl <em>root Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.rootConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getrootConfig()
   * @generated
   */
  int ROOT_CONFIG = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>root Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.hostNameConfigImpl <em>host Name Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.hostNameConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#gethostNameConfig()
   * @generated
   */
  int HOST_NAME_CONFIG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NAME_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>host Name Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NAME_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.portConfigImpl <em>port Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.portConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getportConfig()
   * @generated
   */
  int PORT_CONFIG = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>port Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.logConfigImpl <em>log Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.logConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getlogConfig()
   * @generated
   */
  int LOG_CONFIG = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>log Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.sqldbConfigImpl <em>sqldb Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.sqldbConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getsqldbConfig()
   * @generated
   */
  int SQLDB_CONFIG = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQLDB_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>sqldb Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQLDB_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.resourceConfigImpl <em>resource Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.resourceConfigImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getresourceConfig()
   * @generated
   */
  int RESOURCE_CONFIG = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CONFIG__NAME = CONFIG__NAME;

  /**
   * The number of structural features of the '<em>resource Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Entitys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ENTITYS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__RELATIONSHIPS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.EntityImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.AttributeImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.StringAttributeImpl <em>String Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.StringAttributeImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getStringAttribute()
   * @generated
   */
  int STRING_ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The number of structural features of the '<em>String Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.NumberAttributeImpl <em>Number Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.NumberAttributeImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getNumberAttribute()
   * @generated
   */
  int NUMBER_ATTRIBUTE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The number of structural features of the '<em>Number Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ImageAttributeImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getImageAttribute()
   * @generated
   */
  int IMAGE_ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

  /**
   * The number of structural features of the '<em>Image Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__REF_NAME = 1;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl <em>Gui</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGui()
   * @generated
   */
  int GUI = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Server</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__SERVER = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__LAYOUT = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gui Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI__GUI_FEATURES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Gui</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiFeatureImpl <em>Gui Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiFeatureImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiFeature()
   * @generated
   */
  int GUI_FEATURE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Gui Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiLabelImpl <em>Gui Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiLabelImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiLabel()
   * @generated
   */
  int GUI_LABEL = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_LABEL__NAME = GUI_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_LABEL__TEXT = GUI_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_LABEL__ELEMENT = GUI_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gui Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_LABEL_FEATURE_COUNT = GUI_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiButtonImpl <em>Gui Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiButtonImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiButton()
   * @generated
   */
  int GUI_BUTTON = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_BUTTON__NAME = GUI_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_BUTTON__TEXT = GUI_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_BUTTON__FUNC = GUI_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gui Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_BUTTON_FEATURE_COUNT = GUI_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiInputImpl <em>Gui Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiInputImpl
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiInput()
   * @generated
   */
  int GUI_INPUT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_INPUT__NAME = GUI_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_INPUT__INPUT_TYPE = GUI_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Gui Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUI_INPUT_FEATURE_COUNT = GUI_FEATURE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Server
   * @generated
   */
  EClass getServer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Server#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configs</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Server#getConfigs()
   * @see #getServer()
   * @generated
   */
  EReference getServer_Configs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Config#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Config#getName()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.rootConfig <em>root Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>root Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.rootConfig
   * @generated
   */
  EClass getrootConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.hostNameConfig <em>host Name Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>host Name Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.hostNameConfig
   * @generated
   */
  EClass gethostNameConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.portConfig <em>port Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>port Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.portConfig
   * @generated
   */
  EClass getportConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.logConfig <em>log Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>log Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.logConfig
   * @generated
   */
  EClass getlogConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.sqldbConfig <em>sqldb Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sqldb Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.sqldbConfig
   * @generated
   */
  EClass getsqldbConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.resourceConfig <em>resource Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource Config</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.resourceConfig
   * @generated
   */
  EClass getresourceConfig();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getEntitys <em>Entitys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entitys</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getEntitys()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Entitys();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getRelationships()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Relationships();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.StringAttribute <em>String Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Attribute</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.StringAttribute
   * @generated
   */
  EClass getStringAttribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.NumberAttribute <em>Number Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Attribute</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.NumberAttribute
   * @generated
   */
  EClass getNumberAttribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.ImageAttribute <em>Image Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Attribute</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ImageAttribute
   * @generated
   */
  EClass getImageAttribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getName()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getRefName <em>Ref Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getRefName()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_RefName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui <em>Gui</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Gui
   * @generated
   */
  EClass getGui();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getServer <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Server</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getServer()
   * @see #getGui()
   * @generated
   */
  EReference getGui_Server();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getLayout()
   * @see #getGui()
   * @generated
   */
  EAttribute getGui_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getGuiFeatures <em>Gui Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gui Features</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getGuiFeatures()
   * @see #getGui()
   * @generated
   */
  EReference getGui_GuiFeatures();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature <em>Gui Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui Feature</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature
   * @generated
   */
  EClass getGuiFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature#getName()
   * @see #getGuiFeature()
   * @generated
   */
  EAttribute getGuiFeature_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel <em>Gui Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui Label</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel
   * @generated
   */
  EClass getGuiLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel#getText()
   * @see #getGuiLabel()
   * @generated
   */
  EAttribute getGuiLabel_Text();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiLabel#getElement()
   * @see #getGuiLabel()
   * @generated
   */
  EReference getGuiLabel_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton <em>Gui Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui Button</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton
   * @generated
   */
  EClass getGuiButton();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getText()
   * @see #getGuiButton()
   * @generated
   */
  EAttribute getGuiButton_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Func</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getFunc()
   * @see #getGuiButton()
   * @generated
   */
  EAttribute getGuiButton_Func();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput <em>Gui Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gui Input</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput
   * @generated
   */
  EClass getGuiInput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput#getInputType()
   * @see #getGuiInput()
   * @generated
   */
  EAttribute getGuiInput_InputType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServerGeneratorLanguageFactory getServerGeneratorLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ModelImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.TypeImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getServer()
     * @generated
     */
    EClass SERVER = eINSTANCE.getServer();

    /**
     * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER__CONFIGS = eINSTANCE.getServer_Configs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__NAME = eINSTANCE.getConfig_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.rootConfigImpl <em>root Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.rootConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getrootConfig()
     * @generated
     */
    EClass ROOT_CONFIG = eINSTANCE.getrootConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.hostNameConfigImpl <em>host Name Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.hostNameConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#gethostNameConfig()
     * @generated
     */
    EClass HOST_NAME_CONFIG = eINSTANCE.gethostNameConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.portConfigImpl <em>port Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.portConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getportConfig()
     * @generated
     */
    EClass PORT_CONFIG = eINSTANCE.getportConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.logConfigImpl <em>log Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.logConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getlogConfig()
     * @generated
     */
    EClass LOG_CONFIG = eINSTANCE.getlogConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.sqldbConfigImpl <em>sqldb Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.sqldbConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getsqldbConfig()
     * @generated
     */
    EClass SQLDB_CONFIG = eINSTANCE.getsqldbConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.resourceConfigImpl <em>resource Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.resourceConfigImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getresourceConfig()
     * @generated
     */
    EClass RESOURCE_CONFIG = eINSTANCE.getresourceConfig();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Entitys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ENTITYS = eINSTANCE.getDomainModel_Entitys();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__RELATIONSHIPS = eINSTANCE.getDomainModel_Relationships();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.EntityImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.AttributeImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.StringAttributeImpl <em>String Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.StringAttributeImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getStringAttribute()
     * @generated
     */
    EClass STRING_ATTRIBUTE = eINSTANCE.getStringAttribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.NumberAttributeImpl <em>Number Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.NumberAttributeImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getNumberAttribute()
     * @generated
     */
    EClass NUMBER_ATTRIBUTE = eINSTANCE.getNumberAttribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ImageAttributeImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getImageAttribute()
     * @generated
     */
    EClass IMAGE_ATTRIBUTE = eINSTANCE.getImageAttribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

    /**
     * The meta object literal for the '<em><b>Ref Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__REF_NAME = eINSTANCE.getRelationship_RefName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl <em>Gui</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGui()
     * @generated
     */
    EClass GUI = eINSTANCE.getGui();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUI__SERVER = eINSTANCE.getGui_Server();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI__LAYOUT = eINSTANCE.getGui_Layout();

    /**
     * The meta object literal for the '<em><b>Gui Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUI__GUI_FEATURES = eINSTANCE.getGui_GuiFeatures();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiFeatureImpl <em>Gui Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiFeatureImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiFeature()
     * @generated
     */
    EClass GUI_FEATURE = eINSTANCE.getGuiFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_FEATURE__NAME = eINSTANCE.getGuiFeature_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiLabelImpl <em>Gui Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiLabelImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiLabel()
     * @generated
     */
    EClass GUI_LABEL = eINSTANCE.getGuiLabel();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_LABEL__TEXT = eINSTANCE.getGuiLabel_Text();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUI_LABEL__ELEMENT = eINSTANCE.getGuiLabel_Element();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiButtonImpl <em>Gui Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiButtonImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiButton()
     * @generated
     */
    EClass GUI_BUTTON = eINSTANCE.getGuiButton();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_BUTTON__TEXT = eINSTANCE.getGuiButton_Text();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_BUTTON__FUNC = eINSTANCE.getGuiButton_Func();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiInputImpl <em>Gui Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiInputImpl
     * @see org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguagePackageImpl#getGuiInput()
     * @generated
     */
    EClass GUI_INPUT = eINSTANCE.getGuiInput();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUI_INPUT__INPUT_TYPE = eINSTANCE.getGuiInput_InputType();

  }

} //ServerGeneratorLanguagePackage
