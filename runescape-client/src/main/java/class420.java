import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class420 extends SongTask {
	@ObfuscatedName("aq")
	ArrayList field4614;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Ljava/util/ArrayList;)V"
	)
	public class420(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4627 = "ClearRequestTask";
		this.field4614 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4614.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4614.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class321.musicSongs.contains(var2)) {
						if (var2 == null) {
							class321.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3518 > 0) {
								--var2.midiPcmStream.field3518;
							}

							if (var2.midiPcmStream.field3518 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6202();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class321.field3482.iterator();

							while (var5.hasNext()) {
								class327 var6 = (class327)var5.next();
								var6.vmethod6339(var3, var4);
							}

							class321.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					class315.RunException_sendStackTrace((String)null, var8);
					this.method8017(var8.getMessage());
					class321.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
