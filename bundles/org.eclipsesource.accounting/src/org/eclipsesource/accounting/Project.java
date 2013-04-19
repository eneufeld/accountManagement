/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Project#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Project#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Client#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' container reference.
	 * @see #setClient(Client)
	 * @see org.eclipsesource.accounting.AccountingPackage#getProject_Client()
	 * @see org.eclipsesource.accounting.Client#getProjects
	 * @model opposite="projects" required="true" transient="false"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Project#getClient <em>Client</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' container reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Order}.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Order#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getProject_Orders()
	 * @see org.eclipsesource.accounting.Order#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

} // Project
