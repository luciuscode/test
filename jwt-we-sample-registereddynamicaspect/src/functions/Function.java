/**
 */
package functions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.functions.Function#getSubfunctions <em>Subfunctions</em>}</li>
 * </ul>
 * </p>
 *
 * @see functions.FunctionsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject, PackageableElement {
   /**
    * Returns the value of the '<em><b>Subfunctions</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.functions.Function}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Subfunctions</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Subfunctions</em>' containment reference list.
    * @see functions.FunctionsPackage#getFunction_Subfunctions()
    * @model containment="true"
    * @generated
    */
   EList<org.eclipse.jwt.meta.model.functions.Function> getSubfunctions();

} // Function
