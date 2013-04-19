/**
 */
package org.eclipsesource.accounting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipsesource.accounting.AccountingPackage;
import org.eclipsesource.accounting.Employee;
import org.eclipsesource.accounting.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.impl.EmployeeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.impl.EmployeeImpl#getEmails <em>Emails</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends NamedElementImpl implements Employee {
	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPackage> work;

	/**
	 * The cached value of the '{@link #getEmails() <em>Emails</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPackage> getWork() {
		if (work == null) {
			work = new EObjectContainmentEList<WorkPackage>(WorkPackage.class, this, AccountingPackage.EMPLOYEE__WORK);
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmails() {
		if (emails == null) {
			emails = new EDataTypeUniqueEList<String>(String.class, this, AccountingPackage.EMPLOYEE__EMAILS);
		}
		return emails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.EMPLOYEE__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.EMPLOYEE__WORK:
				return getWork();
			case AccountingPackage.EMPLOYEE__EMAILS:
				return getEmails();
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
			case AccountingPackage.EMPLOYEE__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends WorkPackage>)newValue);
				return;
			case AccountingPackage.EMPLOYEE__EMAILS:
				getEmails().clear();
				getEmails().addAll((Collection<? extends String>)newValue);
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
			case AccountingPackage.EMPLOYEE__WORK:
				getWork().clear();
				return;
			case AccountingPackage.EMPLOYEE__EMAILS:
				getEmails().clear();
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
			case AccountingPackage.EMPLOYEE__WORK:
				return work != null && !work.isEmpty();
			case AccountingPackage.EMPLOYEE__EMAILS:
				return emails != null && !emails.isEmpty();
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
		result.append(" (emails: ");
		result.append(emails);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
