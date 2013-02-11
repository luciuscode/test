/**
 */
package organisations;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;
import org.eclipse.jwt.meta.model.organisations.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see organisations.OrganisationsPackage
 * @generated
 */
public interface OrganisationsFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   OrganisationsFactory eINSTANCE = organisations.impl.OrganisationsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Role</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Role</em>'.
    * @generated
    */
   Role createRole();

   /**
    * Returns a new object of class '<em>Organisation Unit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Organisation Unit</em>'.
    * @generated
    */
   OrganisationUnit createOrganisationUnit();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   OrganisationsPackage getOrganisationsPackage();

} //OrganisationsFactory
