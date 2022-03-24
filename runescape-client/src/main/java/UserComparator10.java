



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@Export("client")
	@ObfuscatedSignature(descriptor = 
	"Lclient;")

	static Client client;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;I)I", garbageValue = 
	"-86339846")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if ((Client.worldId == var1.world) && (var2.world == Client.worldId)) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"311319485")

	public static int method2615(int var0) {
		return class121.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZB)I", garbageValue = 
	"64")

	static int method2614(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}