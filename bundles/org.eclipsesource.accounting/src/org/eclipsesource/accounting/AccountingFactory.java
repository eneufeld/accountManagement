/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipsesource.accounting.AccountingPackage
 * @generated
 */
public interface AccountingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingFactory eINSTANCE = org.eclipsesource.accounting.impl.AccountingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deliverable</em>'.
	 * @generated
	 */
	Deliverable createDeliverable();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Work Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Package</em>'.
	 * @generated
	 */
	WorkPackage createWorkPackage();

	/**
	 * Returns a new object of class '<em>Clients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clients</em>'.
	 * @generated
	 */
	Clients createClients();

	/**
	 * Returns a new object of class '<em>Employees</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employees</em>'.
	 * @generated
	 */
	Employees createEmployees();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccountingPackage getAccountingPackage();

} //AccountingFactory
