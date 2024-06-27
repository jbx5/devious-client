import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5248;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5247;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5257;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5250;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5252;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5251;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static final LoginType field5254;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	public static final LoginType field5255;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1512992761
	)
	public final int field5249;
	@ObfuscatedName("ae")
	final String field5256;

	static {
		oldscape = new LoginType(4, 0, "", "");
		field5248 = new LoginType(1, 1, "", "");
		field5247 = new LoginType(7, 2, "", "");
		field5257 = new LoginType(8, 3, "", "");
		field5250 = new LoginType(3, 4, "", "");
		field5252 = new LoginType(0, 5, "", "");
		field5251 = new LoginType(5, 6, "", "");
		field5254 = new LoginType(6, 7, "", "");
		field5255 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5248, field5247, field5250, field5257});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5249 = var1;
		this.field5256 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luu;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5249 = var1;
		this.field5256 = var4;
	}

	public String toString() {
		return this.field5256;
	}
}
