import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class425 {
	@ObfuscatedName("ak")
	float[] field4710;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 330454819
	)
	int field4711;

	class425(float[] var1, int var2) {
		this.field4710 = var1;
		this.field4711 = var2;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IZI)V",
		garbageValue = "-878952179"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			var3.isUnanimated = false;
			if ((Client.isLowDetail && var0.playerUpdateManager.playerCount > 50 || var0.playerUpdateManager.playerCount > 200) && var2 && var3.movementSequence == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var4 = var3.x >> 7;
			int var5 = var3.y >> 7;
			if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
				long var6 = KitDefinition.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = SoundSystem.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var4][var5] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var4][var5] = Client.viewportDrawCount;
					}

					var3.tileHeight = SoundSystem.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.isWalking);
				}
			}
		}

	}
}
