package net.unethicalite.api.script.blocking_events;

import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

import java.util.List;
import java.util.stream.Collectors;

public class DeathEvent extends BlockingEvent
{
	@Override
	public boolean validate()
	{
		return Static.getClient().isInInstancedRegion() && NPCs.getNearest("Death") != null;
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

			Dialog.getOptions().stream()
					.filter(x -> !completedDialogs.contains(x))
					.findFirst().ifPresent(incompleteDialog -> Dialog.chooseOption(Dialog.getOptions().indexOf(incompleteDialog) + 1));
		}

		return 1000;
	}
}
