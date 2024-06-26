import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1059193651
	)
	static int field4583;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;B)I",
		garbageValue = "4"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "114"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			UrlRequester.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (var4 != -1L) {
					var9 = PacketWriter.method2920(var4);
					int var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = class511.topLevelWorldView.players[Client.combatTargetPlayerIndex];
					DynamicObject.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var10, var6);
				}

				return;
			}

			long var31 = ViewportMouse.ViewportMouse_entityTags[var9];
			if (var7 != var31) {
				var7 = var31;
				int var16 = PacketWriter.method2920(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var17 = var16;
				int var18 = WorldMapDecorationType.method7062(var9);
				long var21 = ViewportMouse.ViewportMouse_entityTags[var9];
				int var20 = (int)(var21 >>> 14 & 3L);
				int var33 = class147.method3268(var9);
				int var22 = class132.method3073(var9);
				if (var22 == 2047) {
					var22 = -1;
				}

				WorldView var23 = null;
				if (var22 >= 0 && class511.topLevelWorldView.worldEntities[var22] != null) {
					var23 = class511.topLevelWorldView.worldEntities[var22].worldView;
				} else if (var22 == -1) {
					var23 = class511.topLevelWorldView;
				}

				if (var23 != null) {
					label410: {
						int var24 = var23.plane;
						int var28;
						if (var20 == 2 && var23.scene.getObjectFlags(var24, var16, var18, var31) >= 0) {
							ObjectComposition var25 = HttpRequest.getObjectDefinition(var33);
							if (var25.transforms != null) {
								var25 = var25.transform();
							}

							if (var25 == null) {
								break label410;
							}

							PendingSpawn var26 = null;

							for (PendingSpawn var27 = (PendingSpawn)var23.pendingSpawns.last(); var27 != null; var27 = (PendingSpawn)var23.pendingSpawns.previous()) {
								if (var24 == var27.plane && var17 == var27.x && var18 == var27.y && var33 == var27.field1175) {
									var26 = var27;
									break;
								}
							}

							if (!class414.field4670 && Client.isItemSelected == 1) {
								WorldMapArea.insertMenuItem("Use", Client.field642 + " " + "->" + " " + NpcOverrides.colorStartTag(65535) + var25.name, 1, var33, var17, var18, -1, false, var22);
							} else if (Client.isSpellSelected) {
								if (!class414.field4670 && (class92.selectedSpellFlags & 4) == 4) {
									WorldMapArea.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + NpcOverrides.colorStartTag(65535) + var25.name, 2, var33, var17, var18, -1, false, var22);
								}
							} else {
								String[] var41 = var25.actions;
								if (var41 != null) {
									for (var28 = 4; var28 >= 0; --var28) {
										if (!class414.field4670 && (var26 == null || var26.method2469(var28)) && var41[var28] != null) {
											short var29 = 0;
											if (var28 == 0) {
												var29 = 3;
											}

											if (var28 == 1) {
												var29 = 4;
											}

											if (var28 == 2) {
												var29 = 5;
											}

											if (var28 == 3) {
												var29 = 6;
											}

											if (var28 == 4) {
												var29 = 1001;
											}

											WorldMapArea.insertMenuItem(var41[var28], NpcOverrides.colorStartTag(65535) + var25.name, var29, var33, var17, var18, -1, false, var22);
										}
									}
								}

								WorldMapArea.insertMenuItem("Examine", NpcOverrides.colorStartTag(65535) + var25.name, 1002, var25.id, var17, var18, -1, false, var22);
							}
						}

						int var34;
						Player var35;
						NPC var42;
						int[] var43;
						if (var20 == 1) {
							NPC var37 = var23.npcs[var33];
							if (var37 == null) {
								break label410;
							}

							if (var37.definition.size == 1 && (var37.x & 127) == 64 && (var37.y & 127) == 64) {
								for (var34 = 0; var34 < var23.npcCount; ++var34) {
									var42 = var23.npcs[var23.npcIndices[var34]];
									if (var42 != null && var42 != var37 && var42.definition.size == 1 && var42.x == var37.x && var42.y == var37.y) {
										class261.addNpcToMenu(var42, var23.npcIndices[var34], var17, var18, var22);
									}
								}

								var34 = var23.playerUpdateManager.playerCount;
								var43 = var23.playerUpdateManager.playerIndices;

								for (var28 = 0; var28 < var34; ++var28) {
									var35 = var23.players[var43[var28]];
									if (var35 != null && var37.x == var35.x && var37.y == var35.y) {
										DynamicObject.addPlayerToMenu(var35, var43[var28], var17, var18, var22);
									}
								}
							}

							class261.addNpcToMenu(var37, var33, var17, var18, var22);
						}

						if (var20 == 0) {
							Player var38 = var23.players[var33];
							if (var38 == null) {
								break label410;
							}

							if ((var38.x & 127) == 64 && (var38.y & 127) == 64) {
								for (var34 = 0; var34 < var23.npcCount; ++var34) {
									var42 = var23.npcs[var23.npcIndices[var34]];
									if (var42 != null && var42.definition.size == 1 && var38.x == var42.x && var38.y == var42.y) {
										class261.addNpcToMenu(var42, var23.npcIndices[var34], var17, var18, var22);
									}
								}

								var34 = var23.playerUpdateManager.playerCount;
								var43 = var23.playerUpdateManager.playerIndices;

								for (var28 = 0; var28 < var34; ++var28) {
									var35 = var23.players[var43[var28]];
									if (var35 != null && var35 != var38 && var35.x == var38.x && var35.y == var38.y) {
										DynamicObject.addPlayerToMenu(var35, var43[var28], var17, var18, var22);
									}
								}
							}

							if (var33 != Client.combatTargetPlayerIndex) {
								DynamicObject.addPlayerToMenu(var38, var33, var17, var18, var22);
							} else {
								var4 = var31;
								var6 = var22;
							}
						}

						if (var20 == 3) {
							NodeDeque var39 = var23.groundItems[var24][var17][var18];
							if (var39 != null) {
								for (TileItem var40 = (TileItem)var39.first(); var40 != null; var40 = (TileItem)var39.next()) {
									ItemComposition var44 = class164.ItemDefinition_get(var40.id);
									if (!class152.field1724 && Client.isItemSelected == 1) {
										WorldMapArea.insertMenuItem("Use", Client.field642 + " " + "->" + " " + NpcOverrides.colorStartTag(16748608) + var44.name, 16, var40.id, var17, var18, -1, false, var22);
									} else if (Client.isSpellSelected) {
										if (!class152.field1724 && (class92.selectedSpellFlags & 1) == 1) {
											WorldMapArea.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + NpcOverrides.colorStartTag(16748608) + var44.name, 17, var40.id, var17, var18, -1, false, var22);
										}
									} else {
										String[] var36 = var44.groundActions;

										for (int var45 = 4; var45 >= 0; --var45) {
											if (!class152.field1724 && var40.method2799(var45)) {
												if (var36 != null && var36[var45] != null) {
													byte var30 = 0;
													if (var45 == 0) {
														var30 = 18;
													}

													if (var45 == 1) {
														var30 = 19;
													}

													if (var45 == 2) {
														var30 = 20;
													}

													if (var45 == 3) {
														var30 = 21;
													}

													if (var45 == 4) {
														var30 = 22;
													}

													WorldMapArea.insertMenuItem(var36[var45], NpcOverrides.colorStartTag(16748608) + var44.name, var30, var40.id, var17, var18, -1, false, var22);
												} else if (var45 == 2) {
													WorldMapArea.insertMenuItem("Take", NpcOverrides.colorStartTag(16748608) + var44.name, 20, var40.id, var17, var18, -1, false, var22);
												}
											}
										}

										WorldMapArea.insertMenuItem("Examine", NpcOverrides.colorStartTag(16748608) + var44.name, 1004, var40.id, var17, var18, -1, false, var22);
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
