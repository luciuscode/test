/**
 */
package data.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import conf.ConfPackage;

import conf.impl.ConfPackageImpl;

import core.CorePackage;

import core.impl.CorePackageImpl;

import data.DataFactory;
import data.DataPackage;

import events.EventsPackage;

import events.impl.EventsPackageImpl;

import functions.FunctionsPackage;

import functions.impl.FunctionsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataMapping;
import org.eclipse.jwt.meta.model.data.DataType;
import org.eclipse.jwt.meta.model.data.InformationType;
import org.eclipse.jwt.meta.model.data.InputParameter;
import org.eclipse.jwt.meta.model.data.OutputParameter;
import org.eclipse.jwt.meta.model.data.Parameter;
import org.eclipse.jwt.meta.model.data.ParameterMapping;

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
public class DataPackageImpl extends EPackageImpl implements DataPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dataEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dataTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dataMappingEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass informationTypeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass inputParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass outputParameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass parameterMappingEClass = null;

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
    * @see data.DataPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private DataPackageImpl() {
      super(eNS_URI, DataFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static DataPackage init() {
      if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

      // Obtain or create and register package
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) : RegistereddynamicaspectPackage.eINSTANCE);
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) : OrganisationsPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);

      // Create package meta-data objects
      theDataPackage.createPackageContents();
      theRegistereddynamicaspectPackage.createPackageContents();
      theConfPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theCorePackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theOrganisationsPackage.createPackageContents();
      theApplicationPackage.createPackageContents();
      theFunctionsPackage.createPackageContents();

      // Initialize created meta-data
      theDataPackage.initializePackageContents();
      theRegistereddynamicaspectPackage.initializePackageContents();
      theConfPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theCorePackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theOrganisationsPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();
      theFunctionsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theDataPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
      return theDataPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getData() {
      return dataEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getData_Value() {
      return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getData_DataType() {
      return (EReference)dataEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getData_InformationType() {
      return (EReference)dataEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getData_Parameters() {
      return (EReference)dataEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDataType() {
      return dataTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameter() {
      return parameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getParameter_Value() {
      return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDataMapping() {
      return dataMappingEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDataMapping_BoundParameter() {
      return (EReference)dataMappingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDataMapping_Parameter() {
      return (EReference)dataMappingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInformationType() {
      return informationTypeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInputParameter() {
      return inputParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getOutputParameter() {
      return outputParameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getParameterMapping() {
      return parameterMappingEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterMapping_Source() {
      return (EReference)parameterMappingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getParameterMapping_Target() {
      return (EReference)parameterMappingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataFactory getDataFactory() {
      return (DataFactory)getEFactoryInstance();
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
      dataEClass = createEClass(DATA);
      createEAttribute(dataEClass, DATA__VALUE);
      createEReference(dataEClass, DATA__DATA_TYPE);
      createEReference(dataEClass, DATA__INFORMATION_TYPE);
      createEReference(dataEClass, DATA__PARAMETERS);

      dataTypeEClass = createEClass(DATA_TYPE);

      parameterEClass = createEClass(PARAMETER);
      createEAttribute(parameterEClass, PARAMETER__VALUE);

      dataMappingEClass = createEClass(DATA_MAPPING);
      createEReference(dataMappingEClass, DATA_MAPPING__BOUND_PARAMETER);
      createEReference(dataMappingEClass, DATA_MAPPING__PARAMETER);

      informationTypeEClass = createEClass(INFORMATION_TYPE);

      inputParameterEClass = createEClass(INPUT_PARAMETER);

      outputParameterEClass = createEClass(OUTPUT_PARAMETER);

      parameterMappingEClass = createEClass(PARAMETER_MAPPING);
      createEReference(parameterMappingEClass, PARAMETER_MAPPING__SOURCE);
      createEReference(parameterMappingEClass, PARAMETER_MAPPING__TARGET);
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
      dataEClass.getESuperTypes().add(theCorePackage.getReferenceableElement());
      dataTypeEClass.getESuperTypes().add(theCorePackage.getPackageableElement());
      parameterEClass.getESuperTypes().add(theCorePackage.getPackageableElement());
      dataMappingEClass.getESuperTypes().add(theCorePackage.getPackageableElement());
      informationTypeEClass.getESuperTypes().add(theCorePackage.getPackageableElement());
      inputParameterEClass.getESuperTypes().add(this.getParameter());
      outputParameterEClass.getESuperTypes().add(this.getParameter());
      parameterMappingEClass.getESuperTypes().add(theCorePackage.getPackageableElement());

      // Initialize classes and features; add operations and parameters
      initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getData_Value(), ecorePackage.getEString(), "value", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getData_DataType(), this.getDataType(), null, "dataType", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getData_InformationType(), this.getInformationType(), null, "informationType", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getData_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(dataMappingEClass, DataMapping.class, "DataMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDataMapping_BoundParameter(), this.getParameter(), null, "boundParameter", null, 1, 1, DataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getDataMapping_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, DataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(informationTypeEClass, InformationType.class, "InformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(inputParameterEClass, InputParameter.class, "InputParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(outputParameterEClass, OutputParameter.class, "OutputParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameterMapping_Source(), theCorePackage.getPackageableElement(), null, "source", null, 1, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getParameterMapping_Target(), theCorePackage.getPackageableElement(), null, "target", null, 1, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //DataPackageImpl
