/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage
 * @generated
 */
public interface ServerGeneratorLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServerGeneratorLanguageFactory eINSTANCE = org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerGeneratorLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Server</em>'.
   * @generated
   */
  Server createServer();

  /**
   * Returns a new object of class '<em>Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config</em>'.
   * @generated
   */
  Config createConfig();

  /**
   * Returns a new object of class '<em>root Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>root Config</em>'.
   * @generated
   */
  rootConfig createrootConfig();

  /**
   * Returns a new object of class '<em>host Name Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>host Name Config</em>'.
   * @generated
   */
  hostNameConfig createhostNameConfig();

  /**
   * Returns a new object of class '<em>port Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>port Config</em>'.
   * @generated
   */
  portConfig createportConfig();

  /**
   * Returns a new object of class '<em>log Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>log Config</em>'.
   * @generated
   */
  logConfig createlogConfig();

  /**
   * Returns a new object of class '<em>sqldb Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sqldb Config</em>'.
   * @generated
   */
  sqldbConfig createsqldbConfig();

  /**
   * Returns a new object of class '<em>resource Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>resource Config</em>'.
   * @generated
   */
  resourceConfig createresourceConfig();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>String Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attribute</em>'.
   * @generated
   */
  StringAttribute createStringAttribute();

  /**
   * Returns a new object of class '<em>Number Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Attribute</em>'.
   * @generated
   */
  NumberAttribute createNumberAttribute();

  /**
   * Returns a new object of class '<em>Image Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Attribute</em>'.
   * @generated
   */
  ImageAttribute createImageAttribute();

  /**
   * Returns a new object of class '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship</em>'.
   * @generated
   */
  Relationship createRelationship();

  /**
   * Returns a new object of class '<em>Gui</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gui</em>'.
   * @generated
   */
  Gui createGui();

  /**
   * Returns a new object of class '<em>Gui Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gui Feature</em>'.
   * @generated
   */
  GuiFeature createGuiFeature();

  /**
   * Returns a new object of class '<em>Gui Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gui Label</em>'.
   * @generated
   */
  GuiLabel createGuiLabel();

  /**
   * Returns a new object of class '<em>Gui Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gui Button</em>'.
   * @generated
   */
  GuiButton createGuiButton();

  /**
   * Returns a new object of class '<em>Gui Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gui Input</em>'.
   * @generated
   */
  GuiInput createGuiInput();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ServerGeneratorLanguagePackage getServerGeneratorLanguagePackage();

} //ServerGeneratorLanguageFactory
