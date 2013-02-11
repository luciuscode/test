/**
 */
package core.util;

import core.CorePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jwt.meta.model.core.Comment;
import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.Model;
import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static CorePackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CoreSwitch() {
      if (modelPackage == null) {
         modelPackage = CorePackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case CorePackage.MODEL_ELEMENT: {
            ModelElement modelElement = (ModelElement)theEObject;
            T result = caseModelElement(modelElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.COMMENT: {
            Comment comment = (Comment)theEObject;
            T result = caseComment(comment);
            if (result == null) result = caseGraphicalElement(comment);
            if (result == null) result = caseModelElement(comment);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.NAMED_ELEMENT: {
            NamedElement namedElement = (NamedElement)theEObject;
            T result = caseNamedElement(namedElement);
            if (result == null) result = caseModelElement(namedElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.PACKAGE: {
            org.eclipse.jwt.meta.model.core.Package package_ = (org.eclipse.jwt.meta.model.core.Package)theEObject;
            T result = casePackage(package_);
            if (result == null) result = caseNamedElement(package_);
            if (result == null) result = caseModelElement(package_);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.PACKAGEABLE_ELEMENT: {
            PackageableElement packageableElement = (PackageableElement)theEObject;
            T result = casePackageableElement(packageableElement);
            if (result == null) result = caseNamedElement(packageableElement);
            if (result == null) result = caseModelElement(packageableElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.REFERENCEABLE_ELEMENT: {
            ReferenceableElement referenceableElement = (ReferenceableElement)theEObject;
            T result = caseReferenceableElement(referenceableElement);
            if (result == null) result = casePackageableElement(referenceableElement);
            if (result == null) result = caseNamedElement(referenceableElement);
            if (result == null) result = caseModelElement(referenceableElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.MODEL: {
            Model model = (Model)theEObject;
            T result = caseModel(model);
            if (result == null) result = casePackage(model);
            if (result == null) result = caseNamedElement(model);
            if (result == null) result = caseModelElement(model);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CorePackage.GRAPHICAL_ELEMENT: {
            GraphicalElement graphicalElement = (GraphicalElement)theEObject;
            T result = caseGraphicalElement(graphicalElement);
            if (result == null) result = caseModelElement(graphicalElement);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModelElement(ModelElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComment(Comment object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNamedElement(NamedElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Package</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackage(org.eclipse.jwt.meta.model.core.Package object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackageableElement(PackageableElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseReferenceableElement(ReferenceableElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModel(Model object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGraphicalElement(GraphicalElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //CoreSwitch
