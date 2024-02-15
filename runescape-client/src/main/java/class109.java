import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class109 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1391;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1392;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1393;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1394;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1395;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1396;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1397;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1404;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1399;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1401;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1402;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1400;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1403;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("field1390")
	static final class109 field1390;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1405;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1406;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 170127347
	)
	int field1407;

	static {
		field1391 = new class109(0);
		field1392 = new class109(1);
		field1393 = new class109(2);
		field1394 = new class109(3);
		field1395 = new class109(4);
		field1396 = new class109(5);
		field1397 = new class109(6);
		field1404 = new class109(7);
		field1399 = new class109(8);
		field1401 = new class109(9);
		field1402 = new class109(10);
		field1400 = new class109(11);
		field1403 = new class109(12);
		field1390 = new class109(13);
		field1405 = new class109(14);
		field1406 = new class109(15);
	}

	class109(int var1) {
		this.field1407 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static void method2796() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			SecureUrlRequester.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			SecureUrlRequester.setLoginResponseString("", "Please enter your password.", "");
		} else {
			SecureUrlRequester.setLoginResponseString("", "Connecting to server...", "");
			ScriptEvent.setAuthenticationScheme(false);
			Interpreter.updateGameState(20);
		}
	}
}
