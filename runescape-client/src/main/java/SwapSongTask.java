import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 2070360615
	)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4881 = "SwapSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class333.musicSongs.get(0);
			class333.musicSongs.set(0, class333.musicSongs.get(1));
			class333.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "158168499"
	)
	public static int method8699(int var0) {
		return GrandExchangeOffer.method7804(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
