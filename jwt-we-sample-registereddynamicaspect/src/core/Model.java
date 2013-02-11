/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Model#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.core.Model#getFileversion <em>Fileversion</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject, org.eclipse.jwt.meta.model.core.Package {
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
    * @see core.CorePackage#getModel_Author()
    * @model
    * @generated
    */
   String getAuthor();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.Model#getAuthor <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Author</em>' attribute.
    * @see #getAuthor()
    * @generated
    */
   void setAuthor(String value);

   /**
    * Returns the value of the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Version</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Version</em>' attribute.
    * @see #setVersion(String)
    * @see core.CorePackage#getModel_Version()
    * @model
    * @generated
    */
   String getVersion();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.Model#getVersion <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Version</em>' attribute.
    * @see #getVersion()
    * @generated
    */
   void setVersion(String value);

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
    * @see core.CorePackage#getModel_Description()
    * @model
    * @generated
    */
   String getDescription();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.Model#getDescription <em>Description</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Description</em>' attribute.
    * @see #getDescription()
    * @generated
    */
   void setDescription(String value);

   /**
    * Returns the value of the '<em><b>Fileversion</b></em>' attribute.
    * The default value is <code>""</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Fileversion</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Fileversion</em>' attribute.
    * @see #setFileversion(String)
    * @see core.CorePackage#getModel_Fileversion()
    * @model default=""
    * @generated
    */
   String getFileversion();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.core.Model#getFileversion <em>Fileversion</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Fileversion</em>' attribute.
    * @see #getFileversion()
    * @generated
    */
   void setFileversion(String value);

} // Model
