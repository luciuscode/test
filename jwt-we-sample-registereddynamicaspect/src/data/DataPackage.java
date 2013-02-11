/**
 */
package data;

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
 * @see data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "data";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/data";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "data";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DataPackage eINSTANCE = data.impl.DataPackageImpl.init();

   /**
    * The meta object id for the '{@link data.impl.DataImpl <em>Data</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.DataImpl
    * @see data.impl.DataPackageImpl#getData()
    * @generated
    */
   int DATA = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__OWNED_COMMENT = CorePackage.REFERENCEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__NAME = CorePackage.REFERENCEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__ICON = CorePackage.REFERENCEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__PACKAGE = CorePackage.REFERENCEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__VALUE = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Data Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__DATA_TYPE = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Information Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__INFORMATION_TYPE = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA__PARAMETERS = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Data</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_FEATURE_COUNT = CorePackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link data.impl.DataTypeImpl <em>Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.DataTypeImpl
    * @see data.impl.DataPackageImpl#getDataType()
    * @generated
    */
   int DATA_TYPE = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The number of structural features of the '<em>Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_TYPE_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link data.impl.ParameterImpl <em>Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.ParameterImpl
    * @see data.impl.DataPackageImpl#getParameter()
    * @generated
    */
   int PARAMETER = 2;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER__VALUE = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link data.impl.DataMappingImpl <em>Mapping</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.DataMappingImpl
    * @see data.impl.DataPackageImpl#getDataMapping()
    * @generated
    */
   int DATA_MAPPING = 3;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Bound Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__BOUND_PARAMETER = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING__PARAMETER = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Mapping</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATA_MAPPING_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link data.impl.InformationTypeImpl <em>Information Type</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.InformationTypeImpl
    * @see data.impl.DataPackageImpl#getInformationType()
    * @generated
    */
   int INFORMATION_TYPE = 4;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFORMATION_TYPE__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFORMATION_TYPE__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFORMATION_TYPE__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFORMATION_TYPE__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The number of structural features of the '<em>Information Type</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INFORMATION_TYPE_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link data.impl.InputParameterImpl <em>Input Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.InputParameterImpl
    * @see data.impl.DataPackageImpl#getInputParameter()
    * @generated
    */
   int INPUT_PARAMETER = 5;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER__OWNED_COMMENT = PARAMETER__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER__NAME = PARAMETER__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER__ICON = PARAMETER__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER__PACKAGE = PARAMETER__PACKAGE;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER__VALUE = PARAMETER__VALUE;

   /**
    * The number of structural features of the '<em>Input Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link data.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.OutputParameterImpl
    * @see data.impl.DataPackageImpl#getOutputParameter()
    * @generated
    */
   int OUTPUT_PARAMETER = 6;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER__OWNED_COMMENT = PARAMETER__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER__NAME = PARAMETER__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER__ICON = PARAMETER__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER__PACKAGE = PARAMETER__PACKAGE;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER__VALUE = PARAMETER__VALUE;

   /**
    * The number of structural features of the '<em>Output Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OUTPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link data.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see data.impl.ParameterMappingImpl
    * @see data.impl.DataPackageImpl#getParameterMapping()
    * @generated
    */
   int PARAMETER_MAPPING = 7;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__OWNED_COMMENT = CorePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__NAME = CorePackage.PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__ICON = CorePackage.PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__PACKAGE = CorePackage.PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__SOURCE = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING__TARGET = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Parameter Mapping</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_MAPPING_FEATURE_COUNT = CorePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.Data <em>Data</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Data</em>'.
    * @see org.eclipse.jwt.meta.model.data.Data
    * @generated
    */
   EClass getData();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.data.Data#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.eclipse.jwt.meta.model.data.Data#getValue()
    * @see #getData()
    * @generated
    */
   EAttribute getData_Value();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.Data#getDataType <em>Data Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Data Type</em>'.
    * @see org.eclipse.jwt.meta.model.data.Data#getDataType()
    * @see #getData()
    * @generated
    */
   EReference getData_DataType();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.Data#getInformationType <em>Information Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Information Type</em>'.
    * @see org.eclipse.jwt.meta.model.data.Data#getInformationType()
    * @see #getData()
    * @generated
    */
   EReference getData_InformationType();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.data.Data#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.eclipse.jwt.meta.model.data.Data#getParameters()
    * @see #getData()
    * @generated
    */
   EReference getData_Parameters();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.DataType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Type</em>'.
    * @see org.eclipse.jwt.meta.model.data.DataType
    * @generated
    */
   EClass getDataType();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.Parameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parameter</em>'.
    * @see org.eclipse.jwt.meta.model.data.Parameter
    * @generated
    */
   EClass getParameter();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.data.Parameter#getValue <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.eclipse.jwt.meta.model.data.Parameter#getValue()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_Value();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.DataMapping <em>Mapping</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Mapping</em>'.
    * @see org.eclipse.jwt.meta.model.data.DataMapping
    * @generated
    */
   EClass getDataMapping();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.DataMapping#getBoundParameter <em>Bound Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Bound Parameter</em>'.
    * @see org.eclipse.jwt.meta.model.data.DataMapping#getBoundParameter()
    * @see #getDataMapping()
    * @generated
    */
   EReference getDataMapping_BoundParameter();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.DataMapping#getParameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Parameter</em>'.
    * @see org.eclipse.jwt.meta.model.data.DataMapping#getParameter()
    * @see #getDataMapping()
    * @generated
    */
   EReference getDataMapping_Parameter();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.InformationType <em>Information Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Information Type</em>'.
    * @see org.eclipse.jwt.meta.model.data.InformationType
    * @generated
    */
   EClass getInformationType();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.InputParameter <em>Input Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Input Parameter</em>'.
    * @see org.eclipse.jwt.meta.model.data.InputParameter
    * @generated
    */
   EClass getInputParameter();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.OutputParameter <em>Output Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Output Parameter</em>'.
    * @see org.eclipse.jwt.meta.model.data.OutputParameter
    * @generated
    */
   EClass getOutputParameter();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.data.ParameterMapping <em>Parameter Mapping</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parameter Mapping</em>'.
    * @see org.eclipse.jwt.meta.model.data.ParameterMapping
    * @generated
    */
   EClass getParameterMapping();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.eclipse.jwt.meta.model.data.ParameterMapping#getSource()
    * @see #getParameterMapping()
    * @generated
    */
   EReference getParameterMapping_Source();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.eclipse.jwt.meta.model.data.ParameterMapping#getTarget()
    * @see #getParameterMapping()
    * @generated
    */
   EReference getParameterMapping_Target();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   DataFactory getDataFactory();

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
       * The meta object literal for the '{@link data.impl.DataImpl <em>Data</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.DataImpl
       * @see data.impl.DataPackageImpl#getData()
       * @generated
       */
      EClass DATA = eINSTANCE.getData();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DATA__VALUE = eINSTANCE.getData_Value();

      /**
       * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA__DATA_TYPE = eINSTANCE.getData_DataType();

      /**
       * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA__INFORMATION_TYPE = eINSTANCE.getData_InformationType();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA__PARAMETERS = eINSTANCE.getData_Parameters();

      /**
       * The meta object literal for the '{@link data.impl.DataTypeImpl <em>Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.DataTypeImpl
       * @see data.impl.DataPackageImpl#getDataType()
       * @generated
       */
      EClass DATA_TYPE = eINSTANCE.getDataType();

      /**
       * The meta object literal for the '{@link data.impl.ParameterImpl <em>Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.ParameterImpl
       * @see data.impl.DataPackageImpl#getParameter()
       * @generated
       */
      EClass PARAMETER = eINSTANCE.getParameter();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

      /**
       * The meta object literal for the '{@link data.impl.DataMappingImpl <em>Mapping</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.DataMappingImpl
       * @see data.impl.DataPackageImpl#getDataMapping()
       * @generated
       */
      EClass DATA_MAPPING = eINSTANCE.getDataMapping();

      /**
       * The meta object literal for the '<em><b>Bound Parameter</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA_MAPPING__BOUND_PARAMETER = eINSTANCE.getDataMapping_BoundParameter();

      /**
       * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATA_MAPPING__PARAMETER = eINSTANCE.getDataMapping_Parameter();

      /**
       * The meta object literal for the '{@link data.impl.InformationTypeImpl <em>Information Type</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.InformationTypeImpl
       * @see data.impl.DataPackageImpl#getInformationType()
       * @generated
       */
      EClass INFORMATION_TYPE = eINSTANCE.getInformationType();

      /**
       * The meta object literal for the '{@link data.impl.InputParameterImpl <em>Input Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.InputParameterImpl
       * @see data.impl.DataPackageImpl#getInputParameter()
       * @generated
       */
      EClass INPUT_PARAMETER = eINSTANCE.getInputParameter();

      /**
       * The meta object literal for the '{@link data.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.OutputParameterImpl
       * @see data.impl.DataPackageImpl#getOutputParameter()
       * @generated
       */
      EClass OUTPUT_PARAMETER = eINSTANCE.getOutputParameter();

      /**
       * The meta object literal for the '{@link data.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see data.impl.ParameterMappingImpl
       * @see data.impl.DataPackageImpl#getParameterMapping()
       * @generated
       */
      EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER_MAPPING__SOURCE = eINSTANCE.getParameterMapping_Source();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER_MAPPING__TARGET = eINSTANCE.getParameterMapping_Target();

   }

} //DataPackage
