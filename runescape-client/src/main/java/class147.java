import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public abstract class class147 extends Node {
	class147() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	abstract void vmethod3486(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	abstract void vmethod3490(ClanSettings var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1112674257"
	)
	public static void method3236() {
		class195.field1851.clear();
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field578 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class534.getWindowedMode() == 1) {
			class188.client.setMaxCanvasSize(765, 503);
		} else {
			class188.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = WorldMapElement.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class534.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(DbTable.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
