package net.unethicalite.api.plugins;

import net.unethicalite.client.Static;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Singleton;
import javax.swing.SwingUtilities;

@Singleton
@Slf4j
public class Plugins
{
	public static PluginManager getPluginManager()
	{
		return Static.getPluginManager();
	}

	public static boolean isEnabled(Plugin plugin)
	{
		return getPluginManager().isPluginEnabled(plugin);
	}

	public static boolean isEnabled(String configGroup)
	{
		return Static.getConfigManager().getConfiguration(RuneLiteConfig.GROUP_NAME, configGroup, Boolean.class);
	}

	public static boolean stopPlugin(Plugin plugin)
	{
		try
		{
			assert SwingUtilities.isEventDispatchThread();
			getPluginManager().remove(plugin);
			getPluginManager().setPluginEnabled(plugin, false);
			return getPluginManager().stopPlugin(plugin);
		}
		catch (PluginInstantiationException e)
		{
			log.error("Failed to stop plugin {}, error: {}", plugin.getClass().getSimpleName(), e);
			return false;
		}
	}

	public static boolean startPlugin(Plugin plugin)
	{
		try
		{
			getPluginManager().setPluginEnabled(plugin, true);
			return getPluginManager().startPlugin(plugin);
		}
		catch (PluginInstantiationException e)
		{
			log.error("Failed to start plugin {}, error: {}", plugin.getClass().getSimpleName(), e);
			return false;
		}
	}
}
