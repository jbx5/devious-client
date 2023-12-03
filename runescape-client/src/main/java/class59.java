import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ct")
public class class59 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1209151713
	)
	static int field414;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	VorbisFloor field413;
	@ObfuscatedName("ah")
	boolean field408;
	@ObfuscatedName("ar")
	int[] field412;
	@ObfuscatedName("ao")
	int[] field410;
	@ObfuscatedName("ab")
	boolean[] field411;

	@ObfuscatedSignature(
		descriptor = "(Lbu;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field413 = var1;
		this.field408 = var2;
		this.field412 = var3;
		this.field410 = var4;
		this.field411 = var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-121312327"
	)
	void method1172(float[] var1, int var2) {
		int var3 = this.field413.field257.length;
		VorbisFloor var10000 = this.field413;
		int var4 = VorbisFloor.field259[this.field413.multiplier - 1];
		boolean[] var5 = this.field411;
		this.field411[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field413.method784(this.field412, var6);
			var8 = this.field413.method777(this.field412, var6);
			var9 = this.field413.method778(this.field412[var7], this.field410[var7], this.field412[var8], this.field410[var8], this.field412[var6]);
			var10 = this.field410[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field411;
				this.field411[var8] = true;
				var14[var7] = true;
				this.field411[var6] = true;
				if (var10 >= var13) {
					this.field410[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field410[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field411[var6] = false;
				this.field410[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field413.multiplier * this.field410[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field411[var8]) {
				var9 = this.field412[var8];
				var10 = this.field413.multiplier * this.field410[var8];
				this.field413.method779(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field413;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465438441"
	)
	boolean method1173() {
		return this.field408;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1888348492"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field412[var1];
			int var5 = this.field410[var1];
			boolean var6 = this.field411[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field412[var7];
				if (var8 < var4) {
					this.field412[var3] = var8;
					this.field410[var3] = this.field410[var7];
					this.field411[var3] = this.field411[var7];
					++var3;
					this.field412[var7] = this.field412[var3];
					this.field410[var7] = this.field410[var3];
					this.field411[var7] = this.field411[var3];
				}
			}

			this.field412[var3] = var4;
			this.field410[var3] = var5;
			this.field411[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1858684336"
	)
	static void method1185() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "5"
	)
	static int method1184(int var0, Script var1, boolean var2) {
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
					DbTableType.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
					var20 = SequenceDefinition.method4092(var19);
					var7 = class306.method5916(var19);
					int var21 = class134.method3149(var19);
					DbRowType var26 = class469.getDbRowType(var3);
					DbTableType var27 = FadeOutTask.getDbTableType(var20);
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
							class514 var22 = HttpContentType.method8562(var16);
							if (var22 == class514.field5061) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = MusicPatchNode.method6238(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class514 var18 = HttpContentType.method8562(var28[var16]);
								if (var18 == class514.field5061) {
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = SequenceDefinition.method4092(var19);
					var7 = class306.method5916(var19);
					DbRowType var25 = class469.getDbRowType(var3);
					DbTableType var9 = FadeOutTask.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						DbRowType var24 = class469.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var19 = -1;
						if (DevicePcmPlayerProvider.field108 != null && var3 >= 0 && var3 < DevicePcmPlayerProvider.field108.size()) {
							var19 = (Integer)DevicePcmPlayerProvider.field108.get(var3);
						}

						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = WorldMapLabelSize.method4488(var3);
						var5 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var6 = class168.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (SequenceDefinition.method4092(var5) != Client.field636) {
							throw new RuntimeException();
						} else if (DevicePcmPlayerProvider.field108 == null && DevicePcmPlayerProvider.field108.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class134.method3149(var5);
							List var8 = var6.method9156(var4, var7);
							DevicePcmPlayerProvider.field108 = new LinkedList(DevicePcmPlayerProvider.field108);
							if (var8 != null) {
								DevicePcmPlayerProvider.field108.retainAll(var8);
							} else {
								DevicePcmPlayerProvider.field108.clear();
							}

							class10.field40 = DevicePcmPlayerProvider.field108.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.field108.size();
							}

							return 1;
						}
					}
				} else {
					--DbTableType.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					DbTable var23 = UserComparator4.method2937(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						DevicePcmPlayerProvider.field108 = var23.method9156(0, 0);
						var5 = 0;
						if (DevicePcmPlayerProvider.field108 != null) {
							Client.field636 = var3;
							class10.field40 = DevicePcmPlayerProvider.field108.iterator();
							var5 = DevicePcmPlayerProvider.field108.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class10.field40 != null && class10.field40.hasNext()) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (Integer)class10.field40.next();
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			var4 = WorldMapLabelSize.method4488(var3);
			var5 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			var6 = class168.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class134.method3149(var5);
				DevicePcmPlayerProvider.field108 = var6.method9156(var4, var7);
				if (DevicePcmPlayerProvider.field108 != null) {
					Client.field636 = SequenceDefinition.method4092(var5);
					class10.field40 = DevicePcmPlayerProvider.field108.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.field108.size();
					}
				} else {
					Client.field636 = -1;
					class10.field40 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lcb;III)V",
		garbageValue = "1570010040"
	)
	static final void method1177(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class407.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2);
		}

	}
}
