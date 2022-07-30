package net.unethicalite.client.managers;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseWheelEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseWheelListener;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.MouseListener;
import net.runelite.client.input.MouseManager;
import net.unethicalite.api.events.MouseAutomated;
import net.unethicalite.api.events.NativeKeyInput;
import net.unethicalite.api.events.NativeMouseInput;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.logging.Logger;

@Singleton
@Slf4j
public class InputManager implements MouseListener, NativeMouseInputListener, NativeMouseWheelListener,
		NativeKeyListener
{
	private final Client client;
	private final MinimalPluginManager minimalPluginManager;
	private final LoopedPluginManager loopedPluginManager;
	private final UnethicaliteConfig interactionConfig;

	@Getter
	private int lastClickX = -1;
	@Getter
	private int lastClickY = -1;
	@Getter
	private int lastMoveX = -1;
	@Getter
	private int lastMoveY = -1;

	@Inject
	public InputManager(
			MinimalPluginManager minimalPluginManager,
			LoopedPluginManager loopedPluginManager,
			MouseManager manager,
			EventBus eventBus,
			Client client,
			UnethicaliteConfig interactionConfig
	)
	{
		this.minimalPluginManager = minimalPluginManager;
		this.loopedPluginManager = loopedPluginManager;
		this.client = client;
		this.interactionConfig = interactionConfig;
		eventBus.register(this);
		manager.registerMouseListener(this);
		if (!Boolean.parseBoolean(System.getenv("disablenative")))
		{
			try
			{
				GlobalScreen.registerNativeHook();
			}
			catch (Exception e)
			{
				log.error("Failed to register native hook", e);
			}
		}
		Logger.getLogger(GlobalScreen.class.getPackage().getName()).setLevel(java.util.logging.Level.OFF);
	}

	@Override
	public MouseEvent mouseClicked(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastClick(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mousePressed(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastClick(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mouseReleased(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastClick(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mouseEntered(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastMove(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mouseExited(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastMove(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mouseDragged(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastMove(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Override
	public MouseEvent mouseMoved(MouseEvent mouseEvent)
	{
		checkIfAutomated(mouseEvent);
		setLastMove(mouseEvent.getX(), mouseEvent.getY());
		return mouseEvent;
	}

	@Subscribe
	private void onMouseAutomated(MouseAutomated event)
	{
		switch (event.getEventType())
		{
			case PRESS:
			case RELEASE:
				setLastClick(event.getX(), event.getY());
				break;

			case EXIT:
			case MOVE:
				setLastMove(event.getX(), event.getY());
				break;
		}
	}

	@Override
	public void nativeMouseClicked(NativeMouseEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.CLICK
		));
	}

	@Override
	public void nativeMousePressed(NativeMouseEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.PRESS
		));
	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.RELEASE
		));
	}

	@Override
	public void nativeMouseMoved(NativeMouseEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.MOVEMENT
		));
	}

	@Override
	public void nativeMouseDragged(NativeMouseEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.MOVEMENT
		));
	}

	@Override
	public void nativeMouseWheelMoved(NativeMouseWheelEvent nativeEvent)
	{
		client.getCallbacks().post(new NativeMouseInput(
				nativeEvent.getX(),
				nativeEvent.getY(),
				nativeEvent.getButton(),
				NativeMouseInput.Type.SCROLL
		));
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent nativeEvent)
	{
		client.getCallbacks().post(
				new NativeKeyInput(
						nativeEvent.getKeyChar(),
						nativeEvent.getKeyCode(),
						nativeEvent.getKeyLocation(),
						NativeKeyInput.Type.PRESSED
				)
		);
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("unethicalite"))
		{
			return;
		}

		if (!event.getKey().equals("interactMethod"))
		{
			return;
		}

		if (Objects.equals(event.getNewValue(), "MOUSE_FORWARDING"))
		{
			GlobalScreen.addNativeMouseListener(this);
			GlobalScreen.addNativeMouseMotionListener(this);
			GlobalScreen.addNativeMouseWheelListener(this);
			GlobalScreen.addNativeKeyListener(this);
		}
		else if (Objects.equals(event.getOldValue(), "MOUSE_FORWARDING"))
		{
			GlobalScreen.removeNativeMouseListener(this);
			GlobalScreen.removeNativeMouseMotionListener(this);
			GlobalScreen.removeNativeMouseWheelListener(this);
			GlobalScreen.removeNativeKeyListener(this);
		}
	}

	private void setLastClick(int x, int y)
	{
		lastClickX = x;
		lastClickY = y;
	}

	private void setLastMove(int x, int y)
	{
		lastMoveX = x;
		lastMoveY = y;
	}

	private void checkIfAutomated(MouseEvent mouseEvent)
	{
		if (!interactionConfig.disableMouse())
		{
			return;
		}

		if ((loopedPluginManager.isPluginRegistered() || minimalPluginManager.isScriptRunning())
				&& mouseEvent.getSource() != "unethicalite")
		{
			mouseEvent.consume();
		}
	}
}
