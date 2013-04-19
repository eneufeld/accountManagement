/**
 */
package org.eclipsesource.accounting.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipsesource.accounting.AccountingPackage
 * @generated
 */
public class AccountingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AccountingValidator INSTANCE = new AccountingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipsesource.accounting";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unit Amount' of 'Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDER__VALIDATE_UNIT_AMOUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AccountingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AccountingPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case AccountingPackage.CLIENT:
				return validateClient((Client)value, diagnostics, context);
			case AccountingPackage.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case AccountingPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case AccountingPackage.DELIVERABLE:
				return validateDeliverable((Deliverable)value, diagnostics, context);
			case AccountingPackage.INVOICE:
				return validateInvoice((Invoice)value, diagnostics, context);
			case AccountingPackage.EMPLOYEE:
				return validateEmployee((Employee)value, diagnostics, context);
			case AccountingPackage.WORK_PACKAGE:
				return validateWorkPackage((WorkPackage)value, diagnostics, context);
			case AccountingPackage.CLIENTS:
				return validateClients((Clients)value, diagnostics, context);
			case AccountingPackage.EMPLOYEES:
				return validateEmployees((Employees)value, diagnostics, context);
			case AccountingPackage.INVOICE_STATE:
				return validateInvoiceState((InvoiceState)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(client, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(order, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(order, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(order, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrder_validateUnitAmount(order, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUnitAmount constraint of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder_validateUnitAmount(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return order.validateUnitAmount(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliverable(Deliverable deliverable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deliverable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoice(Invoice invoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPackage(WorkPackage workPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClients(Clients clients, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clients, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployees(Employees employees, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employees, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceState(InvoiceState invoiceState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AccountingValidator
