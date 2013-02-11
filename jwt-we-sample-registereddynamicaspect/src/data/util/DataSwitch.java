/**
 */
package data.util;

import data.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static DataPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DataSwitch() {
      if (modelPackage == null) {
         modelPackage = DataPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case DataPackage.DATA: {
            Data data = (Data)theEObject;
            T result = caseData(data);
            if (result == null) result = caseReferenceableElement(data);
            if (result == null) result = casePackageableElement(data);
            if (result == null) result = caseNamedElement(data);
            if (result == null) result = caseModelElement(data);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.DATA_TYPE: {
            DataType dataType = (DataType)theEObject;
            T result = caseDataType(dataType);
            if (result == null) result = casePackageableElement(dataType);
            if (result == null) result = caseNamedElement(dataType);
            if (result == null) result = caseModelElement(dataType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.PARAMETER: {
            Parameter parameter = (Parameter)theEObject;
            T result = caseParameter(parameter);
            if (result == null) result = casePackageableElement(parameter);
            if (result == null) result = caseNamedElement(parameter);
            if (result == null) result = caseModelElement(parameter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.DATA_MAPPING: {
            DataMapping dataMapping = (DataMapping)theEObject;
            T result = caseDataMapping(dataMapping);
            if (result == null) result = casePackageableElement(dataMapping);
            if (result == null) result = caseNamedElement(dataMapping);
            if (result == null) result = caseModelElement(dataMapping);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.INFORMATION_TYPE: {
            InformationType informationType = (InformationType)theEObject;
            T result = caseInformationType(informationType);
            if (result == null) result = casePackageableElement(informationType);
            if (result == null) result = caseNamedElement(informationType);
            if (result == null) result = caseModelElement(informationType);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.INPUT_PARAMETER: {
            InputParameter inputParameter = (InputParameter)theEObject;
            T result = caseInputParameter(inputParameter);
            if (result == null) result = caseParameter(inputParameter);
            if (result == null) result = casePackageableElement(inputParameter);
            if (result == null) result = caseNamedElement(inputParameter);
            if (result == null) result = caseModelElement(inputParameter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.OUTPUT_PARAMETER: {
            OutputParameter outputParameter = (OutputParameter)theEObject;
            T result = caseOutputParameter(outputParameter);
            if (result == null) result = caseParameter(outputParameter);
            if (result == null) result = casePackageableElement(outputParameter);
            if (result == null) result = caseNamedElement(outputParameter);
            if (result == null) result = caseModelElement(outputParameter);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case DataPackage.PARAMETER_MAPPING: {
            ParameterMapping parameterMapping = (ParameterMapping)theEObject;
            T result = caseParameterMapping(parameterMapping);
            if (result == null) result = casePackageableElement(parameterMapping);
            if (result == null) result = caseNamedElement(parameterMapping);
            if (result == null) result = caseModelElement(parameterMapping);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Data</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseData(Data object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDataType(DataType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParameter(Parameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDataMapping(DataMapping object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Information Type</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Information Type</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInformationType(InformationType object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInputParameter(InputParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Output Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Output Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseOutputParameter(OutputParameter object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParameterMapping(ParameterMapping object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModelElement(ModelElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement(NamedElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackageableElement(PackageableElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseReferenceableElement(ReferenceableElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //DataSwitch
