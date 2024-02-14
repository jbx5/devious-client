import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class192 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field2022")
	public static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2103900652"
	)
	static final void method3779() {
		int var0;
		int var1;
		int var2;
		if (!Client.field789) {
			var0 = WorldMapArea.field2529 * 16384 + 64;
			var1 = UserComparator7.field1462 * 128 + 64;
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - WorldMapSectionType.field2609;
			class7.method53(var0, var2, var1);
		} else if (Client.field813 != null) {
			ClanMate.cameraX = Client.field813.vmethod8869();
			class317.cameraZ = Client.field813.vmethod8868();
			if (Client.field614) {
				AsyncHttpResponse.cameraY = Client.field813.vmethod8874();
			} else {
				AsyncHttpResponse.cameraY = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane) - Client.field813.vmethod8874();
			}

			Client.field813.method8882();
		}

		if (!Client.field790) {
			var0 = VarbitComposition.field2065 * 16384 + 64;
			var1 = class11.field46 * 128 + 64;
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - ChatChannel.field1045;
			int var3 = var0 - ClanMate.cameraX;
			int var4 = var2 - AsyncHttpResponse.cameraY;
			int var5 = var1 - class317.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			ScriptEvent.method2360(var7, var8);
		} else {
			if (Client.field794 != null) {
				FriendSystem.cameraPitch = Client.field794.method8865();
				FriendSystem.cameraPitch = Math.min(Math.max(FriendSystem.cameraPitch, 128), 383);
				Client.field794.method8882();
			}

			if (Client.field793 != null) {
				Script.cameraYaw = Client.field793.method8865() & 2047;
				Client.field793.method8882();
			}
		}

	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "997645488"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3251, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntLE(var0);
		Client.packetWriter.addNode(var2);
	}
}
