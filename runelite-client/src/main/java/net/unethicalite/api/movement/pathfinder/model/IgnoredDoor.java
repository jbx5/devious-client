package net.unethicalite.api.movement.pathfinder.model;

import lombok.AllArgsConstructor;
import lombok.Value;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.model.requirement.Requirements;

@Value
@AllArgsConstructor
public class IgnoredDoor
{
	WorldPoint location;
	int id;
	Requirements requirements;
}
