import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tv")
@Implements("IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("ak")
	@Export("integer")
	public int integer;

	public IntegerNode(int var1) {
		this.integer = var1;
	}
}
