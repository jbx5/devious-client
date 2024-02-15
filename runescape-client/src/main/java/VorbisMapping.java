import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bl")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aq")
	int field353;
	@ObfuscatedName("aw")
	int field352;
	@ObfuscatedName("al")
	int[] field354;
	@ObfuscatedName("ai")
	int[] field355;

	VorbisMapping() {
		class60 var1 = VorbisSample.field392;
		var1.method1138(16);
		this.field353 = var1.method1139() != 0 ? var1.method1138(4) + 1 : 1;
		if (var1.method1139() != 0) {
			var1.method1138(8);
		}

		var1.method1138(2);
		if (this.field353 > 1) {
			this.field352 = var1.method1138(4);
		}

		this.field354 = new int[this.field353];
		this.field355 = new int[this.field353];

		for (int var2 = 0; var2 < this.field353; ++var2) {
			var1.method1138(8);
			this.field354[var2] = var1.method1138(8);
			this.field355[var2] = var1.method1138(8);
		}

	}
}
