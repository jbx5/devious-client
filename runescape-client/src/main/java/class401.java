import java.security.SecureRandom;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class401 {
	@ObfuscatedName("hy")
	static String field4618;

	static {
		new HashMap();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "2018283115"
	)
	static SecureRandom method7407() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
