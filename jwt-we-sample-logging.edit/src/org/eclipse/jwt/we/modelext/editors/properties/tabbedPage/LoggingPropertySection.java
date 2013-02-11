/**
 * File:    SampleStaticAspectPropertySection.java
 * Created: 09.07.2008
 *
 *
/*******************************************************************************
 * Copyright (c) 2008-2009 Open Wide SA <www.openwide.fr>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc Dutoo, Open Wide SA
 *    	- initial API and implementation
 *******************************************************************************/
package org.eclipse.jwt.we.modelext.editors.properties.tabbedPage;

import org.eclipse.jwt.sample.logging.Logging;
import org.eclipse.jwt.we.conf.we.editors.properties.tabbedPage.helpers.AbstractSingleStaticAspectPropertySection;


/**
 * This class defines a tab property section dedicated to displaying
 * the first SampleStaticAspect of the selected extensible model element.
 * 
 * @version $Id: LoggingPropertySection.java,v 1.1 2009-11-02 15:52:27 mdutoo Exp $
 * @author Marc Dutoo, Open Wide SA
 */
public class LoggingPropertySection
		extends AbstractSingleStaticAspectPropertySection
{

	@SuppressWarnings("unchecked")
	@Override
	protected Class getAspectInstanceClass() {
		return Logging.class;
	}
}