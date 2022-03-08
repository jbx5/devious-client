package net.runelite.api.events;

import dev.hoot.api.widgets.DialogOption;
import lombok.Value;

@Value
public class DialogProcessed
{
	DialogOption dialogOption;
}