import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask
{
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.songTaskName = "SwapSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (class306.musicSongs.size() > 1 && class306.musicSongs.get(0) != null && ((MusicSong)class306.musicSongs.get(0)).midiPcmStream.isReady() && class306.musicSongs.get(1) != null && ((MusicSong)class306.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var2 = (MusicSong)class306.musicSongs.get(0);
			class306.musicSongs.set(0, class306.musicSongs.get(1));
			class306.musicSongs.set(1, var2);
		}

		return true;
	}
}
