/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getEntitys <em>Entitys</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends Type
{
  /**
   * Returns the value of the '<em><b>Entitys</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.serverGeneratorLanguage.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entitys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entitys</em>' containment reference list.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getDomainModel_Entitys()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntitys();

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getDomainModel_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelationships();

} // DomainModel
