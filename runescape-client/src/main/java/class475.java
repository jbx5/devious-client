import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public class class475 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	public static final class475 field4818;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	static final class475 field4819;
	@ObfuscatedName("ak")
	String field4817;

	static {
		field4818 = new class475("application/json");
		field4819 = new class475("text/plain");
	}

	class475(String var1) {
		this.field4817 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "733315880"
	)
	public String method8476() {
		return this.field4817;
	}
}
