import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public enum class310 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3979(-1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3982(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3981(1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3980(2);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 73014485
	)
	final int field3983;

	class310(int var3) {
		this.field3983 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3983; // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ldc;",
		garbageValue = "-450916759"
	)
	static class124 method5941(int var0) {
		class124 var1 = (class124)Varps.findEnumerated(class97.method2586(), var0); // L: 126
		if (var1 == null) {
			var1 = class124.field1524; // L: 127
		}

		return var1; // L: 128
	}
}
