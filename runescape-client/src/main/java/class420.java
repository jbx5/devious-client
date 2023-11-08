import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class420 extends SongTask {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4564;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4561;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4562;

	@ObfuscatedSignature(
		descriptor = "(Lql;Lol;Lol;Lol;)V"
	)
	public class420(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4564 = var2;
		this.field4561 = var3;
		this.field4562 = var4;
		super.field4552 = "LoadSongTask";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		int var1 = 0;
		Iterator var2 = class316.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3455 > 1 && var3.midiPcmStream.method6015()) {
					this.method7840("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3536) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3534 == null) {
								var3.field3534 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3534 == null) {
									continue;
								}
							}

							if (var3.field3533 == null) {
								var3.field3533 = new SoundCache(this.field4562, this.field4561);
							}

							if (var3.midiPcmStream.method6008(var3.field3534, this.field4564, var3.field3533)) {
								++var1;
								var3.field3536 = true;
								var3.midiPcmStream.method6009();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var5);
						this.method7840(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class316.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
