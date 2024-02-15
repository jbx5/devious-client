import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fi")
	public static String field4010;
	@ObfuscatedName("kd")
	public static String field4272;
	@ObfuscatedName("kh")
	public static String field4088;
	@ObfuscatedName("kp")
	public static String field4274;

	static {
		field4010 = "Please visit the support page for assistance.";
		field4272 = "";
		field4088 = "Page has opened in the browser.";
		field4274 = "";
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "77792910"
	)
	static void method7013(int var0, int var1) {
		MenuAction var2 = class363.tempMenuAction;
		if (var2 != null) {
			ReflectionCheck.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action, var2.target, var0, var1);
		}

		class363.tempMenuAction = null;
	}
}
