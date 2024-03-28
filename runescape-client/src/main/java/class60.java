import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class60 {
	@ObfuscatedName("ay")
	static String[] field423;
	@ObfuscatedName("bc")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("az")
	byte[] field428;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1519305719
	)
	int field422;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -250105249
	)
	int field427;

	class60() {
		this.field428 = null;
		this.field422 = 0;
		this.field427 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "116"
	)
	int method1123(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field427; var1 -= var4) {
			var4 = 8 - this.field427;
			int var5 = (1 << var4) - 1;
			var2 += (this.field428[this.field422] >> this.field427 & var5) << var3;
			this.field427 = 0;
			++this.field422;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field428[this.field422] >> this.field427 & var4) << var3;
			this.field427 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "981865000"
	)
	int method1124() {
		int var1 = this.field428[this.field422] >> this.field427 & 1;
		++this.field427;
		this.field422 += this.field427 >> 3;
		this.field427 &= 7;
		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "640013743"
	)
	void method1134(byte[] var1, int var2) {
		this.field428 = var1;
		this.field422 = var2;
		this.field427 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lek;",
		garbageValue = "1"
	)
	static class129[] method1135() {
		return new class129[]{class129.field1548, class129.field1546, class129.field1545, class129.field1547, class129.field1544};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BIILjp;[Lix;B)V",
		garbageValue = "-26"
	)
	static final void method1129(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
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

					DesktopPlatformInfoProvider.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(III)Liw;",
		garbageValue = "1760473399"
	)
	static RouteStrategy method1132(int var0, int var1) {
		Client.field814.approxDestinationX = var0;
		Client.field814.approxDestinationY = var1;
		Client.field814.approxDestinationSizeX = 1;
		Client.field814.approxDestinationSizeY = 1;
		return Client.field814;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ldk;IIII)V",
		garbageValue = "-1057922660"
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
						String var5 = var0.method2584();
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1275 != 0) {
							var6 = var0.field1275 != -1 ? var0.field1275 : var4.combatLevel;
							var9 = class133.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = Decimator.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = Decimator.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = Decimator.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = Decimator.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = Decimator.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = Decimator.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = Decimator.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = Decimator.colorStartTag(12648192);
							} else {
								var8 = Decimator.colorStartTag(16776960);
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class352.selectedSpellFlags & 2) == 2) {
								Interpreter.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2583(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
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

										Interpreter.insertMenuItemNoShift(var7[var11], Decimator.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2583(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class133.localPlayer.combatLevel) {
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

											Interpreter.insertMenuItemNoShift(var7[var11], Decimator.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
