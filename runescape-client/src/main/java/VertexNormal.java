import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("l")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-359767671)

	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	396508261)

	@Export("y")
	int y;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-194088213)

	@Export("z")
	int z;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1595742309)

	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(descriptor = 
	"(Lhf;)V")

	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Ljx;", garbageValue = 
	"-37714344")

	static LoginPacket[] method4495() {
		return new LoginPacket[]{ LoginPacket.field3133, LoginPacket.field3134, LoginPacket.field3135, LoginPacket.field3137, LoginPacket.field3132, LoginPacket.field3136 };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljp;I)V", garbageValue = 
	"-338837319")

	public static void method4496(Huffman var0) {
		class282.huffman = var0;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"77")

	static void method4498() {
		if (Client.renderSelf) {
			class166.addPlayerToScene(class19.localPlayer, false);
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;B)V", garbageValue = 
	"11")

	static void method4497(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class83.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if ((((var7 != null) && (var7 != class19.localPlayer)) && (var7.username != null)) && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShort(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			Login.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}