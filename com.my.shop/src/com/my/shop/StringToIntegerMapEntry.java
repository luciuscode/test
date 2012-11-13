/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String To Integer Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.my.shop.StringToIntegerMapEntry#getKey <em>Key</em>}</li>
 *   <li>{@link com.my.shop.StringToIntegerMapEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.my.shop.ShopPackage#getStringToIntegerMapEntry()
 * @model
 * @generated
 */
public interface StringToIntegerMapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see com.my.shop.ShopPackage#getStringToIntegerMapEntry_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link com.my.shop.StringToIntegerMapEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see com.my.shop.ShopPackage#getStringToIntegerMapEntry_Value()
	 * @model
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link com.my.shop.StringToIntegerMapEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // StringToIntegerMapEntry
