/**
 */
package application;

import core.CorePackage;

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
 * @see application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "application";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/application";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "application";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ApplicationPackage eINSTANCE = application.impl.ApplicationPackageImpl.init();

   /**
    * The meta object id for the '{@link application.impl.ApplicationImpl <em>Application</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see application.impl.ApplicationImpl
    * @see application.impl.ApplicationPackageImpl#getApplication()
    * @generated
    */
   int APPLICATION = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__OWNED_COMMENT = CorePackage.REFERENCEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__NAME = CorePackage.REFERENCEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__ICON = CorePackage.REFERENCEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__PACKAGE = CorePackage.REFERENCEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__TYPE = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Jar Archive</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__JAR_ARCHIVE = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Java Class</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__JAVA_CLASS = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Method</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__METHOD = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Input</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__INPUT = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Output</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION__OUTPUT = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Application</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_FEATURE_COUNT = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link application.impl.ApplicationTypeImpl <em>Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see application.impl.ApplicationTypeImpl
    * @see application.impl.ApplicationPackageImpl#getApplicationType()
    * @generated
    */
   int APPLICATION_TYPE = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_TYPE__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_TYPE__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_TYPE__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_TYPE__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The number of structural features of the '<em>Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int APPLICATION_TYPE_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link application.impl.WebServiceApplicationImpl <em>Web Service Application</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see application.impl.WebServiceApplicationImpl
    * @see application.impl.ApplicationPackageImpl#getWebServiceApplication()
    * @generated
    */
   int WEB_SERVICE_APPLICATION = 2;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__OWNED_COMMENT = APPLICATION__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__NAME = APPLICATION__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__ICON = APPLICATION__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__PACKAGE = APPLICATION__PACKAGE;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__TYPE = APPLICATION__TYPE;

   /**
    * The feature id for the '<em><b>Jar Archive</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__JAR_ARCHIVE = APPLICATION__JAR_ARCHIVE;

   /**
    * The feature id for the '<em><b>Java Class</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__JAVA_CLASS = APPLICATION__JAVA_CLASS;

   /**
    * The feature id for the '<em><b>Method</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__METHOD = APPLICATION__METHOD;

   /**
    * The feature id for the '<em><b>Input</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__INPUT = APPLICATION__INPUT;

   /**
    * The feature id for the '<em><b>Output</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__OUTPUT = APPLICATION__OUTPUT;

   /**
    * The feature id for the '<em><b>Interface</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__INTERFACE = APPLICATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION__OPERATION = APPLICATION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Web Service Application</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int WEB_SERVICE_APPLICATION_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.application.Application <em>Application</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Application</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application
    * @generated
    */
   EClass getApplication();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.application.Application#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Type</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getType()
    * @see #getApplication()
    * @generated
    */
   EReference getApplication_Type();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.application.Application#getJarArchive <em>Jar Archive</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Jar Archive</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getJarArchive()
    * @see #getApplication()
    * @generated
    */
   EAttribute getApplication_JarArchive();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.application.Application#getJavaClass <em>Java Class</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Java Class</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getJavaClass()
    * @see #getApplication()
    * @generated
    */
   EAttribute getApplication_JavaClass();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.application.Application#getMethod <em>Method</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Method</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getMethod()
    * @see #getApplication()
    * @generated
    */
   EAttribute getApplication_Method();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.application.Application#getInput <em>Input</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Input</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getInput()
    * @see #getApplication()
    * @generated
    */
   EReference getApplication_Input();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.application.Application#getOutput <em>Output</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Output</em>'.
    * @see org.eclipse.jwt.meta.model.application.Application#getOutput()
    * @see #getApplication()
    * @generated
    */
   EReference getApplication_Output();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.application.ApplicationType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Type</em>'.
    * @see org.eclipse.jwt.meta.model.application.ApplicationType
    * @generated
    */
   EClass getApplicationType();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.application.WebServiceApplication <em>Web Service Application</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Web Service Application</em>'.
    * @see org.eclipse.jwt.meta.model.application.WebServiceApplication
    * @generated
    */
   EClass getWebServiceApplication();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getInterface <em>Interface</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Interface</em>'.
    * @see org.eclipse.jwt.meta.model.application.WebServiceApplication#getInterface()
    * @see #getWebServiceApplication()
    * @generated
    */
   EAttribute getWebServiceApplication_Interface();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Operation</em>'.
    * @see org.eclipse.jwt.meta.model.application.WebServiceApplication#getOperation()
    * @see #getWebServiceApplication()
    * @generated
    */
   EAttribute getWebServiceApplication_Operation();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ApplicationFactory getApplicationFactory();

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
       * The meta object literal for the '{@link application.impl.ApplicationImpl <em>Application</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see application.impl.ApplicationImpl
       * @see application.impl.ApplicationPackageImpl#getApplication()
       * @generated
       */
      EClass APPLICATION = eINSTANCE.getApplication();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference APPLICATION__TYPE = eINSTANCE.getApplication_Type();

      /**
       * The meta object literal for the '<em><b>Jar Archive</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute APPLICATION__JAR_ARCHIVE = eINSTANCE.getApplication_JarArchive();

      /**
       * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute APPLICATION__JAVA_CLASS = eINSTANCE.getApplication_JavaClass();

      /**
       * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute APPLICATION__METHOD = eINSTANCE.getApplication_Method();

      /**
       * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference APPLICATION__INPUT = eINSTANCE.getApplication_Input();

      /**
       * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference APPLICATION__OUTPUT = eINSTANCE.getApplication_Output();

      /**
       * The meta object literal for the '{@link application.impl.ApplicationTypeImpl <em>Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see application.impl.ApplicationTypeImpl
       * @see application.impl.ApplicationPackageImpl#getApplicationType()
       * @generated
       */
      EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

      /**
       * The meta object literal for the '{@link application.impl.WebServiceApplicationImpl <em>Web Service Application</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see application.impl.WebServiceApplicationImpl
       * @see application.impl.ApplicationPackageImpl#getWebServiceApplication()
       * @generated
       */
      EClass WEB_SERVICE_APPLICATION = eINSTANCE.getWebServiceApplication();

      /**
       * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute WEB_SERVICE_APPLICATION__INTERFACE = eINSTANCE.getWebServiceApplication_Interface();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute WEB_SERVICE_APPLICATION__OPERATION = eINSTANCE.getWebServiceApplication_Operation();

   }

} //ApplicationPackage
