package net.unethicalite.api.events;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

@Value
public class MovementAutomated
{
	WorldPoint destination;
}
