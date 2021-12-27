package dev.hoot.bot.script;

import lombok.Value;

@Value
public class ScriptEntry
{
	Class<? extends BotScript> scriptClass;
	ScriptMeta meta;

	@Override
	public String toString()
	{
		return meta.value();
	}
}
