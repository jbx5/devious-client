package net.runelite.client.plugins.interaction;

import dev.hoot.api.MouseHandler;
import dev.hoot.api.commons.Rand;
import dev.hoot.api.events.InvokeMenuActionEvent;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.input.Mouse;
import dev.hoot.api.movement.Movement;
import dev.hoot.api.widgets.DialogOption;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
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

	private volatile MenuEntry action;
	private volatile int mouseClickX = -1;
	private volatile int mouseClickY = -1;

	@Subscribe
	public void onInvokeMenuAction(InvokeMenuActionEvent e)
	{
		String debug = "O=" + e.getMenuEntry().getOption()
				+ " | T=" + e.getMenuEntry().getTarget()
				+ " | ID=" + e.getMenuEntry().getIdentifier()
				+ " | OP=" + e.getMenuEntry().getType()
				+ " | P0=" + e.getMenuEntry().getParam0()
				+ " | P1=" + e.getMenuEntry().getParam1();

		if (config.debugInteractions())
		{
			log.info("[Bot Action] {}", debug);
		}

		if (config.mouseEvents())
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

			action = e.getMenuEntry();

			Mouse.click(mouseClickX, mouseClickY, true);
		}
		else
		{
			// Spoof mouse
			MouseHandler mouseHandler = client.getMouseHandler();
			Point randomPoint = getClickPoint(e);
			mouseClickX = randomPoint.x;
			mouseClickY = randomPoint.y;
			mouseHandler.sendMovement(mouseClickX, mouseClickY);
			mouseHandler.sendClick(mouseClickX, mouseClickY);
			processAction(e.getMenuEntry(), mouseClickX, mouseClickY);
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		if (config.mouseEvents() && e.getCanvasX() == mouseClickX && e.getCanvasY() == mouseClickY)
		{
			e.consume();

			if (action == null)
			{
				log.error("Menu replace failed");
				return;
			}

			processAction(action, mouseClickX, mouseClickY);
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
			log.info("[Manual Action] {}", action);
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

	private void processAction(MenuEntry entry, int x, int y)
	{
		if (entry.getMenuAction() == MenuAction.WALK)
		{
			Movement.setDestination(entry.getParam0(), entry.getParam1());
		}
		else
		{
			GameThread.invoke(() -> client.invokeMenuAction(entry.getOption(), entry.getTarget(), entry.getIdentifier(),
					entry.getMenuAction().getId(), entry.getParam0(), entry.getParam1(), x, y));
		}
	}

	private Point getClickPoint(InvokeMenuActionEvent e)
	{
		if (config.interactType() == InteractType.OFF_SCREEN)
		{
			return new Point(0, 0);
		}

		if (config.interactType() == InteractType.MOUSE_POS)
		{
			return new Point(client.getMouseHandler().getCurrentX(), client.getMouseHandler().getCurrentY());
		}

		if (e.clickX != -1 && e.clickY != -1 && config.interactType() == InteractType.CLICKBOXES)
		{
			Point clickPoint = new Point(e.clickX, e.clickY);
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
