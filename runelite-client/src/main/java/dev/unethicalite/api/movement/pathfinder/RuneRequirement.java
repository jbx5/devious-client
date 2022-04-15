package dev.unethicalite.api.movement.pathfinder;

import dev.unethicalite.api.magic.Rune;
import lombok.Value;

/**
 * @deprecated
 * Use {@link dev.unethicalite.api.magic.RuneRequirement} instead.
 */
@Value
@Deprecated
public class RuneRequirement
{
	int quantity;
	Rune rune;

	public boolean meetsRequirements()
	{
		return rune.getQuantity() >= quantity;
	}
}
