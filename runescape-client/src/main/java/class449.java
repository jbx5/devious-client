import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class449 extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	AbstractArchive field4849;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	AbstractArchive field4850;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	AbstractArchive field4851;

	@ObfuscatedSignature(
		descriptor = "(Lri;Lpo;Lpo;Lpo;)V"
	)
	public class449(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4849 = var2;
		this.field4850 = var3;
		this.field4851 = var4;
		super.field4843 = "LoadSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		int var1 = 0;
		Iterator var2 = class334.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3637 > 1 && var3.midiPcmStream.method6543()) {
					this.method8609("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3739) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3731 == null) {
								var3.field3731 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3731 == null) {
									continue;
								}
							}

							if (var3.field3737 == null) {
								var3.field3737 = new SoundCache(this.field4851, this.field4850);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3731, this.field4849, var3.field3737)) {
								++var1;
								var3.field3739 = true;
								var3.midiPcmStream.method6508();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class171.RunException_sendStackTrace((String)null, var5);
						this.method8609(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class334.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "0"
	)
	public static void method8620(Huffman var0) {
		class365.huffman = var0;
	}
}
