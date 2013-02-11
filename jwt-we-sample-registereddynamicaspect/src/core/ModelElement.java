/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.core.ModelElement#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {
   /**
    * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.core.Comment}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Comment</em>' containment reference list.
    * @see core.CorePackage#getModelElement_OwnedComment()
    * @model containment="true"
    * @generated
    */
   EList<Comment> getOwnedComment();

} // ModelElement
