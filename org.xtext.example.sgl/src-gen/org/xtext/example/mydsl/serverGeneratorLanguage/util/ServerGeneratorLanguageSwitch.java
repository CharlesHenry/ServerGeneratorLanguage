/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.serverGeneratorLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage
 * @generated
 */
public class ServerGeneratorLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ServerGeneratorLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerGeneratorLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ServerGeneratorLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ServerGeneratorLanguagePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.SERVER:
      {
        Server server = (Server)theEObject;
        T result = caseServer(server);
        if (result == null) result = caseType(server);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.CONFIG:
      {
        Config config = (Config)theEObject;
        T result = caseConfig(config);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.ROOT_CONFIG:
      {
        rootConfig rootConfig = (rootConfig)theEObject;
        T result = caserootConfig(rootConfig);
        if (result == null) result = caseConfig(rootConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.HOST_NAME_CONFIG:
      {
        hostNameConfig hostNameConfig = (hostNameConfig)theEObject;
        T result = casehostNameConfig(hostNameConfig);
        if (result == null) result = caseConfig(hostNameConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.PORT_CONFIG:
      {
        portConfig portConfig = (portConfig)theEObject;
        T result = caseportConfig(portConfig);
        if (result == null) result = caseConfig(portConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.LOG_CONFIG:
      {
        logConfig logConfig = (logConfig)theEObject;
        T result = caselogConfig(logConfig);
        if (result == null) result = caseConfig(logConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.SQLDB_CONFIG:
      {
        sqldbConfig sqldbConfig = (sqldbConfig)theEObject;
        T result = casesqldbConfig(sqldbConfig);
        if (result == null) result = caseConfig(sqldbConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.RESOURCE_CONFIG:
      {
        resourceConfig resourceConfig = (resourceConfig)theEObject;
        T result = caseresourceConfig(resourceConfig);
        if (result == null) result = caseConfig(resourceConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = caseType(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.STRING_ATTRIBUTE:
      {
        StringAttribute stringAttribute = (StringAttribute)theEObject;
        T result = caseStringAttribute(stringAttribute);
        if (result == null) result = caseAttribute(stringAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.NUMBER_ATTRIBUTE:
      {
        NumberAttribute numberAttribute = (NumberAttribute)theEObject;
        T result = caseNumberAttribute(numberAttribute);
        if (result == null) result = caseAttribute(numberAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.IMAGE_ATTRIBUTE:
      {
        ImageAttribute imageAttribute = (ImageAttribute)theEObject;
        T result = caseImageAttribute(imageAttribute);
        if (result == null) result = caseAttribute(imageAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.GUI:
      {
        Gui gui = (Gui)theEObject;
        T result = caseGui(gui);
        if (result == null) result = caseType(gui);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.GUI_FEATURE:
      {
        GuiFeature guiFeature = (GuiFeature)theEObject;
        T result = caseGuiFeature(guiFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.GUI_LABEL:
      {
        GuiLabel guiLabel = (GuiLabel)theEObject;
        T result = caseGuiLabel(guiLabel);
        if (result == null) result = caseGuiFeature(guiLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.GUI_BUTTON:
      {
        GuiButton guiButton = (GuiButton)theEObject;
        T result = caseGuiButton(guiButton);
        if (result == null) result = caseGuiFeature(guiButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ServerGeneratorLanguagePackage.GUI_INPUT:
      {
        GuiInput guiInput = (GuiInput)theEObject;
        T result = caseGuiInput(guiInput);
        if (result == null) result = caseGuiFeature(guiInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServer(Server object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfig(Config object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>root Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>root Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserootConfig(rootConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>host Name Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>host Name Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehostNameConfig(hostNameConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>port Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>port Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseportConfig(portConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>log Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>log Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogConfig(logConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sqldb Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sqldb Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesqldbConfig(sqldbConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresourceConfig(resourceConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttribute(StringAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberAttribute(NumberAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageAttribute(ImageAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gui</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gui</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGui(Gui object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gui Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gui Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuiFeature(GuiFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gui Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gui Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuiLabel(GuiLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gui Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gui Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuiButton(GuiButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gui Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gui Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuiInput(GuiInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ServerGeneratorLanguageSwitch
