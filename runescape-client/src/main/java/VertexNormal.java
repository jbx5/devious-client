import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1632182417
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1512330425
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1705979805
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2066830911
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;B)V",
		garbageValue = "-54"
	)
	public static void method5701(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIB)[Luz;",
		garbageValue = "-73"
	)
	public static SpritePixels[] method5702(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class162.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class541.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class541.SpriteBuffer_spriteCount; ++var6) {
				SpritePixels var7 = var5[var6] = new SpritePixels();
				var7.width = class541.SpriteBuffer_spriteWidth;
				var7.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight;
				var7.xOffset = class541.SpriteBuffer_xOffsets[var6];
				var7.yOffset = class541.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class541.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class520.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subHeight * var7.subWidth;
				byte[] var9 = class396.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = class541.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class541.SpriteBuffer_xOffsets = null;
			class541.SpriteBuffer_yOffsets = null;
			class541.SpriteBuffer_spriteWidths = null;
			class520.SpriteBuffer_spriteHeights = null;
			class541.SpriteBuffer_spritePalette = null;
			class396.SpriteBuffer_pixels = null;
			return var5;
		}
	}
}
