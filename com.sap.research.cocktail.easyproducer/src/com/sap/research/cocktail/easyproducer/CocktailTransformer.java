package com.sap.research.cocktail.easyproducer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.service.component.ComponentContext;

import com.sap.research.cocktail.Preference;
import com.sap.research.cocktail.model.ModelIO;
import com.sap.research.cocktail.model.variability.BindingTime;
import com.sap.research.cocktail.model.variability.Container;
import com.sap.research.cocktail.model.variability.ResolutionElement;
import com.sap.research.cocktail.model.variability.VariabilityModel;
import com.sap.research.cocktail.model.variability.VariabilityResolution;
import com.sap.research.cocktail.model.variability.VariableElement;

import de.uni_hildesheim.sse.easy_producer.instantiator.InstantiatorEngine;
import de.uni_hildesheim.sse.easy_producer.instantiator.InstantiatorException;
import de.uni_hildesheim.sse.easy_producer.instantiator.Transformator;
import de.uni_hildesheim.sse.model.confModel.CompoundVariable;
import de.uni_hildesheim.sse.model.confModel.Configuration;
import de.uni_hildesheim.sse.model.confModel.DecisionVariable;
import de.uni_hildesheim.sse.model.varModel.Project;
import de.uni_hildesheim.sse.persistency.xml.XmlIo;

public class CocktailTransformer extends InstantiatorEngine {

	List<DecisionVariable> variables = new LinkedList<DecisionVariable>();

	ILog log = Activator.getDefault().getLog();

	protected void activate(ComponentContext context) {
		Transformator.addEngine(this);
	}

	protected void deactivate(ComponentContext context) {
		Transformator.removeEngine(this);
	}

	@Override
	protected void addValue2Context(DecisionVariable decision) {
		variables.add(decision);
		System.out.println("added: " + decision.getDeclaration().getName()
				+ " -> " + decision.getValue().getValue().toString());
	}

	@Override
	protected void clearContext() {
		variables.clear();
	}

	@Override
	protected void initEngine() {

	}

	@Override
	public void instantiate() throws InstantiatorException {

		writeResolution();

		writeVariabilityModel();
		
		exportIvmlModel(getPLP().getConfiguration().getProject());
		//exportParentIvmlModel();
		
		
		
		runBuildJob();
		
	}

	private void exportIvmlModel(Project project) {
		FileOutputStream out;
		try {
			out = new FileOutputStream(getPLP().getProjectLocation().getAbsolutePath() + "/" + project.getName() + ".ivml.xml");
			XmlIo.write(project, out);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//parents are included in the export of a children
		//so we dont need to export parents too
		for(int i = 0; i < project.getImportsCount(); ++i)
			if (project.getImport(i).isResolved())
					exportIvmlModel(project.getImport(i).getResolved());
	}

//	private void exportParentIvmlModel() {
//		FileOutputStream out;
//		try {
//			out = new FileOutputStream(getPLP().getProjectLocation().getAbsolutePath() + "/parentIvmlModel.xml");
//			XmlIo.write(getPLP().getConfiguration().getParent().getConfiguration().getProject(), out);
//			out.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	// TODO: for now just flat
	// later add it with groups in hierarchy
	private void writeVariabilityModel() {

		VariabilityModel vm = mapVariabilityModel(this.getPLP().getConfiguration());

		IProject curProject = getCurrentProject();

		if (curProject == null) {
			log.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Cannot find project for plp project"));
			return;
		}

		Preference.setVariabilityModelPreference(getPLP().getProjectName()
				+ ".var", curProject);
		ModelIO.updateModel(vm, curProject, null);
	}

	/**
	 * Hierarchical variables will be mapped as
	 * VariableName
	 * VariableName_SubVariable1
	 * VariableName_SubVariable2
	 * 
	 * in the cocktailmodel
	 * 
	 * @param config
	 * @return
	 */
	private VariabilityModel mapVariabilityModel(Configuration config) {
		VariabilityModel model = new VariabilityModel();

		for (DecisionVariable decision : config) 
			mapDecisionVariable(model, decision);
		
		
		

		return model;
	}

	private void mapDecisionVariable(Container curContainer,
			DecisionVariable decision) {
		
		if (!(decision instanceof CompoundVariable))
		{
			VariableElement element = new VariableElement();
			element.setDerived(false);
			element.setName(decision.getDeclaration().getName());
			curContainer.getElements().add(element);
		}
		else //compound variable
		{
			CompoundVariable cv = (CompoundVariable) decision;
			
			Container c = new Container();
			c.setName(decision.getDeclaration().getName());
			c.setParent(curContainer);
			curContainer.getChildContainers().add(c);
			
			
			for(int i = 0; i < cv.getNestedElementsCount(); ++i) {
				DecisionVariable nestedElement = cv.getNestedElement(i);
				mapDecisionVariable(c, nestedElement);
			}
			
		}
		
	}


	private void writeResolution() {
		// write resolution file
		VariabilityResolution resolution = createResolutionModel(this.getPLP().getConfiguration());

		IProject curProject = getCurrentProject();

		if (curProject == null) {
			log.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Cannot find project for plp project"));
			return;
		}

		Preference.setResolutionPreference("resolution.res", curProject);
		ModelIO.updateResolution(resolution, curProject, null);
	}


	private VariabilityResolution createResolutionModel(Configuration config) {
		VariabilityResolution resolution = new VariabilityResolution();


		for (DecisionVariable v : config) {
			mapResolutionElement(resolution, v, v.getDeclaration().getName());
		}
		return resolution;
	}

	private void mapResolutionElement(VariabilityResolution resolution,
			DecisionVariable v, String name) {
		//no element needs to be created for compound variables at all
		if (!(v instanceof CompoundVariable) 
				&& v.getValue() != null)
		{
			ResolutionElement e = new ResolutionElement();

			e.setResolves(name);
			e.setValue(v.getValue().getValue().toString());
			e.setBindingTime(BindingTime.COMPILE_TIME);
	
			resolution.getResolutionElements().add(e);
		}
		
		
		if (v instanceof CompoundVariable){
			CompoundVariable cv = (CompoundVariable) v;
			
			for(int i = 0; i < cv.getNestedElementsCount(); ++i) {
				DecisionVariable nestedElement = cv.getNestedElement(i);
				mapResolutionElement(resolution, nestedElement, name + "_" + nestedElement.getDeclaration().getName());
			}
			
		}
		
	}

	private IProject getCurrentProject() {
		IProject curProject = null;
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (IProject p : projects) {
			if (p.getName().equals(getPLP().getProjectName())) {
				curProject = p;
			}
		}
		return curProject;
	}
	
	private void runBuildJob() {
		WorkspaceJob job = new WorkspaceJob("resolve") {
			
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor)
					throws CoreException {
				getCurrentProject().getProject().build(
						IncrementalProjectBuilder.CLEAN_BUILD, null);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
}
