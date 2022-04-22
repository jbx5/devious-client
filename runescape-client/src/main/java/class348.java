import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class348 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(ZS)V", garbageValue = 
	"255")

	static void method6505(boolean var0) {
		byte var1 = 0;
		if (!BufferedSource.method6889()) {
			var1 = 12;
		} else if (class127.client.method1532() || class127.client.method1476()) {
			var1 = 10;
		}

		Ignored.method6828(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			WorldMapID.field2386 = 0;
			HealthBar.otp = "";
		}

		Players.method2421();
		class12.method157();
	}
}