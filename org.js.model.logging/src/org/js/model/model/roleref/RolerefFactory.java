/**
 */
package org.js.model.model.roleref;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.js.model.model.roleref.RolerefPackage
 * @generated
 */
public interface RolerefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RolerefFactory eINSTANCE = org.js.model.model.roleref.impl.RolerefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connector</em>'.
	 * @generated
	 */
	RoleConnector createRoleConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RolerefPackage getRolerefPackage();

} //RolerefFactory
