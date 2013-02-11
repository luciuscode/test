/**
 */
package organisations.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;
import org.eclipse.jwt.meta.model.organisations.Role;

import organisations.OrganisationsFactory;
import organisations.OrganisationsPackage;

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
public class OrganisationsPackageImpl extends EPackageImpl implements OrganisationsPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass roleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass organisationUnitEClass = null;

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
    * @see organisations.OrganisationsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private OrganisationsPackageImpl() {
      super(eNS_URI, OrganisationsFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link OrganisationsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static OrganisationsPackage init() {
      if (isInited) return (OrganisationsPackage)EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI);

      // Obtain or create and register package
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrganisationsPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) : RegistereddynamicaspectPackage.eINSTANCE);
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);

      // Create package meta-data objects
      theOrganisationsPackage.createPackageContents();
      theRegistereddynamicaspectPackage.createPackageContents();
      theConfPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theCorePackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theDataPackage.createPackageContents();
      theApplicationPackage.createPackageContents();
      theFunctionsPackage.createPackageContents();

      // Initialize created meta-data
      theOrganisationsPackage.initializePackageContents();
      theRegistereddynamicaspectPackage.initializePackageContents();
      theConfPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theCorePackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theDataPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();
      theFunctionsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theOrganisationsPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(OrganisationsPackage.eNS_URI, theOrganisationsPackage);
      return theOrganisationsPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRole() {
      return roleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRole_PerformedBy() {
      return (EReference)roleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOrganisationUnit() {
      return organisationUnitEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOrganisationUnit_SubUnit() {
      return (EReference)organisationUnitEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getOrganisationUnit_BelongsTo() {
      return (EReference)organisationUnitEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OrganisationsFactory getOrganisationsFactory() {
      return (OrganisationsFactory)getEFactoryInstance();
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
      roleEClass = createEClass(ROLE);
      createEReference(roleEClass, ROLE__PERFORMED_BY);

      organisationUnitEClass = createEClass(ORGANISATION_UNIT);
      createEReference(organisationUnitEClass, ORGANISATION_UNIT__SUB_UNIT);
      createEReference(organisationUnitEClass, ORGANISATION_UNIT__BELONGS_TO);
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
      roleEClass.getESuperTypes().add(theCorePackage.getReferenceableElement());
      organisationUnitEClass.getESuperTypes().add(theCorePackage.getPackageableElement());

      // Initialize classes and features; add operations and parameters
      initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRole_PerformedBy(), this.getOrganisationUnit(), null, "performedBy", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(organisationUnitEClass, OrganisationUnit.class, "OrganisationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getOrganisationUnit_SubUnit(), this.getOrganisationUnit(), this.getOrganisationUnit_BelongsTo(), "subUnit", null, 0, -1, OrganisationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getOrganisationUnit_BelongsTo(), this.getOrganisationUnit(), this.getOrganisationUnit_SubUnit(), "belongsTo", null, 0, -1, OrganisationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //OrganisationsPackageImpl
