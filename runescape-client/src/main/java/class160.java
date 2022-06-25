import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("fb")
public class class160 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lct;")
	public UrlRequest field1772;

	@ObfuscatedName("v")
	public float[] field1770;

	@ObfuscatedSignature(descriptor = "Les;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Les;)V")
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1770 = new float[4];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "112467614")
	public static int[] method3285() {
		int[] var0 = new int[KeyHandler.field146];
		for (int var1 = 0; var1 < KeyHandler.field146; ++var1) {
			var0[var1] = KeyHandler.field142[var1];
		}
		return var0;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(descriptor = "(Lco;IIIB)V", garbageValue = "9")
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
						String var5 = var0.method2360();
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1204 != 0) {
							var6 = (var0.field1204 != -1) ? var0.field1204 * -1036005949 * 71404267 : var4.combatLevel * -1544891593 * 471159431;
							var9 = class101.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = class122.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = class122.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = class122.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = class122.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = class122.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = class122.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = class122.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = class122.colorStartTag(12648192);
							} else {
								var8 = class122.colorStartTag(16776960);
							}
							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}
						if (var4.isFollower && Client.followerOpsLowPriority) {
							class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}
						if (Client.isItemSelected == 1) {
							class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((HealthBar.selectedSpellFlags & 2) == 2) {
								class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = (var4.isFollower && Client.followerOpsLowPriority) ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}
										if (var11 == 1) {
											var9 = var6 + 10;
										}
										if (var11 == 2) {
											var9 = var6 + 11;
										}
										if (var11 == 3) {
											var9 = var6 + 12;
										}
										if (var11 == 4) {
											var9 = var6 + 13;
										}
										class4.insertMenuItemNoShift(var7[var11], class122.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class101.localPlayer.combatLevel) {
												var12 = 2000;
											}
											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}
											if (var11 == 1) {
												var9 = var12 + 10;
											}
											if (var11 == 2) {
												var9 = var12 + 11;
											}
											if (var11 == 3) {
												var9 = var12 + 12;
											}
											if (var11 == 4) {
												var9 = var12 + 13;
											}
											class4.insertMenuItemNoShift(var7[var11], class122.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}
							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}
					}
				}
			}
		}
	}
}