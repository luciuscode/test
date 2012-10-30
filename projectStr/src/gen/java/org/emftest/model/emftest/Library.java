/**
 */
package org.emftest.model.emftest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftest.model.emftest.Library#getCollections <em>Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftest.model.emftest.emftestPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftest.model.emftest.BookCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see org.emftest.model.emftest.emftestPackage#getLibrary_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BookCollection> getCollections();

} // Library
