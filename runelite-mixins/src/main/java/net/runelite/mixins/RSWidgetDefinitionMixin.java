package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWidgetDefinition;

@Mixin(RSClient.class)
public abstract class RSWidgetDefinitionMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public RSWidget[][] getWidgets()
	{
		RSWidgetDefinition widgetDefinition = getWidgetDefinition();
		return widgetDefinition != null ? widgetDefinition.getWidgets() : null;
	}

	@Inject
	@Override
	public RSWidget getWidgetChild(int parent, int child)
	{
		RSWidgetDefinition widgetDefinition = getWidgetDefinition();
		return widgetDefinition != null ? widgetDefinition.getWidgetChild(parent, child) : null;
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
		return getWidgetDefinition().getWidgetSpriteCache();
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
