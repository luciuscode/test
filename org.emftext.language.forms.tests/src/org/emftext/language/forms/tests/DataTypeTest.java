/**
 */
package org.emftext.language.forms.tests;

import junit.textui.TestRunner;

import org.emftext.language.forms.DataType;
import org.emftext.language.forms.FormsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeTest extends TypeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DataTypeTest.class);
  }

  /**
   * Constructs a new Data Type test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Data Type test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected DataType getFixture()
  {
    return (DataType)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(FormsFactory.eINSTANCE.createDataType());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //DataTypeTest
