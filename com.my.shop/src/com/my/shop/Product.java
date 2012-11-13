/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop;


import org.eclipse.emf.common.util.EMap;

import org.eclipse.swt.graphics.RGB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.my.shop.Product#getCategory <em>Category</em>}</li>
 *   <li>{@link com.my.shop.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link com.my.shop.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link com.my.shop.Product#isAvaiable <em>Avaiable</em>}</li>
 *   <li>{@link com.my.shop.Product#getScore <em>Score</em>}</li>
 *   <li>{@link com.my.shop.Product#getSalesMap <em>Sales Map</em>}</li>
 *   <li>{@link com.my.shop.Product#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.my.shop.ShopPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends NamedElement{
	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.my.shop.Category#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see com.my.shop.ShopPackage#getProduct_Category()
	 * @see com.my.shop.Category#getProducts
	 * @model opposite="products"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see com.my.shop.ShopPackage#getProduct_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.my.shop.ShopPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Avaiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avaiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avaiable</em>' attribute.
	 * @see #setAvaiable(boolean)
	 * @see com.my.shop.ShopPackage#getProduct_Avaiable()
	 * @model
	 * @generated
	 */
	boolean isAvaiable();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#isAvaiable <em>Avaiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avaiable</em>' attribute.
	 * @see #isAvaiable()
	 * @generated
	 */
	void setAvaiable(boolean value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The literals are from the enumeration {@link com.my.shop.Score}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see com.my.shop.Score
	 * @see #setScore(Score)
	 * @see com.my.shop.ShopPackage#getProduct_Score()
	 * @model
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see com.my.shop.Score
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Sales Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Map</em>' map.
	 * @see com.my.shop.ShopPackage#getProduct_SalesMap()
	 * @model mapType="com.my.shop.StringToIntegerMapEntry" keyType="java.lang.String" valueType="java.lang.Integer"
	 * @generated
	 */
	EMap getSalesMap();

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * The default value is <code>"255,90,150"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(RGB)
	 * @see com.my.shop.ShopPackage#getProduct_Background()
	 * @model default="255,90,150" dataType="com.my.shop.RGB"
	 * @generated
	 */
	RGB getBackground();

	/**
	 * Sets the value of the '{@link com.my.shop.Product#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(RGB value);

} // Product
