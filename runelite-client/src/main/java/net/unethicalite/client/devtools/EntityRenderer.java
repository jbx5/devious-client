package net.unethicalite.client.devtools;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.DecorativeObject;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.NPC;
import net.runelite.api.Node;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Projectile;
import net.runelite.api.Renderable;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.utils.DrawUtils;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@Singleton
public class EntityRenderer
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
	private final TooltipManager tooltipManager;
	@Getter
	@Setter
	private boolean groundObjects;
	@Getter
	@Setter
	private boolean wallObjects;
	@Getter
	@Setter
	private boolean decorativeObjects;
	@Getter
	@Setter
	private boolean gameObjects;
	@Getter
	@Setter
	private boolean graphicsObjects;
	@Getter
	@Setter
	private boolean inventory;
	@Getter
	@Setter
	private boolean npcs;
	@Getter
	@Setter
	private boolean players;
	@Getter
	@Setter
	private boolean tileItems;
	@Getter
	@Setter
	private boolean projectiles;
	@Getter
	@Setter
	private boolean tileLocation;
	@Getter
	@Setter
	private boolean collisionMap;
	@Getter
	@Setter
	private boolean path;
	// Configs
	@Getter
	@Setter
	private boolean ids = true;
	@Getter
	@Setter
	private boolean names = true;
	@Getter
	@Setter
	private boolean indexes = true;
	@Getter
	@Setter
	private boolean animations = true;
	@Getter
	@Setter
	private boolean graphics = true;
	@Getter
	@Setter
	private boolean actions = true;
	@Getter
	@Setter
	private boolean worldLocations = true;
	@Getter
	@Setter
	private boolean quantities = true;
	@Getter
	@Setter
	private boolean trueWorldLocations = true;
	@Setter
	private List<WorldPoint> currentPath = null;

	@Inject
	public EntityRenderer(Client client, TooltipManager tooltipManager)
	{
		this.client = client;
		this.tooltipManager = tooltipManager;
	}

	public void render(Graphics2D g)
	{
		g.setFont(FONT);
		Point mouse = client.getMouseCanvasPosition();

		if (gameObjects || groundObjects || wallObjects || decorativeObjects)
		{
			renderTileObjects(g, mouse);
		}

		if (tileItems)
		{
			renderTileItems(g, mouse);
		}

		if (npcs)
		{
			renderNpcs(g, mouse);
		}

		if (players)
		{
			renderPlayers(g, mouse);
		}

		if (projectiles)
		{
			renderProjectiles(g);
		}

		if (graphicsObjects)
		{
			renderGraphicsObjects(g);
		}

		if (inventory)
		{
			renderInventory(g);
		}

		Tile hoveredTile = Tiles.getHoveredTile();
		if (tileLocation)
		{
			renderTileTooltip(g, hoveredTile);
		}

		if (hoveredTile == null)
		{
			return;
		}

		if (path && currentPath != null)
		{
			DrawUtils.drawPath(g, currentPath);
		}

		if (collisionMap)
		{
			DrawUtils.drawCollisions(g);
		}
	}

	public void renderPlayers(Graphics2D graphics, Point point)
	{
		Player local = Players.getLocal();
		List<Player> players = Players.getAll(x -> !x.equals(local));

		for (Player p : players)
		{
			if (p.getConvexHull() != null && p.getConvexHull().contains(point.getX(), point.getY()))
			{
				graphics.setColor(BLUE);
				graphics.draw(p.getConvexHull());

				OverlayUtil.renderActorOverlay(graphics, p, "", BLUE);
				tooltipManager.add(new Tooltip(createInfo(p)));
			}
		}

		graphics.setColor(CYAN);

		OverlayUtil.renderActorParagraph(graphics, local, createInfo(local), CYAN);
		renderPlayerWireframe(graphics, local, CYAN);
	}

	public void renderNpcs(Graphics2D graphics, Point point)
	{
		List<NPC> npcs = NPCs.getAll(x -> true);

		for (NPC npc : npcs)
		{
			Color color = npc.getCombatLevel() > 1 ? YELLOW : ORANGE;
			graphics.setColor(color);

			if (npc.getConvexHull() != null && npc.getConvexHull().contains(point.getX(), point.getY()))
			{
				graphics.draw(npc.getConvexHull());
				tooltipManager.add(new Tooltip(createInfo(npc)));
			}
		}
	}

	public void renderTileObjects(Graphics2D graphics, Point mouse)
	{
		List<TileObject> tileObjects = TileObjects.getSurrounding(
				Players.getLocal().getWorldLocation(),
				35,
				x -> true
		);

		for (SceneEntity tileObject : tileObjects)
		{
			if (tileObject instanceof GameObject && gameObjects)
			{
				renderGameObjects(graphics, (GameObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof WallObject && wallObjects)
			{
				renderWallObject(graphics, (WallObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof GroundObject && groundObjects)
			{
				renderGroundObject(graphics, (GroundObject) tileObject, mouse);
				continue;
			}

			if (tileObject instanceof DecorativeObject && decorativeObjects)
			{
				renderDecorObject(graphics, (DecorativeObject) tileObject, mouse);
			}
		}
	}

	public void renderTileTooltip(Graphics2D graphics, Tile tile)
	{
		WorldMap worldMap = client.getWorldMap();
		Widget widget = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
		if (worldMap != null && Widgets.isVisible(widget))
		{
			WorldPoint worldMapMouse = worldMap.getMouseLocation();
			WorldMapData worldMapData = worldMap.getWorldMapData();
			if (worldMapMouse != null && worldMapData != null)
			{
				WorldPoint origin = worldMapData.getOrigin();
				if (origin != null)
				{
					String tooltip = String.format(
							"World map location: %d, %d, %d</br>" +
									"Region ID: %d location: %d, %d</br>" +
									"Map origin: %d, %d %d</br>",
							worldMapMouse.getX(), worldMapMouse.getY(), worldMapMouse.getPlane(),
							worldMapMouse.getRegionID(), worldMapMouse.getRegionX(), worldMapMouse.getRegionY(),
							origin.getX(), origin.getY(), origin.getPlane()
					);

					tooltipManager.add(new Tooltip(tooltip));
					return;
				}
			}
		}

		if (tile == null)
		{
			return;
		}

		Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
		if (poly != null && poly.contains(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY()))
		{
			WorldPoint worldLocation = tile.getWorldLocation();
			ScenePoint scenePoint = ScenePoint.fromWorld(worldLocation);
			String tooltip;

			if (trueWorldLocations && Static.getClient().isInInstancedRegion())
			{
				WorldPoint trueWorldPoint = WorldPoint.fromLocalInstance(
					Static.getClient(),
					LocalPoint.fromWorld(Static.getClient(), worldLocation)
				);

				tooltip = String.format("World location: %d, %d, %d</br>" +
						"Region ID: %d location: %d, %d</br>" +
						"Scene location: %d, %d</br>" +
						"True location: %d, %d, %d</br>"
					,
					worldLocation.getX(), worldLocation.getY(), worldLocation.getPlane(),
					worldLocation.getRegionID(), worldLocation.getRegionX(), worldLocation.getRegionY(),
					scenePoint.getX(), scenePoint.getY(),
					trueWorldPoint.getX(), trueWorldPoint.getY(), trueWorldPoint.getPlane()
				);
			}
			else
			{
				tooltip = String.format("World location: %d, %d, %d</br>" +
						"Region ID: %d location: %d, %d</br>" +
						"Scene location: %d, %d</br>"
					,
					worldLocation.getX(), worldLocation.getY(), worldLocation.getPlane(),
					worldLocation.getRegionID(), worldLocation.getRegionX(), worldLocation.getRegionY(),
					scenePoint.getX(), scenePoint.getY());
			}

			tooltipManager.add(new Tooltip(tooltip));
			OverlayUtil.renderPolygon(graphics, poly, GREEN);
		}
	}

	public void renderTileItems(Graphics2D graphics, Point point)
	{
		List<TileItem> tileItems = TileItems.getSurrounding(
				Players.getLocal().getWorldLocation(),
				35,
				x -> true
		);

		for (TileItem tileItem : tileItems)
		{
			ItemLayer tileItemPile = tileItem.getTile().getItemLayer();
			if (tileItemPile != null
					&& (tileItemPile.getCanvasTilePoly() != null
					&& tileItemPile.getCanvasTilePoly().contains(point.getX(), point.getY())))
			{
				Node current = tileItemPile.getTop();
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

		if (!hull.contains(point.getX(), point.getY()))
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

		if (!hull.contains(point.getX(), point.getY()))
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

		if (!hull.contains(point.getX(), point.getY()))
		{
			return;
		}

		OverlayUtil.renderTileOverlay(graphics, w, "", GRAY);
		tooltipManager.add(new Tooltip(createInfo(w)));
	}

	public void renderDecorObject(Graphics2D graphics, DecorativeObject deo, Point point)
	{
		if (deo == null)
		{
			return;
		}

		Shape hull = deo.getConvexHull();
		if (hull == null)
		{
			return;
		}

		if (!hull.contains(point.getX(), point.getY()))
		{
			return;
		}

		graphics.draw(hull);

		hull = deo.getConvexHull2();
		if (hull != null)
		{
			graphics.draw(hull);
		}

		OverlayUtil.renderTileOverlay(graphics, deo, "", DEEP_PURPLE);
		tooltipManager.add(new Tooltip(createInfo(deo)));
	}

	public void renderInventory(Graphics2D graphics)
	{
		Widget inventoryWidget = Widgets.get(WidgetInfo.INVENTORY);
		if (!Widgets.isVisible(inventoryWidget))
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
		client.getGraphicsObjects().forEach(graphicsObject ->
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
		});
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
			if (indexes)
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

			if (animations)
			{
				sb.append("Animations: ").append(((Actor) interactable).getAnimation()).append("</br>");
			}

			if (graphics)
			{
				sb.append("Graphic: ").append(((Actor) interactable).getGraphic()).append("</br>");
			}

			return sb.toString();
		}

		if (interactable instanceof TileObject)
		{
			if (ids)
			{
				sb.append("Base ID: ").append(interactable.getId()).append("</br>");
				sb.append("Actual ID: ").append(((TileObject) interactable).getActualId()).append("</br>");
			}

			appendCommonFields(sb, interactable);

			if (animations)
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
			if (ids)
			{
				sb.append("ID: ").append(interactable.getId()).append("</br>");
			}

			if (quantities)
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
			if (interactable instanceof NPC && ids)
			{
				sb.append("ID: ").append(interactable.getId()).append("</br>");
			}

			if (names)
			{
				sb.append("Name: ").append(interactable.getName()).append("</br>");
			}

			if (actions)
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getActions())).append("</br>");
			}

			if (worldLocations)
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}

			if (interactable instanceof NPC)
			{
				sb.append("Transformvarbit: ").append(((NPC) interactable).getComposition().getTransformVarbit()).append("</br>");
				sb.append("Transformvarp: ").append(((NPC) interactable).getComposition().getTransformVarp()).append("</br>");
			}
			return;
		}

		if (interactable instanceof TileObject)
		{
			if (names)
			{
				sb.append("Name: ").append(interactable.getName()).append("</br>");
			}

			if (actions)
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getActions())).append("</br>");
			}

			if (worldLocations)
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}

			sb.append("Transformvarbit: ")
					.append(client.getObjectDefinition(interactable.getId()).getTransformVarbit()).append("</br>");
			sb.append("Transformvarp: ")
					.append(client.getObjectDefinition(interactable.getId()).getVarPlayerId()).append("</br>");
			return;
		}

		if (interactable instanceof TileItem)
		{
			if (names)
			{
				sb.append("Name: ").append(interactable.getName()).append("</br>");
			}

			if (actions)
			{
				sb.append("Actions: ").append(Arrays.toString(interactable.getActions())).append("</br>");
			}

			if (worldLocations)
			{
				WorldPoint location = interactable.getWorldLocation();
				sb.append("Location: ").append(location).append("</br>");
				sb.append("Region: ").append(RegionPoint.fromWorld(location)).append("</br>");
				sb.append("Scene: ").append(ScenePoint.fromWorld(location)).append("</br>");
			}
		}
	}
}
