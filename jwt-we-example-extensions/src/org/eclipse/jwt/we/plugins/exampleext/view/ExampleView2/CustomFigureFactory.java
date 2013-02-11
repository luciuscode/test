package org.eclipse.jwt.we.plugins.exampleext.view.ExampleView2;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jwt.meta.model.processes.Action;
import org.eclipse.jwt.meta.model.processes.FinalNode;
import org.eclipse.jwt.meta.model.processes.InitialNode;
import org.eclipse.jwt.we.figures.IFigureFactory;
import org.eclipse.jwt.we.plugins.exampleext.view.ExampleView2.figures.CustomActionFigure;
import org.eclipse.jwt.we.plugins.exampleext.view.ExampleView2.figures.CustomFinalNodeFigure;
import org.eclipse.jwt.we.plugins.exampleext.view.ExampleView2.figures.CustomInitialNodeFigure;


/**
 * A custom figure factory that exchanges some Draw2D figures of JWT.
 */
public class CustomFigureFactory
		implements IFigureFactory
{

	/* (non-Javadoc)
	 * @see org.eclipse.jwt.we.figures.IFigureFactory#createFigure(java.lang.Class)
	 */
	public IFigure createFigure(Class modelType)
	{
		if (modelType.isAssignableFrom(InitialNode.class))
		{
			// replace the final node figure with the initial node figure
			return new CustomInitialNodeFigure();
		}
		else if (modelType.isAssignableFrom(FinalNode.class))
		{
			// replace the initial node figure with the final node figure
			return new CustomFinalNodeFigure();
		}
		else if (modelType.isAssignableFrom(Action.class))
		{
			// replace the action figure with a new action figure
			return new CustomActionFigure();
		}

		// use the standard figures for all other model elements
		return null;
	}

}
