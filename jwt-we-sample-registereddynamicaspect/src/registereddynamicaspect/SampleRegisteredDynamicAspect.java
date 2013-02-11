/**
 */
package registereddynamicaspect;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jwt.meta.model.processes.Action;

import org.eclipse.jwt.we.conf.model.AspectInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Registered Dynamic Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleintprop <em>Sampleintprop</em>}</li>
 *   <li>{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleactionref <em>Sampleactionref</em>}</li>
 * </ul>
 * </p>
 *
 * @see registereddynamicaspect.RegistereddynamicaspectPackage#getSampleRegisteredDynamicAspect()
 * @model
 * @generated
 */
public interface SampleRegisteredDynamicAspect extends EObject, AspectInstance {
   /**
    * Returns the value of the '<em><b>Sampleintprop</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sampleintprop</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sampleintprop</em>' attribute.
    * @see #setSampleintprop(int)
    * @see registereddynamicaspect.RegistereddynamicaspectPackage#getSampleRegisteredDynamicAspect_Sampleintprop()
    * @model
    * @generated
    */
   int getSampleintprop();

   /**
    * Sets the value of the '{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleintprop <em>Sampleintprop</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sampleintprop</em>' attribute.
    * @see #getSampleintprop()
    * @generated
    */
   void setSampleintprop(int value);

   /**
    * Returns the value of the '<em><b>Sampleactionref</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sampleactionref</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sampleactionref</em>' reference.
    * @see #setSampleactionref(Action)
    * @see registereddynamicaspect.RegistereddynamicaspectPackage#getSampleRegisteredDynamicAspect_Sampleactionref()
    * @model
    * @generated
    */
   Action getSampleactionref();

   /**
    * Sets the value of the '{@link registereddynamicaspect.SampleRegisteredDynamicAspect#getSampleactionref <em>Sampleactionref</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sampleactionref</em>' reference.
    * @see #getSampleactionref()
    * @generated
    */
   void setSampleactionref(Action value);

} // SampleRegisteredDynamicAspect
