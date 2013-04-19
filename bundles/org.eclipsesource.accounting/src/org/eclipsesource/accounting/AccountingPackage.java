/**
 */
package org.eclipsesource.accounting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipsesource.accounting.AccountingFactory
 * @model kind="package"
 * @generated
 */
public interface AccountingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accounting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipsesource.org/accounting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipsesource.accountin";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingPackage eINSTANCE = org.eclipsesource.accounting.impl.AccountingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.NamedElementImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.ClientImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROJECTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.ProjectImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Client</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CLIENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ORDERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.OrderImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Deliverables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DELIVERABLES = 2;

	/**
	 * The feature id for the '<em><b>Invoices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__INVOICES = 3;

	/**
	 * The feature id for the '<em><b>Payment Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PAYMENT_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Price Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE_PER_UNIT = 5;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.DeliverableImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 4;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DUE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Unit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__UNIT_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.InvoiceImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Advisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ADVISOR = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Unit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__UNIT_AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DUE_DATE = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__STATE = 6;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.EmployeeImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__WORK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAILS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.WorkPackageImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__HOURS = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__TASK = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__COMMENT = 4;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.ClientsImpl <em>Clients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.ClientsImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getClients()
	 * @generated
	 */
	int CLIENTS = 8;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS__CLIENTS = 0;

	/**
	 * The number of structural features of the '<em>Clients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.impl.EmployeesImpl <em>Employees</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.impl.EmployeesImpl
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getEmployees()
	 * @generated
	 */
	int EMPLOYEES = 9;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEES__EMPLOYEES = 0;

	/**
	 * The number of structural features of the '<em>Employees</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipsesource.accounting.InvoiceState <em>Invoice State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipsesource.accounting.InvoiceState
	 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getInvoiceState()
	 * @generated
	 */
	int INVOICE_STATE = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipsesource.accounting.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipsesource.accounting.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see org.eclipsesource.accounting.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Client#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipsesource.accounting.Client#getProjects()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Projects();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipsesource.accounting.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipsesource.accounting.Project#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Client</em>'.
	 * @see org.eclipsesource.accounting.Project#getClient()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Project#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see org.eclipsesource.accounting.Project#getOrders()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Orders();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.eclipsesource.accounting.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Order#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipsesource.accounting.Order#getId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Id();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipsesource.accounting.Order#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.eclipsesource.accounting.Order#getProject()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Order#getDeliverables <em>Deliverables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deliverables</em>'.
	 * @see org.eclipsesource.accounting.Order#getDeliverables()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Deliverables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Order#getInvoices <em>Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoices</em>'.
	 * @see org.eclipsesource.accounting.Order#getInvoices()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Invoices();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Order#getPaymentOffset <em>Payment Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Offset</em>'.
	 * @see org.eclipsesource.accounting.Order#getPaymentOffset()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_PaymentOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Order#getPricePerUnit <em>Price Per Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Unit</em>'.
	 * @see org.eclipsesource.accounting.Order#getPricePerUnit()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_PricePerUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see org.eclipsesource.accounting.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Deliverable#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipsesource.accounting.Deliverable#getDueDate()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Deliverable#getUnitAmount <em>Unit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Amount</em>'.
	 * @see org.eclipsesource.accounting.Deliverable#getUnitAmount()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_UnitAmount();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipsesource.accounting.Deliverable#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Order</em>'.
	 * @see org.eclipsesource.accounting.Deliverable#getOrder()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_Order();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see org.eclipsesource.accounting.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Invoice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipsesource.accounting.Invoice#getAdvisor <em>Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Advisor</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getAdvisor()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Advisor();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipsesource.accounting.Invoice#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Order</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getOrder()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Invoice#getUnitAmount <em>Unit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Amount</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getUnitAmount()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_UnitAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Invoice#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getInvoiceDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Invoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getDueDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.Invoice#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipsesource.accounting.Invoice#getState()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_State();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.eclipsesource.accounting.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Employee#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work</em>'.
	 * @see org.eclipsesource.accounting.Employee#getWork()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Work();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipsesource.accounting.Employee#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Emails</em>'.
	 * @see org.eclipsesource.accounting.Employee#getEmails()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Emails();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipsesource.accounting.WorkPackage#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage#getProject()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Project();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.WorkPackage#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage#getDate()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.WorkPackage#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage#getHours()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Hours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.WorkPackage#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage#getTask()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Task();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipsesource.accounting.WorkPackage#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipsesource.accounting.WorkPackage#getComment()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Clients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clients</em>'.
	 * @see org.eclipsesource.accounting.Clients
	 * @generated
	 */
	EClass getClients();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Clients#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see org.eclipsesource.accounting.Clients#getClients()
	 * @see #getClients()
	 * @generated
	 */
	EReference getClients_Clients();

	/**
	 * Returns the meta object for class '{@link org.eclipsesource.accounting.Employees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employees</em>'.
	 * @see org.eclipsesource.accounting.Employees
	 * @generated
	 */
	EClass getEmployees();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipsesource.accounting.Employees#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see org.eclipsesource.accounting.Employees#getEmployees()
	 * @see #getEmployees()
	 * @generated
	 */
	EReference getEmployees_Employees();

	/**
	 * Returns the meta object for enum '{@link org.eclipsesource.accounting.InvoiceState <em>Invoice State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoice State</em>'.
	 * @see org.eclipsesource.accounting.InvoiceState
	 * @generated
	 */
	EEnum getInvoiceState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountingFactory getAccountingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.NamedElementImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.ClientImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PROJECTS = eINSTANCE.getClient_Projects();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.ProjectImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CLIENT = eINSTANCE.getProject_Client();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ORDERS = eINSTANCE.getProject_Orders();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.OrderImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PROJECT = eINSTANCE.getOrder_Project();

		/**
		 * The meta object literal for the '<em><b>Deliverables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__DELIVERABLES = eINSTANCE.getOrder_Deliverables();

		/**
		 * The meta object literal for the '<em><b>Invoices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__INVOICES = eINSTANCE.getOrder_Invoices();

		/**
		 * The meta object literal for the '<em><b>Payment Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PAYMENT_OFFSET = eINSTANCE.getOrder_PaymentOffset();

		/**
		 * The meta object literal for the '<em><b>Price Per Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE_PER_UNIT = eINSTANCE.getOrder_PricePerUnit();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.DeliverableImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__DUE_DATE = eINSTANCE.getDeliverable_DueDate();

		/**
		 * The meta object literal for the '<em><b>Unit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__UNIT_AMOUNT = eINSTANCE.getDeliverable_UnitAmount();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__ORDER = eINSTANCE.getDeliverable_Order();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.InvoiceImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__ID = eINSTANCE.getInvoice_Id();

		/**
		 * The meta object literal for the '<em><b>Advisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__ADVISOR = eINSTANCE.getInvoice_Advisor();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__ORDER = eINSTANCE.getInvoice_Order();

		/**
		 * The meta object literal for the '<em><b>Unit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__UNIT_AMOUNT = eINSTANCE.getInvoice_UnitAmount();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_DATE = eINSTANCE.getInvoice_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DUE_DATE = eINSTANCE.getInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__STATE = eINSTANCE.getInvoice_State();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.EmployeeImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__WORK = eINSTANCE.getEmployee_Work();

		/**
		 * The meta object literal for the '<em><b>Emails</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMAILS = eINSTANCE.getEmployee_Emails();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.WorkPackageImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__PROJECT = eINSTANCE.getWorkPackage_Project();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__DATE = eINSTANCE.getWorkPackage_Date();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__HOURS = eINSTANCE.getWorkPackage_Hours();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__TASK = eINSTANCE.getWorkPackage_Task();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__COMMENT = eINSTANCE.getWorkPackage_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.ClientsImpl <em>Clients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.ClientsImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getClients()
		 * @generated
		 */
		EClass CLIENTS = eINSTANCE.getClients();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTS__CLIENTS = eINSTANCE.getClients_Clients();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.impl.EmployeesImpl <em>Employees</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.impl.EmployeesImpl
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getEmployees()
		 * @generated
		 */
		EClass EMPLOYEES = eINSTANCE.getEmployees();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEES__EMPLOYEES = eINSTANCE.getEmployees_Employees();

		/**
		 * The meta object literal for the '{@link org.eclipsesource.accounting.InvoiceState <em>Invoice State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipsesource.accounting.InvoiceState
		 * @see org.eclipsesource.accounting.impl.AccountingPackageImpl#getInvoiceState()
		 * @generated
		 */
		EEnum INVOICE_STATE = eINSTANCE.getInvoiceState();

	}

} //AccountingPackage
