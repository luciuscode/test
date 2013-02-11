/**
 * File:    TransformationRegistry.java
 * Created: 26.02.2008
 *
 *
/*******************************************************************************
 * Copyright (c) 2005-2012
 * Eclipse Java Workflow Tooling (JWT) Project <www.eclipse.org/jwt>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Mickael Istria, Open Wide, Lyon, France
 *      - Creation and implementation
 *******************************************************************************/
package org.eclipse.jwt.we.plugins.exampleext.transformation;

import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jwt.transformations.api.TransformationException;
import org.eclipse.jwt.transformations.api.TransformationService;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class StubTransformation extends TransformationService {

	@Override
	public void transform(String inFilePath, String outFilePath)
			throws IOException, TransformationException {
		final Display display = Display.getCurrent();
		final Shell shell = new Shell(display);
		MessageDialog.openInformation(
				shell,
				"Stub transformation",
				"This is a stub which open a dialog instead of applying a transformation from " + inFilePath +" to " + outFilePath +". Extension Points rules!!!");

	}

}
