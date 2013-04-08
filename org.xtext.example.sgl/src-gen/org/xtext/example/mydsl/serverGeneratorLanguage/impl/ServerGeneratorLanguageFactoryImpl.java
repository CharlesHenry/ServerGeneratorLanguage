/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.serverGeneratorLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerGeneratorLanguageFactoryImpl extends EFactoryImpl implements ServerGeneratorLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServerGeneratorLanguageFactory init()
  {
    try
    {
      ServerGeneratorLanguageFactory theServerGeneratorLanguageFactory = (ServerGeneratorLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/ServerGeneratorLanguage"); 
      if (theServerGeneratorLanguageFactory != null)
      {
        return theServerGeneratorLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServerGeneratorLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerGeneratorLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ServerGeneratorLanguagePackage.MODEL: return createModel();
      case ServerGeneratorLanguagePackage.TYPE: return createType();
      case ServerGeneratorLanguagePackage.SERVER: return createServer();
      case ServerGeneratorLanguagePackage.CONFIG: return createConfig();
      case ServerGeneratorLanguagePackage.ROOT_CONFIG: return createrootConfig();
      case ServerGeneratorLanguagePackage.HOST_NAME_CONFIG: return createhostNameConfig();
      case ServerGeneratorLanguagePackage.PORT_CONFIG: return createportConfig();
      case ServerGeneratorLanguagePackage.LOG_CONFIG: return createlogConfig();
      case ServerGeneratorLanguagePackage.SQLDB_CONFIG: return createsqldbConfig();
      case ServerGeneratorLanguagePackage.RESOURCE_CONFIG: return createresourceConfig();
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL: return createDomainModel();
      case ServerGeneratorLanguagePackage.ENTITY: return createEntity();
      case ServerGeneratorLanguagePackage.ATTRIBUTE: return createAttribute();
      case ServerGeneratorLanguagePackage.STRING_ATTRIBUTE: return createStringAttribute();
      case ServerGeneratorLanguagePackage.NUMBER_ATTRIBUTE: return createNumberAttribute();
      case ServerGeneratorLanguagePackage.IMAGE_ATTRIBUTE: return createImageAttribute();
      case ServerGeneratorLanguagePackage.RELATIONSHIP: return createRelationship();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server createServer()
  {
    ServerImpl server = new ServerImpl();
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rootConfig createrootConfig()
  {
    rootConfigImpl rootConfig = new rootConfigImpl();
    return rootConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public hostNameConfig createhostNameConfig()
  {
    hostNameConfigImpl hostNameConfig = new hostNameConfigImpl();
    return hostNameConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public portConfig createportConfig()
  {
    portConfigImpl portConfig = new portConfigImpl();
    return portConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logConfig createlogConfig()
  {
    logConfigImpl logConfig = new logConfigImpl();
    return logConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sqldbConfig createsqldbConfig()
  {
    sqldbConfigImpl sqldbConfig = new sqldbConfigImpl();
    return sqldbConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resourceConfig createresourceConfig()
  {
    resourceConfigImpl resourceConfig = new resourceConfigImpl();
    return resourceConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringAttribute createStringAttribute()
  {
    StringAttributeImpl stringAttribute = new StringAttributeImpl();
    return stringAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberAttribute createNumberAttribute()
  {
    NumberAttributeImpl numberAttribute = new NumberAttributeImpl();
    return numberAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageAttribute createImageAttribute()
  {
    ImageAttributeImpl imageAttribute = new ImageAttributeImpl();
    return imageAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerGeneratorLanguagePackage getServerGeneratorLanguagePackage()
  {
    return (ServerGeneratorLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServerGeneratorLanguagePackage getPackage()
  {
    return ServerGeneratorLanguagePackage.eINSTANCE;
  }

} //ServerGeneratorLanguageFactoryImpl
