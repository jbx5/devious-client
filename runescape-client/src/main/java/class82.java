import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("cc")
public enum class82 implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lcc;")
	field1069(0, -1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lcc;")
	field1066(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lcc;")
	field1067(2, 7),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lcc;")
	field1068(3, 8),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lcc;")
	field1073(4, 9);
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -20141329)
	final int field1065;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 868910059)
	final int field1071;

	class82(int var3, int var4) {
		this.field1065 = var3;
		this.field1071 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1071;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Ldq;", garbageValue = "2053304227")
	static class118 method2116(int var0) {
		class118[] var1 = new class118[]{ class118.field1481, class118.field1477, class118.field1478, class118.field1479, class118.field1480, class118.field1484 };
		class118 var2 = ((class118) (Actor.findEnumerated(var1, var0)));
		if (var2 == null) {
			var2 = class118.field1481;
		}
		return var2;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "0")
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class4.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}
		long var4 = -1L;
		long var6 = -1L;
		int var8;
		for (var8 = 0; var8 < Frames.method4349(); ++var8) {
			long var24 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var24) {
				var6 = var24;
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var14 = ((int) (var15 >>> 0 & 127L));
				var14 = var14;
				int var28 = InterfaceParent.method2095(var8);
				int var16 = TileItem.method2414(var8);
				int var17 = JagexCache.method3250(var8);
				if (var16 == 2 && class356.scene.getObjectFlags(PacketWriter.Client_plane, var14, var28, var24) >= 0) {
					ObjectComposition var18 = class162.getObjectDefinition(var17);
					if (var18.transforms != null) {
						var18 = var18.transform();
					}
					if (var18 == null) {
						continue;
					}
					if (Client.isItemSelected == 1) {
						class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(65535) + var18.name, 1, var17, var14, var28);
					} else if (Client.isSpellSelected) {
						if ((HealthBar.selectedSpellFlags & 4) == 4) {
							class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(65535) + var18.name, 2, var17, var14, var28);
						}
					} else {
						String[] var19 = var18.actions;
						if (var19 != null) {
							for (int var20 = 4; var20 >= 0; --var20) {
								if (var19[var20] != null) {
									short var21 = 0;
									if (var20 == 0) {
										var21 = 3;
									}
									if (var20 == 1) {
										var21 = 4;
									}
									if (var20 == 2) {
										var21 = 5;
									}
									if (var20 == 3) {
										var21 = 6;
									}
									if (var20 == 4) {
										var21 = 1001;
									}
									class4.insertMenuItemNoShift(var19[var20], class122.colorStartTag(65535) + var18.name, var21, var17, var14, var28);
								}
							}
						}
						class4.insertMenuItemNoShift("Examine", class122.colorStartTag(65535) + var18.name, 1002, var18.id, var14, var28);
					}
				}
				Player var22;
				int var29;
				NPC var30;
				int var37;
				int[] var38;
				if (var16 == 1) {
					NPC var33 = Client.npcs[var17];
					if (var33 == null) {
						continue;
					}
					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) {
						for (var29 = 0; var29 < Client.npcCount; ++var29) {
							var30 = Client.npcs[Client.npcIndices[var29]];
							if (var30 != null && var33 != var30 && var30.definition.size == 1 && var30.x == var33.x && var30.y == var33.y) {
								class160.addNpcToMenu(var30, Client.npcIndices[var29], var14, var28);
							}
						}
						var29 = Players.Players_count;
						var38 = Players.Players_indices;
						for (var37 = 0; var37 < var29; ++var37) {
							var22 = Client.players[var38[var37]];
							if (var22 != null && var22.x == var33.x && var22.y == var33.y) {
								DynamicObject.addPlayerToMenu(var22, var38[var37], var14, var28);
							}
						}
					}
					class160.addNpcToMenu(var33, var17, var14, var28);
				}
				if (var16 == 0) {
					Player var34 = Client.players[var17];
					if (var34 == null) {
						continue;
					}
					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
						for (var29 = 0; var29 < Client.npcCount; ++var29) {
							var30 = Client.npcs[Client.npcIndices[var29]];
							if (var30 != null && var30.definition.size == 1 && var30.x == var34.x && var30.y == var34.y) {
								class160.addNpcToMenu(var30, Client.npcIndices[var29], var14, var28);
							}
						}
						var29 = Players.Players_count;
						var38 = Players.Players_indices;
						for (var37 = 0; var37 < var29; ++var37) {
							var22 = Client.players[var38[var37]];
							if (var22 != null && var22 != var34 && var34.x == var22.x && var22.y == var34.y) {
								DynamicObject.addPlayerToMenu(var22, var38[var37], var14, var28);
							}
						}
					}
					if (var17 != Client.combatTargetPlayerIndex) {
						DynamicObject.addPlayerToMenu(var34, var17, var14, var28);
					} else {
						var4 = var24;
					}
				}
				if (var16 == 3) {
					NodeDeque var36 = Client.groundItems[PacketWriter.Client_plane][var14][var28];
					if (var36 != null) {
						for (TileItem var35 = ((TileItem) (var36.first())); var35 != null; var35 = ((TileItem) (var36.next()))) {
							ItemComposition var39 = EnumComposition.ItemDefinition_get(var35.id);
							if (Client.isItemSelected == 1) {
								class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16748608) + var39.name, 16, var35.id, var14, var28);
							} else if (Client.isSpellSelected) {
								if ((HealthBar.selectedSpellFlags & 1) == 1) {
									class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16748608) + var39.name, 17, var35.id, var14, var28);
								}
							} else {
								String[] var31 = var39.groundActions;
								for (int var32 = 4; var32 >= 0; --var32) {
									if (var31 != null && var31[var32] != null) {
										byte var23 = 0;
										if (var32 == 0) {
											var23 = 18;
										}
										if (var32 == 1) {
											var23 = 19;
										}
										if (var32 == 2) {
											var23 = 20;
										}
										if (var32 == 3) {
											var23 = 21;
										}
										if (var32 == 4) {
											var23 = 22;
										}
										class4.insertMenuItemNoShift(var31[var32], class122.colorStartTag(16748608) + var39.name, var23, var35.id, var14, var28);
									} else if (var32 == 2) {
										class4.insertMenuItemNoShift("Take", class122.colorStartTag(16748608) + var39.name, 20, var35.id, var14, var28);
									}
								}
								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16748608) + var39.name, 1004, var35.id, var14, var28);
							}
						}
					}
				}
			}
		}
		if (-1L != var4) {
			var8 = ((int) (var4 >>> 0 & 127L));
			int var10 = ((int) (var4 >>> 7 & 127L));
			Player var12 = Client.players[Client.combatTargetPlayerIndex];
			DynamicObject.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
		}
	}
}