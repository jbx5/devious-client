package net.runelite.client.plugins.entityinspector;

import dev.hoot.api.SceneEntity;
import dev.hoot.api.coords.RegionPoint;
import dev.hoot.api.coords.ScenePoint;
import dev.hoot.api.entities.*;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.scene.Tiles;
import dev.hoot.api.utils.DrawUtils;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;

import javax.inject.Inject;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.List;

public class EntityInspectorOverlay extends Overlay
{
	private static final Font FONT = FontManager.getRunescapeFont().deriveFont(Font.BOLD, 16);
	private static final Color RED = new Color(221, 44, 0);
	private static final Color GREEN = new Color(0, 200, 83);
	private static final Color TURQOISE = new Color(0, 200, 157);
	private static final Color ORANGE = new Color(255, 109, 0);
	private static final Color YELLOW = new Color(255, 214, 0);
	private static final Color CYAN = new Color(0, 184, 212);
	private static final Color BLUE = new Color(41, 98, 255);
	private static final Color DEEP_PURPLE = new Color(98, 0, 234);
	private static final Color PURPLE = new Color(170, 0, 255);
	private static final Color GRAY = new Color(158, 158, 158);

	private final Client client;
	private final EntityInspectorConfig config;
	private final TooltipManager tooltipManager;

	@Inject
	private EntityInspectorOverlay(Client client, EntityInspectorConfig config, TooltipManager tooltipManager)
	{
		this.client = client;
		this.config = config;
		this.tooltipManager = tooltipManager;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.HIGHEST);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		g.setFont(FONT);
		Point mouse = client.getMouseCanvasPosition();

		if (config.gameObjects() || config.groundObjects() || config.wallObjects() || config.decorObjects())
		{
			renderTileObjects(g, mouse);
		}

		if (config.tileItems())
		{
			renderTileItems(g, mouse);
		}

		if (config.npcs())
		{
			renderNpcs(g, mouse);
		}

		if (config.players())
		{
			renderPlayers(g, mouse);
		}

		if (config.projectiles())
		{
			renderProjectiles(g);
		}

		if (config.graphicsObjects())
		{
			renderGraphicsObjects(g);
		}

		if (config.inventory())
		{
			renderInventory(g);
		}

		Tile hoveredTile = Tiles.getHoveredTile();
		if (hoveredTile == null)
		{
			return null;
		}

		if (config.tileLocation())
		{
			renderTileTooltip(g, hoveredTile);
		}

		if (config.path())
		{
			DrawUtils.drawPath(g, hoveredTile.getWorldLocation());
		}

