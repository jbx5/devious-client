package dev.unethicalite.client.minimal.plugins;

import lombok.Value;

@Value
public class MinimalPluginChanged
{
	String name;
	MinimalPluginState state;
}
