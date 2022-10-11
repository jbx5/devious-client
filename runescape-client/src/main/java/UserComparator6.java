import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1314803357
	)
	static int field1398;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)I",
		garbageValue = "-215269810"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-463932256"
	)
	public static float method2792(int var0) {
		var0 &= 16383; // L: 24
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D); // L: 25
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "73"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9407
			class135.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9408
		}

		long var4 = -1L; // L: 9411
		long var6 = -1L; // L: 9412
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 9417
			if (var8 >= var10) { // L: 9419
				if (-1L != var4) { // L: 9552
					var8 = (int)(var4 >>> 0 & 127L); // L: 9555
					var10 = MilliClock.method3477(var4); // L: 9558
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9559
					class155.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9560
				}

				return; // L: 9562
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9422
			if (var6 != var27) { // L: 9425
				label328: {
					var6 = var27; // L: 9426
					int var15 = class145.method3226(var8); // L: 9427
					int var16 = MilliClock.method3477(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9430
					int var17 = var16; // L: 9432
					int var18 = class17.method271(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9435
					int var20 = EnumComposition.method3627(var8); // L: 9438
					if (var18 == 2 && MusicPatchNode.scene.getObjectFlags(Tiles.Client_plane, var15, var16, var27) >= 0) { // L: 9439 9440
						ObjectComposition var21 = PlayerComposition.getObjectDefinition(var20); // L: 9441
						if (var21.transforms != null) { // L: 9442
							var21 = var21.transform();
						}

						if (var21 == null) { // L: 9443
							break label328;
						}

						if (Client.isItemSelected == 1) { // L: 9444
							class135.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SoundCache.colorStartTag(65535) + var21.name, 1, var20, var15, var16); // L: 9445
						} else if (Client.isSpellSelected) { // L: 9448
							if ((UrlRequest.selectedSpellFlags & 4) == 4) { // L: 9449
								class135.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SoundCache.colorStartTag(65535) + var21.name, 2, var20, var15, var16); // L: 9450
							}
						} else {
							String[] var22 = var21.actions; // L: 9455
							if (var22 != null) { // L: 9456
								for (int var23 = 4; var23 >= 0; --var23) { // L: 9457
									if (var22[var23] != null) { // L: 9458
										short var24 = 0; // L: 9459
										if (var23 == 0) { // L: 9460
											var24 = 3;
										}

										if (var23 == 1) { // L: 9461
											var24 = 4;
										}

										if (var23 == 2) { // L: 9462
											var24 = 5;
										}

										if (var23 == 3) { // L: 9463
											var24 = 6;
										}

										if (var23 == 4) { // L: 9464
											var24 = 1001;
										}

										class135.insertMenuItemNoShift(var22[var23], SoundCache.colorStartTag(65535) + var21.name, var24, var20, var15, var17); // L: 9465
									}
								}
							}

							class135.insertMenuItemNoShift("Examine", SoundCache.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var17); // L: 9470
						}
					}

					Player var25;
					int var29;
					NPC var30;
					int var37;
					int[] var38;
					if (var18 == 1) { // L: 9475
						NPC var33 = Client.npcs[var20]; // L: 9476
						if (var33 == null) { // L: 9477
							break label328;
						}

						if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 9478
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9479
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9480
								if (var30 != null && var33 != var30 && var30.definition.size == 1 && var33.x == var30.x && var30.y == var33.y) { // L: 9481
									class119.addNpcToMenu(var30, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 9483
							var38 = Players.Players_indices; // L: 9484

							for (var37 = 0; var37 < var29; ++var37) { // L: 9485
								var25 = Client.players[var38[var37]]; // L: 9486
								if (var25 != null && var33.x == var25.x && var33.y == var25.y) { // L: 9487
									class155.addPlayerToMenu(var25, var38[var37], var15, var17);
								}
							}
						}

						class119.addNpcToMenu(var33, var20, var15, var17); // L: 9490
					}

					if (var18 == 0) { // L: 9492
						Player var34 = Client.players[var20]; // L: 9493
						if (var34 == null) { // L: 9494
							break label328;
						}

						if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 9495
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9496
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9497
								if (var30 != null && var30.definition.size == 1 && var34.x == var30.x && var30.y == var34.y) { // L: 9498
									class119.addNpcToMenu(var30, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 9500
							var38 = Players.Players_indices; // L: 9501

							for (var37 = 0; var37 < var29; ++var37) { // L: 9502
								var25 = Client.players[var38[var37]]; // L: 9503
								if (var25 != null && var25 != var34 && var34.x == var25.x && var25.y == var34.y) { // L: 9504
									class155.addPlayerToMenu(var25, var38[var37], var15, var17);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) { // L: 9507
							class155.addPlayerToMenu(var34, var20, var15, var17);
						} else {
							var4 = var27; // L: 9508
						}
					}

					if (var18 == 3) { // L: 9510
						NodeDeque var36 = Client.groundItems[Tiles.Client_plane][var15][var17]; // L: 9511
						if (var36 != null) { // L: 9512
							for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.next()) { // L: 9513 9514 9547
								ItemComposition var39 = UserComparator3.ItemDefinition_get(var35.id); // L: 9515
								if (Client.isItemSelected == 1) { // L: 9516
									class135.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SoundCache.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var17); // L: 9517
								} else if (Client.isSpellSelected) { // L: 9520
									if ((UrlRequest.selectedSpellFlags & 1) == 1) { // L: 9521
										class135.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SoundCache.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var17); // L: 9522
									}
								} else {
									String[] var31 = var39.groundActions; // L: 9527

									for (int var32 = 4; var32 >= 0; --var32) { // L: 9528
										if (var31 != null && var31[var32] != null) { // L: 9529
											byte var26 = 0; // L: 9530
											if (var32 == 0) { // L: 9531
												var26 = 18;
											}

											if (var32 == 1) { // L: 9532
												var26 = 19;
											}

											if (var32 == 2) { // L: 9533
												var26 = 20;
											}

											if (var32 == 3) { // L: 9534
												var26 = 21;
											}

											if (var32 == 4) { // L: 9535
												var26 = 22;
											}

											class135.insertMenuItemNoShift(var31[var32], SoundCache.colorStartTag(16748608) + var39.name, var26, var35.id, var15, var17); // L: 9536
										} else if (var32 == 2) { // L: 9539
											class135.insertMenuItemNoShift("Take", SoundCache.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var17); // L: 9540
										}
									}

									class135.insertMenuItemNoShift("Examine", SoundCache.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var17); // L: 9544
								}
							}
						}
					}
				}
			}

			++var8; // L: 9413
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1874215636"
	)
	static boolean method2800(int var0) {
		for (int var1 = 0; var1 < Client.field529; ++var1) { // L: 11315
			if (Client.field749[var1] == var0) { // L: 11316
				return true;
			}
		}

		return false; // L: 11318
	}
}
