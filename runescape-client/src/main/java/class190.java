import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class190 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field1842")
	static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loc;II)V",
		garbageValue = "-1022466724"
	)
	public static void method3711(AbstractArchive var0, int var1) {
		if (!class321.field3496.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class321.field3496.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3617 = false;
				var4.field3610 = false;
				var4.field3604 = false;
				var4.field3612 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3608 = 0.0F;
				var2.add(var4);
			}

			Renderable.method4881(var2, class321.musicPlayerStatus, class321.field3501, class321.field3502, class321.field3503, false);
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	static final void method3709() {
		if (Client.logoutTimer > 0) {
			PacketBufferNode.logOut();
		} else {
			Client.timer.method7914();
			FaceNormal.updateGameState(40);
			Actor.field1277 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
