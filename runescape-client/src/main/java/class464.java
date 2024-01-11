import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class464 {
	@ObfuscatedName("am")
	float field4794;
	@ObfuscatedName("ap")
	float field4795;
	@ObfuscatedName("af")
	float field4796;

	static {
		new class464(0.0F, 0.0F, 0.0F);
		new class464(1.0F, 1.0F, 1.0F);
		new class464(1.0F, 0.0F, 0.0F);
		new class464(0.0F, 1.0F, 0.0F);
		new class464(0.0F, 0.0F, 1.0F);
		class127.method3028(100);
	}

	class464(float var1, float var2, float var3) {
		this.field4794 = var1;
		this.field4795 = var2;
		this.field4796 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "159357859"
	)
	final float method8504() {
		return (float)Math.sqrt((double)(this.field4796 * this.field4796 + this.field4794 * this.field4794 + this.field4795 * this.field4795));
	}

	public String toString() {
		return this.field4794 + ", " + this.field4795 + ", " + this.field4796;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "-1228913336"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5124.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9283(new Buffer(var2));
			}

			var1.method9286();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lut;",
		garbageValue = "1037732544"
	)
	static IndexedSprite method8511() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = class388.SpriteBuffer_yOffsets[0];
		var0.subWidth = FriendsList.SpriteBuffer_spriteWidths[0];
		var0.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[0];
		var0.palette = SecureUrlRequester.SpriteBuffer_spritePalette;
		var0.pixels = class230.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		class388.SpriteBuffer_yOffsets = null;
		FriendsList.SpriteBuffer_spriteWidths = null;
		GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null;
		SecureUrlRequester.SpriteBuffer_spritePalette = null;
		class230.SpriteBuffer_pixels = null;
		return var0;
	}
}
