package net.unethicalite.api.events;

import lombok.Value;
import net.runelite.api.MenuAction;

@Value
public class MenuActionProcessed
{
	String option;
	String target;
	int identifier;
	MenuAction opcode;
	int param0;
	int param1;
	int clickX;
	int clickY;
}
