/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Attribute)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getRelationship_Name()
   * @model
   * @generated
   */
  Attribute getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Attribute value);

  /**
   * Returns the value of the '<em><b>Ref Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Name</em>' reference.
   * @see #setRefName(Attribute)
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getRelationship_RefName()
   * @model
   * @generated
   */
  Attribute getRefName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.serverGeneratorLanguage.Relationship#getRefName <em>Ref Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Name</em>' reference.
   * @see #getRefName()
   * @generated
   */
  void setRefName(Attribute value);

} // Relationship
