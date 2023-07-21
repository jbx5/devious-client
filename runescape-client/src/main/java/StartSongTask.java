import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("StartSongTask")
public class StartSongTask extends SongTask
{
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public StartSongTask(SongTask var1) {
		super(var1);
		super.songTaskName = "StartSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		Iterator var2 = class306.musicSongs.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3 != null && !var3.field3508 && var3.midiPcmStream != null) {
				try {
					var3.midiPcmStream.method5819();
					var3.midiPcmStream.setPcmStreamVolume(0);
					if (var3.field3518 != null) {
						var3.midiPcmStream.setMusicTrack(var3.field3518, var3.musicTrackBoolean);
					}

					var3.field3518 = null;
					var3.field3517 = null;
					var3.musicTrackArchive = null;
					var3.field3508 = true;
				} catch (Exception var5) {
					var5.printStackTrace();
					this.method7653(var5.getMessage());
					return true;
				}
			}
		}

		super.field4526 = true;
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "108"
	)
	public static void method7637(AbstractArchive var0) {
		DbTableType.field5043 = var0;
	}
}
