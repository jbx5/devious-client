package net.runelite.client.plugins.unethicaldevtools;

import net.unethicalite.client.devtools.EntityRenderer;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class UnethicalDevToolsOverlay extends Overlay
{
	private final UnethicalDevToolsConfig config;
	private final EntityRenderer entityRenderer;

	@Inject
	private UnethicalDevToolsOverlay(UnethicalDevToolsConfig config, EntityRenderer entityRenderer)
	{
		this.config = config;
		this.entityRenderer = entityRenderer;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGHEST);
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
		entityRenderer.setTrueWorldLocations(config.trueWorldLocations());

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
		entityRenderer.setPath(config.path());

		entityRenderer.render(g);
		return null;
	}
}
