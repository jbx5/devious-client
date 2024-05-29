import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sy")
public enum class484 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	field5004(3, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	field4999(0, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	field5000(2, 3),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	field5001(1, 10);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 243373763
	)
	final int field5002;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1721427903
	)
	final int field5003;

	class484(int var3, int var4) {
		this.field5002 = var3;
		this.field5003 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5003;
	}

	@ObfuscatedName("ak")
	public static final void method8889(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				class91.method2337(var0 - 1L);
				class91.method2337(1L);
			} else {
				class91.method2337(var0);
			}

		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "0"
	)
	static int method8890(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			class13.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class13.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class13.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class13.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class13.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class13.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = FriendSystem.method1953(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class13.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Calendar.method7102(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class13.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = GraphicsObject.method2104(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class13.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				class13.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
				var9 = GraphicsObject.method2104(var9, var5, var6);
				var7 = WorldMapID.method5942(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = ByteArrayPool.method8384(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = AbstractSocket.method8788(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class13.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = User.method8638(var9, var4);
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				var4 = -1;
				if (class206.isNumber(var3)) {
					var4 = class177.method3601(var3);
				}

				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1449106522"
	)
	static int method8891(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = KeyHandler.ItemDefinition_get(var3).name;
			return 1;
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				class13.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = KeyHandler.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class13.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var5 = KeyHandler.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					var4 = KeyHandler.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					var4 = KeyHandler.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					var4 = KeyHandler.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					var4 = KeyHandler.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
					var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					AbstractWorldMapIcon.findItemDefinitions(var7, var6 == 1);
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class157.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						UserComparator7.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var6 = KeyHandler.ItemDefinition_get(var3).getShiftClickIndex();
						if (var6 == -1) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var4 = KeyHandler.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.field2332;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = KeyHandler.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (SoundSystem.foundItemIds != null && UserComparator7.foundItemIndex < class157.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = SoundSystem.foundItemIds[++UserComparator7.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
