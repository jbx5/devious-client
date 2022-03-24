import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class356 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"33344244")

	public static boolean method6621() {
		try {
			if (class273.musicPlayerStatus == 2) {
				if (class273.musicTrack == null) {
					class273.musicTrack = MusicTrack.readTrack(class147.musicTrackArchive, ArchiveLoader.musicTrackGroupId, class273.musicTrackFileId);
					if (class273.musicTrack == null) {
						return false;
					}
				}

				if (class273.soundCache == null) {
					class273.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
				}

				if (WorldMapEvent.midiPcmStream.loadMusicTrack(class273.musicTrack, class273.musicPatchesArchive, class273.soundCache, 22050)) {
					WorldMapEvent.midiPcmStream.clearAll();
					WorldMapEvent.midiPcmStream.setPcmStreamVolume(DevicePcmPlayerProvider.musicTrackVolume);
					WorldMapEvent.midiPcmStream.setMusicTrack(class273.musicTrack, class260.musicTrackBoolean);
					class273.musicPlayerStatus = 0;
					class273.musicTrack = null;
					class273.soundCache = null;
					class147.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			WorldMapEvent.midiPcmStream.clear();
			class273.musicPlayerStatus = 0;
			class273.musicTrack = null;
			class273.soundCache = null;
			class147.musicTrackArchive = null;
		}

		return false;
	}
}