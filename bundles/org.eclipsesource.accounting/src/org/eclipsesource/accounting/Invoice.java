/**
 */
package org.eclipsesource.accounting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getAdvisor <em>Advisor</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getUnitAmount <em>Unit Amount</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Invoice#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Advisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advisor</em>' reference.
	 * @see #setAdvisor(Employee)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_Advisor()
	 * @model
	 * @generated
	 */
	Employee getAdvisor();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getAdvisor <em>Advisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advisor</em>' reference.
	 * @see #getAdvisor()
	 * @generated
	 */
	void setAdvisor(Employee value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Order#getInvoices <em>Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' container reference.
	 * @see #setOrder(Order)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_Order()
	 * @see org.eclipsesource.accounting.Order#getInvoices
	 * @model opposite="invoices" required="true" transient="false"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getOrder <em>Order</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' container reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Unit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Amount</em>' attribute.
	 * @see #setUnitAmount(double)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_UnitAmount()
	 * @model required="true"
	 * @generated
	 */
	double getUnitAmount();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getUnitAmount <em>Unit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Amount</em>' attribute.
	 * @see #getUnitAmount()
	 * @generated
	 */
	void setUnitAmount(double value);

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(Date)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_InvoiceDate()
	 * @model required="true"
	 * @generated
	 */
	Date getInvoiceDate();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(Date value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_DueDate()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipsesource.accounting.InvoiceState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipsesource.accounting.InvoiceState
	 * @see #setState(InvoiceState)
	 * @see org.eclipsesource.accounting.AccountingPackage#getInvoice_State()
	 * @model required="true"
	 * @generated
	 */
	InvoiceState getState();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Invoice#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipsesource.accounting.InvoiceState
	 * @see #getState()
	 * @generated
	 */
	void setState(InvoiceState value);

} // Invoice
