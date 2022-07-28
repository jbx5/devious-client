import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bc")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);

	@ObfuscatedName("bj")
	static String field975;

	@ObfuscatedName("q")
	String field965;

	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;

	@ObfuscatedName("u")
	@Export("intOperands")
	int[] intOperands;

	@ObfuscatedName("c")
	@Export("stringOperands")
	String[] stringOperands;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -358657845)
	@Export("localIntCount")
	int localIntCount;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 982325223)
	@Export("localStringCount")
	int localStringCount;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 385663001)
	@Export("intArgumentCount")
	int intArgumentCount;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1023002377)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "[Lpl;")
	@Export("switches")
	IterableNodeHashTable[] switches;

	Script() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)[Lpl;", garbageValue = "66")
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("f")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;
				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}
				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class345.base37Table[((int) (var6 - 37L * var0))];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}
				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)[Ldk;", garbageValue = "114")
	static class118[] method2024() {
		return new class118[]{ class118.field1462, class118.field1453, class118.field1454, class118.field1455, class118.field1456, class118.field1452 };
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "([BIILgo;[Lgr;I)V", garbageValue = "81879802")
	static final void method2039(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;
		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}
			var6 += var7;
			int var8 = 0;
			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}
					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}
					class309.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			} 
		} 
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(descriptor = "(Lcz;IIII)V", garbageValue = "2086159848")
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class28.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class28.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = class82.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = class82.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = class82.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = class82.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = class82.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = class82.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = class82.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = class82.colorStartTag(12648192);
					} else {
						var6 = class82.colorStartTag(16776960);
					}
					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}
				int var10;
				if (Client.isItemSelected == 1) {
					StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((Coord.selectedSpellFlags & 8) == 8) {
						StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}
								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class28.localPlayer.combatLevel) {
									var11 = 2000;
								}
								if (class28.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class28.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1284 && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}
							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							StructComposition.insertMenuItemNoShift(Client.playerMenuActions[var10], class82.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}
				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = class82.colorStartTag(16777215) + var4;
						break;
					}
				}
			}
		}
	}
}