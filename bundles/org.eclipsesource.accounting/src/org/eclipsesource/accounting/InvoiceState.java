/**
 */
package org.eclipsesource.accounting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Invoice State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipsesource.accounting.AccountingPackage#getInvoiceState()
 * @model
 * @generated
 */
public enum InvoiceState implements Enumerator {
	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "New", "New"),

	/**
	 * The '<em><b>Invoiced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICED_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICED(1, "Invoiced", "Invoiced"),

	/**
	 * The '<em><b>Paid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAID_VALUE
	 * @generated
	 * @ordered
	 */
	PAID(2, "Paid", "Paid");

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model name="New"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>Invoiced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invoiced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVOICED
	 * @model name="Invoiced"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICED_VALUE = 1;

	/**
	 * The '<em><b>Paid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAID
	 * @model name="Paid"
	 * @generated
	 * @ordered
	 */
	public static final int PAID_VALUE = 2;

	/**
	 * An array of all the '<em><b>Invoice State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InvoiceState[] VALUES_ARRAY =
		new InvoiceState[] {
			NEW,
			INVOICED,
			PAID,
		};

	/**
	 * A public read-only list of all the '<em><b>Invoice State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InvoiceState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Invoice State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InvoiceState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvoiceState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invoice State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InvoiceState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvoiceState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invoice State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InvoiceState get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case INVOICED_VALUE: return INVOICED;
			case PAID_VALUE: return PAID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InvoiceState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InvoiceState
