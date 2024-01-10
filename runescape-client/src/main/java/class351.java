import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class351 {
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1477583049
	)
	static int field3864;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "10"
	)
	static final int method6892(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILhg;IB)V",
		garbageValue = "12"
	)
	static void method6891(int var0, int var1, int var2, ObjectComposition var3, int var4) {
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
			if (var3.transforms != null) {
				ObjectComposition var11 = var3.transform();
				if (var11 != null) {
					var9 = var11.ambientSoundId;
					var10 = var11.int7 * 16384;
				}
			}

			for (ObjectSound var12 = (ObjectSound)ObjectSound.objectSounds.last(); var12 != null; var12 = (ObjectSound)ObjectSound.objectSounds.previous()) {
				if (var0 == var12.plane && var12.x * 16384 == var1 && var2 == var12.y * 128 && var7 == var12.maxX * 16384 && var8 == var12.maxY * 16384 && var9 == var12.soundEffectId && var10 == var12.field844) {
					if (var12.stream1 != null) {
						ClanSettings.pcmStreamMixer.removeSubStream(var12.stream1);
						var12.stream1 = null;
					}

					if (var12.stream2 != null) {
						ClanSettings.pcmStreamMixer.removeSubStream(var12.stream2);
						var12.stream2 = null;
					}

					var12.remove();
					break;
				}
			}
		}

	}
}
