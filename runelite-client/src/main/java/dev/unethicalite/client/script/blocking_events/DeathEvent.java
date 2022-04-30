package dev.unethicalite.client.script.blocking_events;

import dev.unethicalite.api.entities.NPCs;
import dev.unethicalite.api.entities.Players;
import dev.unethicalite.api.entities.TileObjects;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.widgets.Dialog;
import dev.unethicalite.api.widgets.Widgets;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;

import java.util.List;
import java.util.stream.Collectors;

public class DeathEvent extends BlockingEvent
{
	@Override
	public boolean validate()
	{
		return Game.getClient().isInInstancedRegion() && NPCs.getNearest("Death") != null;
	}

	@Override
	public int loop()
	{
		if (Players.getLocal().isMoving())
		{
			return 1000;
		}

		NPC death = NPCs.getNearest("Death");
		if (!Dialog.isOpen())
		{
			death.interact("Talk-to");
			return 1000;
		}

		if (Dialog.canContinue())
		{
			Dialog.continueSpace();
			return 1000;
		}

		if (Dialog.isViewingOptions())
		{
			List<Widget> completedDialogs = Dialog.getOptions().stream()
					.filter(x -> x.getText() != null && x.getText().contains("<str>"))
					.collect(Collectors.toList());
			if (completedDialogs.size() >= 4)
			{
				TileObject portal = TileObjects.getNearest("Portal");
				if (portal != null)
				{
					portal.interact("Use");
					return 1000;
				}
			}

			Widget incompleteDialog = Dialog.getOptions().stream()
					.filter(x -> !completedDialogs.contains(x))
					.findFirst()
					.orElse(null);
			if (Widgets.isVisible(incompleteDialog))
			{
				Dialog.chooseOption(Dialog.getOptions().indexOf(incompleteDialog) + 1);
			}
		}

		return 1000;
	}
}
