/**
 */
package data;

import org.eclipse.emf.ecore.EFactory;

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
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DataFactory eINSTANCE = data.impl.DataFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Data</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Data</em>'.
    * @generated
    */
   Data createData();

   /**
    * Returns a new object of class '<em>Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Type</em>'.
    * @generated
    */
   DataType createDataType();

   /**
    * Returns a new object of class '<em>Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Parameter</em>'.
    * @generated
    */
   Parameter createParameter();

   /**
    * Returns a new object of class '<em>Mapping</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Mapping</em>'.
    * @generated
    */
   DataMapping createDataMapping();

   /**
    * Returns a new object of class '<em>Information Type</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Information Type</em>'.
    * @generated
    */
   InformationType createInformationType();

   /**
    * Returns a new object of class '<em>Input Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Input Parameter</em>'.
    * @generated
    */
   InputParameter createInputParameter();

   /**
    * Returns a new object of class '<em>Output Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Output Parameter</em>'.
    * @generated
    */
   OutputParameter createOutputParameter();

   /**
    * Returns a new object of class '<em>Parameter Mapping</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Parameter Mapping</em>'.
    * @generated
    */
   ParameterMapping createParameterMapping();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   DataPackage getDataPackage();

} //DataFactory
