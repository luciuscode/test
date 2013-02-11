/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: LoggingPackage.java,v 1.2 2010-05-10 08:36:52 chsaad Exp $
 */
package org.eclipse.jwt.sample.logging;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.jwt.we.conf.model.ConfPackage;

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
 * @see org.eclipse.jwt.sample.logging.LoggingFactory
 * @model kind="package"
 * @generated
 */
public interface LoggingPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logging";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.jwt.sample.logging";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logging";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoggingPackage eINSTANCE = org.eclipse.jwt.sample.logging.impl.LoggingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jwt.sample.logging.impl.LoggingImpl <em>Logging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jwt.sample.logging.impl.LoggingImpl
	 * @see org.eclipse.jwt.sample.logging.impl.LoggingPackageImpl#getLogging()
	 * @generated
	 */
	int LOGGING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING__ID = ConfPackage.ASPECT_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Target Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING__TARGET_MODEL_ELEMENT = ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING__LOGGING_LEVEL = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_FEATURE_COUNT = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.jwt.sample.logging.LoggingLevels <em>Levels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jwt.sample.logging.LoggingLevels
	 * @see org.eclipse.jwt.sample.logging.impl.LoggingPackageImpl#getLoggingLevels()
	 * @generated
	 */
	int LOGGING_LEVELS = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.sample.logging.Logging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging</em>'.
	 * @see org.eclipse.jwt.sample.logging.Logging
	 * @generated
	 */
	EClass getLogging();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.logging.Logging#getLoggingLevel <em>Logging Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging Level</em>'.
	 * @see org.eclipse.jwt.sample.logging.Logging#getLoggingLevel()
	 * @see #getLogging()
	 * @generated
	 */
	EAttribute getLogging_LoggingLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jwt.sample.logging.LoggingLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Levels</em>'.
	 * @see org.eclipse.jwt.sample.logging.LoggingLevels
	 * @generated
	 */
	EEnum getLoggingLevels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoggingFactory getLoggingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.jwt.sample.logging.impl.LoggingImpl <em>Logging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jwt.sample.logging.impl.LoggingImpl
		 * @see org.eclipse.jwt.sample.logging.impl.LoggingPackageImpl#getLogging()
		 * @generated
		 */
		EClass LOGGING = eINSTANCE.getLogging();

		/**
		 * The meta object literal for the '<em><b>Logging Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING__LOGGING_LEVEL = eINSTANCE.getLogging_LoggingLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.jwt.sample.logging.LoggingLevels <em>Levels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jwt.sample.logging.LoggingLevels
		 * @see org.eclipse.jwt.sample.logging.impl.LoggingPackageImpl#getLoggingLevels()
		 * @generated
		 */
		EEnum LOGGING_LEVELS = eINSTANCE.getLoggingLevels();

	}

} //LoggingPackage
