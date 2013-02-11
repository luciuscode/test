/**
 */
package conf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.we.conf.model.AspectInstance#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jwt.we.conf.model.AspectInstance#getTargetModelElement <em>Target Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see conf.ConfPackage#getAspectInstance()
 * @model
 * @generated
 */
public interface AspectInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see conf.ConfPackage#getAspectInstance_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.AspectInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model Element</em>' reference.
	 * @see #setTargetModelElement(EObject)
	 * @see conf.ConfPackage#getAspectInstance_TargetModelElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getTargetModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.jwt.we.conf.model.AspectInstance#getTargetModelElement <em>Target Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model Element</em>' reference.
	 * @see #getTargetModelElement()
	 * @generated
	 */
	void setTargetModelElement(EObject value);

} // AspectInstance
