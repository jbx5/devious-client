import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1529858789
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	AbstractArchive field335;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field336;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field336 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field335 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbu;",
		garbageValue = "-1861641707"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method876(var1, var2, false);
		class53 var6 = (class53)this.field336.get(var4);
		if (var6 != null) {
			return var6.method1087();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field336.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcf;",
		garbageValue = "-98"
	)
	class53 method871(int var1, int var2) {
		long var3 = this.method876(var1, var2, true);
		class53 var5 = (class53)this.field336.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field335, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field336.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbu;",
		garbageValue = "88728645"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "134889372"
	)
	public class53 method874(int var1) {
		if (this.field335.getGroupCount() == 1) {
			return this.method871(0, var1);
		} else if (this.field335.getGroupFileCount(var1) == 1) {
			return this.method871(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lbu;",
		garbageValue = "1913686453"
	)
	public RawSound method875(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1190461425"
	)
	long method876(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Lmi;",
		garbageValue = "139540914"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class92.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1117171488"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1164645966"
	)
	static int method884(int var0, Script var1, boolean var2) {
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
					var20 = UserComparator3.method2895(var19);
					var7 = NpcOverrides.method3686(var19);
					int var21 = class217.method4241(var19);
					DbRowType var26 = class159.getDbRowType(var3);
					DbTableType var27 = class159.getDbTableType(var20);
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
							class502 var22 = SequenceDefinition.method4071(var16);
							if (var22 == class502.field5030) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class127.method2979(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class502 var18 = SequenceDefinition.method4071(var28[var16]);
								if (var18 == class502.field5030) {
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = (String)var14[var17];
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
					var20 = UserComparator3.method2895(var19);
					var7 = NpcOverrides.method3686(var19);
					DbRowType var25 = class159.getDbRowType(var3);
					DbTableType var9 = class159.getDbTableType(var20);
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
						DbRowType var24 = class159.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var19 = -1;
						if (VarcInt.field1972 != null && var3 >= 0 && var3 < VarcInt.field1972.size()) {
							var19 = (Integer)VarcInt.field1972.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var4 = class217.method4239(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
						var6 = class344.getDbTable(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (UserComparator3.method2895(var5) != Client.field822) {
							throw new RuntimeException();
						} else if (VarcInt.field1972 == null && VarcInt.field1972.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class217.method4241(var5);
							List var8 = var6.method8950(var4, var7);
							VarcInt.field1972 = new LinkedList(VarcInt.field1972);
							if (var8 != null) {
								VarcInt.field1972.retainAll(var8);
							} else {
								VarcInt.field1972.clear();
							}

							Decimator.field425 = VarcInt.field1972.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = VarcInt.field1972.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
					DbTable var23 = IgnoreList.method7815(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						VarcInt.field1972 = var23.method8950(0, 0);
						var5 = 0;
						if (VarcInt.field1972 != null) {
							Client.field822 = var3;
							Decimator.field425 = VarcInt.field1972.iterator();
							var5 = VarcInt.field1972.size();
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (Decimator.field425 != null && Decimator.field425.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)Decimator.field425.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			var4 = class217.method4239(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			var6 = class344.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class217.method4241(var5);
				VarcInt.field1972 = var6.method8950(var4, var7);
				if (VarcInt.field1972 != null) {
					Client.field822 = UserComparator3.method2895(var5);
					Decimator.field425 = VarcInt.field1972.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = VarcInt.field1972.size();
					}
				} else {
					Client.field822 = -1;
					Decimator.field425 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
