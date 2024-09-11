import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class204 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-980279982"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class461.clientPreferences.getMusicVolume()) {
			if (class461.clientPreferences.getMusicVolume() == 0 && FileSystem.method4494()) {
				class132.method3248(HorizontalAlignment.archive6, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				AbstractWorldMapIcon.method6257(0, 0);
				Client.playingJingle = false;
			} else if (!class334.musicSongs.isEmpty()) {
				Iterator var1 = class334.musicSongs.iterator();

				while (var1.hasNext()) {
					MusicSong var2 = (MusicSong)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MusicSong var3 = (MusicSong)class334.musicSongs.get(0);
				if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3734) {
					var3.midiPcmStream.setPcmStreamVolume(var0);
					var3.field3730 = (float)var0;
				}
			}

			class461.clientPreferences.updateMusicVolume(var0);
		}

	}
}
