package dev.hoot.bot.devtools;

import lombok.Getter;
import lombok.Setter;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.List;

@Singleton
public class EntityInspector
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

	private static final int MAX_DISTANCE = 2400;

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

	private final Client client;

	@Inject
	public EntityInspector(Client client)
	{
		this.client = client;
	}

	public void renderPlayers(Graphics2D graphics)
	{
		List<Player> players = client.getPlayers();
		Player local = client.getLocalPlayer();

		for (Player p : players)
		{
			if (!p.equals(local) && p.getConvexHull() != null && p.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
			{
				String text = "Name: " + p.getName() + "\n" +
						"Actions: " + Arrays.toString(client.getPlayerOptions()) + "\n" +
						"Anim: " + p.getAnimation() + "\n" +
						"Graphic: " + p.getGraphic() + "\n" +
						"Loc: " + p.getWorldLocation() + "\n" +
						"Index: " + p.getPlayerId();
				graphics.setColor(BLUE);
				graphics.draw(p.getConvexHull());

				OverlayUtil.renderActorParagraph(graphics, p, text, BLUE);
			}
		}

		if (local != null && local.getConvexHull() != null && local.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
		{
			String text = "Name: " + local.getName() + "\n" +
					"Actions: " + Arrays.toString(client.getPlayerOptions()) + "\n" +
					"Anim: " + local.getAnimation() + "\n" +
					"Graphic: " + local.getGraphic() + "\n" +
					"Loc: " + local.getWorldLocation() + "\n" +
					"Index: " + local.getPlayerId();

			graphics.setColor(CYAN);

			OverlayUtil.renderActorParagraph(graphics, local, text, CYAN);
			renderPlayerWireframe(graphics, local, CYAN);
		}
	}

	public void renderNpcs(Graphics2D graphics)
	{
		List<NPC> npcs = client.getNpcs();
		for (NPC npc : npcs)
		{
			NPCComposition composition = npc.getComposition();
			Color color = composition.getCombatLevel() > 1 ? YELLOW : ORANGE;
			if (composition.getConfigs() != null)
			{
				NPCComposition transformedComposition = composition.transform();
				if (transformedComposition == null)
				{
					color = GRAY;
				}
				else
				{
					composition = transformedComposition;
				}
			}

			graphics.setColor(color);
			if (npc.getConvexHull() != null && npc.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
			{
				graphics.draw(npc.getConvexHull());

				String text = "Name: " + composition.getName() + "\n" +
						"ID: " + composition.getId() + "\n" +
						"Actions: " + Arrays.toString(client.getNpcDefinition(npc.getId()).getActions()) + "\n" +
						"Moving: " + npc.isMoving() + "\n" +
						"Anim: " + npc.getAnimation() + "\n" +
						"Graphic: " + npc.getGraphic() + "\n" +
						"Loc: " + npc.getWorldLocation() + "\n" +
						"Index: " + npc.getIndex();

				OverlayUtil.renderActorParagraph(graphics, npc, text, color);
			}
		}
	}

	public void renderTileObjects(Graphics2D graphics)
	{
		Scene scene = client.getScene();
		Tile[][][] tiles = scene.getTiles();

		int z = client.getPlane();

		for (int x = 0; x < Constants.SCENE_SIZE; ++x)
		{
			for (int y = 0; y < Constants.SCENE_SIZE; ++y)
			{
				Tile tile = tiles[z][x][y];

				if (tile == null)
				{
					continue;
				}

				Player player = client.getLocalPlayer();
				if (player == null)
				{
					continue;
				}

				if (isTileItems())
				{
					renderGroundItems(graphics, tile, player);
				}

				if (isGroundObjects())
				{
					renderGroundObject(graphics, tile, player);
				}

				if (isGameObjects())
				{
					renderGameObjects(graphics, tile, player);
				}

				if (isWallObjects())
				{
					renderWallObject(graphics, tile, player);
				}

				if (isDecorativeObjects())
				{
					renderDecorObject(graphics, tile, player);
				}

				if (isTileLocation())
				{
					renderTileTooltip(graphics, tile);
				}
			}
		}
	}

	public void renderTileTooltip(Graphics2D graphics, Tile tile)
	{
		Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
		if (poly != null && poly.contains(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY()))
		{
			OverlayUtil.renderPolygon(graphics, poly, GREEN);
			OverlayUtil.renderTextLocation(graphics, client.getMouseCanvasPosition(),
					"World Location: " + tile.getWorldLocation().getX() + ", " + tile.getWorldLocation().getY() + ", " + client.getPlane(), Color.GREEN);
		}
	}

	public void renderGroundItems(Graphics2D graphics, Tile tile, Player player)
	{
		ItemLayer tileItemPile = tile.getItemLayer();
		if (tileItemPile != null
				&& tileItemPile.getCanvasTilePoly() != null
				&& tileItemPile.getCanvasTilePoly().contains(client.getMouseCanvasPosition().getAwtPoint()))
		{
			if (player.getLocalLocation().distanceTo(tileItemPile.getLocalLocation()) <= MAX_DISTANCE)
			{
				Node current = tileItemPile.getBottom();
				while (current instanceof TileItem)
				{
					TileItem item = (TileItem) current;

					String sb = "ID: " + item.getId() + "\n" +
							"Qty: " + item.getQuantity() + "\n" +
							"Loc: " + item.getTile().getWorldLocation() + "\n" +
							"Actions: " + Arrays.toString(client.getItemComposition(item.getId()).getGroundActions());
					OverlayUtil.renderTileOverlayParagraph(graphics, tileItemPile, sb, RED);
					current = current.getNext();
				}
			}
		}
	}

	public void renderGameObjects(Graphics2D graphics, Tile tile, Player player)
	{
		GameObject[] gameObjects = tile.getGameObjects();
		if (gameObjects != null)
		{
			for (GameObject gameObject : gameObjects)
			{
				if (gameObject != null
						&& gameObject.getConvexHull() != null
						&& gameObject.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
				{
					if (player.getLocalLocation().distanceTo(gameObject.getLocalLocation()) <= MAX_DISTANCE)
					{
						Renderable entity = gameObject.getRenderable();
						Color color = entity instanceof DynamicObject ? TURQOISE : GREEN;

						StringBuilder sb = new StringBuilder();
						sb.append("ID: ").append(gameObject.getId()).append("\n");
						if (entity instanceof DynamicObject)
						{
							sb.append("Anim: ").append(((DynamicObject) entity).getAnimationID()).append("\n");
						}
						sb.append("Loc: ").append(gameObject.getWorldLocation()).append("\n");
						sb.append("Actions: ").append(Arrays.toString(client.getObjectDefinition(gameObject.getId()).getActions()));

						graphics.setColor(color);
						graphics.draw(gameObject.getConvexHull());

						OverlayUtil.renderTileOverlayParagraph(graphics, gameObject, sb.toString(), color);
					}

					return;
				}
			}
		}
	}

	public void renderGroundObject(Graphics2D graphics, Tile tile, Player player)
	{
		GroundObject groundObject = tile.getGroundObject();
		if (groundObject != null
				&& groundObject.getConvexHull() != null
				&& groundObject.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
		{
			if (player.getLocalLocation().distanceTo(groundObject.getLocalLocation()) <= MAX_DISTANCE)
			{
				String sb = "ID: " + groundObject.getId() + "\n" +
						"Loc: " + groundObject.getWorldLocation() + "\n" +
						"Actions: " + Arrays.toString(client.getObjectDefinition(groundObject.getId()).getActions());
				OverlayUtil.renderTileOverlayParagraph(graphics, groundObject, sb, PURPLE);
			}
		}
	}

	public void renderWallObject(Graphics2D graphics, Tile tile, Player player)
	{
		WallObject wallObject = tile.getWallObject();
		if (wallObject != null
				&& wallObject.getConvexHull() != null
				&& wallObject.getConvexHull().contains(client.getMouseCanvasPosition().getAwtPoint()))
		{
			if (player.getLocalLocation().distanceTo(wallObject.getLocalLocation()) <= MAX_DISTANCE)
			{
				String sb = "ID: " + wallObject.getId() + "\n" +
						"Loc: " + wallObject.getWorldLocation() + "\n" +
						"Actions: " + Arrays.toString(client.getObjectDefinition(wallObject.getId()).getActions());
				OverlayUtil.renderTileOverlay(graphics, wallObject, sb, GRAY);
			}
		}
	}

	public void renderDecorObject(Graphics2D graphics, Tile tile, Player player)
	{
		DecorativeObject decorObject = tile.getDecorativeObject();
		if (decorObject != null)
		{
			if (player.getLocalLocation().distanceTo(decorObject.getLocalLocation()) <= MAX_DISTANCE)
			{
				OverlayUtil.renderTileOverlay(graphics, decorObject, "ID: " + decorObject.getId(), DEEP_PURPLE);
			}

			Shape p = decorObject.getConvexHull();
			if (p != null)
			{
				graphics.draw(p);
			}

			p = decorObject.getConvexHull2();
			if (p != null)
			{
				graphics.draw(p);
			}
		}
	}

	public void renderInventory(Graphics2D graphics)
	{
		Widget inventoryWidget = client.getWidget(WidgetInfo.INVENTORY);
		if (inventoryWidget == null || inventoryWidget.isHidden())
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
		List<Projectile> projectiles = client.getProjectiles();

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

				if (textLocation != null)
				{
					OverlayUtil.renderTextLocation(graphics, textLocation, infoString, Color.RED);
				}
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
}
