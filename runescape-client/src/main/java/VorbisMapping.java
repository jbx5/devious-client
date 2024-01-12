import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bz")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("am")
	int field360;
	@ObfuscatedName("ap")
	int field358;
	@ObfuscatedName("af")
	int[] field359;
	@ObfuscatedName("aj")
	int[] field357;

	VorbisMapping() {
		class60 var1 = VorbisSample.field376;
		var1.method1188(16);
		this.field360 = var1.method1189() != 0 ? var1.method1188(4) + 1 : 1;
		if (var1.method1189() != 0) {
			var1.method1188(8);
		}

		var1.method1188(2);
		if (this.field360 > 1) {
			this.field358 = var1.method1188(4);
		}

		this.field359 = new int[this.field360];
		this.field357 = new int[this.field360];

		for (int var2 = 0; var2 < this.field360; ++var2) {
			var1.method1188(8);
			this.field359[var2] = var1.method1188(8);
			this.field357[var2] = var1.method1188(8);
		}

	}
}
