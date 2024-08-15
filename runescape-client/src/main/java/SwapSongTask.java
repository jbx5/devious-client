import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4796 = "SwapSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		if (class332.musicSongs.size() > 1 && class332.musicSongs.get(0) != null && ((MusicSong)class332.musicSongs.get(0)).midiPcmStream.isReady() && class332.musicSongs.get(1) != null && ((MusicSong)class332.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class332.musicSongs.get(0);
			class332.musicSongs.set(0, class332.musicSongs.get(1));
			class332.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1668015207"
	)
	static int method8303(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field865 - 7.0D) * 256.0D);
	}
}
