import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class422 {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-33"
	)
	static Object method7815(int var0) {
		return SoundCache.method833((class535)class134.findEnumerated(class535.method9458(), var0));
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "480859890"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			class92.method2440(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class332.field3565.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class332.field3565.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && TileItem.clientPreferences.getMusicVolume() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(class33.archive6, var0, 0, TileItem.clientPreferences.getMusicVolume(), false));
				if (Client.playingJingle) {
					class223.method4719(var3, 0, 100, 100, 0);
				} else {
					class53.method1051(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}
}
