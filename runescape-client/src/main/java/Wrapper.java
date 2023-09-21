import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lb")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("al")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("ac")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("al")
	@Export("isSoft")
	abstract boolean isSoft();
}
