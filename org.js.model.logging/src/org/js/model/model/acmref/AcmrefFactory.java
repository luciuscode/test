/**
 */
package org.js.model.model.acmref;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.js.model.model.acmref.AcmrefPackage
 * @generated
 */
public interface AcmrefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcmrefFactory eINSTANCE = org.js.model.model.acmref.impl.AcmrefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ACM Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ACM Connector</em>'.
	 * @generated
	 */
	ACMConnector createACMConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AcmrefPackage getAcmrefPackage();

} //AcmrefFactory
