/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsAnnotationModelFactory implements org.eclipse.core.filebuffers.IAnnotationModelFactory {
	
	public org.eclipse.jface.text.source.IAnnotationModel createAnnotationModel(org.eclipse.core.runtime.IPath location) {
		org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
		org.eclipse.core.resources.IWorkspaceRoot root = workspace.getRoot();
		org.eclipse.core.resources.IResource resource = root.findMember(location);
		return new org.emftext.language.forms.resource.forms.ui.FormsAnnotationModel(resource);
	}
	
}
