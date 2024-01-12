import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
class class135 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class138 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfu;Luk;I)V"
	)
	class135(class138 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3158(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Low;III)Luc;",
		garbageValue = "945955054"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Varcs.method2829(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var4.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var4.yOffset = class388.SpriteBuffer_yOffsets[0];
			var4.subWidth = FriendsList.SpriteBuffer_spriteWidths[0];
			var4.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subHeight * var4.subWidth;
			byte[] var6 = class230.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = SecureUrlRequester.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class388.SpriteBuffer_yOffsets = null;
			FriendsList.SpriteBuffer_spriteWidths = null;
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null;
			SecureUrlRequester.SpriteBuffer_spritePalette = null;
			class230.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([FS)V",
		garbageValue = "-28166"
	)
	static void method3146(float[] var0) {
		if (var0[0] + class127.field1487 < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2));
			float var4 = 0.5F * (var3 + -var1);
			if (var0[1] + class127.field1487 > var4) {
				var0[1] = var4 - class127.field1487;
			} else {
				var4 = 0.5F * (-var1 - var3);
				if (var0[1] < class127.field1487 + var4) {
					var0[1] = class127.field1487 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class127.field1487;
			var0[1] = 0.33333334F - class127.field1487;
		}

	}

	@ObfuscatedName("aj")
	public static int method3149(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "39"
	)
	@Export("randomDatData2")
	public static byte[] randomDatData2() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
