package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.magic.Rune;
import lombok.Value;

@Value
public class RuneRequirement
{
	int quantity;
	Rune rune;

	public boolean meetsRequirements()
	{
		return rune.getQuantity() >= quantity;
	}
}
