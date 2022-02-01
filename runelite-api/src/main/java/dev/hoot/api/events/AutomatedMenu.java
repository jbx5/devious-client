package dev.hoot.api.events;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;

import java.util.function.Consumer;

@Getter
public class AutomatedMenu
{
	private final String option;
	private final String target;
	private final int identifier;
	private final MenuAction opcode;
	private final int param0;
	private final int param1;
	private final int clickX;
	private final int clickY;
	private final long entityTag;

	@Setter
	private long timestamp;

	public AutomatedMenu(int identifier, int opcode, int param0, int param1)
	{
		this(identifier, MenuAction.of(opcode), param0, param1);
	}

	public AutomatedMenu(int identifier, MenuAction opcode, int param0, int param1)
	{
		this(identifier, opcode, param0, param1, -1337);
	}

	public AutomatedMenu(int identifier, int opcode, int param0, int param1, long entityTag)
	{
		this(identifier, MenuAction.of(opcode), param0, param1, entityTag);
	}

	public AutomatedMenu(int identifier, MenuAction opcode, int param0, int param1, long entityTag)
	{
		this(identifier, opcode, param0, param1, -1, -1, entityTag);
	}

	public AutomatedMenu(int identifier, int opcode, int param0, int param1, int clickX, int clickY)
	{
		this(identifier, opcode, param0, param1, clickX, clickY, -1337);
	}

	public AutomatedMenu(int identifier, int opcode, int param0, int param1, int clickX, int clickY, long entityTag)
	{
		this(identifier, MenuAction.of(opcode), param0, param1, clickX, clickY, entityTag);
	}

	public AutomatedMenu(int identifier, MenuAction opcode, int param0, int param1, int clickX, int clickY, long entityTag)
	{
		this("Automated", "", identifier, opcode, param0, param1, clickX, clickY, entityTag);
	}

	public AutomatedMenu(String option, String target, int identifier, MenuAction opcode, int param0, int param1,
						 int clickX, int clickY, long entityTag)
	{
		this.option = option;
		this.target = target;
		this.identifier = identifier;
		this.opcode = opcode;
		this.param0 = param0;
		this.param1 = param1;
		this.clickX = clickX;
		this.clickY = clickY;
		this.entityTag = entityTag;
		this.timestamp = System.currentTimeMillis();
	}

	public MenuEntry toEntry(Client client, Consumer<MenuEntry> consumer)
	{
		return toEntry(client, option, target, consumer);
	}

	public MenuEntry toEntry(Client client, String option, String target, Consumer<MenuEntry> consumer)
	{
		return client.createMenuEntry(-1)
				.setOption(option)
				.setTarget(target)
				.setIdentifier(identifier)
				.setType(opcode)
				.setParam0(param0)
				.setParam1(param1)
				.onClick(consumer);
	}

	public MenuEntry toEntry(Client client)
	{
		return toEntry(client, null);
	}

	public MenuOptionClicked toMenuOptionClicked()
	{
		MenuOptionClicked event = new MenuOptionClicked();
		event.setMenuOption(option);
		event.setMenuTarget(target);
		event.setMenuAction(opcode);
		event.setId(identifier);
		event.setParam0(param0);
		event.setParam1(param1);
		event.setCanvasX(clickX);
		event.setCanvasY(clickY);
		return event;
	}
}
