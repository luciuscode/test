/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.application.Application;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getWebServiceApplication()
 * @model
 * @generated
 */
public interface WebServiceApplication extends EObject, Application {
   /**
    * Returns the value of the '<em><b>Interface</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interface</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Interface</em>' attribute.
    * @see #setInterface(String)
    * @see application.ApplicationPackage#getWebServiceApplication_Interface()
    * @model
    * @generated
    */
   String getInterface();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getInterface <em>Interface</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Interface</em>' attribute.
    * @see #getInterface()
    * @generated
    */
   void setInterface(String value);

   /**
    * Returns the value of the '<em><b>Operation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Operation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Operation</em>' attribute.
    * @see #setOperation(String)
    * @see application.ApplicationPackage#getWebServiceApplication_Operation()
    * @model
    * @generated
    */
   String getOperation();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.application.WebServiceApplication#getOperation <em>Operation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Operation</em>' attribute.
    * @see #getOperation()
    * @generated
    */
   void setOperation(String value);

} // WebServiceApplication
