/**
 */
package application;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.application.Application;
import org.eclipse.jwt.meta.model.application.ApplicationType;
import org.eclipse.jwt.meta.model.application.WebServiceApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ApplicationFactory eINSTANCE = application.impl.ApplicationFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Application</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Application</em>'.
    * @generated
    */
   Application createApplication();

   /**
    * Returns a new object of class '<em>Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Type</em>'.
    * @generated
    */
   ApplicationType createApplicationType();

   /**
    * Returns a new object of class '<em>Web Service Application</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Web Service Application</em>'.
    * @generated
    */
   WebServiceApplication createWebServiceApplication();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ApplicationPackage getApplicationPackage();

} //ApplicationFactory
