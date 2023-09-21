package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSWidgetDefinition
{
	@Import("Widget_interfaceComponents")
	RSWidget[][] getWidgets();

	@Import("loadInterface")
	boolean loadInterface(int interfaceId);

	@Import("Widget_cachedSprites")
	RSEvictingDualNodeHashTable getWidgetSpriteCache();

	@Import("Widget_cachedModels")
	RSEvictingDualNodeHashTable getModelsCache();

	@Import("Widget_cachedFonts")
	RSEvictingDualNodeHashTable getFontsCache();

	@Import("Widget_cachedSpriteMasks")
	RSEvictingDualNodeHashTable getSpriteMasksCache();

	@Import("widgetArchive")
	RSAbstractArchive getWidgetArchive();

	@Import("getWidgetChild")
	RSWidget getWidgetChild(int parent, int child);
}
