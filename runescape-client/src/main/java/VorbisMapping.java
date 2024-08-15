import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("by")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ab")
	int field333;
	@ObfuscatedName("ay")
	int field332;
	@ObfuscatedName("an")
	int[] field334;
	@ObfuscatedName("au")
	int[] field335;

	VorbisMapping() {
		class60 var1 = VorbisSample.field352;
		var1.method1146(16);
		this.field333 = var1.method1138() != 0 ? var1.method1146(4) + 1 : 1;
		if (var1.method1138() != 0) {
			var1.method1146(8);
		}

		var1.method1146(2);
		if (this.field333 > 1) {
			this.field332 = var1.method1146(4);
		}

		this.field334 = new int[this.field333];
		this.field335 = new int[this.field333];

		for (int var2 = 0; var2 < this.field333; ++var2) {
			var1.method1146(8);
			this.field334[var2] = var1.method1146(8);
			this.field335[var2] = var1.method1146(8);
		}

	}
}
