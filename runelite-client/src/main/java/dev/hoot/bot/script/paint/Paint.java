package dev.hoot.bot.script.paint;

import dev.hoot.api.SceneEntity;
import dev.hoot.api.entities.Entities;
import dev.hoot.bot.devtools.EntityRenderer;
import dev.hoot.bot.managers.InputManager;
import dev.hoot.bot.managers.ScriptManager;
import dev.hoot.bot.managers.interaction.InteractionConfig;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.RenderableEntity;

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
	private EntityRenderer entityRenderer;

	@Inject
	private InteractionConfig interactionConfig;

	public final DefaultPaint tracker = new DefaultPaint();

	@Inject
	public Paint(InputManager inputManager)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		Font font = g.getFont();

		if (interactionConfig.drawMouse())
		{
			g.setFont(new Font("Tahoma", Font.BOLD, 18));
			OverlayUtil.renderTextLocation(g, new Point(InputManager.Companion.getLastClickX() - (g.getFont().getSize() / 3), InputManager.Companion.getLastClickY() + (g.getFont().getSize() / 3)), "X", Color.WHITE);
			OverlayUtil.renderTextLocation(g, new Point(InputManager.Companion.getLastMovedX() - (g.getFont().getSize() / 3), InputManager.Companion.getLastMovedY() + (g.getFont().getSize() / 3)), "X", Color.GREEN);
		}

		g.setColor(Color.WHITE);
		g.setFont(font);

		List<? extends SceneEntity> entities = Entities.getHoveredEntities();

		entityRenderer.render(g, entities);

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
