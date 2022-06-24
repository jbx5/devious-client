import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("mg")
class class360 implements Comparator {
	@ObfuscatedName("c")
	@Export("javaVendor")
	public static String javaVendor;

	@ObfuscatedSignature(descriptor = "Lmy;")
	final class361 this$0;

	@ObfuscatedSignature(descriptor = "(Lmy;)V")
	class360(class361 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lmv;Lmv;I)I", garbageValue = "796004144")
	int method6532(class362 var1, class362 var2) {
		if (var1.field4277 > var2.field4277) {
			return 1;
		} else {
			return var1.field4277 < var2.field4277 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6532(((class362) (var1)), ((class362) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}