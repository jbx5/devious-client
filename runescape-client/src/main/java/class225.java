import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iv")
public class class225 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2412;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2402;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2403;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2405;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2409;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2406;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2401;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2408;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2404;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2410;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2411;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class225 field2407;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2413;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class225 field2414;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1103762697
	)
	public final int field2415;

	static {
		field2412 = new class225(0);
		field2402 = new class225(1);
		field2403 = new class225(2);
		field2405 = new class225(3);
		field2409 = new class225(4, class211.field2170);
		field2406 = new class225(5);
		field2401 = new class225(6, class211.field2168);
		field2408 = new class225(7, class211.field2167);
		field2404 = new class225(8, class211.field2165);
		field2410 = new class225(9, class211.field2166);
		field2411 = new class225(10, class211.field2171);
		field2407 = new class225(11, class211.field2163);
		field2413 = new class225(12);
		field2414 = new class225(13);
	}

	class225(int var1) {
		this(var1, (class211)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILin;)V"
	)
	class225(int var1, class211 var2) {
		this.field2415 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "21"
	)
	static void method4274(int var0) {
		class470.field4875 = var0;
		class470.field4870 = new class470[var0];
		ByteArrayPool.field4688 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIB)[Lvl;",
		garbageValue = "38"
	)
	public static IndexedSprite[] method4272(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			HttpQueryParams.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class469.method8384();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "256"
	)
	static int method4273(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			HttpRequestTask.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class243.widgetDefinition.method6281(var9);
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
						var12.method6679();
						var12.method6667().method6411(new class106(var12));
						var12.method6667().method6410(new class107(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						class475.scriptDotWidget = var12;
					} else {
						class535.scriptActiveWidget = var12;
					}

					WorldMapData_0.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
				Widget var10 = class243.widgetDefinition.method6281(var3.id);
				var10.children[var3.childIndex] = null;
				WorldMapData_0.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
				var3.children = null;
				WorldMapData_0.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class475.scriptDotWidget = var3;
						} else {
							class535.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Widget var5 = class243.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class475.scriptDotWidget = var5;
					} else {
						class535.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "38"
	)
	public static int method4276(int var0) {
		return NpcOverrides.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "74"
	)
	static String method4275(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
