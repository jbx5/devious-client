import java.awt.Image;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("bk")
	static Image field4579;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4597 = "SwapSongTask";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (class319.musicSongs.size() > 1 && class319.musicSongs.get(0) != null && ((MusicSong)class319.musicSongs.get(0)).midiPcmStream.isReady() && class319.musicSongs.get(1) != null && ((MusicSong)class319.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class319.musicSongs.get(0);
			class319.musicSongs.set(0, class319.musicSongs.get(1));
			class319.musicSongs.set(1, var1);
		}

		return true;
	}
}
