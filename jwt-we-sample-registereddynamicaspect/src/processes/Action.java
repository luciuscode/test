/**
 */
package processes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.application.Application;

import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataMapping;

import org.eclipse.jwt.meta.model.functions.Function;

import org.eclipse.jwt.meta.model.organisations.Role;

import org.eclipse.jwt.meta.model.processes.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Action#getTargetexecutiontime <em>Targetexecutiontime</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject, ExecutableNode {
   /**
    * Returns the value of the '<em><b>Performed By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Performed By</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Performed By</em>' reference.
    * @see #setPerformedBy(Role)
    * @see processes.ProcessesPackage#getAction_PerformedBy()
    * @model
    * @generated
    */
   Role getPerformedBy();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Action#getPerformedBy <em>Performed By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Performed By</em>' reference.
    * @see #getPerformedBy()
    * @generated
    */
   void setPerformedBy(Role value);

   /**
    * Returns the value of the '<em><b>Executed By</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Executed By</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Executed By</em>' reference.
    * @see #setExecutedBy(Application)
    * @see processes.ProcessesPackage#getAction_ExecutedBy()
    * @model
    * @generated
    */
   Application getExecutedBy();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Action#getExecutedBy <em>Executed By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Executed By</em>' reference.
    * @see #getExecutedBy()
    * @generated
    */
   void setExecutedBy(Application value);

   /**
    * Returns the value of the '<em><b>Realizes</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Realizes</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Realizes</em>' reference.
    * @see #setRealizes(Function)
    * @see processes.ProcessesPackage#getAction_Realizes()
    * @model
    * @generated
    */
   Function getRealizes();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Action#getRealizes <em>Realizes</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Realizes</em>' reference.
    * @see #getRealizes()
    * @generated
    */
   void setRealizes(Function value);

   /**
    * Returns the value of the '<em><b>Inputs</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.Data}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Inputs</em>' reference list.
    * @see processes.ProcessesPackage#getAction_Inputs()
    * @model
    * @generated
    */
   EList<Data> getInputs();

   /**
    * Returns the value of the '<em><b>Outputs</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.Data}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outputs</em>' reference list.
    * @see processes.ProcessesPackage#getAction_Outputs()
    * @model
    * @generated
    */
   EList<Data> getOutputs();

   /**
    * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.DataMapping}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Mappings</em>' containment reference list.
    * @see processes.ProcessesPackage#getAction_Mappings()
    * @model containment="true"
    * @generated
    */
   EList<DataMapping> getMappings();

   /**
    * Returns the value of the '<em><b>Targetexecutiontime</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Targetexecutiontime</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Targetexecutiontime</em>' attribute.
    * @see #setTargetexecutiontime(int)
    * @see processes.ProcessesPackage#getAction_Targetexecutiontime()
    * @model
    * @generated
    */
   int getTargetexecutiontime();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Action#getTargetexecutiontime <em>Targetexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Targetexecutiontime</em>' attribute.
    * @see #getTargetexecutiontime()
    * @generated
    */
   void setTargetexecutiontime(int value);

} // Action
