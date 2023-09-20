import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bq")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ac")
	int field371;
	@ObfuscatedName("al")
	int field370;
	@ObfuscatedName("ak")
	int[] field372;
	@ObfuscatedName("ax")
	int[] field369;

	VorbisMapping() {
		class60 var1 = VorbisSample.field405;
		var1.method1171(16);
		this.field371 = var1.method1172() != 0 ? var1.method1171(4) + 1 : 1;
		if (var1.method1172() != 0) {
			var1.method1171(8);
		}

		var1.method1171(2);
		if (this.field371 > 1) {
			this.field370 = var1.method1171(4);
		}

		this.field372 = new int[this.field371];
		this.field369 = new int[this.field371];

		for (int var2 = 0; var2 < this.field371; ++var2) {
			var1.method1171(8);
			this.field372[var2] = var1.method1171(8);
			this.field369[var2] = var1.method1171(8);
		}

	}
}
