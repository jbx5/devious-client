import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class403 extends SongTask {
	@ObfuscatedName("ae")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public class403(SongTask var1) {
		super(var1);
		super.field4523 = "StartSongTask";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		Iterator var1 = class305.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3518 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method5783();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3522 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3522, var2.musicTrackBoolean);
					}

					var2.field3522 = null;
					var2.field3521 = null;
					var2.musicTrackArchive = null;
					var2.field3518 = true;
				} catch (Exception var4) {
					Messages.RunException_sendStackTrace((String)null, var4);
					this.method7601(var4.getMessage());
					return true;
				}
			}
		}

		super.field4525 = true;
		return true;
	}
}
