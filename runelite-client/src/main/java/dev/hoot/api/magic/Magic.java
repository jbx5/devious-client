package dev.hoot.api.magic;

import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;

import java.util.Arrays;

public class Magic
{
	private static final int SPELLBOOK_VARBIT = 4070;
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
		target.interact(0, MenuAction.ITEM_USE_ON_WIDGET.getId());
	}

	public static void cast(Spell spell, NPC target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.SPELL_CAST_ON_NPC.getId());
	}

	public static void cast(Spell spell, Player target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.SPELL_CAST_ON_PLAYER.getId());
	}

	public static void cast(Spell spell, TileItem target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.SPELL_CAST_ON_GROUND_ITEM.getId());
	}

	public static void cast(Spell spell, TileObject target)
	{
		selectSpell(spell);
		target.interact(0, MenuAction.SPELL_CAST_ON_GAME_OBJECT.getId());
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

	public enum SpellBook
	{
		REGULAR(0),
		ANCIENT(1),
		LUNAR(2),
		NECROMANCY(3);

		private final int varbitValue;

		SpellBook(int varbitValue)
		{
			this.varbitValue = varbitValue;
		}

		public static SpellBook getCurrent()
		{
			return Arrays.stream(values()).filter(x -> Vars.getBit(SPELLBOOK_VARBIT) == x.varbitValue)
					.findFirst().orElse(null);
		}
	}
}
