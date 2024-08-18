import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("vl")
	static Iterator field1039;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1561191535
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -200194341
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loj;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7201(var1) || this.archive.method7207(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-86"
	)
	static final int method2382(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "1215876664"
	)
	static int method2381(int var0, Script var1, boolean var2) {
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
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var20 = class512.method9041(var19);
					var7 = class229.method4771(var19);
					int var21 = WorldMapDecoration.method5951(var19);
					DbRowType var26 = Timer.getDbRowType(var3);
					DbTableType var27 = class511.getDbTableType(var20);
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
							class535 var22 = class418.method7757(var16);
							if (var22 == class535.field5292) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOffer.method7446(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class535 var18 = class418.method7757(var28[var16]);
								if (var18 == class535.field5292) {
									Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = class512.method9041(var19);
					var7 = class229.method4771(var19);
					DbRowType var25 = Timer.getDbRowType(var3);
					DbTableType var9 = class511.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						DbRowType var24 = Timer.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var19 = -1;
						if (class27.field117 != null && var3 >= 0 && var3 < class27.field117.size()) {
							var19 = (Integer)class27.field117.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = class422.method7815(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var6 = SecureRandomFuture.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class512.method9041(var5) != Client.field793) {
							throw new RuntimeException();
						} else if (class27.field117 == null && class27.field117.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = WorldMapDecoration.method5951(var5);
							List var8 = var6.method9496(var4, var7);
							class27.field117 = new LinkedList(class27.field117);
							if (var8 != null) {
								class27.field117.retainAll(var8);
							} else {
								class27.field117.clear();
							}

							field1039 = class27.field117.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field117.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					DbTable var23 = Huffman.method7106(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class27.field117 = var23.method9496(0, 0);
						var5 = 0;
						if (class27.field117 != null) {
							Client.field793 = var3;
							field1039 = class27.field117.iterator();
							var5 = class27.field117.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (field1039 != null && field1039.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)field1039.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = class422.method7815(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var6 = SecureRandomFuture.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = WorldMapDecoration.method5951(var5);
				class27.field117 = var6.method9496(var4, var7);
				if (class27.field117 != null) {
					Client.field793 = class512.method9041(var5);
					field1039 = class27.field117.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field117.size();
					}
				} else {
					Client.field793 = -1;
					field1039 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "-16"
	)
	static final void method2375(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field618 == -1) {
				Client.field618 = var0.spriteId2;
				Client.field786 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field618;
			} else {
				var0.spriteId2 = Client.field786;
			}

		} else if (var1 == 325) {
			if (Client.field618 == -1) {
				Client.field618 = var0.spriteId2;
				Client.field786 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field786;
			} else {
				var0.spriteId2 = Client.field618;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1243506727"
	)
	static boolean method2376() {
		return TileItem.clientPreferences.getEULA() >= Client.field570;
	}
}
