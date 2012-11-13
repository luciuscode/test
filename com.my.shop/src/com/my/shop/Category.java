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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.my.shop.Category#getChildren <em>Children</em>}</li>
 *   <li>{@link com.my.shop.Category#getParent <em>Parent</em>}</li>
 *   <li>{@link com.my.shop.Category#getShop <em>Shop</em>}</li>
 *   <li>{@link com.my.shop.Category#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.my.shop.ShopPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link com.my.shop.Category}.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Category#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see com.my.shop.ShopPackage#getCategory_Children()
	 * @see com.my.shop.Category#getParent
	 * @model type="com.my.shop.Category" opposite="parent" containment="true"
	 * @generated
	 */
	EList getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Category#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Category)
	 * @see com.my.shop.ShopPackage#getCategory_Parent()
	 * @see com.my.shop.Category#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Category getParent();

	/**
	 * Sets the value of the '{@link com.my.shop.Category#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Category value);

	/**
	 * Returns the value of the '<em><b>Shop</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Shop#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shop</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shop</em>' container reference.
	 * @see #setShop(Shop)
	 * @see com.my.shop.ShopPackage#getCategory_Shop()
	 * @see com.my.shop.Shop#getCategories
	 * @model opposite="categories"
	 * @generated
	 */
	Shop getShop();

	/**
	 * Sets the value of the '{@link com.my.shop.Category#getShop <em>Shop</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shop</em>' container reference.
	 * @see #getShop()
	 * @generated
	 */
	void setShop(Shop value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.my.shop.Product}.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.my.shop.ShopPackage#getCategory_Products()
	 * @see com.my.shop.Product#getCategory
	 * @model type="com.my.shop.Product" opposite="category" containment="true"
	 * @generated
	 */
	EList getProducts();

} // Category
