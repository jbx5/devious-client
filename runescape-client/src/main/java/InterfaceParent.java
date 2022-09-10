import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("m")
	static int[] field1040;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1737189293
	)
	@Export("group")
	int group;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 737701507
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	boolean field1036;

	InterfaceParent() {
		this.field1036 = false; // L: 8
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lbj;",
		garbageValue = "502875656"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ldi;[F[FB)V",
		garbageValue = "67"
	)
	static void method2237(class118 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 322
			var0.field1458 = var1[0]; // L: 325
			float var3 = var1[3] - var1[0]; // L: 326
			float var4 = var2[3] - var2[0]; // L: 327
			float var5 = var1[1] - var1[0]; // L: 328
			float var6 = 0.0F; // L: 329
			float var7 = 0.0F; // L: 330
			if ((double)var5 != 0.0D) { // L: 331
				var6 = (var2[1] - var2[0]) / var5; // L: 332
			}

			var5 = var1[3] - var1[2]; // L: 334
			if (0.0D != (double)var5) { // L: 335
				var7 = (var2[3] - var2[2]) / var5; // L: 336
			}

			float var8 = 1.0F / (var3 * var3); // L: 338
			float var9 = var3 * var6; // L: 339
			float var10 = var7 * var3; // L: 340
			var0.field1460[0] = var8 * (var10 + var9 - var4 - var4) / var3; // L: 341
			var0.field1460[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8; // L: 342
			var0.field1460[2] = var6; // L: 343
			var0.field1460[3] = var2[0]; // L: 344
		}
	} // L: 323 345

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "294870217"
	)
	static int method2238(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1187
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1188
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1189
			return 1; // L: 1190
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1192
			if (var3.itemId != -1) { // L: 1193
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1194
			}

			return 1; // L: 1195
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1197
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1198
			return 1; // L: 1199
		} else if (var0 == 1707) { // L: 1201
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method5790() ? 1 : 0; // L: 1202
			return 1; // L: 1203
		} else if (var0 == 1708) { // L: 1205
			return class118.method2875(var3); // L: 1206
		} else {
			return var0 == 1709 ? class347.method6510(var3) : 2; // L: 1208 1209 1211
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZS)I",
		garbageValue = "256"
	)
	static int method2239(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3708
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.getWindowedMode(); // L: 3709
			return 1; // L: 3710
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3712
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3713
				if (var3 == 1 || var3 == 2) { // L: 3714
					WallDecoration.setWindowedMode(var3);
				}

				return 1; // L: 3715
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3717
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.clientPreferences.method2411(); // L: 3718
				return 1; // L: 3719
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3721
				if (var0 == 5310) { // L: 3728
					--Interpreter.Interpreter_intStackSize; // L: 3729
					return 1; // L: 3730
				} else {
					return 2; // L: 3732
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3722
				if (var3 == 1 || var3 == 2) { // L: 3723
					Player.clientPreferences.method2410(var3); // L: 3724
				}

				return 1; // L: 3726
			}
		}
	}
}
