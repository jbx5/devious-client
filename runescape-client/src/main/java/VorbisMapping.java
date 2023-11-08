import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("br")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("at")
	int field340;
	@ObfuscatedName("ah")
	int field341;
	@ObfuscatedName("ar")
	int[] field343;
	@ObfuscatedName("ao")
	int[] field342;

	VorbisMapping() {
		class60 var1 = VorbisSample.field359;
		var1.method1187(16);
		this.field340 = var1.method1188() != 0 ? var1.method1187(4) + 1 : 1;
		if (var1.method1188() != 0) {
			var1.method1187(8);
		}

		var1.method1187(2);
		if (this.field340 > 1) {
			this.field341 = var1.method1187(4);
		}

		this.field343 = new int[this.field340];
		this.field342 = new int[this.field340];

		for (int var2 = 0; var2 < this.field340; ++var2) {
			var1.method1187(8);
			this.field343[var2] = var1.method1187(8);
			this.field342[var2] = var1.method1187(8);
		}

	}
}
