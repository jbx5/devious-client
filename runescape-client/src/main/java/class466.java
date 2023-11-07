import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class466 implements class471 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	public final class501 field4799;

	@ObfuscatedSignature(
		descriptor = "(Ltq;)V"
	)
	class466(class502 var1) {
		this.field4799 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	public class466(class467 var1) {
		this(new class502(var1));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1855937345"
	)
	public int method8529(int var1) {
		return this.field4799.vmethod8999(var1);
	}
}
