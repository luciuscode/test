/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Score</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.my.shop.ShopPackage#getScore()
 * @model
 * @generated
 */
public final class Score extends AbstractEnumerator {
	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Good</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOD_LITERAL
	 * @model name="Good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD = 0;

	/**
	 * The '<em><b>Average</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_LITERAL
	 * @model name="Average"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE = 1;

	/**
	 * The '<em><b>Bad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_LITERAL
	 * @model name="Bad"
	 * @generated
	 * @ordered
	 */
	public static final int BAD = 2;

	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @generated
	 * @ordered
	 */
	public static final Score GOOD_LITERAL = new Score(GOOD, "Good");

	/**
	 * The '<em><b>Average</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @generated
	 * @ordered
	 */
	public static final Score AVERAGE_LITERAL = new Score(AVERAGE, "Average");

	/**
	 * The '<em><b>Bad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD
	 * @generated
	 * @ordered
	 */
	public static final Score BAD_LITERAL = new Score(BAD, "Bad");

	/**
	 * An array of all the '<em><b>Score</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Score[] VALUES_ARRAY =
		new Score[] {
			GOOD_LITERAL,
			AVERAGE_LITERAL,
			BAD_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Score</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Score</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Score get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Score result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Score</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Score get(int value) {
		switch (value) {
			case GOOD: return GOOD_LITERAL;
			case AVERAGE: return AVERAGE_LITERAL;
			case BAD: return BAD_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Score(int value, String name) {
		super(value, name);
	}

} //Score
