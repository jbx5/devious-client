import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(intValue = -1985635931)
	static int field1043;

	@ObfuscatedName("jy")
	@ObfuscatedGetter(intValue = -1949636447)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 315980607)
	@Export("group")
	int group;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1762148949)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	boolean field1040;

	InterfaceParent() {
		this.field1040 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "896944894")
	public static int method2095(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = ((int) (var2 >>> 7 & 127L));
		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1938605488")
	static int method2097(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (SoundCache.method764(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (VertexNormal.method4528(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (SoundCache.method753(var3)) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-62")
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class125.method2824();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}