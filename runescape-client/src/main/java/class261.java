import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
public class class261 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class261 field2709;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class261 field2705;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("an")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 121987833
	)
	@Export("value")
	final int value;

	static {
		field2709 = new class261(0);
		field2705 = new class261(1);
	}

	class261(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1991501876"
	)
	static int method5006(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
			if (var0 != ScriptOpcodes.DB_FINDNEXT) {
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) {
					class130.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
					var20 = class162.method3436(var19);
					var7 = class414.method7619(var19);
					int var21 = GrandExchangeEvents.method7311(var19);
					DbRowType var26 = WorldMapSectionType.getDbRowType(var3);
					DbTableType var27 = StructComposition.getDbTableType(var20);
					int[] var28 = var27.types[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}

						var12 = var21;
						var13 = var21 + 1;
					}

					Object[] var14 = var26.getColumnType(var7);
					if (var14 == null && var27.defaultValues != null) {
						var14 = var27.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class534 var22 = AttackOption.method2792(var16);
							if (var22 == class534.field5286) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = BufferedFile.method9360(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class534 var18 = AttackOption.method2792(var28[var16]);
								if (var18 == class534.field5286) {
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = class162.method3436(var19);
					var7 = class414.method7619(var19);
					DbRowType var25 = WorldMapSectionType.getDbRowType(var3);
					DbTableType var9 = StructComposition.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						DbRowType var24 = WorldMapSectionType.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var19 = -1;
						if (FloorOverlayDefinition.field2278 != null && var3 >= 0 && var3 < FloorOverlayDefinition.field2278.size()) {
							var19 = (Integer)FloorOverlayDefinition.field2278.get(var3);
						}

						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var4 = class240.method4522(var3);
						var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var6 = class379.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class162.method3436(var5) != Client.field798) {
							throw new RuntimeException();
						} else if (FloorOverlayDefinition.field2278 == null && FloorOverlayDefinition.field2278.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = GrandExchangeEvents.method7311(var5);
							List var8 = var6.method9452(var4, var7);
							FloorOverlayDefinition.field2278 = new LinkedList(FloorOverlayDefinition.field2278);
							if (var8 != null) {
								FloorOverlayDefinition.field2278.retainAll(var8);
							} else {
								FloorOverlayDefinition.field2278.clear();
							}

							UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.field2278.size();
							}

							return 1;
						}
					}
				} else {
					--class130.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					DbTable var23 = InvDefinition.method3556(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						FloorOverlayDefinition.field2278 = var23.method9452(0, 0);
						var5 = 0;
						if (FloorOverlayDefinition.field2278 != null) {
							Client.field798 = var3;
							UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator();
							var5 = FloorOverlayDefinition.field2278.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (UserComparator4.field1489 != null && UserComparator4.field1489.hasNext()) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (Integer)UserComparator4.field1489.next();
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			var4 = class240.method4522(var3);
			var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			var6 = class379.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = GrandExchangeEvents.method7311(var5);
				FloorOverlayDefinition.field2278 = var6.method9452(var4, var7);
				if (FloorOverlayDefinition.field2278 != null) {
					Client.field798 = class162.method3436(var5);
					UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.field2278.size();
					}
				} else {
					Client.field798 = -1;
					UserComparator4.field1489 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIB)V",
		garbageValue = "22"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2702();
						int var7;
						if (var5.combatLevel != 0 && var0.field1266 != 0) {
							var7 = var0.field1266 != -1 ? var0.field1266 : var5.combatLevel;
							var6 = var6 + Sound.method3908(var7, SoundCache.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							WorldMapArea.insertMenuItem("Examine", NpcOverrides.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!ChatChannel.field1030 && Client.isItemSelected == 1) {
							WorldMapArea.insertMenuItem("Use", Client.field642 + " " + "->" + " " + NpcOverrides.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!ChatChannel.field1030 && (class92.selectedSpellFlags & 2) == 2) {
								WorldMapArea.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + NpcOverrides.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!ChatChannel.field1030 && var0.method2752(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
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

										WorldMapArea.insertMenuItem(var8[var9], NpcOverrides.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!ChatChannel.field1030 && var0.method2752(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.combatLevel > SoundCache.localPlayer.combatLevel) {
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

											WorldMapArea.insertMenuItem(var8[var9], NpcOverrides.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								WorldMapArea.insertMenuItem("Examine", NpcOverrides.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
