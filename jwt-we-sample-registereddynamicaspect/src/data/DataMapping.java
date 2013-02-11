/**
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

import org.eclipse.jwt.meta.model.data.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.data.DataMapping#getBoundParameter <em>Bound Parameter</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.data.DataMapping#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getDataMapping()
 * @model
 * @generated
 */
public interface DataMapping extends EObject, PackageableElement {
   /**
    * Returns the value of the '<em><b>Bound Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Bound Parameter</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Bound Parameter</em>' reference.
    * @see #setBoundParameter(Parameter)
    * @see data.DataPackage#getDataMapping_BoundParameter()
    * @model required="true"
    * @generated
    */
   Parameter getBoundParameter();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.DataMapping#getBoundParameter <em>Bound Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Bound Parameter</em>' reference.
    * @see #getBoundParameter()
    * @generated
    */
   void setBoundParameter(Parameter value);

   /**
    * Returns the value of the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameter</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameter</em>' reference.
    * @see #setParameter(Parameter)
    * @see data.DataPackage#getDataMapping_Parameter()
    * @model required="true"
    * @generated
    */
   Parameter getParameter();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.DataMapping#getParameter <em>Parameter</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parameter</em>' reference.
    * @see #getParameter()
    * @generated
    */
   void setParameter(Parameter value);

} // DataMapping
