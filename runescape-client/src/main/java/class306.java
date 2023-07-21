import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class306 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3393;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3397;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field3401;
	@ObfuscatedName("am")
	public static ArrayList field3395;
	@ObfuscatedName("as")
	public static LinkedList field3396;
	@ObfuscatedName("aj")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("ag")
	public static ArrayList field3398;
	@ObfuscatedName("az")
	static ArrayList field3399;
	@ObfuscatedName("av")
	public static final List field3400;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1487938257
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1264119931
	)
	public static int field3402;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1809534201
	)
	public static int field3403;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1503586905
	)
	public static int field3407;

	static {
		field3395 = null;
		field3396 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3398 = new ArrayList(3);
		field3399 = new ArrayList();
		field3400 = new ArrayList();
		musicPlayerStatus = 0;
		field3402 = 0;
		field3403 = 0;
		field3407 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	static void method5812() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1789463906"
	)
	public static int method5811(CharSequence var0) {
		return ClanChannel.method3380(var0, 10, true);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "739300687"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}
}
