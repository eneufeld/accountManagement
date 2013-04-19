/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Employees#getEmployees <em>Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getEmployees()
 * @model
 * @generated
 */
public interface Employees extends EObject {
	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getEmployees_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

} // Employees
