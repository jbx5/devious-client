import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4651 = "SwapSongTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (class321.musicSongs.size() > 1 && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady() && class321.musicSongs.get(1) != null && ((MusicSong)class321.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class321.musicSongs.get(0);
			class321.musicSongs.set(0, class321.musicSongs.get(1));
			class321.musicSongs.set(1, var1);
		}

		return true;
	}
}
