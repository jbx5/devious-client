import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class94 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2451() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class33.field169; ++var0) {
				class173.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "877422910"
	)
	public static int method2452(int var0, int var1, int var2) {
		int var3 = class315.method6060(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15452"
	)
	static void method2450() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1389[var0] = null;
			Players.field1378[var0] = class233.field2470;
		}

	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIZS)V",
		garbageValue = "12148"
	)
	static void method2453(class202 var0, int var1, int var2, boolean var3) {
		if (var0 != null) {
			if (var0.field2109 == 0) {
				if (!var3) {
					return;
				}

				Client.soundLocations[Client.soundEffectCount] = 0;
			} else {
				int var4 = (var1 - 64) / 128;
				int var5 = (var2 - 64) / 128;
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2109 + (var4 << 16);
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2107;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2108;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.field554[Client.soundEffectCount] = var0.field2113;
			++Client.soundEffectCount;
		}
	}
}
