package dev.hoot.bot.managers.interaction;

import dev.hoot.api.MouseHandler;
import dev.hoot.api.commons.Rand;
import dev.hoot.api.commons.Time;
import dev.hoot.api.events.AutomatedInteraction;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.movement.Movement;
import dev.hoot.api.widgets.DialogOption;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Constants;
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

	@Subscribe
	public void onInvokeMenuAction(AutomatedInteraction e)
	{
		String debug = "O=" + e.getOption()
				+ " | T=" + e.getTarget()
				+ " | ID=" + e.getIdentifier()
				+ " | OP=" + e.getOpcode()
				+ " | P0=" + e.getParam0()
				+ " | P1=" + e.getParam1()
				+ " | X=" + e.getClickX()
				+ " | Y=" + e.getClickY()
				+ " | TAG=" + e.getEntityTag();

		log.debug("[Automated] {}", debug);
		Point randomPoint = getClickPoint(e);
		MouseHandler mouseHandler = client.getMouseHandler();

		if (config.clickSwap())
		{
			if (!interactReady())
			{
				log.warn("Interacting too fast, consider slowing down consecutive interactions");
				Time.sleep(Constants.CLIENT_TICK_LENGTH);
				return;
			}

			client.setPendingAutomation(e);

			log.debug("Sending click to [{}, {}]", randomPoint.x, randomPoint.y);

			long tag = e.getEntityTag();
			if (tag != -1337)
			{
				long[] entitiesAtMouse = client.getEntitiesAtMouse();
				int count = client.getEntitiesAtMouseCount();
				if (count < 1000)
				{
					entitiesAtMouse[count] = tag;
					client.setEntitiesAtMouseCount(count + 1);
				}
			}

			mouseHandler.sendMovement(randomPoint.x, randomPoint.y);
			mouseHandler.sendClick(randomPoint.x, randomPoint.y);
			Time.sleep(Constants.CLIENT_TICK_LENGTH);
		}
		else
		{
			mouseHandler.sendMovement(randomPoint.x, randomPoint.y);
			mouseHandler.sendClick(randomPoint.x, randomPoint.y, 1337);
			processAction(e, randomPoint.x, randomPoint.y);
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked e)
	{
		if (e.isAutomated() && e.getMenuAction() == MenuAction.WALK)
		{
			Movement.setDestination(e.getParam0(), e.getParam1());
		}

		String action = "O=" + e.getMenuOption()
				+ " | T=" + e.getMenuTarget()
				+ " | ID=" + e.getId()
				+ " | OP=" + e.getMenuAction().getId()
				+ " | P0=" + e.getParam0()
				+ " | P1=" + e.getParam1()
				+ " | X=" + e.getCanvasX()
				+ " | Y=" + e.getCanvasY();
		log.debug("[Menu Action] {}", action);
	}

	@Subscribe
	public void onDialogProcessed(DialogProcessed e)
	{
		DialogOption dialogOption = DialogOption.of(e.getDialogOption().getWidgetUid(), e.getDialogOption().getMenuIndex());
		if (dialogOption != null)
		{
			log.debug("Dialog processed {}", dialogOption);
		}
		else
		{
			log.debug("Unknown or unmapped dialog {}", e);
		}
	}

	private void processAction(AutomatedInteraction entry, int x, int y)
	{
		GameThread.invoke(() -> client.invokeMenuAction(entry.getOption(), entry.getTarget(), entry.getIdentifier(),
				entry.getOpcode().getId(), entry.getParam0(), entry.getParam1(), x, y));
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

	private boolean interactReady()
	{
		return client.getPendingAutomation() == null;
	}
}
