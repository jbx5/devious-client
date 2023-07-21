import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lr")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("aw")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2);
		this.ref = new SoftReference(var1);
	}

	@ObfuscatedName("aw")
	@Export("get")
	Object get() {
		return this.ref.get();
	}

	@ObfuscatedName("ay")
	@Export("isSoft")
	boolean isSoft() {
		return true;
	}
}
