/**
 */
package organisations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;
import org.eclipse.jwt.meta.model.organisations.Role;

import organisations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganisationsFactoryImpl extends EFactoryImpl implements OrganisationsFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static OrganisationsFactory init() {
      try {
         OrganisationsFactory theOrganisationsFactory = (OrganisationsFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt/organisations"); 
         if (theOrganisationsFactory != null) {
            return theOrganisationsFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new OrganisationsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OrganisationsFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case OrganisationsPackage.ROLE: return createRole();
         case OrganisationsPackage.ORGANISATION_UNIT: return createOrganisationUnit();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Role createRole() {
      RoleImpl role = new RoleImpl();
      return role;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OrganisationUnit createOrganisationUnit() {
      OrganisationUnitImpl organisationUnit = new OrganisationUnitImpl();
      return organisationUnit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OrganisationsPackage getOrganisationsPackage() {
      return (OrganisationsPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static OrganisationsPackage getPackage() {
      return OrganisationsPackage.eINSTANCE;
   }

} //OrganisationsFactoryImpl
