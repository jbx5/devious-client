package dev.unethicalite.client.script.events;

import lombok.Value;

@Value
public class ScriptChanged
{
	String name;
	ScriptState state;
}
