import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
class class441 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	final class442 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrw;)V"
	)
	class441(class442 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrq;Lrq;I)I",
		garbageValue = "-2103454061"
	)
	int method8191(class443 var1, class443 var2) {
		if (var1.field4723 > var2.field4723) {
			return 1;
		} else {
			return var1.field4723 < var2.field4723 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8191((class443)var1, (class443)var2);
	}
}
