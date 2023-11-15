import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ap")
	public static short[] field2440;
	@ObfuscatedName("as")
	static int[] field2441;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 38132727
	)
	final int field2437;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1290743797
	)
	final int field2438;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 25588645
	)
	final int field2436;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2437 = var1;
		this.field2438 = var2;
		this.field2436 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-28"
	)
	boolean method4486(float var1) {
		return var1 >= (float)this.field2436;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "-1"
	)
	static WorldMapLabelSize method4487(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2438) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1950450301"
	)
	static Object method4488(int var0) {
		return class408.method7657((class514)class12.findEnumerated(class514.method9122(), var0));
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lds;III)V",
		garbageValue = "-896511288"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = DynamicObject.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1199 = 0;
			}

			if (var3 == 2) {
				var0.field1199 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || DynamicObject.SequenceDefinition_get(var1).field2223 >= DynamicObject.SequenceDefinition_get(var0.sequence).field2223) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1199 = 0;
			var0.field1220 = var0.pathLength;
		}

	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIII)V",
		garbageValue = "-140985889"
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
						String var5 = var0.method2662();
						int var6;
						if (var4.combatLevel != 0 && var0.field1247 != 0) {
							var6 = var0.field1247 != -1 ? var0.field1247 : var4.combatLevel;
							var5 = var5 + class28.method450(var6, class229.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((UrlRequest.selectedSpellFlags & 2) == 2) {
								WorldMapSectionType.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class167.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var8;
							int var9;
							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2661(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
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

										WorldMapSectionType.insertMenuItemNoShift(var7[var8], class167.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2661(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
										short var10 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class229.localPlayer.combatLevel) {
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

											WorldMapSectionType.insertMenuItemNoShift(var7[var8], class167.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
