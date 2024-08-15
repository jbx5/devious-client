import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public enum class368 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field3985(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field3982(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field3983(2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field3989(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field3984(4);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1293639849
	)
	final int field3986;

	class368(int var3) {
		this.field3986 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3986;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILkt;II)V",
		garbageValue = "-2117735386"
	)
	static void method7145(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) {
			int var5 = var3.sizeX;
			int var6 = var3.sizeY;
			if (var4 == 1 || var4 == 3) {
				var5 = var3.sizeY;
				var6 = var3.sizeX;
			}

			int var7 = (var5 + var1) * 128;
			int var8 = (var6 + var2) * 128;
			var1 *= 128;
			var2 *= 128;
			int var9 = var3.ambientSoundId;
			int var10 = var3.int7 * 16384;
			int var11 = var3.int8 * 128;
			if (var3.transforms != null) {
				ObjectComposition var12 = var3.transform();
				if (var12 != null) {
					var9 = var12.ambientSoundId;
					var10 = var12.int7 * 16384;
					var11 = var12.int8 * 128;
				}
			}

			for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
				if (var0 == var13.plane && var13.x * 16384 == var1 && var2 == var13.y * 16384 && var7 == var13.maxX * 128 && var8 == var13.maxY * 16384 && var9 == var13.soundEffectId && var10 == var13.field836 && var11 == var13.field834) {
					if (var13.stream1 != null) {
						ScriptFrame.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) {
						ScriptFrame.pcmStreamMixer.removeSubStream(var13.stream2);
						var13.stream2 = null;
					}

					var13.remove();
					break;
				}
			}
		}

	}
}
