import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class60 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;
	@ObfuscatedName("ak")
	byte[] field436;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 68677859
	)
	int field435;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1695656625
	)
	int field438;

	class60() {
		this.field436 = null;
		this.field435 = 0;
		this.field438 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "208697388"
	)
	int method1158(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field438; var1 -= var4) {
			var4 = 8 - this.field438;
			int var5 = (1 << var4) - 1;
			var2 += (this.field436[this.field435] >> this.field438 & var5) << var3;
			this.field438 = 0;
			++this.field435;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field436[this.field435] >> this.field438 & var4) << var3;
			this.field438 += var1;
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-873724104"
	)
	int method1153() {
		int var1 = this.field436[this.field435] >> this.field438 & 1;
		++this.field438;
		this.field435 += this.field438 >> 3;
		this.field438 &= 7;
		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1030739921"
	)
	void method1151(byte[] var1, int var2) {
		this.field436 = var1;
		this.field435 = var2;
		this.field438 = 0;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-79"
	)
	static void method1150(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = var4 * 3 + 600;
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4];
			int var9 = var1 - 334;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 100) {
				var9 = 100;
			}

			int var10 = (Client.zoomWidth - Client.zoomHeight) * var9 / 100 + Client.zoomHeight;
			int var8 = var10 * var5 / 256;
			var2[var3] = var7 * var8 >> 16;
		}

		class358.topLevelWorldView.scene.method4901(var2, 500, 800, var0 * 334 / var1, 334);
	}
}
