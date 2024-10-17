import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("au")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1934004387
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -252591159
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -219372949
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 788373853
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1324440213
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -750470663
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("as")
	@Export("action")
	String action;
	@ObfuscatedName("ae")
	@Export("target")
	String target;
	@ObfuscatedName("am")
	boolean field909;

	MenuAction() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "107021418"
	)
	public static int method2336(int var0) {
		return class331.field3609[var0];
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "-72"
	)
	static int method2337(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
