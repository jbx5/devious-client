import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ty")
@Implements("IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("ab")
	@Export("integer")
	public int integer;

	public IntegerNode(int var1) {
		this.integer = var1;
	}
}
