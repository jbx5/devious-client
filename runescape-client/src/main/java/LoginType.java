import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5028;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5033;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5030;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5027;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5031;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5037;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5035;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	public static final LoginType field5032;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 10973075
	)
	final int field5036;
	@ObfuscatedName("ag")
	final String field5034;

	static {
		oldscape = new LoginType(4, 0, "", "");
		field5028 = new LoginType(6, 1, "", "");
		field5033 = new LoginType(3, 2, "", "");
		field5030 = new LoginType(5, 3, "", "");
		field5027 = new LoginType(7, 4, "", "");
		field5031 = new LoginType(8, 5, "", "");
		field5037 = new LoginType(2, 6, "", "");
		field5035 = new LoginType(0, 7, "", "");
		field5032 = new LoginType(1, -1, "", "", true, new LoginType[]{oldscape, field5028, field5033, field5027, field5030});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5036 = var1;
		this.field5034 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lte;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5036 = var1;
		this.field5034 = var4;
	}

	public String toString() {
		return this.field5034;
	}
}
