/**
 * File:    ExampleSheet2.java
 * Created: 28.01.2007
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
 *    Christian Seitz, Programming distributed Systems Lab, University of Augsburg 
 *    	- initial API and implementation
 *******************************************************************************/

package org.eclipse.jwt.we.plugins.exampleext.sheets;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jwt.meta.model.application.Application;
import org.eclipse.jwt.meta.model.application.ApplicationFactory;
import org.eclipse.jwt.meta.model.core.CorePackage;
import org.eclipse.jwt.meta.model.core.Model;
import org.eclipse.jwt.meta.model.data.Data;
import org.eclipse.jwt.meta.model.data.DataFactory;
import org.eclipse.jwt.meta.model.organisations.OrganisationsFactory;
import org.eclipse.jwt.meta.model.organisations.Role;
import org.eclipse.jwt.meta.model.processes.Activity;
import org.eclipse.jwt.meta.model.processes.ProcessesFactory;
import org.eclipse.jwt.meta.model.processes.Scope;
import org.eclipse.jwt.we.Plugin;
import org.eclipse.jwt.we.PluginProperties;
import org.eclipse.jwt.we.editors.WEEditor;
import org.eclipse.jwt.we.misc.util.FontUtil;
import org.eclipse.jwt.we.misc.util.GeneralHelper;
import org.eclipse.jwt.we.misc.views.Views;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * A copy of the overview sheet of the workflow editor. Intrusive references to
 * non-API code have been commented. NB. non-API code can be made API if the
 * need is proved.
 * 
 * @author Christian Seitz (chr.seitz@gmx.de), Programming distributed Systems
 *         Lab, University of Augsburg, Germany, www.ds-lab.org.
 */
public class ExampleSheet2 extends ScrolledComposite implements Adapter
{

	/**
	 * The WEEditor hosting this page
	 */
	private final WEEditor editor;

	/**
	 * The text field for the model name
	 */
	private Text nameField;

	/**
	 * The text field for the author
	 */
	private Text authorField;

	/**
	 * The text field for the version
	 */
	private Text versionField;

	/**
	 * The text field for the modified date
	 */
	private Text modifiedField;

	/**
	 * The text field for the file path
	 */
	private Text locationField;

	/**
	 * The text field for the documentation
	 */
	private StyledText documentationField;

	/**
	 * Button to delete a role
	 */
	private Button deleteRoleButton;

	/**
	 * Button to delete a data
	 */
	private Button deleteDataButton;

	/**
	 * Button to delete an application
	 */
	private Button deleteApplicationButton;

	/**
	 * Button to delete an activity
	 */
	private Button deleteProcessButton;

	/**
	 * List with all scopes of the model
	 */
	private ArrayList<Scope> scopeList = new ArrayList<Scope>();

	/**
	 * Tree to display the roles
	 */
	private Tree roleTree;

	/**
	 * Tree to display the data
	 */
	private Tree dataTree;

	/**
	 * Tree to display the applications
	 */
	private Tree applicationTree;

	/**
	 * Tree to display the activities
	 */
	private Tree processTree;

	/**
	 * TreeViewer to display the roles
	 */
	private TreeViewer roleViewer;

	/**
	 * TreeViewer to display the data
	 */
	private TreeViewer dataViewer;

	/**
	 * TreeViewer to display the applications
	 */
	private TreeViewer applicationViewer;

	/**
	 * TreeViewer to display the activities
	 */
	private TreeViewer processViewer;

	/**
	 * The root Package of the model
	 */
	private Object rootPackage;

	/**
	 * The main Composite
	 */
	private Composite main;


