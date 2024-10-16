import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ap")
	@Export("text")
	String text;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1550855137
	)
	@Export("width")
	int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 874402339
	)
	@Export("height")
	int height;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkv;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-122"
	)
	public static void method6291(int var0, int var1, int var2, int var3) {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			class333.musicPlayerStatus = var0;
			class333.field3631 = var1;
			class333.field3632 = var2;
			class333.field3633 = var3;
			class333.field3623.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class333.field3633), class333.field3632));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class333.field3631), class333.musicPlayerStatus));
			class333.field3623.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class333.field3628.get(0) != null && class333.field3628.get(1) != null) {
				MusicSong var5 = (MusicSong)class333.field3628.get(0);
				class333.field3628.set(0, class333.musicSongs.get(1));
				class333.field3628.set(1, var5);
			}
		}

	}
}
