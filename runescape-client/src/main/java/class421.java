import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class421 extends SongTask {
	@ObfuscatedName("az")
	ArrayList field4638;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Ljava/util/ArrayList;)V"
	)
	public class421(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4651 = "ClearRequestTask";
		this.field4638 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4638.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4638.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();

				try {
					if (class321.musicSongs.contains(var2)) {
						if (var2 == null) {
							class321.musicSongs.remove(var2);
						} else {
							if (var2.midiPcmStream.field3534 > 0) {
								--var2.midiPcmStream.field3534;
							}

							if (var2.midiPcmStream.field3534 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6004();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class321.field3499.iterator();

							while (var5.hasNext()) {
								class327 var6 = (class327)var5.next();
								var6.vmethod6187(var3, var4);
							}

							class321.musicSongs.remove(var2);
						}
					}
				} catch (Exception var8) {
					class180.RunException_sendStackTrace((String)null, var8);
					this.method7844(var8.getMessage());
					class321.musicSongs.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1042075836"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	static final void method7808() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == class172.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.graphicsCycle);
					if (var0.isFinished) {
						var0.remove();
					} else {
						LoginType.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}
}
