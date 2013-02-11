/**
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * $Id: Logging.java,v 1.2 2010-05-10 08:36:52 chsaad Exp $
 */
package org.eclipse.jwt.sample.logging;

import org.eclipse.jwt.we.conf.model.AspectInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jwt.sample.logging.Logging#getLoggingLevel <em>Logging Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jwt.sample.logging.LoggingPackage#getLogging()
 * @model
 * @generated
 */
public interface Logging extends AspectInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>";

	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.jwt.sample.logging.LoggingLevels}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see org.eclipse.jwt.sample.logging.LoggingLevels
	 * @see #setLoggingLevel(LoggingLevels)
	 * @see org.eclipse.jwt.sample.logging.LoggingPackage#getLogging_LoggingLevel()
	 * @model
	 * @generated
	 */
	LoggingLevels getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.jwt.sample.logging.Logging#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see org.eclipse.jwt.sample.logging.LoggingLevels
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(LoggingLevels value);

} // Logging
