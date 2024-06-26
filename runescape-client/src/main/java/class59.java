import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class59 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	VorbisFloor field403;
	@ObfuscatedName("ad")
	boolean field408;
	@ObfuscatedName("ag")
	int[] field404;
	@ObfuscatedName("ak")
	int[] field402;
	@ObfuscatedName("ap")
	boolean[] field405;

	@ObfuscatedSignature(
		descriptor = "(Lbc;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field403 = var1;
		this.field408 = var2;
		this.field404 = var3;
		this.field402 = var4;
		this.field405 = var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "1967927782"
	)
	void method1158(float[] var1, int var2) {
		int var3 = this.field403.field254.length;
		VorbisFloor var10000 = this.field403;
		int var4 = VorbisFloor.field256[this.field403.multiplier - 1];
		boolean[] var5 = this.field405;
		this.field405[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field403.method793(this.field404, var6);
			var8 = this.field403.method775(this.field404, var6);
			var9 = this.field403.method777(this.field404[var7], this.field402[var7], this.field404[var8], this.field402[var8], this.field404[var6]);
			var10 = this.field402[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field405;
				this.field405[var8] = true;
				var14[var7] = true;
				this.field405[var6] = true;
				if (var10 >= var13) {
					this.field402[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field402[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field405[var6] = false;
				this.field402[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field403.multiplier * this.field402[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field405[var8]) {
				var9 = this.field404[var8];
				var10 = this.field403.multiplier * this.field402[var8];
				this.field403.method778(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field403;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "6578"
	)
	boolean method1161() {
		return this.field408;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-20"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field404[var1];
			int var5 = this.field402[var1];
			boolean var6 = this.field405[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field404[var7];
				if (var8 < var4) {
					this.field404[var3] = var8;
					this.field402[var3] = this.field402[var7];
					this.field405[var3] = this.field405[var7];
					++var3;
					this.field404[var7] = this.field404[var3];
					this.field402[var7] = this.field402[var3];
					this.field405[var7] = this.field405[var3];
				}
			}

			this.field404[var3] = var4;
			this.field402[var3] = var5;
			this.field405[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "101"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = FloorUnderlayDefinition.fontPlain12.lineWidth(var0, 250);
			int var6 = FloorUnderlayDefinition.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 16777215);
			FloorUnderlayDefinition.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class137.invalidateWidgetsUnder(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2);
			if (var1) {
				class434.rasterProvider.drawFull(0, 0);
			} else {
				WorldView.method2684(var3, var4, var5, var6);
			}

		}
	}
}
