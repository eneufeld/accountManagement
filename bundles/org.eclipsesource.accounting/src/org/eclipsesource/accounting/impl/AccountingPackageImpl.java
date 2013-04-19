/**
 */
package org.eclipsesource.accounting.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipsesource.accounting.AccountingFactory;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Client;
import org.eclipsesource.accounting.Clients;
import org.eclipsesource.accounting.Deliverable;
import org.eclipsesource.accounting.Employee;
import org.eclipsesource.accounting.Employees;
import org.eclipsesource.accounting.Invoice;
import org.eclipsesource.accounting.InvoiceState;
import org.eclipsesource.accounting.NamedElement;
import org.eclipsesource.accounting.Order;
import org.eclipsesource.accounting.Project;
import org.eclipsesource.accounting.WorkPackage;
import org.eclipsesource.accounting.util.AccountingValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingPackageImpl extends EPackageImpl implements AccountingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipsesource.accounting.AccountingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountingPackageImpl() {
		super(eNS_URI, AccountingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AccountingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccountingPackage init() {
		if (isInited) return (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);

		// Obtain or create and register package
		AccountingPackageImpl theAccountingPackage = (AccountingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AccountingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AccountingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAccountingPackage.createPackageContents();

		// Initialize created meta-data
		theAccountingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAccountingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AccountingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAccountingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccountingPackage.eNS_URI, theAccountingPackage);
		return theAccountingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Projects() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Client() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Orders() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Id() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Project() {
		return (EReference)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Deliverables() {
		return (EReference)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Invoices() {
		return (EReference)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_PaymentOffset() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_PricePerUnit() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverable() {
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverable_DueDate() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverable_UnitAmount() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverable_Order() {
		return (EReference)deliverableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Id() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoice_Advisor() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoice_Order() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_UnitAmount() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_InvoiceDate() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_DueDate() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_State() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_Work() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Emails() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPackage() {
		return workPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkPackage_Project() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_Date() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_Hours() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_Task() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_Comment() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClients() {
		return clientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClients_Clients() {
		return (EReference)clientsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployees() {
		return employeesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployees_Employees() {
		return (EReference)employeesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceState() {
		return invoiceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactory getAccountingFactory() {
		return (AccountingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__PROJECTS);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__CLIENT);
		createEReference(projectEClass, PROJECT__ORDERS);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__ID);
		createEReference(orderEClass, ORDER__PROJECT);
		createEReference(orderEClass, ORDER__DELIVERABLES);
		createEReference(orderEClass, ORDER__INVOICES);
		createEAttribute(orderEClass, ORDER__PAYMENT_OFFSET);
		createEAttribute(orderEClass, ORDER__PRICE_PER_UNIT);

		deliverableEClass = createEClass(DELIVERABLE);
		createEAttribute(deliverableEClass, DELIVERABLE__DUE_DATE);
		createEAttribute(deliverableEClass, DELIVERABLE__UNIT_AMOUNT);
		createEReference(deliverableEClass, DELIVERABLE__ORDER);

		invoiceEClass = createEClass(INVOICE);
		createEAttribute(invoiceEClass, INVOICE__ID);
		createEReference(invoiceEClass, INVOICE__ADVISOR);
		createEReference(invoiceEClass, INVOICE__ORDER);
		createEAttribute(invoiceEClass, INVOICE__UNIT_AMOUNT);
		createEAttribute(invoiceEClass, INVOICE__INVOICE_DATE);
		createEAttribute(invoiceEClass, INVOICE__DUE_DATE);
		createEAttribute(invoiceEClass, INVOICE__STATE);

		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__WORK);
		createEAttribute(employeeEClass, EMPLOYEE__EMAILS);

		workPackageEClass = createEClass(WORK_PACKAGE);
		createEReference(workPackageEClass, WORK_PACKAGE__PROJECT);
		createEAttribute(workPackageEClass, WORK_PACKAGE__DATE);
		createEAttribute(workPackageEClass, WORK_PACKAGE__HOURS);
		createEAttribute(workPackageEClass, WORK_PACKAGE__TASK);
		createEAttribute(workPackageEClass, WORK_PACKAGE__COMMENT);

		clientsEClass = createEClass(CLIENTS);
		createEReference(clientsEClass, CLIENTS__CLIENTS);

		employeesEClass = createEClass(EMPLOYEES);
		createEReference(employeesEClass, EMPLOYEES__EMPLOYEES);

		// Create enums
		invoiceStateEEnum = createEEnum(INVOICE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(this.getNamedElement());
		projectEClass.getESuperTypes().add(this.getNamedElement());
		employeeEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Projects(), this.getProject(), this.getProject_Client(), "projects", null, 1, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Client(), this.getClient(), this.getClient_Projects(), "client", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Orders(), this.getOrder(), this.getOrder_Project(), "orders", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Id(), ecorePackage.getEString(), "id", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Project(), this.getProject(), this.getProject_Orders(), "project", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Deliverables(), this.getDeliverable(), this.getDeliverable_Order(), "deliverables", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Invoices(), this.getInvoice(), this.getInvoice_Order(), "invoices", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_PaymentOffset(), ecorePackage.getEInt(), "paymentOffset", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_PricePerUnit(), ecorePackage.getEDouble(), "pricePerUnit", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(orderEClass, ecorePackage.getEBoolean(), "validateUnitAmount", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnosticChain", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliverable_DueDate(), ecorePackage.getEDate(), "dueDate", null, 1, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_UnitAmount(), ecorePackage.getEDouble(), "unitAmount", null, 1, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliverable_Order(), this.getOrder(), this.getOrder_Deliverables(), "order", null, 1, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoice_Id(), ecorePackage.getEString(), "id", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoice_Advisor(), this.getEmployee(), null, "advisor", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoice_Order(), this.getOrder(), this.getOrder_Invoices(), "order", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_UnitAmount(), ecorePackage.getEDouble(), "unitAmount", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_InvoiceDate(), ecorePackage.getEDate(), "invoiceDate", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_DueDate(), ecorePackage.getEDate(), "dueDate", null, 1, 1, Invoice.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_State(), this.getInvoiceState(), "state", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_Work(), this.getWorkPackage(), null, "work", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Emails(), ecorePackage.getEString(), "emails", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPackageEClass, WorkPackage.class, "WorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPackage_Project(), this.getProject(), null, "project", null, 1, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_Date(), ecorePackage.getEDate(), "date", null, 1, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_Hours(), ecorePackage.getEDouble(), "hours", null, 1, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_Task(), ecorePackage.getEString(), "task", null, 0, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientsEClass, Clients.class, "Clients", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClients_Clients(), this.getClient(), null, "clients", null, 0, -1, Clients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeesEClass, Employees.class, "Employees", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployees_Employees(), this.getEmployee(), null, "employees", null, 0, -1, Employees.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(invoiceStateEEnum, InvoiceState.class, "InvoiceState");
		addEEnumLiteral(invoiceStateEEnum, InvoiceState.NEW);
		addEEnumLiteral(invoiceStateEEnum, InvoiceState.INVOICED);
		addEEnumLiteral(invoiceStateEEnum, InvoiceState.PAID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.emf.ecp.navigator
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.emf.ecp.navigator</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.emf.ecp.navigator";		
		addAnnotation
		  (clientsEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (employeesEClass, 
		   source, 
		   new String[] {
		   });
	}

} //AccountingPackageImpl
