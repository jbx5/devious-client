import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class164 extends class150 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static GraphicsDefaults field1806;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 857948509
	)
	int field1805;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class164(class153 var1) {
		this.this$0 = var1;
		this.field1805 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1805 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3663(this.field1805);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-409841757"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class132.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2010817320"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		int var27;
		int var30;
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			int var4 = var0 - var2;
			int var5 = var1 - var3;
			int[] var6 = new int[Client.worldViewManager.method2671()];
			float[] var7 = new float[Client.worldViewManager.method2671()];
			int var8 = 0;

			for (Iterator var9 = Client.worldViewManager.iterator(); var9.hasNext(); ++var8) {
				WorldView var10 = (WorldView)var9.next();
				var6[var8] = var10.id;
				var7[var8] = var10.scene.field2686;
			}

			VarpDefinition.method3866(var7, var6);
			HashMap var59 = new HashMap();

			for (var8 = var6.length - 1; var8 >= 0; --var8) {
				if (var7[var8] > 0.0F) {
					class492 var60 = Client.worldViewManager.method2675(var6[var8]);
					if (!var59.containsKey(var60)) {
						var59.put(var60, var6[var8]);
					}
				}
			}

			for (var8 = 0; var8 < var6.length; ++var8) {
				var30 = var6[var8];
				class492 var11 = Client.worldViewManager.method2675(var30);
				Integer var12 = (Integer)var59.get(var11);
				if (var12 != null && var12.equals(var30)) {
					if (var11 == class492.field5089) {
						AsyncRestClient.insertMenuItem("Walk here", "", 23, 0, var4, var5, 0, false, var30);
					} else if (var11 == class492.field5094) {
						int var13 = ScriptFrame.getTileHeight(class198.topLevelWorldView, GameEngine.entity.getX(), GameEngine.entity.getY(), GameEngine.entity.getPlane());
						class426 var14 = LoginState.method1296((float)GameEngine.entity.getX(), (float)var13, (float)GameEngine.entity.getY());
						class426 var15 = class179.method3848(var13, AsyncHttpResponse.cameraX, FloorOverlayDefinition.cameraY, PlayerType.cameraZ);
						if (var15 != null) {
							class426 var17;
							synchronized(class426.field4768) {
								if (class426.field4770 == 0) {
									var17 = new class426(var15);
								} else {
									class426.field4768[--class426.field4770].method8169(var15);
									var17 = class426.field4768[class426.field4770];
								}
							}

							var17.method8196(var14);
							class426 var19 = class426.field4773;
							class426 var20;
							synchronized(class426.field4768) {
								if (class426.field4770 == 0) {
									var20 = new class426(var19);
								} else {
									class426.field4768[--class426.field4770].method8169(var19);
									var20 = class426.field4768[class426.field4770];
								}
							}

							var20.method8175(var17);
							class426 var22 = class426.field4767;
							float var31 = var20.method8176(var22);
							class426 var25 = class426.field4773;
							float var24 = var25.method8176(var17);
							float var26 = (float)Math.atan2((double)var31, (double)var24);
							var27 = Canvas.method330(var26);
							var27 += 64;
							var27 = (var27 & 2047) / 128;
							AsyncRestClient.insertMenuItem("Set heading", "", 60, var27, 0, 0, 0, false, var30);
							var17.method8168();
							var20.method8168();
							var15.method8168();
						}
					}
				}
			}
		}

		long var32 = -1L;
		int var34 = 0;
		long var35 = -1L;

		int var37;
		for (var37 = 0; var37 < class508.method9434(); ++var37) {
			long var38 = ViewportMouse.ViewportMouse_entityTags[var37];
			if (var38 != var35) {
				var35 = var38;
				int var42 = class178.method3845(var37);
				long var43 = ViewportMouse.ViewportMouse_entityTags[var37];
				int var45 = (int)(var43 >>> 7 & 127L);
				var45 = var45;
				int var47 = SwapSongTask.method8699(var37);
				int var48 = class309.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var37]);
				int var49 = var48;
				int var50 = WorldMapScaleHandler.method6396(var37);
				if (var50 == 2047) {
					var50 = -1;
				}

				WorldEntity var21 = null;
				WorldView var62 = null;
				if (var50 >= 0 && class198.topLevelWorldView.worldEntities[var50] != null) {
					var21 = class198.topLevelWorldView.worldEntities[var50];
					var62 = var21.worldView;
				} else if (var50 == -1) {
					var21 = null;
					var62 = class198.topLevelWorldView;
				}

				if (var62 != null) {
					int var23 = HealthBarDefinition.method3951(var50, var21, var62);
					if (var23 != -1) {
						if (var47 == 2 && var62.scene.getObjectFlags(var23, var42, var45, var38) >= 0) {
							ObjectComposition var51 = UrlRequest.getObjectDefinition(var48);
							if (var51.transforms != null) {
								var51 = var51.transform();
							}

							if (var51 == null) {
								continue;
							}

							PendingSpawn var63 = null;

							for (PendingSpawn var52 = (PendingSpawn)var62.pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)var62.pendingSpawns.previous()) {
								if (var23 == var52.plane && var42 == var52.x && var45 == var52.y && var49 == var52.field1200) {
									var63 = var52;
									break;
								}
							}

							if (!class149.field1696 && Client.isItemSelected == 1) {
								AsyncRestClient.insertMenuItem("Use", Client.field659 + " " + "->" + " " + class204.colorStartTag(65535) + var51.name, 1, var49, var42, var45, -1, false, var50);
							} else if (Client.isSpellSelected) {
								if (!class149.field1696 && (class373.selectedSpellFlags & 4) == 4) {
									AsyncRestClient.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class204.colorStartTag(65535) + var51.name, 2, var49, var42, var45, -1, false, var50);
								}
							} else {
								String[] var69 = var51.actions;
								if (var69 != null) {
									for (var27 = 4; var27 >= 0; --var27) {
										if (!class149.field1696 && (var63 == null || var63.method2704(var27)) && var69[var27] != null) {
											short var28 = 0;
											if (var27 == 0) {
												var28 = 3;
											}

											if (var27 == 1) {
												var28 = 4;
											}

											if (var27 == 2) {
												var28 = 5;
											}

											if (var27 == 3) {
												var28 = 6;
											}

											if (var27 == 4) {
												var28 = 1001;
											}

											AsyncRestClient.insertMenuItem(var69[var27], class204.colorStartTag(65535) + var51.name, var28, var49, var42, var45, -1, false, var50);
										}
									}
								}

								AsyncRestClient.insertMenuItem("Examine", class204.colorStartTag(65535) + var51.name, 1002, var51.id, var42, var45, -1, false, var50);
							}
						}

						int var53;
						Player var54;
						NPC var70;
						int[] var71;
						if (var47 == 1) {
							NPC var66 = var62.npcs[var49];
							if (var66 == null) {
								continue;
							}

							if (var66.definition.size == 1 && (var66.x & 127) == 64 && (var66.y & 127) == 64) {
								for (var53 = 0; var53 < var62.npcCount; ++var53) {
									var70 = var62.npcs[var62.npcIndices[var53]];
									if (var70 != null && var70 != var66 && var70.definition.size == 1 && var70.x == var66.x && var70.y == var66.y) {
										NPCComposition.addNpcToMenu(var70, var62.npcIndices[var53], var42, var45, var50);
									}
								}

								var53 = Client.playerUpdateManager.playerCount;
								var71 = Client.playerUpdateManager.playerIndices;

								for (var27 = 0; var27 < var53; ++var27) {
									var54 = var62.players[var71[var27]];
									if (var54 != null && var54.x == var66.x && var54.y == var66.y) {
										UserComparator6.addPlayerToMenu(var54, var71[var27], var42, var45, var50);
									}
								}
							}

							NPCComposition.addNpcToMenu(var66, var49, var42, var45, var50);
						}

						if (var47 == 0) {
							Player var67 = var62.players[var49];
							if (var67 == null) {
								continue;
							}

							if ((var67.x & 127) == 64 && (var67.y & 127) == 64) {
								for (var53 = 0; var53 < var62.npcCount; ++var53) {
									var70 = var62.npcs[var62.npcIndices[var53]];
									if (var70 != null && var70.definition.size == 1 && var67.x == var70.x && var70.y == var67.y) {
										NPCComposition.addNpcToMenu(var70, var62.npcIndices[var53], var42, var45, var50);
									}
								}

								var53 = Client.playerUpdateManager.playerCount;
								var71 = Client.playerUpdateManager.playerIndices;

								for (var27 = 0; var27 < var53; ++var27) {
									var54 = var62.players[var71[var27]];
									if (var54 != null && var67 != var54 && var54.x == var67.x && var54.y == var67.y) {
										UserComparator6.addPlayerToMenu(var54, var71[var27], var42, var45, var50);
									}
								}
							}

							if (var49 != Client.combatTargetPlayerIndex) {
								UserComparator6.addPlayerToMenu(var67, var49, var42, var45, var50);
							} else {
								var32 = var38;
								var34 = var50;
							}
						}

						if (var47 == 3) {
							NodeDeque var68 = var62.groundItems[var23][var42][var45];
							if (var68 != null) {
								for (TileItem var64 = (TileItem)var68.first(); var64 != null; var64 = (TileItem)var68.next()) {
									ItemComposition var72 = Bounds.ItemDefinition_get(var64.id);
									if (!AbstractWorldMapData.field3216 && Client.isItemSelected == 1) {
										AsyncRestClient.insertMenuItem("Use", Client.field659 + " " + "->" + " " + class204.colorStartTag(16748608) + var72.name, 16, var64.id, var42, var45, -1, false, var50);
									} else if (Client.isSpellSelected) {
										if (!AbstractWorldMapData.field3216 && (class373.selectedSpellFlags & 1) == 1) {
											AsyncRestClient.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class204.colorStartTag(16748608) + var72.name, 17, var64.id, var42, var45, -1, false, var50);
										}
									} else {
										String[] var55 = var72.groundActions;

										for (int var65 = 4; var65 >= 0; --var65) {
											if (!AbstractWorldMapData.field3216 && var64.method3055(var65)) {
												if (var55 != null && var55[var65] != null) {
													byte var29 = 0;
													if (var65 == 0) {
														var29 = 18;
													}

													if (var65 == 1) {
														var29 = 19;
													}

													if (var65 == 2) {
														var29 = 20;
													}

													if (var65 == 3) {
														var29 = 21;
													}

													if (var65 == 4) {
														var29 = 22;
													}

													AsyncRestClient.insertMenuItem(var55[var65], class204.colorStartTag(16748608) + var72.name, var29, var64.id, var42, var45, -1, false, var50);
												} else if (var65 == 2) {
													AsyncRestClient.insertMenuItem("Take", class204.colorStartTag(16748608) + var72.name, 20, var64.id, var42, var45, -1, false, var50);
												}
											}
										}

										AsyncRestClient.insertMenuItem("Examine", class204.colorStartTag(16748608) + var72.name, 1004, var64.id, var42, var45, -1, false, var50);
									}
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var32) {
			var37 = AuthenticationScheme.method3355(var32);
			var30 = (int)(var32 >>> 7 & 127L);
			Player var61 = class198.topLevelWorldView.players[Client.combatTargetPlayerIndex];
			UserComparator6.addPlayerToMenu(var61, Client.combatTargetPlayerIndex, var37, var30, var34);
		}

	}
}
