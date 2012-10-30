/**
 */
package org.emftest.model.emftest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftest.model.emftest.BookCollection#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftest.model.emftest.emftestPackage#getBookCollection()
 * @model
 * @generated
 */
public interface BookCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftest.model.emftest.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see org.emftest.model.emftest.emftestPackage#getBookCollection_Books()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBooks();

} // BookCollection
