import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class59 {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	static class539 field406;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	VorbisFloor field403;
	@ObfuscatedName("aw")
	boolean field401;
	@ObfuscatedName("ak")
	int[] field404;
	@ObfuscatedName("aj")
	int[] field402;
	@ObfuscatedName("ai")
	boolean[] field400;

	@ObfuscatedSignature(
		descriptor = "(Lbs;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field403 = var1;
		this.field401 = var2;
		this.field404 = var3;
		this.field402 = var4;
		this.field400 = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-636837515"
	)
	void method1191(float[] var1, int var2) {
		int var3 = this.field403.field247.length;
		VorbisFloor var10000 = this.field403;
		int var4 = VorbisFloor.field251[this.field403.multiplier - 1];
		boolean[] var5 = this.field400;
		this.field400[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field403.method764(this.field404, var6);
			var8 = this.field403.method761(this.field404, var6);
			var9 = this.field403.method769(this.field404[var7], this.field402[var7], this.field404[var8], this.field402[var8], this.field404[var6]);
			var10 = this.field402[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field400;
				this.field400[var8] = true;
				var14[var7] = true;
				this.field400[var6] = true;
				if (var10 >= var13) {
					this.field402[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field402[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field400[var6] = false;
				this.field402[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field403.multiplier * this.field402[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field400[var8]) {
				var9 = this.field404[var8];
				var10 = this.field403.multiplier * this.field402[var8];
				this.field403.method763(var6, var7, var9, var10, var1, var2);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-347110081"
	)
	boolean method1190() {
		return this.field401;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-785867388"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field404[var1];
			int var5 = this.field402[var1];
			boolean var6 = this.field400[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field404[var7];
				if (var8 < var4) {
					this.field404[var3] = var8;
					this.field402[var3] = this.field402[var7];
					this.field400[var3] = this.field400[var7];
					++var3;
					this.field404[var7] = this.field404[var3];
					this.field402[var7] = this.field402[var3];
					this.field400[var7] = this.field400[var3];
				}
			}

			this.field404[var3] = var4;
			this.field402[var3] = var5;
			this.field400[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}
}
