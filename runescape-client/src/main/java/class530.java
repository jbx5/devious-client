import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public class class530 {
	@ObfuscatedName("ac")
	int[] field5144;
	@ObfuscatedName("al")
	short[] field5143;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class530(NPCComposition var1) {
		this.field5144 = new int[8];
		this.field5143 = new short[8];
		int var2 = 0;
		if (var1.method3790()) {
			var2 = var1.method3791().length;
			System.arraycopy(var1.method3791(), 0, this.field5144, 0, var2);
			System.arraycopy(var1.method3802(), 0, this.field5143, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5144[var3] = -1;
			this.field5143[var3] = -1;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1994168844"
	)
	public int[] method9454() {
		return this.field5144;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2141879918"
	)
	public short[] method9455() {
		return this.field5143;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "44"
	)
	public void method9456(int var1, int var2, short var3) {
		this.field5144[var1] = var2;
		this.field5143[var1] = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-616052812"
	)
	public void method9457(int[] var1, short[] var2) {
		this.field5144 = var1;
		this.field5143 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-47"
	)
	static final int method9468(int var0, int var1) {
		int var2 = class432.method7853(45365 + var0, 91923 + var1, 4) - 128 + (class432.method7853(10294 + var0, 37821 + var1, 2) - 128 >> 1) + (class432.method7853(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
