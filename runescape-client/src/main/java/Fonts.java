import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ar")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("aj")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ltc;I)Ljava/util/HashMap;",
		garbageValue = "-411117179"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				Font var6;
				if (!var7.isValidFileName(var9, "")) {
					var6 = null;
				} else {
					int var10 = var7.getGroupId(var9);
					int var11 = var7.getFileId(var10, "");
					Font var12;
					if (!class108.method2769(var7, var10, var11)) {
						var12 = null;
					} else {
						byte[] var14 = var8.takeFile(var10, var11);
						Font var13;
						if (var14 == null) {
							var13 = null;
						} else {
							Font var15 = new Font(var14, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, SpriteBufferProperties.SpriteBuffer_spriteHeights, UrlRequest.SpriteBuffer_spritePalette, PlayerCompositionColorTextureOverride.SpriteBuffer_pixels);
							SpriteBufferProperties.SpriteBuffer_xOffsets = null;
							SpriteBufferProperties.SpriteBuffer_yOffsets = null;
							SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
							SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
							UrlRequest.SpriteBuffer_spritePalette = null;
							PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
							var13 = var15;
						}

						var12 = var13;
					}

					var6 = var12;
				}

				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}
}
