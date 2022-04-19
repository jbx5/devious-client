package dev.unethicalite.managers;

import dev.unethicalite.api.plugins.LoopedPlugin;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Slf4j
public class LoopedPluginManager
{
	@Inject
	private PluginManager pluginManager;

	private LoopedPlugin plugin = null;
	private Thread currentLoop = null;

	public void stop()
	{
		if (currentLoop == null || plugin == null)
		{
			return;
		}

		currentLoop.interrupt();

		while (currentLoop.isAlive() || plugin.isRunning())
		{
			plugin.setRunning(false);
		}

		stopPlugin();

		currentLoop = null;
		plugin = null;
	}

	public void submit(Runnable runnable)
	{
		if (!(runnable instanceof LoopedPlugin))
		{
			log.error("Only LoopedPlugins may be submitted to the LoopedPluginManager");
			return;
		}

		if (currentLoop != null && currentLoop.isAlive())
		{
			stop();
		}

		log.debug("Registering {} as a LoopedPlugin", runnable.getClass().getSimpleName());

		plugin = (LoopedPlugin) runnable;
		plugin.setRunning(true);
		currentLoop = new Thread(runnable);
		currentLoop.start();
	}

	private void stopPlugin()
	{
		try
		{
			pluginManager.setPluginEnabled(plugin, false);
			pluginManager.stopPlugin(plugin);
		}
		catch (PluginInstantiationException e)
		{
			throw new RuntimeException(e);
		}
	}

	public boolean isRunning()
	{
		return currentLoop != null && currentLoop.isAlive() && plugin != null && plugin.isRunning();
	}
}
