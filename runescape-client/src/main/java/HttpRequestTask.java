import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("av")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 139624089
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	static ClanSettings field84;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1232628059
	)
	static int field85;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final HttpRequest field83;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Las;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field83 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field83.connect()) {
				class499.method8677(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field83.getResponse();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "5336"
	)
	static int method270(int var0, Script var1, boolean var2) {
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
					Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
					var20 = StructComposition.method4042(var19);
					var7 = class163.method3378(var19);
					int var21 = class311.method5914(var19);
					DbRowType var26 = GrandExchangeOfferNameComparator.getDbRowType(var3);
					DbTableType var27 = TriBool.getDbTableType(var20);
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
							class522 var22 = class211.method3931(var16);
							if (var22 == class522.field5155) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class214.method3983(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class522 var18 = class211.method3931(var28[var16]);
								if (var18 == class522.field5155) {
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = StructComposition.method4042(var19);
					var7 = class163.method3378(var19);
					DbRowType var25 = GrandExchangeOfferNameComparator.getDbRowType(var3);
					DbTableType var9 = TriBool.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						DbRowType var24 = GrandExchangeOfferNameComparator.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var19 = -1;
						if (ArchiveLoader.field1055 != null && var3 >= 0 && var3 < ArchiveLoader.field1055.size()) {
							var19 = (Integer)ArchiveLoader.field1055.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var4 = GameObject.method5218(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var6 = Language.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (StructComposition.method4042(var5) != Client.field807) {
							throw new RuntimeException();
						} else if (ArchiveLoader.field1055 == null && ArchiveLoader.field1055.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class311.method5914(var5);
							List var8 = var6.method9164(var4, var7);
							ArchiveLoader.field1055 = new LinkedList(ArchiveLoader.field1055);
							if (var8 != null) {
								ArchiveLoader.field1055.retainAll(var8);
							} else {
								ArchiveLoader.field1055.clear();
							}

							class149.field1705 = ArchiveLoader.field1055.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = ArchiveLoader.field1055.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
					DbTable var23 = Archive.method6948(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						ArchiveLoader.field1055 = var23.method9164(0, 0);
						var5 = 0;
						if (ArchiveLoader.field1055 != null) {
							Client.field807 = var3;
							class149.field1705 = ArchiveLoader.field1055.iterator();
							var5 = ArchiveLoader.field1055.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class149.field1705 != null && class149.field1705.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)class149.field1705.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			var4 = GameObject.method5218(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			var6 = Language.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class311.method5914(var5);
				ArchiveLoader.field1055 = var6.method9164(var4, var7);
				if (ArchiveLoader.field1055 != null) {
					Client.field807 = StructComposition.method4042(var5);
					class149.field1705 = ArchiveLoader.field1055.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = ArchiveLoader.field1055.size();
					}
				} else {
					Client.field807 = -1;
					class149.field1705 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
