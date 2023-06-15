package net.unethicalite.api.magic;

import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.VarPlayer;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

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
			Static.getClient().setSelectedSpellWidget(widget.getId());
			Static.getClient().setSelectedSpellChildIndex(-1);
			Static.getClient().setSpellSelected(true);
		}
	}

	public static void cast(Spell spell)
	{
		cast(spell, 0);
	}

	public static void cast(Spell spell, int actionIndex)
	{
		Widget widget = Widgets.get(spell.getWidget());
		if (widget != null)
		{
			widget.interact(actionIndex);
		}
	}

	public static void cast(Spell spell, int actionIndex, int opcode)
	{
		Widget widget = Widgets.get(spell.getWidget());
		if (widget != null)
		{
			widget.interact(actionIndex, opcode);
		}
	}

	public static Instant getLastHomeTeleportUsage()
	{
		return Instant.ofEpochSecond(Vars.getVarp(VarPlayer.LAST_HOME_TELEPORT.getId()) * 60L);
	}

	public static boolean isHomeTeleportOnCooldown()
	{
		return !getLastHomeTeleportUsage().plus(30, ChronoUnit.MINUTES).isAfter(Instant.now());
	}
}
