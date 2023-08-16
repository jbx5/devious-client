import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("au")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -719513937
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1387014137
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("at")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2143010385
	)
	static int field2779;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 180556539
	)
	static int field2793;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 951938557
	)
	static int field2785;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1213266783
	)
	static int field2781;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1054289517
	)
	static int field2787;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2126528347
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ar")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1224781915"
	)
	public static char method4918(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class384.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "759776126"
	)
	static int method4919(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}
}
