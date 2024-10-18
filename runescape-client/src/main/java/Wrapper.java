import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mf")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("aw")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("ap")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("aw")
	@Export("isSoft")
	abstract boolean isSoft();
}
