/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: AspectsChildExtenderPackageImpl.java,v 1.3 2010-05-10 08:36:58 chsaad Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jwt.meta.model.application.ApplicationPackage;
import org.eclipse.jwt.meta.model.core.CorePackage;
import org.eclipse.jwt.meta.model.data.DataPackage;
import org.eclipse.jwt.meta.model.events.EventsPackage;
import org.eclipse.jwt.meta.model.functions.FunctionsPackage;
import org.eclipse.jwt.meta.model.organisations.OrganisationsPackage;
import org.eclipse.jwt.meta.model.primitiveTypes.PrimitiveTypesPackage;
import org.eclipse.jwt.meta.model.processes.ProcessesPackage;
import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderFactory;
import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage;
import org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode;
import org.eclipse.jwt.sample.aspectschildextender.CustomControlNode;
import org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender;
import org.eclipse.jwt.we.conf.model.ConfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectsChildExtenderPackageImpl extends EPackageImpl implements AspectsChildExtenderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleAspectsChildExtenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customControlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customActivityNodeEClass = null;

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
	 * @see org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AspectsChildExtenderPackageImpl() {
		super(eNS_URI, AspectsChildExtenderFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AspectsChildExtenderPackage init() {
		if (isInited) return (AspectsChildExtenderPackage)EPackage.Registry.INSTANCE.getEPackage(AspectsChildExtenderPackage.eNS_URI);

		// Obtain or create and register package
		AspectsChildExtenderPackageImpl theAspectsChildExtenderPackage = (AspectsChildExtenderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AspectsChildExtenderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AspectsChildExtenderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		ProcessesPackage.eINSTANCE.eClass();
		EventsPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		FunctionsPackage.eINSTANCE.eClass();
		OrganisationsPackage.eINSTANCE.eClass();
		ApplicationPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAspectsChildExtenderPackage.createPackageContents();

		// Initialize created meta-data
		theAspectsChildExtenderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAspectsChildExtenderPackage.freeze();

		return theAspectsChildExtenderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleAspectsChildExtender() {
		return sampleAspectsChildExtenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAspectsChildExtender_Samplestringprop() {
		return (EAttribute)sampleAspectsChildExtenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleAspectsChildExtender_Sampleintprop() {
		return (EAttribute)sampleAspectsChildExtenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampleAspectsChildExtender_Sampleactionref() {
		return (EReference)sampleAspectsChildExtenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomControlNode() {
		return customControlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomControlNode_Customcontrolnodeprop1() {
		return (EAttribute)customControlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomActivityNode() {
		return customActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomActivityNode_Customcontrolnodeprop1() {
		return (EAttribute)customActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsChildExtenderFactory getAspectsChildExtenderFactory() {
		return (AspectsChildExtenderFactory)getEFactoryInstance();
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
		sampleAspectsChildExtenderEClass = createEClass(SAMPLE_ASPECTS_CHILD_EXTENDER);
		createEAttribute(sampleAspectsChildExtenderEClass, SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLESTRINGPROP);
		createEAttribute(sampleAspectsChildExtenderEClass, SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEINTPROP);
		createEReference(sampleAspectsChildExtenderEClass, SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEACTIONREF);

		customControlNodeEClass = createEClass(CUSTOM_CONTROL_NODE);
		createEAttribute(customControlNodeEClass, CUSTOM_CONTROL_NODE__CUSTOMCONTROLNODEPROP1);

		customActivityNodeEClass = createEClass(CUSTOM_ACTIVITY_NODE);
		createEAttribute(customActivityNodeEClass, CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1);
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
		ProcessesPackage theProcessesPackage = (ProcessesPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		sampleAspectsChildExtenderEClass.getESuperTypes().add(theConfPackage.getAspectInstance());
		customControlNodeEClass.getESuperTypes().add(theProcessesPackage.getControlNode());
		customActivityNodeEClass.getESuperTypes().add(theProcessesPackage.getActivityNode());

		// Initialize classes and features; add operations and parameters
		initEClass(sampleAspectsChildExtenderEClass, SampleAspectsChildExtender.class, "SampleAspectsChildExtender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampleAspectsChildExtender_Samplestringprop(), ecorePackage.getEString(), "samplestringprop", null, 0, 1, SampleAspectsChildExtender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleAspectsChildExtender_Sampleintprop(), ecorePackage.getEInt(), "sampleintprop", null, 0, 1, SampleAspectsChildExtender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampleAspectsChildExtender_Sampleactionref(), theProcessesPackage.getAction(), null, "sampleactionref", null, 0, 1, SampleAspectsChildExtender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customControlNodeEClass, CustomControlNode.class, "CustomControlNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomControlNode_Customcontrolnodeprop1(), theEcorePackage.getEString(), "customcontrolnodeprop1", null, 0, 1, CustomControlNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customActivityNodeEClass, CustomActivityNode.class, "CustomActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomActivityNode_Customcontrolnodeprop1(), theEcorePackage.getEString(), "customcontrolnodeprop1", null, 0, 1, CustomActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AspectsChildExtenderPackageImpl
