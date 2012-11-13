/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.my.shop.ShopFactory
 * @model kind="package"
 * @generated
 */
public interface ShopPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.my.shop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.my.shop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShopPackage eINSTANCE = com.my.shop.impl.ShopPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.my.shop.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.NamedElement
	 * @see com.my.shop.impl.ShopPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.my.shop.impl.ShopImpl <em>Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.impl.ShopImpl
	 * @see com.my.shop.impl.ShopPackageImpl#getShop()
	 * @generated
	 */
	int SHOP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__CATEGORIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.my.shop.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.impl.CategoryImpl
	 * @see com.my.shop.impl.ShopPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shop</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SHOP = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRODUCTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.my.shop.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.impl.ProductImpl
	 * @see com.my.shop.impl.ShopPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avaiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__AVAIABLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SCORE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sales Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SALES_MAP = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BACKGROUND = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;


	/**
	 * The meta object id for the '{@link com.my.shop.impl.StringToIntegerMapEntryImpl <em>String To Integer Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.impl.StringToIntegerMapEntryImpl
	 * @see com.my.shop.impl.ShopPackageImpl#getStringToIntegerMapEntry()
	 * @generated
	 */
	int STRING_TO_INTEGER_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INTEGER_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INTEGER_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the the '<em>String To Integer Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INTEGER_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.my.shop.Score <em>Score</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.my.shop.Score
	 * @see com.my.shop.impl.ShopPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 5;


	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.RGB
	 * @see com.my.shop.impl.ShopPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 6;


	/**
	 * Returns the meta object for class '{@link com.my.shop.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop</em>'.
	 * @see com.my.shop.Shop
	 * @generated
	 */
	EClass getShop();

	/**
	 * Returns the meta object for the containment reference list '{@link com.my.shop.Shop#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see com.my.shop.Shop#getCategories()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Categories();

	/**
	 * Returns the meta object for class '{@link com.my.shop.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see com.my.shop.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link com.my.shop.Category#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.my.shop.Category#getChildren()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Children();

	/**
	 * Returns the meta object for the container reference '{@link com.my.shop.Category#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.my.shop.Category#getParent()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Parent();

	/**
	 * Returns the meta object for the container reference '{@link com.my.shop.Category#getShop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Shop</em>'.
	 * @see com.my.shop.Category#getShop()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Shop();

	/**
	 * Returns the meta object for the containment reference list '{@link com.my.shop.Category#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.my.shop.Category#getProducts()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Products();

	/**
	 * Returns the meta object for class '{@link com.my.shop.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.my.shop.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.my.shop.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see com.my.shop.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.my.shop.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.my.shop.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.Product#isAvaiable <em>Avaiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avaiable</em>'.
	 * @see com.my.shop.Product#isAvaiable()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Avaiable();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.Product#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see com.my.shop.Product#getScore()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Score();

	/**
	 * Returns the meta object for the map '{@link com.my.shop.Product#getSalesMap <em>Sales Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Sales Map</em>'.
	 * @see com.my.shop.Product#getSalesMap()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SalesMap();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.Product#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see com.my.shop.Product#getBackground()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Background();

	/**
	 * Returns the meta object for class '{@link com.my.shop.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.my.shop.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.my.shop.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.my.shop.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Integer Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Integer Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="java.lang.String"
	 *        valueType="java.lang.Integer"
	 * @generated
	 */
	EClass getStringToIntegerMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToIntegerMapEntry()
	 * @generated
	 */
	EAttribute getStringToIntegerMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToIntegerMapEntry()
	 * @generated
	 */
	EAttribute getStringToIntegerMapEntry_Value();

	/**
	 * Returns the meta object for enum '{@link com.my.shop.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Score</em>'.
	 * @see com.my.shop.Score
	 * @generated
	 */
	EEnum getScore();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see org.eclipse.swt.graphics.RGB
	 * @model instanceClass="org.eclipse.swt.graphics.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShopFactory getShopFactory();

} //ShopPackage
