/**
 */
package org.js.model.model.acmref;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.we.conf.model.AspectInstance;

import org.js.model.rbac.AccessControlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACM Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.js.model.model.acmref.ACMConnector#getACMRef <em>ACM Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.js.model.model.acmref.AcmrefPackage#getACMConnector()
 * @model
 * @generated
 */
public interface ACMConnector extends EObject, AspectInstance {
	/**
	 * Returns the value of the '<em><b>ACM Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACM Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACM Ref</em>' reference.
	 * @see #setACMRef(AccessControlModel)
	 * @see org.js.model.model.acmref.AcmrefPackage#getACMConnector_ACMRef()
	 * @model
	 * @generated
	 */
	AccessControlModel getACMRef();

	/**
	 * Sets the value of the '{@link org.js.model.model.acmref.ACMConnector#getACMRef <em>ACM Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACM Ref</em>' reference.
	 * @see #getACMRef()
	 * @generated
	 */
	void setACMRef(AccessControlModel value);

} // ACMConnector
