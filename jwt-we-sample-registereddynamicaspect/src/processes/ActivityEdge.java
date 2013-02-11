/**
 */
package processes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ModelElement;

import org.eclipse.jwt.meta.model.processes.ActivityNode;
import org.eclipse.jwt.meta.model.processes.Guard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getActivityEdge()
 * @model
 * @generated
 */
public interface ActivityEdge extends EObject, ModelElement {
   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getOut <em>Out</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(ActivityNode)
    * @see processes.ProcessesPackage#getActivityEdge_Source()
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode#getOut
    * @model opposite="out" required="true"
    * @generated
    */
   ActivityNode getSource();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource(ActivityNode value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getIn <em>In</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(ActivityNode)
    * @see processes.ProcessesPackage#getActivityEdge_Target()
    * @see org.eclipse.jwt.meta.model.processes.ActivityNode#getIn
    * @model opposite="in" required="true"
    * @generated
    */
   ActivityNode getTarget();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(ActivityNode value);

   /**
    * Returns the value of the '<em><b>Guard</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Guard</em>' containment reference.
    * @see #setGuard(Guard)
    * @see processes.ProcessesPackage#getActivityEdge_Guard()
    * @model containment="true"
    * @generated
    */
   Guard getGuard();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Guard</em>' containment reference.
    * @see #getGuard()
    * @generated
    */
   void setGuard(Guard value);

} // ActivityEdge
