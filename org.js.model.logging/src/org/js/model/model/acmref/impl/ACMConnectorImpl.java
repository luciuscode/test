/**
 */
package org.js.model.model.acmref.impl;

import conf.impl.AspectInstanceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.js.model.model.acmref.ACMConnector;
import org.js.model.model.acmref.AcmrefPackage;

import org.js.model.rbac.AccessControlModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACM Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.js.model.model.acmref.impl.ACMConnectorImpl#getACMRef <em>ACM Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ACMConnectorImpl extends AspectInstanceImpl implements ACMConnector {
	/**
	 * The cached value of the '{@link #getACMRef() <em>ACM Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACMRef()
	 * @generated
	 * @ordered
	 */
	protected AccessControlModel acmRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACMConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcmrefPackage.Literals.ACM_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlModel getACMRef() {
		if (acmRef != null && acmRef.eIsProxy()) {
			InternalEObject oldACMRef = (InternalEObject)acmRef;
			acmRef = (AccessControlModel)eResolveProxy(oldACMRef);
			if (acmRef != oldACMRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcmrefPackage.ACM_CONNECTOR__ACM_REF, oldACMRef, acmRef));
			}
		}
		return acmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlModel basicGetACMRef() {
		return acmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACMRef(AccessControlModel newACMRef) {
		AccessControlModel oldACMRef = acmRef;
		acmRef = newACMRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmrefPackage.ACM_CONNECTOR__ACM_REF, oldACMRef, acmRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcmrefPackage.ACM_CONNECTOR__ACM_REF:
				if (resolve) return getACMRef();
				return basicGetACMRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcmrefPackage.ACM_CONNECTOR__ACM_REF:
				setACMRef((AccessControlModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AcmrefPackage.ACM_CONNECTOR__ACM_REF:
				setACMRef((AccessControlModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AcmrefPackage.ACM_CONNECTOR__ACM_REF:
				return acmRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ACMConnectorImpl
