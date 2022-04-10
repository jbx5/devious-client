package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.magic.Rune;
import lombok.Value;

/**
 * @deprecated
 * Use {@link dev.hoot.api.magic.RuneRequirement} instead.
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
