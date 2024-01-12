import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
public class class101 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("World_request")
	static UrlRequest World_request;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "38"
	)
	static final int method2725(int var0, int var1) {
		int var2 = Huffman.method6900(var0 - 1, var1 - 1) + Huffman.method6900(1 + var0, var1 - 1) + Huffman.method6900(var0 - 1, var1 + 1) + Huffman.method6900(1 + var0, var1 + 1);
		int var3 = Huffman.method6900(var0 - 1, var1) + Huffman.method6900(1 + var0, var1) + Huffman.method6900(var0, var1 - 1) + Huffman.method6900(var0, var1 + 1);
		int var4 = Huffman.method6900(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "133972153"
	)
	static int method2719(int var0, Script var1, boolean var2) {
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
					UserComparator6.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
					var20 = RouteStrategy.method4509(var19);
					var7 = JagexCache.method4249(var19);
					int var21 = FriendsChat.method8218(var19);
					DbRowType var26 = class464.getDbRowType(var3);
					DbTableType var27 = HttpHeaders.getDbTableType(var20);
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
							class518 var22 = class270.method5345(var16);
							if (var22 == class518.field5103) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class509.method9132(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class518 var18 = class270.method5345(var28[var16]);
								if (var18 == class518.field5103) {
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = RouteStrategy.method4509(var19);
					var7 = JagexCache.method4249(var19);
					DbRowType var25 = class464.getDbRowType(var3);
					DbTableType var9 = HttpHeaders.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						DbRowType var24 = class464.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var19 = -1;
						if (UserComparator4.field1444 != null && var3 >= 0 && var3 < UserComparator4.field1444.size()) {
							var19 = (Integer)UserComparator4.field1444.get(var3);
						}

						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = class17.method268(var3);
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var6 = class161.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (RouteStrategy.method4509(var5) != Client.field730) {
							throw new RuntimeException();
						} else if (UserComparator4.field1444 == null && UserComparator4.field1444.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = FriendsChat.method8218(var5);
							List var8 = var6.method9281(var4, var7);
							UserComparator4.field1444 = new LinkedList(UserComparator4.field1444);
							if (var8 != null) {
								UserComparator4.field1444.retainAll(var8);
							} else {
								UserComparator4.field1444.clear();
							}

							class28.field144 = UserComparator4.field1444.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = UserComparator4.field1444.size();
							}

							return 1;
						}
					}
				} else {
					--UserComparator6.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					DbTable var23 = JagexCache.method4248(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						UserComparator4.field1444 = var23.method9281(0, 0);
						var5 = 0;
						if (UserComparator4.field1444 != null) {
							Client.field730 = var3;
							class28.field144 = UserComparator4.field1444.iterator();
							var5 = UserComparator4.field1444.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class28.field144 != null && class28.field144.hasNext()) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (Integer)class28.field144.next();
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			var4 = class17.method268(var3);
			var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			var6 = class161.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = FriendsChat.method8218(var5);
				UserComparator4.field1444 = var6.method9281(var4, var7);
				if (UserComparator4.field1444 != null) {
					Client.field730 = RouteStrategy.method4509(var5);
					class28.field144 = UserComparator4.field1444.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = UserComparator4.field1444.size();
					}
				} else {
					Client.field730 = -1;
					class28.field144 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
