/**
 */
package org.eclipse.example.schoollibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.example.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.example.schoollibrary.SchoollibraryFactory
 * @model kind="package"
 * @generated
 */
public interface SchoollibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schoollibrary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/example/schoollibrary.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.schoollibrary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoollibraryPackage eINSTANCE = org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.example.schoollibrary.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.example.schoollibrary.impl.AssetImpl
	 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.example.schoollibrary.impl.SchoolBookImpl <em>School Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.example.schoollibrary.impl.SchoolBookImpl
	 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getSchoolBook()
	 * @generated
	 */
	int SCHOOL_BOOK = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK__TITLE = LibraryPackage.BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK__PAGES = LibraryPackage.BOOK__PAGES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK__CATEGORY = LibraryPackage.BOOK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK__AUTHOR = LibraryPackage.BOOK__AUTHOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK__VALUE = LibraryPackage.BOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>School Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_BOOK_FEATURE_COUNT = LibraryPackage.BOOK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.example.schoollibrary.impl.SchoolLibraryImpl <em>School Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.example.schoollibrary.impl.SchoolLibraryImpl
	 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getSchoolLibrary()
	 * @generated
	 */
	int SCHOOL_LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_LIBRARY__NAME = LibraryPackage.LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_LIBRARY__WRITERS = LibraryPackage.LIBRARY__WRITERS;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_LIBRARY__BOOKS = LibraryPackage.LIBRARY__BOOKS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_LIBRARY__LOCATION = LibraryPackage.LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>School Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_LIBRARY_FEATURE_COUNT = LibraryPackage.LIBRARY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.example.schoollibrary.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.eclipse.example.schoollibrary.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.example.schoollibrary.Asset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.example.schoollibrary.Asset#getValue()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.example.schoollibrary.SchoolBook <em>School Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School Book</em>'.
	 * @see org.eclipse.example.schoollibrary.SchoolBook
	 * @generated
	 */
	EClass getSchoolBook();

	/**
	 * Returns the meta object for class '{@link org.eclipse.example.schoollibrary.SchoolLibrary <em>School Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School Library</em>'.
	 * @see org.eclipse.example.schoollibrary.SchoolLibrary
	 * @generated
	 */
	EClass getSchoolLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.example.schoollibrary.SchoolLibrary#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.example.schoollibrary.SchoolLibrary#getLocation()
	 * @see #getSchoolLibrary()
	 * @generated
	 */
	EAttribute getSchoolLibrary_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoollibraryFactory getSchoollibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.example.schoollibrary.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.example.schoollibrary.impl.AssetImpl
		 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VALUE = eINSTANCE.getAsset_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.example.schoollibrary.impl.SchoolBookImpl <em>School Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.example.schoollibrary.impl.SchoolBookImpl
		 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getSchoolBook()
		 * @generated
		 */
		EClass SCHOOL_BOOK = eINSTANCE.getSchoolBook();

		/**
		 * The meta object literal for the '{@link org.eclipse.example.schoollibrary.impl.SchoolLibraryImpl <em>School Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.example.schoollibrary.impl.SchoolLibraryImpl
		 * @see org.eclipse.example.schoollibrary.impl.SchoollibraryPackageImpl#getSchoolLibrary()
		 * @generated
		 */
		EClass SCHOOL_LIBRARY = eINSTANCE.getSchoolLibrary();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL_LIBRARY__LOCATION = eINSTANCE.getSchoolLibrary_Location();

	}

} //SchoollibraryPackage
