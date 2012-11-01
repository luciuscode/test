/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsHoverTextProvider implements org.emftext.language.forms.resource.forms.IFormsHoverTextProvider {
	
	private org.emftext.language.forms.resource.forms.ui.FormsDefaultHoverTextProvider defaultProvider = new org.emftext.language.forms.resource.forms.ui.FormsDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
