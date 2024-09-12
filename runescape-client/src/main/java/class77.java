import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ck")
public class class77 {
	@ObfuscatedName("ac")
	static final BigInteger field943;
	@ObfuscatedName("ae")
	static final BigInteger field940;
	@ObfuscatedName("al")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("dw")
	static boolean field941;

	static {
		field943 = new BigInteger("10001", 16);
		field940 = new BigInteger("a61e78d0c6a4cfea02cfbe270ccb03e68b81f5aa439dfac31c0b24df43b4db15217c39b84a2823534b1ed4391deb000947675fa1fe28bc5134a87600f1fd78ecd13c4d9ec12d71cd9f4fe50c94e3d0fd38a6e0e5bf62aaaef8d9db9336629332ce10b9e33bb2374f6600fc795bfc103136d58e8c2d51a795eb1dce41b3ea00af", 16);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1098857270"
	)
	static int method2303(int var0, Script var1, boolean var2) {
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
					class320.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
					var20 = WorldMapRectangle.method6188(var19);
					var7 = class179.method3802(var19);
					int var21 = class417.method7966(var19);
					DbRowType var26 = class53.getDbRowType(var3);
					DbTableType var27 = class528.getDbTableType(var20);
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
							class537 var22 = LoginScreenAnimation.method2733(var16);
							if (var22 == class537.field5331) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class173.method3768(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class537 var18 = LoginScreenAnimation.method2733(var28[var16]);
								if (var18 == class537.field5331) {
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = WorldMapRectangle.method6188(var19);
					var7 = class179.method3802(var19);
					DbRowType var25 = class53.getDbRowType(var3);
					DbTableType var9 = class528.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						DbRowType var24 = class53.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var19 = -1;
						if (GrandExchangeOfferWorldComparator.field4611 != null && var3 >= 0 && var3 < GrandExchangeOfferWorldComparator.field4611.size()) {
							var19 = (Integer)GrandExchangeOfferWorldComparator.field4611.get(var3);
						}

						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var4 = class145.method3409(var3);
						var5 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var6 = Login.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (WorldMapRectangle.method6188(var5) != Client.field807) {
							throw new RuntimeException();
						} else if (GrandExchangeOfferWorldComparator.field4611 == null && GrandExchangeOfferWorldComparator.field4611.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class417.method7966(var5);
							List var8 = var6.method9811(var4, var7);
							GrandExchangeOfferWorldComparator.field4611 = new LinkedList(GrandExchangeOfferWorldComparator.field4611);
							if (var8 != null) {
								GrandExchangeOfferWorldComparator.field4611.retainAll(var8);
							} else {
								GrandExchangeOfferWorldComparator.field4611.clear();
							}

							FontName.field5263 = GrandExchangeOfferWorldComparator.field4611.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.field4611.size();
							}

							return 1;
						}
					}
				} else {
					--class320.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					DbTable var23 = class388.method7522(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						GrandExchangeOfferWorldComparator.field4611 = var23.method9811(0, 0);
						var5 = 0;
						if (GrandExchangeOfferWorldComparator.field4611 != null) {
							Client.field807 = var3;
							FontName.field5263 = GrandExchangeOfferWorldComparator.field4611.iterator();
							var5 = GrandExchangeOfferWorldComparator.field4611.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (FontName.field5263 != null && FontName.field5263.hasNext()) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (Integer)FontName.field5263.next();
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			var4 = class145.method3409(var3);
			var5 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			var6 = Login.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class417.method7966(var5);
				GrandExchangeOfferWorldComparator.field4611 = var6.method9811(var4, var7);
				if (GrandExchangeOfferWorldComparator.field4611 != null) {
					Client.field807 = WorldMapRectangle.method6188(var5);
					FontName.field5263 = GrandExchangeOfferWorldComparator.field4611.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.field4611.size();
					}
				} else {
					Client.field807 = -1;
					FontName.field5263 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
