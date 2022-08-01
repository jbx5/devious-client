import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pa")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("oldscape")
	public static final LoginType oldscape = new LoginType(6, 0, "", "");

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4625 = new LoginType(8, 1, "", "");

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4623 = new LoginType(2, 2, "", "");

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4626 = new LoginType(0, 3, "", "");

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4627 = new LoginType(3, 4, "", "");

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4628 = new LoginType(5, 5, "", "");

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4632 = new LoginType(1, 6, "", "");

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lpa;")
	static final LoginType field4630 = new LoginType(7, 7, "", "");

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lpa;")
	public static final LoginType field4631;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1988829851)
	final int field4624;

	@ObfuscatedName("d")
	final String field4629;

	static {
		field4631 = new LoginType(4, -1, "", "", true, new LoginType[]{ oldscape, field4625, field4623, field4627, field4626 });
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4624 = var1;
		this.field4629 = var4;
	}

	@ObfuscatedSignature(descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpa;)V")
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4624 = var1;
		this.field4629 = var4;
	}

	public String toString() {
		return this.field4629;
	}
}