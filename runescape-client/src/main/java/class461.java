import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class461 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	public static final class461 field4777;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static final class461 field4776;
	@ObfuscatedName("ar")
	String field4778;

	static {
		field4777 = new class461("application/json");
		field4776 = new class461("text/plain");
	}

	class461(String var1) {
		this.field4778 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "15"
	)
	public String method8386() {
		return this.field4778;
	}
}
