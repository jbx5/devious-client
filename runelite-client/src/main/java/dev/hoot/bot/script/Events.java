package dev.hoot.bot.script;

import net.runelite.client.eventbus.EventBus;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class Events
{
	@Inject
	private static EventBus eventBus;
	private static final List<Object> LISTENERS = new ArrayList<>();

	public static void subscribe(Object listener)
	{
		eventBus.register(listener);
		LISTENERS.add(listener);
	}

	public static void unregister(Object listener)
	{
		eventBus.unregister(listener);
		LISTENERS.remove(listener);
	}

	public static void clear()
	{
		LISTENERS.forEach(eventBus::unregister);
		LISTENERS.clear();
	}
}
