/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.serverGeneratorLanguage.Attribute;
import org.xtext.example.mydsl.serverGeneratorLanguage.Relationship;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.RelationshipImpl#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Attribute name;

  /**
   * The cached value of the '{@link #getRefName() <em>Ref Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefName()
   * @generated
   * @ordered
   */
  protected Attribute refName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return ServerGeneratorLanguagePackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Attribute)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerGeneratorLanguagePackage.RELATIONSHIP__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Attribute newName)
  {
    Attribute oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerGeneratorLanguagePackage.RELATIONSHIP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRefName()
  {
    if (refName != null && refName.eIsProxy())
    {
      InternalEObject oldRefName = (InternalEObject)refName;
      refName = (Attribute)eResolveProxy(oldRefName);
      if (refName != oldRefName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME, oldRefName, refName));
      }
    }
    return refName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRefName()
  {
    return refName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefName(Attribute newRefName)
  {
    Attribute oldRefName = refName;
    refName = newRefName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME, oldRefName, refName));
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
      case ServerGeneratorLanguagePackage.RELATIONSHIP__NAME:
        if (resolve) return getName();
        return basicGetName();
      case ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME:
        if (resolve) return getRefName();
        return basicGetRefName();
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
      case ServerGeneratorLanguagePackage.RELATIONSHIP__NAME:
        setName((Attribute)newValue);
        return;
      case ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME:
        setRefName((Attribute)newValue);
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
      case ServerGeneratorLanguagePackage.RELATIONSHIP__NAME:
        setName((Attribute)null);
        return;
      case ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME:
        setRefName((Attribute)null);
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
      case ServerGeneratorLanguagePackage.RELATIONSHIP__NAME:
        return name != null;
      case ServerGeneratorLanguagePackage.RELATIONSHIP__REF_NAME:
        return refName != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationshipImpl
