package dev.hoot.api.magic;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Vars;
import dev.hoot.api.game.Worlds;
import dev.hoot.api.items.Equipment;
import dev.hoot.api.items.Inventory;
import net.runelite.api.ItemID;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;

public enum Regular implements Spell
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
	ARDOUGNE_TELEPORT(
			51,
			WidgetInfo.SPELL_ARDOUGNE_TELEPORT,
			true,
			new RuneRequirement(2, Rune.WATER),
			new RuneRequirement(2, Rune.LAW)
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
	TELEPORT_TO_KOUREND(
			69,
			WidgetInfo.SPELL_TELEPORT_TO_KOUREND,
			true,
			new RuneRequirement(5, Rune.FIRE),
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(2, Rune.SOUL),
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

	Regular(int level, WidgetInfo widgetInfo, boolean members, RuneRequirement... requirements)
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
		if (Magic.SpellBook.getCurrent() != Magic.SpellBook.REGULAR)
		{
			return false;
		}

		if (members && !Worlds.inMembersWorld())
		{
			return false;
		}

		if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
		{
			return false;
		}

		if (this == ARDOUGNE_TELEPORT && Vars.getVarp(165) < 30)
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
