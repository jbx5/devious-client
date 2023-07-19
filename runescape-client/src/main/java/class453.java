import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class453 {
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -38953883
	)
	static int field4760;
	@ObfuscatedName("aw")
	float[] field4757;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1269321367
	)
	int field4758;

	class453(float[] var1, int var2) {
		this.field4757 = var1;
		this.field4758 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnd;III)[Lud;",
		garbageValue = "-2024085770"
	)
	public static SpritePixels[] method8339(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			VarbitComposition.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class528.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class528.SpriteBuffer_spriteCount; ++var6) {
				SpritePixels var7 = var5[var6] = new SpritePixels();
				var7.width = class528.SpriteBuffer_spriteWidth;
				var7.height = class528.SpriteBuffer_spriteHeight;
				var7.xOffset = class492.SpriteBuffer_xOffsets[var6];
				var7.yOffset = class134.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class172.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class528.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subWidth * var7.subHeight;
				byte[] var9 = ArchiveDiskAction.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = class528.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			DbTableType.method8985();
			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-2100779061"
	)
	static boolean method8341(Date var0) {
		Date var1 = WorldMapElement.method3625();
		return var0.after(var1);
	}
}
