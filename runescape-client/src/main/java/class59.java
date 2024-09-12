import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("an")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 403949235
	)
	static int field418;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	VorbisFloor field413;
	@ObfuscatedName("ae")
	boolean field416;
	@ObfuscatedName("ag")
	int[] field415;
	@ObfuscatedName("am")
	int[] field417;
	@ObfuscatedName("ax")
	boolean[] field421;

	@ObfuscatedSignature(
		descriptor = "(Lbl;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field413 = var1;
		this.field416 = var2;
		this.field415 = var3;
		this.field417 = var4;
		this.field421 = var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-1689790489"
	)
	void method1177(float[] var1, int var2) {
		int var3 = this.field413.field257.length;
		VorbisFloor var10000 = this.field413;
		int var4 = VorbisFloor.field253[this.field413.multiplier - 1];
		boolean[] var5 = this.field421;
		this.field421[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field413.method773(this.field415, var6);
			var8 = this.field413.method774(this.field415, var6);
			var9 = this.field413.method781(this.field415[var7], this.field417[var7], this.field415[var8], this.field417[var8], this.field415[var6]);
			var10 = this.field417[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field421;
				this.field421[var8] = true;
				var14[var7] = true;
				this.field421[var6] = true;
				if (var10 >= var13) {
					this.field417[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field417[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field421[var6] = false;
				this.field417[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field413.multiplier * this.field417[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field421[var8]) {
				var9 = this.field415[var8];
				var10 = this.field413.multiplier * this.field417[var8];
				this.field413.method776(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field413;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1679475031"
	)
	boolean method1178() {
		return this.field416;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1910531481"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field415[var1];
			int var5 = this.field417[var1];
			boolean var6 = this.field421[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field415[var7];
				if (var8 < var4) {
					this.field415[var3] = var8;
					this.field417[var3] = this.field417[var7];
					this.field421[var3] = this.field421[var7];
					++var3;
					this.field415[var7] = this.field415[var3];
					this.field417[var7] = this.field417[var3];
					this.field421[var7] = this.field421[var3];
				}
			}

			this.field415[var3] = var4;
			this.field417[var3] = var5;
			this.field421[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "64"
	)
	static boolean method1181(int var0) {
		return (var0 & 128) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "189784037"
	)
	static void method1188(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
