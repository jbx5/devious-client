import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
class class460 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	final class461 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrb;)V"
	)
	class460(class461 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)I",
		garbageValue = "-2141911533"
	)
	int method8414(class462 var1, class462 var2) {
		if (var1.field4907 > var2.field4907) {
			return 1;
		} else {
			return var1.field4907 < var2.field4907 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method8414((class462)var1, (class462)var2);
	}
}
