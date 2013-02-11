/**
 */
package organisations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ReferenceableElement;

import org.eclipse.jwt.meta.model.organisations.OrganisationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.organisations.Role#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisations.OrganisationsPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject, ReferenceableElement {
   /**
    * Returns the value of the '<em><b>Performed By</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Performed By</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Performed By</em>' reference list.
    * @see organisations.OrganisationsPackage#getRole_PerformedBy()
    * @model
    * @generated
    */
   EList<OrganisationUnit> getPerformedBy();

} // Role
