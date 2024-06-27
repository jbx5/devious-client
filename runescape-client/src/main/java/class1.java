import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
public class class1 implements Callable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -836714351
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final Buffer field0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class3 field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lav;Lvp;Lak;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field0 = var2;
		this.field2 = var3;
	}

	public Object call() {
		return this.field2.vmethod14(this.field0);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "80"
	)
	static int method7(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class225.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class130.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class105.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1745935264"
	)
	static int method10(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--class130.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class171.method3529(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			class130.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class447.method8289(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
