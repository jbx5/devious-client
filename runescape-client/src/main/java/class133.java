import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class133 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1580;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1569;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1579;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1568;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1573;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1570;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1566;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1572;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1574;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1567;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1575;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1576;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1577;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1578;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1571;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1565;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1581;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1182447887
	)
	final int field1582;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 147537431
	)
	final int field1583;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 467810155
	)
	final int field1584;

	static {
		field1580 = new class133(0, 0, (String)null, -1, -1);
		field1569 = new class133(1, 1, (String)null, 0, 2);
		field1579 = new class133(2, 2, (String)null, 1, 2);
		field1568 = new class133(3, 3, (String)null, 2, 2);
		field1573 = new class133(4, 4, (String)null, 3, 1);
		field1570 = new class133(5, 5, (String)null, 4, 1);
		field1566 = new class133(6, 6, (String)null, 5, 1);
		field1572 = new class133(7, 7, (String)null, 6, 3);
		field1574 = new class133(8, 8, (String)null, 7, 3);
		field1567 = new class133(9, 9, (String)null, 8, 3);
		field1575 = new class133(10, 10, (String)null, 0, 7);
		field1576 = new class133(11, 11, (String)null, 1, 7);
		field1577 = new class133(12, 12, (String)null, 2, 7);
		field1578 = new class133(13, 13, (String)null, 3, 7);
		field1571 = new class133(14, 14, (String)null, 4, 7);
		field1565 = new class133(15, 15, (String)null, 5, 7);
		field1581 = new class133(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class133(int var1, int var2, String var3, int var4, int var5) {
		this.field1582 = var1;
		this.field1583 = var2;
		this.field1584 = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "121"
	)
	int method3131() {
		return this.field1584;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1583;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1598969675"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return WorldMapEvent.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "949600783"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != SecureUrlRequester.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (0L != var8) {
				var13 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var2, var3, var8);
				int var15 = class167.Entity_unpackID(var8);
				int var16 = var13 & 31;
				int var17 = var13 >> 6 & 3;
				var14 = class137.getObjectDefinition(var15);
				class351.method6891(var0, var2, var3, var14, var17);
				if (var1 == 0) {
					GrandExchangeOfferOwnWorldComparator.scene.removeBoundaryObject(var0, var2, var3);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4464(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) {
					GrandExchangeOfferOwnWorldComparator.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					GrandExchangeOfferOwnWorldComparator.scene.removeGameObject(var0, var2, var3);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) {
					GrandExchangeOfferOwnWorldComparator.scene.removeFloorDecoration(var0, var2, var3);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4473(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				Canvas.method332(var0, var13, var2, var3, var4, var5, var6, var7, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps[var0]);
				var14 = class137.getObjectDefinition(var4);
				if (var14 != null && var14.hasSound()) {
					class7.createObjectSound(var13, var2, var3, var14, var5);
				}
			}
		}

	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIII)V",
		garbageValue = "-1073338737"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if (!var4.isFollower || Client.followerIndex == var1) {
						String var5 = var0.method2688();
						int var6;
						if (var4.combatLevel != 0 && var0.field1192 != 0) {
							var6 = var0.field1192 != -1 ? var0.field1192 : var4.combatLevel;
							var5 = var5 + MusicPatchNode2.method6038(var6, KeyHandler.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class60.selectedSpellFlags & 2) == 2) {
								class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class208.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var8;
							int var9;
							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2659(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var8 == 0) {
											var9 = var6 + 9;
										}

										if (var8 == 1) {
											var9 = var6 + 10;
										}

										if (var8 == 2) {
											var9 = var6 + 11;
										}

										if (var8 == 3) {
											var9 = var6 + 12;
										}

										if (var8 == 4) {
											var9 = var6 + 13;
										}

										class385.insertMenuItemNoShift(var7[var8], class208.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2659(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
										short var10 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > KeyHandler.localPlayer.combatLevel) {
												var10 = 2000;
											}

											var9 = 0;
											if (var8 == 0) {
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10;
											}

											if (var8 == 2) {
												var9 = var10 + 11;
											}

											if (var8 == 3) {
												var9 = var10 + 12;
											}

											if (var8 == 4) {
												var9 = var10 + 13;
											}

											class385.insertMenuItemNoShift(var7[var8], class208.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
