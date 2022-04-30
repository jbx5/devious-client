package dev.unethicalite.client.minimal.script.blocking_events;

public abstract class BlockingEvent
{
	public abstract boolean validate();

	public abstract int loop();
}
