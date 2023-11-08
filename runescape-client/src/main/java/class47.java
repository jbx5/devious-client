import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class47 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 346167861
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	VorbisSample field315;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	RawSound field317;
	@ObfuscatedName("ar")
	ReentrantLock field316;

	@ObfuscatedSignature(
		descriptor = "(Lcv;Lbt;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field315 = var1;
		this.field317 = var2;
		this.field316 = new ReentrantLock();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1747596015"
	)
	static int method898(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			DbTableType.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = HealthBarDefinition.widgetDefinition.method6285(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method6687();
						var12.method6688().method6441(new class105(var12));
						var12.method6688().method6407(new class106(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						HealthBar.scriptActiveWidget = var12;
					}

					class159.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
				Widget var10 = HealthBarDefinition.widgetDefinition.method6285(var3.id);
				var10.children[var3.childIndex] = null;
				class159.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = HealthBarDefinition.widgetDefinition.method6285(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
				var3.children = null;
				class159.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = HealthBarDefinition.widgetDefinition.method6285(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var3;
						} else {
							HealthBar.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Widget var5 = HealthBarDefinition.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var5;
					} else {
						HealthBar.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
