import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class60 {
	@ObfuscatedName("au")
	byte[] field459;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 352482533
	)
	int field458;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1727037637
	)
	int field463;

	class60() {
		this.field459 = null;
		this.field458 = 0;
		this.field463 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-62"
	)
	int method1161(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field463; var1 -= var4) {
			var4 = 8 - this.field463;
			int var5 = (1 << var4) - 1;
			var2 += (this.field459[this.field458] >> this.field463 & var5) << var3;
			this.field463 = 0;
			++this.field458;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field459[this.field458] >> this.field463 & var4) << var3;
			this.field463 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-36"
	)
	int method1162() {
		int var1 = this.field459[this.field458] >> this.field463 & 1;
		++this.field463;
		this.field458 += this.field463 >> 3;
		this.field463 &= 7;
		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "1812215657"
	)
	void method1163(byte[] var1, int var2) {
		this.field459 = var1;
		this.field458 = var2;
		this.field463 = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1921565351"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class102.method2663(var0, 10, var1) : Integer.toString(var0);
	}
}
