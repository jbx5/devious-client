package dev.hoot.api.events;

import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;

@Value
public class AutomatedInteraction
{
	String option;
	String target;
	int identifier;
	MenuAction opcode;
	int param0;
	int param1;
	int clickX;
	int clickY;
	long entityTag;

	public MenuEntry toMenuEntry(Client client)
	{
		return client.createMenuEntry("Automated", "", identifier, opcode.getId(), param0, param1, false);
	}
}
