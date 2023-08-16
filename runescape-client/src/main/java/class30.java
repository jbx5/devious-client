import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class30 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 183350311
	)
	static int field167;
	@ObfuscatedName("he")
	static String field166;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-75"
	)
	static boolean method453(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-94"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field169.startsWith("win")) {
				BoundaryObject.method5025(var0, 0);
			} else if (class31.field169.startsWith("mac")) {
				class299.method5716(var0, 1, "openjs");
			} else {
				BoundaryObject.method5025(var0, 2);
			}
		} else {
			BoundaryObject.method5025(var0, 3);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Luk;",
		garbageValue = "694687164"
	)
	static IndexedSprite[] method454() {
		IndexedSprite[] var0 = new IndexedSprite[class529.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class529.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class529.SpriteBuffer_spriteWidth;
			var2.height = class420.SpriteBuffer_spriteHeight;
			var2.xOffset = class529.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class152.SpriteBuffer_yOffsets[var1];
			var2.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = SpriteMask.SpriteBuffer_spriteHeights[var1];
			var2.palette = DbTableType.SpriteBuffer_spritePalette;
			var2.pixels = Coord.SpriteBuffer_pixels[var1];
		}

		class529.SpriteBuffer_xOffsets = null;
		class152.SpriteBuffer_yOffsets = null;
		HealthBarUpdate.SpriteBuffer_spriteWidths = null;
		SpriteMask.SpriteBuffer_spriteHeights = null;
		DbTableType.SpriteBuffer_spritePalette = null;
		Coord.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1819650636"
	)
	public static NodeDeque method446() {
		return Client.scriptEvents;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "26"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
