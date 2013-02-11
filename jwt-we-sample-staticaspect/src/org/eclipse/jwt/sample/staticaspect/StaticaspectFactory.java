/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: StaticaspectFactory.java,v 1.2 2009-01-05 16:35:46 mdutoo Exp $
 */
package org.eclipse.jwt.sample.staticaspect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jwt.sample.staticaspect.StaticaspectPackage
 * @generated
 */
public interface StaticaspectFactory extends EFactory {
	/**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	StaticaspectFactory eINSTANCE = org.eclipse.jwt.sample.staticaspect.impl.StaticaspectFactoryImpl.init();

	/**
    * Returns a new object of class '<em>Sample Static Aspect</em>'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return a new object of class '<em>Sample Static Aspect</em>'.
    * @generated
    */
	SampleStaticAspect createSampleStaticAspect();

	/**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
	StaticaspectPackage getStaticaspectPackage();

} //StaticaspectFactory
