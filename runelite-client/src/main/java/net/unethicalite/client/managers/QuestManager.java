package net.unethicalite.client.managers;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class QuestManager
{
	@Getter
	private static final Map<Quest, QuestState> questStates = new HashMap<>();

	private Instant lastUpdateTime = Instant.EPOCH;

	@Inject
	QuestManager(EventBus eventBus)
	{
		eventBus.register(this);
		Arrays.stream(Quest.values()).forEach(it -> questStates.put(it, QuestState.NOT_STARTED));
	}

	private void loadQuestStates()
	{
		if (Game.isLoggedIn())
		{
			Client client = Static.getClient();
			GameThread.invoke(() -> Arrays.stream(Quest.values()).forEach(it -> questStates.put(it, it.getState(client))));
			lastUpdateTime = Instant.now();
		}
	}

	@Subscribe(priority = Integer.MAX_VALUE)
	public void onGameTick(GameTick event)
	{
		if (Duration.between(lastUpdateTime, Instant.now()).toSeconds() >= 60)
		{
			loadQuestStates();
		}
	}


	@Subscribe(priority = Integer.MAX_VALUE)
	public void onWidgetLoaded(WidgetLoaded event)
	{
		if (WidgetInfo.QUEST_COMPLETED_NAME_TEXT.getGroupId() == event.getGroupId())
		{
			loadQuestStates();
		}
	}
}
