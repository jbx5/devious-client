package net.unethicalite.client.managers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.ContainableFrame;
import net.unethicalite.api.MouseHandler;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.NativeKeyInput;
import net.unethicalite.api.events.NativeMouseInput;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.InteractionManager;
import net.unethicalite.client.minimal.ui.MinimalUI;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
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

		if (clientWindow.getBounds().contains(eventX, eventY) && clientWindow.isFocused())
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

		List<GraphicsDevice> availableMonitors = getAvailableMonitors(monitors);
		if (availableMonitors.isEmpty())
		{
			return;
		}

		MenuAutomated queuedMenu = client.getQueuedMenu();
		Rectangle totalScreen = getJoinedScreen(getAdjacentMonitors(currentMonitor, availableMonitors));
		eventX -= totalScreen.x;

		int canvasX = (int) (eventX * ((double) client.getCanvasWidth() / totalScreen.width));
		int canvasY =
				(int) (eventY * ((double) client.getCanvasHeight() / currentMonitor.getDefaultConfiguration().getBounds().height));

		if (!availableMonitors.contains(currentMonitor))
		{
			canvasX = -1;
			canvasY = -1;
		}

		if (event.getType() == NativeMouseInput.Type.PRESS)
		{
			log.debug(
					"Mouse forwarded - Screen area: {} | Click: {} {} ({} {}) | Button {} | Canvas: {} {}",
					totalScreen,
					eventX,
					event.getX(),
					eventY,
					event.getY(),
					event.getButton(),
					canvasX,
					canvasY
			);
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
			case SCROLL:
			case PRESS:
				if (type == NativeMouseInput.Type.SCROLL && !config.forwardLeftClick())
				{
					return;
				}

				if (canvasX == -1 && canvasY == -1)
				{
					if (client.isFocused())
					{
						log.debug("Setting client unfocused");
						mouseHandler.sendFocusLost();
					}

					return;
				}

				if (!config.forwardMovement())
				{
					String coordsText = config.clickLocation();
					if (coordsText.matches("^\\d{0,5} \\d{0,5}$"))
					{
						String[] split = coordsText.split(" ");
						canvasX = Integer.parseInt(split[0]);
						canvasY = Integer.parseInt(split[1]);
					}
				}

				int button = config.forwardLeftClick() ? 1 : eventButton;

				if (queuedMenu == null)
				{
					if (config.forceForwarding())
					{
						mouseHandler.sendClick(canvasX, canvasY, button);
					}
				}
				else
				{
					final int clickX = canvasX;
					final int clickY = canvasY;

					GameThread.invoke(() ->
					{
						if (button == 1)
						{
							client.setPendingAutomation(queuedMenu);
							interactionManager.setHoveredEntity(queuedMenu.getEntity());
							client.setQueuedMenu(null);
						}

						mouseHandler.sendClick(clickX, clickY, button);
					});
				}

				break;

			case RELEASE:
				if (canvasX == -1 && canvasY == -1)
				{
					if (client.isFocused())
					{
						mouseHandler.sendFocusLost();
					}
				}
				else
				{
					mouseHandler.sendRelease();
				}

				break;

			case MOVEMENT:
				if (!config.forwardMovement())
				{
					return;
				}

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

		if (config.selectedButtonsOnly() && event.isButton())
		{
			List<Integer> buttons = Arrays.stream(config.selectedButtonIds().split(","))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			if (!buttons.contains(event.getButton()))
			{
				return false;
			}
		}

		if (config.forwardMovement() && config.forceForwardMovement() && event.getType() == NativeMouseInput.Type.MOVEMENT)
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

	private List<GraphicsDevice> getAvailableMonitors(GraphicsDevice[] devices)
	{
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
