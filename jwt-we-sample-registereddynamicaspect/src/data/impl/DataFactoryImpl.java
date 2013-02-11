/**
 */
package data.impl;

import data.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataMapping;
import org.eclipse.jwt.meta.model.data.DataType;
import org.eclipse.jwt.meta.model.data.InformationType;
import org.eclipse.jwt.meta.model.data.InputParameter;
import org.eclipse.jwt.meta.model.data.OutputParameter;
import org.eclipse.jwt.meta.model.data.Parameter;
import org.eclipse.jwt.meta.model.data.ParameterMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static DataFactory init() {
      try {
         DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt/data"); 
         if (theDataFactory != null) {
            return theDataFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new DataFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataFactoryImpl() {
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
         case DataPackage.DATA: return createData();
         case DataPackage.DATA_TYPE: return createDataType();
         case DataPackage.PARAMETER: return createParameter();
         case DataPackage.DATA_MAPPING: return createDataMapping();
         case DataPackage.INFORMATION_TYPE: return createInformationType();
         case DataPackage.INPUT_PARAMETER: return createInputParameter();
         case DataPackage.OUTPUT_PARAMETER: return createOutputParameter();
         case DataPackage.PARAMETER_MAPPING: return createParameterMapping();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Data createData() {
      DataImpl data = new DataImpl();
      return data;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataType createDataType() {
      DataTypeImpl dataType = new DataTypeImpl();
      return dataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Parameter createParameter() {
      ParameterImpl parameter = new ParameterImpl();
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataMapping createDataMapping() {
      DataMappingImpl dataMapping = new DataMappingImpl();
      return dataMapping;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InformationType createInformationType() {
      InformationTypeImpl informationType = new InformationTypeImpl();
      return informationType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InputParameter createInputParameter() {
      InputParameterImpl inputParameter = new InputParameterImpl();
      return inputParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public OutputParameter createOutputParameter() {
      OutputParameterImpl outputParameter = new OutputParameterImpl();
      return outputParameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ParameterMapping createParameterMapping() {
      ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
      return parameterMapping;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataPackage getDataPackage() {
      return (DataPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static DataPackage getPackage() {
      return DataPackage.eINSTANCE;
   }

} //DataFactoryImpl
