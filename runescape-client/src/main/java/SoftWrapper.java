import net.runelite.mapping.ObfuscatedName;
import java.lang.ref.SoftReference;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iu")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("o")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2);
		this.ref = new SoftReference(var1);
	}

	@ObfuscatedName("o")
	@Export("get")
	Object get() {
		return this.ref.get();
	}

	@ObfuscatedName("q")
	@Export("isSoft")
	boolean isSoft() {
		return true;
	}
}