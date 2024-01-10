import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class419 extends SongTask {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class419(SongTask var1) {
		super(var1);
		super.field4597 = "StartSongTask";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		Iterator var1 = class319.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3579 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6185();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3584 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3584, var2.musicTrackBoolean);
					}

					var2.field3584 = null;
					var2.field3583 = null;
					var2.musicTrackArchive = null;
					var2.field3579 = true;
				} catch (Exception var4) {
					class368.RunException_sendStackTrace((String)null, var4);
					this.method7954(var4.getMessage());
					return true;
				}
			}
		}

		super.field4594 = true;
		return true;
	}
}
