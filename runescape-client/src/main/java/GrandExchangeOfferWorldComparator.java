import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)I",
		garbageValue = "-1426264105"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lor;III)Lvl;",
		garbageValue = "-2130545343"
	)
	static IndexedSprite method7401(AbstractArchive var0, int var1, int var2) {
		if (!class108.method2769(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = class351.SpriteBuffer_spriteHeight;
			var4.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var4.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
			var4.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var4.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0] * -1603996197;
			var4.palette = UrlRequest.SpriteBuffer_spritePalette;
			var4.pixels = PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[0];
			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			UrlRequest.SpriteBuffer_spritePalette = null;
			PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
