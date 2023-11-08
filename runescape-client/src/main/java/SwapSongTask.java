import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static Widget field4539;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4552 = "SwapSongTask";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (class316.musicSongs.size() > 1 && class316.musicSongs.get(0) != null && ((MusicSong)class316.musicSongs.get(0)).midiPcmStream.isReady() && class316.musicSongs.get(1) != null && ((MusicSong)class316.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class316.musicSongs.get(0);
			class316.musicSongs.set(0, class316.musicSongs.get(1));
			class316.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "23"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4577) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4574) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4583) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4578) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4573 < ByteArrayPool.field4585) {
				ByteArrayPool.field4589[++ByteArrayPool.field4573 - 1] = var0;
			} else {
				if (class1.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < Clock.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == Clock.ByteArrayPool_alternativeSizes[var2] && class267.ByteArrayPool_altSizeArrayCounts[var2] < class1.ByteArrayPool_arrays[var2].length) {
							class1.ByteArrayPool_arrays[var2][class267.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
