import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4793 = "SwapSongTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		if (class329.musicSongs.size() > 1 && class329.musicSongs.get(0) != null && ((MusicSong)class329.musicSongs.get(0)).midiPcmStream.isReady() && class329.musicSongs.get(1) != null && ((MusicSong)class329.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class329.musicSongs.get(0);
			class329.musicSongs.set(0, class329.musicSongs.get(1));
			class329.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Luw;",
		garbageValue = "169251836"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5288.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9556(new Buffer(var2));
			}

			var1.method9559();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
