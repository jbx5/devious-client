import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bc")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("au")
	int field375;
	@ObfuscatedName("ae")
	int field374;
	@ObfuscatedName("ao")
	int[] field376;
	@ObfuscatedName("at")
	int[] field377;

	VorbisMapping() {
		class60 var1 = VorbisSample.field393;
		var1.method1161(16);
		this.field375 = var1.method1162() != 0 ? var1.method1161(4) + 1 : 1;
		if (var1.method1162() != 0) {
			var1.method1161(8);
		}

		var1.method1161(2);
		if (this.field375 > 1) {
			this.field374 = var1.method1161(4);
		}

		this.field376 = new int[this.field375];
		this.field377 = new int[this.field375];

		for (int var2 = 0; var2 < this.field375; ++var2) {
			var1.method1161(8);
			this.field376[var2] = var1.method1161(8);
			this.field377[var2] = var1.method1161(8);
		}

	}
}
