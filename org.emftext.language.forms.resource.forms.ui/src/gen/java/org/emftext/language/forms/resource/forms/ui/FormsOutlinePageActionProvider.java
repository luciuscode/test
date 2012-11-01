/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.forms.resource.forms.ui.FormsOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
