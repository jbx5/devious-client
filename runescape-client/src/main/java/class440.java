import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class440 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	public class440(SongTask var1) {
		super(var1);
		super.field4793 = "StartSongTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		Iterator var1 = class329.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3694 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6259();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3685 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3685, var2.musicTrackBoolean);
					}

					var2.field3685 = null;
					var2.field3695 = null;
					var2.musicTrackArchive = null;
					var2.field3694 = true;
				} catch (Exception var4) {
					BufferedSink.RunException_sendStackTrace((String)null, var4);
					this.method8305(var4.getMessage());
					return true;
				}
			}
		}

		super.field4798 = true;
		return true;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-90"
	)
	static final int method8290() {
		if (class459.clientPreferences.isRoofsHidden()) {
			return class358.scene.field1348;
		} else {
			int var0 = SoundSystem.method856(class358.scene, PlayerComposition.cameraX, UserComparator4.cameraZ, class358.scene.field1348);
			return var0 - class171.cameraY < 800 && (class358.scene.field1340[class358.scene.field1348][PlayerComposition.cameraX >> 7][UserComparator4.cameraZ >> 7] & 4) != 0 ? class358.scene.field1348 : 3;
		}
	}
}
