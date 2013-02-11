/**
 * File:    ExampleSheet1SheetProvider.java
 * Created: 23.09.2008
 *
 *
/*******************************************************************************
 * Copyright (c) 2005-2012
 * University of Augsburg, Germany <www.ds-lab.org>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Christian Saad, Programming distributed Systems Lab, University of Augsburg 
 *    	- initial API and implementation
 *******************************************************************************/

package org.eclipse.jwt.we.plugins.exampleext.sheets;

import org.eclipse.jwt.we.editors.WEEditor;
import org.eclipse.jwt.we.editors.pages.externalSheet.IWEExternalSheetProvider;
import org.eclipse.swt.widgets.Control;

/**
 * Provides a simple editor sheet.
 * 
 * @author Christian Saad (csaad@gmx.net), Programming distributed Systems Lab, University
 *         of Augsburg, Germany, www.ds-lab.org.
 */
public class ExampleSheet1SheetProvider
		implements IWEExternalSheetProvider
{

	/**
	 * A reference to the parent editor.
	 */
	private WEEditor editor;


	/* (non-Javadoc)
	 * @see org.eclipse.jwt.we.editors.pages.externalSheet.IWEExternalSheetProvider#getExternalSheet()
	 */
	public Control getExternalSheet()
	{
		return new ExampleSheet1(editor.getTabFolder());
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jwt.we.editors.pages.externalSheet.IWEExternalSheetProvider#init(org.eclipse.jwt.we.editors.WEEditor)
	 */
	public void init(WEEditor editor)
	{
		this.editor = editor;
	}

}
