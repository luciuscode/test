/**
 */
package core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "core";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "org.eclipse.jwt/core";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "core";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   CorePackage eINSTANCE = core.impl.CorePackageImpl.init();

   /**
    * The meta object id for the '{@link core.impl.ModelElementImpl <em>Model Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.ModelElementImpl
    * @see core.impl.CorePackageImpl#getModelElement()
    * @generated
    */
   int MODEL_ELEMENT = 0;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL_ELEMENT__OWNED_COMMENT = 0;

   /**
    * The number of structural features of the '<em>Model Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL_ELEMENT_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link core.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.GraphicalElementImpl
    * @see core.impl.CorePackageImpl#getGraphicalElement()
    * @generated
    */
   int GRAPHICAL_ELEMENT = 7;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GRAPHICAL_ELEMENT__OWNED_COMMENT = MODEL_ELEMENT__OWNED_COMMENT;

   /**
    * The number of structural features of the '<em>Graphical Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GRAPHICAL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link core.impl.CommentImpl <em>Comment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.CommentImpl
    * @see core.impl.CorePackageImpl#getComment()
    * @generated
    */
   int COMMENT = 1;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENT__OWNED_COMMENT = GRAPHICAL_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Text</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENT__TEXT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Comment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMMENT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link core.impl.NamedElementImpl <em>Named Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.NamedElementImpl
    * @see core.impl.CorePackageImpl#getNamedElement()
    * @generated
    */
   int NAMED_ELEMENT = 2;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__OWNED_COMMENT = MODEL_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT__ICON = MODEL_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Named Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link core.impl.PackageImpl <em>Package</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.PackageImpl
    * @see core.impl.CorePackageImpl#getPackage()
    * @generated
    */
   int PACKAGE = 3;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__ICON = NAMED_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__SUBPACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Superpackage</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__SUPERPACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Elements</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Package</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link core.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.PackageableElementImpl
    * @see core.impl.CorePackageImpl#getPackageableElement()
    * @generated
    */
   int PACKAGEABLE_ELEMENT = 4;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGEABLE_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGEABLE_ELEMENT__ICON = NAMED_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGEABLE_ELEMENT__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Packageable Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link core.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.ReferenceableElementImpl
    * @see core.impl.CorePackageImpl#getReferenceableElement()
    * @generated
    */
   int REFERENCEABLE_ELEMENT = 5;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REFERENCEABLE_ELEMENT__OWNED_COMMENT = PACKAGEABLE_ELEMENT__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REFERENCEABLE_ELEMENT__NAME = PACKAGEABLE_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REFERENCEABLE_ELEMENT__ICON = PACKAGEABLE_ELEMENT__ICON;

   /**
    * The feature id for the '<em><b>Package</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REFERENCEABLE_ELEMENT__PACKAGE = PACKAGEABLE_ELEMENT__PACKAGE;

   /**
    * The number of structural features of the '<em>Referenceable Element</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REFERENCEABLE_ELEMENT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link core.impl.ModelImpl <em>Model</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see core.impl.ModelImpl
    * @see core.impl.CorePackageImpl#getModel()
    * @generated
    */
   int MODEL = 6;

   /**
    * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__OWNED_COMMENT = PACKAGE__OWNED_COMMENT;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__NAME = PACKAGE__NAME;

   /**
    * The feature id for the '<em><b>Icon</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__ICON = PACKAGE__ICON;

   /**
    * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__SUBPACKAGES = PACKAGE__SUBPACKAGES;

   /**
    * The feature id for the '<em><b>Superpackage</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__SUPERPACKAGE = PACKAGE__SUPERPACKAGE;

   /**
    * The feature id for the '<em><b>Elements</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__ELEMENTS = PACKAGE__ELEMENTS;

   /**
    * The feature id for the '<em><b>Author</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__AUTHOR = PACKAGE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__VERSION = PACKAGE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__DESCRIPTION = PACKAGE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Fileversion</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL__FILEVERSION = PACKAGE_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Model</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODEL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 4;


   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.ModelElement <em>Model Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Model Element</em>'.
    * @see org.eclipse.jwt.meta.model.core.ModelElement
    * @generated
    */
   EClass getModelElement();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.core.ModelElement#getOwnedComment <em>Owned Comment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
    * @see org.eclipse.jwt.meta.model.core.ModelElement#getOwnedComment()
    * @see #getModelElement()
    * @generated
    */
   EReference getModelElement_OwnedComment();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.Comment <em>Comment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Comment</em>'.
    * @see org.eclipse.jwt.meta.model.core.Comment
    * @generated
    */
   EClass getComment();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.Comment#getText <em>Text</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Text</em>'.
    * @see org.eclipse.jwt.meta.model.core.Comment#getText()
    * @see #getComment()
    * @generated
    */
   EAttribute getComment_Text();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Named Element</em>'.
    * @see org.eclipse.jwt.meta.model.core.NamedElement
    * @generated
    */
   EClass getNamedElement();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.NamedElement#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.eclipse.jwt.meta.model.core.NamedElement#getName()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Name();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.NamedElement#getIcon <em>Icon</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Icon</em>'.
    * @see org.eclipse.jwt.meta.model.core.NamedElement#getIcon()
    * @see #getNamedElement()
    * @generated
    */
   EAttribute getNamedElement_Icon();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.Package <em>Package</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Package</em>'.
    * @see org.eclipse.jwt.meta.model.core.Package
    * @generated
    */
   EClass getPackage();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.core.Package#getSubpackages <em>Subpackages</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Subpackages</em>'.
    * @see org.eclipse.jwt.meta.model.core.Package#getSubpackages()
    * @see #getPackage()
    * @generated
    */
   EReference getPackage_Subpackages();

   /**
    * Returns the meta object for the container reference '{@link org.eclipse.jwt.meta.model.core.Package#getSuperpackage <em>Superpackage</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Superpackage</em>'.
    * @see org.eclipse.jwt.meta.model.core.Package#getSuperpackage()
    * @see #getPackage()
    * @generated
    */
   EReference getPackage_Superpackage();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.jwt.meta.model.core.Package#getElements <em>Elements</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Elements</em>'.
    * @see org.eclipse.jwt.meta.model.core.Package#getElements()
    * @see #getPackage()
    * @generated
    */
   EReference getPackage_Elements();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.PackageableElement <em>Packageable Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Packageable Element</em>'.
    * @see org.eclipse.jwt.meta.model.core.PackageableElement
    * @generated
    */
   EClass getPackageableElement();

   /**
    * Returns the meta object for the container reference '{@link org.eclipse.jwt.meta.model.core.PackageableElement#getPackage <em>Package</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Package</em>'.
    * @see org.eclipse.jwt.meta.model.core.PackageableElement#getPackage()
    * @see #getPackageableElement()
    * @generated
    */
   EReference getPackageableElement_Package();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.ReferenceableElement <em>Referenceable Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Referenceable Element</em>'.
    * @see org.eclipse.jwt.meta.model.core.ReferenceableElement
    * @generated
    */
   EClass getReferenceableElement();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.Model <em>Model</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Model</em>'.
    * @see org.eclipse.jwt.meta.model.core.Model
    * @generated
    */
   EClass getModel();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.Model#getAuthor <em>Author</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Author</em>'.
    * @see org.eclipse.jwt.meta.model.core.Model#getAuthor()
    * @see #getModel()
    * @generated
    */
   EAttribute getModel_Author();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.Model#getVersion <em>Version</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Version</em>'.
    * @see org.eclipse.jwt.meta.model.core.Model#getVersion()
    * @see #getModel()
    * @generated
    */
   EAttribute getModel_Version();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.Model#getDescription <em>Description</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Description</em>'.
    * @see org.eclipse.jwt.meta.model.core.Model#getDescription()
    * @see #getModel()
    * @generated
    */
   EAttribute getModel_Description();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.meta.model.core.Model#getFileversion <em>Fileversion</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Fileversion</em>'.
    * @see org.eclipse.jwt.meta.model.core.Model#getFileversion()
    * @see #getModel()
    * @generated
    */
   EAttribute getModel_Fileversion();

   /**
    * Returns the meta object for class '{@link org.eclipse.jwt.meta.model.core.GraphicalElement <em>Graphical Element</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Graphical Element</em>'.
    * @see org.eclipse.jwt.meta.model.core.GraphicalElement
    * @generated
    */
   EClass getGraphicalElement();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   CoreFactory getCoreFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link core.impl.ModelElementImpl <em>Model Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.ModelElementImpl
       * @see core.impl.CorePackageImpl#getModelElement()
       * @generated
       */
      EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

      /**
       * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MODEL_ELEMENT__OWNED_COMMENT = eINSTANCE.getModelElement_OwnedComment();

      /**
       * The meta object literal for the '{@link core.impl.CommentImpl <em>Comment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.CommentImpl
       * @see core.impl.CorePackageImpl#getComment()
       * @generated
       */
      EClass COMMENT = eINSTANCE.getComment();

      /**
       * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

      /**
       * The meta object literal for the '{@link core.impl.NamedElementImpl <em>Named Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.NamedElementImpl
       * @see core.impl.CorePackageImpl#getNamedElement()
       * @generated
       */
      EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

      /**
       * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NAMED_ELEMENT__ICON = eINSTANCE.getNamedElement_Icon();

      /**
       * The meta object literal for the '{@link core.impl.PackageImpl <em>Package</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.PackageImpl
       * @see core.impl.CorePackageImpl#getPackage()
       * @generated
       */
      EClass PACKAGE = eINSTANCE.getPackage();

      /**
       * The meta object literal for the '<em><b>Subpackages</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PACKAGE__SUBPACKAGES = eINSTANCE.getPackage_Subpackages();

      /**
       * The meta object literal for the '<em><b>Superpackage</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PACKAGE__SUPERPACKAGE = eINSTANCE.getPackage_Superpackage();

      /**
       * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

      /**
       * The meta object literal for the '{@link core.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.PackageableElementImpl
       * @see core.impl.CorePackageImpl#getPackageableElement()
       * @generated
       */
      EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

      /**
       * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PACKAGEABLE_ELEMENT__PACKAGE = eINSTANCE.getPackageableElement_Package();

      /**
       * The meta object literal for the '{@link core.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.ReferenceableElementImpl
       * @see core.impl.CorePackageImpl#getReferenceableElement()
       * @generated
       */
      EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

      /**
       * The meta object literal for the '{@link core.impl.ModelImpl <em>Model</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.ModelImpl
       * @see core.impl.CorePackageImpl#getModel()
       * @generated
       */
      EClass MODEL = eINSTANCE.getModel();

      /**
       * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute MODEL__AUTHOR = eINSTANCE.getModel_Author();

      /**
       * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

      /**
       * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

      /**
       * The meta object literal for the '<em><b>Fileversion</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute MODEL__FILEVERSION = eINSTANCE.getModel_Fileversion();

      /**
       * The meta object literal for the '{@link core.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see core.impl.GraphicalElementImpl
       * @see core.impl.CorePackageImpl#getGraphicalElement()
       * @generated
       */
      EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

   }

} //CorePackage
