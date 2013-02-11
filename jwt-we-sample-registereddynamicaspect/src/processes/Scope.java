/**
 */
package processes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ModelElement;

import org.eclipse.jwt.meta.model.processes.ActivityEdge;
import org.eclipse.jwt.meta.model.processes.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Scope#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Scope#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject, ModelElement {
   /**
    * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.processes.ActivityNode}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Nodes</em>' containment reference list.
    * @see processes.ProcessesPackage#getScope_Nodes()
    * @model containment="true"
    * @generated
    */
   EList<ActivityNode> getNodes();

   /**
    * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.processes.ActivityEdge}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Edges</em>' containment reference list.
    * @see processes.ProcessesPackage#getScope_Edges()
    * @model containment="true"
    * @generated
    */
   EList<ActivityEdge> getEdges();

} // Scope
