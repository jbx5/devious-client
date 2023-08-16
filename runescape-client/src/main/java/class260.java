import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class260 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -785068803
	)
	int field2962;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2129815779
	)
	int field2954;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1693090715
	)
	int field2966;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -300833613
	)
	int field2957;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -660080113
	)
	int field2958;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -232289343
	)
	int field2960;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -120285101
	)
	int field2956;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 104005691
	)
	int field2961;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1872540819
	)
	int field2955;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1582215601
	)
	int field2963;

	class260() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2958) {
			var1.regionLowX = this.field2958;
		}

		if (var1.regionHighX < this.field2958) {
			var1.regionHighX = this.field2958;
		}

		if (var1.regionLowY > this.field2960) {
			var1.regionLowY = this.field2960;
		}

		if (var1.regionHighY < this.field2960) {
			var1.regionHighY = this.field2960;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2962 && var1 < this.field2962 + this.field2954) {
			return var2 >= (this.field2966 << 6) + (this.field2956 << 3) && var2 <= (this.field2966 << 6) + (this.field2956 << 3) + 7 && var3 >= (this.field2957 << 6) + (this.field2961 << 3) && var3 <= (this.field2957 << 6) + (this.field2961 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2958 << 6) + (this.field2955 << 3) && var1 <= (this.field2958 << 6) + (this.field2955 << 3) + 7 && var2 >= (this.field2960 << 6) + (this.field2963 << 3) && var2 <= (this.field2960 << 6) + (this.field2963 << 3) + 7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2958 * 64 - this.field2966 * 64 + var2 + (this.field2955 * 8 - this.field2956 * 8), var3 + (this.field2960 * 64 - this.field2957 * 64) + (this.field2963 * 8 - this.field2961 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2966 * 64 - this.field2958 * 64 + (this.field2956 * 8 - this.field2955 * 8) + var1;
			int var4 = this.field2957 * 64 - this.field2960 * 64 + var2 + (this.field2961 * 8 - this.field2963 * 8);
			return new Coord(this.field2962, var3, var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2962 = var1.readUnsignedByte();
		this.field2954 = var1.readUnsignedByte();
		this.field2966 = var1.readUnsignedShort();
		this.field2956 = var1.readUnsignedByte();
		this.field2957 = var1.readUnsignedShort();
		this.field2961 = var1.readUnsignedByte();
		this.field2958 = var1.readUnsignedShort();
		this.field2955 = var1.readUnsignedByte();
		this.field2960 = var1.readUnsignedShort();
		this.field2963 = var1.readUnsignedByte();
		this.method5381();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1425291786"
	)
	void method5381() {
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIB)V",
		garbageValue = "-49"
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
						String var5 = var0.method2572();
						int var6;
						if (var4.combatLevel != 0 && var0.field1273 != 0) {
							var6 = var0.field1273 != -1 ? var0.field1273 : var4.combatLevel;
							var5 = var5 + class14.method176(var6, VarbitComposition.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((Canvas.selectedSpellFlags & 2) == 2) {
								class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class217.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var8;
							int var9;
							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2571(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
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

										class385.insertMenuItemNoShift(var7[var8], class217.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var0.method2571(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
										short var10 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > VarbitComposition.localPlayer.combatLevel) {
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

											class385.insertMenuItemNoShift(var7[var8], class217.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
