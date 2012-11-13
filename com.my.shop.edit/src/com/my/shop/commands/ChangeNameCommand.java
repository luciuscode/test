package com.my.shop.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.my.shop.Product;

public class ChangeNameCommand extends SetCommand{

	public ChangeNameCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
		// TODO Auto-generated constructor stub
	}
	public void doExecute() {
		Product product = (Product) owner;
		String name = (String)value+": sold";
		product.setName(name);
	}
}
