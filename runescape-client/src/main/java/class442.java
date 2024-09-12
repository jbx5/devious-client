import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class442 extends SongTask {
	@ObfuscatedName("ae")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ac")
	ArrayList field4830;

	@ObfuscatedSignature(
		descriptor = "(Lri;Ljava/util/ArrayList;)V"
	)
	public class442(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4843 = "ClearRequestTask";
		this.field4830 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		if (this.field4830.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4830.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class334.musicSongs.contains(var2)) {
						if (var2 == null) {
							class334.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3637 > 0) {
								--var2.midiPcmStream.field3637;
							}

							if (var2.midiPcmStream.field3637 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6510();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							Strings.method7442(var2.musicTrackGroupId, var2.musicTrackFileId);
							class334.musicSongs.remove(var2);
						}
					}
				} catch (Exception var4) {
					class171.RunException_sendStackTrace((String)null, var4);
					this.method8609(var4.getMessage());
					class334.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
