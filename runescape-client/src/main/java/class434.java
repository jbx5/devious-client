import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
class class434 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	final class435 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	class434(class435 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;I)I",
		garbageValue = "1841574446"
	)
	int method8009(class436 var1, class436 var2) {
		if (var1.field4657 > var2.field4657) {
			return 1;
		} else {
			return var1.field4657 < var2.field4657 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8009((class436)var1, (class436)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
