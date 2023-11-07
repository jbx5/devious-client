import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class327 implements Comparator {
	class327() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;I)I",
		garbageValue = "456447247"
	)
	int method6241(class320 var1, class320 var2) {
		return var1.field3475 - var2.field3475;
	}

	public int compare(Object var1, Object var2) {
		return this.method6241((class320)var1, (class320)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static final void method6247() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == ItemLayer.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					NPC var1;
					int var2;
					Player var3;
					if (!var0.isMoving && var0.field950 != 0) {
						if (var0.field950 > 0) {
							var1 = Client.npcs[var0.field950 - 1];
							if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
								var0.sourceX = var1.x;
								var0.sourceY = var1.y;
								var0.setDestination(var0.field960, var0.field938, var0.field945, Client.cycle);
							}
						} else {
							var2 = -var0.field950 - 1;
							if (var2 == Client.localPlayerIndex) {
								var3 = class229.localPlayer;
							} else {
								var3 = Client.players[var2];
							}

							if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
								var0.sourceX = var3.x;
								var0.sourceY = var3.y;
								var0.setDestination(var0.field960, var0.field938, var0.field945, Client.cycle);
							}
						}
					}

					if (var0.targetIndex > 0) {
						var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, WorldMapDecorationType.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						var2 = -var0.targetIndex - 1;
						if (var2 == Client.localPlayerIndex) {
							var3 = class229.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, WorldMapDecorationType.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.graphicsCycle);
					class36.scene.drawEntity(ItemLayer.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
