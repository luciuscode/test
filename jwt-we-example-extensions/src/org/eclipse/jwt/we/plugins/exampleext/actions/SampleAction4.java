/**
 * Copyright (c) 2005-2012
 * University of Augsburg, Germany <www.ds-lab.org>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.eclipse.jwt.we.plugins.exampleext.actions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jwt.we.editors.actions.external.WEExternalAction;


/**
 * This is an example of an action that extends WEExternalAction and is integrated into
 * the JWT using the menu extension point.
 * 
 * 
 * Adding a custom menu/toolbar entry to JWT requires the following steps:
 * -----------------------------------------------------------------------
 *  - Add JWT-WE to the plugin dependencies.
 *  - Add EMF to the plugin dependencies if you want to process the EMF resource.
 *  - Define a class which extends 'WEExternalAction' and realizes the methods
 * 'getImage()' and 'run()'. If the action has no an image, 'getImage()' should return
 * 'null'. The 'run()' method is executed when the action gets activated.
 *  - Register the action as an extension in 'plugin.xml' under the extension point
 * 'org.eclipse.jwt.we.menu' in the 'class' attribute.
 *  - Adjust the properties in the extension point: 'class' The action class file 'name'
 * The name of the action (which is displayed) 'description' The description of the action
 * 'showInToolbar' Show the action in the JWT toolbar? 'showInMenu' Show the action in the
 * JWT menu? 'requiresOpenEditor' Activate action only when JWT editor is open?
 * 'forceText' In toolbar: Show text even when image was supplied
 *  - WEExternalAction provides the following methods for convenience:
 * 'getActiveWEEditor()' The active Workflow Editor 'getActiveActivitySheet()' The active
 * WEActivitySheet (or the first one if the Overview page is selected.
 * 'getActiveResource()' The active EMF resource.
 * 
 * Please keep in mind that if 'requiresOpenEditor' is set to false they may return
 * 'null'.
 * 
 * @author Christian Saad (csaad@gmx.net), Programming distributed Systems Lab, University
 *         of Augsburg, Germany, www.ds-lab.org
 */
public class SampleAction4
		extends WEExternalAction
{

	public ImageDescriptor getImage()
	{
		return null;
	}


	public void run()
	{
		String info = "This is SampleAction 4 with the following properties:\n"
				+ "- name is Sample4\n" + "- shown in BOTH toolbar and menu\n"
				+ "- provides NO image\n"
				+ "- enabled even if NO JWT editor is opened\n\n";

		MessageDialog.openInformation(getActiveShell(), "Demonstration", info);
	}

}