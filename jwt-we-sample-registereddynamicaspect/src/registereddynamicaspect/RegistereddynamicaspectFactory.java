/**
 */
package registereddynamicaspect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see registereddynamicaspect.RegistereddynamicaspectPackage
 * @generated
 */
public interface RegistereddynamicaspectFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   RegistereddynamicaspectFactory eINSTANCE = registereddynamicaspect.impl.RegistereddynamicaspectFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Sample Registered Dynamic Aspect</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Sample Registered Dynamic Aspect</em>'.
    * @generated
    */
   SampleRegisteredDynamicAspect createSampleRegisteredDynamicAspect();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   RegistereddynamicaspectPackage getRegistereddynamicaspectPackage();

} //RegistereddynamicaspectFactory
