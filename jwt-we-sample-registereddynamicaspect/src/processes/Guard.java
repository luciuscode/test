/**
 */
package processes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.core.NamedElement;

import org.eclipse.jwt.meta.model.processes.GuardSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Guard#getTextualdescription <em>Textualdescription</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Guard#getShortdescription <em>Shortdescription</em>}</li>
 *   <li>{@link org.eclipse.jwt.meta.model.processes.Guard#getDetailedSpecification <em>Detailed Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see processes.ProcessesPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject, NamedElement {
   /**
    * Returns the value of the '<em><b>Textualdescription</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Textualdescription</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Textualdescription</em>' attribute.
    * @see #setTextualdescription(String)
    * @see processes.ProcessesPackage#getGuard_Textualdescription()
    * @model
    * @generated
    */
   String getTextualdescription();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Guard#getTextualdescription <em>Textualdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Textualdescription</em>' attribute.
    * @see #getTextualdescription()
    * @generated
    */
   void setTextualdescription(String value);

   /**
    * Returns the value of the '<em><b>Shortdescription</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Shortdescription</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Shortdescription</em>' attribute.
    * @see #setShortdescription(String)
    * @see processes.ProcessesPackage#getGuard_Shortdescription()
    * @model
    * @generated
    */
   String getShortdescription();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Guard#getShortdescription <em>Shortdescription</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Shortdescription</em>' attribute.
    * @see #getShortdescription()
    * @generated
    */
   void setShortdescription(String value);

   /**
    * Returns the value of the '<em><b>Detailed Specification</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Detailed Specification</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Detailed Specification</em>' containment reference.
    * @see #setDetailedSpecification(GuardSpecification)
    * @see processes.ProcessesPackage#getGuard_DetailedSpecification()
    * @model containment="true"
    * @generated
    */
   GuardSpecification getDetailedSpecification();

   /**
    * Sets the value of the '{@link org.eclipse.jwt.meta.model.processes.Guard#getDetailedSpecification <em>Detailed Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Detailed Specification</em>' containment reference.
    * @see #getDetailedSpecification()
    * @generated
    */
   void setDetailedSpecification(GuardSpecification value);

} // Guard
