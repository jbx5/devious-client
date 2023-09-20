import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class199 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("ar")
	static byte[][][] field2004;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2009;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "-74786800"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = GrandExchangeOfferAgeComparator.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = class115.getTileHeight(var0.x, var0.y, class87.Client_plane);
					var0.playerCycle = Client.cycle;
					class10.scene.addNullableObject(class87.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = class115.getTileHeight(var0.x, var0.y, class87.Client_plane);
					var0.playerCycle = Client.cycle;
					class10.scene.drawEntity(class87.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
