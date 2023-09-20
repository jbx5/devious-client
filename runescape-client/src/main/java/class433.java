import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class433 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static final class433 field4637;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static final class433 field4636;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 302131747
	)
	static int field4639;
	@ObfuscatedName("ak")
	final String field4635;

	static {
		field4637 = new class433("Basic");
		field4636 = new class433("Bearer");
	}

	class433(String var1) {
		this.field4635 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "36"
	)
	String method7857() {
		return this.field4635;
	}
}
