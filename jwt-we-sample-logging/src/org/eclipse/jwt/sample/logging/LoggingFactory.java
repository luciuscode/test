/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: LoggingFactory.java,v 1.1 2009-11-02 15:52:26 mdutoo Exp $
 */
package org.eclipse.jwt.sample.logging;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jwt.sample.logging.LoggingPackage
 * @generated
 */
public interface LoggingFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoggingFactory eINSTANCE = org.eclipse.jwt.sample.logging.impl.LoggingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logging</em>'.
	 * @generated
	 */
	Logging createLogging();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoggingPackage getLoggingPackage();

} //LoggingFactory
