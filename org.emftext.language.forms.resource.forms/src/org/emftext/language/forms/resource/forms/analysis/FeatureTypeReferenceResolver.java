/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.analysis;

public class FeatureTypeReferenceResolver implements org.emftext.language.forms.resource.forms.IFormsReferenceResolver<org.emftext.language.forms.Feature, org.emftext.language.forms.Type> {
	
	private org.emftext.language.forms.resource.forms.analysis.FormsDefaultResolverDelegate<org.emftext.language.forms.Feature, org.emftext.language.forms.Type> delegate = new org.emftext.language.forms.resource.forms.analysis.FormsDefaultResolverDelegate<org.emftext.language.forms.Feature, org.emftext.language.forms.Type>();
	
	public void resolve(String identifier, org.emftext.language.forms.Feature container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.forms.resource.forms.IFormsReferenceResolveResult<org.emftext.language.forms.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.forms.Type element, org.emftext.language.forms.Feature container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
