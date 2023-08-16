import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class401 extends SongTask {
	@ObfuscatedName("au")
	ArrayList field4511;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Ljava/util/ArrayList;)V"
	)
	public class401(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4523 = "ClearRequestTask";
		this.field4511 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4511.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4511.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class305.musicSongs.contains(var2)) {
						if (var2 == null) {
							class305.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3443 > 0) {
								--var2.midiPcmStream.field3443;
							}

							if (var2.midiPcmStream.field3443 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method5877();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class305.field3407.iterator();

							while (var5.hasNext()) {
								class311 var6 = (class311)var5.next();
								var6.vmethod5967(var3, var4);
							}

							class305.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					Messages.RunException_sendStackTrace((String)null, var8);
					this.method7601(var8.getMessage());
					class305.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
