import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class33 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field152;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -874679381
	)
	int field154;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1395500293
	)
	int field148;

	class33(int var1, int var2) {
		this.field154 = var1;
		this.field148 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)Z",
		garbageValue = "-1574558738"
	)
	boolean method451(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field154) {
			case 1:
				return var1.vmethod5350(this.field148);
			case 2:
				return var1.vmethod5351(this.field148);
			case 3:
				return var1.vmethod5378((char)this.field148);
			case 4:
				return var1.vmethod5354(this.field148 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "802509873"
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
