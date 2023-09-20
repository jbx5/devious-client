import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4572 = "SwapSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (class319.musicSongs.size() > 1 && class319.musicSongs.get(0) != null && ((MusicSong)class319.musicSongs.get(0)).midiPcmStream.isReady() && class319.musicSongs.get(1) != null && ((MusicSong)class319.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class319.musicSongs.get(0);
			class319.musicSongs.set(0, class319.musicSongs.get(1));
			class319.musicSongs.set(1, var1);
		}

		return true;
	}
}
