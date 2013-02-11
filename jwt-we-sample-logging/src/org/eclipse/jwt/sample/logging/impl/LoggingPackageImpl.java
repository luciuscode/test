/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: LoggingPackageImpl.java,v 1.2 2010-05-10 08:36:52 chsaad Exp $
 */
package org.eclipse.jwt.sample.logging.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jwt.sample.logging.Logging;
import org.eclipse.jwt.sample.logging.LoggingFactory;
import org.eclipse.jwt.sample.logging.LoggingLevels;
import org.eclipse.jwt.sample.logging.LoggingPackage;

import org.eclipse.jwt.we.conf.model.ConfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoggingPackageImpl extends EPackageImpl implements LoggingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loggingLevelsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.jwt.sample.logging.LoggingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoggingPackageImpl() {
		super(eNS_URI, LoggingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LoggingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LoggingPackage init() {
		if (isInited) return (LoggingPackage)EPackage.Registry.INSTANCE.getEPackage(LoggingPackage.eNS_URI);

		// Obtain or create and register package
		LoggingPackageImpl theLoggingPackage = (LoggingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LoggingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LoggingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConfPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLoggingPackage.createPackageContents();

		// Initialize created meta-data
		theLoggingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLoggingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoggingPackage.eNS_URI, theLoggingPackage);
		return theLoggingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogging() {
		return loggingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogging_LoggingLevel() {
		return (EAttribute)loggingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoggingLevels() {
		return loggingLevelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingFactory getLoggingFactory() {
		return (LoggingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		loggingEClass = createEClass(LOGGING);
		createEAttribute(loggingEClass, LOGGING__LOGGING_LEVEL);

		// Create enums
		loggingLevelsEEnum = createEEnum(LOGGING_LEVELS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfPackage theConfPackage = (ConfPackage)EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loggingEClass.getESuperTypes().add(theConfPackage.getAspectInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(loggingEClass, Logging.class, "Logging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogging_LoggingLevel(), this.getLoggingLevels(), "loggingLevel", null, 0, 1, Logging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(loggingLevelsEEnum, LoggingLevels.class, "LoggingLevels");
		addEEnumLiteral(loggingLevelsEEnum, LoggingLevels.INFO);
		addEEnumLiteral(loggingLevelsEEnum, LoggingLevels.DEBUG);
		addEEnumLiteral(loggingLevelsEEnum, LoggingLevels.SEVERE);

		// Create resource
		createResource(eNS_URI);
	}

} //LoggingPackageImpl
