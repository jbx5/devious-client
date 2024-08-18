import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5250;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5258;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5259;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5253;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5254;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5252;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5256;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	public static final LoginType field5257;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1910764611
	)
	public final int field5249;
	@ObfuscatedName("aq")
	final String field5255;

	static {
		oldscape = new LoginType(3, 0, "", "");
		field5250 = new LoginType(0, 1, "", "");
		field5258 = new LoginType(1, 2, "", "");
		field5259 = new LoginType(2, 3, "", "");
		field5253 = new LoginType(8, 4, "", "");
		field5254 = new LoginType(4, 5, "", "");
		field5252 = new LoginType(6, 6, "", "");
		field5256 = new LoginType(5, 7, "", "");
		field5257 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field5250, field5258, field5253, field5259});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5249 = var1;
		this.field5255 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luk;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5249 = var1;
		this.field5255 = var4;
	}

	public String toString() {
		return this.field5255;
	}
}
