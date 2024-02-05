package net.unethicalite.client.devtools.widgetinspector;

import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class WidgetInspectorOverlay extends Overlay
{
	private final Client client;
	private final WidgetInspector inspector;

	@Inject
	public WidgetInspectorOverlay(
			Client client,
			WidgetInspector inspector
	)
	{
		this.client = client;
		this.inspector = inspector;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGHEST);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		Widget w = inspector.getSelectedWidget();
		if (w != null)
		{
			Object wiw = w;
			if (inspector.getSelectedItem() != -1)
			{
				wiw = w.getWidgetItem(inspector.getSelectedItem());
			}

			renderWiw(g, wiw, WidgetInspector.SELECTED_WIDGET_COLOR);
		}

		if (inspector.isPickerSelected())
		{
			boolean menuOpen = client.isMenuOpen();

			MenuEntry[] entries = client.getMenuEntries();
			for (int i = menuOpen ? 0 : entries.length - 1; i < entries.length; i++)
			{
				MenuEntry e = entries[i];

				Object wiw = inspector.getWidgetOrWidgetItemForMenuOption(e.getOpcode(), e.getParam0(), e.getParam1());
				if (wiw == null)
				{
					continue;
				}

				Color color = inspector.colorForWidget(i, entries.length);
				renderWiw(g, wiw, color);
			}
		}

		return null;
	}

	private void renderWiw(Graphics2D g, Object wiw, Color color)
	{
		g.setColor(color);

		if (wiw instanceof WidgetItem)
		{
			WidgetItem wi = (WidgetItem) wiw;
			Rectangle bounds = wi.getCanvasBounds();
			g.draw(bounds);

			String text = wi.getId() + "";
			FontMetrics fm = g.getFontMetrics();
			Rectangle2D textBounds = fm.getStringBounds(text, g);

			int textX = (int) (bounds.getX() + (bounds.getWidth() / 2) - (textBounds.getWidth() / 2));
			int textY = (int) (bounds.getY() + (bounds.getHeight() / 2) + (textBounds.getHeight() / 2));

			g.setColor(Color.BLACK);
			g.drawString(text, textX + 1, textY + 1);
			g.setColor(Color.ORANGE);
			g.drawString(text, textX, textY);
		}
		else
		{
			Widget w = (Widget) wiw;
			g.draw(w.getBounds());
		}
	}
}
