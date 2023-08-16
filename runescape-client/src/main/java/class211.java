import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class211 extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1634603123
	)
	public int field2352;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1348328891
	)
	public int field2354;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 926592131
	)
	public int field2350;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public Widget field2355;

	@ObfuscatedSignature(
		descriptor = "(IIILmi;)V"
	)
	public class211(int var1, int var2, int var3, Widget var4) {
		this.field2350 = var1;
		this.field2352 = var2;
		this.field2354 = var3;
		this.field2355 = var4;
	}

	@ObfuscatedName("ae")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class388.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
