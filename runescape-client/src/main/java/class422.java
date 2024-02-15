import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class422 extends SongTask {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -740427323
	)
	static int field4618;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public class422(SongTask var1) {
		super(var1);
		super.field4627 = "StartSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		Iterator var1 = class321.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3596 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6153();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3593 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3593, var2.musicTrackBoolean);
					}

					var2.field3593 = null;
					var2.field3600 = null;
					var2.musicTrackArchive = null;
					var2.field3596 = true;
				} catch (Exception var4) {
					class315.RunException_sendStackTrace((String)null, var4);
					this.method8017(var4.getMessage());
					return true;
				}
			}
		}

		super.field4630 = true;
		return true;
	}
}
