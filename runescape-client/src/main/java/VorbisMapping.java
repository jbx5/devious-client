import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bv")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("az")
	int field349;
	@ObfuscatedName("ah")
	int field347;
	@ObfuscatedName("af")
	int[] field348;
	@ObfuscatedName("at")
	int[] field346;

	VorbisMapping() {
		class60 var1 = VorbisSample.field365;
		var1.method1123(16);
		this.field349 = var1.method1124() != 0 ? var1.method1123(4) + 1 : 1;
		if (var1.method1124() != 0) {
			var1.method1123(8);
		}

		var1.method1123(2);
		if (this.field349 > 1) {
			this.field347 = var1.method1123(4);
		}

		this.field348 = new int[this.field349];
		this.field346 = new int[this.field349];

		for (int var2 = 0; var2 < this.field349; ++var2) {
			var1.method1123(8);
			this.field348[var2] = var1.method1123(8);
			this.field346[var2] = var1.method1123(8);
		}

	}
}
