import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("io")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -7088662262851721805L
	)
	public long field2110;
	@ObfuscatedName("al")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("aj")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("az")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("af")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2110 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "4"
	)
	static int method3961(int var0, Script var1, boolean var2) {
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
					class13.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
					var20 = Huffman.method7070(var19);
					var7 = class133.method3101(var19);
					int var21 = class154.method3288(var19);
					DbRowType var26 = SwapSongTask.getDbRowType(var3);
					DbTableType var27 = class183.getDbTableType(var20);
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
							class533 var22 = WorldMapIcon_1.method5497(var16);
							if (var22 == class533.field5267) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class4.method17(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class533 var18 = WorldMapIcon_1.method5497(var28[var16]);
								if (var18 == class533.field5267) {
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = Huffman.method7070(var19);
					var7 = class133.method3101(var19);
					DbRowType var25 = SwapSongTask.getDbRowType(var3);
					DbTableType var9 = class183.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						DbRowType var24 = SwapSongTask.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var19 = -1;
						if (WorldMapLabel.field3203 != null && var3 >= 0 && var3 < WorldMapLabel.field3203.size()) {
							var19 = (Integer)WorldMapLabel.field3203.get(var3);
						}

						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var4 = WorldMapIcon_0.method5865(var3);
						var5 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var6 = ReflectionCheck.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (Huffman.method7070(var5) != Client.field822) {
							throw new RuntimeException();
						} else if (WorldMapLabel.field3203 == null && WorldMapLabel.field3203.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class154.method3288(var5);
							List var8 = var6.method9552(var4, var7);
							WorldMapLabel.field3203 = new LinkedList(WorldMapLabel.field3203);
							if (var8 != null) {
								WorldMapLabel.field3203.retainAll(var8);
							} else {
								WorldMapLabel.field3203.clear();
							}

							class294.field3210 = WorldMapLabel.field3203.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMapLabel.field3203.size();
							}

							return 1;
						}
					}
				} else {
					--class13.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					DbTable var23 = KitDefinition.method3898(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						WorldMapLabel.field3203 = var23.method9552(0, 0);
						var5 = 0;
						if (WorldMapLabel.field3203 != null) {
							Client.field822 = var3;
							class294.field3210 = WorldMapLabel.field3203.iterator();
							var5 = WorldMapLabel.field3203.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class294.field3210 != null && class294.field3210.hasNext()) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (Integer)class294.field3210.next();
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			var4 = WorldMapIcon_0.method5865(var3);
			var5 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			var6 = ReflectionCheck.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class154.method3288(var5);
				WorldMapLabel.field3203 = var6.method9552(var4, var7);
				if (WorldMapLabel.field3203 != null) {
					Client.field822 = Huffman.method7070(var5);
					class294.field3210 = WorldMapLabel.field3203.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMapLabel.field3203.size();
					}
				} else {
					Client.field822 = -1;
					class294.field3210 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
