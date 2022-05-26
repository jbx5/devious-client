package dev.unethicalite.managers;

import dev.unethicalite.api.MouseHandler;
import dev.unethicalite.api.events.MenuAutomated;
import dev.unethicalite.api.events.NativeKeyInput;
import dev.unethicalite.api.events.NativeMouseInput;
import dev.unethicalite.api.game.GameThread;
import dev.unethicalite.client.config.UnethicaliteConfig;
import dev.unethicalite.client.minimal.ui.MinimalUI;
import dev.unethicalite.managers.interaction.InteractMethod;
import dev.unethicalite.managers.interaction.InteractionManager;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ContainableFrame;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@Slf4j
public class NativeInputManager
{
	@Inject
	private UnethicaliteConfig config;

	@Inject
	private Client client;

	@Inject
	private InteractionManager interactionManager;

	@Inject
	NativeInputManager(EventBus eventBus)
	{
		eventBus.register(this);
	}

	@Subscribe
	public void onNativeMouseInput(NativeMouseInput event)
	{
		if (!canForwardMouseEvent(event))
		{
			return;
		}

		MouseHandler mouseHandler = client.getMouseHandler();
		if (mouseHandler == null)
		{
			return;
		}

		double eventX = event.getX();
		double eventY = event.getY();

		ContainableFrame clientWindow = MinimalUI.getFrame() != null ? MinimalUI.getFrame() : ClientUI.getFrame();
		if (clientWindow == null)
		{
			return;
		}

		if (clientWindow.getBounds().contains(eventX, eventY))
		{
			return;
		}

		GraphicsDevice[] monitors = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
		GraphicsDevice currentMonitor = Arrays.stream(monitors)
				.filter(device -> device.getDefaultConfiguration().getBounds().contains(event.getX(), event.getY()))
				.findFirst()
				.orElse(null);
		if (currentMonitor == null)
		{
			return;
		}

		List<GraphicsDevice> availableMonitors = getAvailableMonitors();
		if (availableMonitors.isEmpty())
		{
			return;
		}

		MenuAutomated queuedMenu = client.getQueuedMenu();
		if (!availableMonitors.contains(currentMonitor))
		{
			forwardToCanvas(event.getType(), -1, -1, event.getButton(), queuedMenu);

			if (event.getType() != NativeMouseInput.Type.MOVEMENT && client.isFocused())
			{
				log.debug("Setting client unfocused");
				mouseHandler.sendFocusLost();
			}

			return;
		}

		Rectangle totalScreen = getJoinedScreen(getAdjacentMonitors(currentMonitor, availableMonitors));
		eventX -= totalScreen.x;

		int canvasX = (int) (eventX * ((double) client.getCanvasWidth() / totalScreen.width));
		int canvasY = (int) (eventY * ((double) client.getCanvasHeight() / currentMonitor.getDisplayMode().getHeight()));

		if (event.getType() == NativeMouseInput.Type.PRESS)
		{
			log.debug("Total screen: {}, Click: {} {}, Canvas: {} {}", totalScreen, eventX, eventY, canvasX, canvasY);
		}

		if (event.getType() == NativeMouseInput.Type.PRESS
				&& queuedMenu != null
				&& queuedMenu.getOpcode() != MenuAction.WALK
				&& interactionManager.clickInsideMinimap(new Point(canvasX, canvasY)))
		{
			return;
		}

		forwardToCanvas(event.getType(), canvasX, canvasY, event.getButton(), queuedMenu);
	}

