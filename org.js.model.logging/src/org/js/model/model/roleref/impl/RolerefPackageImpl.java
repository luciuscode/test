/**
 */
package org.js.model.model.roleref.impl;

import conf.ConfPackage;

import conf.impl.ConfPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.js.model.model.acmref.AcmrefPackage;

import org.js.model.model.acmref.impl.AcmrefPackageImpl;

import org.js.model.model.roleref.RoleConnector;
import org.js.model.model.roleref.RolerefFactory;
import org.js.model.model.roleref.RolerefPackage;

import org.js.model.rbac.RbacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolerefPackageImpl extends EPackageImpl implements RolerefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConnectorEClass = null;

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
	 * @see org.js.model.model.roleref.RolerefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RolerefPackageImpl() {
		super(eNS_URI, RolerefFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RolerefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RolerefPackage init() {
		if (isInited) return (RolerefPackage)EPackage.Registry.INSTANCE.getEPackage(RolerefPackage.eNS_URI);

		// Obtain or create and register package
		RolerefPackageImpl theRolerefPackage = (RolerefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RolerefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RolerefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RbacPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AcmrefPackageImpl theAcmrefPackage = (AcmrefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AcmrefPackage.eNS_URI) instanceof AcmrefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AcmrefPackage.eNS_URI) : AcmrefPackage.eINSTANCE);
		ConfPackageImpl theConfPackage = (ConfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) instanceof ConfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfPackage.eNS_URI) : ConfPackage.eINSTANCE);

		// Create package meta-data objects
		theRolerefPackage.createPackageContents();
		theAcmrefPackage.createPackageContents();
		theConfPackage.createPackageContents();

		// Initialize created meta-data
		theRolerefPackage.initializePackageContents();
		theAcmrefPackage.initializePackageContents();
		theConfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRolerefPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RolerefPackage.eNS_URI, theRolerefPackage);
		return theRolerefPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConnector() {
		return roleConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_Roleref() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolerefFactory getRolerefFactory() {
		return (RolerefFactory)getEFactoryInstance();
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
		roleConnectorEClass = createEClass(ROLE_CONNECTOR);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__ROLEREF);
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
		RbacPackage theRbacPackage = (RbacPackage)EPackage.Registry.INSTANCE.getEPackage(RbacPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleConnectorEClass.getESuperTypes().add(theConfPackage.getAspectInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(roleConnectorEClass, RoleConnector.class, "RoleConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleConnector_Roleref(), theRbacPackage.getRole(), null, "roleref", null, 0, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RolerefPackageImpl
