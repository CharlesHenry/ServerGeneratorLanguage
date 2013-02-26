/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.serverGeneratorLanguage.Config;
import org.xtext.example.mydsl.serverGeneratorLanguage.Server;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.ServerImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerImpl extends TypeImpl implements Server
{
  /**
   * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigs()
   * @generated
   * @ordered
   */
  protected EList<Config> configs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerImpl()
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
    return ServerGeneratorLanguagePackage.Literals.SERVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Config> getConfigs()
  {
    if (configs == null)
    {
      configs = new EObjectContainmentEList<Config>(Config.class, this, ServerGeneratorLanguagePackage.SERVER__CONFIGS);
    }
    return configs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.SERVER__CONFIGS:
        return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ServerGeneratorLanguagePackage.SERVER__CONFIGS:
        return getConfigs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.SERVER__CONFIGS:
        getConfigs().clear();
        getConfigs().addAll((Collection<? extends Config>)newValue);
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
      case ServerGeneratorLanguagePackage.SERVER__CONFIGS:
        getConfigs().clear();
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
      case ServerGeneratorLanguagePackage.SERVER__CONFIGS:
        return configs != null && !configs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ServerImpl
