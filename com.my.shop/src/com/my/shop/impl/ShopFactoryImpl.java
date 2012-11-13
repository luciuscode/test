/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop.impl;

import com.my.shop.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.swt.graphics.RGB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShopFactoryImpl extends EFactoryImpl implements ShopFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShopPackage.SHOP: return createShop();
			case ShopPackage.CATEGORY: return createCategory();
			case ShopPackage.PRODUCT: return createProduct();
			case ShopPackage.STRING_TO_INTEGER_MAP_ENTRY: return (EObject)createStringToIntegerMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ShopPackage.SCORE: {
				Score result = Score.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case ShopPackage.RGB:
				return createRGBFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ShopPackage.SCORE:
				return instanceValue == null ? null : instanceValue.toString();
			case ShopPackage.RGB:
				return convertRGBToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shop createShop() {
		ShopImpl shop = new ShopImpl();
		return shop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry createStringToIntegerMapEntry() {
		StringToIntegerMapEntryImpl stringToIntegerMapEntry = new StringToIntegerMapEntryImpl();
		return stringToIntegerMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RGB createRGBFromString(EDataType eDataType, String initialValue) {
		String[] values = initialValue.split(",");
		int red=Integer.parseInt(values[0]);
		int green=Integer.parseInt(values[1]);
		int blue=Integer.parseInt(values[2]);
		RGB rgb = new RGB(red,green,blue);
		return rgb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRGBToString(EDataType eDataType, Object instanceValue) {
		RGB rgb = (RGB) instanceValue;
		return rgb.red + "," + rgb.green + "," + rgb.blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopPackage getShopPackage() {
		return (ShopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ShopPackage getPackage() {
		return ShopPackage.eINSTANCE;
	}

} //ShopFactoryImpl
