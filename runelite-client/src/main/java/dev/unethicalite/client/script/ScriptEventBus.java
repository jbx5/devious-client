package dev.unethicalite.client.script;

import dev.unethicalite.managers.Static;

import java.util.ArrayList;
import java.util.List;

public class ScriptEventBus
{
	private static final List<Object> SUBSCRIPTIONS = new ArrayList<>();

	public static void subscribe(Object listener)
	{
		Static.getEventBus().register(listener);
		SUBSCRIPTIONS.add(listener);
	}

	public static void unregister(Object listener)
	{
		Static.getEventBus().unregister(listener);
		SUBSCRIPTIONS.remove(listener);
	}

	public static void clear()
	{
		SUBSCRIPTIONS.forEach(Static.getEventBus()::unregister);
		SUBSCRIPTIONS.clear();
	}
}
