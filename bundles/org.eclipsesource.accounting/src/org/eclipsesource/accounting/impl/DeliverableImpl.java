/**
 */
package org.eclipsesource.accounting.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Deliverable;
import org.eclipsesource.accounting.Order;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.impl.DeliverableImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.DeliverableImpl#getUnitAmount <em>Unit Amount</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.DeliverableImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliverableImpl extends EObjectImpl implements Deliverable {
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitAmount() <em>Unit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double UNIT_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnitAmount() <em>Unit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAmount()
	 * @generated
	 * @ordered
	 */
	protected double unitAmount = UNIT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.DELIVERABLE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnitAmount() {
		return unitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitAmount(double newUnitAmount) {
		double oldUnitAmount = unitAmount;
		unitAmount = newUnitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.DELIVERABLE__UNIT_AMOUNT, oldUnitAmount, unitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (eContainerFeatureID() != AccountingPackage.DELIVERABLE__ORDER) return null;
		return (Order)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrder, AccountingPackage.DELIVERABLE__ORDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		if (newOrder != eInternalContainer() || (eContainerFeatureID() != AccountingPackage.DELIVERABLE__ORDER && newOrder != null)) {
			if (EcoreUtil.isAncestor(this, newOrder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, AccountingPackage.ORDER__DELIVERABLES, Order.class, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.DELIVERABLE__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__ORDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrder((Order)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__ORDER:
				return basicSetOrder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AccountingPackage.DELIVERABLE__ORDER:
				return eInternalContainer().eInverseRemove(this, AccountingPackage.ORDER__DELIVERABLES, Order.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__DUE_DATE:
				return getDueDate();
			case AccountingPackage.DELIVERABLE__UNIT_AMOUNT:
				return getUnitAmount();
			case AccountingPackage.DELIVERABLE__ORDER:
				return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case AccountingPackage.DELIVERABLE__UNIT_AMOUNT:
				setUnitAmount((Double)newValue);
				return;
			case AccountingPackage.DELIVERABLE__ORDER:
				setOrder((Order)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case AccountingPackage.DELIVERABLE__UNIT_AMOUNT:
				setUnitAmount(UNIT_AMOUNT_EDEFAULT);
				return;
			case AccountingPackage.DELIVERABLE__ORDER:
				setOrder((Order)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountingPackage.DELIVERABLE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case AccountingPackage.DELIVERABLE__UNIT_AMOUNT:
				return unitAmount != UNIT_AMOUNT_EDEFAULT;
			case AccountingPackage.DELIVERABLE__ORDER:
				return getOrder() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dueDate: ");
		result.append(dueDate);
		result.append(", unitAmount: ");
		result.append(unitAmount);
		result.append(')');
		return result.toString();
	}

} //DeliverableImpl
