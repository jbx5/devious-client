import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bk")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -513159761)
	@Export("param0")
	int param0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 312244153)
	@Export("param1")
	int param1;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1134197845)
	@Export("opcode")
	int opcode;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 59405457)
	@Export("identifier")
	int identifier;

	@ObfuscatedName("j")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)Lny;", garbageValue = "24881")
	public static class387 method1884() {
		synchronized(class387.field4393) {
			if (class387.field4395 == 0) {
				return new class387();
			} else {
				class387.field4393[--class387.field4395].method6956();
				return class387.field4393[class387.field4395];
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = "(Lkb;IIS)V", garbageValue = "4254")
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
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
					int var9 = var8 * var4 + var5 * var7 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + class101.localPlayer.x >> 7;
					int var12 = class101.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
					var13.packetBuffer.writeShort(var11 + class28.baseX);
					var13.packetBuffer.writeShortLE(var12 + WorldMapLabelSize.baseY);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class101.localPlayer.x);
					var13.packetBuffer.writeShort(class101.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}
		}
	}
}