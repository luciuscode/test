/**
 */
package registereddynamicaspect.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import conf.ConfPackage;

import conf.impl.ConfPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import data.DataPackage;

import data.impl.DataPackageImpl;

import events.EventsPackage;

import events.impl.EventsPackageImpl;

import functions.FunctionsPackage;

import functions.impl.FunctionsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import organisations.OrganisationsPackage;

import organisations.impl.OrganisationsPackageImpl;

import processes.ProcessesPackage;

import processes.impl.ProcessesPackageImpl;

import registereddynamicaspect.RegistereddynamicaspectFactory;
import registereddynamicaspect.RegistereddynamicaspectPackage;
import registereddynamicaspect.SampleRegisteredDynamicAspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistereddynamicaspectPackageImpl extends EPackageImpl implements RegistereddynamicaspectPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sampleRegisteredDynamicAspectEClass = null;

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
    * @see registereddynamicaspect.RegistereddynamicaspectPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private RegistereddynamicaspectPackageImpl() {
      super(eNS_URI, RegistereddynamicaspectFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link RegistereddynamicaspectPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static RegistereddynamicaspectPackage init() {
      if (isInited) return (RegistereddynamicaspectPackage)EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI);

      // Obtain or create and register package
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RegistereddynamicaspectPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) : OrganisationsPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);

      // Create package meta-data objects
      theRegistereddynamicaspectPackage.createPackageContents();
      theConfPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theCorePackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theDataPackage.createPackageContents();
      theOrganisationsPackage.createPackageContents();
      theApplicationPackage.createPackageContents();
      theFunctionsPackage.createPackageContents();

      // Initialize created meta-data
      theRegistereddynamicaspectPackage.initializePackageContents();
      theConfPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theCorePackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theDataPackage.initializePackageContents();
      theOrganisationsPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();
      theFunctionsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theRegistereddynamicaspectPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(RegistereddynamicaspectPackage.eNS_URI, theRegistereddynamicaspectPackage);
      return theRegistereddynamicaspectPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSampleRegisteredDynamicAspect() {
      return sampleRegisteredDynamicAspectEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSampleRegisteredDynamicAspect_Sampleintprop() {
      return (EAttribute)sampleRegisteredDynamicAspectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSampleRegisteredDynamicAspect_Sampleactionref() {
      return (EReference)sampleRegisteredDynamicAspectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegistereddynamicaspectFactory getRegistereddynamicaspectFactory() {
      return (RegistereddynamicaspectFactory)getEFactoryInstance();
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
      sampleRegisteredDynamicAspectEClass = createEClass(SAMPLE_REGISTERED_DYNAMIC_ASPECT);
      createEAttribute(sampleRegisteredDynamicAspectEClass, SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP);
      createEReference(sampleRegisteredDynamicAspectEClass, SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF);
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
      sampleRegisteredDynamicAspectEClass.getESuperTypes().add(theConfPackage.getAspectInstance());

      // Initialize classes and features; add operations and parameters
      initEClass(sampleRegisteredDynamicAspectEClass, SampleRegisteredDynamicAspect.class, "SampleRegisteredDynamicAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSampleRegisteredDynamicAspect_Sampleintprop(), ecorePackage.getEInt(), "sampleintprop", null, 0, 1, SampleRegisteredDynamicAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSampleRegisteredDynamicAspect_Sampleactionref(), theProcessesPackage.getAction(), null, "sampleactionref", null, 0, 1, SampleRegisteredDynamicAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //RegistereddynamicaspectPackageImpl
