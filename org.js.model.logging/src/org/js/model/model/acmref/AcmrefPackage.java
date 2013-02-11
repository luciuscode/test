/**
 */
package org.js.model.model.acmref;

import conf.ConfPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.js.model.model.acmref.AcmrefFactory
 * @model kind="package"
 * @generated
 */
public interface AcmrefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "acmref";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.js.model.proces.model.acmref";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "acmref";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcmrefPackage eINSTANCE = org.js.model.model.acmref.impl.AcmrefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.js.model.model.acmref.impl.ACMConnectorImpl <em>ACM Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.js.model.model.acmref.impl.ACMConnectorImpl
	 * @see org.js.model.model.acmref.impl.AcmrefPackageImpl#getACMConnector()
	 * @generated
	 */
	int ACM_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACM_CONNECTOR__ID = ConfPackage.ASPECT_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Target Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACM_CONNECTOR__TARGET_MODEL_ELEMENT = ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>ACM Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACM_CONNECTOR__ACM_REF = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ACM Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACM_CONNECTOR_FEATURE_COUNT = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.js.model.model.acmref.ACMConnector <em>ACM Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACM Connector</em>'.
	 * @see org.js.model.model.acmref.ACMConnector
	 * @generated
	 */
	EClass getACMConnector();

	/**
	 * Returns the meta object for the reference '{@link org.js.model.model.acmref.ACMConnector#getACMRef <em>ACM Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ACM Ref</em>'.
	 * @see org.js.model.model.acmref.ACMConnector#getACMRef()
	 * @see #getACMConnector()
	 * @generated
	 */
	EReference getACMConnector_ACMRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcmrefFactory getAcmrefFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.js.model.model.acmref.impl.ACMConnectorImpl <em>ACM Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.js.model.model.acmref.impl.ACMConnectorImpl
		 * @see org.js.model.model.acmref.impl.AcmrefPackageImpl#getACMConnector()
		 * @generated
		 */
		EClass ACM_CONNECTOR = eINSTANCE.getACMConnector();

		/**
		 * The meta object literal for the '<em><b>ACM Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACM_CONNECTOR__ACM_REF = eINSTANCE.getACMConnector_ACMRef();

	}

} //AcmrefPackage
