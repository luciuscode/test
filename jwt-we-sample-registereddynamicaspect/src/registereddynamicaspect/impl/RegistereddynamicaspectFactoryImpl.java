/**
 */
package registereddynamicaspect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import registereddynamicaspect.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistereddynamicaspectFactoryImpl extends EFactoryImpl implements RegistereddynamicaspectFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static RegistereddynamicaspectFactory init() {
      try {
         RegistereddynamicaspectFactory theRegistereddynamicaspectFactory = (RegistereddynamicaspectFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt.sample.registereddynamicaspect"); 
         if (theRegistereddynamicaspectFactory != null) {
            return theRegistereddynamicaspectFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new RegistereddynamicaspectFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegistereddynamicaspectFactoryImpl() {
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
         case RegistereddynamicaspectPackage.SAMPLE_REGISTERED_DYNAMIC_ASPECT: return createSampleRegisteredDynamicAspect();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SampleRegisteredDynamicAspect createSampleRegisteredDynamicAspect() {
      SampleRegisteredDynamicAspectImpl sampleRegisteredDynamicAspect = new SampleRegisteredDynamicAspectImpl();
      return sampleRegisteredDynamicAspect;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegistereddynamicaspectPackage getRegistereddynamicaspectPackage() {
      return (RegistereddynamicaspectPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static RegistereddynamicaspectPackage getPackage() {
      return RegistereddynamicaspectPackage.eINSTANCE;
   }

} //RegistereddynamicaspectFactoryImpl
