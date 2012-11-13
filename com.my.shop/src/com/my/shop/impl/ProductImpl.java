/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop.impl;

import com.my.shop.Category;
import com.my.shop.Product;
import com.my.shop.Score;
import com.my.shop.ShopFactory;
import com.my.shop.ShopPackage;

import com.my.shop.StringToIntegerMapEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.swt.graphics.RGB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.my.shop.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#isAvaiable <em>Avaiable</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getSalesMap <em>Sales Map</em>}</li>
 *   <li>{@link com.my.shop.impl.ProductImpl#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends EObjectImpl implements Product {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Unnamed";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvaiable() <em>Avaiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvaiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvaiable() <em>Avaiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvaiable()
	 * @generated
	 * @ordered
	 */
	protected boolean avaiable = AVAIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final Score SCORE_EDEFAULT = Score.GOOD_LITERAL;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalesMap() <em>Sales Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesMap()
	 * @generated
	 * @ordered
	 */
	protected EMap salesMap = null;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final RGB BACKGROUND_EDEFAULT = (RGB)ShopFactory.eINSTANCE.createFromString(ShopPackage.eINSTANCE.getRGB(), "255,90,150");

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected RGB background = BACKGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ShopPackage.eINSTANCE.getProduct();
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID != ShopPackage.PRODUCT__CATEGORY) return null;
		return (Category)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eContainer || (eContainerFeatureID != ShopPackage.PRODUCT__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, ShopPackage.CATEGORY__PRODUCTS, Category.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newCategory, ShopPackage.PRODUCT__CATEGORY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__CATEGORY, newCategory, newCategory));
	}

/**
 * <!-- begin-user-doc -->
 * by zhanghao
 * <!-- end-user-doc -->
 * @generated NOT
 */
public double getPrice() {
	return price;
}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvaiable() {
		return avaiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvaiable(boolean newAvaiable) {
		boolean oldAvaiable = avaiable;
		avaiable = newAvaiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__AVAIABLE, oldAvaiable, avaiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Score newScore) {
		Score oldScore = score;
		score = newScore == null ? SCORE_EDEFAULT : newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getSalesMap() {
		if (salesMap == null) {
			salesMap = new EcoreEMap(ShopPackage.eINSTANCE.getStringToIntegerMapEntry(), StringToIntegerMapEntryImpl.class, this, ShopPackage.PRODUCT__SALES_MAP);
		}
		return salesMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(RGB newBackground) {
		RGB oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.PRODUCT__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ShopPackage.PRODUCT__CATEGORY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, ShopPackage.PRODUCT__CATEGORY, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ShopPackage.PRODUCT__CATEGORY:
					return eBasicSetContainer(null, ShopPackage.PRODUCT__CATEGORY, msgs);
				case ShopPackage.PRODUCT__SALES_MAP:
					return ((InternalEList)getSalesMap()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case ShopPackage.PRODUCT__CATEGORY:
					return eContainer.eInverseRemove(this, ShopPackage.CATEGORY__PRODUCTS, Category.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ShopPackage.PRODUCT__NAME:
				return getName();
			case ShopPackage.PRODUCT__CATEGORY:
				return getCategory();
			case ShopPackage.PRODUCT__PRICE:
				return new Double(getPrice());
			case ShopPackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case ShopPackage.PRODUCT__AVAIABLE:
				return isAvaiable() ? Boolean.TRUE : Boolean.FALSE;
			case ShopPackage.PRODUCT__SCORE:
				return getScore();
			case ShopPackage.PRODUCT__SALES_MAP:
				return getSalesMap();
			case ShopPackage.PRODUCT__BACKGROUND:
				return getBackground();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ShopPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case ShopPackage.PRODUCT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case ShopPackage.PRODUCT__PRICE:
				setPrice(((Double)newValue).doubleValue());
				return;
			case ShopPackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ShopPackage.PRODUCT__AVAIABLE:
				setAvaiable(((Boolean)newValue).booleanValue());
				return;
			case ShopPackage.PRODUCT__SCORE:
				setScore((Score)newValue);
				return;
			case ShopPackage.PRODUCT__SALES_MAP:
				getSalesMap().clear();
				getSalesMap().addAll((Collection)newValue);
				return;
			case ShopPackage.PRODUCT__BACKGROUND:
				setBackground((RGB)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ShopPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShopPackage.PRODUCT__CATEGORY:
				setCategory((Category)null);
				return;
			case ShopPackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ShopPackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ShopPackage.PRODUCT__AVAIABLE:
				setAvaiable(AVAIABLE_EDEFAULT);
				return;
			case ShopPackage.PRODUCT__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case ShopPackage.PRODUCT__SALES_MAP:
				getSalesMap().clear();
				return;
			case ShopPackage.PRODUCT__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ShopPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShopPackage.PRODUCT__CATEGORY:
				return getCategory() != null;
			case ShopPackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case ShopPackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ShopPackage.PRODUCT__AVAIABLE:
				return avaiable != AVAIABLE_EDEFAULT;
			case ShopPackage.PRODUCT__SCORE:
				return score != SCORE_EDEFAULT;
			case ShopPackage.PRODUCT__SALES_MAP:
				return salesMap != null && !salesMap.isEmpty();
			case ShopPackage.PRODUCT__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(", avaiable: ");
		result.append(avaiable);
		result.append(", score: ");
		result.append(score);
		result.append(", background: ");
		result.append(background);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
