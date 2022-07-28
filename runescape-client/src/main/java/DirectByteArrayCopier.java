import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.List;
import net.runelite.rs.ScriptOpcodes;
import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
@ObfuscatedName("jq")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1336273469)
	public static int field3302;

	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	@ObfuscatedName("o")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "79012875")
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "44")
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "-105")
	static int method5520(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = BoundaryObject.Widget_unpackTargetMask(class67.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.dataText;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			}
			return 1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "743150001")
	static int method5523(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class437 var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) {
			if (var0 != ScriptOpcodes.DB_FINDNEXT) {
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) {
					TaskHandler.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
					var20 = SecureRandomCallable.method2126(var19);
					var7 = class13.method174(var19);
					int var21 = NPC.method2433(var19);
					DbRowType var26 = GrandExchangeOfferNameComparator.getDbRowType(var3);
					DbTableType var27 = WorldMapArchiveLoader.getDbTableType(var20);
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
							class433 var22 = AbstractWorldMapIcon.method5044(var16);
							if (var22 == class433.field4676) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.method6053(var16);
							}
						}
						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class433 var18 = AbstractWorldMapIcon.method5044(var28[var16]);
								if (var18 == class433.field4676) {
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ((String) (var14[var17]));
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Integer) (var14[var17]));
								}
							}
							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
					TaskHandler.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					var19 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
					var5 = 0;
					var20 = SecureRandomCallable.method2126(var19);
					var7 = class13.method174(var19);
					DbRowType var25 = GrandExchangeOfferNameComparator.getDbRowType(var3);
					DbTableType var9 = WorldMapArchiveLoader.getDbTableType(var20);
					int[] var10 = var9.types[var7];
					Object[] var11 = var25.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}
					if (var11 != null) {
						var5 = var11.length / var10.length;
					}
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) {
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						DbRowType var24 = GrandExchangeOfferNameComparator.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var24.tableId;
						return 1;
					} else if (var0 == ScriptOpcodes.DB_GETROW) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var19 = -1;
						if (class155.field1721 != null && var3 >= 0 && var3 < class155.field1721.size()) {
							var19 = ((Integer) (class155.field1721.get(var3)));
						}
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var19;
						return 1;
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var4 = Tiles.method2116(var3);
						var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var6 = class433.method7606(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (SecureRandomCallable.method2126(var5) != Client.field772) {
							throw new RuntimeException();
						} else if (class155.field1721 == null && class155.field1721.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = NPC.method2433(var5);
							List var8 = var6.method7633(var4, var7);
							class155.field1721 = new LinkedList(class155.field1721);
							if (var8 != null) {
								class155.field1721.retainAll(var8);
							} else {
								class155.field1721.clear();
							}
							HealthBar.field1255 = class155.field1721.iterator();
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.field1721.size();
							}
							return 1;
						}
					}
				} else {
					--TaskHandler.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					class437 var23 = class78.method2156(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class155.field1721 = var23.method7633(0, 0);
						var5 = 0;
						if (class155.field1721 != null) {
							Client.field772 = var3;
							HealthBar.field1255 = class155.field1721.iterator();
							var5 = class155.field1721.size();
						}
						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5;
						}
						return 1;
					}
				}
			} else {
				if (HealthBar.field1255 != null && HealthBar.field1255.hasNext()) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Integer) (HealthBar.field1255.next()));
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
				}
				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			var4 = Tiles.method2116(var3);
			var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			var6 = class433.method7606(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = NPC.method2433(var5);
				class155.field1721 = var6.method7633(var4, var7);
				if (class155.field1721 != null) {
					Client.field772 = SecureRandomCallable.method2126(var5);
					HealthBar.field1255 = class155.field1721.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.field1721.size();
					}
				} else {
					Client.field772 = -1;
					HealthBar.field1255 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
				}
				return 1;
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-104855916")
	static void method5522(int var0) {
		for (IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.first())); var1 != null; var1 = ((IntegerNode) (Client.widgetFlags.next()))) {
			if ((var1.key >> 48 & 65535L) == ((long) (var0))) {
				var1.remove();
			}
		}
	}
}