import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("c")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"921646370")

	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[(var2 * 64) + var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljl;Lqv;I)Ljd;", garbageValue = 
	"-2117269105")

	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == (-1)) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == (-2)) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-64")

	static void method4351() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			class17.leftTitleSprite = null;
			ViewportMouse.rightTitleSprite = null;
			Decimator.logoSprite = null;
			class92.title_muteSprite = null;
			WorldMapSection2.options_buttons_0Sprite = null;
			class54.options_buttons_2Sprite = null;
			class393.worldSelectBackSprites = null;
			class400.worldSelectFlagSprites = null;
			class126.worldSelectArrows = null;
			TileItem.worldSelectStars = null;
			class135.field1569 = null;
			class341.loginScreenRunesAnimation.method2193();
			Actor.method2183(2);
			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var0 = new Buffer(4);
					var0.writeByte(2);
					var0.writeMedium(0);
					NetCache.NetCache_socket.write(var0.array, 0, 4);
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var2) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1972677763")

	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}