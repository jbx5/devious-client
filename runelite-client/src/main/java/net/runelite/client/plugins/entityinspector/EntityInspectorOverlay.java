package net.runelite.client.plugins.entityinspector;

import net.unethicalite.client.devtools.EntityRenderer;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import java.awt.*;

public class EntityInspectorOverlay extends Overlay
{
	private final EntityInspectorConfig config;
	private final EntityRenderer entityRenderer;

	@Inject
	private EntityInspectorOverlay(EntityInspectorConfig config, EntityRenderer entityRenderer)
	{
		this.config = config;
		this.entityRenderer = entityRenderer;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.HIGHEST);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		entityRenderer.setActions(config.actions());
		entityRenderer.setNames(config.names());
		entityRenderer.setAnimations(config.animations());
		entityRenderer.setGraphics(config.graphics());
		entityRenderer.setActions(config.actions());
		entityRenderer.setIds(config.ids());
		entityRenderer.setIndexes(config.indexes());
		entityRenderer.setQuantities(config.quantities());
		entityRenderer.setWorldLocations(config.worldLocations());

		entityRenderer.setTileLocation(config.tileLocation());
		entityRenderer.setGameObjects(config.gameObjects());
		entityRenderer.setDecorativeObjects(config.decorObjects());
		entityRenderer.setGraphicsObjects(config.graphicsObjects());
		entityRenderer.setGroundObjects(config.groundObjects());
		entityRenderer.setInventory(config.inventory());
		entityRenderer.setPlayers(config.players());
		entityRenderer.setProjectiles(config.projectiles());
		entityRenderer.setNpcs(config.npcs());
		entityRenderer.setGroundObjects(config.groundObjects());
		entityRenderer.setTileItems(config.tileItems());
		entityRenderer.setWallObjects(config.wallObjects());

		entityRenderer.render(g);
		return null;
	}
}
