package net.unethicalite.api.magic;

import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.runelite.api.Item;
import net.runelite.api.ItemID;

import java.util.Arrays;

public enum Rune
{
	AIR(ItemID.AIR_RUNE, "Air", "Smoke", "Mist", "Dust"),
	EARTH(ItemID.EARTH_RUNE, "Earth", "Lava", "Mud", "Dust"),
	FIRE(ItemID.FIRE_RUNE, "Fire", "Lava", "Smoke", "Steam"),
	WATER(ItemID.WATER_RUNE, "Water", "Mud", "Steam", "Mist"),
	MIND(ItemID.MIND_RUNE, "Mind"),
	BODY(ItemID.BODY_RUNE, "Body"),
	COSMIC(ItemID.COSMIC_RUNE, "Cosmic"),
	CHAOS(ItemID.CHAOS_RUNE, "Chaos"),
	NATURE(ItemID.NATURE_RUNE, "Nature"),
	LAW(ItemID.LAW_RUNE, "Law"),
	DEATH(ItemID.DEATH_RUNE, "Death"),
	ASTRAL(ItemID.ASTRAL_RUNE, "Astral"),
	BLOOD(ItemID.BLOOD_RUNE, "Blood"),
	SOUL(ItemID.SOUL_RUNE, "Soul"),
	WRATH(ItemID.WRATH_RUNE, "Wrath");

	private final int runeId;
	private final String[] runeNames;

	Rune(int runeId, String... runeNames)
	{
		this.runeId = runeId;
		this.runeNames = runeNames;
	}

	public String[] getRuneNames()
	{
		return runeNames;
	}

	public int getRuneId()
	{
		return runeId;
	}

	public int getQuantity()
	{
		if (isStaffEquipped() || isTomeEquipped())
		{
			return Integer.MAX_VALUE;
		}

		Item rune = Inventory.getFirst(x -> x.getName() != null && x.getName().contains("rune") &&
				Arrays.stream(runeNames)
						.anyMatch(name -> x.getId() == runeId || x.getName().contains(name)));
		if (rune == null)
		{
			return RunePouch.getQuantity(this);
		}

		return rune.getQuantity() + RunePouch.getQuantity(this);
	}

	private boolean isStaffEquipped()
	{
		return Equipment.contains(x -> x.getName() != null
				&& x.getName().toLowerCase().contains("staff")
				&& Arrays.stream(runeNames).anyMatch(n -> x.getName().toLowerCase().contains(n.toLowerCase())));
	}

	private boolean isTomeEquipped()
	{
		return Equipment.contains(x -> x.getName() != null
				&& x.getName().startsWith("Tome of")
				&& !x.getName().endsWith("(empty")
				&& Arrays.stream(runeNames).anyMatch(n -> x.getName().toLowerCase().contains(n.toLowerCase())));
	}
}
