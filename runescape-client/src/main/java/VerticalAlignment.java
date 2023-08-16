import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	field2081(1, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	field2080(2, 2);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field2083;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -76034327
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1855187977
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "807517970"
	)
	public static void method3745(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3745(var0, var1, var2, var5 - 1);
			method3745(var0, var1, var5 + 1, var3);
		}

	}
}
