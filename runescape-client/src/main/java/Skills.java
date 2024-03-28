import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ah")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("af")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1695955385"
	)
	static int method6858(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field876 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-9"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			Interpreter.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (-1L != var4) {
					var8 = class7.method60(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					class216.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var26 != var6) {
				label366: {
					var6 = var26;
					int var15 = class211.method3933(var8);
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var17 = (int)(var18 >>> 7 & 127L);
					var17 = var17;
					int var28 = Players.method2714(var8);
					int var19 = class225.method4276(var8);
					int var23;
					if (var28 == 2 && LoginType.scene.getObjectFlags(class172.Client_plane, var15, var17, var26) >= 0) {
						ObjectComposition var20 = MouseRecorder.getObjectDefinition(var19);
						if (var20.transforms != null) {
							var20 = var20.transform();
						}

						if (var20 == null) {
							break label366;
						}

						PendingSpawn var21 = null;

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
							if (var22.plane == class172.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1198) {
								var21 = var22;
								break;
							}
						}

						if (Client.isItemSelected == 1) {
							Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(65535) + var20.name, 1, var19, var15, var17);
						} else if (Client.isSpellSelected) {
							if ((class352.selectedSpellFlags & 4) == 4) {
								Interpreter.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(65535) + var20.name, 2, var19, var15, var17);
							}
						} else {
							String[] var36 = var20.actions;
							if (var36 != null) {
								for (var23 = 4; var23 >= 0; --var23) {
									if ((var21 == null || var21.method2391(var23)) && var36[var23] != null) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}

										if (var23 == 1) {
											var24 = 4;
										}

										if (var23 == 2) {
											var24 = 5;
										}

										if (var23 == 3) {
											var24 = 6;
										}

										if (var23 == 4) {
											var24 = 1001;
										}

										Interpreter.insertMenuItemNoShift(var36[var23], Decimator.colorStartTag(65535) + var20.name, var24, var19, var15, var17);
									}
								}
							}

							Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17);
						}
					}

					int var29;
					Player var30;
					NPC var37;
					int[] var38;
					if (var28 == 1) {
						NPC var32 = Client.npcs[var19];
						if (var32 == null) {
							break label366;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var37 = Client.npcs[Client.npcIndices[var29]];
								if (var37 != null && var37 != var32 && var37.definition.size == 1 && var32.x == var37.x && var37.y == var32.y) {
									class60.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var23 = 0; var23 < var29; ++var23) {
								var30 = Client.players[var38[var23]];
								if (var30 != null && var32.x == var30.x && var30.y == var32.y) {
									class216.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						class60.addNpcToMenu(var32, var19, var15, var17);
					}

					if (var28 == 0) {
						Player var33 = Client.players[var19];
						if (var33 == null) {
							break label366;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var37 = Client.npcs[Client.npcIndices[var29]];
								if (var37 != null && var37.definition.size == 1 && var33.x == var37.x && var33.y == var37.y) {
									class60.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var23 = 0; var23 < var29; ++var23) {
								var30 = Client.players[var38[var23]];
								if (var30 != null && var30 != var33 && var33.x == var30.x && var33.y == var30.y) {
									class216.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) {
							class216.addPlayerToMenu(var33, var19, var15, var17);
						} else {
							var4 = var26;
						}
					}

					if (var28 == 3) {
						NodeDeque var34 = Client.groundItems[class172.Client_plane][var15][var17];
						if (var34 != null) {
							for (TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) {
								ItemComposition var39 = HttpRequest.ItemDefinition_get(var35.id);
								if (Client.isItemSelected == 1) {
									Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var17);
								} else if (Client.isSpellSelected) {
									if ((class352.selectedSpellFlags & 1) == 1) {
										Interpreter.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var17);
									}
								} else {
									String[] var31 = var39.groundActions;

									for (int var40 = 4; var40 >= 0; --var40) {
										if (var35.method2690(var40)) {
											if (var31 != null && var31[var40] != null) {
												byte var25 = 0;
												if (var40 == 0) {
													var25 = 18;
												}

												if (var40 == 1) {
													var25 = 19;
												}

												if (var40 == 2) {
													var25 = 20;
												}

												if (var40 == 3) {
													var25 = 21;
												}

												if (var40 == 4) {
													var25 = 22;
												}

												Interpreter.insertMenuItemNoShift(var31[var40], Decimator.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var17);
											} else if (var40 == 2) {
												Interpreter.insertMenuItemNoShift("Take", Decimator.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var17);
											}
										}
									}

									Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var17);
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
