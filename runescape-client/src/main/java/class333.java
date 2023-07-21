import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class333 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-92"
	)
	static void method6591(boolean var0) {
		byte var1 = 0;
		boolean var2 = class150.clientPreferences.method2539() >= Client.field521;
		if (!var2) {
			var1 = 12;
		} else if (TileItem.client.method1267() || TileItem.client.method1777() || TileItem.client.method1472()) {
			var1 = 10;
		}

		class328.method6115(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class424.field4622 = 0;
			Login.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class150.clientPreferences.method2483() != null) {
				Login.Login_username = class150.clientPreferences.method2483();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		class395.method7331();
	}
}
