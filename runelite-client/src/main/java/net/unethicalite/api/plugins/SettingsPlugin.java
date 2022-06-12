package net.unethicalite.api.plugins;

import net.runelite.client.config.Config;
import net.runelite.client.plugins.Plugin;

public abstract class SettingsPlugin extends Plugin
{
	public abstract Config getConfig();

	public abstract String getPluginName();

	public abstract String getPluginDescription();

	public abstract String[] getPluginTags();
}
