package net.unethicalite.api.script.paint;

import net.runelite.client.config.ConfigManager;
import net.unethicalite.client.devtools.EntityRenderer;
import net.unethicalite.client.minimal.ui.MinimalUI;
import net.unethicalite.client.managers.InputManager;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.RenderableEntity;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class Paint extends Overlay
{
	private final List<RenderableEntity> overlays = new ArrayList<>();
	private boolean enabled = false;

	@Inject
	private EntityRenderer entityRenderer;

	@Inject
	private ConfigManager configManager;

	@Inject
	private InputManager inputManager;

	public final DefaultPaint tracker = new DefaultPaint();

	@Inject
	public Paint(OverlayManager overlayManager)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_LOW);

		overlayManager.add(this);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		Font font = g.getFont();

		if (MinimalUI.getFrame() != null)
		{
			if (configManager.getConfiguration("entityinspector", "drawMouse", Boolean.class))
			{
				g.setFont(new Font("Tahoma", Font.BOLD, 18));
				OverlayUtil.renderTextLocation(g, new Point(inputManager.getLastClickX() - (g.getFont().getSize() / 3),
						inputManager.getLastClickY() + (g.getFont().getSize() / 3)), "X", Color.WHITE);
				OverlayUtil.renderTextLocation(g, new Point(inputManager.getLastMoveX() - (g.getFont().getSize() / 3),
						inputManager.getLastMoveY() + (g.getFont().getSize() / 3)), "X", Color.GREEN);
			}

			g.setColor(Color.WHITE);
			g.setFont(font);

			entityRenderer.render(g);
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

		if (enabled)
		{
			submit(tracker.getTracker());
		}
	}
}
