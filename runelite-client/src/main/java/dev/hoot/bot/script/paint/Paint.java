package dev.hoot.bot.script.paint;

import dev.hoot.api.movement.Movement;
import dev.hoot.api.scene.Tiles;
import dev.hoot.bot.Bot;
import dev.hoot.bot.devtools.EntityInspector;
import dev.hoot.bot.managers.InputManager;
import dev.hoot.bot.managers.ScriptManager;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class Paint extends Overlay
{
	private final List<RenderableEntity> overlays = new ArrayList<>();
	private boolean enabled = false;

	@Inject
	private ScriptManager scriptManager;

	@Inject
	private EntityInspector entityInspector;

	private final InputManager inputManager;

	public final DefaultPaint tracker = new DefaultPaint();

	@Inject
	public Paint(InputManager inputManager)
	{
		this.inputManager = inputManager;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		Font font = g.getFont();

		if (Bot.debugMouse)
		{
			g.setFont(new Font("Tahoma", Font.BOLD, 18));
			OverlayUtil.renderTextLocation(g, new Point(InputManager.Companion.getLastClickX() - (g.getFont().getSize() / 3), InputManager.Companion.getLastClickY() + (g.getFont().getSize() / 3)), "X", Color.WHITE);
			OverlayUtil.renderTextLocation(g, new Point(InputManager.Companion.getLastMovedX() - (g.getFont().getSize() / 3), InputManager.Companion.getLastMovedY() + (g.getFont().getSize() / 3)), "X", Color.GREEN);
		}

		g.setColor(Color.WHITE);
		g.setFont(font);

		if (entityInspector.isDecorativeObjects())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isWallObjects())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isGameObjects())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isGroundObjects())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isTileItems())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isInventory())
		{
			entityInspector.renderInventory(g);
		}

		if (entityInspector.isNpcs())
		{
			entityInspector.renderNpcs(g);
		}

		if (entityInspector.isPlayers())
		{
			entityInspector.renderPlayers(g);
		}

		if (entityInspector.isProjectiles())
		{
			entityInspector.renderProjectiles(g);
		}

		if (entityInspector.isTileLocation())
		{
			entityInspector.renderTileObjects(g);
		}

		if (entityInspector.isCollisionMap())
		{
			Movement.drawCollisions(g);
		}

		if (entityInspector.isPath())
		{
			Tile mouseTile = Tiles.getHoveredTile();
			if (mouseTile != null)
			{
				Movement.drawPath(g, mouseTile.getWorldLocation());
			}
		}

		if (!enabled)
		{
			return null;
		}

		for (RenderableEntity renderableEntity : overlays)
		{
			renderableEntity.render(g);
		}

		return null;
	}

	public void submit(RenderableEntity p)
	{
		overlays.add(p);
	}

	public void clear()
	{
		overlays.clear();
		tracker.clear();
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
		clear();

		if (enabled)
		{
			tracker.submit(scriptManager.getBotScript().getClass().getSimpleName(), new Statistic(true, () -> ""));
			submit(tracker.getTracker());
		}
	}
}
