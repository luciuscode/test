/**
 */
package data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ReferenceableElement;

import org.eclipse.jwt.meta.model.data.DataType;
import org.eclipse.jwt.meta.model.data.InformationType;
import org.eclipse.jwt.meta.model.data.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.data.Data#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.data.Data#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.data.Data#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.data.Data#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject, ReferenceableElement {
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(String)
    * @see data.DataPackage#getData_Value()
    * @model
    * @generated
    */
   String getValue();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.Data#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(String value);

   /**
    * Returns the value of the '<em><b>Data Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Data Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Data Type</em>' reference.
    * @see #setDataType(DataType)
    * @see data.DataPackage#getData_DataType()
    * @model required="true"
    * @generated
    */
   DataType getDataType();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.Data#getDataType <em>Data Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Data Type</em>' reference.
    * @see #getDataType()
    * @generated
    */
   void setDataType(DataType value);

   /**
    * Returns the value of the '<em><b>Information Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Information Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Information Type</em>' reference.
    * @see #setInformationType(InformationType)
    * @see data.DataPackage#getData_InformationType()
    * @model required="true"
    * @generated
    */
   InformationType getInformationType();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.Data#getInformationType <em>Information Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Information Type</em>' reference.
    * @see #getInformationType()
    * @generated
    */
   void setInformationType(InformationType value);

   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.Parameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see data.DataPackage#getData_Parameters()
    * @model containment="true"
    * @generated
    */
   EList<Parameter> getParameters();

} // Data
