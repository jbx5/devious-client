import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class172 extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -295294778959019417L
	)
	long field1850;
	@ObfuscatedName("ae")
	String field1849;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class172(class153 var1) {
		this.this$0 = var1;
		this.field1850 = -1L;
		this.field1849 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1850 = var1.readLong();
		}

		this.field1849 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3584(this.field1850, this.field1849);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "2013029794"
	)
	public static TransformationMatrix method3757() {
		synchronized(TransformationMatrix.field4734) {
			if (TransformationMatrix.field4738 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4734[--TransformationMatrix.field4738].method8130();
				return TransformationMatrix.field4734[TransformationMatrix.field4738];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CIB)Ljava/lang/String;",
		garbageValue = "121"
	)
	public static String method3745(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "-658802849"
	)
	static void method3754(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(class347.field3742.hash);
		var0.packetBuffer.writeInt(class53.archive2.hash);
		var0.packetBuffer.writeIntIME(KeyHandler.field110.hash);
		var0.packetBuffer.writeIntIME(class358.field3790.hash);
		var0.packetBuffer.writeIntIME(Bounds.archive9.hash);
		var0.packetBuffer.writeInt(class187.archive12.hash);
		var0.packetBuffer.writeIntME(ScriptFrame.field460.hash);
		var0.packetBuffer.writeInt(MusicPatch.field3690.hash);
		var0.packetBuffer.writeIntME(class327.archive4.hash);
		var0.packetBuffer.writeIntME(PendingSpawn.field1213.hash);
		var0.packetBuffer.writeIntME(0);
		var0.packetBuffer.writeIntIME(VertexNormal.field2888.hash);
		var0.packetBuffer.writeIntME(class464.field4946.hash);
		var0.packetBuffer.writeIntIME(Login.field986.hash);
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1296225271"
	)
	static void method3746(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class28.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = AddRequestTask.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != AddRequestTask.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class141.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class141.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class141.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class141.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			StructComposition.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-117"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "-1044756972"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
