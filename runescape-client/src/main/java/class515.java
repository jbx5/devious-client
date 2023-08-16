import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public class class515 {
	@ObfuscatedName("au")
	int[] field5113;
	@ObfuscatedName("ae")
	short[] field5114;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class515(NPCComposition var1) {
		this.field5113 = new int[8];
		this.field5114 = new short[8];
		int var2 = 0;
		if (var1.method3697()) {
			var2 = var1.method3698().length;
			System.arraycopy(var1.method3698(), 0, this.field5113, 0, var2);
			System.arraycopy(var1.method3700(), 0, this.field5114, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5113[var3] = -1;
			this.field5114[var3] = -1;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-122"
	)
	public int[] method9299() {
		return this.field5113;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "80"
	)
	public short[] method9300() {
		return this.field5114;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1005641077"
	)
	public void method9301(int var1, int var2, short var3) {
		this.field5113[var1] = var2;
		this.field5114[var1] = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "1"
	)
	public void method9302(int[] var1, short[] var2) {
		this.field5113 = var1;
		this.field5114 = var2;
	}
}
