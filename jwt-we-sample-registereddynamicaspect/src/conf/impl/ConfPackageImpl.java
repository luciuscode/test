/**
 */
package conf.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import conf.ConfFactory;
import conf.ConfPackage;

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

import org.eclipse.jwt.we.conf.model.Aspect;
import org.eclipse.jwt.we.conf.model.AspectInstance;
import org.eclipse.jwt.we.conf.model.ConfModel;
import org.eclipse.jwt.we.conf.model.Profile;

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
public class ConfPackageImpl extends EPackageImpl implements ConfPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass confModelEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass profileEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass aspectEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass aspectInstanceEClass = null;

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
    * @see conf.ConfPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ConfPackageImpl() {
      super(eNS_URI, ConfFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link ConfPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ConfPackage init() {
      if (isInited) return (ConfPackage)EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI);

      // Obtain or create and register package
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) : RegistereddynamicaspectPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) : OrganisationsPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);

      // Create package meta-data objects
      theConfPackage.createPackageContents();
      theRegistereddynamicaspectPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theCorePackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theDataPackage.createPackageContents();
      theOrganisationsPackage.createPackageContents();
      theApplicationPackage.createPackageContents();
      theFunctionsPackage.createPackageContents();

      // Initialize created meta-data
      theConfPackage.initializePackageContents();
      theRegistereddynamicaspectPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theCorePackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theDataPackage.initializePackageContents();
      theOrganisationsPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();
      theFunctionsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theConfPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ConfPackage.eNS_URI, theConfPackage);
      return theConfPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getConfModel() {
      return confModelEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConfModel_Profiles() {
      return (EReference)confModelEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getConfModel_UseEmbeddedConf() {
      return (EAttribute)confModelEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConfModel_AspectInstances() {
      return (EReference)confModelEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getConfModel_EnrichedModel() {
      return (EReference)confModelEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getConfModel_CachedNoMissingProfile() {
      return (EAttribute)confModelEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProfile() {
      return profileEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProfile_Name() {
      return (EAttribute)profileEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProfile_Description() {
      return (EAttribute)profileEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProfile_Author() {
      return (EAttribute)profileEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProfile_Version() {
      return (EAttribute)profileEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProfile_Url() {
      return (EAttribute)profileEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProfile_Aspects() {
      return (EReference)profileEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAspect() {
      return aspectEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAspect_Id() {
      return (EAttribute)aspectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAspect_AspectInstanceEType() {
      return (EReference)aspectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAspect_TargetModelElements() {
      return (EReference)aspectEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAspect_Autocreated() {
      return (EAttribute)aspectEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAspect_Multiple() {
      return (EAttribute)aspectEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAspect_DefaultValue() {
      return (EAttribute)aspectEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAspectInstance() {
      return aspectInstanceEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAspectInstance_Id() {
      return (EAttribute)aspectInstanceEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getAspectInstance_TargetModelElement() {
      return (EReference)aspectInstanceEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConfFactory getConfFactory() {
      return (ConfFactory)getEFactoryInstance();
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
      confModelEClass = createEClass(CONF_MODEL);
      createEReference(confModelEClass, CONF_MODEL__PROFILES);
      createEAttribute(confModelEClass, CONF_MODEL__USE_EMBEDDED_CONF);
      createEReference(confModelEClass, CONF_MODEL__ASPECT_INSTANCES);
      createEReference(confModelEClass, CONF_MODEL__ENRICHED_MODEL);
      createEAttribute(confModelEClass, CONF_MODEL__CACHED_NO_MISSING_PROFILE);

      profileEClass = createEClass(PROFILE);
      createEAttribute(profileEClass, PROFILE__NAME);
      createEAttribute(profileEClass, PROFILE__DESCRIPTION);
      createEAttribute(profileEClass, PROFILE__AUTHOR);
      createEAttribute(profileEClass, PROFILE__VERSION);
      createEAttribute(profileEClass, PROFILE__URL);
      createEReference(profileEClass, PROFILE__ASPECTS);

      aspectEClass = createEClass(ASPECT);
      createEAttribute(aspectEClass, ASPECT__ID);
      createEReference(aspectEClass, ASPECT__ASPECT_INSTANCE_ETYPE);
      createEReference(aspectEClass, ASPECT__TARGET_MODEL_ELEMENTS);
      createEAttribute(aspectEClass, ASPECT__AUTOCREATED);
      createEAttribute(aspectEClass, ASPECT__MULTIPLE);
      createEAttribute(aspectEClass, ASPECT__DEFAULT_VALUE);

      aspectInstanceEClass = createEClass(ASPECT_INSTANCE);
      createEAttribute(aspectInstanceEClass, ASPECT_INSTANCE__ID);
      createEReference(aspectInstanceEClass, ASPECT_INSTANCE__TARGET_MODEL_ELEMENT);
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

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes

      // Initialize classes and features; add operations and parameters
      initEClass(confModelEClass, ConfModel.class, "ConfModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getConfModel_Profiles(), this.getProfile(), null, "profiles", null, 0, -1, ConfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getConfModel_UseEmbeddedConf(), ecorePackage.getEBooleanObject(), "useEmbeddedConf", "false", 1, 1, ConfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getConfModel_AspectInstances(), this.getAspectInstance(), null, "aspectInstances", null, 0, -1, ConfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getConfModel_AspectInstances().getEKeys().add(this.getAspectInstance_Id());
      initEReference(getConfModel_EnrichedModel(), ecorePackage.getEObject(), null, "enrichedModel", null, 0, 1, ConfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getConfModel_CachedNoMissingProfile(), ecorePackage.getEBoolean(), "cachedNoMissingProfile", "false", 1, 1, ConfModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getProfile_Name(), ecorePackage.getEString(), "name", "com.yourcompany.yourprofile", 1, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProfile_Description(), ecorePackage.getEString(), "description", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProfile_Author(), ecorePackage.getEString(), "author", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProfile_Version(), ecorePackage.getEString(), "version", "1.0", 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProfile_Url(), ecorePackage.getEString(), "url", "http://www.eclipse.org/jwt/unknown_profile.html", 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProfile_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      getProfile_Aspects().getEKeys().add(this.getAspect_Id());

      initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAspect_Id(), ecorePackage.getEString(), "id", "com.yourcompany.yourprofile.youraspect", 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAspect_AspectInstanceEType(), ecorePackage.getEClassifier(), null, "aspectInstanceEType", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAspect_TargetModelElements(), ecorePackage.getEClass(), null, "targetModelElements", null, 1, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAspect_Autocreated(), ecorePackage.getEBoolean(), "autocreated", "true", 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAspect_Multiple(), ecorePackage.getEBoolean(), "multiple", "true", 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAspect_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(aspectInstanceEClass, AspectInstance.class, "AspectInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAspectInstance_Id(), ecorePackage.getEString(), "id", null, 1, 1, AspectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAspectInstance_TargetModelElement(), ecorePackage.getEObject(), null, "targetModelElement", null, 1, 1, AspectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //ConfPackageImpl