	/**
	 * Constructor for the Configuration Page
	 * 
	 * @param container
	 *            The Container
	 * @param editor
	 *            The WEEditor
	 */
	public ExampleSheet2(Composite container, WEEditor editor)
	{
		super(container, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		this.setExpandHorizontal(true);
		this.editor = editor;
		rootPackage = editor.getModel();
		if (rootPackage instanceof org.eclipse.jwt.meta.model.core.Package)
		{
			collect((org.eclipse.jwt.meta.model.core.Package) rootPackage);
		}
		((EObject) editor.getModel()).eAdapters().add(this);
		// add listener
		((EObject) rootPackage).eAdapters().add(this);

		createConfigPage();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	public void notifyChanged(Notification notification)
	{
		if (!(rootPackage instanceof Model))
		{
			return;
		}

		if (notification.getNotifier() instanceof Model)
		{
			if (notification.getFeatureID(Model.class) == CorePackage.MODEL__NAME)
			{
				nameField.setText(((Model) rootPackage).getName());
			}
			if (notification.getFeatureID(Model.class) == CorePackage.MODEL__VERSION)
			{
				versionField.setText(((Model) rootPackage).getVersion());
			}
			if (notification.getFeatureID(Model.class) == CorePackage.MODEL__AUTHOR)
			{
				authorField.setText(((Model) rootPackage).getAuthor());
			}
			if (notification.getFeatureID(Model.class) == CorePackage.MODEL__DESCRIPTION)
			{
				documentationField.setText(((Model) rootPackage).getDescription());
			}
		}
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	public Notifier getTarget()
	{
		return null;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	public void setTarget(Notifier newTarget)
	{
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	public boolean isAdapterForType(Object type)
	{
		return false;
	}


	/**
	 * Reloads the whole overview sheet.
	 */
	public void reloadOverviewSheet()
	{
		// remove old listener
		if (rootPackage != null)
		{
			((EObject) rootPackage).eAdapters().remove(this);
		}

		// set new values
		rootPackage = editor.getModel();
		if (rootPackage instanceof org.eclipse.jwt.meta.model.core.Package)
		{
			collect((org.eclipse.jwt.meta.model.core.Package) rootPackage);
		}

		// add listener
		((EObject) rootPackage).eAdapters().add(this);

		// reload control
		main.dispose();
		main = null;
		createConfigPage();
	}


	/**
	 * Reloads the file information. (file date and file path)
	 */
	public void reloadFileInformation()
	{
		// read file path from XMI resource
		XMIResourceImpl xmiresource = (XMIResourceImpl) editor.getEmfEditingDomain()
				.getResourceSet().getResources().get(0);

		String filepath = xmiresource.getURI().toFileString();

		// get absolute path if necessary
		if (xmiresource.getURI().isRelative())
		{
			File tempFile = new File(filepath);
			filepath = tempFile.getAbsolutePath();
			tempFile = null;
		}

		if (filepath != null)
		{
			// read and set date information
			File file = new File(filepath);
			long time = file.lastModified();
			Date date = new Date(time);
			SimpleDateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy, HH:mm");
			modifiedField.setText(dateformat.format(date));

			// read and set path information
			IPath ospath = Path.fromOSString(filepath);
			filepath = ospath.toOSString();
			locationField.setText(filepath);
		}
	}


	/**
	 * Builds the components of this page.
	 * 
	 */
	private void createConfigPage()
	{
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

		Composite firstRow = new Composite(main, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			layout.makeColumnsEqualWidth = true;
			firstRow.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			firstRow.setLayoutData(data);
		}

		Composite secondRow = new Composite(main, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			layout.makeColumnsEqualWidth = true;
			secondRow.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			secondRow.setLayoutData(data);
		}

		Composite thirdRow = new Composite(main, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			layout.makeColumnsEqualWidth = true;
			thirdRow.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			thirdRow.setLayoutData(data);
		}

		// ------------ The General Information Part --------------

		Group general = new Group(firstRow, SWT.NONE);
		general.setText(PluginProperties.getString("configPage_Properties"));
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

		Label nameLabel = new Label(general, SWT.LEFT);
		nameLabel.setText(PluginProperties.getString("configPage_Name") + ":");
		nameField = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			nameField.setLayoutData(data);
		}
		if (editor.getModel() instanceof org.eclipse.jwt.meta.model.core.Package)
		{
			if (((org.eclipse.jwt.meta.model.core.Package) editor.getModel()).getName() != null)
				nameField.setText(((org.eclipse.jwt.meta.model.core.Package) editor
						.getModel()).getName());
		}
		nameField.addFocusListener(new FocusAdapter()
		{

			@Override
			public void focusLost(FocusEvent e)
			{
				if (editor.getModel() instanceof org.eclipse.jwt.meta.model.core.Package
						&& !nameField.getText().equals(
								((org.eclipse.jwt.meta.model.core.Package) editor
										.getModel()).getName()))
				{
					Command cmd = SetCommand.create(editor.getEmfEditingDomain(), editor
							.getModel(), CorePackage.Literals.NAMED_ELEMENT__NAME,
							nameField.getText());
					editor.getEmfEditingDomain().getCommandStack().execute(cmd);
				}
			}

		});

		Label authorLabel = new Label(general, SWT.LEFT);
		authorLabel.setText(PluginProperties.getString("configPage_Author") + ":");
		authorField = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			authorField.setLayoutData(data);
		}
		if (editor.getModel() instanceof Model)
		{
			if (((Model) editor.getModel()).getAuthor() != null)
				authorField.setText(((Model) editor.getModel()).getAuthor());
		}
		authorField.addFocusListener(new FocusAdapter()
		{

			@Override
			public void focusLost(FocusEvent e)
			{
				if (editor.getModel() instanceof Model
						&& !authorField.getText().equals(
								((Model) editor.getModel()).getAuthor()))
				{
					Command cmd = SetCommand.create(editor.getEmfEditingDomain(), editor
							.getModel(), CorePackage.Literals.MODEL__AUTHOR, authorField
							.getText());
					editor.getEmfEditingDomain().getCommandStack().execute(cmd);

				}
			}

		});

		Label versionLabel = new Label(general, SWT.LEFT);
		versionLabel.setText(PluginProperties.getString("configPage_VNumber") + ":");
		versionField = new Text(general, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			versionField.setLayoutData(data);
		}
		if (editor.getModel() instanceof Model)
		{
			if (((Model) editor.getModel()).getVersion() != null)
				versionField.setText(((Model) editor.getModel()).getVersion());
		}
		versionField.addFocusListener(new FocusAdapter()
		{

			@Override
			public void focusLost(FocusEvent e)
			{
				if (editor.getModel() instanceof Model
						&& !versionField.getText().equals(
								((Model) editor.getModel()).getVersion()))
				{
					Command cmd = SetCommand.create(editor.getEmfEditingDomain(), editor
							.getModel(), CorePackage.Literals.MODEL__VERSION,
							versionField.getText());
					editor.getEmfEditingDomain().getCommandStack().execute(cmd);

				}
			}

		});

		Label locationLabel = new Label(general, SWT.LEFT);
		locationLabel.setText(PluginProperties.getString("configPage_Location") + ":");
		locationField = new Text(general, SWT.NONE);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			locationField.setLayoutData(data);
		}
		locationField.setEditable(false);

		Label modifiedLabel = new Label(general, SWT.LEFT);
		modifiedLabel
				.setText(PluginProperties.getString("configPage_LastModified") + ":");
		modifiedField = new Text(general, SWT.NONE);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			modifiedField.setLayoutData(data);
		}
		modifiedField.setEditable(false);
		reloadFileInformation();

		// ------------ The Documentation Part --------------

		Group documentation = new Group(firstRow, SWT.NONE);
		documentation.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		documentation.setText(PluginProperties.getString("configPage_Documentation"));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			documentation.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			documentation.setLayoutData(data);
		}

		documentationField = new StyledText(documentation, SWT.MULTI | SWT.V_SCROLL);
		documentationField.setWordWrap(true);
		GC gc = new GC(documentationField);
		FontMetrics fm = gc.getFontMetrics();
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			data.heightHint = 8 * fm.getHeight();
			documentationField.setLayoutData(data);
		}
		if (editor.getModel() instanceof Model)
		{
			if (((Model) editor.getModel()).getDescription() != null)
				documentationField.setText(((Model) editor.getModel()).getDescription());
		}
		documentationField.addFocusListener(new FocusAdapter()
		{

			@Override
			public void focusLost(FocusEvent e)
			{
				if (editor.getModel() instanceof Model
						&& !documentationField.getText().equals(
								((Model) editor.getModel()).getDescription()))
				{
					Command cmd = SetCommand.create(editor.getEmfEditingDomain(), editor
							.getModel(), CorePackage.Literals.MODEL__DESCRIPTION,
							documentationField.getText());
					editor.getEmfEditingDomain().getCommandStack().execute(cmd);

				}
			}

		});

