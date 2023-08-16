import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class418 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class418 field4593;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class418 field4594;
	@ObfuscatedName("ao")
	final String field4595;

	static {
		field4593 = new class418("Basic");
		field4594 = new class418("Bearer");
	}

	class418(String var1) {
		this.field4595 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "75"
	)
	String method7712() {
		return this.field4595;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrq;",
		garbageValue = "-2125486223"
	)
	static class453[] method7713() {
		return new class453[]{class453.field4764, class453.field4762, class453.field4765, class453.field4763};
	}
}
