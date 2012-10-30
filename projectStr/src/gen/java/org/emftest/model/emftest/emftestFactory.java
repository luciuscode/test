/**
 */
package org.emftest.model.emftest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftest.model.emftest.emftestPackage
 * @generated
 */
public interface emftestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	emftestFactory eINSTANCE = org.emftest.model.emftest.impl.emftestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Child Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Book</em>'.
	 * @generated
	 */
	ChildBook createChildBook();

	/**
	 * Returns a new object of class '<em>Parent Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Book</em>'.
	 * @generated
	 */
	ParentBook createParentBook();

	/**
	 * Returns a new object of class '<em>Book Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Collection</em>'.
	 * @generated
	 */
	BookCollection createBookCollection();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	emftestPackage getemftestPackage();

} //emftestFactory
