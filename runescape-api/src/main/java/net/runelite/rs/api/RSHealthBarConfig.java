package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSHealthBarConfig extends RSNode
{
	@Import("updates")
	RSIterableNodeDeque getUpdates(); // "combatinfolist" but only thing it has is getNode so this works

	@Import("definition")
	RSHealthBarDefinition getDefinition();
}
