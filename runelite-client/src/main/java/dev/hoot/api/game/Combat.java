package dev.hoot.api.game;

import dev.hoot.api.entities.NPCs;
import dev.hoot.api.entities.Players;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.VarPlayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Combat {
	private static final int POISON_VARP = 102;
	private static final int SPEC_VARP = 301;
	private static final int SPEC_ENERGY_VARP = 300;
	private static final Supplier<Widget> SPEC_BUTTON = () -> Widgets.get(593, 36);

	public static boolean isRetaliating() {
		return Vars.getVarp(VarPlayer.AUTO_RETALIATE.getId()) == 0;
	}

	public static boolean isPoisoned() {
		return Vars.getVarp(POISON_VARP) > 0;
	}

	public static boolean isSpecEnabled() {
		return Vars.getVarp(SPEC_VARP) == 1;
	}

	public static int getSpecEnergy() {
		return Vars.getVarp(SPEC_ENERGY_VARP) / 10;
	}

	public static void toggleSpec() {
		if (isSpecEnabled()) {
			return;
		}

		Widget spec = SPEC_BUTTON.get();
		if (spec != null) {
			spec.interact(0);
		}
	}

	public static void setAttackStyle(AttackStyle attackStyle) {
		if (attackStyle.widgetInfo == null) {
			return;
		}

		Widget widget = Widgets.get(attackStyle.widgetInfo);
		if (widget != null) {
			widget.interact(0);
		}
	}

	public static AttackStyle getAttackStyle() {
		return AttackStyle.fromIndex(Vars.getVarp(43));
	}

	public static NPC getAttackableNPC(int... ids) {
		return getAttackableNPC(x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static NPC getAttackableNPC(String... names) {
		return getAttackableNPC(x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static NPC getAttackableNPC(Predicate<NPC> filter) {
		Player local = Players.getLocal();
		NPC attackingMe = NPCs.getNearest(x -> x.hasAction("Attack") && Players.getNearest(p -> p.getInteracting() != null
						&& p.getInteracting().equals(x)) == null && x.getInteracting() != null && x.getInteracting().equals(local)
						&& filter.test(x));
		if (attackingMe != null) {
			return attackingMe;
		}

		return NPCs.getNearest(x -> x.hasAction("Attack") && Players.getNearest(p -> p.getInteracting() != null
						&& p.getInteracting().equals(x)) == null && x.getInteracting() == null && filter.test(x));
	}

	public static int getCurrentHealth() {
		return Skills.getBoostedLevel(Skill.HITPOINTS);
	}

	public static int getMissingHealth() {
		return Skills.getLevel(Skill.HITPOINTS) - Skills.getBoostedLevel(Skill.HITPOINTS);
	}

	public static double getHealthPercent() {
		return ((double) getCurrentHealth() / Skills.getLevel(Skill.HITPOINTS)) * 100;
	}

	public enum AttackStyle {
		FIRST(0, WidgetInfo.COMBAT_STYLE_ONE),
		SECOND(1, WidgetInfo.COMBAT_STYLE_TWO),
		THIRD(2, WidgetInfo.COMBAT_STYLE_THREE),
		FOURTH(3, WidgetInfo.COMBAT_STYLE_FOUR),
		SPELLS(4, WidgetInfo.COMBAT_SPELL_BOX),
		SPELLS_DEFENSIVE(4, WidgetInfo.COMBAT_DEFENSIVE_SPELL_BOX),
		UNKNOWN(-1, null);

		private final int index;
		private final WidgetInfo widgetInfo;

		AttackStyle(int index, WidgetInfo widgetInfo) {
			this.index = index;
			this.widgetInfo = widgetInfo;
		}

		public int getIndex() {
			return index;
		}

		public WidgetInfo getWidgetInfo() {
			return widgetInfo;
		}

		public static AttackStyle fromIndex(int index) {
			return Arrays.stream(values()).filter(x -> x.index == index)
							.findFirst()
							.orElse(UNKNOWN);
		}
	}
}
