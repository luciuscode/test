/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsOutlinePageLinkWithEditorAction extends org.emftext.language.forms.resource.forms.ui.AbstractFormsOutlinePageAction {
	
	public FormsOutlinePageLinkWithEditorAction(org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
