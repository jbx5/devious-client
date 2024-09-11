import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class7 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static IndexedSprite field20;
	@ObfuscatedName("jf")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Widget field22;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -693941039
	)
	static int field21;
	@ObfuscatedName("ac")
	ExecutorService field19;
	@ObfuscatedName("ae")
	Future field16;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	final Buffer field15;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class3 field18;

	@ObfuscatedSignature(
		descriptor = "(Lvf;Lam;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field19 = Executors.newSingleThreadExecutor();
		this.field15 = var1;
		this.field18 = var2;
		this.method48();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method45() {
		return this.field16.isDone();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-221908306"
	)
	public void method46() {
		this.field19.shutdown();
		this.field19 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-2061747506"
	)
	public Buffer method58() {
		try {
			return (Buffer)this.field16.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1981636544"
	)
	void method48() {
		this.field16 = this.field19.submit(new class1(this, this.field15, this.field18));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "312256174"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-1045579467"
	)
	public static int method59(CharSequence var0, int var1) {
		return class149.method3466(var0, var1, true);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1885288890"
	)
	public static int method47(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILnm;ZI)V",
		garbageValue = "-2131307483"
	)
	static void method56(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class147.getWorldMap().getMapArea(var0);
		int var4 = AddRequestTask.localPlayer.plane;
		int var5 = (AddRequestTask.localPlayer.x >> 7) + ClientPreferences.topLevelWorldView.baseX;
		int var6 = (AddRequestTask.localPlayer.y >> 7) + ClientPreferences.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class147.getWorldMap().method9400(var3, var7, var1, var2);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1530919932"
	)
	static void method52() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.worldEntityCount; ++var2) {
				int var3 = var1.worldEntityIndices[var2];
				WorldEntity var4 = var1.worldEntities[var3];
				if (var4 != null) {
					var4.updateMovement();
				}
			}
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "-81"
	)
	static final void method55(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field1016 != 0) {
						if (var1.field1016 > 0) {
							var2 = class162.worldView.npcs[var1.field1016 - 1];
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field999, var1.field994, var1.field996, Client.cycle);
							}
						} else {
							var3 = -var1.field1016 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = AddRequestTask.localPlayer;
							} else {
								var4 = class162.worldView.players[var3];
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field999, var1.field994, var1.field996, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.npcs[var1.targetIndex - 1];
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, VarcInt.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = AddRequestTask.localPlayer;
						} else {
							var4 = var0.players[var3];
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, VarcInt.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
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

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1085091910"
	)
	static final void method57(int var0, int var1, int var2, int var3) {
		GraphicsObject.method2291();
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1216632137"
	)
	static final void method53() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = ClientPreferences.topLevelWorldView.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
