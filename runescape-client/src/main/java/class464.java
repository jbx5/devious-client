import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
class class464 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	final class465 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrs;)V"
	)
	class464(class465 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)I",
		garbageValue = "-1866086103"
	)
	int method8881(class466 var1, class466 var2) {
		if (var1.field4974 > var2.field4974) {
			return 1;
		} else {
			return var1.field4974 < var2.field4974 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8881((class466)var1, (class466)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
