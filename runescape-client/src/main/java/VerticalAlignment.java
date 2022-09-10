import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1979(1, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1976(2, 2);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 353180477
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2087774313
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "-90"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 77

		for (int var6 = 0; var6 < var5; ++var6) { // L: 78
			char var7 = var0.charAt(var6 + var1); // L: 79
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 80
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 81
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 82
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 83
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 84
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 85
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 86
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 87
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 88
			} else if (var7 == 8240) { // L: 89
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 90
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 91
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 92
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 93
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 94
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 95
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 96
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 97
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 98
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106; // L: 99
			} else if (var7 == 8212) { // L: 100
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 101
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 102
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 103
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 104
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 105
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 106
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 107
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 108
			}
		}

		return var5; // L: 110
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-78"
	)
	public static int[] method3664() {
		int[] var0 = new int[KeyHandler.field141]; // L: 247

		for (int var1 = 0; var1 < KeyHandler.field141; ++var1) { // L: 248
			var0[var1] = KeyHandler.field140[var1]; // L: 249
		}

		return var0; // L: 251
	}
}
