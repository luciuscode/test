/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: SampleStaticAspect.java,v 1.4 2010-05-10 08:36:48 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect;

import org.eclipse.jwt.meta.model.processes.Action;
import org.eclipse.jwt.we.conf.model.AspectInstance;
import org.eclipse.jwt.we.conf.model.AspectInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Static Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSamplestringprop <em>Samplestringprop</em>}</li>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleintprop <em>Sampleintprop</em>}</li>
 *   <li>{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleactionref <em>Sampleactionref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage#getSampleStaticAspect()
 * @model
 * @generated
 */
public interface SampleStaticAspect extends AspectInstance {
	/**
    * Returns the value of the '<em><b>Samplestringprop</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samplestringprop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Samplestringprop</em>' attribute.
    * @see #setSamplestringprop(String)
    * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage#getSampleStaticAspect_Samplestringprop()
    * @model
    * @generated
    */
	String getSamplestringprop();

	/**
    * Sets the value of the '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSamplestringprop <em>Samplestringprop</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Samplestringprop</em>' attribute.
    * @see #getSamplestringprop()
    * @generated
    */
	void setSamplestringprop(String value);

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
    * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage#getSampleStaticAspect_Sampleintprop()
    * @model
    * @generated
    */
	int getSampleintprop();

	/**
    * Sets the value of the '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleintprop <em>Sampleintprop</em>}' attribute.
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
    * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage#getSampleStaticAspect_Sampleactionref()
    * @model
    * @generated
    */
	Action getSampleactionref();

	/**
    * Sets the value of the '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleactionref <em>Sampleactionref</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sampleactionref</em>' reference.
    * @see #getSampleactionref()
    * @generated
    */
	void setSampleactionref(Action value);

} // SampleStaticAspect
