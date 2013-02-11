/**
 */
package processes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

import org.eclipse.jwt.meta.model.events.EventHandler;

import org.eclipse.jwt.meta.model.processes.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Activity#getEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Activity#getTotalexecutiontime <em>Totalexecutiontime</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject, PackageableElement, Scope {
   /**
    * Returns the value of the '<em><b>Event Handler</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Event Handler</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Event Handler</em>' containment reference.
    * @see #setEventHandler(EventHandler)
    * @see processes.ProcessesPackage#getActivity_EventHandler()
    * @model containment="true"
    * @generated
    */
   EventHandler getEventHandler();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Activity#getEventHandler <em>Event Handler</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Event Handler</em>' containment reference.
    * @see #getEventHandler()
    * @generated
    */
   void setEventHandler(EventHandler value);

   /**
    * Returns the value of the '<em><b>Totalexecutiontime</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Totalexecutiontime</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Totalexecutiontime</em>' attribute.
    * @see #setTotalexecutiontime(int)
    * @see processes.ProcessesPackage#getActivity_Totalexecutiontime()
    * @model
    * @generated
    */
   int getTotalexecutiontime();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Activity#getTotalexecutiontime <em>Totalexecutiontime</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Totalexecutiontime</em>' attribute.
    * @see #getTotalexecutiontime()
    * @generated
    */
   void setTotalexecutiontime(int value);

} // Activity
