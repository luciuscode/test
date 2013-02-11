/**
 */
package core.impl;

import core.CoreFactory;
import core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jwt.meta.model.core.Comment;
import org.eclipse.jwt.meta.model.core.GraphicalElement;
import org.eclipse.jwt.meta.model.core.Model;
import org.eclipse.jwt.meta.model.core.ModelElement;
import org.eclipse.jwt.meta.model.core.NamedElement;
import org.eclipse.jwt.meta.model.core.PackageableElement;
import org.eclipse.jwt.meta.model.core.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static CoreFactory init() {
      try {
         CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt/core"); 
         if (theCoreFactory != null) {
            return theCoreFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new CoreFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CoreFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case CorePackage.MODEL_ELEMENT: return createModelElement();
         case CorePackage.COMMENT: return createComment();
         case CorePackage.NAMED_ELEMENT: return createNamedElement();
         case CorePackage.PACKAGE: return createPackage();
         case CorePackage.PACKAGEABLE_ELEMENT: return createPackageableElement();
         case CorePackage.REFERENCEABLE_ELEMENT: return createReferenceableElement();
         case CorePackage.MODEL: return createModel();
         case CorePackage.GRAPHICAL_ELEMENT: return createGraphicalElement();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ModelElement createModelElement() {
      ModelElementImpl modelElement = new ModelElementImpl();
      return modelElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Comment createComment() {
      CommentImpl comment = new CommentImpl();
      return comment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NamedElement createNamedElement() {
      NamedElementImpl namedElement = new NamedElementImpl();
      return namedElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public org.eclipse.jwt.meta.model.core.Package createPackage() {
      PackageImpl package_ = new PackageImpl();
      return package_;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PackageableElement createPackageableElement() {
      PackageableElementImpl packageableElement = new PackageableElementImpl();
      return packageableElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ReferenceableElement createReferenceableElement() {
      ReferenceableElementImpl referenceableElement = new ReferenceableElementImpl();
      return referenceableElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Model createModel() {
      ModelImpl model = new ModelImpl();
      return model;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GraphicalElement createGraphicalElement() {
      GraphicalElementImpl graphicalElement = new GraphicalElementImpl();
      return graphicalElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CorePackage getCorePackage() {
      return (CorePackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static CorePackage getPackage() {
      return CorePackage.eINSTANCE;
   }

} //CoreFactoryImpl
