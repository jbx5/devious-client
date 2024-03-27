import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("af")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Lty;I)Ljava/util/HashMap;",
		garbageValue = "465282109"
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
					byte[] var14 = var7.takeFile(var10, var11);
					boolean var13;
					if (var14 == null) {
						var13 = false;
					} else {
						HttpQueryParams.SpriteBuffer_decode(var14);
						var13 = true;
					}

					Font var12;
					if (!var13) {
						var12 = null;
					} else {
						byte[] var15 = var8.takeFile(var10, var11);
						Font var18;
						if (var15 == null) {
							var18 = null;
						} else {
							Font var16 = new Font(var15, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
							SpriteBufferProperties.SpriteBuffer_xOffsets = null;
							SpriteBufferProperties.SpriteBuffer_yOffsets = null;
							SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
							Ignored.SpriteBuffer_spriteHeights = null;
							class126.SpriteBuffer_spritePalette = null;
							SpriteBufferProperties.SpriteBuffer_pixels = null;
							var18 = var16;
						}

						var12 = var18;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	static void method8920(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
