import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ie")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("h")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("s")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("h")
	@Export("isSoft")
	abstract boolean isSoft();
}