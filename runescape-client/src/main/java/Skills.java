import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ap")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("af")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("ag")
	static boolean[] field3912;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1485031115
	)
	static int field3911;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "1951977903"
	)
	static void method6928(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				Actor.method2488(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class319.field3466.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class319.field3466.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class93.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(WorldMapSection0.archive6, (Integer)var0.get(var8), 0, class93.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class319.field3466.clear();
						class319.field3466.addAll(var9);
						WorldMapRectangle.method5019(var1, var2, var3, var4);
					} else {
						LoginScreenAnimation.method2528(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
