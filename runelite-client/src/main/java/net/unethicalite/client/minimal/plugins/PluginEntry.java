package net.unethicalite.client.minimal.plugins;

import lombok.Value;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.plugins.Script;

import java.util.jar.Manifest;

@Value
public class PluginEntry
{
	Class<? extends Plugin> scriptClass;
	PluginDescriptor meta;
	Manifest manifest;

	@Override
	public String toString()
	{
		return meta.name();
	}

	public boolean isScript()
	{
		return Script.class.isAssignableFrom(scriptClass);
	}
}
