import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lp")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("ah")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("az")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("ah")
	@Export("isSoft")
	abstract boolean isSoft();
}
