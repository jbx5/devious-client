import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class443 extends SongTask {
	@ObfuscatedName("ap")
	ArrayList field4872;

	@ObfuscatedSignature(
		descriptor = "(Lra;Ljava/util/ArrayList;)V"
	)
	public class443(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4881 = "ClearRequestTask";
		this.field4872 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		if (this.field4872.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4872.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class333.musicSongs.contains(var2)) {
						if (var2 == null) {
							class333.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3647 > 0) {
								--var2.midiPcmStream.field3647;
							}

							if (var2.midiPcmStream.field3647 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6606();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class333.field3627.iterator();

							while (var5.hasNext()) {
								class339 var6 = (class339)var5.next();
								var6.vmethod6782(var3, var4);
							}

							class333.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					HttpHeaders.RunException_sendStackTrace((String)null, var8);
					this.method8725(var8.getMessage());
					class333.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2023971881"
	)
	static int method8703(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
