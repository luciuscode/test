/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsOutlinePageExpandAllAction extends org.emftext.language.forms.resource.forms.ui.AbstractFormsOutlinePageAction {
	
	public FormsOutlinePageExpandAllAction(org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
