import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class438 extends SongTask {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ak")
	ArrayList field4783;

	@ObfuscatedSignature(
		descriptor = "(Lre;Ljava/util/ArrayList;)V"
	)
	public class438(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4793 = "ClearRequestTask";
		this.field4783 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		if (this.field4783.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4783.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class329.musicSongs.contains(var2)) {
						if (var2 == null) {
							class329.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3620 > 0) {
								--var2.midiPcmStream.field3620;
							}

							if (var2.midiPcmStream.field3620 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6256();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							class234.method4497(var2.musicTrackGroupId, var2.musicTrackFileId);
							class329.musicSongs.remove(var2);
						}
					}
				} catch (Exception var4) {
					BufferedSink.RunException_sendStackTrace((String)null, var4);
					this.method8305(var4.getMessage());
					class329.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2059831869"
	)
	static boolean method8273() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
