import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bg")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aw")
	int field383;
	@ObfuscatedName("ay")
	int field381;
	@ObfuscatedName("ar")
	int[] field380;
	@ObfuscatedName("am")
	int[] field382;

	VorbisMapping() {
		class60 var1 = VorbisSample.field415;
		var1.method1184(16);
		this.field383 = var1.method1185() != 0 ? var1.method1184(4) + 1 : 1;
		if (var1.method1185() != 0) {
			var1.method1184(8);
		}

		var1.method1184(2);
		if (this.field383 > 1) {
			this.field381 = var1.method1184(4);
		}

		this.field380 = new int[this.field383];
		this.field382 = new int[this.field383];

		for (int var2 = 0; var2 < this.field383; ++var2) {
			var1.method1184(8);
			this.field380[var2] = var1.method1184(8);
			this.field382[var2] = var1.method1184(8);
		}

	}
}