		// the images for the buttons
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		Image deleteImage = sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE).createImage();
		Image addRoleImage = Plugin.getInstance().getFactoryRegistry().getImageFactory(
				Views.getInstance().getSelectedView()).createModelTypeImageDescriptor(
				OrganisationsFactory.eINSTANCE.createRole()).createImage();
		Image addDataImage = Plugin.getInstance().getFactoryRegistry().getImageFactory(
				Views.getInstance().getSelectedView()).createModelTypeImageDescriptor(
				DataFactory.eINSTANCE.createData()).createImage();
		Image addAppImage = Plugin.getInstance().getFactoryRegistry().getImageFactory(
				Views.getInstance().getSelectedView()).createModelTypeImageDescriptor(
				ApplicationFactory.eINSTANCE.createApplication()).createImage();
		Image addProcessImage = Plugin.getInstance().getFactoryRegistry()
				.getImageFactory(Views.getInstance().getSelectedView())
				.createModelTypeImageDescriptor(
						ProcessesFactory.eINSTANCE.createActivity()).createImage();

		// ------------ The Role Part --------------

		// the main control
		Group role = new Group(secondRow, SWT.NONE);
		role.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		role.setText(PluginProperties.getString("configPage_Roles"));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			role.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			role.setLayoutData(data);
		}

		// create the role tree
		roleTree = new Tree(role, SWT.SINGLE);
		{
			GridData data = new GridData();
			data.grabExcessHorizontalSpace = true;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.verticalAlignment = GridData.FILL;
			data.horizontalSpan = 1;
			data.verticalSpan = 3;
			data.heightHint = 8 * fm.getHeight();
			roleTree.setLayoutData(data);
		}
		roleViewer = new TreeViewer(roleTree);
		roleViewer.setContentProvider(new AdapterFactoryContentProvider(editor
				.getAdapterFactory()));
		roleViewer.setLabelProvider(new AdapterFactoryLabelProvider(editor
				.getAdapterFactory()));
		roleViewer.addFilter(new RoleFilter());
		roleViewer.setInput(editor.getModel());
		roleViewer.expandAll();
		roleViewer.collapseAll();

		// add role viewer as selection provider to selectionsynchronizer
		// editor.getSelectionSynchronizer().addSelectionProvider(roleViewer);

		// context menu
		MenuManager roleContextMenuManager = new MenuManager();
		roleContextMenuManager.setRemoveAllWhenShown(true);
		roleContextMenuManager.addMenuListener(editor.getContextMenuProvider());
		Menu roleContextMenu = roleContextMenuManager.createContextMenu(roleViewer
				.getControl());
		roleViewer.getControl().setMenu(roleContextMenu);
		editor.getSite().registerContextMenu(roleContextMenuManager, roleViewer);

		// expand all packages which contain roles
		ArrayList roleList = collectItems(roleTree, null);
		for (int i = 0; i < roleList.size(); i++)
		{
			if (!((TreeItem) roleList.get(i)).isDisposed())
			{
				Object treeItemData = ((TreeItem) roleList.get(i)).getData();
				if (treeItemData instanceof org.eclipse.jwt.meta.model.core.Package
						&& findElement(
								(org.eclipse.jwt.meta.model.core.Package) treeItemData, 0))
				{
					roleViewer.setExpandedState(
							(org.eclipse.jwt.meta.model.core.Package) treeItemData, true);
				}
			}
		}

		// create add role button
		Button addRoleButton = new Button(role, SWT.FLAT);
		addRoleButton.setImage(addRoleImage);
		addRoleButton.setToolTipText(PluginProperties.getString("menu_Role_item"));
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			addRoleButton.setLayoutData(data);
		}

		addRoleButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (GeneralHelper.getActiveInstance() != null)
				{
					/*
					 * CreateRoleWizard wizard; if (roleTree.getSelectionCount()
					 * == 1 && roleTree.getSelection()[0].getData() instanceof
					 * Package) { wizard = new CreateRoleWizard( (Package)
					 * roleTree.getSelection()[0].getData()); } else { wizard =
					 * new CreateRoleWizard(); }
					 * wizard.init(PlatformUI.getWorkbench(), null);
					 * WizardDialog dialog = new
					 * NotResizableWizardDialog(GeneralHelper .getActiveShell(),
					 * wizard); dialog.create(); dialog.open();
					 */
				}
			}
		});

		// create delete role button
		deleteRoleButton = new Button(role, SWT.FLAT);
		deleteRoleButton.setToolTipText(PluginProperties.getString("configPage_Delete"));
		deleteRoleButton.setImage(deleteImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			deleteRoleButton.setLayoutData(data);
		}

		deleteRoleButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				// check again if selection has changed from outside
				if (roleTree.getSelectionCount() > 0)
				{
					EditingDomain editingDomain = (EditingDomain) editor
							.getAdapter(EditingDomain.class);
					Command cmd = DeleteCommand.create(editingDomain, roleTree
							.getSelection()[0].getData());
					editingDomain.getCommandStack().execute(cmd);
					GeneralHelper.getActiveInstance().activatePage(
							GeneralHelper.getActiveInstance().getOverviewPageID());
				}
			}
		});

		// ------------ The Data Part --------------

		// the main control
		Group datas = new Group(secondRow, SWT.NONE);
		datas.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		datas.setText(PluginProperties.getString("configPage_Data"));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			datas.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			datas.setLayoutData(data);
		}

		// create the data tree
		dataTree = new Tree(datas, SWT.SINGLE);
		{
			GridData data = new GridData();
			data.grabExcessHorizontalSpace = true;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.verticalAlignment = GridData.FILL;
			data.horizontalSpan = 1;
			data.verticalSpan = 3;
			data.heightHint = 8 * fm.getHeight();
			dataTree.setLayoutData(data);
		}
		dataViewer = new TreeViewer(dataTree);
		dataViewer.setContentProvider(new AdapterFactoryContentProvider(editor
				.getAdapterFactory()));
		dataViewer.setLabelProvider(new AdapterFactoryLabelProvider(editor
				.getAdapterFactory()));
		dataViewer.addFilter(new DataFilter());
		dataViewer.setInput(editor.getModel());
		dataViewer.expandAll();
		dataViewer.collapseAll();

		// add data viewer as selection provider to selectionsynchronizer
		// editor.getSelectionSynchronizer().addSelectionProvider(dataViewer);

		// context menu
		MenuManager dataContextMenuManager = new MenuManager();
		dataContextMenuManager.setRemoveAllWhenShown(true);
		dataContextMenuManager.addMenuListener(editor.getContextMenuProvider());
		Menu dataContextMenu = dataContextMenuManager.createContextMenu(dataViewer
				.getControl());
		dataViewer.getControl().setMenu(dataContextMenu);
		editor.getSite().registerContextMenu(dataContextMenuManager, dataViewer);

		// expand all packages which contain data
		ArrayList dataList = collectItems(dataTree, null);
		for (int i = 0; i < dataList.size(); i++)
		{
			Object treeItemData = ((TreeItem) dataList.get(i)).getData();
			if (treeItemData instanceof org.eclipse.jwt.meta.model.core.Package
					&& findElement(
							(org.eclipse.jwt.meta.model.core.Package) treeItemData, 2))
			{
				dataViewer.setExpandedState(
						(org.eclipse.jwt.meta.model.core.Package) treeItemData, true);
			}
		}

		// create add data button
		Button addDataButton = new Button(datas, SWT.FLAT);
		addDataButton.setToolTipText(PluginProperties.getString("menu_Data_item"));
		addDataButton.setImage(addDataImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			addDataButton.setLayoutData(data);
		}
		addDataButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (GeneralHelper.getActiveInstance() != null)
				{
					/*
					 * CreateDataWizard wizard; if (dataTree.getSelectionCount()
					 * == 1 && dataTree.getSelection()[0].getData() instanceof
					 * Package) { wizard = new CreateDataWizard( (Package)
					 * dataTree.getSelection()[0].getData()); } else { wizard =
					 * new CreateDataWizard(); }
					 * wizard.init(PlatformUI.getWorkbench(), null);
					 * WizardDialog dialog = new
					 * NotResizableWizardDialog(GeneralHelper .getActiveShell(),
					 * wizard); dialog.create(); dialog.open();
					 */
				}
			}
		});

		// create delete data button
		deleteDataButton = new Button(datas, SWT.FLAT);
		deleteDataButton.setToolTipText(PluginProperties.getString("configPage_Delete"));
		deleteDataButton.setImage(deleteImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			deleteDataButton.setLayoutData(data);
		}
		deleteDataButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (dataTree.getSelectionCount() > 0)
				{
					EditingDomain editingDomain = (EditingDomain) editor
							.getAdapter(EditingDomain.class);
					Command cmd = DeleteCommand.create(editingDomain, dataTree
							.getSelection()[0].getData());
					editingDomain.getCommandStack().execute(cmd);
					GeneralHelper.getActiveInstance().activatePage(
							GeneralHelper.getActiveInstance().getOverviewPageID());
				}
			}
		});

		// ------------ The Application Part --------------

		// the main control
		Group application = new Group(thirdRow, SWT.NONE);
		application.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		application.setText(PluginProperties.getString("configPage_Application"));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			application.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			application.setLayoutData(data);
		}

		// create the application tree
		applicationTree = new Tree(application, SWT.SINGLE);
		{
			GridData data = new GridData();
			data.grabExcessHorizontalSpace = true;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.verticalAlignment = GridData.FILL;
			data.horizontalSpan = 1;
			data.verticalSpan = 3;
			data.heightHint = 8 * fm.getHeight();
			applicationTree.setLayoutData(data);
		}
		applicationViewer = new TreeViewer(applicationTree);
		applicationViewer.setContentProvider(new AdapterFactoryContentProvider(editor
				.getAdapterFactory()));
		applicationViewer.setLabelProvider(new AdapterFactoryLabelProvider(editor
				.getAdapterFactory()));
		applicationViewer.addFilter(new ApplicationFilter());
		applicationViewer.setInput(editor.getModel());
		applicationViewer.expandAll();
		applicationViewer.collapseAll();

		// add application viewer as selection provider to selectionsynchronizer
		// editor.getSelectionSynchronizer().addSelectionProvider(applicationViewer);

		// context menu
		MenuManager applicationContextMenuManager = new MenuManager();
		applicationContextMenuManager.setRemoveAllWhenShown(true);
		applicationContextMenuManager.addMenuListener(editor.getContextMenuProvider());
		Menu applicationContextMenu = applicationContextMenuManager
				.createContextMenu(applicationViewer.getControl());
		applicationViewer.getControl().setMenu(applicationContextMenu);
		editor.getSite().registerContextMenu(applicationContextMenuManager,
				applicationViewer);

		// expand all packages which contain applications
		ArrayList applicationList = collectItems(applicationTree, null);
		for (int i = 0; i < applicationList.size(); i++)
		{
			Object treeItemData = ((TreeItem) applicationList.get(i)).getData();
			if (treeItemData instanceof org.eclipse.jwt.meta.model.core.Package
					&& findElement(
							(org.eclipse.jwt.meta.model.core.Package) treeItemData, 1))
			{
				applicationViewer.setExpandedState(
						(org.eclipse.jwt.meta.model.core.Package) treeItemData, true);
			}
		}

		// create add application button
		Button addApplicationButton = new Button(application, SWT.FLAT);
		addApplicationButton.setToolTipText(PluginProperties
				.getString("menu_Application_item"));
		addApplicationButton.setImage(addAppImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			addApplicationButton.setLayoutData(data);
		}

		addApplicationButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (GeneralHelper.getActiveInstance() != null)
				{
					/*
					 * CreateApplicationWizard wizard; if
					 * (applicationTree.getSelectionCount() == 1 &&
					 * applicationTree.getSelection()[0].getData() instanceof
					 * Package) { wizard = new CreateApplicationWizard((Package)
					 * applicationTree .getSelection()[0].getData()); } else {
					 * wizard = new CreateApplicationWizard(); }
					 * wizard.init(PlatformUI.getWorkbench(), null);
					 * WizardDialog dialog = new
					 * NotResizableWizardDialog(GeneralHelper .getActiveShell(),
					 * wizard); dialog.create(); dialog.open();
					 */
				}
			}
		});

		// create delete application button
		deleteApplicationButton = new Button(application, SWT.FLAT);
		deleteApplicationButton.setToolTipText(PluginProperties
				.getString("configPage_Delete"));
		deleteApplicationButton.setImage(deleteImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			deleteApplicationButton.setLayoutData(data);
		}
		deleteApplicationButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (applicationTree.getSelectionCount() > 0)
				{
					EditingDomain editingDomain = (EditingDomain) editor
							.getAdapter(EditingDomain.class);
					Command cmd = DeleteCommand.create(editingDomain, applicationTree
							.getSelection()[0].getData());
					editingDomain.getCommandStack().execute(cmd);
					GeneralHelper.getActiveInstance().activatePage(
							GeneralHelper.getActiveInstance().getOverviewPageID());
				}
			}
		});

		// ------------ The Processes Part --------------

		// the main control
		Group process = new Group(thirdRow, SWT.NONE);
		process.setFont(FontUtil.getSystemStyle(SWT.BOLD));
		process.setText(PluginProperties.getString("configPage_Activity"));
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			process.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.grabExcessHorizontalSpace = true;
			process.setLayoutData(data);
		}

		// create the process tree
		processTree = new Tree(process, SWT.SINGLE);
		{
			GridData data = new GridData();
			data.grabExcessHorizontalSpace = true;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.verticalAlignment = GridData.FILL;
			data.horizontalSpan = 1;
			data.verticalSpan = 3;
			data.heightHint = 8 * fm.getHeight();
			processTree.setLayoutData(data);
		}
		processViewer = new TreeViewer(processTree);
		processViewer.setContentProvider(new AdapterFactoryContentProvider(editor
				.getAdapterFactory()));
		processViewer.setLabelProvider(new AdapterFactoryLabelProvider(editor
				.getAdapterFactory()));
		processViewer.addFilter(new ProcessFilter());
		processViewer.setInput(editor.getModel());
		processViewer.expandAll();
		processViewer.collapseAll();

		// add process viewer as selection provider to selectionsynchronizer
		// editor.getSelectionSynchronizer().addSelectionProvider(processViewer);

		// context menu
		MenuManager processContextMenuManager = new MenuManager();
		processContextMenuManager.setRemoveAllWhenShown(true);
		processContextMenuManager.addMenuListener(editor.getContextMenuProvider());
		Menu processContextMenu = processContextMenuManager
				.createContextMenu(processViewer.getControl());
		processViewer.getControl().setMenu(processContextMenu);
		editor.getSite().registerContextMenu(processContextMenuManager, processViewer);

		processTree.addMouseListener(new MouseAdapter()
		{

			@Override
			public void mouseDoubleClick(MouseEvent event)
			{
				editor.openActivityInNewPage((Activity) processTree.getSelection()[0]
						.getData());
			}
		});

		// expand all packages which contain processes
		ArrayList processList = collectItems(processTree, null);
		for (int i = 0; i < processList.size(); i++)
		{
			Object treeItemData = ((TreeItem) processList.get(i)).getData();
			if (treeItemData instanceof org.eclipse.jwt.meta.model.core.Package
					&& findElement(
							(org.eclipse.jwt.meta.model.core.Package) treeItemData, 3))
			{
				processViewer.setExpandedState(
						(org.eclipse.jwt.meta.model.core.Package) treeItemData, true);
			}
		}

		// create add process button
		Button addProcessButton = new Button(process, SWT.FLAT);
		addProcessButton.setToolTipText(PluginProperties.getString("menu_Process_item"));
		addProcessButton.setImage(addProcessImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			addProcessButton.setLayoutData(data);
		}
		addProcessButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (GeneralHelper.getActiveInstance() != null)
				{
					/*
					 * CreateProcessWizard wizard; if
					 * (processTree.getSelectionCount() == 1 &&
					 * processTree.getSelection()[0].getData() instanceof
					 * Package) { wizard = new CreateProcessWizard((Package)
					 * processTree .getSelection()[0].getData()); } else {
					 * wizard = new CreateProcessWizard(); }
					 * wizard.init(PlatformUI.getWorkbench(), null);
					 * WizardDialog dialog = new
					 * NotResizableWizardDialog(GeneralHelper .getActiveShell(),
					 * wizard); dialog.create(); dialog.open();
					 */
				}
			}
		});

		// create delete process button
		deleteProcessButton = new Button(process, SWT.FLAT);
		deleteProcessButton.setToolTipText(PluginProperties
				.getString("configPage_Delete"));
		deleteProcessButton.setImage(deleteImage);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.END;
			deleteProcessButton.setLayoutData(data);
		}
		deleteProcessButton.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent event)
			{
				if (processTree.getSelectionCount() > 0)
				{
					EditingDomain editingDomain = (EditingDomain) editor
							.getAdapter(EditingDomain.class);
					Command cmd = DeleteCommand.create(editingDomain, processTree
							.getSelection()[0].getData());
					editingDomain.getCommandStack().execute(cmd);
					GeneralHelper.getActiveInstance().activatePage(
							GeneralHelper.getActiveInstance().getOverviewPageID());
				}
			}
		});

		// finished
		main.pack();
		this.setContent(main);
	}


	/**
	 * This help function recursively collects all TreeItems in a Tree.
	 * 
	 * @param tree
	 *            The tree.
	 * @param item
	 *            Should be null. Only used internally.
	 * @return A list of all Items
	 */
	private ArrayList collectItems(Tree tree, TreeItem item)
	{
		ArrayList result = new ArrayList();

		if (tree != null)
		{
			for (int i = 0; i < tree.getItemCount(); i++)
			{
				result.add(tree.getItem(i));
			}
		}
		else
		{
			for (int i = 0; i < item.getItemCount(); i++)
			{
				result.add(item.getItem(i));
			}
		}

		for (int i = 0; i < result.size(); i++)
		{
			result.addAll(collectItems(null, (TreeItem) result.get(i)));
		}

		return result;
	}


	/**
	 * Find out if a package or a subpackage contain an element of the given
	 * type. (0:Role, 1:Application, 2:Data, 3:Scope)
	 * 
	 * @param pack
	 * @return True if a role was found.
	 */
	private boolean findElement(org.eclipse.jwt.meta.model.core.Package pack, int type)
	{
		// search for the element of the given type in the current package
		for (Iterator iterator = pack.getElements().iterator(); iterator.hasNext();)
		{
			switch (type)
			{
				case 0:
					if (iterator.next() instanceof Role)
						return true;
					break;
				case 1:
					if (iterator.next() instanceof Application)
						return true;
					break;
				case 2:
					if (iterator.next() instanceof Data)
						return true;
					break;
				case 3:
					if (iterator.next() instanceof Scope)
						return true;
					break;
			}
		}

		// search for the element of the given type recursively in subpackages
		boolean elementInSubpackage = false;

		for (Iterator iterator = pack.getSubpackages().iterator(); iterator.hasNext();)
		{
			elementInSubpackage = elementInSubpackage
					| findElement((org.eclipse.jwt.meta.model.core.Package) iterator
							.next(), type);
		}

		return elementInSubpackage;
	}


	/**
	 * Calls searchPackage for the "root" package and all of its subpackages
	 * 
	 * @param pack
	 *            The "root" org.eclipse.jwt.meta.model.core.Package
	 */
	private void collect(org.eclipse.jwt.meta.model.core.Package pack)
	{

		if (pack.getElements().size() != 0)
		{
			searchPackage(pack);
		}
		if (pack.getSubpackages().size() != 0)
		{
			List subPack = pack.getSubpackages();
			for (int i = 0; i < subPack.size(); i++)
			{
				collect((org.eclipse.jwt.meta.model.core.Package) subPack.get(i));
			}
		}

	}


	/**
	 * Searches for scopes in a specific package and adds them to the Hashtable
	 * or List.
	 * 
	 * @param pack
	 *            The Package
	 */
	private void searchPackage(org.eclipse.jwt.meta.model.core.Package pack)
	{
		List elements = pack.getElements();
		for (int i = 0; i < elements.size(); i++)
		{
			if (elements.get(i) instanceof Scope)
			{
				scopeList.add((Scope) elements.get(i));
			}
		}
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	@Override
	public void dispose()
	{
		// remove listener
		if (rootPackage != null)
		{
			((EObject) rootPackage).eAdapters().remove(this);
		}

		nameField.dispose();
		authorField.dispose();
		versionField.dispose();
		modifiedField.dispose();
		documentationField.dispose();
		deleteRoleButton.dispose();
		deleteDataButton.dispose();
		deleteApplicationButton.dispose();
		deleteProcessButton.dispose();
		scopeList.clear();

		// remove viewer from selection provider
		/*
		 * editor.getSelectionSynchronizer().removeSelectionProvider(dataViewer);
		 * editor
		 * .getSelectionSynchronizer().removeSelectionProvider(roleViewer);
		 * editor
		 * .getSelectionSynchronizer().removeSelectionProvider(processViewer);
		 * editor
		 * .getSelectionSynchronizer().removeSelectionProvider(applicationViewer
		 * );
		 */

		// dispose of trees
		roleTree.dispose();
		dataTree.dispose();
		applicationTree.dispose();
		processTree.dispose();

		// set viewers to null
		roleViewer = null;
		dataViewer = null;
		applicationViewer = null;
		processViewer = null;

		main.dispose();
		main = null;
		super.dispose();
	}

	/**
	 * 
	 * Comparator which ignores casesensitivity
	 * 
	 * @author Christian Seitz (seitzchr@users.sourceforge.net)
	 */
	class CaseInsensitiveComparator implements java.util.Comparator
	{

		public int compare(Object o1, Object o2)
		{
			String s1 = o1.toString().toUpperCase();
			String s2 = o2.toString().toUpperCase();
			return s1.compareTo(s2);
		}
	}

	class RoleFilter extends ViewerFilter
	{

		/**
		 * Returns whether the given element makes it through this filter.
		 * 
		 * @param viewer
		 *            the viewer
		 * @param parentElement
		 *            the parent element
		 * @param element
		 *            the element
		 * @return <code>true</code> if element is included in the filtered set,
		 *         and <code>false</code> if excluded
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			if (element instanceof Role)
				return true;
			if (element instanceof org.eclipse.jwt.meta.model.core.Package)
			{
				return true;
			}
			return false;
		}
	}

	class DataFilter extends ViewerFilter
	{

		/**
		 * Returns whether the given element makes it through this filter.
		 * 
		 * @param viewer
		 *            the viewer
		 * @param parentElement
		 *            the parent element
		 * @param element
		 *            the element
		 * @return <code>true</code> if element is included in the filtered set,
		 *         and <code>false</code> if excluded
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			if (element instanceof Data)
				return true;
			if (element instanceof org.eclipse.jwt.meta.model.core.Package)
			{
				return true;
			}
			return false;
		}
	}

	class ApplicationFilter extends ViewerFilter
	{

		/**
		 * Returns whether the given element makes it through this filter.
		 * 
		 * @param viewer
		 *            the viewer
		 * @param parentElement
		 *            the parent element
		 * @param element
		 *            the element
		 * @return <code>true</code> if element is included in the filtered set,
		 *         and <code>false</code> if excluded
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			if (element instanceof Application)
				return true;
			if (element instanceof org.eclipse.jwt.meta.model.core.Package)
			{
				return true;
			}
			return false;
		}
	}

	class ProcessFilter extends ViewerFilter
	{

		/**
		 * Returns whether the given element makes it through this filter.
		 * 
		 * @param viewer
		 *            the viewer
		 * @param parentElement
		 *            the parent element
		 * @param element
		 *            the element
		 * @return <code>true</code> if element is included in the filtered set,
		 *         and <code>false</code> if excluded
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			if (element instanceof Activity)
				return true;
			if (element instanceof org.eclipse.jwt.meta.model.core.Package)
			{
				return true;
			}
			return false;
		}
	}

}