package dev.hoot.api.plugins;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.plugins.config.PluginListPanel;

import javax.inject.Inject;
import javax.inject.Provider;

public abstract class SettingsPlugin extends Plugin
{
    @Inject
    private ConfigManager configManager;

    @Inject
    private Provider<PluginListPanel> pluginListPanelProvider;

    @Override
    protected void startUp() throws Exception
    {
        PluginListPanel pluginListPanel = pluginListPanelProvider.get();
        pluginListPanel.addFakePlugin(
                new PluginConfigurationDescriptor(
                        getPluginName(), getPluginDescription(), getPluginTags(),
                        getConfig(), configManager.getConfigDescriptor(getConfig())
                )
        );
        pluginListPanel.rebuildPluginList();
    }

    protected abstract Config getConfig();

    protected abstract String getPluginName();

    protected abstract String getPluginDescription();

    protected abstract String[] getPluginTags();
}
