package dev.hoot.bot.managers;

import dev.hoot.api.MouseHandler;
import dev.hoot.api.commons.Rand;
import dev.hoot.api.events.AutomatedInteraction;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.input.Mouse;
import dev.hoot.api.movement.Movement;
import dev.hoot.bot.Bot;
import dev.hoot.bot.config.BotConfig;
import dev.hoot.bot.config.InteractType;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuOptionClicked;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Point;
import java.awt.Rectangle;

@Singleton
@Slf4j
public class BotInteractionManager
{
	private static final int MINIMAP_WIDTH = 250;
	private static final int MINIMAP_HEIGHT = 180;

	private final Client client;
	private final BotConfig config;

	private volatile AutomatedInteraction action;
	private volatile int mouseClickX = -1;
	private volatile int mouseClickY = -1;

	@Inject
	public BotInteractionManager(Client client, BotConfig config)
	{
		this.client = client;
		this.config = config;
	}

	@Subscribe
	public void onInvokeMenuAction(AutomatedInteraction e)
	{
		String debug = "O=" + e.getOption()
				+ " | T=" + e.getTarget()
				+ " | ID=" + e.getIdentifier()
				+ " | OP=" + e.getOpcode()
				+ " | P0=" + e.getParam0()
				+ " | P1=" + e.getParam1();

		if (Bot.debugMenuAction)
		{
			log.info("[Bot Action] {}", debug);
		}

		if (config.mouseEvents())
		{
			if (!interactReady())
			{
				log.error("Interact was not ready, probably interacting too fast");
				return;
			}

			Point clickPoint = getClickPoint(e);
			mouseClickX = clickPoint.x;
			mouseClickY = clickPoint.y;
			log.debug("Sending click to {} {}", mouseClickX, mouseClickY);

			action = e;

			Mouse.click(mouseClickX, mouseClickY, true);
		}
		else
		{
			// Spoof mouse
			MouseHandler mouseHandler = client.getMouseHandler();
			Point clickPoint = getClickPoint(e);
			mouseClickX = clickPoint.x;
			mouseClickY = clickPoint.y;
			mouseHandler.sendMovement(mouseClickX, mouseClickY);
			mouseHandler.sendClick(mouseClickX, mouseClickY);
			InputManager.Companion.setLastClickX(mouseClickX);
			InputManager.Companion.setLastClickY(mouseClickY);
			InputManager.Companion.setLastMovedX(mouseClickX);
			InputManager.Companion.setLastMovedY(mouseClickY);
			processAction(e, mouseClickX, mouseClickY);
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

		if (Bot.debugMenuAction)
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

	private void processAction(AutomatedInteraction a, int x, int y)
	{
		if (a.getOpcode() == MenuAction.WALK)
		{
			Movement.setDestination(a.getParam0(), a.getParam1());
		}
		else
		{
			GameThread.invoke(() -> client.invokeMenuAction(a.getOption(), a.getTarget(), a.getIdentifier(),
					a.getOpcode().getId(), a.getParam0(), a.getParam1(), x, y));
		}
	}

	private Point getClickPoint(AutomatedInteraction e)
	{
		if (config.interactType() == InteractType.OFF_SCREEN)
		{
			return new Point(0, 0);
		}

		if (config.interactType() == InteractType.MOUSE_POS)
		{
			return new Point(client.getMouseHandler().getCurrentX(), client.getMouseHandler().getCurrentY());
		}

		if (e.getClickX() != -1 && e.getClickY() != -1 && config.interactType() == InteractType.CLICKBOXES)
		{
			Point clickPoint = new Point(e.getClickX(), e.getClickY());
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
