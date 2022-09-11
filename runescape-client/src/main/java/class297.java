import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public enum class297 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3557(0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3554(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3555(2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3556(3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3558(4);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 570966065
	)
	final int field3553;

	class297(int var3) {
		this.field3553 = var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3553;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "-115"
	)
	public static String method5904(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}
}
