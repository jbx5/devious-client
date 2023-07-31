package net.runelite.rs.api;

import java.util.List;
import net.runelite.mapping.Import;

public interface RSDbTable
{
	@Import("columns")
	List getColumns();
}
