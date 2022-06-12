package net.unethicalite.api.script.blocking_events;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class BlockingEventManager
{
	@Getter
	private final Map<LoginEvent.Response, Function<LoginEvent.Response, Integer>> loginMessageHandlers =
			new HashMap<>();
	@Getter
	private final List<BlockingEvent> blockingEvents = new ArrayList<>();

	public BlockingEventManager()
	{
		blockingEvents.add(new LoginEvent(this));
		blockingEvents.add(new WelcomeScreenEvent());
		blockingEvents.add(new ResizableEvent());
		blockingEvents.add(new DeathEvent());
	}

	public void addLoginResponseHandler(LoginEvent.Response response, Function<LoginEvent.Response, Integer> handler)
	{
		loginMessageHandlers.put(response, handler);
	}

	public void removeLoginResponseHandler(LoginEvent.Response response)
	{
		loginMessageHandlers.remove(response);
	}

	public LoginEvent getLoginEvent()
	{
		return (LoginEvent) blockingEvents.stream().filter(e -> e instanceof LoginEvent)
				.findFirst()
				.orElse(null);
	}

	public boolean remove(Class<? extends BlockingEvent> clazz)
	{
		return blockingEvents.removeIf(e -> e.getClass().equals(clazz));
	}

	public boolean add(BlockingEvent event)
	{
		return blockingEvents.add(event);
	}
}
