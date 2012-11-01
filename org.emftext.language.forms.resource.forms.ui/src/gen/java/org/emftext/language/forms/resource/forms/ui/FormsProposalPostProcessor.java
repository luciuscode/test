/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.forms.resource.forms.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class FormsProposalPostProcessor {
	
	public java.util.List<org.emftext.language.forms.resource.forms.ui.FormsCompletionProposal> process(java.util.List<org.emftext.language.forms.resource.forms.ui.FormsCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
