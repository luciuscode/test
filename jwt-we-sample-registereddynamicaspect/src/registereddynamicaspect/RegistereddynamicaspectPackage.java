/**
 */
package registereddynamicaspect;

import conf.ConfPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see registereddynamicaspect.RegistereddynamicaspectFactory
 * @model kind="package"
 * @generated
 */
public interface RegistereddynamicaspectPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "registereddynamicaspect";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt.sample.registereddynamicaspect";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "registereddynamicaspect";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   RegistereddynamicaspectPackage eINSTANCE = registereddynamicaspect.impl.RegistereddynamicaspectPackageImpl.init();

   /**
    * The meta object id for the '{@link registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl <em>Sample Registered Dynamic Aspect</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl
    * @see registereddynamicaspect.impl.RegistereddynamicaspectPackageImpl#getSampleRegisteredDynamicAspect()
    * @generated
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT__ID = ConfPackage.ASPECT_INSTANCE__ID;

   /**
    * The feature id for the '<em><b>Target Model Element</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT__TARGET_MODEL_ELEMENT = ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT;

   /**
    * The feature id for the '<em><b>Sampleintprop</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Sampleactionref</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Sample Registered Dynamic Aspect</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SAMPLE_REGISTERED_DYNAMIC_ASPECT_FEATURE_COUNT = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link registereddynamicaspect.SampleRegisteredDynamicAspect <em>Sample Registered Dynamic Aspect</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sample Registered Dynamic Aspect</em>'.
    * @see registereddynamicaspect.SampleRegisteredDynamicAspect
    * @generated
    */
   EClass getSampleRegisteredDynamicAspect();

   /**
    * Returns the meta object for the attribute '{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleintprop <em>Sampleintprop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Sampleintprop</em>'.
    * @see registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleintprop()
    * @see #getSampleRegisteredDynamicAspect()
    * @generated
    */
   EAttribute getSampleRegisteredDynamicAspect_Sampleintprop();

   /**
    * Returns the meta object for the reference '{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleactionref <em>Sampleactionref</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Sampleactionref</em>'.
    * @see registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleactionref()
    * @see #getSampleRegisteredDynamicAspect()
    * @generated
    */
   EReference getSampleRegisteredDynamicAspect_Sampleactionref();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   RegistereddynamicaspectFactory getRegistereddynamicaspectFactory();

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
       * The meta object literal for the '{@link registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl <em>Sample Registered Dynamic Aspect</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see registereddynamicaspect.impl.SampleRegisteredDynamicAspectImpl
       * @see registereddynamicaspect.impl.RegistereddynamicaspectPackageImpl#getSampleRegisteredDynamicAspect()
       * @generated
       */
      EClass SAMPLE_REGISTERED_DYNAMIC_ASPECT = eINSTANCE.getSampleRegisteredDynamicAspect();

      /**
       * The meta object literal for the '<em><b>Sampleintprop</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEINTPROP = eINSTANCE.getSampleRegisteredDynamicAspect_Sampleintprop();

      /**
       * The meta object literal for the '<em><b>Sampleactionref</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SAMPLE_REGISTERED_DYNAMIC_ASPECT__SAMPLEACTIONREF = eINSTANCE.getSampleRegisteredDynamicAspect_Sampleactionref();

   }

} //RegistereddynamicaspectPackage
