/**
 */
package org.eclipsesource.accounting.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Deliverable;
import org.eclipsesource.accounting.Invoice;
import org.eclipsesource.accounting.Order;
import org.eclipsesource.accounting.Project;
import org.eclipsesource.accounting.util.AccountingValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getDeliverables <em>Deliverables</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getInvoices <em>Invoices</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getPaymentOffset <em>Payment Offset</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.OrderImpl#getPricePerUnit <em>Price Per Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends EObjectImpl implements Order {
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
	 * The cached value of the '{@link #getDeliverables() <em>Deliverables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverables()
	 * @generated
	 * @ordered
	 */
	protected EList<Deliverable> deliverables;

	/**
	 * The cached value of the '{@link #getInvoices() <em>Invoices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoice> invoices;

	/**
	 * The default value of the '{@link #getPaymentOffset() <em>Payment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int PAYMENT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPaymentOffset() <em>Payment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentOffset()
	 * @generated
	 * @ordered
	 */
	protected int paymentOffset = PAYMENT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricePerUnit() <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_PER_UNIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPricePerUnit() <em>Price Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerUnit()
	 * @generated
	 * @ordered
	 */
	protected double pricePerUnit = PRICE_PER_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != AccountingPackage.ORDER__PROJECT) return null;
		return (Project)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, AccountingPackage.ORDER__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != AccountingPackage.ORDER__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, AccountingPackage.PROJECT__ORDERS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ORDER__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deliverable> getDeliverables() {
		if (deliverables == null) {
			deliverables = new EObjectContainmentWithInverseEList<Deliverable>(Deliverable.class, this, AccountingPackage.ORDER__DELIVERABLES, AccountingPackage.DELIVERABLE__ORDER);
		}
		return deliverables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoice> getInvoices() {
		if (invoices == null) {
			invoices = new EObjectContainmentWithInverseEList<Invoice>(Invoice.class, this, AccountingPackage.ORDER__INVOICES, AccountingPackage.INVOICE__ORDER);
		}
		return invoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPaymentOffset() {
		return paymentOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentOffset(int newPaymentOffset) {
		int oldPaymentOffset = paymentOffset;
		paymentOffset = newPaymentOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ORDER__PAYMENT_OFFSET, oldPaymentOffset, paymentOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerUnit(double newPricePerUnit) {
		double oldPricePerUnit = pricePerUnit;
		pricePerUnit = newPricePerUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ORDER__PRICE_PER_UNIT, oldPricePerUnit, pricePerUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUnitAmount(DiagnosticChain diagnosticChain, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		double numAmountDeliverable=0;
		for(Deliverable deliverable:getDeliverables()){
			numAmountDeliverable+=deliverable.getUnitAmount();
		}
		double numAmountInvoice=0;
		for(Invoice invoice:getInvoices()){
			numAmountInvoice+=invoice.getUnitAmount();
		}
		EReference blameReference=null;
		if(numAmountDeliverable<numAmountInvoice){
			blameReference=AccountingPackage.eINSTANCE.getOrder_Deliverables();
		}
		else if(numAmountInvoice<numAmountDeliverable){
			blameReference=AccountingPackage.eINSTANCE.getOrder_Invoices();
		}
		
		if (blameReference!=null) {
			if (diagnosticChain != null) {
				diagnosticChain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AccountingValidator.DIAGNOSTIC_SOURCE,
						 AccountingValidator.ORDER__VALIDATE_UNIT_AMOUNT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUnitAmount", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this,blameReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ORDER__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case AccountingPackage.ORDER__DELIVERABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeliverables()).basicAdd(otherEnd, msgs);
			case AccountingPackage.ORDER__INVOICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvoices()).basicAdd(otherEnd, msgs);
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
			case AccountingPackage.ORDER__PROJECT:
				return basicSetProject(null, msgs);
			case AccountingPackage.ORDER__DELIVERABLES:
				return ((InternalEList<?>)getDeliverables()).basicRemove(otherEnd, msgs);
			case AccountingPackage.ORDER__INVOICES:
				return ((InternalEList<?>)getInvoices()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.ORDER__PROJECT:
				return eInternalContainer().eInverseRemove(this, AccountingPackage.PROJECT__ORDERS, Project.class, msgs);
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
			case AccountingPackage.ORDER__ID:
				return getId();
			case AccountingPackage.ORDER__PROJECT:
				return getProject();
			case AccountingPackage.ORDER__DELIVERABLES:
				return getDeliverables();
			case AccountingPackage.ORDER__INVOICES:
				return getInvoices();
			case AccountingPackage.ORDER__PAYMENT_OFFSET:
				return getPaymentOffset();
			case AccountingPackage.ORDER__PRICE_PER_UNIT:
				return getPricePerUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.ORDER__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.ORDER__PROJECT:
				setProject((Project)newValue);
				return;
			case AccountingPackage.ORDER__DELIVERABLES:
				getDeliverables().clear();
				getDeliverables().addAll((Collection<? extends Deliverable>)newValue);
				return;
			case AccountingPackage.ORDER__INVOICES:
				getInvoices().clear();
				getInvoices().addAll((Collection<? extends Invoice>)newValue);
				return;
			case AccountingPackage.ORDER__PAYMENT_OFFSET:
				setPaymentOffset((Integer)newValue);
				return;
			case AccountingPackage.ORDER__PRICE_PER_UNIT:
				setPricePerUnit((Double)newValue);
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
			case AccountingPackage.ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.ORDER__PROJECT:
				setProject((Project)null);
				return;
			case AccountingPackage.ORDER__DELIVERABLES:
				getDeliverables().clear();
				return;
			case AccountingPackage.ORDER__INVOICES:
				getInvoices().clear();
				return;
			case AccountingPackage.ORDER__PAYMENT_OFFSET:
				setPaymentOffset(PAYMENT_OFFSET_EDEFAULT);
				return;
			case AccountingPackage.ORDER__PRICE_PER_UNIT:
				setPricePerUnit(PRICE_PER_UNIT_EDEFAULT);
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
			case AccountingPackage.ORDER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.ORDER__PROJECT:
				return getProject() != null;
			case AccountingPackage.ORDER__DELIVERABLES:
				return deliverables != null && !deliverables.isEmpty();
			case AccountingPackage.ORDER__INVOICES:
				return invoices != null && !invoices.isEmpty();
			case AccountingPackage.ORDER__PAYMENT_OFFSET:
				return paymentOffset != PAYMENT_OFFSET_EDEFAULT;
			case AccountingPackage.ORDER__PRICE_PER_UNIT:
				return pricePerUnit != PRICE_PER_UNIT_EDEFAULT;
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
		result.append(", paymentOffset: ");
		result.append(paymentOffset);
		result.append(", pricePerUnit: ");
		result.append(pricePerUnit);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
