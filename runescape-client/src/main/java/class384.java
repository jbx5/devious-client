import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ob")
public enum class384 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4501(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4499(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4500(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	field4503(3);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1905368207
	)
	public final int field4502;

	class384(int var3) {
		this.field4502 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4502;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "2"
	)
	static int method7544(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class208.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class96.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var4.parent = class416.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field3964 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class96.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field3964 != null) {
					var4.field3964[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7447(var6, var11, Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field3925 = 237687564;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field3925 = (var11 - 1) * 59421891;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class96.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]};
						class132.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class96.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							NPCComposition.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						NPCComposition.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class96.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class364.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class364.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class96.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class96.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class96.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class96.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class96.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						class132.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1718048223"
	)
	static final void method7545(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		class430.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-45274081"
	)
	static int method7542(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--class96.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class271.method5722(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			class96.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class451.method8751(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