	private void forwardToCanvas(NativeMouseInput.Type type, int canvasX, int canvasY, int eventButton,
								 MenuAutomated queuedMenu)
	{
		MouseHandler mouseHandler = client.getMouseHandler();
		switch (type)
		{
			case PRESS:
				int button = config.forwardLeftClick() ? 1 : eventButton;

				if (queuedMenu == null)
				{
					if (config.forceForwarding())
					{
						mouseHandler.sendClick(canvasX, canvasY, button);
					}

					return;
				}

				GameThread.invoke(() ->
				{
					if (button == 1)
					{
						client.setPendingAutomation(queuedMenu);
						interactionManager.setHoveredEntity(queuedMenu.getEntity());
						client.setQueuedMenu(null);
					}

					mouseHandler.sendClick(canvasX, canvasY, button);
				});

				break;

			case RELEASE:
				mouseHandler.sendRelease();
				break;

			case MOVEMENT:
				mouseHandler.sendMovement(canvasX, canvasY);
				break;
		}
	}

	@Subscribe
	public void onNativeKeyInput(NativeKeyInput event)
	{
		if (config.forwardKeystrokes())
		{
			Point mouse = MouseInfo.getPointerInfo().getLocation();
			client.getCallbacks().post(
					new NativeMouseInput(
							mouse.x,
							mouse.y,
							1,
							NativeMouseInput.Type.PRESS
					)
			);
		}
	}

	private boolean canForwardMouseEvent(NativeMouseInput event)
	{
		if (config.interactMethod() != InteractMethod.MOUSE_FORWARDING)
		{
			return false;
		}

		if (config.forceForwardMovement() && event.getType() == NativeMouseInput.Type.MOVEMENT)
		{
			return true;
		}

		if (config.forceForwarding())
		{
			return true;
		}

		return client.getQueuedMenu() != null;
	}

	private List<GraphicsDevice> getAdjacentMonitors(GraphicsDevice primary, List<GraphicsDevice> monitors)
	{
		List<GraphicsDevice> out = new ArrayList<>();
		out.add(primary);
		GraphicsDevice current = primary;
		for (int i = monitors.indexOf(primary) + 1; i < monitors.size(); i++)
		{
			GraphicsDevice next = monitors.get(i);
			if (isAdjacent(current, next))
			{
				out.add(next);
				current = next;
			}
		}

		current = primary;
		for (int i = monitors.indexOf(primary) - 1; i >= 0; i--)
		{
			GraphicsDevice prev = monitors.get(i);
			if (isAdjacent(current, prev))
			{
				out.add(prev);
				current = prev;
			}
		}

		return out.stream()
				.sorted(Comparator.comparingInt((GraphicsDevice m) -> m.getDefaultConfiguration().getBounds().x))
				.collect(Collectors.toList());
	}

	private boolean isAdjacent(GraphicsDevice first, GraphicsDevice second)
	{
		if (first == null || second == null)
		{
			return false;
		}

		Rectangle firstBounds = first.getDefaultConfiguration().getBounds();
		Rectangle secondBounds = second.getDefaultConfiguration().getBounds();
		return (firstBounds.x + firstBounds.width == secondBounds.x
				|| secondBounds.x + secondBounds.width == firstBounds.x);
	}

	private Rectangle getJoinedScreen(List<GraphicsDevice> sortedMonitors)
	{
		Rectangle screen = sortedMonitors.get(0).getDefaultConfiguration().getBounds();
		for (int i = 1; i < sortedMonitors.size(); i++)
		{
			GraphicsDevice monitor = sortedMonitors.get(i);
			screen.add(monitor.getDefaultConfiguration().getBounds());
		}

		return screen;
	}

	private List<GraphicsDevice> getAvailableMonitors()
	{
		GraphicsDevice[] devices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
		if (!config.selectedMonitorsOnly())
		{
			return Arrays.asList(devices);
		}

		List<Integer> monitorIds = Arrays.stream(config.selectedMonitorIds().split(","))
				.map(String::trim)
				.map(s -> Integer.parseInt(s) - 1)
				.collect(Collectors.toList());
		return monitorIds.stream()
				.filter(id -> id < devices.length)
				.map(id -> GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[id])
				.sorted(Comparator.comparingInt((GraphicsDevice m) -> m.getDefaultConfiguration().getBounds().x)
						.thenComparingInt((GraphicsDevice m) -> m.getDefaultConfiguration().getBounds().y))
				.collect(Collectors.toList());
	}
}
