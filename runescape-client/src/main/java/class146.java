import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class146 extends class147 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2127864729
	)
	int field1688;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class146(class150 var1) {
		this.this$0 = var1;
		this.field1688 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1688 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3326(this.field1688);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	static void method3220() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2116780194"
	)
	public static void method3226(int var0, int var1, int var2, int var3) {
		class329.musicPlayerStatus = var0;
		class329.field3584 = var1;
		class329.field3585 = var2;
		class329.field3580 = var3;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1385627384"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			KeyHandler.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;

		int var9;
		for (var9 = 0; var9 < VarcInt.method3871(); ++var9) {
			long var31 = ViewportMouse.ViewportMouse_entityTags[var9];
			if (var7 != var31) {
				var7 = var31;
				long var16 = ViewportMouse.ViewportMouse_entityTags[var9];
				int var15 = (int)(var16 >>> 0 & 127L);
				var15 = var15;
				int var35 = WorldMapScaleHandler.method6094(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var17 = var35;
				int var18 = class109.method2774(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var20 = class105.method2748(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var21 = var20;
				int var22 = class294.method5940(var9);
				if (var22 == 2047) {
					var22 = -1;
				}

				class101 var23 = null;
				if (var22 >= 0 && class358.scene.field1347[var22] != null) {
					var23 = class358.scene.field1347[var22].field4947;
				} else if (var22 == -1) {
					var23 = class358.scene;
				}

				if (var23 != null) {
					int var24 = var23.field1348;
					int var28;
					if (var18 == 2 && var23.field1331.getObjectFlags(var24, var15, var35, var31) >= 0) {
						ObjectComposition var25 = HitSplatDefinition.getObjectDefinition(var20);
						if (var25.transforms != null) {
							var25 = var25.transform();
						}

						if (var25 == null) {
							continue;
						}

						PendingSpawn var26 = null;

						for (PendingSpawn var27 = (PendingSpawn)var23.field1342.last(); var27 != null; var27 = (PendingSpawn)var23.field1342.previous()) {
							if (var24 == var27.field1200 && var15 == var27.field1192 && var17 == var27.field1196 && var21 == var27.field1193) {
								var26 = var27;
								break;
							}
						}

						if (Client.isItemSelected == 1) {
							class194.method3796("Use", Client.field545 + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(65535) + var25.name, 1, var21, var15, var17, -1, false, var22);
						} else if (Client.isSpellSelected) {
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 4) == 4) {
								class194.method3796(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(65535) + var25.name, 2, var21, var15, var17, -1, false, var22);
							}
						} else {
							String[] var43 = var25.actions;
							if (var43 != null) {
								for (var28 = 4; var28 >= 0; --var28) {
									if ((var26 == null || var26.method2415(var28)) && var43[var28] != null) {
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

										class194.method3796(var43[var28], HttpAuthenticationHeader.colorStartTag(65535) + var25.name, var29, var21, var15, var17, -1, false, var22);
									}
								}
							}

							class194.method3796("Examine", HttpAuthenticationHeader.colorStartTag(65535) + var25.name, 1002, var25.id, var15, var17, -1, false, var22);
						}
					}

					int var36;
					Player var37;
					class103 var44;
					int[] var45;
					if (var18 == 1) {
						class103 var39 = var23.field1343[var21];
						if (var39 == null) {
							continue;
						}

						if (var39.field1359.size == 1 && (var39.x & 127) == 64 && (var39.y & 127) == 64) {
							for (var36 = 0; var36 < var23.field1344; ++var36) {
								var44 = var23.field1343[var23.field1345[var36]];
								if (var44 != null && var39 != var44 && var44.field1359.size == 1 && var44.x == var39.x && var39.y == var44.y) {
									class4.method16(var44, var23.field1345[var36], var15, var17, var22);
								}
							}

							var36 = var23.field1336.field1415;
							var45 = var23.field1336.field1416;

							for (var28 = 0; var28 < var36; ++var28) {
								var37 = var23.field1341[var45[var28]];
								if (var37 != null && var39.x == var37.x && var37.y == var39.y) {
									class28.method423(var37, var45[var28], var15, var17, var22);
								}
							}
						}

						class4.method16(var39, var21, var15, var17, var22);
					}

					if (var18 == 0) {
						Player var40 = var23.field1341[var21];
						if (var40 == null) {
							continue;
						}

						if ((var40.x & 127) == 64 && (var40.y & 127) == 64) {
							for (var36 = 0; var36 < var23.field1344; ++var36) {
								var44 = var23.field1343[var23.field1345[var36]];
								if (var44 != null && var44.field1359.size == 1 && var44.x == var40.x && var44.y == var40.y) {
									class4.method16(var44, var23.field1345[var36], var15, var17, var22);
								}
							}

							var36 = var23.field1336.field1415;
							var45 = var23.field1336.field1416;

							for (var28 = 0; var28 < var36; ++var28) {
								var37 = var23.field1341[var45[var28]];
								if (var37 != null && var37 != var40 && var40.x == var37.x && var40.y == var37.y) {
									class28.method423(var37, var45[var28], var15, var17, var22);
								}
							}
						}

						if (var21 != Client.combatTargetPlayerIndex) {
							class28.method423(var40, var21, var15, var17, var22);
						} else {
							var4 = var31;
							var6 = var22;
						}
					}

					if (var18 == 3) {
						NodeDeque var41 = var23.field1349[var24][var15][var17];
						if (var41 != null) {
							for (TileItem var42 = (TileItem)var41.first(); var42 != null; var42 = (TileItem)var41.next()) {
								ItemComposition var46 = KeyHandler.ItemDefinition_get(var42.id);
								if (Client.isItemSelected == 1) {
									class194.method3796("Use", Client.field545 + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16748608) + var46.name, 16, var42.id, var15, var17, -1, false, var22);
								} else if (Client.isSpellSelected) {
									if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 1) == 1) {
										class194.method3796(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16748608) + var46.name, 17, var42.id, var15, var17, -1, false, var22);
									}
								} else {
									String[] var38 = var46.groundActions;

									for (int var47 = 4; var47 >= 0; --var47) {
										if (var42.method2759(var47)) {
											if (var38 != null && var38[var47] != null) {
												byte var30 = 0;
												if (var47 == 0) {
													var30 = 18;
												}

												if (var47 == 1) {
													var30 = 19;
												}

												if (var47 == 2) {
													var30 = 20;
												}

												if (var47 == 3) {
													var30 = 21;
												}

												if (var47 == 4) {
													var30 = 22;
												}

												class194.method3796(var38[var47], HttpAuthenticationHeader.colorStartTag(16748608) + var46.name, var30, var42.id, var15, var17, -1, false, var22);
											} else if (var47 == 2) {
												class194.method3796("Take", HttpAuthenticationHeader.colorStartTag(16748608) + var46.name, 20, var42.id, var15, var17, -1, false, var22);
											}
										}
									}

									class194.method3796("Examine", HttpAuthenticationHeader.colorStartTag(16748608) + var46.name, 1004, var42.id, var15, var17, -1, false, var22);
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var9 = (int)(var4 >>> 0 & 127L);
			int var11 = WorldMapScaleHandler.method6094(var4);
			Player var12 = class358.scene.field1341[Client.combatTargetPlayerIndex];
			class28.method423(var12, Client.combatTargetPlayerIndex, var9, var11, var6);
		}

	}
}
