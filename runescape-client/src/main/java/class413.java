import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class413 extends SongTask {
	@ObfuscatedName("at")
	ArrayList field4541;

	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/util/ArrayList;)V"
	)
	public class413(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4552 = "ClearRequestTask";
		this.field4541 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4541.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4541.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class316.musicSongs.contains(var2)) {
						if (var2 == null) {
							class316.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3455 > 0) {
								--var2.midiPcmStream.field3455;
							}

							if (var2.midiPcmStream.field3455 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6011();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class316.field3420.iterator();

							while (var5.hasNext()) {
								class322 var6 = (class322)var5.next();
								var6.vmethod6202(var3, var4);
							}

							class316.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var8);
					this.method7840(var8.getMessage());
					class316.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
