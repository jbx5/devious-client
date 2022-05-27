package net.unethicalite.client.minimal.plugins;

import lombok.Value;
import net.runelite.client.plugins.Plugin;

@Value
public class MinimalPluginChanged
{
	Plugin plugin;
	MinimalPluginState state;
}
