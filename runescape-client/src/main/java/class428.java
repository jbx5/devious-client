import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class428 extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4662;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4660;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4661;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Loc;Loc;Loc;)V"
	)
	public class428(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4662 = var2;
		this.field4660 = var3;
		this.field4661 = var4;
		super.field4651 = "LoadSongTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		int var1 = 0;
		Iterator var2 = class321.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3534 > 1 && var3.midiPcmStream.method6113()) {
					this.method7844("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3610) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3616 == null) {
								var3.field3616 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3616 == null) {
									continue;
								}
							}

							if (var3.field3615 == null) {
								var3.field3615 = new SoundCache(this.field4661, this.field4660);
							}

							if (var3.midiPcmStream.method6085(var3.field3616, this.field4662, var3.field3615)) {
								++var1;
								var3.field3610 = true;
								var3.midiPcmStream.method6002();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class180.RunException_sendStackTrace((String)null, var5);
						this.method7844(var5.getMessage());
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
