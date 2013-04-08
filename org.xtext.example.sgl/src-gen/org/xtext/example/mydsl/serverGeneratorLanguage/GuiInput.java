/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGuiInput()
 * @model
 * @generated
 */
public interface GuiInput extends GuiFeature
{
  /**
   * Returns the value of the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' attribute.
   * @see #setInputType(String)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGuiInput_InputType()
   * @model
   * @generated
   */
  String getInputType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput#getInputType <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' attribute.
   * @see #getInputType()
   * @generated
   */
  void setInputType(String value);

} // GuiInput
