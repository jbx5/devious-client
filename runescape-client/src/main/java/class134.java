import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class134 implements Callable {
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1753680661
	)
	static int field1611;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class137 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfv;Ltm;I)V"
	)
	class134(class137 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3057(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "-41"
	)
	static long method3049(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "3"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class385.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = Client.players[Client.combatTargetPlayerIndex];
					ItemLayer.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
				}

				return;
			}

			long var25 = WorldMapSectionType.method5445(var8);
			if (var6 != var25) {
				label371: {
					var6 = var25;
					int var13 = Interpreter.method2069(var8);
					int var14 = PcmPlayer.method854(var8);
					int var15 = class177.method3494(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var17 = InvDefinition.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var18 = var17;
					int var22;
					if (var15 == 2 && class130.scene.getObjectFlags(HealthBar.Client_plane, var13, var14, var25) >= 0) {
						ObjectComposition var19 = WorldMapElement.getObjectDefinition(var17);
						if (var19.transforms != null) {
							var19 = var19.transform();
						}

						if (var19 == null) {
							break label371;
						}

						PendingSpawn var20 = null;

						for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) {
							if (var21.plane == HealthBar.Client_plane && var13 == var21.x && var14 == var21.y && var18 == var21.field1187) {
								var20 = var21;
								break;
							}
						}

						if (Client.isItemSelected == 1) {
							class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(65535) + var19.name, 1, var18, var13, var14);
						} else if (Client.isSpellSelected) {
							if ((Canvas.selectedSpellFlags & 4) == 4) {
								class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class217.colorStartTag(65535) + var19.name, 2, var18, var13, var14);
							}
						} else {
							String[] var34 = var19.actions;
							if (var34 != null) {
								for (var22 = 4; var22 >= 0; --var22) {
									if ((var20 == null || var20.method2362(var22)) && var34[var22] != null) {
										short var23 = 0;
										if (var22 == 0) {
											var23 = 3;
										}

										if (var22 == 1) {
											var23 = 4;
										}

										if (var22 == 2) {
											var23 = 5;
										}

										if (var22 == 3) {
											var23 = 6;
										}

										if (var22 == 4) {
											var23 = 1001;
										}

										class385.insertMenuItemNoShift(var34[var22], class217.colorStartTag(65535) + var19.name, var23, var18, var13, var14);
									}
								}
							}

							class385.insertMenuItemNoShift("Examine", class217.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var14);
						}
					}

					int var27;
					Player var28;
					NPC var35;
					int[] var36;
					if (var15 == 1) {
						NPC var30 = Client.npcs[var18];
						if (var30 == null) {
							break label371;
						}

						if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var35 = Client.npcs[Client.npcIndices[var27]];
								if (var35 != null && var30 != var35 && var35.definition.size == 1 && var30.x == var35.x && var35.y == var30.y) {
									class260.addNpcToMenu(var35, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var22 = 0; var22 < var27; ++var22) {
								var28 = Client.players[var36[var22]];
								if (var28 != null && var30.x == var28.x && var28.y == var30.y) {
									ItemLayer.addPlayerToMenu(var28, var36[var22], var13, var14);
								}
							}
						}

						class260.addNpcToMenu(var30, var18, var13, var14);
					}

					if (var15 == 0) {
						Player var31 = Client.players[var18];
						if (var31 == null) {
							break label371;
						}

						if ((var31.x & 127) == 64 && (var31.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var35 = Client.npcs[Client.npcIndices[var27]];
								if (var35 != null && var35.definition.size == 1 && var35.x == var31.x && var35.y == var31.y) {
									class260.addNpcToMenu(var35, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var22 = 0; var22 < var27; ++var22) {
								var28 = Client.players[var36[var22]];
								if (var28 != null && var31 != var28 && var31.x == var28.x && var28.y == var31.y) {
									ItemLayer.addPlayerToMenu(var28, var36[var22], var13, var14);
								}
							}
						}

						if (var18 != Client.combatTargetPlayerIndex) {
							ItemLayer.addPlayerToMenu(var31, var18, var13, var14);
						} else {
							var4 = var25;
						}
					}

					if (var15 == 3) {
						NodeDeque var32 = Client.groundItems[HealthBar.Client_plane][var13][var14];
						if (var32 != null) {
							for (TileItem var33 = (TileItem)var32.first(); var33 != null; var33 = (TileItem)var32.next()) {
								ItemComposition var37 = InvDefinition.ItemDefinition_get(var33.id);
								if (Client.isItemSelected == 1) {
									class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14);
								} else if (Client.isSpellSelected) {
									if ((Canvas.selectedSpellFlags & 1) == 1) {
										class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class217.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14);
									}
								} else {
									String[] var29 = var37.groundActions;

									for (int var38 = 4; var38 >= 0; --var38) {
										if (var33.method2673(var38)) {
											if (var29 != null && var29[var38] != null) {
												byte var24 = 0;
												if (var38 == 0) {
													var24 = 18;
												}

												if (var38 == 1) {
													var24 = 19;
												}

												if (var38 == 2) {
													var24 = 20;
												}

												if (var38 == 3) {
													var24 = 21;
												}

												if (var38 == 4) {
													var24 = 22;
												}

												class385.insertMenuItemNoShift(var29[var38], class217.colorStartTag(16748608) + var37.name, var24, var33.id, var13, var14);
											} else if (var38 == 2) {
												class385.insertMenuItemNoShift("Take", class217.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14);
											}
										}
									}

									class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
