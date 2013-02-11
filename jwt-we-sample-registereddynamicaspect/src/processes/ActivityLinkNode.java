/**
 */
package processes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.data.ParameterMapping;

import org.eclipse.jwt.meta.model.processes.Activity;
import org.eclipse.jwt.meta.model.processes.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Link Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getLinksto <em>Linksto</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getActivityLinkNode()
 * @model
 * @generated
 */
public interface ActivityLinkNode extends EObject, ExecutableNode {
   /**
    * Returns the value of the '<em><b>Linksto</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Linksto</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Linksto</em>' reference.
    * @see #setLinksto(Activity)
    * @see processes.ProcessesPackage#getActivityLinkNode_Linksto()
    * @model required="true"
    * @generated
    */
   Activity getLinksto();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.ActivityLinkNode#getLinksto <em>Linksto</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Linksto</em>' reference.
    * @see #getLinksto()
    * @generated
    */
   void setLinksto(Activity value);

   /**
    * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.ParameterMapping}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Uses</em>' containment reference list.
    * @see processes.ProcessesPackage#getActivityLinkNode_Uses()
    * @model containment="true" required="true"
    * @generated
    */
   EList<ParameterMapping> getUses();

} // ActivityLinkNode
