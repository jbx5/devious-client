package dev.unethicalite.api.plugins;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.plugins.config.PluginListPanel;

import javax.inject.Inject;
import javax.inject.Provider;

public abstract class SettingsPlugin extends Plugin
{
	public abstract Config getConfig();

	public abstract String getPluginName();

	public abstract String getPluginDescription();

	public abstract String[] getPluginTags();
}
