import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bb")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ak")
	int field361;
	@ObfuscatedName("al")
	int field359;
	@ObfuscatedName("aj")
	int[] field360;
	@ObfuscatedName("az")
	int[] field358;

	VorbisMapping() {
		class60 var1 = VorbisSample.field394;
		var1.method1158(16);
		this.field361 = var1.method1153() != 0 ? var1.method1158(4) + 1 : 1;
		if (var1.method1153() != 0) {
			var1.method1158(8);
		}

		var1.method1158(2);
		if (this.field361 > 1) {
			this.field359 = var1.method1158(4);
		}

		this.field360 = new int[this.field361];
		this.field358 = new int[this.field361];

		for (int var2 = 0; var2 < this.field361; ++var2) {
			var1.method1158(8);
			this.field360[var2] = var1.method1158(8);
			this.field358[var2] = var1.method1158(8);
		}

	}
}
