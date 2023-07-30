package net.runelite.rs.api;

import java.util.List;
import net.runelite.mapping.Import;

public interface RSDBTable
{
	@Import("columns")
	List getColumns();
}
