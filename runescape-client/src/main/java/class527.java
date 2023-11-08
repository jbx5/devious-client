import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class527 {
	@ObfuscatedName("at")
	int[] field5142;
	@ObfuscatedName("ah")
	short[] field5143;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class527(NPCComposition var1) {
		this.field5142 = new int[8];
		this.field5143 = new short[8];
		int var2 = 0;
		if (var1.method3702()) {
			var2 = var1.method3733().length;
			System.arraycopy(var1.method3733(), 0, this.field5142, 0, var2);
			System.arraycopy(var1.method3694(), 0, this.field5143, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5142[var3] = -1;
			this.field5143[var3] = -1;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1522434870"
	)
	public int[] method9531() {
		return this.field5142;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2015204847"
	)
	public short[] method9532() {
		return this.field5143;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-561705498"
	)
	public void method9533(int var1, int var2, short var3) {
		this.field5142[var1] = var2;
		this.field5143[var1] = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1404172969"
	)
	public void method9534(int[] var1, short[] var2) {
		this.field5142 = var1;
		this.field5143 = var2;
	}
}
