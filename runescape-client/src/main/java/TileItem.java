import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -805118597
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 138922953
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -767231565
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 628045479
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -88066569
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("aq")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1685310517
	)
	@Export("flag")
	int flag;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1072468760"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1727822"
	)
	boolean method2980(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		return MouseRecorder.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvt;",
		garbageValue = "-1474620512"
	)
	public static IndexedSprite[] method2983() {
		IndexedSprite[] var0 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[var1];
			var2.yOffset = Login.SpriteBuffer_yOffsets[var1];
			var2.subWidth = GrandExchangeEvents.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = ModelData0.SpriteBuffer_spriteHeights[var1] * 1445511424;
			var2.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
			var2.pixels = MusicPatchPcmStream.SpriteBuffer_pixels[var1];
		}

		class151.method3492();
		return var0;
	}
}
