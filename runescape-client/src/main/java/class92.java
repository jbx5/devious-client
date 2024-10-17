import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public enum class92 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1124(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1117(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1119(2, 7),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1120(3, 8),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1121(4, 9);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1504516419
	)
	final int field1122;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -902041791
	)
	final int field1123;

	class92(int var3, int var4) {
		this.field1122 = var3;
		this.field1123 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1123;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "14"
	)
	static boolean method2584(String var0, int var1) {
		return AsyncHttpResponse.method277(var0, var1, "openjs");
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "35"
	)
	static final void method2577(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field978 != 0) {
						if (var1.field978 > 0) {
							var2 = class344.worldView.npcs[var1.field978 - 1];
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field971, var1.field972, var1.field973, Client.cycle);
							}
						} else {
							var3 = -var1.field978 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = SpriteMask.localPlayer;
							} else {
								var4 = class344.worldView.players[var3];
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field971, var1.field972, var1.field973, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.npcs[var1.targetIndex - 1];
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, ScriptFrame.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = SpriteMask.localPlayer;
						} else {
							var4 = var0.players[var3];
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, ScriptFrame.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
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

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1601399073"
	)
	static void method2581(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class344.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class397.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1536549515"
	)
	static final void method2582() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = var1.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (PendingSpawn.friendsChat != null) {
			PendingSpawn.friendsChat.clearFriends();
		}

	}
}
