/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Package#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Package#getSuperpackage <em>Superpackage</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Package#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject, NamedElement {
   /**
    * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.core.Package}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.core.Package#getSuperpackage <em>Superpackage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Subpackages</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Subpackages</em>' containment reference list.
    * @see core.CorePackage#getPackage_Subpackages()
    * @see org.eclipse.jwt.meta.model.core.Package#getSuperpackage
    * @model opposite="superpackage" containment="true"
    * @generated
    */
   EList<org.eclipse.jwt.meta.model.core.Package> getSubpackages();

   /**
    * Returns the value of the '<em><b>Superpackage</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.core.Package#getSubpackages <em>Subpackages</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Superpackage</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Superpackage</em>' container reference.
    * @see #setSuperpackage(org.eclipse.jwt.meta.model.core.Package)
    * @see core.CorePackage#getPackage_Superpackage()
    * @see org.eclipse.jwt.meta.model.core.Package#getSubpackages
    * @model opposite="subpackages" resolveProxies="false" transient="false"
    * @generated
    */
   org.eclipse.jwt.meta.model.core.Package getSuperpackage();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.Package#getSuperpackage <em>Superpackage</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Superpackage</em>' container reference.
    * @see #getSuperpackage()
    * @generated
    */
   void setSuperpackage(org.eclipse.jwt.meta.model.core.Package value);

   /**
    * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.meta.model.core.PackageableElement}.
    * It is bidirectional and its opposite is '{@link org.eclipse.jwt.meta.model.core.PackageableElement#getPackage <em>Package</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Elements</em>' containment reference list.
    * @see core.CorePackage#getPackage_Elements()
    * @see org.eclipse.jwt.meta.model.core.PackageableElement#getPackage
    * @model opposite="package" containment="true"
    * @generated
    */
   EList<PackageableElement> getElements();

} // Package
