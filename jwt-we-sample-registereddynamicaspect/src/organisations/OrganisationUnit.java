/**
 */
package organisations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getSubUnit <em>Sub Unit</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisations.OrganisationsPackage#getOrganisationUnit()
 * @model
 * @generated
 */
public interface OrganisationUnit extends EObject, PackageableElement {
   /**
    * Returns the value of the '<em><b>Sub Unit</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getBelongsTo <em>Belongs To</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sub Unit</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sub Unit</em>' reference list.
    * @see organisations.OrganisationsPackage#getOrganisationUnit_SubUnit()
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getBelongsTo
    * @model opposite="belongsTo"
    * @generated
    */
   EList<org.eclipse.jwt.meta.model.organisations.OrganisationUnit> getSubUnit();

   /**
    * Returns the value of the '<em><b>Belongs To</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getSubUnit <em>Sub Unit</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Belongs To</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Belongs To</em>' reference list.
    * @see organisations.OrganisationsPackage#getOrganisationUnit_BelongsTo()
    * @see org.eclipse.jwt.meta.model.organisations.OrganisationUnit#getSubUnit
    * @model opposite="subUnit"
    * @generated
    */
   EList<org.eclipse.jwt.meta.model.organisations.OrganisationUnit> getBelongsTo();

} // OrganisationUnit
