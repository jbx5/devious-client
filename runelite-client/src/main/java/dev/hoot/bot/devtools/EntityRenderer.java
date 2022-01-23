package dev.hoot.bot.devtools;

import dev.hoot.api.SceneEntity;
import dev.hoot.api.entities.Projectiles;
import dev.hoot.api.entities.TileObjects;
import dev.hoot.api.scene.Tiles;
import dev.hoot.api.utils.DrawUtils;
import dev.hoot.api.widgets.Widgets;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.DecorativeObject;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.GraphicsObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
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
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.List;

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

	private static final int MAX_DISTANCE = 35;

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
	public EntityRenderer(Client client)
	{
		this.client = client;
	}

	public void render(Graphics2D graphics, List<? extends SceneEntity> entities)
	{
		Player player = client.getLocalPlayer();
		if (player == null)
		{
			return;
		}

		Tile hoveredTile = Tiles.getHoveredTile();
		if (isTileLocation())
		{
			renderTileTooltip(graphics, hoveredTile);
		}

		if (isCollisionMap())
		{
			DrawUtils.drawCollisions(graphics);
		}

		if (isPath())
		{
			DrawUtils.drawPath(graphics, hoveredTile.getWorldLocation());
		}

		if (isPlayers())
		{
			renderLocalPlayer(graphics, player);
		}

		if (isInventory())
		{
			renderInventory(graphics);
		}

		if (isProjectiles())
		{
			renderProjectiles(graphics);
		}

		List<TileObject> unhoverable = TileObjects.getSurrounding(player.getWorldLocation(), MAX_DISTANCE, x -> true);
		if (isGroundObjects())
		{
			renderGroundObject(graphics, unhoverable);
		}

		if (isDecorativeObjects())
		{
			renderDecorObject(graphics, unhoverable);
		}

		if (isWallObjects())
		{
			renderWallObject(graphics, unhoverable);
		}

		if (entities.isEmpty())
		{
			return;
		}

		if (isPlayers())
		{
			renderPlayers(graphics, player, entities);
		}

		if (isNpcs())
		{
			renderNpcs(graphics, player, entities);
		}

		if (isTileItems())
		{
			renderGroundItems(graphics, player, entities);
		}

		if (isGameObjects())
		{
			renderGameObject(graphics, player, entities);
		}
	}

	public void renderPlayers(Graphics2D graphics, Player local, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(p -> p instanceof Player && !p.equals(local) && p.distanceTo(local) <= MAX_DISTANCE)
				.findFirst()
				.ifPresent(p ->
				{
					Player player = (Player) p;
					String text = "Name: " + player.getName() + "\n" +
							"Actions: " + Arrays.toString(player.getRawActions()) + "\n" +
							"Anim: " + player.getAnimation() + "\n" +
							"Graphic: " + player.getGraphic() + "\n" +
							"Loc: " + player.getWorldLocation() + "\n" +
							"Index: " + player.getPlayerId();
					graphics.setColor(BLUE);
					graphics.draw(player.getConvexHull());

					OverlayUtil.renderActorParagraph(graphics, player, text, BLUE);
				});
	}

	public void renderLocalPlayer(Graphics2D graphics, Player local)
	{
		String text = "Name: " + local.getName() + "\n" +
				"Actions: " + Arrays.toString(local.getRawActions()) + "\n" +
				"Anim: " + local.getAnimation() + "\n" +
				"Graphic: " + local.getGraphic() + "\n" +
				"Loc: " + local.getWorldLocation() + "\n" +
				"Index: " + local.getPlayerId();

		graphics.setColor(CYAN);

		OverlayUtil.renderActorParagraph(graphics, local, text, CYAN);
		renderPlayerWireframe(graphics, local, CYAN);
	}

	public void renderNpcs(Graphics2D graphics, Player local, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(n -> n instanceof NPC && n.distanceTo(local) <= MAX_DISTANCE)
				.findFirst()
				.ifPresent(n ->
				{
					NPC npc = (NPC) n;
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
								"Actions: " + Arrays.toString(npc.getRawActions()) + "\n" +
								"Moving: " + npc.isMoving() + "\n" +
								"Anim: " + npc.getAnimation() + "\n" +
								"Graphic: " + npc.getGraphic() + "\n" +
								"Loc: " + npc.getWorldLocation() + "\n" +
								"Index: " + npc.getIndex();

						OverlayUtil.renderActorParagraph(graphics, npc, text, color);
					}
				});
	}

	public void renderTileTooltip(Graphics2D graphics, Tile tile)
	{
		if (tile == null)
		{
			return;
		}

		Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
		if (poly != null && poly.contains(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY()))
		{
			OverlayUtil.renderPolygon(graphics, poly, GREEN);
			OverlayUtil.renderTextLocation(graphics, client.getMouseCanvasPosition(),
					"World Location: " + tile.getWorldLocation().getX() + ", " + tile.getWorldLocation().getY() + ", " + client.getPlane(), Color.GREEN);
		}
	}

	public void renderGroundItems(Graphics2D graphics, Player local, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(ti -> ti instanceof TileItem && ti.distanceTo(local) <= MAX_DISTANCE)
				.findFirst()
				.ifPresent(ti ->
				{
					ItemLayer tileItemPile = ((TileItem) ti).getTile().getItemLayer();
					if (tileItemPile == null)
					{
						return;
					}

					Node current = tileItemPile.getBottom();
					while (current instanceof TileItem)
					{
						TileItem item = (TileItem) current;

						String sb = "ID: " + item.getId() + "\n" +
								"Qty: " + item.getQuantity() + "\n" +
								"Loc: " + item.getTile().getWorldLocation() + "\n" +
								"Actions: " + Arrays.toString(item.getRawActions());
						OverlayUtil.renderTileOverlayParagraph(graphics, tileItemPile, sb, RED);
						current = current.getNext();
					}
				});
	}

	public void renderGameObject(Graphics2D graphics, Player local, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(g -> g instanceof GameObject && g.distanceTo(local) <= MAX_DISTANCE)
				.findFirst()
				.ifPresent(g ->
				{
					GameObject gameObject = (GameObject) g;
					Renderable entity = gameObject.getRenderable();
					Color color = entity instanceof DynamicObject ? TURQOISE : GREEN;

					StringBuilder sb = new StringBuilder();
					sb.append("ID: ").append(gameObject.getId()).append("\n");
					if (entity instanceof DynamicObject)
					{
						sb.append("Anim: ").append(((DynamicObject) entity).getAnimationID()).append("\n");
					}
					sb.append("Loc: ").append(gameObject.getWorldLocation()).append("\n");
					if (gameObject.hasAction())
					{
						sb.append("Actions: ").append(Arrays.toString(gameObject.getRawActions()));
					}

					graphics.setColor(color);
					graphics.draw(gameObject.getConvexHull());

					OverlayUtil.renderTileOverlayParagraph(graphics, gameObject, sb.toString(), color);
				});
	}

	public void renderGroundObject(Graphics2D graphics, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(g -> g instanceof GroundObject)
				.forEach(g ->
				{
					GroundObject groundObject = (GroundObject) g;
					if (!isHovered(groundObject.getConvexHull()))
					{
						return;
					}

					String sb = "ID: " + groundObject.getId() + "\n" +
							"Loc: " + groundObject.getWorldLocation() + "\n";
					if (groundObject.hasAction())
					{
						sb += "Actions: " + Arrays.toString(groundObject.getRawActions());
					}

					OverlayUtil.renderTileOverlayParagraph(graphics, groundObject, sb, PURPLE);
				});
	}

	public void renderWallObject(Graphics2D graphics, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(w -> w instanceof WallObject)
				.forEach(w ->
				{
					WallObject wallObject = (WallObject) w;
					if (!isHovered(wallObject.getConvexHull()))
					{
						return;
					}

					String sb = "ID: " + wallObject.getId() + "\n" +
							"Loc: " + wallObject.getWorldLocation() + "\n";
					if (wallObject.hasAction())
					{
						sb += "Actions: " + Arrays.toString(wallObject.getRawActions());
					}

					OverlayUtil.renderTileOverlayParagraph(graphics, wallObject, sb, GRAY);
				});
	}

	public void renderDecorObject(Graphics2D graphics, List<? extends SceneEntity> entities)
	{
		entities.stream()
				.filter(dec -> dec instanceof DecorativeObject)
				.forEach(dec ->
				{
					DecorativeObject decorObject = (DecorativeObject) dec;
					if (!isHovered(decorObject.getConvexHull()))
					{
						return;
					}

					OverlayUtil.renderTileOverlay(graphics, decorObject, "ID: " + decorObject.getId(), DEEP_PURPLE);

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
				});
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

				if (textLocation != null)
				{
					OverlayUtil.renderTextLocation(graphics, textLocation, infoString, Color.RED);
				}
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

	private boolean isHovered(Shape convexHull)
	{
		return convexHull != null && convexHull.contains(client.getMouseCanvasPosition().getAwtPoint());
	}
}
