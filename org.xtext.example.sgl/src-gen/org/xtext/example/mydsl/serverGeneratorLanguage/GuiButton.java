/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGuiButton()
 * @model
 * @generated
 */
public interface GuiButton extends GuiFeature
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGuiButton_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' attribute.
   * @see #setFunc(String)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getGuiButton_Func()
   * @model
   * @generated
   */
  String getFunc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.GuiButton#getFunc <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' attribute.
   * @see #getFunc()
   * @generated
   */
  void setFunc(String value);

} // GuiButton
