package net.unethicalite.api.script.paint;

import net.unethicalite.client.devtools.EntityRenderer;
import net.unethicalite.client.minimal.ui.MinimalUI;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.RenderableEntity;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
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

	public final DefaultPaint tracker = new DefaultPaint();

	@Inject
	public Paint(OverlayManager overlayManager)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);

		overlayManager.add(this);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		if (MinimalUI.getFrame() != null)
		{
			g.setColor(Color.WHITE);

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
