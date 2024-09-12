import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class332 {
	@ObfuscatedName("ac")
	static int[] field3601;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	static StudioGame field3603;

	static {
		new Object();
		field3601 = new int[33];
		field3601[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3601[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "1674298401"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = SoundSystem.World_worlds[var6];
			SoundSystem.World_worlds[var6] = SoundSystem.World_worlds[var1];
			SoundSystem.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class216.method4415(SoundSystem.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = SoundSystem.World_worlds[var9];
					SoundSystem.World_worlds[var9] = SoundSystem.World_worlds[var7];
					SoundSystem.World_worlds[var7++] = var10;
				}
			}

			SoundSystem.World_worlds[var1] = SoundSystem.World_worlds[var7];
			SoundSystem.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
