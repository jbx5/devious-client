import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cd")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ar")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
