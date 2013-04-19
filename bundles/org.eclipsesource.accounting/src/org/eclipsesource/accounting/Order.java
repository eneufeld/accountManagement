/**
 */
package org.eclipsesource.accounting;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Order#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Order#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Order#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Order#getInvoices <em>Invoices</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Order#getPaymentOffset <em>Payment Offset</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Order#getPricePerUnit <em>Price Per Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
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
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Order#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Project#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_Project()
	 * @see org.eclipsesource.accounting.Project#getOrders
	 * @model opposite="orders" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Order#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Deliverables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Deliverable}.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Deliverable#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverables</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_Deliverables()
	 * @see org.eclipsesource.accounting.Deliverable#getOrder
	 * @model opposite="order" containment="true"
	 * @generated
	 */
	EList<Deliverable> getDeliverables();

	/**
	 * Returns the value of the '<em><b>Invoices</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipsesource.accounting.Invoice}.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Invoice#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoices</em>' containment reference list.
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_Invoices()
	 * @see org.eclipsesource.accounting.Invoice#getOrder
	 * @model opposite="order" containment="true"
	 * @generated
	 */
	EList<Invoice> getInvoices();

	/**
	 * Returns the value of the '<em><b>Payment Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Offset</em>' attribute.
	 * @see #setPaymentOffset(int)
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_PaymentOffset()
	 * @model
	 * @generated
	 */
	int getPaymentOffset();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Order#getPaymentOffset <em>Payment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Offset</em>' attribute.
	 * @see #getPaymentOffset()
	 * @generated
	 */
	void setPaymentOffset(int value);

	/**
	 * Returns the value of the '<em><b>Price Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Per Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Unit</em>' attribute.
	 * @see #setPricePerUnit(double)
	 * @see org.eclipsesource.accounting.AccountingPackage#getOrder_PricePerUnit()
	 * @model required="true"
	 * @generated
	 */
	double getPricePerUnit();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Order#getPricePerUnit <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Unit</em>' attribute.
	 * @see #getPricePerUnit()
	 * @generated
	 */
	void setPricePerUnit(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean validateUnitAmount(DiagnosticChain diagnosticChain, Map<Object, Object> context);

} // Order
