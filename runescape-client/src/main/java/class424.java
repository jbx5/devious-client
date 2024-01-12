import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class424 extends SongTask {
	@ObfuscatedName("hz")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4604;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4602;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4601;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Low;Low;Low;)V"
	)
	public class424(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4604 = var2;
		this.field4602 = var3;
		this.field4601 = var4;
		super.field4597 = "LoadSongTask";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		int var1 = 0;
		Iterator var2 = class319.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3499 > 1 && var3.midiPcmStream.method6079()) {
					this.method7954("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3575) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3584 == null) {
								var3.field3584 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3584 == null) {
									continue;
								}
							}

							if (var3.field3583 == null) {
								var3.field3583 = new SoundCache(this.field4601, this.field4602);
							}

							if (var3.midiPcmStream.method6072(var3.field3584, this.field4604, var3.field3583)) {
								++var1;
								var3.field3575 = true;
								var3.midiPcmStream.method6073();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class368.RunException_sendStackTrace((String)null, var5);
						this.method7954(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class319.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
