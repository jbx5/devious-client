import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cg")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cu")
	public static boolean[] field133;
	@ObfuscatedName("cz")
	public static boolean[] field134;
	@ObfuscatedName("ca")
	public static int[] field135;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1294200911
	)
	public static int field136;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -143432951
	)
	public static int field131;
	@ObfuscatedName("cp")
	static char[] field124;
	@ObfuscatedName("ck")
	static int[] field137;
	@ObfuscatedName("ci")
	public static int[] field140;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1837132559
	)
	public static int field141;
	@ObfuscatedName("cd")
	public static int[] field143;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1138643709
	)
	public static int field123;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 862961603
	)
	public static int field144;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -533642347
	)
	public static int field145;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1580956713
	)
	public static int field146;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 889131961
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("df")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field133 = new boolean[112]; // L: 102
		field134 = new boolean[112]; // L: 103
		field135 = new int[128]; // L: 106
		field136 = 0; // L: 107
		field131 = 0; // L: 108
		field124 = new char[128]; // L: 109
		field137 = new int[128]; // L: 110
		field140 = new int[128]; // L: 111
		field141 = 0; // L: 112
		field143 = new int[128]; // L: 113
		field123 = 0; // L: 114
		field144 = 0; // L: 115
		field145 = 0; // L: 116
		field146 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 203
			int var2 = var1.getKeyCode(); // L: 204
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 205
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 206
			}

			if (field131 >= 0 && var2 >= 0) { // L: 207
				field135[field131] = ~var2; // L: 208
				field131 = field131 + 1 & 127; // L: 209
				if (field136 == field131) { // L: 210
					field131 = -1;
				}
			}
		}

		var1.consume(); // L: 213
	} // L: 214

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 217
			char var2 = var1.getKeyChar(); // L: 218
			if (var2 != 0 && var2 != '\uffff' && class307.method5928(var2)) { // L: 219
				int var3 = field145 + 1 & 127; // L: 220
				if (var3 != field144) { // L: 221
					field137[field145] = -1; // L: 222
					field124[field145] = var2; // L: 223
					field145 = var3; // L: 224
				}
			}
		}

		var1.consume(); // L: 228
	} // L: 229

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 265
			field131 = -1; // L: 266
		}

	} // L: 268

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 175
			int var2 = var1.getKeyCode(); // L: 176
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 177
				var2 = KeyHandler_keyCodes[var2]; // L: 178
				if ((var2 & 128) != 0) { // L: 179
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 181
			}

			if (field131 >= 0 && var2 >= 0) { // L: 182
				field135[field131] = var2; // L: 183
				field131 = field131 + 1 & 127; // L: 184
				if (field136 == field131) { // L: 185
					field131 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 187
				var3 = field145 + 1 & 127; // L: 188
				if (var3 != field144) { // L: 189
					field137[field145] = var2; // L: 190
					field124[field145] = 0; // L: 191
					field145 = var3; // L: 192
				}
			}

			var3 = var1.getModifiers(); // L: 195
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 196
				var1.consume(); // L: 197
			}
		}

	} // L: 200

	public final void focusGained(FocusEvent var1) {
	} // L: 262

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "335714859"
	)
	static int method368(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 489
			Interpreter.Interpreter_intStackSize -= 3; // L: 490
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 491
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 492
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 493
			if (var4 == 0) { // L: 494
				throw new RuntimeException(); // L: 495
			} else {
				Widget var6 = SpotAnimationDefinition.getWidget(var9); // L: 497
				if (var6.children == null) { // L: 498
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 499
					Widget[] var7 = new Widget[var11 + 1]; // L: 500

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 501
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 502
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 504
				} else {
					Widget var12 = new Widget(); // L: 505
					var12.type = var4; // L: 506
					var12.parentId = var12.id = var6.id; // L: 507
					var12.childIndex = var11; // L: 508
					var12.isIf3 = true; // L: 509
					var6.children[var11] = var12; // L: 510
					if (var2) { // L: 511
						TextureProvider.scriptDotWidget = var12;
					} else {
						MenuAction.scriptActiveWidget = var12; // L: 512
					}

					class403.invalidateWidget(var6); // L: 513
					return 1; // L: 514
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 516
				var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 517
				Widget var10 = SpotAnimationDefinition.getWidget(var3.id); // L: 518
				var10.children[var3.childIndex] = null; // L: 519
				class403.invalidateWidget(var10); // L: 520
				return 1; // L: 521
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 523
				var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 524
				var3.children = null; // L: 525
				class403.invalidateWidget(var3); // L: 526
				return 1; // L: 527
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 529
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 542
					var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 543
					if (var3 != null) { // L: 544
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 545
						if (var2) { // L: 546
							TextureProvider.scriptDotWidget = var3;
						} else {
							MenuAction.scriptActiveWidget = var3; // L: 547
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 549
					}

					return 1; // L: 550
				} else {
					return 2; // L: 552
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 530
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 531
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 532
				Widget var5 = JagexCache.getWidgetChild(var9, var4); // L: 533
				if (var5 != null && var4 != -1) { // L: 534
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 535
					if (var2) { // L: 536
						TextureProvider.scriptDotWidget = var5;
					} else {
						MenuAction.scriptActiveWidget = var5; // L: 537
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 539
				}

				return 1; // L: 540
			}
		}
	}
}
