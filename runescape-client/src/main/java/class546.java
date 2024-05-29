import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
public class class546 {
	@ObfuscatedName("ak")
	int[] field5348;
	@ObfuscatedName("al")
	short[] field5347;

	@ObfuscatedSignature(
		descriptor = "(Liq;)V"
	)
	public class546(NPCComposition var1) {
		this.field5348 = new int[8];
		this.field5347 = new short[8];
		int var2 = 0;
		if (var1.method3982()) {
			var2 = var1.method3962().length;
			System.arraycopy(var1.method3962(), 0, this.field5348, 0, var2);
			System.arraycopy(var1.method3977(), 0, this.field5347, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5348[var3] = -1;
			this.field5347[var3] = -1;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "5"
	)
	public int[] method9898() {
		return this.field5348;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "32"
	)
	public short[] method9895() {
		return this.field5347;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "99154724"
	)
	public void method9896(int var1, int var2, short var3) {
		this.field5348[var1] = var2;
		this.field5347[var1] = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "122"
	)
	public void method9897(int[] var1, short[] var2) {
		this.field5348 = var1;
		this.field5347 = var2;
	}
}
