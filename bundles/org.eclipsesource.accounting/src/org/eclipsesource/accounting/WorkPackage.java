/**
 */
package org.eclipsesource.accounting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipsesource.accounting.WorkPackage#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.WorkPackage#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.WorkPackage#getHours <em>Hours</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.WorkPackage#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipsesource.accounting.WorkPackage#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage_Project()
	 * @model required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.WorkPackage#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.WorkPackage#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(double)
	 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage_Hours()
	 * @model required="true"
	 * @generated
	 */
	double getHours();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.WorkPackage#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(double value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage_Task()
	 * @model
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.WorkPackage#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipsesource.accounting.AccountingPackage#getWorkPackage_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipsesource.accounting.WorkPackage#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // WorkPackage
