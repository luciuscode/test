/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.my.shop.impl;

import com.my.shop.Category;
import com.my.shop.Product;
import com.my.shop.Shop;
import com.my.shop.ShopPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.my.shop.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.my.shop.impl.CategoryImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.my.shop.impl.CategoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.my.shop.impl.CategoryImpl#getShop <em>Shop</em>}</li>
 *   <li>{@link com.my.shop.impl.CategoryImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends EObjectImpl implements Category {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList children = null;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList products = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ShopPackage.eINSTANCE.getCategory();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList(Category.class, this, ShopPackage.CATEGORY__CHILDREN, ShopPackage.CATEGORY__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getParent() {
		if (eContainerFeatureID != ShopPackage.CATEGORY__PARENT) return null;
		return (Category)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Category newParent) {
		if (newParent != eContainer || (eContainerFeatureID != ShopPackage.CATEGORY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ShopPackage.CATEGORY__CHILDREN, Category.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newParent, ShopPackage.CATEGORY__PARENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CATEGORY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shop getShop() {
		if (eContainerFeatureID != ShopPackage.CATEGORY__SHOP) return null;
		return (Shop)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShop(Shop newShop) {
		if (newShop != eContainer || (eContainerFeatureID != ShopPackage.CATEGORY__SHOP && newShop != null)) {
			if (EcoreUtil.isAncestor(this, newShop))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newShop != null)
				msgs = ((InternalEObject)newShop).eInverseAdd(this, ShopPackage.SHOP__CATEGORIES, Shop.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newShop, ShopPackage.CATEGORY__SHOP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShopPackage.CATEGORY__SHOP, newShop, newShop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList(Product.class, this, ShopPackage.CATEGORY__PRODUCTS, ShopPackage.PRODUCT__CATEGORY);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ShopPackage.CATEGORY__CHILDREN:
					return ((InternalEList)getChildren()).basicAdd(otherEnd, msgs);
				case ShopPackage.CATEGORY__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, ShopPackage.CATEGORY__PARENT, msgs);
				case ShopPackage.CATEGORY__SHOP:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, ShopPackage.CATEGORY__SHOP, msgs);
				case ShopPackage.CATEGORY__PRODUCTS:
					return ((InternalEList)getProducts()).basicAdd(otherEnd, msgs);
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
				case ShopPackage.CATEGORY__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case ShopPackage.CATEGORY__PARENT:
					return eBasicSetContainer(null, ShopPackage.CATEGORY__PARENT, msgs);
				case ShopPackage.CATEGORY__SHOP:
					return eBasicSetContainer(null, ShopPackage.CATEGORY__SHOP, msgs);
				case ShopPackage.CATEGORY__PRODUCTS:
					return ((InternalEList)getProducts()).basicRemove(otherEnd, msgs);
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
				case ShopPackage.CATEGORY__PARENT:
					return eContainer.eInverseRemove(this, ShopPackage.CATEGORY__CHILDREN, Category.class, msgs);
				case ShopPackage.CATEGORY__SHOP:
					return eContainer.eInverseRemove(this, ShopPackage.SHOP__CATEGORIES, Shop.class, msgs);
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
			case ShopPackage.CATEGORY__NAME:
				return getName();
			case ShopPackage.CATEGORY__CHILDREN:
				return getChildren();
			case ShopPackage.CATEGORY__PARENT:
				return getParent();
			case ShopPackage.CATEGORY__SHOP:
				return getShop();
			case ShopPackage.CATEGORY__PRODUCTS:
				return getProducts();
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
			case ShopPackage.CATEGORY__NAME:
				setName((String)newValue);
				return;
			case ShopPackage.CATEGORY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case ShopPackage.CATEGORY__PARENT:
				setParent((Category)newValue);
				return;
			case ShopPackage.CATEGORY__SHOP:
				setShop((Shop)newValue);
				return;
			case ShopPackage.CATEGORY__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection)newValue);
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
			case ShopPackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShopPackage.CATEGORY__CHILDREN:
				getChildren().clear();
				return;
			case ShopPackage.CATEGORY__PARENT:
				setParent((Category)null);
				return;
			case ShopPackage.CATEGORY__SHOP:
				setShop((Shop)null);
				return;
			case ShopPackage.CATEGORY__PRODUCTS:
				getProducts().clear();
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
			case ShopPackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShopPackage.CATEGORY__CHILDREN:
				return children != null && !children.isEmpty();
			case ShopPackage.CATEGORY__PARENT:
				return getParent() != null;
			case ShopPackage.CATEGORY__SHOP:
				return getShop() != null;
			case ShopPackage.CATEGORY__PRODUCTS:
				return products != null && !products.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
