import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("li")
@Implements("DirectWrapper")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("aw")
	@Export("obj")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2);
		this.obj = var1;
	}

	@ObfuscatedName("aw")
	@Export("get")
	Object get() {
		return this.obj;
	}

	@ObfuscatedName("ay")
	@Export("isSoft")
	boolean isSoft() {
		return false;
	}
}
