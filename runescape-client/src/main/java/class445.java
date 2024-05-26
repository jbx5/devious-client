import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class445 extends SongTask {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field4802;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field4801;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field4803;

	@ObfuscatedSignature(
		descriptor = "(Lre;Lor;Lor;Lor;)V"
	)
	public class445(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4802 = var2;
		this.field4801 = var3;
		this.field4803 = var4;
		super.field4793 = "LoadSongTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		int var1 = 0;
		Iterator var2 = class329.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3620 > 1 && var3.midiPcmStream.method6264()) {
					this.method8305("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3687) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3685 == null) {
								var3.field3685 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3685 == null) {
									continue;
								}
							}

							if (var3.field3695 == null) {
								var3.field3695 = new SoundCache(this.field4803, this.field4801);
							}

							if (var3.midiPcmStream.method6365(var3.field3685, this.field4802, var3.field3695)) {
								++var1;
								var3.field3687 = true;
								var3.midiPcmStream.method6267();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						BufferedSink.RunException_sendStackTrace((String)null, var5);
						this.method8305(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class329.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-9029251"
	)
	public static byte[] method8332(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}
}
