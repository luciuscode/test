/**
 */
package core.impl;

import core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jwt.meta.model.core.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.ModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link core.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link core.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.ModelImpl#getFileversion <em>Fileversion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends PackageImpl implements Model {
   /**
    * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAuthor()
    * @generated
    * @ordered
    */
   protected static final String AUTHOR_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAuthor()
    * @generated
    * @ordered
    */
   protected String author = AUTHOR_EDEFAULT;

   /**
    * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVersion()
    * @generated
    * @ordered
    */
   protected static final String VERSION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVersion()
    * @generated
    * @ordered
    */
   protected String version = VERSION_EDEFAULT;

   /**
    * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescription()
    * @generated
    * @ordered
    */
   protected static final String DESCRIPTION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDescription()
    * @generated
    * @ordered
    */
   protected String description = DESCRIPTION_EDEFAULT;

   /**
    * The default value of the '{@link #getFileversion() <em>Fileversion</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFileversion()
    * @generated
    * @ordered
    */
   protected static final String FILEVERSION_EDEFAULT = "";

   /**
    * The cached value of the '{@link #getFileversion() <em>Fileversion</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFileversion()
    * @generated
    * @ordered
    */
   protected String fileversion = FILEVERSION_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ModelImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return CorePackage.Literals.MODEL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getAuthor() {
      return author;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAuthor(String newAuthor) {
      String oldAuthor = author;
      author = newAuthor;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL__AUTHOR, oldAuthor, author));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getVersion() {
      return version;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setVersion(String newVersion) {
      String oldVersion = version;
      version = newVersion;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL__VERSION, oldVersion, version));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getDescription() {
      return description;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDescription(String newDescription) {
      String oldDescription = description;
      description = newDescription;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL__DESCRIPTION, oldDescription, description));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getFileversion() {
      return fileversion;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setFileversion(String newFileversion) {
      String oldFileversion = fileversion;
      fileversion = newFileversion;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL__FILEVERSION, oldFileversion, fileversion));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case CorePackage.MODEL__AUTHOR:
            return getAuthor();
         case CorePackage.MODEL__VERSION:
            return getVersion();
         case CorePackage.MODEL__DESCRIPTION:
            return getDescription();
         case CorePackage.MODEL__FILEVERSION:
            return getFileversion();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case CorePackage.MODEL__AUTHOR:
            setAuthor((String)newValue);
            return;
         case CorePackage.MODEL__VERSION:
            setVersion((String)newValue);
            return;
         case CorePackage.MODEL__DESCRIPTION:
            setDescription((String)newValue);
            return;
         case CorePackage.MODEL__FILEVERSION:
            setFileversion((String)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case CorePackage.MODEL__AUTHOR:
            setAuthor(AUTHOR_EDEFAULT);
            return;
         case CorePackage.MODEL__VERSION:
            setVersion(VERSION_EDEFAULT);
            return;
         case CorePackage.MODEL__DESCRIPTION:
            setDescription(DESCRIPTION_EDEFAULT);
            return;
         case CorePackage.MODEL__FILEVERSION:
            setFileversion(FILEVERSION_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case CorePackage.MODEL__AUTHOR:
            return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
         case CorePackage.MODEL__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
         case CorePackage.MODEL__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
         case CorePackage.MODEL__FILEVERSION:
            return FILEVERSION_EDEFAULT == null ? fileversion != null : !FILEVERSION_EDEFAULT.equals(fileversion);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (author: ");
      result.append(author);
      result.append(", version: ");
      result.append(version);
      result.append(", description: ");
      result.append(description);
      result.append(", fileversion: ");
      result.append(fileversion);
      result.append(')');
      return result.toString();
   }

} //ModelImpl
