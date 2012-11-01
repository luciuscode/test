/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

public class FormsUIMetaInformation extends org.emftext.language.forms.resource.forms.mopp.FormsMetaInformation {
	
	public org.emftext.language.forms.resource.forms.IFormsHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.forms.resource.forms.ui.FormsHoverTextProvider();
	}
	
	public org.emftext.language.forms.resource.forms.ui.FormsImageProvider getImageProvider() {
		return org.emftext.language.forms.resource.forms.ui.FormsImageProvider.INSTANCE;
	}
	
	public org.emftext.language.forms.resource.forms.ui.FormsColorManager createColorManager() {
		return new org.emftext.language.forms.resource.forms.ui.FormsColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.forms.resource.forms.IFormsTextResource,
	 * org.emftext.language.forms.resource.forms.ui.FormsColorManager) instead.
	 */
	public org.emftext.language.forms.resource.forms.ui.FormsTokenScanner createTokenScanner(org.emftext.language.forms.resource.forms.ui.FormsColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.forms.resource.forms.ui.FormsTokenScanner createTokenScanner(org.emftext.language.forms.resource.forms.IFormsTextResource resource, org.emftext.language.forms.resource.forms.ui.FormsColorManager colorManager) {
		return new org.emftext.language.forms.resource.forms.ui.FormsTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.forms.resource.forms.ui.FormsCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.forms.resource.forms.ui.FormsCodeCompletionHelper();
	}
	
}
