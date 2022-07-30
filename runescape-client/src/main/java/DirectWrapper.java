import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("if")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("o")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2);
		this.obj = var1;
	}

	@ObfuscatedName("o")
	@Export("get")
	Object get() {
		return this.obj;
	}

	@ObfuscatedName("q")
	@Export("isSoft")
	boolean isSoft() {
		return false;
	}
}