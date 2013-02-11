/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: AspectsChildExtenderFactory.java,v 1.1 2009-01-07 14:46:35 mdutoo Exp $
 */
package org.eclipse.jwt.sample.aspectschildextender;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jwt.sample.aspectschildextender.AspectsChildExtenderPackage
 * @generated
 */
public interface AspectsChildExtenderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectsChildExtenderFactory eINSTANCE = org.eclipse.jwt.sample.aspectschildextender.impl.AspectsChildExtenderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sample Aspects Child Extender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Aspects Child Extender</em>'.
	 * @generated
	 */
	SampleAspectsChildExtender createSampleAspectsChildExtender();

	/**
	 * Returns a new object of class '<em>Custom Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Control Node</em>'.
	 * @generated
	 */
	CustomControlNode createCustomControlNode();

	/**
	 * Returns a new object of class '<em>Custom Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Activity Node</em>'.
	 * @generated
	 */
	CustomActivityNode createCustomActivityNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AspectsChildExtenderPackage getAspectsChildExtenderPackage();

} //AspectsChildExtenderFactory
