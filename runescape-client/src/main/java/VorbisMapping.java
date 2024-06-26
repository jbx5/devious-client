import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("br")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aq")
	int field337;
	@ObfuscatedName("ad")
	int field335;
	@ObfuscatedName("ag")
	int[] field336;
	@ObfuscatedName("ak")
	int[] field334;

	VorbisMapping() {
		class60 var1 = VorbisSample.field353;
		var1.method1178(16);
		this.field337 = var1.method1166() != 0 ? var1.method1178(4) + 1 : 1;
		if (var1.method1166() != 0) {
			var1.method1178(8);
		}

		var1.method1178(2);
		if (this.field337 > 1) {
			this.field335 = var1.method1178(4);
		}

		this.field336 = new int[this.field337];
		this.field334 = new int[this.field337];

		for (int var2 = 0; var2 < this.field337; ++var2) {
			var1.method1178(8);
			this.field336[var2] = var1.method1178(8);
			this.field334[var2] = var1.method1178(8);
		}

	}
}
