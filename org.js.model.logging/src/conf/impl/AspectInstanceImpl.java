/**
 */
package conf.impl;

import conf.ConfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.jwt.we.conf.model.AspectInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conf.impl.AspectInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link conf.impl.AspectInstanceImpl#getTargetModelElement <em>Target Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectInstanceImpl extends EObjectImpl implements AspectInstance {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetModelElement() <em>Target Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModelElement()
	 * @generated
	 * @ordered
	 */
	protected EObject targetModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfPackage.Literals.ASPECT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTargetModelElement() {
		if (targetModelElement != null && targetModelElement.eIsProxy()) {
			InternalEObject oldTargetModelElement = (InternalEObject)targetModelElement;
			targetModelElement = eResolveProxy(oldTargetModelElement);
			if (targetModelElement != oldTargetModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT, oldTargetModelElement, targetModelElement));
			}
		}
		return targetModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTargetModelElement() {
		return targetModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModelElement(EObject newTargetModelElement) {
		EObject oldTargetModelElement = targetModelElement;
		targetModelElement = newTargetModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT, oldTargetModelElement, targetModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfPackage.ASPECT_INSTANCE__ID:
				return getId();
			case ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT:
				if (resolve) return getTargetModelElement();
				return basicGetTargetModelElement();
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
			case ConfPackage.ASPECT_INSTANCE__ID:
				setId((String)newValue);
				return;
			case ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT:
				setTargetModelElement((EObject)newValue);
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
			case ConfPackage.ASPECT_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT:
				setTargetModelElement((EObject)null);
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
			case ConfPackage.ASPECT_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT:
				return targetModelElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AspectInstanceImpl
