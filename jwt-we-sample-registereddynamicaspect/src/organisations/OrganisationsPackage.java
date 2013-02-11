/**
 */
package organisations;

import core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see organisations.OrganisationsFactory
 * @model kind="package"
 * @generated
 */
public interface OrganisationsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "organisations";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/organisations";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "organisations";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   OrganisationsPackage eINSTANCE = organisations.impl.OrganisationsPackageImpl.init();

   /**
    * The meta object id for the '{@link organisations.impl.RoleImpl <em>Role</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see organisations.impl.RoleImpl
    * @see organisations.impl.OrganisationsPackageImpl#getRole()
    * @generated
    */
   int ROLE = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__OWNED_COMMENT = CorePackage.REFERENCEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__NAME = CorePackage.REFERENCEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__ICON = CorePackage.REFERENCEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__PACKAGE = CorePackage.REFERENCEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Performed By</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE__PERFORMED_BY = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Role</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROLE_FEATURE_COUNT = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link organisations.impl.OrganisationUnitImpl <em>Organisation Unit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see organisations.impl.OrganisationUnitImpl
    * @see organisations.impl.OrganisationsPackageImpl#getOrganisationUnit()
    * @generated
    */
   int ORGANISATION_UNIT = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Sub Unit</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__SUB_UNIT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Belongs To</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT__BELONGS_TO = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Organisation Unit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ORGANISATION_UNIT_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.organisations.Role <em>Role</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Role</em>'.
    * @see org.eclipse.jwt.meta.model.organisations.Role
    * @generated
    */
   EClass getRole();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.organisations.Role#getPerformedBy <em>Performed By</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Performed By</em>'.
    * @see org.eclipse.jwt.meta.model.organisations.Role#getPerformedBy()
    * @see #getRole()
    * @generated
    */
   EReference getRole_PerformedBy();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit <em>Organisation Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Organisation Unit</em>'.
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit
    * @generated
    */
   EClass getOrganisationUnit();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getSubUnit <em>Sub Unit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Sub Unit</em>'.
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getSubUnit()
    * @see #getOrganisationUnit()
    * @generated
    */
   EReference getOrganisationUnit_SubUnit();

   /**
    * Returns the meta object for the reference list '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getBelongsTo <em>Belongs To</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Belongs To</em>'.
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getBelongsTo()
    * @see #getOrganisationUnit()
    * @generated
    */
   EReference getOrganisationUnit_BelongsTo();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   OrganisationsFactory getOrganisationsFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link organisations.impl.RoleImpl <em>Role</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see organisations.impl.RoleImpl
       * @see organisations.impl.OrganisationsPackageImpl#getRole()
       * @generated
       */
      EClass ROLE = eINSTANCE.getRole();

      /**
       * The meta object literal for the '<em><b>Performed By</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ROLE__PERFORMED_BY = eINSTANCE.getRole_PerformedBy();

      /**
       * The meta object literal for the '{@link organisations.impl.OrganisationUnitImpl <em>Organisation Unit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see organisations.impl.OrganisationUnitImpl
       * @see organisations.impl.OrganisationsPackageImpl#getOrganisationUnit()
       * @generated
       */
      EClass ORGANISATION_UNIT = eINSTANCE.getOrganisationUnit();

      /**
       * The meta object literal for the '<em><b>Sub Unit</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ORGANISATION_UNIT__SUB_UNIT = eINSTANCE.getOrganisationUnit_SubUnit();

      /**
       * The meta object literal for the '<em><b>Belongs To</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ORGANISATION_UNIT__BELONGS_TO = eINSTANCE.getOrganisationUnit_BelongsTo();

   }

} //OrganisationsPackage
