import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cm")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("aj")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
