package net.unethicalite.client.minimal.config;

import lombok.Value;
import net.runelite.client.config.ConfigDescriptor;

@Value
public class ConfigurationDescriptor
{
	String name;
	String description;
	ConfigDescriptor configDescriptor;

	public boolean hasConfigurables()
	{
		return configDescriptor != null && !configDescriptor.getItems().stream().allMatch(x -> x.getItem().hidden());
	}
}
