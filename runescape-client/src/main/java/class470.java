import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class470 implements class475 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	public final class505 field4835;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	class470(class506 var1) {
		this.field4835 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lsn;)V"
	)
	public class470(class471 var1) {
		this(new class506(var1));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1280655576"
	)
	public int method8647(int var1) {
		return this.field4835.vmethod9122(var1);
	}
}
