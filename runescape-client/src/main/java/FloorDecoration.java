import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -131403051
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1587512512
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 637123369
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -3473567591769140085L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1524245831
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "-1863076827"
	)
	public static void method4784(AbstractArchive var0) {
		DbRowType.field5405 = var0;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "-945105420"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7328(class416.widgetDefinition, true);
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
					int var9 = var8 * var4 + var7 * var5 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = GameEngine.entity.getX() + var9 >> 7;
					int var12 = GameEngine.entity.getY() - var10 >> 7;
					PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortAdd(var11 + class198.topLevelWorldView.baseX);
					var13.packetBuffer.writeShortAddLE(var12 + class198.topLevelWorldView.baseY);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(SpriteMask.localPlayer.x);
					var13.packetBuffer.writeShort(SpriteMask.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
