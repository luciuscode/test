/**
 */
package org.emftest.model.schoollibrary.tests;

import junit.textui.TestRunner;

import org.emftest.model.library.tests.BookTest;

import org.emftest.model.schoollibrary.SchoolBook;
import org.emftest.model.schoollibrary.SchoollibraryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>School Book</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoolBookTest extends BookTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchoolBookTest.class);
	}

	/**
	 * Constructs a new School Book test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolBookTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this School Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SchoolBook getFixture() {
		return (SchoolBook)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchoollibraryFactory.eINSTANCE.createSchoolBook());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SchoolBookTest
