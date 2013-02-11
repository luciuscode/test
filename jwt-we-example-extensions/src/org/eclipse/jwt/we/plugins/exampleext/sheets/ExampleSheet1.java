/**
 * File:    ExampleSheet1.java
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

import org.eclipse.jwt.we.misc.util.FontUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * An example for a simple editor sheet.
 * 
 * @author Christian Saad (csaad@gmx.net), Programming distributed Systems Lab,
 *         University of Augsburg, Germany, www.ds-lab.org.
 */
public class ExampleSheet1 extends ScrolledComposite {

	/**
	 * The main Composite
	 */
	private Composite main;

	/**
	 * Constructor.
	 * 
	 * @param container
	 *            The Container
	 */
	public ExampleSheet1(Composite container) {
		super(container, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);

		setExpandHorizontal(true);
		createPage();
	}

	/**
	 * Builds the components of this page.
	 * 
	 */
	private void createPage() {
		// main
		main = new Composite(this, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.makeColumnsEqualWidth = true;
			main.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			main.setLayoutData(data);
		}

		Group general = new Group(main, SWT.NONE);
		general.setText("Example editor sheet");
		general.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			general.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			general.setLayoutData(data);
		}

		Label ex1Label = new Label(general, SWT.LEFT);
		ex1Label.setText("Auto Show");
		Text ex1Field = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			ex1Field.setLayoutData(data);
		}
		ex1Field.setText("true");

		Label ex2Label = new Label(general, SWT.LEFT);
		ex2Label.setText("Closable");
		Text ex2Field = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			ex2Field.setLayoutData(data);
		}
		ex2Field.setText("false");

		Label ex3Label = new Label(general, SWT.LEFT);
		ex3Label.setText("Multiple");
		Text ex3Field = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			ex3Field.setLayoutData(data);
		}
		ex3Field.setText("false");

		// finished
		main.pack();
		this.setContent(main);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier )
	 */
	@Override
	public void dispose() {
		main.dispose();
		main = null;
		super.dispose();
	}

}