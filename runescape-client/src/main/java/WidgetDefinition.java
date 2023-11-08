import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mr")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("aa")
	static boolean[] field3569;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3564;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3565;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3575;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field3563;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Lnn;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ac")
	Map field3572;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class435 field3567;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class435 field3576;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;Lol;Lol;Lol;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3572 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3567 = new class435(10, class433.field4645);
		this.field3576 = new class435(10, class433.field4645);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3565 = var2;
			this.field3575 = var3;
			this.field3563 = var4;
			this.field3564 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field3569 = new boolean[var6];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnn;",
		garbageValue = "16"
	)
	public Widget method6285(int var1) {
		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (this.Widget_interfaceComponents[var2] == null || this.Widget_interfaceComponents[var2][var3] == null) {
			boolean var4 = this.loadInterface(var2);
			if (!var4) {
				return null;
			}
		}

		return this.Widget_interfaceComponents[var2][var3];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "1789235417"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6285(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1302781087"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field3569[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field3569[var1] = true;
				return true;
			} else {
				if (this.Widget_interfaceComponents[var1] == null) {
					this.Widget_interfaceComponents[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (this.Widget_interfaceComponents[var1][var3] == null) {
						byte[] var4 = this.widgetArchive.takeFile(var1, var3);
						if (var4 != null) {
							this.Widget_interfaceComponents[var1][var3] = new Widget();
							this.Widget_interfaceComponents[var1][var3].id = var3 + (var1 << 16);
							if (var4[0] == -1) {
								this.Widget_interfaceComponents[var1][var3].decode(new Buffer(var4));
							} else {
								this.Widget_interfaceComponents[var1][var3].decodeLegacy(new Buffer(var4));
							}

							if (this.field3564 != null) {
								byte[] var5 = this.field3564.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method6766(new Buffer(var5));
									this.field3572.put(this.Widget_interfaceComponents[var1][var3].field3660, var1);
								}
							}
						}
					}
				}

				field3569[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6283(int var1) {
		if (var1 != -1) {
			if (field3569[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field3569[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131589936"
	)
	public void method6288() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method6300(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			var4 = HealthBarDefinition.widgetDefinition.method6285(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			DbTableType.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
			class159.invalidateWidget(var4);
			SpriteMask.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			DbTableType.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
			class159.invalidateWidget(var4);
			SpriteMask.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class159.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Z",
		garbageValue = "64"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = UserComparator4.method2942(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
