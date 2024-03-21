package net.unethicalite.api.magic;

import net.runelite.api.ItemID;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

import java.util.Arrays;

public enum SpellBook
{
	STANDARD(0),
	ANCIENT(1),
	LUNAR(2),
	NECROMANCY(3);

	private static final int SPELLBOOK_VARBIT = 4070;

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

	public enum Standard implements Spell
	{
		// Teleport spells
		HOME_TELEPORT(
				0,
				WidgetInfo.SPELL_LUMBRIDGE_HOME_TELEPORT,
				false
		),
		VARROCK_TELEPORT(
				25,
				WidgetInfo.SPELL_VARROCK_TELEPORT,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(1, Rune.LAW)
		),
		LUMBRIDGE_TELEPORT(
				31,
				WidgetInfo.SPELL_LUMBRIDGE_TELEPORT,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.LAW)
		),
		FALADOR_TELEPORT(
				37,
				WidgetInfo.SPELL_FALADOR_TELEPORT,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(1, Rune.LAW)
		),
		TELEPORT_TO_HOUSE(
				40,
				WidgetInfo.SPELL_TELEPORT_TO_HOUSE,
				true,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.LAW)
		),
		CAMELOT_TELEPORT(
				45,
				WidgetInfo.SPELL_CAMELOT_TELEPORT,
				true,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(1, Rune.LAW)
		),
		TELEPORT_TO_KOUREND(
			48,
			WidgetInfo.SPELL_KOUREND_HOME_TELEPORT,
			true,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.WATER),
			new RuneRequirement(1, Rune.FIRE)
		),
		ARDOUGNE_TELEPORT(
				51,
				WidgetInfo.SPELL_ARDOUGNE_TELEPORT,
				true,
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(2, Rune.LAW)
		),
		CIVITAS_ILLA_FORTIS_TELEPORT(
			54,
			WidgetInfo.SPELL_CIVITAS_ILLA_FORTIS_TELEPORT,
			true,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.FIRE)
		),
		WATCHTOWER_TELEPORT(
				58,
				WidgetInfo.SPELL_WATCHTOWER_TELEPORT,
				true,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(2, Rune.LAW)
		),
		TROLLHEIM_TELEPORT(
				61,
				WidgetInfo.SPELL_TROLLHEIM_TELEPORT,
				true,
				new RuneRequirement(2, Rune.FIRE),
				new RuneRequirement(2, Rune.LAW)
		),
		TELEPORT_TO_APE_ATOLL(
				64,
				WidgetInfo.SPELL_TELEPORT_TO_APE_ATOLL,
				true,
				new RuneRequirement(2, Rune.FIRE),
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(2, Rune.LAW)
		),
		TELEOTHER_LUMBRIDGE(
				74,
				WidgetInfo.SPELL_TELEOTHER_LUMBRIDGE,
				true,
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.LAW),
				new RuneRequirement(1, Rune.SOUL)
		),
		TELEOTHER_FALADOR(
				82,
				WidgetInfo.SPELL_TELEOTHER_FALADOR,
				true,
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(1, Rune.LAW),
				new RuneRequirement(1, Rune.SOUL)
		),
		TELEPORT_TO_BOUNTY_TARGET(
				85,
				WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT,
				true,
				new RuneRequirement(1, Rune.CHAOS),
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(1, Rune.LAW)
		),
		TELEOTHER_CAMELOT(
				90,
				WidgetInfo.SPELL_TELEOTHER_CAMELOT,
				true,
				new RuneRequirement(1, Rune.LAW),
				new RuneRequirement(2, Rune.SOUL)
		),

		// Strike spells
		WIND_STRIKE(
				1,
				WidgetInfo.SPELL_WIND_STRIKE,
				false,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.MIND)
		),
		WATER_STRIKE(
				5,
				WidgetInfo.SPELL_WATER_STRIKE,
				false,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(1, Rune.MIND)
		),
		EARTH_STRIKE(
				9,
				WidgetInfo.SPELL_EARTH_STRIKE,
				false,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(1, Rune.MIND)
		),
		FIRE_STRIKE(
				13,
				WidgetInfo.SPELL_FIRE_STRIKE,
				false,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(3, Rune.FIRE),
				new RuneRequirement(1, Rune.MIND)
		),

		// Bolt spells
		WIND_BOLT(
				17,
				WidgetInfo.SPELL_WIND_BOLT,
				false,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(1, Rune.CHAOS)
		),
		WATER_BOLT(
				23,
				WidgetInfo.SPELL_WATER_BOLT,
				false,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(1, Rune.CHAOS)
		),
		EARTH_BOLT(
				29,
				WidgetInfo.SPELL_EARTH_BOLT,
				false,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(3, Rune.EARTH),
				new RuneRequirement(1, Rune.CHAOS)
		),
		FIRE_BOLT(
				35,
				WidgetInfo.SPELL_FIRE_BOLT,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(4, Rune.FIRE),
				new RuneRequirement(1, Rune.CHAOS)
		),

		// Blast spells
		WIND_BLAST(
				41,
				WidgetInfo.SPELL_WIND_BLAST,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.DEATH)
		),
		WATER_BLAST(
				47,
				WidgetInfo.SPELL_WATER_BLAST,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(1, Rune.DEATH)
		),
		EARTH_BLAST(
				53,
				WidgetInfo.SPELL_EARTH_BLAST,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(4, Rune.EARTH),
				new RuneRequirement(1, Rune.DEATH)
		),
		FIRE_BLAST(
				59,
				WidgetInfo.SPELL_FIRE_BLAST,
				false,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(1, Rune.DEATH)
		),

		// Wave spells
		WIND_WAVE(
				62,
				WidgetInfo.SPELL_WIND_WAVE,
				true,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(1, Rune.BLOOD)
		),
		WATER_WAVE(
				65,
				WidgetInfo.SPELL_WATER_WAVE,
				true,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(7, Rune.WATER),
				new RuneRequirement(1, Rune.BLOOD)
		),
		EARTH_WAVE(
				70,
				WidgetInfo.SPELL_EARTH_WAVE,
				true,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(7, Rune.EARTH),
				new RuneRequirement(1, Rune.BLOOD)
		),
		FIRE_WAVE(
				75,
				WidgetInfo.SPELL_FIRE_WAVE,
				true,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(7, Rune.FIRE),
				new RuneRequirement(1, Rune.BLOOD)
		),

		// Surge spells
		WIND_SURGE(
				81,
				WidgetInfo.SPELL_WIND_SURGE,
				true,
				new RuneRequirement(7, Rune.AIR),
				new RuneRequirement(1, Rune.WRATH)
		),
		WATER_SURGE(
				85,
				WidgetInfo.SPELL_WATER_SURGE,
				true,
				new RuneRequirement(7, Rune.AIR),
				new RuneRequirement(10, Rune.WATER),
				new RuneRequirement(1, Rune.WRATH)
		),
		EARTH_SURGE(
				90,
				WidgetInfo.SPELL_EARTH_SURGE,
				true,
				new RuneRequirement(7, Rune.AIR),
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.WRATH)
		),
		FIRE_SURGE(
				95,
				WidgetInfo.SPELL_FIRE_SURGE,
				true,
				new RuneRequirement(7, Rune.AIR),
				new RuneRequirement(10, Rune.FIRE),
				new RuneRequirement(1, Rune.WRATH)
		),

		// God spells
		SARADOMIN_STRIKE(
				60,
				WidgetInfo.SPELL_SARADOMIN_STRIKE,
				true,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(2, Rune.FIRE),
				new RuneRequirement(2, Rune.BLOOD)
		),
		CLAWS_OF_GUTHIX(
				60,
				WidgetInfo.SPELL_CLAWS_OF_GUTHIX,
				true,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(2, Rune.BLOOD)
		),
		FLAMES_OF_ZAMORAK(
				60,
				WidgetInfo.SPELL_FLAMES_OF_ZAMORAK,
				true,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(4, Rune.FIRE),
				new RuneRequirement(2, Rune.BLOOD)
		),

		// Other combat spells
		CRUMBLE_UNDEAD(
				39,
				WidgetInfo.SPELL_CRUMBLE_UNDEAD,
				false,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(1, Rune.CHAOS)
		),
		IBAN_BLAST(
				50,
				WidgetInfo.SPELL_IBAN_BLAST,
				true,
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(1, Rune.DEATH)
		),
		MAGIC_DART(
				50,
				WidgetInfo.SPELL_MAGIC_DART,
				true,
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(4, Rune.MIND)
		),

		// Curse spells
		CONFUSE(
				3,
				WidgetInfo.SPELL_CONFUSE,
				false,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(1, Rune.BODY)
		),
		WEAKEN(
				11,
				WidgetInfo.SPELL_WEAKEN,
				false,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(1, Rune.BODY)
		),
		CURSE(
				19,
				WidgetInfo.SPELL_CURSE,
				false,
				new RuneRequirement(3, Rune.EARTH),
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(1, Rune.BODY)
		),
		BIND(
				20,
				WidgetInfo.SPELL_BIND,
				false,
				new RuneRequirement(3, Rune.EARTH),
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(2, Rune.NATURE)
		),
		SNARE(
				50,
				WidgetInfo.SPELL_SNARE,
				false,
				new RuneRequirement(4, Rune.EARTH),
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(3, Rune.NATURE)
		),
		VULNERABILITY(
				66,
				WidgetInfo.SPELL_VULNERABILITY,
				true,
				new RuneRequirement(5, Rune.EARTH),
				new RuneRequirement(5, Rune.WATER),
				new RuneRequirement(1, Rune.SOUL)
		),
		ENFEEBLE(
				73,
				WidgetInfo.SPELL_ENFEEBLE,
				true,
				new RuneRequirement(8, Rune.EARTH),
				new RuneRequirement(8, Rune.WATER),
				new RuneRequirement(1, Rune.SOUL)
		),
		ENTANGLE(
				79,
				WidgetInfo.SPELL_ENTANGLE,
				true,
				new RuneRequirement(5, Rune.EARTH),
				new RuneRequirement(5, Rune.WATER),
				new RuneRequirement(4, Rune.NATURE)
		),
		STUN(
				80,
				WidgetInfo.SPELL_STUN,
				true,
				new RuneRequirement(12, Rune.EARTH),
				new RuneRequirement(12, Rune.WATER),
				new RuneRequirement(1, Rune.SOUL)
		),
		TELE_BLOCK(
				85,
				WidgetInfo.SPELL_TELE_BLOCK,
				false,
				new RuneRequirement(1, Rune.CHAOS),
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(1, Rune.LAW)
		),

		// Support spells
		CHARGE(
				80,
				WidgetInfo.SPELL_CHARGE,
				true,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(3, Rune.FIRE),
				new RuneRequirement(3, Rune.BLOOD)
		),

		// Utility spells
		BONES_TO_BANANAS(
				15,
				WidgetInfo.SPELL_BONES_TO_BANANAS,
				false,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(1, Rune.NATURE)
		),
		LOW_LEVEL_ALCHEMY(
				21,
				WidgetInfo.SPELL_LOW_LEVEL_ALCHEMY,
				false,
				new RuneRequirement(3, Rune.FIRE),
				new RuneRequirement(1, Rune.NATURE)
		),
		SUPERHEAT_ITEM(
				43,
				WidgetInfo.SPELL_SUPERHEAT_ITEM,
				false,
				new RuneRequirement(4, Rune.FIRE),
				new RuneRequirement(1, Rune.NATURE)
		),
		HIGH_LEVEL_ALCHEMY(
				55,
				WidgetInfo.SPELL_HIGH_LEVEL_ALCHEMY,
				false,
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(1, Rune.NATURE)
		),
		BONES_TO_PEACHES(
				60,
				WidgetInfo.SPELL_BONES_TO_PEACHES,
				true,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(2, Rune.NATURE)
		),

		// Enchantment spells
		LVL_1_ENCHANT(
				7,
				WidgetInfo.SPELL_LVL_1_ENCHANT,
				false,
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(1, Rune.COSMIC)
		),
		LVL_2_ENCHANT(
				27,
				WidgetInfo.SPELL_LVL_2_ENCHANT,
				false,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.COSMIC)
		),
		LVL_3_ENCHANT(
				49,
				WidgetInfo.SPELL_LVL_3_ENCHANT,
				false,
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(1, Rune.COSMIC)
		),
		CHARGE_WATER_ORB(
				56,
				WidgetInfo.SPELL_CHARGE_WATER_ORB,
				true,
				new RuneRequirement(30, Rune.WATER),
				new RuneRequirement(3, Rune.COSMIC)
		),
		LVL_4_ENCHANT(
				57,
				WidgetInfo.SPELL_LVL_4_ENCHANT,
				false,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.COSMIC)
		),
		CHARGE_EARTH_ORB(
				60,
				WidgetInfo.SPELL_CHARGE_EARTH_ORB,
				true,
				new RuneRequirement(30, Rune.EARTH),
				new RuneRequirement(3, Rune.COSMIC)
		),
		CHARGE_FIRE_ORB(
				63,
				WidgetInfo.SPELL_CHARGE_FIRE_ORB,
				true,
				new RuneRequirement(30, Rune.FIRE),
				new RuneRequirement(3, Rune.COSMIC)
		),
		CHARGE_AIR_ORB(
				66,
				WidgetInfo.SPELL_CHARGE_AIR_ORB,
				true,
				new RuneRequirement(30, Rune.AIR),
				new RuneRequirement(3, Rune.COSMIC)
		),
		LVL_5_ENCHANT(
				68,
				WidgetInfo.SPELL_LVL_5_ENCHANT,
				true,
				new RuneRequirement(15, Rune.EARTH),
				new RuneRequirement(15, Rune.WATER),
				new RuneRequirement(1, Rune.COSMIC)
		),
		LVL_6_ENCHANT(
				87,
				WidgetInfo.SPELL_LVL_6_ENCHANT,
				true,
				new RuneRequirement(20, Rune.EARTH),
				new RuneRequirement(20, Rune.FIRE),
				new RuneRequirement(1, Rune.COSMIC)
		),
		LVL_7_ENCHANT(
				93,
				WidgetInfo.SPELL_LVL_7_ENCHANT,
				true,
				new RuneRequirement(20, Rune.BLOOD),
				new RuneRequirement(20, Rune.SOUL),
				new RuneRequirement(1, Rune.COSMIC)
		),

		// Other spells
		TELEKINETIC_GRAB(
				31,
				WidgetInfo.SPELL_TELEKINETIC_GRAB,
				false,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.LAW)
		),
		;

		private final int level;
		private final WidgetInfo widgetInfo;
		private final boolean members;
		private final RuneRequirement[] requirements;

		Standard(int level, WidgetInfo widgetInfo, boolean members, RuneRequirement... requirements)
		{
			this.level = level;
			this.widgetInfo = widgetInfo;
			this.members = members;
			this.requirements = requirements;
		}

		@Override
		public int getLevel()
		{
			return level;
		}

		@Override
		public WidgetInfo getWidget()
		{
			return widgetInfo;
		}

		@Override
		public boolean canCast()
		{
			if (getCurrent() != STANDARD)
			{
				return false;
			}

			if (members && !Worlds.inMembersWorld())
			{
				return false;
			}

			if (this == HOME_TELEPORT)
			{
				return Magic.isHomeTeleportOnCooldown();
			}

			if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
			{
				return false;
			}

			if (this == ARDOUGNE_TELEPORT && Vars.getVarp(165) < 30)
			{
				return false;
			}

			if (this == TROLLHEIM_TELEPORT && Vars.getVarp(335) < 110)
			{
				return false;
			}

			return haveEquipment() && haveItem() && haveRunesAvailable();
		}

		public boolean haveRunesAvailable()
		{
			for (RuneRequirement req : requirements)
			{
				if (!req.meetsRequirements())
				{
					return false;
				}
			}

			return true;
		}

		public boolean haveEquipment()
		{
			switch (this)
			{
				case IBAN_BLAST:
					return Equipment.contains(ItemID.IBANS_STAFF, ItemID.IBANS_STAFF_1410, ItemID.IBANS_STAFF_U);
				case MAGIC_DART:
					return Equipment.contains(ItemID.SLAYERS_STAFF_E, ItemID.SLAYERS_STAFF, ItemID.STAFF_OF_THE_DEAD, ItemID.STAFF_OF_THE_DEAD_23613, ItemID.TOXIC_STAFF_OF_THE_DEAD, ItemID.STAFF_OF_LIGHT, ItemID.STAFF_OF_BALANCE);
				case SARADOMIN_STRIKE:
					return Equipment.contains(ItemID.SARADOMIN_STAFF, ItemID.STAFF_OF_LIGHT);
				case FLAMES_OF_ZAMORAK:
					return Equipment.contains(ItemID.ZAMORAK_STAFF, ItemID.STAFF_OF_THE_DEAD, ItemID.STAFF_OF_THE_DEAD_23613, ItemID.TOXIC_STAFF_OF_THE_DEAD);
				case CLAWS_OF_GUTHIX:
					return Equipment.contains(ItemID.GUTHIX_STAFF, ItemID.VOID_KNIGHT_MACE, ItemID.STAFF_OF_BALANCE);
				default:
					return true;
			}
		}

		public boolean haveItem()
		{
			switch (this)
			{
				case TELEPORT_TO_APE_ATOLL:
					return Inventory.contains(ItemID.BANANA);
				case CHARGE_AIR_ORB:
				case CHARGE_WATER_ORB:
				case CHARGE_EARTH_ORB:
				case CHARGE_FIRE_ORB:
					return Inventory.contains(ItemID.UNPOWERED_ORB);
				default:
					return true;
			}
		}
	}

	public enum Ancient implements Spell
	{
		// Teleport spells
		EDGEVILLE_HOME_TELEPORT(
				0,
				WidgetInfo.SPELL_EDGEVILLE_HOME_TELEPORT
		),
		PADDEWWA_TELEPORT(
				54,
				WidgetInfo.SPELL_PADDEWWA_TELEPORT,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(2, Rune.LAW)
		),
		SENNTISTEN_TELEPORT(
				60,
				WidgetInfo.SPELL_SENNTISTEN_TELEPORT,
				new RuneRequirement(2, Rune.LAW),
				new RuneRequirement(1, Rune.SOUL)
		),
		KHARYRLL_TELEPORT(
				66,
				WidgetInfo.SPELL_KHARYRLL_TELEPORT,
				new RuneRequirement(2, Rune.LAW),
				new RuneRequirement(1, Rune.BLOOD)
		),
		LASSAR_TELEPORT(
				72,
				WidgetInfo.SPELL_LASSAR_TELEPORT,
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(2, Rune.LAW)
		),
		DAREEYAK_TELEPORT(
				78,
				WidgetInfo.SPELL_DAREEYAK_TELEPORT,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(3, Rune.FIRE),
				new RuneRequirement(2, Rune.LAW)
		),
		CARRALLANGER_TELEPORT(
				84,
				WidgetInfo.SPELL_CARRALLANGER_TELEPORT,
				new RuneRequirement(2, Rune.LAW),
				new RuneRequirement(2, Rune.SOUL)
		),
		BOUNTY_TARGET_TELEPORT(
				85,
				WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT,
				new RuneRequirement(1, Rune.CHAOS),
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(1, Rune.LAW)
		),
		ANNAKARL_TELEPORT(
				90,
				WidgetInfo.SPELL_ANNAKARL_TELEPORT,
				new RuneRequirement(2, Rune.LAW),
				new RuneRequirement(2, Rune.BLOOD)
		),
		GHORROCK_TELEPORT(
				96,
				WidgetInfo.SPELL_GHORROCK_TELEPORT,
				new RuneRequirement(8, Rune.WATER),
				new RuneRequirement(2, Rune.LAW)
		),

		// Rush Spells
		SMOKE_RUSH(
				50,
				WidgetInfo.SPELL_SMOKE_RUSH,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(2, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH)
		),
		SHADOW_RUSH(
				52,
				WidgetInfo.SPELL_SHADOW_RUSH,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(2, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(1, Rune.SOUL)
		),
		BLOOD_RUSH(
				56,
				WidgetInfo.SPELL_BLOOD_RUSH,
				new RuneRequirement(2, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(1, Rune.BLOOD)
		),
		ICE_RUSH(
				58,
				WidgetInfo.SPELL_ICE_RUSH,
				new RuneRequirement(2, Rune.WATER),
				new RuneRequirement(2, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH)
		),

		// Burst Spells
		SMOKE_BURST(
				62,
				WidgetInfo.SPELL_SMOKE_BURST,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(2, Rune.FIRE),
				new RuneRequirement(4, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH)
		),
		SHADOW_BURST(
				64,
				WidgetInfo.SPELL_SHADOW_BURST,
				new RuneRequirement(1, Rune.AIR),
				new RuneRequirement(4, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(2, Rune.SOUL)
		),
		BLOOD_BURST(
				68,
				WidgetInfo.SPELL_BLOOD_BURST,
				new RuneRequirement(2, Rune.CHAOS),
				new RuneRequirement(4, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD)
		),
		ICE_BURST(
				70,
				WidgetInfo.SPELL_ICE_BURST,
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(4, Rune.CHAOS),
				new RuneRequirement(2, Rune.DEATH)
		),

		// Blitz Spells
		SMOKE_BLITZ(
				74,
				WidgetInfo.SPELL_SMOKE_BLITZ,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(2, Rune.FIRE),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD)
		),
		SHADOW_BLITZ(
				76,
				WidgetInfo.SPELL_SHADOW_BLITZ,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD),
				new RuneRequirement(2, Rune.SOUL)
		),
		BLOOD_BLITZ(
				80,
				WidgetInfo.SPELL_BLOOD_BLITZ,
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(4, Rune.BLOOD)
		),
		ICE_BLITZ(
				82,
				WidgetInfo.SPELL_ICE_BLITZ,
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(2, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD)
		),

		// Barrage Spells
		SMOKE_BARRAGE(
				86,
				WidgetInfo.SPELL_SMOKE_BARRAGE,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(4, Rune.FIRE),
				new RuneRequirement(4, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD)
		),
		SHADOW_BARRAGE(
				88,
				WidgetInfo.SPELL_SHADOW_BARRAGE,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(4, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD),
				new RuneRequirement(3, Rune.SOUL)
		),
		BLOOD_BARRAGE(
				92,
				WidgetInfo.SPELL_BLOOD_BARRAGE,
				new RuneRequirement(4, Rune.DEATH),
				new RuneRequirement(4, Rune.BLOOD),
				new RuneRequirement(1, Rune.SOUL)
		),
		ICE_BARRAGE(
				94,
				WidgetInfo.SPELL_ICE_BARRAGE,
				new RuneRequirement(6, Rune.WATER),
				new RuneRequirement(4, Rune.DEATH),
				new RuneRequirement(2, Rune.BLOOD)
		);

		private final int level;
		private final WidgetInfo widgetInfo;
		private final RuneRequirement[] requirements;

		Ancient(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
		{
			this.level = level;
			this.widgetInfo = widgetInfo;
			this.requirements = requirements;
		}

		@Override
		public int getLevel()
		{
			return level;
		}

		@Override
		public WidgetInfo getWidget()
		{
			return widgetInfo;
		}

		public boolean canCast()
		{
			if (getCurrent() != ANCIENT)
			{
				return false;
			}

			if (!Worlds.inMembersWorld())
			{
				return false;
			}

			if (this == EDGEVILLE_HOME_TELEPORT)
			{
				return Magic.isHomeTeleportOnCooldown();
			}

			if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
			{
				return false;
			}

			return haveRunesAvailable();
		}

		public boolean haveRunesAvailable()
		{
			for (RuneRequirement req : requirements)
			{
				if (!req.meetsRequirements())
				{
					return false;
				}
			}

			return true;
		}
	}

	public enum Lunar implements Spell
	{
		// Teleport spells
		LUNAR_HOME_TELEPORT(
				0,
				WidgetInfo.SPELL_LUNAR_HOME_TELEPORT
		),
		MOONCLAN_TELEPORT(
				69,
				WidgetInfo.SPELL_MOONCLAN_TELEPORT,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		TELE_GROUP_MOONCLAN(
				70,
				WidgetInfo.SPELL_TELE_GROUP_MOONCLAN,
				new RuneRequirement(4, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		OURANIA_TELEPORT(
				71,
				WidgetInfo.SPELL_OURANIA_TELEPORT,
				new RuneRequirement(6, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		WATERBIRTH_TELEPORT(
				72,
				WidgetInfo.SPELL_WATERBIRTH_TELEPORT,
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		TELE_GROUP_WATERBIRTH(
				73,
				WidgetInfo.SPELL_TELE_GROUP_WATERBIRTH,
				new RuneRequirement(5, Rune.WATER),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		BARBARIAN_TELEPORT(
				75,
				WidgetInfo.SPELL_BARBARIAN_TELEPORT,
				new RuneRequirement(3, Rune.FIRE),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(2, Rune.LAW)
		),
		TELE_GROUP_BARBARIAN(
				76,
				WidgetInfo.SPELL_TELE_GROUP_BARBARIAN,
				new RuneRequirement(6, Rune.FIRE),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(2, Rune.LAW)
		),
		KHAZARD_TELEPORT(
				78,
				WidgetInfo.SPELL_KHAZARD_TELEPORT,
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(2, Rune.LAW)
		),
		TELE_GROUP_KHAZARD(
				79,
				WidgetInfo.SPELL_TELE_GROUP_KHAZARD,
				new RuneRequirement(8, Rune.WATER),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(2, Rune.LAW)
		),
		FISHING_GUILD_TELEPORT(
				85,
				WidgetInfo.SPELL_FISHING_GUILD_TELEPORT,
				new RuneRequirement(10, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),
		TELE_GROUP_FISHING_GUILD(
				86,
				WidgetInfo.SPELL_TELE_GROUP_FISHING_GUILD,
				new RuneRequirement(14, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),
		CATHERBY_TELEPORT(
				87,
				WidgetInfo.SPELL_CATHERBY_TELEPORT,
				new RuneRequirement(10, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),
		TELE_GROUP_CATHERBY(
				88,
				WidgetInfo.SPELL_TELE_GROUP_CATHERBY,
				new RuneRequirement(15, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),
		ICE_PLATEAU_TELEPORT(
				89,
				WidgetInfo.SPELL_ICE_PLATEAU_TELEPORT,
				new RuneRequirement(8, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),
		TELE_GROUP_ICE_PLATEAU(
				90,
				WidgetInfo.SPELL_TELE_GROUP_ICE_PLATEAU,
				new RuneRequirement(16, Rune.WATER),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW)
		),

		// Combat spells
		MONSTER_EXAMINE(
				66,
				WidgetInfo.SPELL_MONSTER_EXAMINE,
				new RuneRequirement(1, Rune.MIND),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(1, Rune.ASTRAL)
		),
		CURE_OTHER(
				66,
				WidgetInfo.SPELL_CURE_OTHER,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		CURE_ME(
				66,
				WidgetInfo.SPELL_CURE_ME,
				new RuneRequirement(2, Rune.COSMIC),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		CURE_GROUP(
				66,
				WidgetInfo.SPELL_CURE_GROUP,
				new RuneRequirement(2, Rune.COSMIC),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(2, Rune.LAW)
		),
		STAT_SPY(
				66,
				WidgetInfo.SPELL_STAT_SPY,
				new RuneRequirement(5, Rune.BODY),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		DREAM(
				66,
				WidgetInfo.SPELL_DREAM,
				new RuneRequirement(5, Rune.BODY),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		STAT_RESTORE_POT_SHARE(
				66,
				WidgetInfo.SPELL_STAT_RESTORE_POT_SHARE,
				new RuneRequirement(10, Rune.WATER),
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		BOOST_POTION_SHARE(
				66,
				WidgetInfo.SPELL_BOOST_POTION_SHARE,
				new RuneRequirement(10, Rune.WATER),
				new RuneRequirement(12, Rune.EARTH),
				new RuneRequirement(3, Rune.ASTRAL)
		),
		ENERGY_TRANSFER(
				66,
				WidgetInfo.SPELL_ENERGY_TRANSFER,
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(1, Rune.NATURE),
				new RuneRequirement(2, Rune.LAW)
		),
		HEAL_OTHER(
				66,
				WidgetInfo.SPELL_HEAL_OTHER,
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.LAW),
				new RuneRequirement(1, Rune.BLOOD)
		),
		VENGEANCE_OTHER(
				66,
				WidgetInfo.SPELL_VENGEANCE_OTHER,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(2, Rune.DEATH)
		),
		VENGEANCE(
				66,
				WidgetInfo.SPELL_VENGEANCE,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(4, Rune.ASTRAL),
				new RuneRequirement(2, Rune.DEATH)
		),
		HEAL_GROUP(
				66,
				WidgetInfo.SPELL_HEAL_GROUP,
				new RuneRequirement(4, Rune.ASTRAL),
				new RuneRequirement(6, Rune.LAW),
				new RuneRequirement(3, Rune.BLOOD)
		),

		// Utility spells
		BAKE_PIE(
				66,
				WidgetInfo.SPELL_BAKE_PIE,
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(1, Rune.ASTRAL)
		),
		GEOMANCY(
				66,
				WidgetInfo.SPELL_GEOMANCY,
				new RuneRequirement(8, Rune.EARTH),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(3, Rune.NATURE)
		),
		CURE_PLANT(
				66,
				WidgetInfo.SPELL_CURE_PLANT,
				new RuneRequirement(8, Rune.EARTH),
				new RuneRequirement(1, Rune.ASTRAL)
		),
		NPC_CONTACT(
				66,
				WidgetInfo.SPELL_NPC_CONTACT,
				new RuneRequirement(2, Rune.AIR),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(1, Rune.ASTRAL)
		),
		HUMIDIFY(
				66,
				WidgetInfo.SPELL_HUMIDIFY,
				new RuneRequirement(3, Rune.WATER),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(1, Rune.ASTRAL)
		),
		HUNTER_KIT(
				66,
				WidgetInfo.SPELL_HUNTER_KIT,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		SPIN_FLAX(
				66,
				WidgetInfo.SPELL_SPIN_FLAX,
				new RuneRequirement(5, Rune.AIR),
				new RuneRequirement(1, Rune.ASTRAL),
				new RuneRequirement(2, Rune.NATURE)
		),
		SUPERGLASS_MAKE(
				66,
				WidgetInfo.SPELL_SUPERGLASS_MAKE,
				new RuneRequirement(10, Rune.AIR),
				new RuneRequirement(6, Rune.FIRE),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		TAN_LEATHER(
				66,
				WidgetInfo.SPELL_TAN_LEATHER,
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.NATURE)
		),
		STRING_JEWELLERY(
				66,
				WidgetInfo.SPELL_STRING_JEWELLERY,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(5, Rune.WATER),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		MAGIC_IMBUE(
				66,
				WidgetInfo.SPELL_MAGIC_IMBUE,
				new RuneRequirement(7, Rune.WATER),
				new RuneRequirement(7, Rune.FIRE),
				new RuneRequirement(2, Rune.ASTRAL)
		),
		FERTILE_SOIL(
				66,
				WidgetInfo.SPELL_FERTILE_SOIL,
				new RuneRequirement(15, Rune.EARTH),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(2, Rune.NATURE)
		),
		PLANK_MAKE(
				66,
				WidgetInfo.SPELL_PLANK_MAKE,
				new RuneRequirement(15, Rune.EARTH),
				new RuneRequirement(2, Rune.ASTRAL),
				new RuneRequirement(1, Rune.NATURE)
		),
		RECHARGE_DRAGONSTONE(
				66,
				WidgetInfo.SPELL_RECHARGE_DRAGONSTONE,
				new RuneRequirement(4, Rune.WATER),
				new RuneRequirement(1, Rune.ASTRAL),
				new RuneRequirement(1, Rune.SOUL)
		),
		SPELLBOOK_SWAP(
				66,
				WidgetInfo.SPELL_SPELLBOOK_SWAP,
				new RuneRequirement(2, Rune.COSMIC),
				new RuneRequirement(3, Rune.ASTRAL),
				new RuneRequirement(1, Rune.LAW)
		),
		;

		private final int level;
		private final WidgetInfo widgetInfo;
		private final RuneRequirement[] requirements;

		Lunar(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
		{
			this.level = level;
			this.widgetInfo = widgetInfo;
			this.requirements = requirements;
		}

		@Override
		public int getLevel()
		{
			return level;
		}

		@Override
		public WidgetInfo getWidget()
		{
			return widgetInfo;
		}

		public boolean canCast()
		{
			if (getCurrent() != LUNAR)
			{
				return false;
			}

			if (!Worlds.inMembersWorld())
			{
				return false;
			}

			if (this == LUNAR_HOME_TELEPORT)
			{
				return Magic.isHomeTeleportOnCooldown();
			}

			if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
			{
				return false;
			}

			return haveRunesAvailable();
		}

		public boolean haveRunesAvailable()
		{
			for (RuneRequirement req : requirements)
			{
				if (!req.meetsRequirements())
				{
					return false;
				}
			}

			return true;
		}
	}

	public enum Necromancy implements Spell
	{
		// Teleport spells
		ARCEUUS_HOME_TELEPORT(
				1,
				WidgetInfo.SPELL_ARCEUUS_HOME_TELEPORT
		),
		ARCEUUS_LIBRARY_TELEPORT(
				6,
				WidgetInfo.SPELL_ARCEUUS_LIBRARY_TELEPORT,
				new RuneRequirement(2, Rune.EARTH),
				new RuneRequirement(1, Rune.LAW)
		),
		DRAYNOR_MANOR_TELEPORT(
				17,
				WidgetInfo.SPELL_DRAYNOR_MANOR_TELEPORT,
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.WATER),
				new RuneRequirement(1, Rune.LAW)
		),
		BATTLEFRONT_TELEPORT(
				23,
				WidgetInfo.SPELL_BATTLEFRONT_TELEPORT,
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.FIRE),
				new RuneRequirement(1, Rune.LAW)
		),
		MIND_ALTAR_TELEPORT(
				28,
				WidgetInfo.SPELL_MIND_ALTAR_TELEPORT,
				new RuneRequirement(2, Rune.MIND),
				new RuneRequirement(1, Rune.LAW)
		),
		RESPAWN_TELEPORT(
				34,
				WidgetInfo.SPELL_RESPAWN_TELEPORT,
				new RuneRequirement(1, Rune.SOUL),
				new RuneRequirement(1, Rune.LAW)
		),
		SALVE_GRAVEYARD_TELEPORT(
				40,
				WidgetInfo.SPELL_SALVE_GRAVEYARD_TELEPORT,
				new RuneRequirement(2, Rune.SOUL),
				new RuneRequirement(1, Rune.LAW)
		),
		FENKENSTRAINS_CASTLE_TELEPORT(
				48,
				WidgetInfo.SPELL_FENKENSTRAINS_CASTLE_TELEPORT,
				new RuneRequirement(1, Rune.EARTH),
				new RuneRequirement(1, Rune.SOUL),
				new RuneRequirement(1, Rune.LAW)
		),
		WEST_ARDOUGNE_TELEPORT(
				61,
				WidgetInfo.SPELL_WEST_ARDOUGNE_TELEPORT,
				new RuneRequirement(2, Rune.SOUL),
				new RuneRequirement(2, Rune.LAW)
		),
		HARMONY_ISLAND_TELEPORT(
				65,
				WidgetInfo.SPELL_HARMONY_ISLAND_TELEPORT,
				new RuneRequirement(1, Rune.NATURE),
				new RuneRequirement(1, Rune.SOUL),
				new RuneRequirement(1, Rune.LAW)
		),
		CEMETERY_TELEPORT(
				71,
				WidgetInfo.SPELL_CEMETERY_TELEPORT,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(1, Rune.SOUL),
				new RuneRequirement(1, Rune.LAW)
		),
		BARROWS_TELEPORT(
				83,
				WidgetInfo.SPELL_BARROWS_TELEPORT,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(2, Rune.SOUL),
				new RuneRequirement(2, Rune.LAW)
		),
		APE_ATOLL_TELEPORT(
				90,
				WidgetInfo.SPELL_APE_ATOLL_TELEPORT,
				new RuneRequirement(2, Rune.BLOOD),
				new RuneRequirement(2, Rune.SOUL),
				new RuneRequirement(2, Rune.LAW)
		),

		// Combat spells
		GHOSTLY_GRASP(
				35,
				WidgetInfo.SPELL_GHOSTLY_GRASP,
				new RuneRequirement(4, Rune.AIR),
				new RuneRequirement(1, Rune.CHAOS)
		),
		SKELETAL_GRASP(
				56,
				WidgetInfo.SPELL_SKELETAL_GRASP,
				new RuneRequirement(8, Rune.EARTH),
				new RuneRequirement(1, Rune.DEATH)
		),
		UNDEAD_GRASP(
				79,
				WidgetInfo.SPELL_UNDEAD_GRASP,
				new RuneRequirement(12, Rune.FIRE),
				new RuneRequirement(1, Rune.BLOOD)
		),
		INFERIOR_DEMONBANE(
				44,
				WidgetInfo.SPELL_INFERIOR_DEMONBANE,
				new RuneRequirement(4, Rune.FIRE),
				new RuneRequirement(1, Rune.CHAOS)
		),
		SUPERIOR_DEMONBANE(
				62,
				WidgetInfo.SPELL_SUPERIOR_DEMONBANE,
				new RuneRequirement(8, Rune.FIRE),
				new RuneRequirement(1, Rune.SOUL)
		),
		DARK_DEMONBANE(
				82,
				WidgetInfo.SPELL_DARK_DEMONBANE,
				new RuneRequirement(12, Rune.FIRE),
				new RuneRequirement(2, Rune.SOUL)
		),
		LESSER_CORRUPTION(
				64,
				WidgetInfo.SPELL_LESSER_CORRUPTION,
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(2, Rune.SOUL)
		),
		GREATER_CORRUPTION(
				85,
				WidgetInfo.SPELL_GREATER_CORRUPTION,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(3, Rune.SOUL)
		),
		RESURRECT_LESSER_GHOST(
				38,
				WidgetInfo.SPELL_RESURRECT_LESSER_GHOST,
				new RuneRequirement(10, Rune.AIR),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.MIND)
		),
		RESURRECT_LESSER_SKELETON(
				38,
				WidgetInfo.SPELL_RESURRECT_LESSER_SKELETON,
				new RuneRequirement(10, Rune.AIR),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.MIND)
		),
		RESURRECT_LESSER_ZOMBIE(
				38,
				WidgetInfo.SPELL_RESURRECT_LESSER_ZOMBIE,
				new RuneRequirement(10, Rune.AIR),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.MIND)
		),
		RESURRECT_SUPERIOR_GHOST(
				57,
				WidgetInfo.SPELL_RESURRECT_SUPERIOR_GHOST,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.DEATH)
		),
		RESURRECT_SUPERIOR_SKELETON(
				57,
				WidgetInfo.SPELL_RESURRECT_SUPERIOR_SKELETON,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.DEATH)
		),
		RESURRECT_SUPERIOR_ZOMBIE(
				57,
				WidgetInfo.SPELL_RESURRECT_SUPERIOR_ZOMBIE,
				new RuneRequirement(10, Rune.EARTH),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.DEATH)
		),
		RESURRECT_GREATER_GHOST(
				76,
				WidgetInfo.SPELL_RESURRECT_GREATER_GHOST,
				new RuneRequirement(10, Rune.FIRE),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.BLOOD)
		),
		RESURRECT_GREATER_SKELETON(
				76,
				WidgetInfo.SPELL_RESURRECT_GREATER_SKELETON,
				new RuneRequirement(10, Rune.FIRE),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.BLOOD)
		),
		RESURRECT_GREATER_ZOMBIE(
				76,
				WidgetInfo.SPELL_RESURRECT_GREATER_ZOMBIE,
				new RuneRequirement(10, Rune.FIRE),
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(5, Rune.BLOOD)
		),
		DARK_LURE(
				50,
				WidgetInfo.SPELL_DARK_LURE,
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(1, Rune.NATURE)
		),
		MARK_OF_DARKNESS(
				59,
				WidgetInfo.SPELL_MARK_OF_DARKNESS,
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(1, Rune.SOUL)
		),
		WARD_OF_ARCEUUS(
				73,
				WidgetInfo.SPELL_WARD_OF_ARCEUUS,
				new RuneRequirement(1, Rune.COSMIC),
				new RuneRequirement(2, Rune.NATURE),
				new RuneRequirement(4, Rune.SOUL)
		),

		// Utility spells
		BASIC_REANIMATION(
				16,
				WidgetInfo.SPELL_BASIC_REANIMATION,
				new RuneRequirement(4, Rune.BODY),
				new RuneRequirement(2, Rune.NATURE)
		),
		ADEPT_REANIMATION(
				41,
				WidgetInfo.SPELL_ADEPT_REANIMATION,
				new RuneRequirement(4, Rune.BODY),
				new RuneRequirement(3, Rune.NATURE),
				new RuneRequirement(1, Rune.SOUL)
		),
		EXPERT_REANIMATION(
				72,
				WidgetInfo.SPELL_EXPERT_REANIMATION,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(3, Rune.NATURE),
				new RuneRequirement(2, Rune.SOUL)
		),
		MASTER_REANIMATION(
				90,
				WidgetInfo.SPELL_MASTER_REANIMATION,
				new RuneRequirement(2, Rune.BLOOD),
				new RuneRequirement(4, Rune.NATURE),
				new RuneRequirement(4, Rune.SOUL)
		),
		DEMONIC_OFFERING(
				84,
				WidgetInfo.SPELL_DEMONIC_OFFERING,
				new RuneRequirement(1, Rune.SOUL),
				new RuneRequirement(1, Rune.WRATH)
		),
		SINISTER_OFFERING(
				92,
				WidgetInfo.SPELL_SINISTER_OFFERING,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(1, Rune.WRATH)
		),
		SHADOW_VEIL(
				47,
				WidgetInfo.SPELL_SHADOW_VEIL,
				new RuneRequirement(5, Rune.EARTH),
				new RuneRequirement(5, Rune.FIRE),
				new RuneRequirement(5, Rune.COSMIC)
		),
		VILE_VIGOUR(
				66,
				WidgetInfo.SPELL_VILE_VIGOUR,
				new RuneRequirement(3, Rune.AIR),
				new RuneRequirement(1, Rune.SOUL)
		),
		DEGRIME(
				70,
				WidgetInfo.SPELL_DEGRIME,
				new RuneRequirement(4, Rune.EARTH),
				new RuneRequirement(2, Rune.NATURE)
		),
		RESURRECT_CROPS(
				78,
				WidgetInfo.SPELL_RESURRECT_CROPS,
				new RuneRequirement(25, Rune.EARTH),
				new RuneRequirement(8, Rune.BLOOD),
				new RuneRequirement(12, Rune.NATURE),
				new RuneRequirement(8, Rune.SOUL)
		),
		DEATH_CHARGE(
				80,
				WidgetInfo.SPELL_DEATH_CHARGE,
				new RuneRequirement(1, Rune.BLOOD),
				new RuneRequirement(1, Rune.DEATH),
				new RuneRequirement(1, Rune.SOUL)
		),
		;

		private final int level;
		private final WidgetInfo widgetInfo;
		private final RuneRequirement[] requirements;

		Necromancy(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
		{
			this.level = level;
			this.widgetInfo = widgetInfo;
			this.requirements = requirements;
		}

		@Override
		public int getLevel()
		{
			return level;
		}

		@Override
		public WidgetInfo getWidget()
		{
			return widgetInfo;
		}

		public boolean canCast()
		{
			if (getCurrent() != NECROMANCY)
			{
				return false;
			}

			if (!Worlds.inMembersWorld())
			{
				return false;
			}

			if (this == ARCEUUS_HOME_TELEPORT)
			{
				return Magic.isHomeTeleportOnCooldown();
			}

			if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
			{
				return false;
			}

			return haveRunesAvailable();
		}

		public boolean haveRunesAvailable()
		{
			for (RuneRequirement req : requirements)
			{
				if (!req.meetsRequirements())
				{
					return false;
				}
			}

			return true;
		}
	}
}
