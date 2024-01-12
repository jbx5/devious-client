import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lt")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("ap")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("am")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("ap")
	@Export("isSoft")
	abstract boolean isSoft();
}
