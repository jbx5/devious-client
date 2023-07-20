import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class402 extends class407 {
	@ObfuscatedName("aw")
	ArrayList field4515;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Ljava/util/ArrayList;)V"
	)
	public class402(class407 var1, ArrayList var2) {
		super(var1);
		super.field4528 = "ClearRequestTask";
		this.field4515 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4515.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4515.iterator();

			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();

				try {
					if (class306.musicSongs.contains(var3)) {
						if (var3 == null) {
							class306.musicSongs.remove(var3);
						} else {
							--var3.midiPcmStream.field3439;
							if (var3.midiPcmStream.field3439 == 0) {
								var3.midiPcmStream.clear();
								var3.midiPcmStream.method5820();
								var3.midiPcmStream.setPcmStreamVolume(0);
							}

							FloorOverlayDefinition.method4061(var3.musicTrackGroupId, var3.musicTrackFileId);
							class306.musicSongs.remove(var3);
						}
					}
				} catch (Exception var5) {
					var5.printStackTrace();
					this.method7653(var5.getMessage());
					class306.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}
}
