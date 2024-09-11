import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lri;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4843 = "SwapSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		if (class334.musicSongs.size() > 1 && class334.musicSongs.get(0) != null && ((MusicSong)class334.musicSongs.get(0)).midiPcmStream.isReady() && class334.musicSongs.get(1) != null && ((MusicSong)class334.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class334.musicSongs.get(0);
			class334.musicSongs.set(0, class334.musicSongs.get(1));
			class334.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lsk;",
		garbageValue = "1005067285"
	)
	public static AbstractSocket method8585(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
