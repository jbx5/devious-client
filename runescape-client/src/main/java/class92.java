import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class92 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1111(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1109(1, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1108(2, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1110(3, 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1112(4, 5),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1113(5, 6);

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field1117;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 818469175
	)
	final int field1114;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 497701773
	)
	final int field1115;

	class92(int var3, int var4) {
		this.field1114 = var3;
		this.field1115 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1115;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-128"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class399.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "1422226008"
	)
	public static String method2360(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	public static boolean method2358() {
		return Client.staffModLevel >= 2;
	}
}
