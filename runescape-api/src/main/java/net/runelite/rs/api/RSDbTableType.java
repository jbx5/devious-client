package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDbTableType
{
	@Import("types")
	int[][] getTypes();

	@Import("defaultValues")
	Object[][] getDefaultValues();
}