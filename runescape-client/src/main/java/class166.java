import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class166 extends class159 {
	@ObfuscatedName("aw")
	String field1792;
	@ObfuscatedName("ay")
	byte field1794;
	@ObfuscatedName("ar")
	byte field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		this.field1792 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1792 != null) {
			var1.readUnsignedByte();
			this.field1794 = var1.readByte();
			this.field1793 = var1.readByte();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		var1.name = this.field1792;
		if (this.field1792 != null) {
			var1.field1778 = this.field1794;
			var1.field1780 = this.field1793;
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "1063442013"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class28.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
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
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + class136.localPlayer.x >> 7;
					int var12 = class136.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShort(AbstractArchive.baseX * 64 + var11);
					var13.packetBuffer.writeByteAdd(Client.field750.method4151(82) ? (Client.field750.method4151(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortLE(class148.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class136.localPlayer.x);
					var13.packetBuffer.writeShort(class136.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
