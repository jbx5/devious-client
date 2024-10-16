import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("gk")
	static String field4135;
	@ObfuscatedName("jw")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -110286917
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-111"
	)
	static final int method7524(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "7992000"
	)
	static void method7530(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class344.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method3056();
					break;
				}
			}

			class397.updateItemPile(var0, var1, var2);
		}

	}
}
