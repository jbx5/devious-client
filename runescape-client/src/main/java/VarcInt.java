import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("fg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;

	@ObfuscatedName("fg")
	static String field1851;

	@ObfuscatedName("q")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-101")
	public void method3400(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method3402(var1, var2);
		} 
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "2067647577")
	void method3402(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "81")
	static int method3411(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class9.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					WorldMapLabelSize.setWindowedMode(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class19.clientPreferences.method2268();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class446.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					class446.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--class446.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					Interpreter.Interpreter_stringStackSize -= 2;
					--class446.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--Interpreter.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class19.clientPreferences.method2280(var3);
				}
				return 1;
			}
		}
	}
}