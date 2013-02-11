package org.eclipse.jwt.we.plugins.exampleext;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class PluginProperties
{

	private static final String BUNDLE_NAME = "plugin"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);


	private PluginProperties()
	{
	}


	public static String getString(String key)
	{
		try
		{
			return RESOURCE_BUNDLE.getString(key);
		}
		catch (MissingResourceException e)
		{
			return '!' + key + '!';
		}
	}
}
