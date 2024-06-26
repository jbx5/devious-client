import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4814 = "SwapSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (class330.musicSongs.size() > 1 && class330.musicSongs.get(0) != null && ((MusicSong)class330.musicSongs.get(0)).midiPcmStream.isReady() && class330.musicSongs.get(1) != null && ((MusicSong)class330.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class330.musicSongs.get(0);
			class330.musicSongs.set(0, class330.musicSongs.get(1));
			class330.musicSongs.set(1, var1);
		}

		return true;
	}
}
