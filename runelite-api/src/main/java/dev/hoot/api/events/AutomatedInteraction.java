package dev.hoot.api.events;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;

@Getter
public class AutomatedInteraction
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

	@Setter
	private int selectedItemSlot;

	public AutomatedInteraction(String option, String target, int identifier, MenuAction opcode, int param0, int param1,
								int clickX, int clickY, long entityTag)
	{
		this(option, target, identifier, opcode, param0, param1, clickX, clickY, entityTag, -1);
	}

	public AutomatedInteraction(String option, String target, int identifier, MenuAction opcode, int param0, int param1,
								int clickX, int clickY, long entityTag, int selectedItemSlot)
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
		this.selectedItemSlot = selectedItemSlot;
		this.timestamp = System.currentTimeMillis();

	}

	public MenuEntry toMenuEntry(Client client)
	{
		return client.createMenuEntry(option, target, opcode.getId(), identifier, param0, param1, false);
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
		event.setSelectedItemIndex(selectedItemSlot);
		return event;
	}
}
