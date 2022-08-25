import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("id")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("s")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2);
		this.obj = var1;
	}

	@ObfuscatedName("s")
	@Export("get")
	Object get() {
		return this.obj;
	}

	@ObfuscatedName("h")
	@Export("isSoft")
	boolean isSoft() {
		return false;
	}
}