package dev.hoot.bot.script;

import net.runelite.client.eventbus.EventBus;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class ScriptEventBus
{
	@Inject
	private static EventBus eventBus;

	private static final List<Object> SUBSCRIPTIONS = new ArrayList<>();

	public static void subscribe(Object listener)
	{
		eventBus.register(listener);
		SUBSCRIPTIONS.add(listener);
	}

	public static void unregister(Object listener)
	{
		eventBus.unregister(listener);
		SUBSCRIPTIONS.remove(listener);
	}

	public static void clear()
	{
		SUBSCRIPTIONS.forEach(eventBus::unregister);
		SUBSCRIPTIONS.clear();
	}
}
