import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class188 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "726259362"
	)
	static void method3619() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class91.clientPreferences.method2576() != null) {
				Login.Login_username = class91.clientPreferences.method2576();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
