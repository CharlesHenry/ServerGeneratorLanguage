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

import org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel;
import org.xtext.example.mydsl.serverGeneratorLanguage.Entity;
import org.xtext.example.mydsl.serverGeneratorLanguage.Relationship;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl#getEntitys <em>Entitys</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.DomainModelImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends TypeImpl implements DomainModel
{
  /**
   * The cached value of the '{@link #getEntitys() <em>Entitys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntitys()
   * @generated
   * @ordered
   */
  protected EList<Entity> entitys;

  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<Relationship> relationships;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
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
    return ServerGeneratorLanguagePackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntitys()
  {
    if (entitys == null)
    {
      entitys = new EObjectContainmentEList<Entity>(Entity.class, this, ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS);
    }
    return entitys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS);
    }
    return relationships;
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
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS:
        return ((InternalEList<?>)getEntitys()).basicRemove(otherEnd, msgs);
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS:
        return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS:
        return getEntitys();
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS:
        return getRelationships();
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
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS:
        getEntitys().clear();
        getEntitys().addAll((Collection<? extends Entity>)newValue);
        return;
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends Relationship>)newValue);
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
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS:
        getEntitys().clear();
        return;
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS:
        getRelationships().clear();
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
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__ENTITYS:
        return entitys != null && !entitys.isEmpty();
      case ServerGeneratorLanguagePackage.DOMAIN_MODEL__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainModelImpl
