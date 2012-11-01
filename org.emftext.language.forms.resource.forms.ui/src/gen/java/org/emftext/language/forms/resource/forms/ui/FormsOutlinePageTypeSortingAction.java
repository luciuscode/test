/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsOutlinePageTypeSortingAction extends org.emftext.language.forms.resource.forms.ui.AbstractFormsOutlinePageAction {
	
	public FormsOutlinePageTypeSortingAction(org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
