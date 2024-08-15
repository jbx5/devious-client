import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class440 extends SongTask {
	@ObfuscatedName("ab")
	ArrayList field4778;

	@ObfuscatedSignature(
		descriptor = "(Lrm;Ljava/util/ArrayList;)V"
	)
	public class440(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4796 = "ClearRequestTask";
		this.field4778 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		if (this.field4778.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4778.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class332.musicSongs.contains(var2)) {
						if (var2 == null) {
							class332.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3604 > 0) {
								--var2.midiPcmStream.field3604;
							}

							if (var2.midiPcmStream.field3604 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6247();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class332.field3569.iterator();

							while (var5.hasNext()) {
								class338 var6 = (class338)var5.next();
								var6.vmethod6445(var3, var4);
							}

							class332.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					Script.RunException_sendStackTrace((String)null, var8);
					this.method8325(var8.getMessage());
					class332.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
