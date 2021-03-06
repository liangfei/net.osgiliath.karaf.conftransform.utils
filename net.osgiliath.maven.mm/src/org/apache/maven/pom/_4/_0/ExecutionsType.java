/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.ExecutionsType#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.maven.pom._4._0._0Package#getExecutionsType()
 * @model extendedMetaData="name='executions_._type' kind='elementOnly'"
 * @generated
 */
public interface ExecutionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom._4._0.PluginExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' containment reference list.
	 * @see org.apache.maven.pom._4._0._0Package#getExecutionsType_Execution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='execution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PluginExecution> getExecution();

} // ExecutionsType
