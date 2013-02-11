/**
 */
package core;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jwt.meta.model.core.Comment;
import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.Model;
import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   CoreFactory eINSTANCE = core.impl.CoreFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Model Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Model Element</em>'.
    * @generated
    */
   ModelElement createModelElement();

   /**
    * Returns a new object of class '<em>Comment</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Comment</em>'.
    * @generated
    */
   Comment createComment();

   /**
    * Returns a new object of class '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Named Element</em>'.
    * @generated
    */
   NamedElement createNamedElement();

   /**
    * Returns a new object of class '<em>Package</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Package</em>'.
    * @generated
    */
   org.eclipse.jwt.meta.model.core.Package createPackage();

   /**
    * Returns a new object of class '<em>Packageable Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Packageable Element</em>'.
    * @generated
    */
   PackageableElement createPackageableElement();

   /**
    * Returns a new object of class '<em>Referenceable Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Referenceable Element</em>'.
    * @generated
    */
   ReferenceableElement createReferenceableElement();

   /**
    * Returns a new object of class '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Model</em>'.
    * @generated
    */
   Model createModel();

   /**
    * Returns a new object of class '<em>Graphical Element</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Graphical Element</em>'.
    * @generated
    */
   GraphicalElement createGraphicalElement();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   CorePackage getCorePackage();

} //CoreFactory
