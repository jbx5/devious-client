package net.runelite.api.events;

import dev.unethicalite.api.widgets.DialogOption;
import lombok.Value;

@Value
public class DialogProcessed
{
	DialogOption dialogOption;
}