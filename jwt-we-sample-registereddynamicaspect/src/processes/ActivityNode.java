/**
 */
package processes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.NamedElement;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getIn <em>In</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityNode#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends EObject, NamedElement, GraphicalElement {
   /**
    * Returns the value of the '<em><b>In</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.processes.ActivityEdge}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>In</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>In</em>' reference list.
    * @see processes.ProcessesPackage#getActivityNode_In()
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge#getTarget
    * @model opposite="target"
    * @generated
    */
   EList<ActivityEdge> getIn();

   /**
    * Returns the value of the '<em><b>Out</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.processes.ActivityEdge}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Out</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Out</em>' reference list.
    * @see processes.ProcessesPackage#getActivityNode_Out()
    * @see org.eclipse.jwt.meta.model.processes.ActivityEdge#getSource
    * @model opposite="source"
    * @generated
    */
   EList<ActivityEdge> getOut();

} // ActivityNode
