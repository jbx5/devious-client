import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class153 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1154799035
	)
	int field1703;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -640367731
	)
	int field1702;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1055917
	)
	int field1705;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -799246859
	)
	int field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class153(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1703 = var1.readInt();
		this.field1704 = var1.readInt();
		this.field1702 = var1.readUnsignedByte();
		this.field1705 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3452(this.field1703, this.field1704, this.field1702, this.field1705);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static final void method3385() {
		if (WorldMapIcon_0.field3124) {
			AABB.method4125();
			WorldMapIcon_0.field3124 = false;
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIII)V",
		garbageValue = "-996010726"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2750();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1213 != 0) {
							var7 = var0.field1213 != -1 ? var0.field1213 : var5.combatLevel;
							var10 = class253.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = TransformationMatrix.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = TransformationMatrix.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = TransformationMatrix.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = TransformationMatrix.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = TransformationMatrix.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = TransformationMatrix.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = TransformationMatrix.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = TransformationMatrix.colorStartTag(12648192);
							} else {
								var9 = TransformationMatrix.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							NpcOverrides.insertMenuItem("Examine", TransformationMatrix.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!class105.field1355 && Client.isItemSelected == 1) {
							NpcOverrides.insertMenuItem("Use", Client.field659 + " " + "->" + " " + TransformationMatrix.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!class105.field1355 && (UserComparator3.selectedSpellFlags & 2) == 2) {
								NpcOverrides.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + TransformationMatrix.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class105.field1355 && var0.method2749(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var12 == 0) {
											var10 = var7 + 9;
										}

										if (var12 == 1) {
											var10 = var7 + 10;
										}

										if (var12 == 2) {
											var10 = var7 + 11;
										}

										if (var12 == 3) {
											var10 = var7 + 12;
										}

										if (var12 == 4) {
											var10 = var7 + 13;
										}

										NpcOverrides.insertMenuItem(var8[var12], TransformationMatrix.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class105.field1355 && var0.method2749(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.combatLevel > class253.localPlayer.combatLevel) {
												var13 = 2000;
											}

											var10 = 0;
											if (var12 == 0) {
												var10 = var13 + 9;
											}

											if (var12 == 1) {
												var10 = var13 + 10;
											}

											if (var12 == 2) {
												var10 = var13 + 11;
											}

											if (var12 == 3) {
												var10 = var13 + 12;
											}

											if (var12 == 4) {
												var10 = var13 + 13;
											}

											NpcOverrides.insertMenuItem(var8[var12], TransformationMatrix.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								NpcOverrides.insertMenuItem("Examine", TransformationMatrix.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
