import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class450 extends SongTask {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4891;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4889;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4890;

	@ObfuscatedSignature(
		descriptor = "(Lra;Lpe;Lpe;Lpe;)V"
	)
	public class450(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4891 = var2;
		this.field4889 = var3;
		this.field4890 = var4;
		super.field4881 = "LoadSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		int var1 = 0;
		Iterator var2 = class333.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3647 > 1 && var3.midiPcmStream.method6615()) {
					this.method8725("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3757) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3753 == null) {
								var3.field3753 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3753 == null) {
									continue;
								}
							}

							if (var3.field3754 == null) {
								var3.field3754 = new SoundCache(this.field4890, this.field4889);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3753, this.field4891, var3.field3754)) {
								++var1;
								var3.field3757 = true;
								var3.midiPcmStream.method6604();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						HttpHeaders.RunException_sendStackTrace((String)null, var5);
						this.method8725(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class333.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
