/**
 */
package conf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.we.conf.model.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Profile#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see conf.ConfPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * The default value is <code>"com.yourcompany.yourprofile"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see conf.ConfPackage#getProfile_Name()
    * @model default="com.yourcompany.yourprofile" required="true"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Profile#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Description</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Description</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Description</em>' attribute.
    * @see #setDescription(String)
    * @see conf.ConfPackage#getProfile_Description()
    * @model
    * @generated
    */
   String getDescription();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Profile#getDescription <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Description</em>' attribute.
    * @see #getDescription()
    * @generated
    */
   void setDescription(String value);

   /**
    * Returns the value of the '<em><b>Author</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Author</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Author</em>' attribute.
    * @see #setAuthor(String)
    * @see conf.ConfPackage#getProfile_Author()
    * @model
    * @generated
    */
   String getAuthor();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Profile#getAuthor <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Author</em>' attribute.
    * @see #getAuthor()
    * @generated
    */
   void setAuthor(String value);

   /**
    * Returns the value of the '<em><b>Version</b></em>' attribute.
    * The default value is <code>"1.0"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Version</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Version</em>' attribute.
    * @see #setVersion(String)
    * @see conf.ConfPackage#getProfile_Version()
    * @model default="1.0"
    * @generated
    */
   String getVersion();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Profile#getVersion <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Version</em>' attribute.
    * @see #getVersion()
    * @generated
    */
   void setVersion(String value);

   /**
    * Returns the value of the '<em><b>Url</b></em>' attribute.
    * The default value is <code>"http://www.eclipse.org/jwt/unknown_profile.html"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Url</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Url</em>' attribute.
    * @see #setUrl(String)
    * @see conf.ConfPackage#getProfile_Url()
    * @model default="http://www.eclipse.org/jwt/unknown_profile.html"
    * @generated
    */
   String getUrl();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Profile#getUrl <em>Url</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Url</em>' attribute.
    * @see #getUrl()
    * @generated
    */
   void setUrl(String value);

   /**
    * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.we.conf.model.Aspect}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Aspects</em>' containment reference list.
    * @see conf.ConfPackage#getProfile_Aspects()
    * @model containment="true" keys="id"
    * @generated
    */
   EList<Aspect> getAspects();

} // Profile
