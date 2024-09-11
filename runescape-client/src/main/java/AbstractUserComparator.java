import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ae")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "2007183439"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lss;Lss;B)I",
		garbageValue = "-12"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpo;III)Lvv;",
		garbageValue = "-605515595"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!HttpJsonRequestBody.method9207(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var4.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[0];
			var4.yOffset = Login.SpriteBuffer_yOffsets[0];
			var4.subWidth = GrandExchangeEvents.SpriteBuffer_spriteWidths[0];
			var4.subHeight = ModelData0.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = MusicPatchPcmStream.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = SpriteBufferProperties.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class151.method3492();
			return var4;
		}
	}
}
