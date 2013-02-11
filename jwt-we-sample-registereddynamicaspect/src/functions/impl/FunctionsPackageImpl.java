/**
 */
package functions.impl;

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

import functions.FunctionsFactory;
import functions.FunctionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jwt.meta.model.functions.Function;

import organisations.OrganisationsPackage;

import organisations.impl.OrganisationsPackageImpl;

import processes.ProcessesPackage;

import processes.impl.ProcessesPackageImpl;

import registereddynamicaspect.RegistereddynamicaspectPackage;

import registereddynamicaspect.impl.RegistereddynamicaspectPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsPackageImpl extends EPackageImpl implements FunctionsPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass functionEClass = null;

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
    * @see functions.FunctionsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private FunctionsPackageImpl() {
      super(eNS_URI, FunctionsFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link FunctionsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static FunctionsPackage init() {
      if (isInited) return (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

      // Obtain or create and register package
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionsPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) : RegistereddynamicaspectPackage.eINSTANCE);
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) : OrganisationsPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

      // Create package meta-data objects
      theFunctionsPackage.createPackageContents();
      theRegistereddynamicaspectPackage.createPackageContents();
      theConfPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theCorePackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theDataPackage.createPackageContents();
      theOrganisationsPackage.createPackageContents();
      theApplicationPackage.createPackageContents();

      // Initialize created meta-data
      theFunctionsPackage.initializePackageContents();
      theRegistereddynamicaspectPackage.initializePackageContents();
      theConfPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theCorePackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theDataPackage.initializePackageContents();
      theOrganisationsPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theFunctionsPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(FunctionsPackage.eNS_URI, theFunctionsPackage);
      return theFunctionsPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getFunction() {
      return functionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getFunction_Subfunctions() {
      return (EReference)functionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public FunctionsFactory getFunctionsFactory() {
      return (FunctionsFactory)getEFactoryInstance();
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
      functionEClass = createEClass(FUNCTION);
      createEReference(functionEClass, FUNCTION__SUBFUNCTIONS);
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
      CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      functionEClass.getESuperTypes().add(theCorePackage.getPackageableElement());

      // Initialize classes and features; add operations and parameters
      initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getFunction_Subfunctions(), this.getFunction(), null, "subfunctions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //FunctionsPackageImpl
