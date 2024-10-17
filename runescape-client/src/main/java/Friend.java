import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ap")
	boolean field4999;
	@ObfuscatedName("aw")
	boolean field4997;

	Friend() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)I",
		garbageValue = "-121992435"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4999 && !var1.field4999) {
			return -1;
		} else if (!this.field4999 && var1.field4999) {
			return 1;
		} else if (this.field4997 && !var1.field4997) {
			return -1;
		} else if (!this.field4997 && var1.field4997) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lse;S)I",
		garbageValue = "7143"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1283890349"
	)
	public static int method8993(int var0) {
		return class506.field5145[var0 & 16383];
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IZS)V",
		garbageValue = "227"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.idleSequence == var3.movementSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = class140.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = ScriptFrame.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = ScriptFrame.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
