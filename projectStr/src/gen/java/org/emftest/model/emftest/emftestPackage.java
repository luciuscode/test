/**
 */
package org.emftest.model.emftest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emftest.model.emftest.emftestFactory
 * @model kind="package"
 * @generated
 */
public interface emftestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emftest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tudresden.de/emftest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emftest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	emftestPackage eINSTANCE = org.emftest.model.emftest.impl.emftestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.Book <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.Book
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PAGES = 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHORS = 2;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.impl.ChildBookImpl <em>Child Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.impl.ChildBookImpl
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getChildBook()
	 * @generated
	 */
	int CHILD_BOOK = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_BOOK__TITLE = BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_BOOK__PAGES = BOOK__PAGES;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_BOOK__AUTHORS = BOOK__AUTHORS;

	/**
	 * The number of structural features of the '<em>Child Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_BOOK_FEATURE_COUNT = BOOK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.impl.ParentBookImpl <em>Parent Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.impl.ParentBookImpl
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getParentBook()
	 * @generated
	 */
	int PARENT_BOOK = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_BOOK__TITLE = BOOK__TITLE;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_BOOK__PAGES = BOOK__PAGES;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_BOOK__AUTHORS = BOOK__AUTHORS;

	/**
	 * The number of structural features of the '<em>Parent Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_BOOK_FEATURE_COUNT = BOOK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.impl.BookCollectionImpl <em>Book Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.impl.BookCollectionImpl
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBookCollection()
	 * @generated
	 */
	int BOOK_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_COLLECTION__BOOKS = 0;

	/**
	 * The number of structural features of the '<em>Book Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.impl.LibraryImpl
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COLLECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.impl.AuthorImpl
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__BOOKS = 1;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.emftest.model.emftest.BookType <em>Book Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftest.model.emftest.BookType
	 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.emftest.model.emftest.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link org.emftest.model.emftest.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.emftest.model.emftest.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.emftest.model.emftest.Book#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.emftest.model.emftest.Book#getPages()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Pages();

	/**
	 * Returns the meta object for the reference list '{@link org.emftest.model.emftest.Book#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authors</em>'.
	 * @see org.emftest.model.emftest.Book#getAuthors()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Authors();

	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.ChildBook <em>Child Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Book</em>'.
	 * @see org.emftest.model.emftest.ChildBook
	 * @generated
	 */
	EClass getChildBook();

	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.ParentBook <em>Parent Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Book</em>'.
	 * @see org.emftest.model.emftest.ParentBook
	 * @generated
	 */
	EClass getParentBook();

	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.BookCollection <em>Book Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Collection</em>'.
	 * @see org.emftest.model.emftest.BookCollection
	 * @generated
	 */
	EClass getBookCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftest.model.emftest.BookCollection#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see org.emftest.model.emftest.BookCollection#getBooks()
	 * @see #getBookCollection()
	 * @generated
	 */
	EReference getBookCollection_Books();

	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.emftest.model.emftest.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftest.model.emftest.Library#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see org.emftest.model.emftest.Library#getCollections()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Collections();

	/**
	 * Returns the meta object for class '{@link org.emftest.model.emftest.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.emftest.model.emftest.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.emftest.model.emftest.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftest.model.emftest.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.emftest.model.emftest.Author#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books</em>'.
	 * @see org.emftest.model.emftest.Author#getBooks()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_Books();

	/**
	 * Returns the meta object for enum '{@link org.emftest.model.emftest.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Book Type</em>'.
	 * @see org.emftest.model.emftest.BookType
	 * @generated
	 */
	EEnum getBookType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	emftestFactory getemftestFactory();

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
		 * The meta object literal for the '{@link org.emftest.model.emftest.Book <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.Book
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__AUTHORS = eINSTANCE.getBook_Authors();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.impl.ChildBookImpl <em>Child Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.impl.ChildBookImpl
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getChildBook()
		 * @generated
		 */
		EClass CHILD_BOOK = eINSTANCE.getChildBook();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.impl.ParentBookImpl <em>Parent Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.impl.ParentBookImpl
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getParentBook()
		 * @generated
		 */
		EClass PARENT_BOOK = eINSTANCE.getParentBook();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.impl.BookCollectionImpl <em>Book Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.impl.BookCollectionImpl
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBookCollection()
		 * @generated
		 */
		EClass BOOK_COLLECTION = eINSTANCE.getBookCollection();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_COLLECTION__BOOKS = eINSTANCE.getBookCollection_Books();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.impl.LibraryImpl
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__COLLECTIONS = eINSTANCE.getLibrary_Collections();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.impl.AuthorImpl
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR__BOOKS = eINSTANCE.getAuthor_Books();

		/**
		 * The meta object literal for the '{@link org.emftest.model.emftest.BookType <em>Book Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftest.model.emftest.BookType
		 * @see org.emftest.model.emftest.impl.emftestPackageImpl#getBookType()
		 * @generated
		 */
		EEnum BOOK_TYPE = eINSTANCE.getBookType();

	}

} //emftestPackage
