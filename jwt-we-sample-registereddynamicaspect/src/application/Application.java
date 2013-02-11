/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.application.ApplicationType;

import org.eclipse.jwt.meta.model.core.ReferenceableElement;

import org.eclipse.jwt.meta.model.data.InputParameter;
import org.eclipse.jwt.meta.model.data.OutputParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getJarArchive <em>Jar Archive</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.Application#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject, ReferenceableElement {
   /**
    * Returns the value of the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' reference.
    * @see #setType(ApplicationType)
    * @see application.ApplicationPackage#getApplication_Type()
    * @model
    * @generated
    */
   ApplicationType getType();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.Application#getType <em>Type</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' reference.
    * @see #getType()
    * @generated
    */
   void setType(ApplicationType value);

   /**
    * Returns the value of the '<em><b>Jar Archive</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Jar Archive</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Jar Archive</em>' attribute.
    * @see #setJarArchive(String)
    * @see application.ApplicationPackage#getApplication_JarArchive()
    * @model
    * @generated
    */
   String getJarArchive();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.Application#getJarArchive <em>Jar Archive</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Jar Archive</em>' attribute.
    * @see #getJarArchive()
    * @generated
    */
   void setJarArchive(String value);

   /**
    * Returns the value of the '<em><b>Java Class</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Java Class</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Java Class</em>' attribute.
    * @see #setJavaClass(String)
    * @see application.ApplicationPackage#getApplication_JavaClass()
    * @model
    * @generated
    */
   String getJavaClass();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.Application#getJavaClass <em>Java Class</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Java Class</em>' attribute.
    * @see #getJavaClass()
    * @generated
    */
   void setJavaClass(String value);

   /**
    * Returns the value of the '<em><b>Method</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Method</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Method</em>' attribute.
    * @see #setMethod(String)
    * @see application.ApplicationPackage#getApplication_Method()
    * @model
    * @generated
    */
   String getMethod();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.Application#getMethod <em>Method</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Method</em>' attribute.
    * @see #getMethod()
    * @generated
    */
   void setMethod(String value);

   /**
    * Returns the value of the '<em><b>Input</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.InputParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Input</em>' containment reference list.
    * @see application.ApplicationPackage#getApplication_Input()
    * @model containment="true"
    * @generated
    */
   EList<InputParameter> getInput();

   /**
    * Returns the value of the '<em><b>Output</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.data.OutputParameter}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Output</em>' containment reference list.
    * @see application.ApplicationPackage#getApplication_Output()
    * @model containment="true"
    * @generated
    */
   EList<OutputParameter> getOutput();

} // Application
