import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class191 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	static AbstractArchive field1977;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static GameBuild field1978;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-993585503"
	)
	public static void method3758(int var0, int var1, int var2, int var3) {
		if (class316.musicSongs.size() > 1 && class316.musicSongs.get(0) != null && ((MusicSong)class316.musicSongs.get(0)).midiPcmStream.isReady() && class316.musicSongs.get(1) != null && ((MusicSong)class316.musicSongs.get(1)).midiPcmStream.isReady()) {
			EnumComposition.method3678(var0, var1, var2, var3);
			class316.field3413.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class316.field3417), class316.field3419));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class316.field3418), class316.musicPlayerStatus));
			class316.field3413.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class316.field3424.get(0) != null && class316.field3424.get(1) != null) {
				MusicSong var5 = (MusicSong)class316.field3424.get(0);
				class316.field3424.set(0, class316.musicSongs.get(1));
				class316.field3424.set(1, var5);
			}
		}

	}
}
