/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.core.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.NamedElement#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject, ModelElement {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see core.CorePackage#getNamedElement_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.NamedElement#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Icon</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Icon</em>' attribute.
    * @see #setIcon(String)
    * @see core.CorePackage#getNamedElement_Icon()
    * @model
    * @generated
    */
   String getIcon();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.NamedElement#getIcon <em>Icon</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Icon</em>' attribute.
    * @see #getIcon()
    * @generated
    */
   void setIcon(String value);

} // NamedElement
