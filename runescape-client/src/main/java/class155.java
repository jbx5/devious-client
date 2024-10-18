import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
public class class155 extends class150 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1598109083
	)
	int field1727;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1054887253
	)
	int field1729;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -883988327
	)
	int field1730;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1883879947
	)
	int field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class155(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1727 = var1.readInt();
		this.field1728 = var1.readInt();
		this.field1729 = var1.readUnsignedByte();
		this.field1730 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3669(this.field1727, this.field1728, this.field1729, this.field1730);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "295471145"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "0"
	)
	static int method3616(int var0, Script var1, boolean var2) {
		int var4;
		Widget var6;
		int var10;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class96.Interpreter_intStackSize -= 3;
			var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			int var12 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				var6 = class416.widgetDefinition.method6911(var10);
				if (var6.children == null) {
					var6.children = new Widget[var12 + 1];
				}

				if (var6.children.length <= var12) {
					Widget[] var13 = new Widget[var12 + 1];

					for (int var14 = 0; var14 < var6.children.length; ++var14) {
						var13[var14] = var6.children[var14];
					}

					var6.children = var13;
				}

				if (var12 > 0 && var6.children[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					Widget var15 = new Widget();
					var15.type = var4;
					var15.parentId = var15.id = var6.id;
					var15.childIndex = var12;
					var15.isIf3 = true;
					if (var4 == 12) {
						WorldMapSection0.method6243(var15);
					}

					var6.children[var12] = var15;
					if (var2) {
						UserComparator2.scriptDotWidget = var15;
					} else {
						HttpRequestTask.scriptActiveWidget = var15;
					}

					class110.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
				Widget var11 = class416.widgetDefinition.method6911(var3.id);
				var11.children[var3.childIndex] = null;
				class110.invalidateWidget(var11);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
				var3.children = null;
				class110.invalidateWidget(var3);
				return 1;
			} else {
				Widget var5;
				if (var0 == 105) {
					class96.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = class416.widgetDefinition.method6911(var10);
					var6 = class416.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 == null) {
						throw new RuntimeException("");
					} else if (var4 < 0) {
						throw new RuntimeException("");
					} else if (var6 == null) {
						throw new RuntimeException("");
					} else if (var5.children == null) {
						throw new RuntimeException("");
					} else {
						int var7 = var5.children.length;
						Widget[] var8 = new Widget[var7 + 1];
						System.arraycopy(var5.children, 0, var8, 0, var5.children.length);
						var5.children = var8;
						Widget var9 = new Widget(var6, var7);
						if (var6.type == 12) {
							WorldMapSection0.method6243(var9);
						}

						var5.children[var7] = var9;
						if (var2) {
							UserComparator2.scriptDotWidget = var9;
						} else {
							HttpRequestTask.scriptActiveWidget = var9;
						}

						class110.invalidateWidget(var5);
						return 1;
					}
				} else if (var0 != ScriptOpcodes.CC_FIND) {
					if (var0 == ScriptOpcodes.IF_FIND) {
						var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
						if (var3 != null) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
							if (var2) {
								UserComparator2.scriptDotWidget = var3;
							} else {
								HttpRequestTask.scriptActiveWidget = var3;
							}
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					class96.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = class416.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 != null && var4 != -1) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							UserComparator2.scriptDotWidget = var5;
						} else {
							HttpRequestTask.scriptActiveWidget = var5;
						}
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "112524127"
	)
	static void method3614() {
		if (Client.oculusOrbState == 1) {
			Client.field786 = true;
		}

	}
}
