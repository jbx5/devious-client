import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -761555779
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1093331411
	)
	@Export("count")
	int count;
	@ObfuscatedName("az")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ao")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	class272 field2844;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2844 = new class272(var3, var4);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1917649997"
	)
	public int method5411() {
		return this.count;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkn;",
		garbageValue = "1746723062"
	)
	public class272 method5414() {
		return this.field2844;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmx;B)V",
		garbageValue = "49"
	)
	public static void method5417(class327 var0) {
		if (!class321.field3482.contains(var0)) {
			class321.field3482.add(var0);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILng;IIIII[FI)Lng;",
		garbageValue = "148959513"
	)
	static Widget method5418(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)var1.width);
		var8.rawY = (int)((float)var1.height * var7[1]);
		var8.rawWidth = (int)((float)var1.width * var7[2]);
		var8.rawHeight = (int)(var7[3] * (float)var1.height);
		return var8;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1024699735"
	)
	static int method5416(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V",
		garbageValue = "187746341"
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
					if (!var4.field2005 || Client.followerIndex == var1) {
						String var5 = var0.method2670();
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1270 != 0) {
							var6 = var0.field1270 != -1 ? var0.field1270 : var4.combatLevel;
							var9 = VarpDefinition.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = class370.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = class370.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = class370.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = class370.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = class370.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = class370.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = class370.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = class370.colorStartTag(12648192);
							} else {
								var8 = class370.colorStartTag(16776960);
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class128.selectedSpellFlags & 2) == 2) {
								UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2663(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
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

										UrlRequest.insertMenuItemNoShift(var7[var11], class370.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2663(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > VarpDefinition.localPlayer.combatLevel) {
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

											UrlRequest.insertMenuItemNoShift(var7[var11], class370.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
