import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class444 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lri;)V"
	)
	public class444(SongTask var1) {
		super(var1);
		super.field4843 = "StartSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		Iterator var1 = class334.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3733 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6509();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3731 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3731, var2.musicTrackBoolean);
					}

					var2.field3731 = null;
					var2.field3737 = null;
					var2.musicTrackArchive = null;
					var2.field3733 = true;
				} catch (Exception var4) {
					class171.RunException_sendStackTrace((String)null, var4);
					this.method8609(var4.getMessage());
					return true;
				}
			}
		}

		super.field4841 = true;
		return true;
	}
}
