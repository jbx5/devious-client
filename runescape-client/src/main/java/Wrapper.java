import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iq")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("q")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("o")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("q")
	@Export("isSoft")
	abstract boolean isSoft();
}