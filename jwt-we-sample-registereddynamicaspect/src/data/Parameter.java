/**
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.data.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject, PackageableElement {
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(String)
    * @see data.DataPackage#getParameter_Value()
    * @model
    * @generated
    */
   String getValue();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.Parameter#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(String value);

} // Parameter
