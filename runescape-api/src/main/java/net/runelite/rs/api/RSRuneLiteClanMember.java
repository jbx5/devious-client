package net.runelite.rs.api;

import java.time.LocalDate;
import net.runelite.api.MenuEntry;
import net.runelite.api.clan.ClanRank;

public interface RSRuneLiteClanMember extends MenuEntry
{
	ClanRank getRank();

	String getName();

	LocalDate getJoinDate();
}
