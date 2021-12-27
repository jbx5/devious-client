package dev.hoot.bot.script.events;

import lombok.Value;

@Value
public class ScriptChanged
{
	String name;
	ScriptState state;
}
