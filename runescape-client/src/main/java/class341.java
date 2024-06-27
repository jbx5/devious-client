import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class341 implements Comparator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field3699;

	class341() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;I)I",
		garbageValue = "-62561141"
	)
	int method6435(class334 var1, class334 var2) {
		return var1.field3647 - var2.field3647;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6435((class334)var1, (class334)var2);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-975761526"
	)
	static int method6427(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = AttackOption.method2786() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lde;IZI)V",
		garbageValue = "528326967"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			var3.isUnanimated = false;
			if ((Client.isLowDetail && var0.playerUpdateManager.playerCount > 50 || var0.playerUpdateManager.playerCount > 200) && var2 && var3.idleSequence == var3.movementSequence) {
				var3.isUnanimated = true;
			}

			int var4 = var3.x >> 7;
			int var5 = var3.y >> 7;
			if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
				long var6 = FileSystem.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = class169.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var4][var5] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var4][var5] = Client.viewportDrawCount;
					}

					var3.tileHeight = class169.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.isWalking);
				}
			}
		}

	}
}
