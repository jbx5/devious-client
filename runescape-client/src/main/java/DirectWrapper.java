import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mu")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("ap")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2);
		this.obj = var1;
	}

	@ObfuscatedName("ap")
	@Export("get")
	Object get() {
		return this.obj;
	}

	@ObfuscatedName("aw")
	@Export("isSoft")
	boolean isSoft() {
		return false;
	}
}
