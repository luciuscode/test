/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: CustomActivityNodeImpl.java,v 1.2 2009-11-04 16:19:43 chsaad Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jwt.meta.model.processes.impl.ActivityNodeImpl;
import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage;
import org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jwt.sample.aspectschildextender.impl.CustomActivityNodeImpl#getCustomcontrolnodeprop1 <em>Customcontrolnodeprop1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomActivityNodeImpl extends ActivityNodeImpl implements CustomActivityNode {
	/**
	 * The default value of the '{@link #getCustomcontrolnodeprop1() <em>Customcontrolnodeprop1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomcontrolnodeprop1()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMCONTROLNODEPROP1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomcontrolnodeprop1() <em>Customcontrolnodeprop1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomcontrolnodeprop1()
	 * @generated
	 * @ordered
	 */
	protected String customcontrolnodeprop1 = CUSTOMCONTROLNODEPROP1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AspectsChildExtenderPackage.Literals.CUSTOM_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomcontrolnodeprop1() {
		return customcontrolnodeprop1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomcontrolnodeprop1(String newCustomcontrolnodeprop1) {
		String oldCustomcontrolnodeprop1 = customcontrolnodeprop1;
		customcontrolnodeprop1 = newCustomcontrolnodeprop1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1, oldCustomcontrolnodeprop1, customcontrolnodeprop1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1:
				return getCustomcontrolnodeprop1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1:
				setCustomcontrolnodeprop1((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1:
				setCustomcontrolnodeprop1(CUSTOMCONTROLNODEPROP1_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1:
				return CUSTOMCONTROLNODEPROP1_EDEFAULT == null ? customcontrolnodeprop1 != null : !CUSTOMCONTROLNODEPROP1_EDEFAULT.equals(customcontrolnodeprop1);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (customcontrolnodeprop1: ");
		result.append(customcontrolnodeprop1);
		result.append(')');
		return result.toString();
	}

} //CustomActivityNodeImpl
