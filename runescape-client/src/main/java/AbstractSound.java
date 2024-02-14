import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cx")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("as")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
