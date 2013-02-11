/**
 */
package functions;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.functions.Function;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   FunctionsFactory eINSTANCE = functions.impl.FunctionsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Function</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Function</em>'.
    * @generated
    */
   Function createFunction();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
