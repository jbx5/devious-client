package net.unethicalite.api.events;

import lombok.Value;
import net.runelite.api.packets.IsaacCipher;

@Value
public class IsaacCipherGenerated
{
	int[] seed;
	IsaacCipher isaacCipher;
}
