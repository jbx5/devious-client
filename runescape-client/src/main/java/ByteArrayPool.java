import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ri")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("af")
	static final Object field4816;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -547776667
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 786106793
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1723254545
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1165276261
	)
	static int field4818;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -526274451
	)
	static int field4819;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2005412773
	)
	static int field4825;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -755903233
	)
	static int field4820;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 123131129
	)
	static int field4822;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ay")
	static byte[][] field4826;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ad")
	static ArrayList field4828;

	static {
		field4816 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4818 = 0;
		field4819 = 1000;
		field4825 = 250;
		field4820 = 100;
		field4822 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4826 = new byte[50][];
		field4828 = new ArrayList();
		field4828.clear();
		field4828.add(100);
		field4828.add(5000);
		field4828.add(10000);
		field4828.add(30000);
		new HashMap();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method8384(int var0) {
		return class495.field5019[var0 & 16383];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "9"
	)
	static int method8379(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class166.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class13.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var4.parent = AsyncRestClient.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class13.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class13.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]};
						WidgetDefinition.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class13.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class197.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						class197.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class13.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							DynamicObject.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						DynamicObject.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class13.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class13.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class13.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class13.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class13.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						WidgetDefinition.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
