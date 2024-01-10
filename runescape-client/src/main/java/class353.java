import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class353 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "1180448642"
	)
	static void method6906(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field161.startsWith("win") && !var3) {
				class414.method7910(var0, 0);
				return;
			}

			if (class31.field161.startsWith("mac")) {
				class28.method428(var0, 1, var2);
				return;
			}

			class414.method7910(var0, 2);
		} else {
			class414.method7910(var0, 3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-201582987"
	)
	static final void method6914(String var0, int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;I)V",
		garbageValue = "-1277234617"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field708 = 0;
		Client.field549 = 0;
		PcmPlayer.method846(var1);

		int var3;
		while (true) {
			byte var2 = 16;
			var3 = 1 << var2;
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
				break;
			}

			int var4 = var1.readBits(var2);
			if (var4 == var3 - 1) {
				break;
			}

			boolean var5 = false;
			if (Client.npcs[var4] == null) {
				Client.npcs[var4] = new NPC();
				var5 = true;
			}

			NPC var6 = Client.npcs[var4];
			Client.npcIndices[++Client.npcCount - 1] = var4;
			var6.npcCycle = Client.cycle;
			int var10 = var1.readBits(1);
			if (var10 == 1) {
				Client.field603[++Client.field549 - 1] = var4;
			}

			boolean var11 = var1.readBits(1) == 1;
			if (var11) {
				var1.readBits(32);
			}

			int var7 = var1.readBits(1);
			int var9;
			if (var0) {
				var9 = var1.readBits(8);
				if (var9 > 127) {
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5);
				if (var9 > 15) {
					var9 -= 32;
				}
			}

			int var8;
			if (var0) {
				var8 = var1.readBits(8);
				if (var8 > 127) {
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5);
				if (var8 > 15) {
					var8 -= 32;
				}
			}

			int var12 = Client.defaultRotations[var1.readBits(3)];
			if (var5) {
				var6.orientation = var6.rotation = var12;
			}

			var6.definition = Script.getNpcDefinition(var1.readBits(14));
			class142.method3229(var6);
			if (var6.field1240 == 0) {
				var6.rotation = 0;
			}

			var6.method2658(KeyHandler.localPlayer.pathX[0] + var8, KeyHandler.localPlayer.pathY[0] + var9, var7 == 1);
		}

		var1.exportIndex();
		UrlRequester.method2903(var1);

		int var13;
		for (var13 = 0; var13 < Client.field708; ++var13) {
			var3 = Client.field625[var13];
			if (Client.npcs[var3].npcCycle != Client.cycle) {
				Client.npcs[var3].definition = null;
				Client.npcs[var3] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var13 = 0; var13 < Client.npcCount; ++var13) {
				if (Client.npcs[Client.npcIndices[var13]] == null) {
					throw new RuntimeException(var13 + "," + Client.npcCount);
				}
			}

		}
	}
}
