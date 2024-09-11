import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class275 {
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("ac")
	final int[][] field3027;
	@ObfuscatedName("ae")
	final int[][] field3028;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1925796437
	)
	int field3029;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1296502709
	)
	int field3030;
	@ObfuscatedName("ax")
	final int[] field3031;
	@ObfuscatedName("aq")
	final int[] field3032;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1417930785
	)
	final int field3033;

	class275(int var1, int var2) {
		this.field3027 = new int[var1][var2];
		this.field3028 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class7.method47(var3 / 4);
		this.field3031 = new int[var4];
		this.field3032 = new int[var4];
		this.field3033 = var4 - 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-898085861"
	)
	void method5688() {
		for (int var1 = 0; var1 < this.field3027.length; ++var1) {
			for (int var2 = 0; var2 < this.field3027[var1].length; ++var2) {
				this.field3027[var1][var2] = 0;
				this.field3028[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1915298381"
	)
	void method5669(int var1, int var2) {
		this.field3029 = var1;
		this.field3030 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-116"
	)
	int method5670() {
		return this.field3029;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2122306889"
	)
	int method5671() {
		return this.field3030;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "225302376"
	)
	int method5674() {
		return this.field3027.length;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1675403856"
	)
	int method5673() {
		return this.field3027[0].length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1327112640"
	)
	int[][] method5690() {
		return this.field3027;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2059272330"
	)
	int[][] method5672() {
		return this.field3028;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-15"
	)
	int[] method5696() {
		return this.field3031;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-96698690"
	)
	int[] method5676() {
		return this.field3032;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1518127528"
	)
	int method5667() {
		return this.field3033;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIII)V",
		garbageValue = "-1440675639"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + class272.method5655(var0.combatLevel, AddRequestTask.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					SoundCache.insertMenuItem("Use", Client.field674 + " " + "->" + " " + HttpMethod.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class320.selectedSpellFlags & 8) == 8) {
						SoundCache.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpMethod.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > AddRequestTask.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (AddRequestTask.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == AddRequestTask.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1408 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							SoundCache.insertMenuItem(Client.playerMenuActions[var6], HttpMethod.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = HttpMethod.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
