import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	static AbstractSocket field2237;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1762849059
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 610056427
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 410415313
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1876745509
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgj;I)Z",
		garbageValue = "-385329000"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqf;B)V",
		garbageValue = "13"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class67.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class128.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - WorldMapData_1.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		Tiles.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1292[var1] != null) { // L: 50
			var2.read(Players.field1292[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1290[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var1 != var7) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1290[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "7"
	)
	public static int method4026(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 28
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 29
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 30
		var0 += var0 >>> 8; // L: 31
		var0 += var0 >>> 16; // L: 32
		return var0 & 255; // L: 33
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "44720495"
	)
	public static void method4027() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 43
			synchronized(MouseHandler.MouseHandler_instance) { // L: 44
				MouseHandler.MouseHandler_instance = null; // L: 45
			} // L: 46
		}

	} // L: 48
}
