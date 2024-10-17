import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fm")
public class class141 implements class131 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "692898383"
	)
	static final void method3497(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "-44"
	)
	static int method3498(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Bounds.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				class96.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var10 = Bounds.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class96.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var10 = Bounds.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				class96.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				ItemComposition var6 = Bounds.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.field2257 != null && var6.field2257[var8 - 1] != null && var5 >= 1 && var5 <= var6.field2257[var8 - 1].length) {
					var7 = var6.field2257[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					var4 = Bounds.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					var4 = Bounds.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					var4 = Bounds.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					var4 = Bounds.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
					var8 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					class433.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = ClanChannel.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class198.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var8 = Bounds.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Bounds.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = Bounds.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.field2271;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Bounds.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Ignored.foundItemIds != null && class198.foundItemIndex < ClanChannel.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Ignored.foundItemIds[++class198.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1377737696"
	)
	static final int method3496() {
		if (TaskHandler.clientPreferences.isRoofsHidden()) {
			return class198.topLevelWorldView.plane;
		} else {
			int var0 = 3;
			int var1 = GameEngine.entity.getX() >> 7;
			int var2 = GameEngine.entity.getY() >> 7;
			if (class323.cameraPitch < 310) {
				int var3;
				int var4;
				if (Client.oculusOrbState == 1) {
					var3 = ArchiveDisk.oculusOrbFocalPointX >> 7;
					var4 = class298.oculusOrbFocalPointY >> 7;
				} else {
					var3 = var1;
					var4 = var2;
				}

				int var5 = AsyncHttpResponse.cameraX >> 7;
				int var6 = PlayerType.cameraZ >> 7;
				if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
					return class198.topLevelWorldView.plane;
				}

				if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
					return class198.topLevelWorldView.plane;
				}

				if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var5][var6] & 4) != 0) {
					var0 = class198.topLevelWorldView.plane;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				if (var4 > var6) {
					var8 = var4 - var6;
				} else {
					var8 = var6 - var4;
				}

				int var9;
				int var10;
				if (var7 > var8) {
					var9 = var8 * 65536 / var7;
					var10 = 32768;

					while (var5 != var3) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class198.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var6 < var4) {
								++var6;
							} else if (var6 > var4) {
								--var6;
							}

							if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class198.topLevelWorldView.plane;
							}
						}
					}
				} else if (var8 > 0) {
					var9 = var7 * 65536 / var8;
					var10 = 32768;

					while (var6 != var4) {
						if (var6 < var4) {
							++var6;
						} else if (var6 > var4) {
							--var6;
						}

						if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class198.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class198.topLevelWorldView.plane;
							}
						}
					}
				}
			}

			if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
				if ((class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][var1][var2] & 4) != 0) {
					var0 = class198.topLevelWorldView.plane;
				}

				return var0;
			} else {
				return class198.topLevelWorldView.plane;
			}
		}
	}
}
