import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1109762615
	)
	static int field2687;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1561084375
	)
	@Export("width")
	int width;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1517997945
	)
	@Export("height")
	int height;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -316828137
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1082891503
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljq;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lth;III)I",
		garbageValue = "593515944"
	)
	static int method4997(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lmb;",
		garbageValue = "99"
	)
	public static PacketBufferNode method4996() {
		PacketBufferNode var0 = class323.method6113();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
