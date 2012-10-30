/**
 */
package org.emftest.model.emftest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftest.model.emftest.Author;
import org.emftest.model.emftest.Book;
import org.emftest.model.emftest.BookType;
import org.emftest.model.emftest.emftestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Author</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftest.model.emftest.impl.AuthorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftest.model.emftest.impl.AuthorImpl#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorImpl extends EObjectImpl implements Author {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return emftestPackage.Literals.AUTHOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, emftestPackage.AUTHOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectResolvingEList<Book>(Book.class, this, emftestPackage.AUTHOR__BOOKS);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Book writeBookGen(String title, int pages, BookType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public Book writeBook(String title, int pages, BookType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Book book;

		if (type.getValue() == 1) {
			book = new emftestFactoryImpl().createChildBook();
		} else {
			book = new emftestFactoryImpl().createParentBook();
		}
		book.setPages(pages);
		book.setTitle(name);
		this.books.add(book);

		return book;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case emftestPackage.AUTHOR__NAME:
				return getName();
			case emftestPackage.AUTHOR__BOOKS:
				return getBooks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case emftestPackage.AUTHOR__NAME:
				setName((String)newValue);
				return;
			case emftestPackage.AUTHOR__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case emftestPackage.AUTHOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case emftestPackage.AUTHOR__BOOKS:
				getBooks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case emftestPackage.AUTHOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case emftestPackage.AUTHOR__BOOKS:
				return books != null && !books.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // AuthorImpl
