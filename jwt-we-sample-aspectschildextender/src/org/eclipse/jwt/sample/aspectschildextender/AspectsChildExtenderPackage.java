/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: AspectsChildExtenderPackage.java,v 1.3 2010-05-10 08:36:58 chsaad Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jwt.meta.model.processes.ProcessesPackage;
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
 * @see org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderFactory
 * @model kind="package"
 * @generated
 */
public interface AspectsChildExtenderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aspectschildextender";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.jwt.sample.aspectschildextender";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aspectschildextender";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectsChildExtenderPackage eINSTANCE = org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.SampleAspectsChildExtenderImpl <em>Sample Aspects Child Extender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.SampleAspectsChildExtenderImpl
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getSampleAspectsChildExtender()
	 * @generated
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER__ID = ConfPackage.ASPECT_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Target Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER__TARGET_MODEL_ELEMENT = ConfPackage.ASPECT_INSTANCE__TARGET_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Samplestringprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLESTRINGPROP = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sampleintprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEINTPROP = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sampleactionref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEACTIONREF = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sample Aspects Child Extender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_ASPECTS_CHILD_EXTENDER_FEATURE_COUNT = ConfPackage.ASPECT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.CustomControlNodeImpl <em>Custom Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.CustomControlNodeImpl
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getCustomControlNode()
	 * @generated
	 */
	int CUSTOM_CONTROL_NODE = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__OWNED_COMMENT = ProcessesPackage.CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__NAME = ProcessesPackage.CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__ICON = ProcessesPackage.CONTROL_NODE__ICON;


	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__IN = ProcessesPackage.CONTROL_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__OUT = ProcessesPackage.CONTROL_NODE__OUT;

	/**
	 * The feature id for the '<em><b>Customcontrolnodeprop1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE__CUSTOMCONTROLNODEPROP1 = ProcessesPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTROL_NODE_FEATURE_COUNT = ProcessesPackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.CustomActivityNodeImpl <em>Custom Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.CustomActivityNodeImpl
	 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getCustomActivityNode()
	 * @generated
	 */
	int CUSTOM_ACTIVITY_NODE = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__OWNED_COMMENT = ProcessesPackage.ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__NAME = ProcessesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__ICON = ProcessesPackage.ACTIVITY_NODE__ICON;


	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__IN = ProcessesPackage.ACTIVITY_NODE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__OUT = ProcessesPackage.ACTIVITY_NODE__OUT;

	/**
	 * The feature id for the '<em><b>Customcontrolnodeprop1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1 = ProcessesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVITY_NODE_FEATURE_COUNT = ProcessesPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender <em>Sample Aspects Child Extender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Aspects Child Extender</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender
	 * @generated
	 */
	EClass getSampleAspectsChildExtender();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSamplestringprop <em>Samplestringprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Samplestringprop</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSamplestringprop()
	 * @see #getSampleAspectsChildExtender()
	 * @generated
	 */
	EAttribute getSampleAspectsChildExtender_Samplestringprop();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSampleintprop <em>Sampleintprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampleintprop</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSampleintprop()
	 * @see #getSampleAspectsChildExtender()
	 * @generated
	 */
	EAttribute getSampleAspectsChildExtender_Sampleintprop();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSampleactionref <em>Sampleactionref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sampleactionref</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender#getSampleactionref()
	 * @see #getSampleAspectsChildExtender()
	 * @generated
	 */
	EReference getSampleAspectsChildExtender_Sampleactionref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.sample.aspectschildextender.CustomControlNode <em>Custom Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Control Node</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.CustomControlNode
	 * @generated
	 */
	EClass getCustomControlNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.aspectschildextender.CustomControlNode#getCustomcontrolnodeprop1 <em>Customcontrolnodeprop1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customcontrolnodeprop1</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.CustomControlNode#getCustomcontrolnodeprop1()
	 * @see #getCustomControlNode()
	 * @generated
	 */
	EAttribute getCustomControlNode_Customcontrolnodeprop1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode <em>Custom Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Activity Node</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode
	 * @generated
	 */
	EClass getCustomActivityNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode#getCustomcontrolnodeprop1 <em>Customcontrolnodeprop1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customcontrolnodeprop1</em>'.
	 * @see org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode#getCustomcontrolnodeprop1()
	 * @see #getCustomActivityNode()
	 * @generated
	 */
	EAttribute getCustomActivityNode_Customcontrolnodeprop1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AspectsChildExtenderFactory getAspectsChildExtenderFactory();

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
		 * The meta object literal for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.SampleAspectsChildExtenderImpl <em>Sample Aspects Child Extender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.SampleAspectsChildExtenderImpl
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getSampleAspectsChildExtender()
		 * @generated
		 */
		EClass SAMPLE_ASPECTS_CHILD_EXTENDER = eINSTANCE.getSampleAspectsChildExtender();

		/**
		 * The meta object literal for the '<em><b>Samplestringprop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLESTRINGPROP = eINSTANCE.getSampleAspectsChildExtender_Samplestringprop();

		/**
		 * The meta object literal for the '<em><b>Sampleintprop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEINTPROP = eINSTANCE.getSampleAspectsChildExtender_Sampleintprop();

		/**
		 * The meta object literal for the '<em><b>Sampleactionref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE_ASPECTS_CHILD_EXTENDER__SAMPLEACTIONREF = eINSTANCE.getSampleAspectsChildExtender_Sampleactionref();

		/**
		 * The meta object literal for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.CustomControlNodeImpl <em>Custom Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.CustomControlNodeImpl
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getCustomControlNode()
		 * @generated
		 */
		EClass CUSTOM_CONTROL_NODE = eINSTANCE.getCustomControlNode();

		/**
		 * The meta object literal for the '<em><b>Customcontrolnodeprop1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONTROL_NODE__CUSTOMCONTROLNODEPROP1 = eINSTANCE.getCustomControlNode_Customcontrolnodeprop1();

		/**
		 * The meta object literal for the '{@link org.eclipse.jwt.sample.aspectschildextender.impl.CustomActivityNodeImpl <em>Custom Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.CustomActivityNodeImpl
		 * @see org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderPackageImpl#getCustomActivityNode()
		 * @generated
		 */
		EClass CUSTOM_ACTIVITY_NODE = eINSTANCE.getCustomActivityNode();

		/**
		 * The meta object literal for the '<em><b>Customcontrolnodeprop1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ACTIVITY_NODE__CUSTOMCONTROLNODEPROP1 = eINSTANCE.getCustomActivityNode_Customcontrolnodeprop1();

	}

} //AspectsChildExtenderPackage
