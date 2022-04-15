package dev.unethicalite.client.script;

import lombok.Value;

@Value
public class ScriptEntry
{
	Class<? extends Script> scriptClass;
	ScriptMeta meta;

	@Override
	public String toString()
	{
		return meta.value();
	}
}
