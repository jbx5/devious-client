import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class447 extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field4804;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field4801;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field4803;

	@ObfuscatedSignature(
		descriptor = "(Lrm;Lob;Lob;Lob;)V"
	)
	public class447(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4804 = var2;
		this.field4801 = var3;
		this.field4803 = var4;
		super.field4796 = "LoadSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		int var1 = 0;
		Iterator var2 = class332.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3604 > 1 && var3.midiPcmStream.method6307()) {
					this.method8325("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3678) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3684 == null) {
								var3.field3684 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3684 == null) {
									continue;
								}
							}

							if (var3.field3683 == null) {
								var3.field3683 = new SoundCache(this.field4803, this.field4801);
							}

							if (var3.midiPcmStream.method6282(var3.field3684, this.field4804, var3.field3683)) {
								++var1;
								var3.field3678 = true;
								var3.midiPcmStream.method6245();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						Script.RunException_sendStackTrace((String)null, var5);
						this.method8325(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class332.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
