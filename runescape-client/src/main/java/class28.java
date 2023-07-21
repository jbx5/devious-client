import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class28 {
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("dn")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("ed")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1789640955
	)
	static int field162;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-60773254"
	)
	public static int method431(int var0, int var1, int var2) {
		int var3 = class228.method4505(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-725833336"
	)
	static boolean method430() {
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

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "123"
	)
	static void method428(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class457.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class136.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class503.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class503.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class503.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class503.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByteNeg(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class415.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
