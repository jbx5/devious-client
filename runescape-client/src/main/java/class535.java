import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public class class535 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("az")
	int[] field5238;
	@ObfuscatedName("ah")
	short[] field5237;

	@ObfuscatedSignature(
		descriptor = "(Lhk;)V"
	)
	public class535(NPCComposition var1) {
		this.field5238 = new int[8];
		this.field5237 = new short[8];
		int var2 = 0;
		if (var1.method3871()) {
			var2 = var1.method3872().length;
			System.arraycopy(var1.method3872(), 0, this.field5238, 0, var2);
			System.arraycopy(var1.method3874(), 0, this.field5237, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5238[var3] = -1;
			this.field5237[var3] = -1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "14"
	)
	public int[] method9525() {
		return this.field5238;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "93"
	)
	public short[] method9518() {
		return this.field5237;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-2140403324"
	)
	public void method9519(int var1, int var2, short var3) {
		this.field5238[var1] = var2;
		this.field5237[var1] = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1865272156"
	)
	public void method9520(int[] var1, short[] var2) {
		this.field5238 = var1;
		this.field5237 = var2;
	}
}
