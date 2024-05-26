import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5223;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5219;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5222;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5228;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5224;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5225;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	static final LoginType field5226;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	public static final LoginType field5227;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 781445249
	)
	final int field5220;
	@ObfuscatedName("ah")
	final String field5229;

	static {
		oldscape = new LoginType(2, 0, "", "");
		field5223 = new LoginType(6, 1, "", "");
		field5219 = new LoginType(8, 2, "", "");
		field5222 = new LoginType(7, 3, "", "");
		field5228 = new LoginType(4, 4, "", "");
		field5224 = new LoginType(5, 5, "", "");
		field5225 = new LoginType(0, 6, "", "");
		field5226 = new LoginType(1, 7, "", "");
		field5227 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field5223, field5219, field5228, field5222});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5220 = var1;
		this.field5229 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lux;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5220 = var1;
		this.field5229 = var4;
	}

	public String toString() {
		return this.field5229;
	}
}
