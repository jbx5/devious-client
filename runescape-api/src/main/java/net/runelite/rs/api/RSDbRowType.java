package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDbRowType
{
	@Import("tableId")
	int getTableId();

	@Import("getColumnType")
	Object[] getColumnType(int var0);
}