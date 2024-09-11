import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("be")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ac")
	int field338;
	@ObfuscatedName("ae")
	int field339;
	@ObfuscatedName("ag")
	int[] field340;
	@ObfuscatedName("am")
	int[] field341;

	VorbisMapping() {
		class60 var1 = VorbisSample.field364;
		var1.method1190(16);
		this.field338 = var1.method1191() != 0 ? var1.method1190(4) + 1 : 1;
		if (var1.method1191() != 0) {
			var1.method1190(8);
		}

		var1.method1190(2);
		if (this.field338 > 1) {
			this.field339 = var1.method1190(4);
		}

		this.field340 = new int[this.field338];
		this.field341 = new int[this.field338];

		for (int var2 = 0; var2 < this.field338; ++var2) {
			var1.method1190(8);
			this.field340[var2] = var1.method1190(8);
			this.field341[var2] = var1.method1190(8);
		}

	}
}
