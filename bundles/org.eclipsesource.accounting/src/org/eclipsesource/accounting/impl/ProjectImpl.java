/**
 */
package org.eclipsesource.accounting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Client;
import org.eclipsesource.accounting.Order;
import org.eclipsesource.accounting.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.impl.ProjectImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.ProjectImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		if (eContainerFeatureID() != AccountingPackage.PROJECT__CLIENT) return null;
		return (Client)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClient, AccountingPackage.PROJECT__CLIENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != eInternalContainer() || (eContainerFeatureID() != AccountingPackage.PROJECT__CLIENT && newClient != null)) {
			if (EcoreUtil.isAncestor(this, newClient))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, AccountingPackage.CLIENT__PROJECTS, Client.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.PROJECT__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentWithInverseEList<Order>(Order.class, this, AccountingPackage.PROJECT__ORDERS, AccountingPackage.ORDER__PROJECT);
		}
		return orders;
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
			case AccountingPackage.PROJECT__CLIENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClient((Client)otherEnd, msgs);
			case AccountingPackage.PROJECT__ORDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrders()).basicAdd(otherEnd, msgs);
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
			case AccountingPackage.PROJECT__CLIENT:
				return basicSetClient(null, msgs);
			case AccountingPackage.PROJECT__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.PROJECT__CLIENT:
				return eInternalContainer().eInverseRemove(this, AccountingPackage.CLIENT__PROJECTS, Client.class, msgs);
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
			case AccountingPackage.PROJECT__CLIENT:
				return getClient();
			case AccountingPackage.PROJECT__ORDERS:
				return getOrders();
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
			case AccountingPackage.PROJECT__CLIENT:
				setClient((Client)newValue);
				return;
			case AccountingPackage.PROJECT__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
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
			case AccountingPackage.PROJECT__CLIENT:
				setClient((Client)null);
				return;
			case AccountingPackage.PROJECT__ORDERS:
				getOrders().clear();
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
			case AccountingPackage.PROJECT__CLIENT:
				return getClient() != null;
			case AccountingPackage.PROJECT__ORDERS:
				return orders != null && !orders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
