import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class87 {
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-125"
	)
	static void method2398(int var0, int var1) {
		if (TileItem.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(Occluder.field2111, var0, 0, TileItem.clientPreferences.getMusicVolume(), false));
			class53.method1051(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-2001739400"
	)
	static void method2400(WorldView var0) {
		if (Client.combatTargetPlayerIndex >= 0 && var0.players[Client.combatTargetPlayerIndex] != null) {
			KitDefinition.addPlayerToScene(var0, Client.combatTargetPlayerIndex, false);
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "2302755"
	)
	static final void method2407(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field957 != 0) {
						if (var1.field957 > 0) {
							var2 = class328.worldView.npcs[var1.field957 - 1];
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field945, var1.field964, var1.field975, Client.cycle);
							}
						} else {
							var3 = -var1.field957 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = class253.localPlayer;
							} else {
								var4 = class328.worldView.players[var3];
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field945, var1.field964, var1.field975, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.npcs[var1.targetIndex - 1];
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, class162.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = class253.localPlayer;
						} else {
							var4 = var0.players[var3];
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, class162.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.scene.drawEntity(var0.plane, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIII)V",
		garbageValue = "2034758381"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = class162.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= class433.cameraX;
			var6 -= RestClientThreadFactory.cameraY;
			var2 -= WorldMapSection0.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[UserComparator6.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[UserComparator6.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[class264.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class264.cameraYaw];
			int var11 = var10 * var1 + var9 * var2 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var6 * var7 + var8 * var2 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
