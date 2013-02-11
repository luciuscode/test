/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: AspectsChildExtenderFactoryImpl.java,v 1.2 2009-11-04 16:19:43 chsaad Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderFactory;
import org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage;
import org.eclipse.jwt.sample.aspectschildextender.CustomActivityNode;
import org.eclipse.jwt.sample.aspectschildextender.CustomControlNode;
import org.eclipse.jwt.sample.aspectschildextender.SampleAspectsChildExtender;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectsChildExtenderFactoryImpl extends EFactoryImpl implements AspectsChildExtenderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectsChildExtenderFactory init() {
		try {
			AspectsChildExtenderFactory theAspectsChildExtenderFactory = (AspectsChildExtenderFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.jwt.sample.aspectschildextender"); 
			if (theAspectsChildExtenderFactory != null) {
				return theAspectsChildExtenderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AspectsChildExtenderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsChildExtenderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AspectsChildExtenderPackage.SAMPLE_ASPECTS_CHILD_EXTENDER: return createSampleAspectsChildExtender();
			case AspectsChildExtenderPackage.CUSTOM_CONTROL_NODE: return createCustomControlNode();
			case AspectsChildExtenderPackage.CUSTOM_ACTIVITY_NODE: return createCustomActivityNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleAspectsChildExtender createSampleAspectsChildExtender() {
		SampleAspectsChildExtenderImpl sampleAspectsChildExtender = new SampleAspectsChildExtenderImpl();
		return sampleAspectsChildExtender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomControlNode createCustomControlNode() {
		CustomControlNodeImpl customControlNode = new CustomControlNodeImpl();
		return customControlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomActivityNode createCustomActivityNode() {
		CustomActivityNodeImpl customActivityNode = new CustomActivityNodeImpl();
		return customActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsChildExtenderPackage getAspectsChildExtenderPackage() {
		return (AspectsChildExtenderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AspectsChildExtenderPackage getPackage() {
		return AspectsChildExtenderPackage.eINSTANCE;
	}

} //AspectsChildExtenderFactoryImpl
