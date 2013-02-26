/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.Server#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Type
{
  /**
   * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.serverGeneratorLanguage.Config}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configs</em>' containment reference list.
   * @see org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage#getServer_Configs()
   * @model containment="true"
   * @generated
   */
  EList<Config> getConfigs();

} // Server
