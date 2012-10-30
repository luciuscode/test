/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.analysis;

public class FormsTEXTTokenResolver implements org.emftext.language.forms.resource.forms.IFormsTokenResolver {
	
	private org.emftext.language.forms.resource.forms.analysis.FormsDefaultTokenResolver defaultTokenResolver = new org.emftext.language.forms.resource.forms.analysis.FormsDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.forms.resource.forms.IFormsTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
