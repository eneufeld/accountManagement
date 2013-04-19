/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Clients#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getClients()
 * @model
 * @generated
 */
public interface Clients extends EObject {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getClients_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClients();

} // Clients
