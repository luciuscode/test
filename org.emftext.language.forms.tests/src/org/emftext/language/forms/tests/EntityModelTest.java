/**
 */
package org.emftext.language.forms.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.emftext.language.forms.EntityModel;
import org.emftext.language.forms.FormsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityModelTest extends TestCase
{

  /**
   * The fixture for this Entity Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityModel fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EntityModelTest.class);
  }

  /**
   * Constructs a new Entity Model test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityModelTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Entity Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(EntityModel fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Entity Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityModel getFixture()
  {
    return fixture;
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
    setFixture(FormsFactory.eINSTANCE.createEntityModel());
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

} //EntityModelTest
