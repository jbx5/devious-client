import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class471 extends class472 {
	public class471(int var1) {
		super(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;IS)V",
		garbageValue = "6664"
	)
	void vmethod8471(Buffer var1, int var2) {
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-701668096"
	)
	static final void method8460() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == class87.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					NPC var1;
					int var2;
					Player var3;
					if (!var0.isMoving && var0.field976 != 0) {
						if (var0.field976 > 0) {
							var1 = Client.npcs[var0.field976 - 1];
							if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
								var0.sourceX = var1.x;
								var0.sourceY = var1.y;
								var0.setDestination(var0.field974, var0.field975, var0.field989, Client.cycle);
							}
						} else {
							var2 = -var0.field976 - 1;
							if (var2 == Client.localPlayerIndex) {
								var3 = TextureProvider.localPlayer;
							} else {
								var3 = Client.players[var2];
							}

							if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
								var0.sourceX = var3.x;
								var0.sourceY = var3.y;
								var0.setDestination(var0.field974, var0.field975, var0.field989, Client.cycle);
							}
						}
					}

					if (var0.targetIndex > 0) {
						var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, class115.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						var2 = -var0.targetIndex - 1;
						if (var2 == Client.localPlayerIndex) {
							var3 = TextureProvider.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class115.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.graphicsCycle);
					class10.scene.drawEntity(class87.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
