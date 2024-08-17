import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class140 {
	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lnq;III)V",
		garbageValue = "-1273763416"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method6948(FloorUnderlayDefinition.widgetDefinition, true);
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
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = class354.entity.getX() + var9 >> 7;
					int var12 = class354.entity.getY() - var10 >> 7;
					PacketBufferNode var13 = class218.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortLE(var12 + ConcurrentMidiTask.topLevelWorldView.baseY);
					var13.packetBuffer.writeShort(var11 + ConcurrentMidiTask.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class253.localPlayer.x);
					var13.packetBuffer.writeShort(class253.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2115056381"
	)
	static void method3255(int var0) {
		Client.oculusOrbState = var0;
	}
}
