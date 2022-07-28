import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fk")
public class class160 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lcb;")
	public UrlRequest field1755;

	@ObfuscatedName("q")
	public float[] field1754;

	@ObfuscatedSignature(descriptor = "Lef;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Lef;)V")
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1754 = new float[4];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1550492132")
	static int method3277(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}
			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 'ﾀ') + var1;
		}
	}
}