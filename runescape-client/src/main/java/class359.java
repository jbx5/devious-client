import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("mp")
public class class359 {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = "(Lkn;III)V", garbageValue = "-748661685")
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}
				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var8 * var4 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + ScriptFrame.localPlayer.x >> 7;
					int var12 = ScriptFrame.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortAddLE(class7.baseY * 64 + var12);
					var13.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
					var13.packetBuffer.writeShortAdd(Decimator.baseX * 8 + var11);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(ScriptFrame.localPlayer.x);
					var13.packetBuffer.writeShort(ScriptFrame.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(descriptor = "(Lkn;B)V", garbageValue = "81")
	static final void method6482(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field757 == -1) {
				Client.field757 = var0.spriteId2;
				Client.field715 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field757;
			} else {
				var0.spriteId2 = Client.field715;
			}
		} else if (var1 == 325) {
			if (Client.field757 == -1) {
				Client.field757 = var0.spriteId2;
				Client.field715 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field715;
			} else {
				var0.spriteId2 = Client.field757;
			}
		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}