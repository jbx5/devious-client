import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("dg")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("w")
	static byte[][][] field1415;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I", garbageValue = "1280649324")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Lpo;", garbageValue = "20")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = ((DbTableType) (DbTableType.DBTableType_cache.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field4666.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method7592(new Buffer(var2));
			}
			var1.method7602();
			DbTableType.DBTableType_cache.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "2120403456")
	static int method2628(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = EnumComposition.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = EnumComposition.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class446.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var5 = EnumComposition.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = EnumComposition.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (EnumComposition.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var7 = EnumComposition.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var7 = EnumComposition.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (EnumComposition.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var7 = EnumComposition.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var7 = EnumComposition.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					DevicePcmPlayerProvider.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = HealthBarUpdate.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						TriBool.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = EnumComposition.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4 + 1;
						}
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class10.foundItemIds != null && TriBool.foundItemIndex < HealthBarUpdate.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class10.foundItemIds[++TriBool.foundItemIndex - 1] & '￿';
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					}
					return 1;
				}
			}
		}
	}
}