/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Client#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Project}.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Project#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getClient_Projects()
	 * @see org.eclipsesource.accounting.Project#getClient
	 * @model opposite="client" containment="true" required="true"
	 * @generated
	 */
	EList<Project> getProjects();

} // Client
