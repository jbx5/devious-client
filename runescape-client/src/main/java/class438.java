import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
class class438 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	final class439 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqj;)V"
	)
	class438(class439 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;B)I",
		garbageValue = "16"
	)
	int method8128(class440 var1, class440 var2) {
		if (var1.field4694 > var2.field4694) {
			return 1;
		} else {
			return var1.field4694 < var2.field4694 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8128((class440)var1, (class440)var2);
	}
}
