import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
class class422 implements Comparator {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static AbstractArchive field4609;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	final class423 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqv;)V"
	)
	class422(class423 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqj;Lqj;I)I",
		garbageValue = "-1576026190"
	)
	int method7770(class424 var1, class424 var2) {
		if (var1.field4622 > var2.field4622) {
			return 1;
		} else {
			return var1.field4622 < var2.field4622 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7770((class424)var1, (class424)var2);
	}
}
