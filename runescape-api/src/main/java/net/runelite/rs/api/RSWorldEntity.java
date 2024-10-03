package net.runelite.rs.api;

import net.runelite.api.WorldEntity;
import net.runelite.mapping.Import;

public interface RSWorldEntity extends WorldEntity
{
	@Import("worldView")
	@Override
	RSWorldView getWorldView();
}
