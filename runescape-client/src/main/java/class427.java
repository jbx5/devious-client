import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class427 extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4636;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4633;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4635;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Lof;Lof;Lof;)V"
	)
	public class427(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4636 = var2;
		this.field4633 = var3;
		this.field4635 = var4;
		super.field4627 = "LoadSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		int var1 = 0;
		Iterator var2 = class321.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3518 > 1 && var3.midiPcmStream.method6229()) {
					this.method8017("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3589) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3593 == null) {
								var3.field3593 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3593 == null) {
									continue;
								}
							}

							if (var3.field3600 == null) {
								var3.field3600 = new SoundCache(this.field4635, this.field4633);
							}

							if (var3.midiPcmStream.method6151(var3.field3593, this.field4636, var3.field3600)) {
								++var1;
								var3.field3589 = true;
								var3.midiPcmStream.method6152();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class315.RunException_sendStackTrace((String)null, var5);
						this.method8017(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class321.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
