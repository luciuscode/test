/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: StaticaspectPackage.java,v 1.4 2010-05-10 08:36:48 chsaad Exp $
 */
package org.eclipse.jwt.sample.staticaspect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jwt.we.conf.model.ConfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.jwt.sample.staticaspect.StaticaspectFactory
 * @model kind="package"
 * @generated
 */
public interface StaticaspectPackage extends EPackage {
	/**
    * The package name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	String eNAME = "staticaspect";

	/**
    * The package namespace URI.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	String eNS_URI = "org.eclipse.jwt.sample.staticaspect";

	/**
    * The package namespace name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	String eNS_PREFIX = "staticaspect";

	/**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	StaticaspectPackage eINSTANCE = org.eclipse.jwt.sample.staticaspect.impl.StaticaspectPackageImpl.init();

	/**
    * The meta object id for the '{@link org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl <em>Sample Static Aspect</em>}' class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl
    * @see org.eclipse.jwt.sample.staticaspect.impl.StaticaspectPackageImpl#getSampleStaticAspect()
    * @generated
    */
	int SAMPLE_STATIC_ASPECT = 0;

	/**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT__ID = ConfPackage.ASPECT_INSTANCE__ID;

	/**
    * The feature id for the '<em><b>Target Model Element</b></em>' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT__TARGET_MODEL_ELEMENT = ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT;

	/**
    * The feature id for the '<em><b>Samplestringprop</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 0;

	/**
    * The feature id for the '<em><b>Sampleintprop</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT__SAMPLEINTPROP = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 1;

	/**
    * The feature id for the '<em><b>Sampleactionref</b></em>' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 2;

	/**
    * The number of structural features of the '<em>Sample Static Aspect</em>' class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int SAMPLE_STATIC_ASPECT_FEATURE_COUNT = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 3;


	/**
    * Returns the meta object for class '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect <em>Sample Static Aspect</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sample Static Aspect</em>'.
    * @see org.eclipse.jwt.sample.staticaspect.SampleStaticAspect
    * @generated
    */
	EClass getSampleStaticAspect();

	/**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSamplestringprop <em>Samplestringprop</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Samplestringprop</em>'.
    * @see org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSamplestringprop()
    * @see #getSampleStaticAspect()
    * @generated
    */
	EAttribute getSampleStaticAspect_Samplestringprop();

	/**
    * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleintprop <em>Sampleintprop</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Sampleintprop</em>'.
    * @see org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleintprop()
    * @see #getSampleStaticAspect()
    * @generated
    */
	EAttribute getSampleStaticAspect_Sampleintprop();

	/**
    * Returns the meta object for the reference '{@link org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleactionref <em>Sampleactionref</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Sampleactionref</em>'.
    * @see org.eclipse.jwt.sample.staticaspect.SampleStaticAspect#getSampleactionref()
    * @see #getSampleStaticAspect()
    * @generated
    */
	EReference getSampleStaticAspect_Sampleactionref();

	/**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
	StaticaspectFactory getStaticaspectFactory();

	/**
    * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
    * @generated
    */
	interface Literals {
		/**
       * The meta object literal for the '{@link org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl <em>Sample Static Aspect</em>}' class.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @see org.eclipse.jwt.sample.staticaspect.impl.SampleStaticAspectImpl
       * @see org.eclipse.jwt.sample.staticaspect.impl.StaticaspectPackageImpl#getSampleStaticAspect()
       * @generated
       */
		EClass SAMPLE_STATIC_ASPECT = eINSTANCE.getSampleStaticAspect();

		/**
       * The meta object literal for the '<em><b>Samplestringprop</b></em>' attribute feature.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @generated
       */
		EAttribute SAMPLE_STATIC_ASPECT__SAMPLESTRINGPROP = eINSTANCE.getSampleStaticAspect_Samplestringprop();

		/**
       * The meta object literal for the '<em><b>Sampleintprop</b></em>' attribute feature.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @generated
       */
		EAttribute SAMPLE_STATIC_ASPECT__SAMPLEINTPROP = eINSTANCE.getSampleStaticAspect_Sampleintprop();

		/**
       * The meta object literal for the '<em><b>Sampleactionref</b></em>' reference feature.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @generated
       */
		EReference SAMPLE_STATIC_ASPECT__SAMPLEACTIONREF = eINSTANCE.getSampleStaticAspect_Sampleactionref();

	}

} //StaticaspectPackage
