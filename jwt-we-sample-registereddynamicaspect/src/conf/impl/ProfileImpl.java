/**
 */
package conf.impl;

import conf.ConfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jwt.we.conf.model.Aspect;
import org.eclipse.jwt.we.conf.model.Profile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conf.impl.ProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link conf.impl.ProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conf.impl.ProfileImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link conf.impl.ProfileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link conf.impl.ProfileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link conf.impl.ProfileImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends EObjectImpl implements Profile {
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = "com.yourcompany.yourprofile";

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

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
   protected static final String VERSION_EDEFAULT = "1.0";

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
    * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUrl()
    * @generated
    * @ordered
    */
   protected static final String URL_EDEFAULT = "http://www.eclipse.org/jwt/unknown_profile.html";

   /**
    * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUrl()
    * @generated
    * @ordered
    */
   protected String url = URL_EDEFAULT;

   /**
    * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAspects()
    * @generated
    * @ordered
    */
   protected EList<Aspect> aspects;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProfileImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ConfPackage.Literals.PROFILE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName(String newName) {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.PROFILE__NAME, oldName, name));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.PROFILE__DESCRIPTION, oldDescription, description));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.PROFILE__AUTHOR, oldAuthor, author));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.PROFILE__VERSION, oldVersion, version));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getUrl() {
      return url;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUrl(String newUrl) {
      String oldUrl = url;
      url = newUrl;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ConfPackage.PROFILE__URL, oldUrl, url));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Aspect> getAspects() {
      if (aspects == null) {
         aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, ConfPackage.PROFILE__ASPECTS);
      }
      return aspects;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case ConfPackage.PROFILE__ASPECTS:
            return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case ConfPackage.PROFILE__NAME:
            return getName();
         case ConfPackage.PROFILE__DESCRIPTION:
            return getDescription();
         case ConfPackage.PROFILE__AUTHOR:
            return getAuthor();
         case ConfPackage.PROFILE__VERSION:
            return getVersion();
         case ConfPackage.PROFILE__URL:
            return getUrl();
         case ConfPackage.PROFILE__ASPECTS:
            return getAspects();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case ConfPackage.PROFILE__NAME:
            setName((String)newValue);
            return;
         case ConfPackage.PROFILE__DESCRIPTION:
            setDescription((String)newValue);
            return;
         case ConfPackage.PROFILE__AUTHOR:
            setAuthor((String)newValue);
            return;
         case ConfPackage.PROFILE__VERSION:
            setVersion((String)newValue);
            return;
         case ConfPackage.PROFILE__URL:
            setUrl((String)newValue);
            return;
         case ConfPackage.PROFILE__ASPECTS:
            getAspects().clear();
            getAspects().addAll((Collection<? extends Aspect>)newValue);
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
         case ConfPackage.PROFILE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case ConfPackage.PROFILE__DESCRIPTION:
            setDescription(DESCRIPTION_EDEFAULT);
            return;
         case ConfPackage.PROFILE__AUTHOR:
            setAuthor(AUTHOR_EDEFAULT);
            return;
         case ConfPackage.PROFILE__VERSION:
            setVersion(VERSION_EDEFAULT);
            return;
         case ConfPackage.PROFILE__URL:
            setUrl(URL_EDEFAULT);
            return;
         case ConfPackage.PROFILE__ASPECTS:
            getAspects().clear();
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
         case ConfPackage.PROFILE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case ConfPackage.PROFILE__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
         case ConfPackage.PROFILE__AUTHOR:
            return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
         case ConfPackage.PROFILE__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
         case ConfPackage.PROFILE__URL:
            return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
         case ConfPackage.PROFILE__ASPECTS:
            return aspects != null && !aspects.isEmpty();
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
      result.append(" (name: ");
      result.append(name);
      result.append(", description: ");
      result.append(description);
      result.append(", author: ");
      result.append(author);
      result.append(", version: ");
      result.append(version);
      result.append(", url: ");
      result.append(url);
      result.append(')');
      return result.toString();
   }

} //ProfileImpl
