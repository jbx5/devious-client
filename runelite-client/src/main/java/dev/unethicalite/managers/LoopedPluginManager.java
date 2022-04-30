package dev.unethicalite.managers;

import dev.unethicalite.api.plugins.LoopedPlugin;
import dev.unethicalite.api.plugins.Plugins;
import dev.unethicalite.api.plugins.SettingsPlugin;
import dev.unethicalite.api.plugins.TaskPlugin;
import dev.unethicalite.api.plugins.Task;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.plugins.config.PluginListPanel;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
@Slf4j
public class LoopedPluginManager
{
	private final EventBus eventBus;

	@Inject
	private ConfigManager configManager;

	@Inject
	private Provider<PluginListPanel> pluginListPanelProvider;

	private LoopedPlugin loopedPlugin = null;
	private Thread currentLoop = null;

	@Inject
	LoopedPluginManager(EventBus eventBus)
	{
		this.eventBus = eventBus;
		eventBus.register(this);
	}

	public void unregister()
	{
		if (currentLoop == null || loopedPlugin == null)
		{
			return;
		}

		currentLoop.interrupt();

		while (currentLoop.isAlive() || loopedPlugin.isRunning())
		{
			loopedPlugin.setRunning(false);
		}

		Plugins.stopPlugin(loopedPlugin);

		currentLoop = null;
		loopedPlugin = null;
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
			log.debug("A plugin is already running, stopping it");
			unregister();
		}

		log.debug("Registering {} as a LoopedPlugin", runnable.getClass().getSimpleName());

		loopedPlugin = (LoopedPlugin) runnable;
		loopedPlugin.setRunning(true);
		currentLoop = new Thread(runnable);
		currentLoop.start();
	}

	public boolean isPluginRegistered()
	{
		return currentLoop != null && currentLoop.isAlive() && loopedPlugin != null && loopedPlugin.isRunning();
	}

	@Subscribe
	private void onPluginChanged(PluginChanged pluginChanged)
	{
		Plugin plugin = pluginChanged.getPlugin();
		if (plugin instanceof LoopedPlugin)
		{
			if (pluginChanged.isLoaded())
			{
				log.debug("Started looped plugin");
				submit((LoopedPlugin) plugin);
				if (plugin instanceof TaskPlugin)
				{
					for (Task task : ((TaskPlugin) plugin).getTasks())
					{
						if (task.subscribe())
						{
							eventBus.register(task);
						}
					}
				}
			}
			else
			{
				log.debug("Stopped looped plugin");
				unregister();
				if (plugin instanceof TaskPlugin)
				{
					for (Task task : ((TaskPlugin) plugin).getTasks())
					{
						if (task.subscribe())
						{
							eventBus.unregister(task);
						}
					}
				}
			}
		}

		if (plugin instanceof SettingsPlugin)
		{
			SettingsPlugin settingsPlugin = (SettingsPlugin) plugin;
			PluginListPanel pluginListPanel = pluginListPanelProvider.get();
			pluginListPanel.addFakePlugin(
					new PluginConfigurationDescriptor(
							settingsPlugin.getPluginName(),
							settingsPlugin.getPluginDescription(),
							settingsPlugin.getPluginTags(),
							settingsPlugin.getConfig(),
							configManager.getConfigDescriptor(settingsPlugin.getConfig())
					)
			);
			pluginListPanel.rebuildPluginList();
		}
	}
}
