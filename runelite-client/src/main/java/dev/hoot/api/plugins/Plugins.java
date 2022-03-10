package dev.hoot.api.plugins;

import dev.hoot.bot.managers.Static;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Singleton;

@Singleton
@Slf4j
public class Plugins
{
	public static PluginManager getPluginManager()
	{
		return Static.getPluginManager();
	}

	public static boolean isPluginEnabled(Plugin plugin)
	{
		return getPluginManager().isPluginEnabled(plugin);
	}

	public static boolean stopPlugin(Plugin plugin)
	{
		try
		{
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
