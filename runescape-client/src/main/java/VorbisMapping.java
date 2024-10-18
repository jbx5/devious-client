import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bl")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ap")
	int field330;
	@ObfuscatedName("aw")
	int field329;
	@ObfuscatedName("ak")
	int[] field331;
	@ObfuscatedName("aj")
	int[] field332;

	VorbisMapping() {
		class60 var1 = VorbisSample.field349;
		var1.method1206(16);
		this.field330 = var1.method1196() != 0 ? var1.method1206(4) + 1 : 1;
		if (var1.method1196() != 0) {
			var1.method1206(8);
		}

		var1.method1206(2);
		if (this.field330 > 1) {
			this.field329 = var1.method1206(4);
		}

		this.field331 = new int[this.field330];
		this.field332 = new int[this.field330];

		for (int var2 = 0; var2 < this.field330; ++var2) {
			var1.method1206(8);
			this.field331[var2] = var1.method1206(8);
			this.field332[var2] = var1.method1206(8);
		}

	}
}
