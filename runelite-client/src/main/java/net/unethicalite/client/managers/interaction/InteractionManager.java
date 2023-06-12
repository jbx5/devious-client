package net.unethicalite.client.managers.interaction;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.MouseHandler;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.exception.InteractionException;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.input.naturalmouse.NaturalMouse;
import net.unethicalite.api.packets.MousePackets;
import net.unethicalite.api.packets.Packets;
import net.unethicalite.api.utils.CoordUtils;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Point;
import java.awt.Rectangle;

@Singleton
@Slf4j
public class InteractionManager
{
	private static final int MINIMAP_WIDTH = 250;
	private static final int MINIMAP_HEIGHT = 180;

	@Inject
	private NaturalMouse naturalMouse;

	@Inject
	private UnethicaliteConfig config;

	@Inject
	private Client client;

	@Inject
	InteractionManager(EventBus eventBus)
	{
		eventBus.register(this);
	}

	@Subscribe
	public void onMenuAutomated(MenuAutomated event)
	{
		Point clickPoint = getClickPoint(event);
		MouseHandler mouseHandler = client.getMouseHandler();

		try
		{
			SceneEntity entity;
			switch (config.interactMethod())
			{
				case MOUSE_FORWARDING:
					client.setQueuedMenu(event);
					break;

				case MOUSE_EVENTS:
					entity = event.getEntity();
					if (entity != null && config.mouseBehavior() == MouseBehavior.CLICKBOXES)
					{
						clickPoint = entity.getClickPoint().getAwtPoint();
					}

					if (event.getOpcode() == MenuAction.WALK && clickOffScreen(clickPoint))
					{
						net.runelite.api.Point newPoint = CoordUtils.localToMinimap(client,
								LocalPoint.fromScene(event.getParam0(), event.getParam1()), 6400);
						if (newPoint != null)
						{
							clickPoint = newPoint.getAwtPoint();
						}
					}

					if (config.naturalMouse())
					{
						naturalMouse.moveTo(clickPoint.x, clickPoint.y);
					}

					Point finalClickPoint = clickPoint;
					GameThread.invoke(() ->
					{
						if (!config.naturalMouse())
						{
							mouseHandler.sendMovement(finalClickPoint.x, finalClickPoint.y);
						}

						client.setPendingAutomation(event);
						setHoveredEntity(entity);

						log.debug("Sending click to [{}, {}]", finalClickPoint.x, finalClickPoint.y);
						mouseHandler.sendClick(finalClickPoint.x, finalClickPoint.y, 1);
					});

					Time.sleep(50, 100);
					mouseHandler.sendRelease();
					break;

				case INVOKE:
					processAction(event, clickPoint.x, clickPoint.y);
					break;

				case PACKETS:
					GameThread.invoke(() ->
					{
						try
						{
							if (config.sendClickPacket())
							{
								MousePackets.queueClickPacket();
							}

							if (event.getOpcode() == MenuAction.CC_OP || event.getOpcode() == MenuAction.CC_OP_LOW_PRIORITY)
							{
								int param0 = event.getParam0();
								int param1 = event.getParam1();
								int id = event.getIdentifier();
								int itemId = event.getItemId();
								if (itemId != -1)
								{
									client.invokeWidgetAction(id, param1, param0, itemId, "");
									return;
								}

								var widget = Widgets.fromId(event.getParam1());
								if (widget == null)
								{
									return;
								}

								var child = param0 == -1 ? null : widget.getChild(param0);
								if (child == null)
								{
									client.invokeWidgetAction(id, param1, param0, -1, "");
									return;
								}

								client.invokeWidgetAction(id, param1, param0, child.getItemId(), "");
							}
							else
							{
								Packets.fromAutomatedMenu(event).send();
							}
						}
						catch (InteractionException ex)
						{
							log.error("Packet interaction failed, falling back to invoke", ex);
							processAction(event, -1, -1);
						}
					});

					break;
			}
		}
		catch (InteractionException ex)
		{
			log.error("Interaction failed: {}", ex.getMessage());
			client.setPendingAutomation(null);
		}
	}

	public void setHoveredEntity(SceneEntity entity)
	{
		if (entity != null)
		{
			long[] entitiesAtMouse = client.getEntitiesAtMouse();
			int count = client.getEntitiesAtMouseCount();
			if (count < 1000)
			{
				entitiesAtMouse[count] = entity.getTag();
				client.setEntitiesAtMouseCount(count + 1);
			}
		}
	}

	private void processAction(MenuAutomated entry, int x, int y)
	{
		GameThread.invoke(() ->
				{
					if (config.sendClickPacket())
					{
						MousePackets.queueClickPacket();
					}
					client.invokeMenuAction(entry.getOption(), entry.getTarget(), entry.getIdentifier(),
							entry.getOpcode().getId(), entry.getParam0(), entry.getParam1(), x, y);
				});
	}

	private Point getClickPoint(MenuAutomated event)
	{
		if (config.mouseBehavior() == MouseBehavior.OFF_SCREEN)
		{
			return new Point(0, 0);
		}

		if (config.mouseBehavior() == MouseBehavior.MOUSE_POS)
		{
			return new Point(client.getMouseHandler().getCurrentX(), client.getMouseHandler().getCurrentY());
		}

		if (event.getClickX() != -1 && event.getClickY() != -1 && config.mouseBehavior() == MouseBehavior.CLICKBOXES)
		{
			Point clickPoint = new Point(event.getClickX(), event.getClickY());
			if (!clickInsideMinimap(clickPoint))
			{
				return clickPoint;
			}
		}

		Rectangle bounds = client.getCanvas().getBounds();
		Point randomPoint = new Point(Rand.nextInt(0, bounds.width), Rand.nextInt(0, bounds.height));
		if (clickInsideMinimap(randomPoint))
		{
			return getClickPoint(event);
		}

		return randomPoint;
	}

	public boolean clickInsideMinimap(Point point)
	{
		return getMinimap().contains(point);
	}

	private Rectangle getMinimap()
	{
		Widget minimap = Widgets.get(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA);
		if (Widgets.isVisible(minimap))
		{
			return minimap.getBounds();
		}

		Widget minimap1 = Widgets.get(WidgetInfo.RESIZABLE_MINIMAP_DRAW_AREA);
		if (Widgets.isVisible(minimap1))
		{
			return minimap1.getBounds();
		}

		Widget minimap2 = Widgets.get(WidgetInfo.RESIZABLE_MINIMAP_STONES_DRAW_AREA);
		if (Widgets.isVisible(minimap2))
		{
			return minimap2.getBounds();
		}

		Rectangle bounds = client.getCanvas().getBounds();
		return new Rectangle(bounds.width - MINIMAP_WIDTH, 0, MINIMAP_WIDTH, MINIMAP_HEIGHT);
	}

	private boolean clickOffScreen(Point point)
	{
		return point.x < 0 || point.y < 0
				|| point.x > client.getViewportWidth() || point.y > client.getViewportHeight();
	}
}
