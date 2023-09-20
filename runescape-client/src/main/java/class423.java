import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class423 extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4583;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4585;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4582;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lom;Lom;Lom;)V"
	)
	public class423(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4583 = var2;
		this.field4585 = var3;
		this.field4582 = var4;
		super.field4572 = "LoadSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		int var1 = 0;
		Iterator var2 = class319.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3450 > 1 && var3.midiPcmStream.method6050()) {
					this.method7773("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3547) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3548 == null) {
								var3.field3548 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3548 == null) {
									continue;
								}
							}

							if (var3.field3549 == null) {
								var3.field3549 = new SoundCache(this.field4582, this.field4585);
							}

							if (var3.midiPcmStream.method5972(var3.field3548, this.field4583, var3.field3549)) {
								++var1;
								var3.field3547 = true;
								var3.midiPcmStream.method5979();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class190.RunException_sendStackTrace((String)null, var5);
						this.method7773(var5.getMessage());
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
