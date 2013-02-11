/**
 */
package data;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getParameterMapping()
 * @model
 * @generated
 */
public interface ParameterMapping extends EObject, PackageableElement {
   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(PackageableElement)
    * @see data.DataPackage#getParameterMapping_Source()
    * @model required="true"
    * @generated
    */
   PackageableElement getSource();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource(PackageableElement value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(PackageableElement)
    * @see data.DataPackage#getParameterMapping_Target()
    * @model required="true"
    * @generated
    */
   PackageableElement getTarget();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.data.ParameterMapping#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(PackageableElement value);

} // ParameterMapping
