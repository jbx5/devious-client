package dev.hoot.bot.managers.interaction;

import dev.hoot.api.MouseHandler;
import dev.hoot.api.commons.Rand;
import dev.hoot.api.events.AutomatedInteraction;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.input.Mouse;
import dev.hoot.api.movement.Movement;
import dev.hoot.api.widgets.DialogOption;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.events.DialogProcessed;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.eventbus.Subscribe;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
@Slf4j
public class InteractionManager
{
	private static final int MINIMAP_WIDTH = 250;
	private static final int MINIMAP_HEIGHT = 180;

	@Inject
	private InteractionConfig config;

	@Inject
	private Client client;

	private volatile AutomatedInteraction action;
	private volatile int mouseClickX = -1;
	private volatile int mouseClickY = -1;

	@Subscribe
	public void onInvokeMenuAction(AutomatedInteraction e)
	{
		String debug = "O=" + e.getOption()
				+ " | T=" + e.getTarget()
				+ " | ID=" + e.getIdentifier()
				+ " | OP=" + e.getOpcode()
				+ " | P0=" + e.getParam0()
				+ " | P1=" + e.getParam1()
				+ " | TAG=" + e.getEntityTag();

		if (config.debugInteractions())
		{
			log.info("[Automated] {}", debug);
		}

		MouseHandler mouseHandler = client.getMouseHandler();

		if (config.clickSwap())
		{
			if (!interactReady())
			{
				log.error("Interact was not ready {} {}", mouseClickX, mouseClickY);
				return;
			}

			Point randomPoint = getClickPoint(e);
			mouseClickX = randomPoint.x;
			mouseClickY = randomPoint.y;
			if (config.debugInteractions())
			{
				log.info("Sending click to {} {}", mouseClickX, mouseClickY);
			}

			action = e;

			mouseHandler.sendClick(mouseClickX, mouseClickY);
		}
		else
		{
			// Spoof mouse
			Point randomPoint = getClickPoint(e);
			mouseClickX = randomPoint.x;
			mouseClickY = randomPoint.y;
			mouseHandler.sendMovement(mouseClickX, mouseClickY);
			mouseHandler.sendClick(mouseClickX, mouseClickY, 1337);
			processAction(e, mouseClickX, mouseClickY);
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		if (config.clickSwap() && e.getCanvasX() == mouseClickX && e.getCanvasY() == mouseClickY)
		{
			if (action == null)
			{
				log.error("Menu replace failed");
				return;
			}

			e.setMenuOption(action.getOption());
			e.setMenuTarget(action.getTarget());
			e.setId(action.getIdentifier());
			e.setMenuAction(action.getOpcode());
			e.setParam0(action.getParam0());
			e.setParam1(action.getParam1());
			reset();
			return;
		}

		if (config.debugInteractions())
		{
			String action = "O=" + e.getMenuOption()
					+ " | T=" + e.getMenuTarget()
					+ " | ID=" + e.getId()
					+ " | OP=" + e.getMenuAction().getId()
					+ " | P0=" + e.getParam0()
					+ " | P1=" + e.getParam1();
			log.info("[Menu Action] {}", action);
		}

		reset();
	}

	@Subscribe
	public void onDialogProcessed(DialogProcessed e)
	{
		if (!config.debugDialogs())
		{
			return;
		}

		DialogOption dialogOption = DialogOption.of(e.getDialogOption().getWidgetUid(), e.getDialogOption().getMenuIndex());
		if (dialogOption != null)
		{
			log.info("Dialog processed {}", dialogOption);
		}
		else
		{
			log.info("Unknown or unmapped dialog {}", e);
		}
	}

	private void processAction(AutomatedInteraction entry, int x, int y)
	{
		if (entry.getOpcode() == MenuAction.WALK)
		{
			Movement.setDestination(entry.getParam0(), entry.getParam1());
		}
		else
		{
			GameThread.invoke(() -> client.invokeMenuAction(entry.getOption(), entry.getTarget(), entry.getIdentifier(),
					entry.getOpcode().getId(), entry.getParam0(), entry.getParam1(), x, y));
		}
	}

	private Point getClickPoint(AutomatedInteraction e)
	{
		if (config.interactType() == InteractType.OFF_SCREEN)
		{
			return new Point(5, 5);
		}

		if (config.interactType() == InteractType.MOUSE_POS)
		{
			return new Point(client.getMouseHandler().getCurrentX(), client.getMouseHandler().getCurrentY());
		}

		if (e.getClickX() != -1 && e.getClickY() != -1 && config.interactType() == InteractType.CLICKBOXES)
		{
			Point clickPoint = new Point(e.getClickY(), e.getClickY());
			if (!clickInsideMinimap(clickPoint))
			{
				return clickPoint;
			}
		}

		Rectangle bounds = client.getCanvas().getBounds();
		Point randomPoint = new Point(Rand.nextInt(2, bounds.width), Rand.nextInt(2, bounds.height));
		if (clickInsideMinimap(randomPoint))
		{
			return getClickPoint(e);
		}

		return randomPoint;
	}

	private boolean clickInsideMinimap(Point point)
	{
		Rectangle minimap = getMinimap();
		if (minimap.contains(point))
		{
			log.debug("Click {} was inside minimap", point);
			return true;
		}

		return false;
	}

	private Rectangle getMinimap()
	{
		Rectangle bounds = client.getCanvas().getBounds();
		return new Rectangle(bounds.width - MINIMAP_WIDTH, 0, MINIMAP_WIDTH, MINIMAP_HEIGHT);
	}

	private void reset()
	{
		action = null;
		mouseClickX = -1;
		mouseClickY = -1;
	}

	private boolean interactReady()
	{
		return mouseClickX == -1 && mouseClickY == -1;
	}
}
