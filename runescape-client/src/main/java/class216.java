import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class216 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIB)V",
		garbageValue = "106"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class133.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class133.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = Decimator.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = Decimator.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = Decimator.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = Decimator.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = Decimator.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = Decimator.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = Decimator.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = Decimator.colorStartTag(12648192);
					} else {
						var6 = Decimator.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class352.selectedSpellFlags & 8) == 8) {
						Interpreter.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class133.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (class133.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class133.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1360 && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							Interpreter.insertMenuItemNoShift(Client.playerMenuActions[var10], Decimator.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = Decimator.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
