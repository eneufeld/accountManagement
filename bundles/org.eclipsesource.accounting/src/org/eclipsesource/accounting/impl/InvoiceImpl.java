/**
 */
package org.eclipsesource.accounting.impl;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Employee;
import org.eclipsesource.accounting.Invoice;
import org.eclipsesource.accounting.InvoiceState;
import org.eclipsesource.accounting.Order;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getAdvisor <em>Advisor</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getUnitAmount <em>Unit Amount</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.InvoiceImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvoiceImpl extends EObjectImpl implements Invoice {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdvisor() <em>Advisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvisor()
	 * @generated
	 * @ordered
	 */
	protected Employee advisor;

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
	 * The default value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INVOICE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected Date invoiceDate = INVOICE_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final InvoiceState STATE_EDEFAULT = InvoiceState.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected InvoiceState state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getAdvisor() {
		if (advisor != null && advisor.eIsProxy()) {
			InternalEObject oldAdvisor = (InternalEObject)advisor;
			advisor = (Employee)eResolveProxy(oldAdvisor);
			if (advisor != oldAdvisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.INVOICE__ADVISOR, oldAdvisor, advisor));
			}
		}
		return advisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetAdvisor() {
		return advisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvisor(Employee newAdvisor) {
		Employee oldAdvisor = advisor;
		advisor = newAdvisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__ADVISOR, oldAdvisor, advisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (eContainerFeatureID() != AccountingPackage.INVOICE__ORDER) return null;
		return (Order)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrder, AccountingPackage.INVOICE__ORDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		if (newOrder != eInternalContainer() || (eContainerFeatureID() != AccountingPackage.INVOICE__ORDER && newOrder != null)) {
			if (EcoreUtil.isAncestor(this, newOrder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, AccountingPackage.ORDER__INVOICES, Order.class, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__ORDER, newOrder, newOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__UNIT_AMOUNT, oldUnitAmount, unitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceDate(Date newInvoiceDate) {
		Date oldInvoiceDate = invoiceDate;
		invoiceDate = newInvoiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__INVOICE_DATE, oldInvoiceDate, invoiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date getDueDate() {
		if(getInvoiceDate()==null)
			return null;
		Calendar cal=Calendar.getInstance();
		cal.setTime(getInvoiceDate());
		cal.add(Calendar.DAY_OF_MONTH, getOrder().getPaymentOffset());
		return cal.getTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(InvoiceState newState) {
		InvoiceState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.INVOICE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.INVOICE__ORDER:
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
			case AccountingPackage.INVOICE__ORDER:
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
			case AccountingPackage.INVOICE__ORDER:
				return eInternalContainer().eInverseRemove(this, AccountingPackage.ORDER__INVOICES, Order.class, msgs);
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
			case AccountingPackage.INVOICE__ID:
				return getId();
			case AccountingPackage.INVOICE__ADVISOR:
				if (resolve) return getAdvisor();
				return basicGetAdvisor();
			case AccountingPackage.INVOICE__ORDER:
				return getOrder();
			case AccountingPackage.INVOICE__UNIT_AMOUNT:
				return getUnitAmount();
			case AccountingPackage.INVOICE__INVOICE_DATE:
				return getInvoiceDate();
			case AccountingPackage.INVOICE__DUE_DATE:
				return getDueDate();
			case AccountingPackage.INVOICE__STATE:
				return getState();
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
			case AccountingPackage.INVOICE__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.INVOICE__ADVISOR:
				setAdvisor((Employee)newValue);
				return;
			case AccountingPackage.INVOICE__ORDER:
				setOrder((Order)newValue);
				return;
			case AccountingPackage.INVOICE__UNIT_AMOUNT:
				setUnitAmount((Double)newValue);
				return;
			case AccountingPackage.INVOICE__INVOICE_DATE:
				setInvoiceDate((Date)newValue);
				return;
			case AccountingPackage.INVOICE__STATE:
				setState((InvoiceState)newValue);
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
			case AccountingPackage.INVOICE__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.INVOICE__ADVISOR:
				setAdvisor((Employee)null);
				return;
			case AccountingPackage.INVOICE__ORDER:
				setOrder((Order)null);
				return;
			case AccountingPackage.INVOICE__UNIT_AMOUNT:
				setUnitAmount(UNIT_AMOUNT_EDEFAULT);
				return;
			case AccountingPackage.INVOICE__INVOICE_DATE:
				setInvoiceDate(INVOICE_DATE_EDEFAULT);
				return;
			case AccountingPackage.INVOICE__STATE:
				setState(STATE_EDEFAULT);
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
			case AccountingPackage.INVOICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.INVOICE__ADVISOR:
				return advisor != null;
			case AccountingPackage.INVOICE__ORDER:
				return getOrder() != null;
			case AccountingPackage.INVOICE__UNIT_AMOUNT:
				return unitAmount != UNIT_AMOUNT_EDEFAULT;
			case AccountingPackage.INVOICE__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? invoiceDate != null : !INVOICE_DATE_EDEFAULT.equals(invoiceDate);
			case AccountingPackage.INVOICE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case AccountingPackage.INVOICE__STATE:
				return state != STATE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", unitAmount: ");
		result.append(unitAmount);
		result.append(", invoiceDate: ");
		result.append(invoiceDate);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
