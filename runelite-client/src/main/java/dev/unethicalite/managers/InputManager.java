package dev.unethicalite.managers;

import dev.unethicalite.api.events.MouseAutomated;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.MouseListener;
import net.runelite.client.input.MouseManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.event.MouseEvent;

@Singleton
@Slf4j
public class InputManager implements MouseListener
{
	private final ScriptManager scriptManager;
	private final LoopedPluginManager loopedPluginManager;

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
			ScriptManager scriptManager,
			LoopedPluginManager loopedPluginManager,
			MouseManager manager,
			EventBus eventBus)
	{
		this.scriptManager = scriptManager;
		this.loopedPluginManager = loopedPluginManager;
		eventBus.register(this);
		manager.registerMouseListener(this);
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
		if ((loopedPluginManager.isRunning() || scriptManager.isRunning()) && mouseEvent.getSource() != "unethicalite")
		{
			mouseEvent.consume();
		}
	}
}
