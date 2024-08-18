import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mu")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("ay")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("ab")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("ay")
	@Export("isSoft")
	abstract boolean isSoft();
}
