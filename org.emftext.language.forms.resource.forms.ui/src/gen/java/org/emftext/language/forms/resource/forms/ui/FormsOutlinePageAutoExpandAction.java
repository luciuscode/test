/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsOutlinePageAutoExpandAction extends org.emftext.language.forms.resource.forms.ui.AbstractFormsOutlinePageAction {
	
	public FormsOutlinePageAutoExpandAction(org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
