/**
 */
package conf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#getAspectInstanceEType <em>Aspect Instance EType</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#getTargetModelElements <em>Target Model Elements</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#isAutocreated <em>Autocreated</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.Aspect#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see conf.ConfPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject {
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * The default value is <code>"com.yourcompany.yourprofile.youraspect"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see conf.ConfPackage#getAspect_Id()
    * @model default="com.yourcompany.yourprofile.youraspect" required="true"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Aspect#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Aspect Instance EType</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Aspect Instance EType</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Aspect Instance EType</em>' reference.
    * @see #setAspectInstanceEType(EClassifier)
    * @see conf.ConfPackage#getAspect_AspectInstanceEType()
    * @model required="true"
    * @generated
    */
   EClassifier getAspectInstanceEType();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Aspect#getAspectInstanceEType <em>Aspect Instance EType</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Aspect Instance EType</em>' reference.
    * @see #getAspectInstanceEType()
    * @generated
    */
   void setAspectInstanceEType(EClassifier value);

   /**
    * Returns the value of the '<em><b>Target Model Elements</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target Model Elements</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target Model Elements</em>' reference list.
    * @see conf.ConfPackage#getAspect_TargetModelElements()
    * @model required="true"
    * @generated
    */
   EList<EClass> getTargetModelElements();

   /**
    * Returns the value of the '<em><b>Autocreated</b></em>' attribute.
    * The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Autocreated</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Autocreated</em>' attribute.
    * @see #setAutocreated(boolean)
    * @see conf.ConfPackage#getAspect_Autocreated()
    * @model default="true" required="true"
    * @generated
    */
   boolean isAutocreated();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Aspect#isAutocreated <em>Autocreated</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Autocreated</em>' attribute.
    * @see #isAutocreated()
    * @generated
    */
   void setAutocreated(boolean value);

   /**
    * Returns the value of the '<em><b>Multiple</b></em>' attribute.
    * The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Multiple</em>' attribute.
    * @see #setMultiple(boolean)
    * @see conf.ConfPackage#getAspect_Multiple()
    * @model default="true" required="true"
    * @generated
    */
   boolean isMultiple();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Aspect#isMultiple <em>Multiple</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Multiple</em>' attribute.
    * @see #isMultiple()
    * @generated
    */
   void setMultiple(boolean value);

   /**
    * Returns the value of the '<em><b>Default Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Default Value</em>' attribute.
    * @see #setDefaultValue(String)
    * @see conf.ConfPackage#getAspect_DefaultValue()
    * @model
    * @generated
    */
   String getDefaultValue();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.Aspect#getDefaultValue <em>Default Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Default Value</em>' attribute.
    * @see #getDefaultValue()
    * @generated
    */
   void setDefaultValue(String value);

} // Aspect
