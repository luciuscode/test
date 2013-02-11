/**
 */
package core.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import conf.ConfPackage;

import conf.impl.ConfPackageImpl;

import core.CoreFactory;
import core.CorePackage;

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

import org.eclipse.jwt.meta.model.core.Comment;
import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.Model;
import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass modelElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass commentEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass namedElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass packageEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass packageableElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass referenceableElementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass modelEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass graphicalElementEClass = null;

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
    * @see core.CorePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private CorePackageImpl() {
      super(eNS_URI, CoreFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static CorePackage init() {
      if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

      // Obtain or create and register package
      CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      RegistereddynamicaspectPackageImpl theRegistereddynamicaspectPackage = (RegistereddynamicaspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) instanceof RegistereddynamicaspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RegistereddynamicaspectPackage.eNS_URI) : RegistereddynamicaspectPackage.eINSTANCE);
      ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);
      ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);
      EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
      DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
      OrganisationsPackageImpl theOrganisationsPackage = (OrganisationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) instanceof OrganisationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganisationsPackage.eNS_URI) : OrganisationsPackage.eINSTANCE);
      ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
      FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);

      // Create package meta-data objects
      theCorePackage.createPackageContents();
      theRegistereddynamicaspectPackage.createPackageContents();
      theConfPackage.createPackageContents();
      theProcessesPackage.createPackageContents();
      theEventsPackage.createPackageContents();
      theDataPackage.createPackageContents();
      theOrganisationsPackage.createPackageContents();
      theApplicationPackage.createPackageContents();
      theFunctionsPackage.createPackageContents();

      // Initialize created meta-data
      theCorePackage.initializePackageContents();
      theRegistereddynamicaspectPackage.initializePackageContents();
      theConfPackage.initializePackageContents();
      theProcessesPackage.initializePackageContents();
      theEventsPackage.initializePackageContents();
      theDataPackage.initializePackageContents();
      theOrganisationsPackage.initializePackageContents();
      theApplicationPackage.initializePackageContents();
      theFunctionsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theCorePackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
      return theCorePackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getModelElement() {
      return modelElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getModelElement_OwnedComment() {
      return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getComment() {
      return commentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getComment_Text() {
      return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNamedElement() {
      return namedElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNamedElement_Name() {
      return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNamedElement_Icon() {
      return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPackage() {
      return packageEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPackage_Subpackages() {
      return (EReference)packageEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPackage_Superpackage() {
      return (EReference)packageEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPackage_Elements() {
      return (EReference)packageEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPackageableElement() {
      return packageableElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPackageableElement_Package() {
      return (EReference)packageableElementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getReferenceableElement() {
      return referenceableElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getModel() {
      return modelEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModel_Author() {
      return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModel_Version() {
      return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModel_Description() {
      return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModel_Fileversion() {
      return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGraphicalElement() {
      return graphicalElementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CoreFactory getCoreFactory() {
      return (CoreFactory)getEFactoryInstance();
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
      modelElementEClass = createEClass(MODEL_ELEMENT);
      createEReference(modelElementEClass, MODEL_ELEMENT__OWNED_COMMENT);

      commentEClass = createEClass(COMMENT);
      createEAttribute(commentEClass, COMMENT__TEXT);

      namedElementEClass = createEClass(NAMED_ELEMENT);
      createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
      createEAttribute(namedElementEClass, NAMED_ELEMENT__ICON);

      packageEClass = createEClass(PACKAGE);
      createEReference(packageEClass, PACKAGE__SUBPACKAGES);
      createEReference(packageEClass, PACKAGE__SUPERPACKAGE);
      createEReference(packageEClass, PACKAGE__ELEMENTS);

      packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);
      createEReference(packageableElementEClass, PACKAGEABLE_ELEMENT__PACKAGE);

      referenceableElementEClass = createEClass(REFERENCEABLE_ELEMENT);

      modelEClass = createEClass(MODEL);
      createEAttribute(modelEClass, MODEL__AUTHOR);
      createEAttribute(modelEClass, MODEL__VERSION);
      createEAttribute(modelEClass, MODEL__DESCRIPTION);
      createEAttribute(modelEClass, MODEL__FILEVERSION);

      graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
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
      commentEClass.getESuperTypes().add(this.getGraphicalElement());
      namedElementEClass.getESuperTypes().add(this.getModelElement());
      packageEClass.getESuperTypes().add(this.getNamedElement());
      packageableElementEClass.getESuperTypes().add(this.getNamedElement());
      referenceableElementEClass.getESuperTypes().add(this.getPackageableElement());
      modelEClass.getESuperTypes().add(this.getPackage());
      graphicalElementEClass.getESuperTypes().add(this.getModelElement());

      // Initialize classes and features; add operations and parameters
      initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getModelElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getNamedElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(packageEClass, org.eclipse.jwt.meta.model.core.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPackage_Subpackages(), this.getPackage(), this.getPackage_Superpackage(), "subpackages", null, 0, -1, org.eclipse.jwt.meta.model.core.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getPackage_Superpackage(), this.getPackage(), this.getPackage_Subpackages(), "superpackage", null, 0, 1, org.eclipse.jwt.meta.model.core.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getPackage_Elements(), this.getPackageableElement(), this.getPackageableElement_Package(), "elements", null, 0, -1, org.eclipse.jwt.meta.model.core.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPackageableElement_Package(), this.getPackage(), this.getPackage_Elements(), "package", null, 0, 1, PackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(referenceableElementEClass, ReferenceableElement.class, "ReferenceableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getModel_Author(), ecorePackage.getEString(), "author", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getModel_Fileversion(), ecorePackage.getEString(), "fileversion", "", 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(graphicalElementEClass, GraphicalElement.class, "GraphicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      // Create resource
      createResource(eNS_URI);
   }

} //CorePackageImpl
