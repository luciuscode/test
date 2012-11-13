/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.my.shop.Shop#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.my.shop.ShopPackage#getShop()
 * @model
 * @generated
 */
public interface Shop extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link com.my.shop.Category}.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Category#getShop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see com.my.shop.ShopPackage#getShop_Categories()
	 * @see com.my.shop.Category#getShop
	 * @model type="com.my.shop.Category" opposite="shop" containment="true"
	 * @generated
	 */
	EList getCategories();

} // Shop
