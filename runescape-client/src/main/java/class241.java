import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class241 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2558;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	static GraphicsDefaults field2562;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Led;"
	)
	class129[] field2563;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1553720975
	)
	int field2561;

	@ObfuscatedSignature(
		descriptor = "(Lul;I)V"
	)
	class241(Buffer var1, int var2) {
		this.field2563 = new class129[var2];
		this.field2561 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2563.length; ++var3) {
			class129 var4 = new class129(this.field2561, var1, false);
			this.field2563[var3] = var4;
		}

		this.method4602();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	void method4602() {
		class129[] var1 = this.field2563;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class129 var3 = var1[var2];
			if (var3.field1521 >= 0) {
				var3.field1506 = this.field2563[var3.field1521];
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2112190855"
	)
	public int method4604() {
		return this.field2563.length;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Led;",
		garbageValue = "1689947059"
	)
	class129 method4611(int var1) {
		return var1 >= this.method4604() ? null : this.field2563[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Led;",
		garbageValue = "-130902547"
	)
	class129[] method4606() {
		return this.field2563;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfk;II)V",
		garbageValue = "1460583301"
	)
	void method4612(class139 var1, int var2) {
		this.method4608(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfk;I[ZZI)V",
		garbageValue = "-2124527943"
	)
	void method4608(class139 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3107();
		int var6 = 0;
		class129[] var7 = this.method4606();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class129 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3089(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-127"
	)
	public static int method4622(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
