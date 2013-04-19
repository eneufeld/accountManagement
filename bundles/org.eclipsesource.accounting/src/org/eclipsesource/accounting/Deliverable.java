/**
 */
package org.eclipsesource.accounting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.Deliverable#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Deliverable#getUnitAmount <em>Unit Amount</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.Deliverable#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getDeliverable()
 * @model
 * @generated
 */
public interface Deliverable extends EObject {
	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.eclipsesource.accounting.AccountingPackage#getDeliverable_DueDate()
	 * @model required="true"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Deliverable#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

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
	 * @see org.eclipsesource.accounting.AccountingPackage#getDeliverable_UnitAmount()
	 * @model required="true"
	 * @generated
	 */
	double getUnitAmount();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Deliverable#getUnitAmount <em>Unit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Amount</em>' attribute.
	 * @see #getUnitAmount()
	 * @generated
	 */
	void setUnitAmount(double value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipsesource.accounting.Order#getDeliverables <em>Deliverables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' container reference.
	 * @see #setOrder(Order)
	 * @see org.eclipsesource.accounting.AccountingPackage#getDeliverable_Order()
	 * @see org.eclipsesource.accounting.Order#getDeliverables
	 * @model opposite="deliverables" required="true" transient="false"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.Deliverable#getOrder <em>Order</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' container reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // Deliverable
