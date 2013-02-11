/**
 */
package processes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecification <em>Sub Specification</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecificationConnector <em>Sub Specification Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getGuardSpecification()
 * @model
 * @generated
 */
public interface GuardSpecification extends EObject {
   /**
    * Returns the value of the '<em><b>Data</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Data</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Data</em>' reference.
    * @see #setData(Data)
    * @see processes.ProcessesPackage#getGuardSpecification_Data()
    * @model required="true"
    * @generated
    */
   Data getData();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getData <em>Data</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Data</em>' reference.
    * @see #getData()
    * @generated
    */
   void setData(Data value);

   /**
    * Returns the value of the '<em><b>Attribute</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Attribute</em>' attribute.
    * @see #setAttribute(String)
    * @see processes.ProcessesPackage#getGuardSpecification_Attribute()
    * @model
    * @generated
    */
   String getAttribute();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getAttribute <em>Attribute</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Attribute</em>' attribute.
    * @see #getAttribute()
    * @generated
    */
   void setAttribute(String value);

   /**
    * Returns the value of the '<em><b>Operation</b></em>' attribute.
    * The literals are from the enumeration {@link processes.OperationType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' attribute.
    * @see processes.OperationType
    * @see #setOperation(OperationType)
    * @see processes.ProcessesPackage#getGuardSpecification_Operation()
    * @model required="true"
    * @generated
    */
   OperationType getOperation();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getOperation <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation</em>' attribute.
    * @see processes.OperationType
    * @see #getOperation()
    * @generated
    */
   void setOperation(OperationType value);

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
    * @see processes.ProcessesPackage#getGuardSpecification_Value()
    * @model required="true"
    * @generated
    */
   String getValue();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(String value);

   /**
    * Returns the value of the '<em><b>Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Description</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Description</em>' attribute.
    * @see #setDescription(String)
    * @see processes.ProcessesPackage#getGuardSpecification_Description()
    * @model
    * @generated
    */
   String getDescription();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getDescription <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Description</em>' attribute.
    * @see #getDescription()
    * @generated
    */
   void setDescription(String value);

   /**
    * Returns the value of the '<em><b>Sub Specification</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.processes.GuardSpecification}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sub Specification</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sub Specification</em>' containment reference list.
    * @see processes.ProcessesPackage#getGuardSpecification_SubSpecification()
    * @model containment="true"
    * @generated
    */
   EList<org.eclipse.jwt.meta.model.processes.GuardSpecification> getSubSpecification();

   /**
    * Returns the value of the '<em><b>Sub Specification Connector</b></em>' attribute.
    * The literals are from the enumeration {@link processes.BooleanConnector}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sub Specification Connector</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sub Specification Connector</em>' attribute.
    * @see processes.BooleanConnector
    * @see #setSubSpecificationConnector(BooleanConnector)
    * @see processes.ProcessesPackage#getGuardSpecification_SubSpecificationConnector()
    * @model
    * @generated
    */
   BooleanConnector getSubSpecificationConnector();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.GuardSpecification#getSubSpecificationConnector <em>Sub Specification Connector</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sub Specification Connector</em>' attribute.
    * @see processes.BooleanConnector
    * @see #getSubSpecificationConnector()
    * @generated
    */
   void setSubSpecificationConnector(BooleanConnector value);

} // GuardSpecification
