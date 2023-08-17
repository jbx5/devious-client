package net.runelite.rs.api;

import net.runelite.api.WidgetNode;
import net.runelite.mapping.Import;

public interface RSInterfaceParent extends RSNode, WidgetNode
{
	@Import("group")
	@Override
	int getId();

	@Import("group")
	void setId(int id);

	@Import("type")
	@Override
	int getModalMode();

	@Import("type")
	void setModalMode(int modalMode);
}
