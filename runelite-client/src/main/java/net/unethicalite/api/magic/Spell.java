package net.unethicalite.api.magic;

import net.unethicalite.api.Interactable;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.WidgetInfo;

public interface Spell
{
	int getLevel();

	WidgetInfo getWidget();

	boolean canCast();

	default void cast()
	{
		Magic.cast(this);
	}

	default void castOn(Interactable interactable)
	{
		if (interactable instanceof Item)
		{
			Magic.cast(this, (Item) interactable);
			return;
		}

		if (interactable instanceof NPC)
		{
			Magic.cast(this, (NPC) interactable);
			return;
		}

		if (interactable instanceof Player)
		{
			Magic.cast(this, (Player) interactable);
			return;
		}

		if (interactable instanceof TileItem)
		{
			Magic.cast(this, (TileItem) interactable);
			return;
		}

		if (interactable instanceof TileObject)
		{
			Magic.cast(this, (TileObject) interactable);
		}
	}
}
