import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class59 {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	static JagNetThread field452;
	@ObfuscatedName("ah")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("af")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("cz")
	static String field450;
	@ObfuscatedName("hp")
	static String field453;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	VorbisFloor field445;
	@ObfuscatedName("al")
	boolean field443;
	@ObfuscatedName("ak")
	int[] field455;
	@ObfuscatedName("ax")
	int[] field449;
	@ObfuscatedName("ao")
	boolean[] field446;

	@ObfuscatedSignature(
		descriptor = "(Lbc;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field445 = var1;
		this.field443 = var2;
		this.field455 = var3;
		this.field449 = var4;
		this.field446 = var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "2130530034"
	)
	void method1160(float[] var1, int var2) {
		int var3 = this.field445.field282.length;
		VorbisFloor var10000 = this.field445;
		int var4 = VorbisFloor.field286[this.field445.multiplier - 1];
		boolean[] var5 = this.field446;
		this.field446[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field445.method763(this.field455, var6);
			var8 = this.field445.method757(this.field455, var6);
			var9 = this.field445.method758(this.field455[var7], this.field449[var7], this.field455[var8], this.field449[var8], this.field455[var6]);
			var10 = this.field449[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field446;
				this.field446[var8] = true;
				var14[var7] = true;
				this.field446[var6] = true;
				if (var10 >= var13) {
					this.field449[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field449[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field446[var6] = false;
				this.field449[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field445.multiplier * this.field449[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field446[var8]) {
				var9 = this.field455[var8];
				var10 = this.field445.multiplier * this.field449[var8];
				this.field445.method774(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field445;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "467756903"
	)
	boolean method1161() {
		return this.field443;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2030001337"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field455[var1];
			int var5 = this.field449[var1];
			boolean var6 = this.field446[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field455[var7];
				if (var8 < var4) {
					this.field455[var3] = var8;
					this.field449[var3] = this.field449[var7];
					this.field446[var3] = this.field446[var7];
					++var3;
					this.field455[var7] = this.field455[var3];
					this.field449[var7] = this.field449[var3];
					this.field446[var7] = this.field446[var3];
				}
			}

			this.field455[var3] = var4;
			this.field449[var3] = var5;
			this.field446[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}
}
