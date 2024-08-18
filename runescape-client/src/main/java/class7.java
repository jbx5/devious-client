import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class7 {
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ab")
	ExecutorService field14;
	@ObfuscatedName("ay")
	Future field15;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	final Buffer field16;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final class3 field20;

	@ObfuscatedSignature(
		descriptor = "(Lvg;Lau;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field14 = Executors.newSingleThreadExecutor();
		this.field16 = var1;
		this.field20 = var2;
		this.method44();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "49"
	)
	public boolean method51() {
		return this.field15.isDone();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1578100423"
	)
	public void method42() {
		this.field14.shutdown();
		this.field14 = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "-1930502010"
	)
	public Buffer method43() {
		try {
			return (Buffer)this.field15.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2024551694"
	)
	void method44() {
		this.field15 = this.field14.submit(new class1(this, this.field16, this.field20));
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "44"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			SecureUrlRequester.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (-1L != var4) {
					var9 = (int)(var4 >>> 0 & 127L);
					var11 = AttackOption.method2841(var4);
					Player var12 = ConcurrentMidiTask.topLevelWorldView.players[Client.combatTargetPlayerIndex];
					WorldMapData_1.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var11, var6);
				}

				return;
			}

			long var29 = ClanSettings.method3498(var9);
			if (var29 != var7) {
				var7 = var29;
				long var16 = ViewportMouse.ViewportMouse_entityTags[var9];
				int var15 = (int)(var16 >>> 0 & 127L);
				var15 = var15;
				int var31 = AttackOption.method2841(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var17 = var31;
				int var18 = BoundaryObject.method4470(var9);
				int var19 = class287.method5868(var9);
				int var20 = SpriteBufferProperties.method7142(var9);
				if (var20 == 2047) {
					var20 = -1;
				}

				WorldView var21 = null;
				if (var20 >= 0 && ConcurrentMidiTask.topLevelWorldView.worldEntities[var20] != null) {
					var21 = ConcurrentMidiTask.topLevelWorldView.worldEntities[var20].worldView;
				} else if (var20 == -1) {
					var21 = ConcurrentMidiTask.topLevelWorldView;
				}

				if (var21 != null) {
					label413: {
						int var22 = var21.plane;
						int var26;
						if (var18 == 2 && var21.scene.getObjectFlags(var22, var15, var31, var29) >= 0) {
							ObjectComposition var23 = class222.getObjectDefinition(var19);
							if (var23.transforms != null) {
								var23 = var23.transform();
							}

							if (var23 == null) {
								break label413;
							}

							PendingSpawn var24 = null;

							for (PendingSpawn var25 = (PendingSpawn)var21.pendingSpawns.last(); var25 != null; var25 = (PendingSpawn)var21.pendingSpawns.previous()) {
								if (var22 == var25.plane && var15 == var25.x && var17 == var25.y && var19 == var25.field1171) {
									var24 = var25;
									break;
								}
							}

							if (!KeyHandler.field107 && Client.isItemSelected == 1) {
								NpcOverrides.insertMenuItem("Use", Client.field659 + " " + "->" + " " + TransformationMatrix.colorStartTag(65535) + var23.name, 1, var19, var15, var17, -1, false, var20);
							} else if (Client.isSpellSelected) {
								if (!KeyHandler.field107 && (UserComparator3.selectedSpellFlags & 4) == 4) {
									NpcOverrides.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + TransformationMatrix.colorStartTag(65535) + var23.name, 2, var19, var15, var17, -1, false, var20);
								}
							} else {
								String[] var39 = var23.actions;
								if (var39 != null) {
									for (var26 = 4; var26 >= 0; --var26) {
										if (!KeyHandler.field107 && (var24 == null || var24.method2514(var26)) && var39[var26] != null) {
											short var27 = 0;
											if (var26 == 0) {
												var27 = 3;
											}

											if (var26 == 1) {
												var27 = 4;
											}

											if (var26 == 2) {
												var27 = 5;
											}

											if (var26 == 3) {
												var27 = 6;
											}

											if (var26 == 4) {
												var27 = 1001;
											}

											NpcOverrides.insertMenuItem(var39[var26], TransformationMatrix.colorStartTag(65535) + var23.name, var27, var19, var15, var17, -1, false, var20);
										}
									}
								}

								NpcOverrides.insertMenuItem("Examine", TransformationMatrix.colorStartTag(65535) + var23.name, 1002, var23.id, var15, var17, -1, false, var20);
							}
						}

						int var32;
						Player var33;
						NPC var40;
						int[] var41;
						if (var18 == 1) {
							NPC var35 = var21.npcs[var19];
							if (var35 == null) {
								break label413;
							}

							if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) {
								for (var32 = 0; var32 < var21.npcCount; ++var32) {
									var40 = var21.npcs[var21.npcIndices[var32]];
									if (var40 != null && var35 != var40 && var40.definition.size == 1 && var35.x == var40.x && var35.y == var40.y) {
										class153.addNpcToMenu(var40, var21.npcIndices[var32], var15, var17, var20);
									}
								}

								var32 = var21.playerUpdateManager.playerCount;
								var41 = var21.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var32; ++var26) {
									var33 = var21.players[var41[var26]];
									if (var33 != null && var35.x == var33.x && var33.y == var35.y) {
										WorldMapData_1.addPlayerToMenu(var33, var41[var26], var15, var17, var20);
									}
								}
							}

							class153.addNpcToMenu(var35, var19, var15, var17, var20);
						}

						if (var18 == 0) {
							Player var36 = var21.players[var19];
							if (var36 == null) {
								break label413;
							}

							if ((var36.x & 127) == 64 && (var36.y & 127) == 64) {
								for (var32 = 0; var32 < var21.npcCount; ++var32) {
									var40 = var21.npcs[var21.npcIndices[var32]];
									if (var40 != null && var40.definition.size == 1 && var36.x == var40.x && var36.y == var40.y) {
										class153.addNpcToMenu(var40, var21.npcIndices[var32], var15, var17, var20);
									}
								}

								var32 = var21.playerUpdateManager.playerCount;
								var41 = var21.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var32; ++var26) {
									var33 = var21.players[var41[var26]];
									if (var33 != null && var36 != var33 && var33.x == var36.x && var33.y == var36.y) {
										WorldMapData_1.addPlayerToMenu(var33, var41[var26], var15, var17, var20);
									}
								}
							}

							if (var19 != Client.combatTargetPlayerIndex) {
								WorldMapData_1.addPlayerToMenu(var36, var19, var15, var17, var20);
							} else {
								var4 = var29;
								var6 = var20;
							}
						}

						if (var18 == 3) {
							NodeDeque var37 = var21.groundItems[var22][var15][var17];
							if (var37 != null) {
								for (TileItem var38 = (TileItem)var37.first(); var38 != null; var38 = (TileItem)var37.next()) {
									ItemComposition var42 = Player.ItemDefinition_get(var38.id);
									if (!ClientPreferences.field1299 && Client.isItemSelected == 1) {
										NpcOverrides.insertMenuItem("Use", Client.field659 + " " + "->" + " " + TransformationMatrix.colorStartTag(16748608) + var42.name, 16, var38.id, var15, var17, -1, false, var20);
									} else if (Client.isSpellSelected) {
										if (!ClientPreferences.field1299 && (UserComparator3.selectedSpellFlags & 1) == 1) {
											NpcOverrides.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + TransformationMatrix.colorStartTag(16748608) + var42.name, 17, var38.id, var15, var17, -1, false, var20);
										}
									} else {
										String[] var34 = var42.groundActions;

										for (int var43 = 4; var43 >= 0; --var43) {
											if (!ClientPreferences.field1299 && var38.method2843(var43)) {
												if (var34 != null && var34[var43] != null) {
													byte var28 = 0;
													if (var43 == 0) {
														var28 = 18;
													}

													if (var43 == 1) {
														var28 = 19;
													}

													if (var43 == 2) {
														var28 = 20;
													}

													if (var43 == 3) {
														var28 = 21;
													}

													if (var43 == 4) {
														var28 = 22;
													}

													NpcOverrides.insertMenuItem(var34[var43], TransformationMatrix.colorStartTag(16748608) + var42.name, var28, var38.id, var15, var17, -1, false, var20);
												} else if (var43 == 2) {
													NpcOverrides.insertMenuItem("Take", TransformationMatrix.colorStartTag(16748608) + var42.name, 20, var38.id, var15, var17, -1, false, var20);
												}
											}
										}

										NpcOverrides.insertMenuItem("Examine", TransformationMatrix.colorStartTag(16748608) + var42.name, 1004, var38.id, var15, var17, -1, false, var20);
									}
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}
}
