/**
 */
package org.eclipsesource.accounting.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipsesource.accounting.AccountingFactory;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Client;
import org.eclipsesource.accounting.Clients;
import org.eclipsesource.accounting.Deliverable;
import org.eclipsesource.accounting.Employee;
import org.eclipsesource.accounting.Employees;
import org.eclipsesource.accounting.Invoice;
import org.eclipsesource.accounting.InvoiceState;
import org.eclipsesource.accounting.Order;
import org.eclipsesource.accounting.Project;
import org.eclipsesource.accounting.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingFactoryImpl extends EFactoryImpl implements AccountingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountingFactory init() {
		try {
			AccountingFactory theAccountingFactory = (AccountingFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipsesource.org/accounting"); 
			if (theAccountingFactory != null) {
				return theAccountingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccountingPackage.CLIENT: return createClient();
			case AccountingPackage.PROJECT: return createProject();
			case AccountingPackage.ORDER: return createOrder();
			case AccountingPackage.DELIVERABLE: return createDeliverable();
			case AccountingPackage.INVOICE: return createInvoice();
			case AccountingPackage.EMPLOYEE: return createEmployee();
			case AccountingPackage.WORK_PACKAGE: return createWorkPackage();
			case AccountingPackage.CLIENTS: return createClients();
			case AccountingPackage.EMPLOYEES: return createEmployees();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.INVOICE_STATE:
				return createInvoiceStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.INVOICE_STATE:
				return convertInvoiceStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage createWorkPackage() {
		WorkPackageImpl workPackage = new WorkPackageImpl();
		return workPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clients createClients() {
		ClientsImpl clients = new ClientsImpl();
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employees createEmployees() {
		EmployeesImpl employees = new EmployeesImpl();
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceState createInvoiceStateFromString(EDataType eDataType, String initialValue) {
		InvoiceState result = InvoiceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingPackage getAccountingPackage() {
		return (AccountingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountingPackage getPackage() {
		return AccountingPackage.eINSTANCE;
	}

} //AccountingFactoryImpl
