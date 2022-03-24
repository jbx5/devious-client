import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("o")
	String field959;
	@ObfuscatedName("h")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("g")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("l")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	138857027)

	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	736868675)

	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-674733225)

	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1049907835)

	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"[Lpq;")

	@Export("switches")
	IterableNodeHashTable[] switches;
	static 
	{
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(II)[Lpq;", garbageValue = 
	"-256970075")

	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;III)V", garbageValue = 
	"762866023")

	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if ((Client.minimapState == 0) || (Client.minimapState == 3)) {
			if ((!Client.isMenuOpen) && ((MouseHandler.MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4)))) {
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
					int var9 = ((var4 * var8) + (var7 * var5)) >> 11;
					int var10 = ((var5 * var8) - (var4 * var7)) >> 11;
					int var11 = (var9 + class19.localPlayer.x) >> 7;
					int var12 = (class19.localPlayer.y - var10) >> 7;
					PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortLE(var11 + ApproximateRouteStrategy.baseX);
					var13.packetBuffer.writeShort(var12 + class250.baseY);
					var13.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class19.localPlayer.x);
					var13.packetBuffer.writeShort(class19.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}