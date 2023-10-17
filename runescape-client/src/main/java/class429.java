import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class429 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2019999842"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class159.client.containsAccessAndRefreshToken() && !class159.client.method1249() && !class159.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			GameEngine.setLoginIndex(2);
			if (var0) {
				Login.Login_password = "";
			}

			class188.method3619();
			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
				Login.currentLoginField = 1;
			} else {
				Login.currentLoginField = 0;
			}

		} else {
			GameEngine.setLoginIndex(10);
		}
	}
}
