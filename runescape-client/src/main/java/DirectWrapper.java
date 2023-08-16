import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lu")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("au")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2);
		this.obj = var1;
	}

	@ObfuscatedName("au")
	@Export("get")
	Object get() {
		return this.obj;
	}

	@ObfuscatedName("ae")
	@Export("isSoft")
	boolean isSoft() {
		return false;
	}
}
