import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class417 extends SongTask {
	@ObfuscatedName("am")
	ArrayList field4581;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Ljava/util/ArrayList;)V"
	)
	public class417(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4597 = "ClearRequestTask";
		this.field4581 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4581.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4581.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class319.musicSongs.contains(var2)) {
						if (var2 == null) {
							class319.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3499 > 0) {
								--var2.midiPcmStream.field3499;
							}

							if (var2.midiPcmStream.field3499 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6075();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							class129.method3075(var2.musicTrackGroupId, var2.musicTrackFileId);
							class319.musicSongs.remove(var2);
						}
					}
				} catch (Exception var4) {
					class368.RunException_sendStackTrace((String)null, var4);
					this.method7954(var4.getMessage());
					class319.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
