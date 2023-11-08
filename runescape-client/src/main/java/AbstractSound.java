import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cl")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("au")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
