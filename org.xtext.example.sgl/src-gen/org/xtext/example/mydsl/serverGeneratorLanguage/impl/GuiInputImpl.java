/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.serverGeneratorLanguage.GuiInput;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiInputImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiInputImpl extends GuiFeatureImpl implements GuiInput
{
  /**
   * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected static final String INPUT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected String inputType = INPUT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuiInputImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServerGeneratorLanguagePackage.Literals.GUI_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputType()
  {
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputType(String newInputType)
  {
    String oldInputType = inputType;
    inputType = newInputType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerGeneratorLanguagePackage.GUI_INPUT__INPUT_TYPE, oldInputType, inputType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI_INPUT__INPUT_TYPE:
        return getInputType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI_INPUT__INPUT_TYPE:
        setInputType((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI_INPUT__INPUT_TYPE:
        setInputType(INPUT_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI_INPUT__INPUT_TYPE:
        return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (inputType: ");
    result.append(inputType);
    result.append(')');
    return result.toString();
  }

} //GuiInputImpl
