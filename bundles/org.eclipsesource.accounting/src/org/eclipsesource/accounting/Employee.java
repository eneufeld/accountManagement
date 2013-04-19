/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Employee#getWork <em>Work</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Employee#getEmails <em>Emails</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Work</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getEmployee_Work()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPackage> getWork();

	/**
	 * Returns the value of the '<em><b>Emails</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emails</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emails</em>' attribute list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getEmployee_Emails()
	 * @model
	 * @generated
	 */
	EList<String> getEmails();

} // Employee
