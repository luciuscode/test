/**
 */
package conf;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.we.conf.model.Aspect;
import org.eclipse.jwt.we.conf.model.AspectInstance;
import org.eclipse.jwt.we.conf.model.ConfModel;
import org.eclipse.jwt.we.conf.model.Profile;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see conf.ConfPackage
 * @generated
 */
public interface ConfFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ConfFactory eINSTANCE = conf.impl.ConfFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Model</em>'.
    * @generated
    */
   ConfModel createConfModel();

   /**
    * Returns a new object of class '<em>Profile</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Profile</em>'.
    * @generated
    */
   Profile createProfile();

   /**
    * Returns a new object of class '<em>Aspect</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Aspect</em>'.
    * @generated
    */
   Aspect createAspect();

   /**
    * Returns a new object of class '<em>Aspect Instance</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Aspect Instance</em>'.
    * @generated
    */
   AspectInstance createAspectInstance();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ConfPackage getConfPackage();

} //ConfFactory
