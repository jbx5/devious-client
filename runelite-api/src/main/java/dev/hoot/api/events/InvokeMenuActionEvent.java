package dev.hoot.api.events;

import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;

public class InvokeMenuActionEvent
{
	public int clickX;
	public int clickY;

	@Getter
	private final MenuEntry menuEntry;

	public InvokeMenuActionEvent(Client client, int identifier, int opcode, int param0, int param1)
	{
		menuEntry = client.createMenuEntry(-1).setOption("Automated").setTarget("").setIdentifier(identifier)
				.setType(MenuAction.of(opcode))
				.setParam0(param0)
				.setParam1(param1);
	}
}
