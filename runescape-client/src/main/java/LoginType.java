import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5287;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5288;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5289;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5290;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5286;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5294;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final LoginType field5292;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static final LoginType field5296;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1140900377
	)
	final int field5295;
	@ObfuscatedName("al")
	final String field5293;

	static {
		oldscape = new LoginType(1, 0, "", "");
		field5287 = new LoginType(8, 1, "", "");
		field5288 = new LoginType(5, 2, "", "");
		field5289 = new LoginType(0, 3, "", "");
		field5290 = new LoginType(3, 4, "", "");
		field5286 = new LoginType(2, 5, "", "");
		field5294 = new LoginType(6, 6, "", "");
		field5292 = new LoginType(4, 7, "", "");
		field5296 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field5287, field5288, field5290, field5289});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5295 = var1;
		this.field5293 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lub;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5295 = var1;
		this.field5293 = var4;
	}

	public String toString() {
		return this.field5293;
	}
}
