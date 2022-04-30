package net.runelite.api.events;

import net.runelite.api.DialogOption;
import lombok.Value;

@Value
public class DialogProcessed
{
	DialogOption dialogOption;
}