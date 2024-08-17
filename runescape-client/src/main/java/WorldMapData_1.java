import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -186340781
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 800935391
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1932432959
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1663089617
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "2"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3191.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-2033952891"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3158 = new byte[super.planes][64][64];
		super.field3159 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class297.field3190.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-76"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1999989867"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1712286821"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1586625442"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;FFFFFFFFB)V",
		garbageValue = "-45"
	)
	static void method5847(class134 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1563 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if ((double)var11 != 0.0D) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if (0.0D != (double)var11) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var12 * var9;
			float var16 = var9 * var13;
			var0.field1571 = var14 * (var16 + var15 - var10 - var10) / var9;
			var0.field1557 = var14 * (var10 + var10 + var10 - var15 - var15 - var16);
			var0.field1567 = var12;
			var0.field1568 = var5;
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IIIII)V",
		garbageValue = "1607533763"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + WorldView.method2734(var0.combatLevel, class253.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					NpcOverrides.insertMenuItem("Use", Client.field659 + " " + "->" + " " + TransformationMatrix.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((UserComparator3.selectedSpellFlags & 8) == 8) {
						NpcOverrides.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + TransformationMatrix.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class253.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (class253.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class253.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1364 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							NpcOverrides.insertMenuItem(Client.playerMenuActions[var6], TransformationMatrix.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = TransformationMatrix.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
