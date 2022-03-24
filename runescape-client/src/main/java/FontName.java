



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(descriptor = 
	"Lps;")

	@Export("HitSplatDefinition_cached")
	static class426 HitSplatDefinition_cached;
	@ObfuscatedName("d")
	@Export("name")
	String name;
	static 
	{
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"8")

	public static void method7509() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"35948304")

	static int method7511(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class295.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = HorizontalAlignment.getWidget(var9);
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

				if ((var11 > 0) && (var6.children[var11 - 1] == null)) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						class432.scriptDotWidget = var12;
					} else {
						class341.scriptActiveWidget = var12;
					}

					class290.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
				Widget var10 = HorizontalAlignment.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class290.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
				var3.children = null;
				class290.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				class295.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class295.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
						if (var2) {
							class432.scriptDotWidget = var3;
						} else {
							class341.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[(--class295.Interpreter_intStackSize) + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class295.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Widget var5 = class143.getWidgetChild(var9, var4);
				if ((var5 != null) && (var4 != (-1))) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					if (var2) {
						class432.scriptDotWidget = var5;
					} else {
						class341.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(descriptor = 
	"([BII)V", garbageValue = 
	"-1923637215")

	static void method7510(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class350.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}