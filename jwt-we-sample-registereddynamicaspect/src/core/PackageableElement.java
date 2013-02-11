/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.core.PackageableElement#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getPackageableElement()
 * @model
 * @generated
 */
public interface PackageableElement extends EObject, NamedElement {
   /**
    * Returns the value of the '<em><b>Package</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.core.Package#getElements <em>Elements</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Package</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Package</em>' container reference.
    * @see #setPackage(org.eclipse.jwt.meta.model.core.Package)
    * @see core.CorePackage#getPackageableElement_Package()
    * @see org.eclipse.jwt.meta.model.core.Package#getElements
    * @model opposite="elements" resolveProxies="false" transient="false"
    * @generated
    */
   org.eclipse.jwt.meta.model.core.Package getPackage();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.PackageableElement#getPackage <em>Package</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Package</em>' container reference.
    * @see #getPackage()
    * @generated
    */
   void setPackage(org.eclipse.jwt.meta.model.core.Package value);

} // PackageableElement
