import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1429065701
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("gu")
	@Export("refreshToken")
	static String refreshToken;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILkd;I)Z",
		garbageValue = "1206846327"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-85"
	)
	public static int method1193(CharSequence var0) {
		return class279.method5525(var0, 10, true);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	static void method1192() {
		if ((Client.worldProperties & class543.field5353.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class532.updateLoginIndex(1);
			class33.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class543.field5355.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class543.field5338.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class532.updateLoginIndex(1);
			class33.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class543.field5338.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class532.updateLoginIndex(1);
			class33.focusPasswordWhenUsernameFilled();
		} else {
			HttpRequest.Login_promptCredentials(false);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-2014912548"
	)
	static int method1194(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
