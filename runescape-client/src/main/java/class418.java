import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class418 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public class418(SongTask var1) {
		super(var1);
		super.field4572 = "StartSongTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		Iterator var1 = class319.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3545 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method5974();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3548 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3548, var2.musicTrackBoolean);
					}

					var2.field3548 = null;
					var2.field3549 = null;
					var2.musicTrackArchive = null;
					var2.field3545 = true;
				} catch (Exception var4) {
					class190.RunException_sendStackTrace((String)null, var4);
					this.method7773(var4.getMessage());
					return true;
				}
			}
		}

		super.field4573 = true;
		return true;
	}
}
