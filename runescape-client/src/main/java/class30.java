import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class30 {
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 662621097
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static AbstractSocket field141;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	public static void method448() {
		class179.field1915.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "435011510"
	)
	public static void method445() {
		class204.field1909.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1795528755"
	)
	static void method450() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			Login.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			Login.setLoginResponseString("", "Please enter your password.", "");
		} else {
			Login.setLoginResponseString("", "Connecting to server...", "");
			class162.setAuthenticationScheme(false);
			class464.updateGameState(20);
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "810306685"
	)
	static final int method447(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
