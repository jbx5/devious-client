import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("at")
	static ThreadPoolExecutor field5251;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("ag")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ltw;B)Ljava/util/HashMap;",
		garbageValue = "1"
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
					if (!HttpJsonRequestBody.method9207(var7, var10, var11)) {
						var12 = null;
					} else {
						byte[] var14 = var8.takeFile(var10, var11);
						Font var13;
						if (var14 == null) {
							var13 = null;
						} else {
							Font var15 = new Font(var14, HttpAuthenticationHeader.SpriteBuffer_xOffsets, Login.SpriteBuffer_yOffsets, GrandExchangeEvents.SpriteBuffer_spriteWidths, ModelData0.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, MusicPatchPcmStream.SpriteBuffer_pixels);
							class151.method3492();
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
