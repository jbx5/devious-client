import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class107 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -287260217
	)
	int field1403;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2138731981
	)
	int field1400;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1615535537
	)
	int field1399;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1634017759
	)
	int field1402;

	class107(int var1, int var2, int var3, int var4) {
		this.field1403 = var1;
		this.field1400 = var2;
		this.field1399 = var3;
		this.field1402 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	int method2964() {
		return this.field1403;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	int method2960() {
		return this.field1400;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "92"
	)
	int method2961() {
		return this.field1399;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-50"
	)
	int method2959() {
		return this.field1402;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
