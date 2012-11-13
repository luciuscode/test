package library.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import schoollibrary.SchoolBook;

public class SetBookPrice extends SetCommand{

	public SetBookPrice(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		super(domain, owner, feature, value);
		// TODO Auto-generated constructor stub
	}
	  public void doExecute() {
		  SchoolBook sb = (SchoolBook) owner;
		  float price = (float)value;
		  sb.setValue(price*10);
	  }
}
