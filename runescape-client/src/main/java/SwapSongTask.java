import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("HitSplatDefinition_cached")
	static class497 HitSplatDefinition_cached;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4523 = "SwapSongTask";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (class305.musicSongs.size() > 1 && class305.musicSongs.get(0) != null && ((MusicSong)class305.musicSongs.get(0)).midiPcmStream.isReady() && class305.musicSongs.get(1) != null && ((MusicSong)class305.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class305.musicSongs.get(0);
			class305.musicSongs.set(0, class305.musicSongs.get(1));
			class305.musicSongs.set(1, var1);
		}

		return true;
	}
}
