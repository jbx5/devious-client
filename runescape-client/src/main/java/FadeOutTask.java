import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	MusicSong field4878;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1730206093
	)
	int field4877;

	@ObfuscatedSignature(
		descriptor = "(Lra;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4878 = null;
		this.field4877 = 0;
		super.field4881 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3625.size()) {
				this.field4878 = (MusicSong)class333.field3625.get(var2);
			} else if (!var3 && var2 < class333.musicSongs.size()) {
				this.field4878 = (MusicSong)class333.musicSongs.get(var2);
			}

			this.field4877 = var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		if (this.field4878 != null && this.field4878.midiPcmStream != null) {
			this.field4878.field3751 = true;

			try {
				if (this.field4878.field3749 > 0.0F && this.field4878.midiPcmStream.isReady()) {
					float var1 = this.field4877 == 0 ? (float)this.field4877 : (float)this.field4878.musicTrackVolume / (float)this.field4877;
					MusicSong var10000 = this.field4878;
					var10000.field3749 -= var1 == 0.0F ? (float)this.field4878.musicTrackVolume : var1;
					if (this.field4878.field3749 < 0.0F) {
						this.field4878.field3749 = 0.0F;
					}

					this.field4878.midiPcmStream.setPcmStreamVolume((int)this.field4878.field3749);
					return false;
				}
			} catch (Exception var3) {
				this.method8725(var3.getMessage());
				return true;
			}

			this.field4878.field3751 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfp;",
		garbageValue = "-11"
	)
	static class135 method8713(int var0) {
		class135[] var1 = new class135[]{class135.field1576, class135.field1577, class135.field1583, class135.field1579, class135.field1580};
		class135 var2 = (class135)class177.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class135.field1576;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "535918245"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4901) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4905 > 0) {
				var3 = ByteArrayPool.field4909[--ByteArrayPool.field4905];
				ByteArrayPool.field4909[ByteArrayPool.field4905] = null;
				return var3;
			}

			int var6;
			if (ByteArrayPool.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < DbTableType.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((DbTableType.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < DbTableType.ByteArrayPool_alternativeSizes[var6] && var1) && HttpResponse.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = ByteArrayPool.ByteArrayPool_arrays[var6][--HttpResponse.ByteArrayPool_altSizeArrayCounts[var6]];
						ByteArrayPool.ByteArrayPool_arrays[var6][HttpResponse.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && DbTableType.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < DbTableType.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= DbTableType.ByteArrayPool_alternativeSizes[var6] && HttpResponse.ByteArrayPool_altSizeArrayCounts[var6] < ByteArrayPool.ByteArrayPool_arrays[var6].length) {
						return new byte[DbTableType.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
