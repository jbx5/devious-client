/*
 * Copyright (c) 2022, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.ui.overlay;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Varbits;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;

@Singleton
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class WidgetOverlays
{
	private final Client client;
	private final ClientThread clientThread;
	private final OverlayManager overlayManager;

	public void setup()
	{
		Arrays.asList(
			// classic resizable - these are in render order for managed overlay picking
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_CHATBOX_PARENT, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_PARENT, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.RESIZABLE_MINIMAP_STONES_WIDGET, OverlayPosition.CANVAS_TOP_RIGHT),
			// modern resizable
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_CHATBOX_PARENT, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.RESIZABLE_MINIMAP_WIDGET, OverlayPosition.CANVAS_TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_TABS1, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_TABS2, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_PARENT, OverlayPosition.DYNAMIC),
			// The client forces the oxygen bar below the xp tracker, so set its priority lower
			new WidgetOverlay(WidgetInfo.FOSSIL_ISLAND_OXYGENBAR, OverlayPosition.TOP_CENTER, OverlayPriority.HIGH),
			new XpTrackerWidgetOverlay(WidgetInfo.EXPERIENCE_TRACKER_WIDGET, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.RAIDS_POINTS_INFOBOX, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.TOB_PARTY_INTERFACE, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.TOB_PARTY_STATS, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.GWD_KC, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.TITHE_FARM, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.PEST_CONTROL_BOAT_INFO, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.PEST_CONTROL_KNIGHT_INFO_CONTAINER, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.PEST_CONTROL_ACTIVITY_SHIELD_INFO_CONTAINER, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.ZEAH_MESS_HALL_COOKING_DISPLAY, OverlayPosition.TOP_LEFT),
			new PvpKDRWidgetOverlay(WidgetInfo.PVP_KILLDEATH_COUNTER, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.SKOTIZO_CONTAINER, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.KOUREND_FAVOUR_OVERLAY, OverlayPosition.TOP_CENTER),
			new WidgetOverlay(WidgetInfo.PYRAMID_PLUNDER_DATA, OverlayPosition.TOP_CENTER),
			new WidgetOverlay(WidgetInfo.LMS_INFO, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.LMS_KDA, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.GAUNTLET_TIMER_CONTAINER, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.HALLOWED_SEPULCHRE_TIMER_CONTAINER, OverlayPosition.TOP_LEFT),
			// The client forces the health overlay bar below the xp tracker, so set its priority lower
			new WidgetOverlay(WidgetInfo.HEALTH_OVERLAY_BAR, OverlayPosition.TOP_CENTER, OverlayPriority.HIGH),
			new WidgetOverlay(WidgetInfo.TOB_HEALTH_BAR, OverlayPosition.TOP_CENTER),
			new WidgetOverlay(WidgetInfo.NIGHTMARE_PILLAR_HEALTH, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.VOLCANIC_MINE_VENTS_INFOBOX_GROUP, OverlayPosition.BOTTOM_RIGHT),
			new WidgetOverlay(WidgetInfo.VOLCANIC_MINE_STABILITY_INFOBOX_GROUP, OverlayPosition.BOTTOM_LEFT),
			new WidgetOverlay(WidgetInfo.MULTICOMBAT_FIXED, OverlayPosition.BOTTOM_RIGHT),
			new WidgetOverlay(WidgetInfo.MULTICOMBAT_RESIZABLE_MODERN, OverlayPosition.CANVAS_TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.MULTICOMBAT_RESIZABLE_CLASSIC, OverlayPosition.CANVAS_TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.TEMPOROSS_STATUS_INDICATOR, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.BA_HEAL_TEAMMATES, OverlayPosition.BOTTOM_LEFT),
			new WidgetOverlay(WidgetInfo.BA_TEAM, OverlayPosition.TOP_RIGHT),
			new WidgetOverlay(WidgetInfo.PVP_WILDERNESS_SKULL_CONTAINER, OverlayPosition.DYNAMIC),
			new WidgetOverlay(WidgetInfo.TOA_PARTY_LAYER, OverlayPosition.TOP_LEFT),
			new WidgetOverlay(WidgetInfo.TOA_RAID_LAYER, OverlayPosition.TOP_LEFT)
		).forEach(overlayManager::add);
	}

	class WidgetOverlay extends Overlay
	{
		private final WidgetInfo widgetInfo;
		private final Rectangle parentBounds = new Rectangle();
		private boolean revalidate;

		private WidgetOverlay(final WidgetInfo widgetInfo, final OverlayPosition overlayPosition)
		{
			this(widgetInfo, overlayPosition, OverlayPriority.HIGHEST);
		}

		private WidgetOverlay(final WidgetInfo widgetInfo, final OverlayPosition overlayPosition, final OverlayPriority overlayPriority)
		{
			this.widgetInfo = widgetInfo;
			setPriority(overlayPriority);
			setLayer(OverlayLayer.MANUAL);
			setPosition(overlayPosition);
			setMovable(true);
			setSnappable(true);
			drawAfterInterface(widgetInfo.getGroupId());
		}

		@Override
		public String getName()
		{
			return Objects.toString(widgetInfo);
		}

		@Override
		public void widgetTick()
		{
			// position widget for tick, in case it has been moved already from a subchange listener
			repositionWidget();
			// position widget after this tick, in case it is moved by a script, for the next frame
			clientThread.invokeAtTickEnd(this::repositionWidget);
		}

		private void repositionWidget()
		{
			final Widget widget = client.getWidget(widgetInfo);
			final Rectangle parent = getParentBounds(widget);

			if (parent.isEmpty())
			{
				return;
			}

			assert widget != null;

			final Rectangle bounds = getBounds();
			// OverlayRenderer sets the overlay bounds to where it would like the overlay to render at prior to calling
			// render(). If the overlay has a preferred location or position set we update the widget position to that.
			if (getPreferredLocation() != null || getPreferredPosition() != null)
			{
				// The widget relative pos is relative to the parent
				widget.setRelativeX(bounds.x - parent.x);
				widget.setRelativeY(bounds.y - parent.y);
			}
			else
			{
				if (revalidate)
				{
					revalidate = false;
					log.debug("Revalidating {}", widgetInfo);
					// Revalidate the widget to reposition it back to its normal location after an overlay reset
					widget.revalidate();
				}
			}
		}

		@Override
		public Dimension render(Graphics2D graphics)
		{
			final Widget widget = client.getWidget(widgetInfo);
			if (widget == null || widget.isHidden())
			{
				return null;
			}

			if (getPreferredLocation() == null && getPreferredPosition() == null)
			{
				final Rectangle bounds = getBounds();
				// Update the overlay bounds to the widget bounds so the drag overlay renders correctly.
				// Note OverlayManager uses original bounds reference to render managing mode and for
				// onMouseOver, so update the existing bounds vs. replacing the reference.
				Rectangle widgetBounds = widget.getBounds();
				bounds.setBounds(widgetBounds.x, widgetBounds.y, widgetBounds.width, widgetBounds.height);
			}

			return new Dimension(widget.getWidth(), widget.getHeight());
		}

		private Rectangle getParentBounds(final Widget widget)
		{
			if (widget == null || widget.isHidden())
			{
				parentBounds.setBounds(new Rectangle());
				return parentBounds;
			}

			final Widget parent = widget.getParent();
			final Rectangle bounds;

			if (parent == null)
			{
				bounds = new Rectangle(client.getRealDimensions());
			}
			else
			{
				bounds = parent.getBounds();
			}

			parentBounds.setBounds(bounds);
			return bounds;
		}

		@Override
		public Rectangle getParentBounds()
		{
			if (!client.isClientThread())
			{
				// During overlay drag this is called on the EDT, so we just
				// cache and reuse the last known parent bounds.
				return parentBounds;
			}

			final Widget widget = client.getWidget(widgetInfo);
			return getParentBounds(widget);
		}

		@Override
		public void revalidate()
		{
			// Revalidate must be called on the client thread, so defer til next frame
			revalidate = true;
		}
	}

	private class XpTrackerWidgetOverlay extends WidgetOverlay
	{
		private XpTrackerWidgetOverlay(WidgetInfo widgetInfo, OverlayPosition overlayPosition)
		{
			super(widgetInfo, overlayPosition);
		}

		@Override
		public Dimension render(Graphics2D graphics)
		{
			// The xptracker component layer isn't hidden if the counter and process bar are both configured "Off",
			// it just has its children hidden.
			if (client.getVarbitValue(Varbits.EXPERIENCE_TRACKER_COUNTER) == 30 // Off
				&& client.getVarbitValue(Varbits.EXPERIENCE_TRACKER_PROGRESS_BAR) == 0) // Off
			{
				return null;
			}

			return super.render(graphics);
		}

		/**
		 * Get the overlay position of the xptracker based on the configured location in-game.
		 *
		 * @return
		 */
		@Override
		public OverlayPosition getPosition()
		{
			if (!client.isClientThread())
			{
				// During overlay drag, getPosition() is called on the EDT, so we just
				// cache and reuse the last known configured position.
				return super.getPosition();
			}

			OverlayPosition position;
			switch (client.getVarbitValue(Varbits.EXPERIENCE_TRACKER_POSITION))
			{
				case 0:
				default:
					position = OverlayPosition.TOP_RIGHT;
					break;
				case 1:
					position = OverlayPosition.TOP_CENTER;
					break;
				case 2:
					position = OverlayPosition.TOP_LEFT;
					break;
			}

			if (position != super.getPosition())
			{
				log.debug("Xp tracker moved position");
				setPosition(position);
				overlayManager.rebuildOverlayLayers();
			}
			return position;
		}
	}

	private class PvpKDRWidgetOverlay extends WidgetOverlay
	{
		private PvpKDRWidgetOverlay(WidgetInfo widgetInfo, OverlayPosition overlayPosition)
		{
			super(widgetInfo, overlayPosition);
		}

		@Override
		public Dimension render(Graphics2D graphics)
		{
			// Don't draw widget overlay if the PVP KDR stats text will be empty
			if (client.getVarbitValue(Varbits.SHOW_PVP_KDR_STATS) == 1)
			{
				return super.render(graphics);
			}

			return null;
		}
	}
}
