import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1975266977
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;",
		garbageValue = "-411117179"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "1382132932"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1557589062"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-36"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4816) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4818 > 0) {
				var3 = ByteArrayPool.field4826[--ByteArrayPool.field4818];
				ByteArrayPool.field4826[ByteArrayPool.field4818] = null;
				return var3;
			}

			int var6;
			if (class202.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class47.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class47.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class47.ByteArrayPool_alternativeSizes[var6] && var1) && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class202.ByteArrayPool_arrays[var6][--ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var6]];
						class202.ByteArrayPool_arrays[var6][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class47.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class47.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class47.ByteArrayPool_alternativeSizes[var6] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var6] < class202.ByteArrayPool_arrays[var6].length) {
						return new byte[class47.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1022757602"
	)
	static void method2226(int var0, String var1) {
		int var2 = class17.localPlayer.worldView.playerUpdateManager.playerCount;
		int[] var3 = class17.localPlayer.worldView.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class236.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = class17.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != class17.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShort(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = WorldMapElement.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShortLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			UrlRequest.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
