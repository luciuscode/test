package com.my.shop.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.my.shop.Product;

public class SetPriceCommand extends SetCommand {
	public SetPriceCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
	}

	public void doExecute() {
		Product product = (Product) owner;
		double newPrice = ((Double) value).doubleValue();
		newPrice = Math.max(0, newPrice);
		newPrice = Math.round(newPrice * 100);
		product.setPrice(newPrice);
	}
}
