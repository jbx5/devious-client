import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cp")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ao")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
