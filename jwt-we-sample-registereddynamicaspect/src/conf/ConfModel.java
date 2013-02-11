/**
 */
package conf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.we.conf.model.AspectInstance;
import org.eclipse.jwt.we.conf.model.Profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.we.conf.model.ConfModel#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.ConfModel#getUseEmbeddedConf <em>Use Embedded Conf</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.ConfModel#getAspectInstances <em>Aspect Instances</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.ConfModel#getEnrichedModel <em>Enriched Model</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.ConfModel#isCachedNoMissingProfile <em>Cached No Missing Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see conf.ConfPackage#getConfModel()
 * @model
 * @generated
 */
public interface ConfModel extends EObject {
   /**
    * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.we.conf.model.Profile}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Profiles</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Profiles</em>' containment reference list.
    * @see conf.ConfPackage#getConfModel_Profiles()
    * @model containment="true"
    * @generated
    */
   EList<Profile> getProfiles();

   /**
    * Returns the value of the '<em><b>Use Embedded Conf</b></em>' attribute.
    * The default value is <code>"false"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Use Embedded Conf</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Use Embedded Conf</em>' attribute.
    * @see #setUseEmbeddedConf(Boolean)
    * @see conf.ConfPackage#getConfModel_UseEmbeddedConf()
    * @model default="false" required="true"
    * @generated
    */
   Boolean getUseEmbeddedConf();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.ConfModel#getUseEmbeddedConf <em>Use Embedded Conf</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Use Embedded Conf</em>' attribute.
    * @see #getUseEmbeddedConf()
    * @generated
    */
   void setUseEmbeddedConf(Boolean value);

   /**
    * Returns the value of the '<em><b>Aspect Instances</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.jwt.we.conf.model.AspectInstance}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Aspect Instances</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Aspect Instances</em>' containment reference list.
    * @see conf.ConfPackage#getConfModel_AspectInstances()
    * @model containment="true" keys="id"
    * @generated
    */
   EList<AspectInstance> getAspectInstances();

   /**
    * Returns the value of the '<em><b>Enriched Model</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enriched Model</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Enriched Model</em>' reference.
    * @see #setEnrichedModel(EObject)
    * @see conf.ConfPackage#getConfModel_EnrichedModel()
    * @model
    * @generated
    */
   EObject getEnrichedModel();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.ConfModel#getEnrichedModel <em>Enriched Model</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Enriched Model</em>' reference.
    * @see #getEnrichedModel()
    * @generated
    */
   void setEnrichedModel(EObject value);

   /**
    * Returns the value of the '<em><b>Cached No Missing Profile</b></em>' attribute.
    * The default value is <code>"false"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Cached No Missing Profile</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Cached No Missing Profile</em>' attribute.
    * @see #setCachedNoMissingProfile(boolean)
    * @see conf.ConfPackage#getConfModel_CachedNoMissingProfile()
    * @model default="false" required="true" transient="true"
    * @generated
    */
   boolean isCachedNoMissingProfile();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.ConfModel#isCachedNoMissingProfile <em>Cached No Missing Profile</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Cached No Missing Profile</em>' attribute.
    * @see #isCachedNoMissingProfile()
    * @generated
    */
   void setCachedNoMissingProfile(boolean value);

} // ConfModel
