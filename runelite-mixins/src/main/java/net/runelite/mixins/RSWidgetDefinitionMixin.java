package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSWidget;

@Mixin(RSClient.class)
public abstract class RSWidgetDefinitionMixin implements RSClient
{
	@Inject
	@Override
	public RSWidget[][] getWidgets()
	{
		return getWidgetDefinition().getWidgets();
	}

	@Inject
	@Override
	public boolean loadInterface(int interfaceId)
	{
		return getWidgetDefinition().loadInterface(interfaceId);
	}

	@Inject
	@Override
	public RSEvictingDualNodeHashTable getWidgetSpriteCache()
	{
		return getWidgetDefinition().getRSWidgetSpriteCache();
	}

	@Inject
	@Override
	public RSEvictingDualNodeHashTable getModelsCache()
	{
		return getWidgetDefinition().getModelsCache();
	}

	@Inject
	@Override
	public RSEvictingDualNodeHashTable getFontsCache()
	{
		return getWidgetDefinition().getFontsCache();
	}

	@Inject
	@Override
	public RSEvictingDualNodeHashTable getSpriteMasksCache()
	{
		return getWidgetDefinition().getSpriteMasksCache();
	}
}
