import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5340;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5336;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5338;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5339;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5335;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5341;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final LoginType field5342;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	public static final LoginType field5343;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -588432431
	)
	final int field5337;
	@ObfuscatedName("au")
	final String field5345;

	static {
		oldscape = new LoginType(2, 0, "", "");
		field5340 = new LoginType(1, 1, "", "");
		field5336 = new LoginType(0, 2, "", "");
		field5338 = new LoginType(6, 3, "", "");
		field5339 = new LoginType(5, 4, "", "");
		field5335 = new LoginType(7, 5, "", "");
		field5341 = new LoginType(3, 6, "", "");
		field5342 = new LoginType(4, 7, "", "");
		field5343 = new LoginType(8, -1, "", "", true, new LoginType[]{oldscape, field5340, field5336, field5339, field5338});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5337 = var1;
		this.field5345 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lur;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5337 = var1;
		this.field5345 = var4;
	}

	public String toString() {
		return this.field5345;
	}
}
