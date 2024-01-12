import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class270 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	class128[] field2811;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1917727371
	)
	int field2813;

	@ObfuscatedSignature(
		descriptor = "(Luk;I)V"
	)
	class270(Buffer var1, int var2) {
		this.field2811 = new class128[var2];
		this.field2813 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2811.length; ++var3) {
			class128 var4 = new class128(this.field2813, var1, false);
			this.field2811[var3] = var4;
		}

		this.method5322();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	void method5322() {
		class128[] var1 = this.field2811;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class128 var3 = var1[var2];
			if (var3.field1494 >= 0) {
				var3.field1495 = this.field2811[var3.field1494];
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2079753911"
	)
	public int method5323() {
		return this.field2811.length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "916391304"
	)
	class128 method5324(int var1) {
		return var1 >= this.method5323() ? null : this.field2811[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[Lez;",
		garbageValue = "2141543016"
	)
	class128[] method5325() {
		return this.field2811;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfu;II)V",
		garbageValue = "1311435343"
	)
	void method5326(class138 var1, int var2) {
		this.method5327(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I[ZZB)V",
		garbageValue = "3"
	)
	void method5327(class138 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3160();
		int var6 = 0;
		class128[] var7 = this.method5325();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class128 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3162(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("am")
	public static double method5321(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ltq;",
		garbageValue = "-2012214043"
	)
	public static class518 method5345(int var0) {
		int var1 = class516.field5098[var0];
		if (var1 == 1) {
			return class518.field5109;
		} else if (var1 == 2) {
			return class518.field5103;
		} else {
			return var1 == 3 ? class518.field5102 : null;
		}
	}
}
