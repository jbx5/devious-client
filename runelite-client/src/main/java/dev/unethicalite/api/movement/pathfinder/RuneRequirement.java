package dev.unethicalite.api.movement.pathfinder;

import dev.unethicalite.api.magic.Rune;
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
