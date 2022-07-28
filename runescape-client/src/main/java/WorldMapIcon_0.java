import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("he")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1405909757)
	@Export("element")
	final int element;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Liy;")
	@Export("label")
	final WorldMapLabel label;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1275145831)
	@Export("subWidth")
	final int subWidth;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1743861621)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(descriptor = "(Lkp;Lkp;ILiy;)V")
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = TileItem.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2045439656")
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Liy;", garbageValue = "1")
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2147415720")
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "740963101")
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(descriptor = "(Lco;IIII)V", garbageValue = "-1106038079")
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
						String var5 = var0.method2413();
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1204 != 0) {
							var6 = (var0.field1204 != -1) ? var0.field1204 : var4.combatLevel;
							var9 = class28.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = class82.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = class82.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = class82.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = class82.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = class82.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = class82.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = class82.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = class82.colorStartTag(12648192);
							} else {
								var8 = class82.colorStartTag(16776960);
							}
							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}
						if (var4.isFollower && Client.followerOpsLowPriority) {
							StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}
						if (Client.isItemSelected == 1) {
							StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((Coord.selectedSpellFlags & 2) == 2) {
								StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16776960) + var5, 8, var1, var2, var3);
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
										StructComposition.insertMenuItemNoShift(var7[var11], class82.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class28.localPlayer.combatLevel) {
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
											StructComposition.insertMenuItemNoShift(var7[var11], class82.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}
							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "20")
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ReflectionCheck.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];
			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}
		}
	}
}