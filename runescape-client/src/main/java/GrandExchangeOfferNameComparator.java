import java.io.File;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loo;Loo;I)I",
		garbageValue = "-2124939265"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "1287482454"
	)
	static void method7178(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method7181() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == SecureUrlRequester.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					NPC var1;
					int var2;
					Player var3;
					if (!var0.isMoving && var0.field959 != 0) {
						if (var0.field959 > 0) {
							var1 = Client.npcs[var0.field959 - 1];
							if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
								var0.sourceX = var1.x;
								var0.sourceY = var1.y;
								var0.setDestination(var0.field960, var0.field953, var0.field954, Client.cycle);
							}
						} else {
							var2 = -var0.field959 - 1;
							if (var2 == Client.localPlayerIndex) {
								var3 = KeyHandler.localPlayer;
							} else {
								var3 = Client.players[var2];
							}

							if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
								var0.sourceX = var3.x;
								var0.sourceY = var3.y;
								var0.setDestination(var0.field960, var0.field953, var0.field954, Client.cycle);
							}
						}
					}

					if (var0.targetIndex > 0) {
						var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, HttpRequestTask.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						var2 = -var0.targetIndex - 1;
						if (var2 == Client.localPlayerIndex) {
							var3 = KeyHandler.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, HttpRequestTask.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.graphicsCycle);
					GrandExchangeOfferOwnWorldComparator.scene.drawEntity(SecureUrlRequester.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
