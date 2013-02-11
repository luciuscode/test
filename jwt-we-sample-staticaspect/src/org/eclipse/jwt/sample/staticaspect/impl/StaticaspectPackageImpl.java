/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: StaticaspectPackageImpl.java,v 1.4 2010-05-10 08:36:48 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jwt.meta.model.application.ApplicationPackage;
import org.eclipse.jwt.meta.model.core.CorePackage;
import org.eclipse.jwt.meta.model.data.DataPackage;
import org.eclipse.jwt.meta.model.events.EventsPackage;
import org.eclipse.jwt.meta.model.functions.FunctionsPackage;
import org.eclipse.jwt.meta.model.organisations.OrganisationsPackage;
import org.eclipse.jwt.meta.model.primitiveTypes.PrimitiveTypesPackage;
import org.eclipse.jwt.meta.model.processes.ProcessesPackage;
import org.eclipse.jwt.sample.staticaspect.SampleStaticAspect;
import org.eclipse.jwt.sample.staticaspect.StaticaspectFactory;
import org.eclipse.jwt.sample.staticaspect.StaticaspectPackage;
import org.eclipse.jwt.we.conf.model.ConfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticaspectPackageImpl extends EPackageImpl implements StaticaspectPackage {
	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	private EClass sampleStaticAspectEClass = null;

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
    * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage#eNS_URI
    * @see #init()
    * @generated
    */
	private StaticaspectPackageImpl() {
      super(eNS_URI, StaticaspectFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link StaticaspectPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
	public static StaticaspectPackage init() {
      if (isInited) return (StaticaspectPackage)EPackage.Registry.INSTANCE.getEPackage(StaticaspectPackage.eNS_URI);

      // Obtain or create and register package
      StaticaspectPackageImpl theStaticaspectPackage = (StaticaspectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaticaspectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaticaspectPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      ConfPackage.eINSTANCE.eClass();
      CorePackage.eINSTANCE.eClass();
      ProcessesPackage.eINSTANCE.eClass();
      EventsPackage.eINSTANCE.eClass();
      PrimitiveTypesPackage.eINSTANCE.eClass();
      FunctionsPackage.eINSTANCE.eClass();
      OrganisationsPackage.eINSTANCE.eClass();
      ApplicationPackage.eINSTANCE.eClass();
      DataPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theStaticaspectPackage.createPackageContents();

      // Initialize created meta-data
      theStaticaspectPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theStaticaspectPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(StaticaspectPackage.eNS_URI, theStaticaspectPackage);
      return theStaticaspectPackage;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EClass getSampleStaticAspect() {
      return sampleStaticAspectEClass;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getSampleStaticAspect_Samplestringprop() {
      return (EAttribute)sampleStaticAspectEClass.getEStructuralFeatures().get(0);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EAttribute getSampleStaticAspect_Sampleintprop() {
      return (EAttribute)sampleStaticAspectEClass.getEStructuralFeatures().get(1);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EReference getSampleStaticAspect_Sampleactionref() {
      return (EReference)sampleStaticAspectEClass.getEStructuralFeatures().get(2);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public StaticaspectFactory getStaticaspectFactory() {
      return (StaticaspectFactory)getEFactoryInstance();
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
      sampleStaticAspectEClass = createEClass(SAMPLE_STATIC_ASPECT);
      createEAttribute(sampleStaticAspectEClass, SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP);
      createEAttribute(sampleStaticAspectEClass, SAMPLE_STATIC_ASPECT__SAMPLEINTPROP);
      createEReference(sampleStaticAspectEClass, SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF);
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

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      sampleStaticAspectEClass.getESuperTypes().add(theConfPackage.getAspectInstance());

      // Initialize classes and features; add operations and parameters
      initEClass(sampleStaticAspectEClass, SampleStaticAspect.class, "SampleStaticAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSampleStaticAspect_Samplestringprop(), ecorePackage.getEString(), "samplestringprop", null, 0, 1, SampleStaticAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getSampleStaticAspect_Sampleintprop(), ecorePackage.getEInt(), "sampleintprop", null, 0, 1, SampleStaticAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSampleStaticAspect_Sampleactionref(), theProcessesPackage.getAction(), null, "sampleactionref", null, 0, 1, SampleStaticAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //StaticaspectPackageImpl
