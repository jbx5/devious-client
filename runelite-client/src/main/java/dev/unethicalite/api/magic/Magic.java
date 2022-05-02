package dev.unethicalite.api.magic;

import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.game.Vars;
import dev.unethicalite.api.widgets.Widgets;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;

public class Magic
{
	private static final int AUTOCAST_VARP = 108;

	public static boolean isAutoCasting()
	{
		return Vars.getVarp(AUTOCAST_VARP) != 0;
	}

	public static boolean isSpellSelected(Spell spell)
	{
		Widget widget = Widgets.get(spell.getWidget());
		if (widget != null)
		{
			return widget.getBorderType() == 2;
		}

		return false;
	}

	public static void cast(Spell spell, Item target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
	}

	public static void cast(Spell spell, NPC target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.WIDGET_TARGET_ON_NPC.getId());
	}

	public static void cast(Spell spell, Player target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.WIDGET_TARGET_ON_PLAYER.getId());
	}

	public static void cast(Spell spell, TileItem target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId());

	}

	public static void cast(Spell spell, TileObject target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.getId());
	}

	public static void selectSpell(Spell spell)
	{
		Widget widget = Widgets.get(spell.getWidget());
		if (widget != null)
		{
			Game.getClient().setSelectedSpellWidget(widget.getId());
		}
	}

	public static void cast(Spell spell)
	{
		Widget widget = Widgets.get(spell.getWidget());
		if (widget != null)
		{
			widget.interact(0);
		}
	}
}
