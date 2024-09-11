import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1515878711
	)
	static int field88;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("decimator")
	static Decimator decimator;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lbz;",
		garbageValue = "-1996119587"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lea;IIIIB)V",
		garbageValue = "-3"
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
						String var6 = var0.method2876();
						int var7;
						if (var5.combatLevel != 0 && var0.field1239 != 0) {
							var7 = var0.field1239 != -1 ? var0.field1239 : var5.combatLevel;
							var6 = var6 + class272.method5655(var7, AddRequestTask.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							SoundCache.insertMenuItem("Examine", HttpMethod.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!JagexCache.field2390 && Client.isItemSelected == 1) {
							SoundCache.insertMenuItem("Use", Client.field674 + " " + "->" + " " + HttpMethod.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!JagexCache.field2390 && (class320.selectedSpellFlags & 2) == 2) {
								SoundCache.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpMethod.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!JagexCache.field2390 && var0.method2875(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										SoundCache.insertMenuItem(var8[var9], HttpMethod.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!JagexCache.field2390 && var0.method2875(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > AddRequestTask.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											SoundCache.insertMenuItem(var8[var9], HttpMethod.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								SoundCache.insertMenuItem("Examine", HttpMethod.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
