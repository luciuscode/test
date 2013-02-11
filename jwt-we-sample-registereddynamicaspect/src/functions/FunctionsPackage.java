/**
 */
package functions;

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
 * @see functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "functions";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/functions";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "functions";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   FunctionsPackage eINSTANCE = functions.impl.FunctionsPackageImpl.init();

   /**
    * The meta object id for the '{@link functions.impl.FunctionImpl <em>Function</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see functions.impl.FunctionImpl
    * @see functions.impl.FunctionsPackageImpl#getFunction()
    * @generated
    */
   int FUNCTION = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION__SUBFUNCTIONS = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Function</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FUNCTION_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.functions.Function <em>Function</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Function</em>'.
    * @see org.eclipse.jwt.meta.model.functions.Function
    * @generated
    */
   EClass getFunction();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.functions.Function#getSubfunctions <em>Subfunctions</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Subfunctions</em>'.
    * @see org.eclipse.jwt.meta.model.functions.Function#getSubfunctions()
    * @see #getFunction()
    * @generated
    */
   EReference getFunction_Subfunctions();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   FunctionsFactory getFunctionsFactory();

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
       * The meta object literal for the '{@link functions.impl.FunctionImpl <em>Function</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see functions.impl.FunctionImpl
       * @see functions.impl.FunctionsPackageImpl#getFunction()
       * @generated
       */
      EClass FUNCTION = eINSTANCE.getFunction();

      /**
       * The meta object literal for the '<em><b>Subfunctions</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FUNCTION__SUBFUNCTIONS = eINSTANCE.getFunction_Subfunctions();

   }

} //FunctionsPackage
