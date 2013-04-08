/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getServer <em>Server</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getGuiFeatures <em>Gui Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGui()
 * @model
 * @generated
 */
public interface Gui extends Type
{
  /**
   * Returns the value of the '<em><b>Server</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' reference.
   * @see #setServer(Server)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGui_Server()
   * @model
   * @generated
   */
  Server getServer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getServer <em>Server</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' reference.
   * @see #getServer()
   * @generated
   */
  void setServer(Server value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' attribute.
   * @see #setLayout(int)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGui_Layout()
   * @model
   * @generated
   */
  int getLayout();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Gui#getLayout <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' attribute.
   * @see #getLayout()
   * @generated
   */
  void setLayout(int value);

  /**
   * Returns the value of the '<em><b>Gui Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gui Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gui Features</em>' containment reference list.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGui_GuiFeatures()
   * @model containment="true"
   * @generated
   */
  EList<GuiFeature> getGuiFeatures();

} // Gui
