import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("al")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("aj")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-838227477"
	)
	public static void method7123(int var0, int var1) {
		class146.method3226(var0, var1, 0, 0);
		class329.field3579.clear();
		class329.field3581.clear();
		if (class329.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			LoginScreenAnimation.method2471();
		} else {
			class329.field3581.add(new DelayFadeTask((SongTask)null, class329.musicPlayerStatus));
			class329.field3581.add(new FadeOutTask((SongTask)null, 0, false, class329.field3584));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class329.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class329.field3581.add(new class438((SongTask)null, var3));
		}

	}
}
