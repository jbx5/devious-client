import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class439 extends SongTask {
	@ObfuscatedName("aq")
	ArrayList field4800;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public class439(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4814 = "ClearRequestTask";
		this.field4800 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4800.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4800.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class330.musicSongs.contains(var2)) {
						if (var2 == null) {
							class330.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3627 > 0) {
								--var2.midiPcmStream.field3627;
							}

							if (var2.midiPcmStream.field3627 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6190();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class330.field3588.iterator();

							while (var5.hasNext()) {
								class336 var6 = (class336)var5.next();
								var6.vmethod6382(var3, var4);
							}

							class330.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					FriendsChat.RunException_sendStackTrace((String)null, var8);
					this.method8253(var8.getMessage());
					class330.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
