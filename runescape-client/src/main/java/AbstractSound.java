import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bf")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("e")
	@Export("position")
	int position;

	AbstractSound() {
	}
}