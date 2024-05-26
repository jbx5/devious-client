package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPlayerUpdateManager
{
	@Import("worldView")
	RSWorldView getWorldView();

	@Import("playerCount")
	int getPlayerCount();

	@Import("playerIndices")
	int[] getPlayerIndices();
}