		return null;
	}

	public void renderPlayers(Graphics2D graphics, Point point)
	{
		Player local = Players.getLocal();
		List<Player> players = Players.getAll(x -> !x.equals(local));

		for (Player p : players)
		{
			if (p.getConvexHull() != null && p.getConvexHull().contains(point.getX(), point.getY()) || !config.hover())
			{
				graphics.setColor(BLUE);
				graphics.draw(p.getConvexHull());

				OverlayUtil.renderActorOverlay(graphics, p, "", BLUE);
				tooltipManager.add(new Tooltip(createInfo(p)));
			}
		}

		if (local.getConvexHull() != null && local.getConvexHull().contains(point.getX(), point.getY()))
		{
			graphics.setColor(CYAN);

			OverlayUtil.renderActorParagraph(graphics, local, createInfo(local), CYAN);
			renderPlayerWireframe(graphics, local, CYAN);
		}
	}

	public void renderNpcs(Graphics2D graphics, Point point)
	{
		List<NPC> npcs = NPCs.getAll(x -> true);

		for (NPC npc : npcs)
		{
			Color color = npc.getCombatLevel() > 1 ? YELLOW : ORANGE;
			graphics.setColor(color);

			if (npc.getConvexHull() != null && npc.getConvexHull().contains(point.getX(), point.getY()) || !config.hover())
			{
				graphics.draw(npc.getConvexHull());
				tooltipManager.add(new Tooltip(createInfo(npc)));
			}
		}
	}

	public void renderTileObjects(Graphics2D graphics, Point mouse)
	{
		List<TileObject> tileObjects = TileObjects.getAll(x -> true);

		for (TileObject tileObject : tileObjects)
		{
			if (tileObject instanceof GameObject && config.gameObjects())
			{
				renderGameObjects(graphics, (GameObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof WallObject && config.wallObjects())
			{
				renderWallObject(graphics, (WallObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof GroundObject && config.groundObjects())
			{
				renderGroundObject(graphics, (GroundObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof DecorativeObject && config.decorObjects())
			{
				renderDecorObject(graphics, (DecorativeObject) tileObject);
			}
		}
	}

	public void renderTileTooltip(Graphics2D graphics, Tile tile)
	{
		Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
		if (poly != null && poly.contains(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY()))
		{
			WorldPoint worldLocation = tile.getWorldLocation();
			ScenePoint scenePoint = ScenePoint.fromWorld(worldLocation);
			String tooltip = String.format("World location: %d, %d, %d</br>" +
							"Region ID: %d location: %d, %d</br>" +
							"Scene location: %d, %d</br>"
					,
					worldLocation.getX(), worldLocation.getY(), worldLocation.getPlane(),
					worldLocation.getRegionID(), worldLocation.getRegionX(), worldLocation.getRegionY(),
					scenePoint.getX(), scenePoint.getY())
					;
			tooltipManager.add(new Tooltip(tooltip));
			OverlayUtil.renderPolygon(graphics, poly, GREEN);
		}
	}

	public void renderTileItems(Graphics2D graphics, Point point)
	{
		List<TileItem> tileItems = TileItems.getAll(x -> true);

		for (TileItem tileItem : tileItems)
		{
			ItemLayer tileItemPile = tileItem.getTile().getItemLayer();
			if (tileItemPile != null
					&& (tileItemPile.getCanvasTilePoly() != null
					&& tileItemPile.getCanvasTilePoly().contains(point.getX(), point.getY()) || !config.hover()))
			{
				Node current = tileItemPile.getBottom();
				while (current instanceof TileItem)
				{
					OverlayUtil.renderTileOverlay(graphics, tileItemPile, "", RED);
					tooltipManager.add(new Tooltip(createInfo((TileItem) current)));
					current = current.getNext();
				}
			}
		}
	}

	public void renderGameObjects(Graphics2D graphics, GameObject go, Point point)
	{
		if (go == null)
		{
			return;
		}

		Shape hull = go.getConvexHull();
		if (hull == null)
		{
			return;
		}

		if (!hull.contains(point.getX(), point.getY()) && config.hover())
		{
			return;
		}

		Renderable entity = go.getRenderable();

		Color color = entity instanceof DynamicObject ? TURQOISE : GREEN;

		graphics.setColor(color);
		graphics.draw(hull);

		OverlayUtil.renderTileOverlay(graphics, go, "", color);
		tooltipManager.add(new Tooltip(createInfo(go)));
	}

	public void renderGroundObject(Graphics2D graphics, GroundObject gr, Point point)
	{
		if (gr == null)
		{
			return;
		}

		Shape hull = gr.getConvexHull();
		if (hull == null)
		{
			return;
		}

		if (!hull.contains(point.getX(), point.getY()) && config.hover())
		{
			return;
		}

		OverlayUtil.renderTileOverlay(graphics, gr, "", PURPLE);
		tooltipManager.add(new Tooltip(createInfo(gr)));
	}

	public void renderWallObject(Graphics2D graphics, WallObject w, Point point)
	{
		if (w == null)
		{
			return;
		}

		Shape hull = w.getConvexHull();
		if (hull == null)
		{
			return;
		}

		if (!hull.contains(point.getX(), point.getY()) && config.hover())
		{
			return;
		}

		OverlayUtil.renderTileOverlay(graphics, w, "", GRAY);
		tooltipManager.add(new Tooltip(createInfo(w)));
	}

	public void renderDecorObject(Graphics2D graphics, DecorativeObject deo)
	{
		if (deo == null)
		{
			return;
		}

		OverlayUtil.renderTileOverlay(graphics, deo, createInfo(deo), DEEP_PURPLE);

		Shape p = deo.getConvexHull();
		if (p != null)
		{
			graphics.draw(p);
		}

		p = deo.getConvexHull2();
		if (p != null)
		{
			graphics.draw(p);
		}
	}

	public void renderInventory(Graphics2D graphics)
	{
		Widget inventoryWidget = Widgets.get(WidgetInfo.INVENTORY);
		if (inventoryWidget == null || GameThread.invokeLater(inventoryWidget::isHidden))
		{
			return;
		}

		for (WidgetItem item : inventoryWidget.getWidgetItems())
		{
			Rectangle slotBounds = item.getCanvasBounds();

			String idText = "" + item.getId();
			FontMetrics fm = graphics.getFontMetrics();
			Rectangle2D textBounds = fm.getStringBounds(idText, graphics);

			int textX = (int) (slotBounds.getX() + (slotBounds.getWidth() / 2) - (textBounds.getWidth() / 2));
			int textY = (int) (slotBounds.getY() + (slotBounds.getHeight() / 2) + (textBounds.getHeight() / 2));

			graphics.setColor(new Color(255, 255, 255, 65));
			graphics.fill(slotBounds);

			graphics.setColor(Color.BLACK);
			graphics.drawString(idText, textX + 1, textY + 1);
			graphics.setColor(YELLOW);
			graphics.drawString(idText, textX, textY);
		}
	}

	public void renderProjectiles(Graphics2D graphics)
	{
		List<Projectile> projectiles = Projectiles.getAll();

		for (Projectile projectile : projectiles)
		{
			int originX = projectile.getX1();
			int originY = projectile.getY1();

			LocalPoint tilePoint = new LocalPoint(originX, originY);
			Polygon poly = Perspective.getCanvasTilePoly(client, tilePoint);

			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, Color.RED);
			}

			int projectileId = projectile.getId();
			Actor projectileInteracting = projectile.getInteracting();

			String infoString = "";

			if (projectileInteracting == null)
			{
				infoString += "AoE";
			}
			else
			{
				infoString += "Targeted (T: " + projectileInteracting.getName() + ")";
			}

			infoString += " (ID: " + projectileId + ")";

			if (projectileInteracting != null)
			{
				OverlayUtil.renderActorOverlay(graphics, projectile.getInteracting(), infoString, Color.RED);
			}
			else
			{
				LocalPoint projectilePoint = new LocalPoint((int) projectile.getX(), (int) projectile.getY());
				Point textLocation = Perspective.getCanvasTextLocation(client, graphics, projectilePoint, infoString, 0);

				if (textLocation == null)
				{
					continue;
				}

				OverlayUtil.renderTextLocation(graphics, textLocation, infoString, Color.RED);
			}
		}
	}

	public void renderGraphicsObjects(Graphics2D graphics)
	{
		List<GraphicsObject> graphicsObjects = client.getGraphicsObjects();

		for (GraphicsObject graphicsObject : graphicsObjects)
		{
			LocalPoint lp = graphicsObject.getLocation();
			Polygon poly = Perspective.getCanvasTilePoly(client, lp);

			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, Color.MAGENTA);
			}

			String infoString = "(ID: " + graphicsObject.getId() + ")";
			Point textLocation = Perspective.getCanvasTextLocation(
					client, graphics, lp, infoString, 0);
			if (textLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, textLocation, infoString, Color.WHITE);
			}
		}
	}

	public void renderPlayerWireframe(Graphics2D graphics, Player player, Color color)
	{
		Polygon[] polys = player.getPolygons();

		if (polys == null)
		{
			return;
		}

		graphics.setColor(color);

		for (Polygon p : polys)
		{
			graphics.drawPolygon(p);
		}
	}

	public String createInfo(SceneEntity interactable)
	{
		StringBuilder sb = new StringBuilder();
		if (interactable instanceof Actor)
		{
			if (config.indexes())
			{
				if (interactable instanceof Player)
				{
					sb.append("Index: ").append(((Player) interactable).getIndex()).append("</br>");
				}

				if (interactable instanceof NPC)
				{
					sb.append("Index: ").append(((NPC) interactable).getIndex()).append("</br>");
				}
			}

			appendCommonFields(sb, interactable);

			if (config.animations())
			{
				sb.append("Animations: ").append(((Actor) interactable).getAnimation()).append("</br>");
			}

			if (config.graphics())
			{
				sb.append("Graphic: ").append(((Actor) interactable).getGraphic()).append("</br>");
			}

			return sb.toString();
		}

		if (interactable instanceof TileObject)
		{
			if (config.ids())
			{
				sb.append("ID: ").append(interactable.getId()).append("</br>");
			}

			appendCommonFields(sb, interactable);

			if (config.animations())
			{
				if (interactable instanceof GameObject
						&& ((GameObject) interactable).getRenderable() instanceof DynamicObject)
				{
					sb.append("Animations: ").append(((DynamicObject) ((GameObject) interactable).getRenderable()).getAnimationID()).append("</br>");
				}
			}

			return sb.toString();
		}

		if (interactable instanceof TileItem)
		{
			if (config.ids())
			{
				sb.append("ID: ").append(interactable.getId()).append("</br>");
			}

			if (config.quantities())
			{
				sb.append("Quantity: ").append(((TileItem) interactable).getQuantity()).append("</br>");
			}

			appendCommonFields(sb, interactable);
			return sb.toString();
		}

		return sb.toString();
	}

	private void appendCommonFields(StringBuilder sb, SceneEntity interactable)
	{
		if (interactable instanceof Actor)
		{
			if (interactable instanceof NPC && config.ids())
			{
				sb.append("ID: ").append(interactable.getId()).append("</br>");
			}

			if (config.names())
			{
				sb.append("Name: ").append(((Actor) interactable).getName()).append("</br>");
			}

			if (config.actions())
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getRawActions())).append("</br>");
			}

			if (config.worldLocations())
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}

			return;
		}

		if (interactable instanceof TileObject)
		{
			if (config.names())
			{
				sb.append("Name: ").append(interactable.getName()).append("</br>");
			}

			if (config.actions())
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getRawActions())).append("</br>");
			}

			if (config.worldLocations())
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}

			return;
		}

		if (interactable instanceof TileItem)
		{
			if (config.names())
			{
				sb.append("Name: ").append(interactable.getName()).append("</br>");
			}

			if (config.actions())
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getRawActions())).append("</br>");
			}

			if (config.worldLocations())
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}
		}
	}
}
