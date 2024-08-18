import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
class class461 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	final class462 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	class461(class462 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)I",
		garbageValue = "-1552630741"
	)
	int method8487(class463 var1, class463 var2) {
		if (var1.field4888 > var2.field4888) {
			return 1;
		} else {
			return var1.field4888 < var2.field4888 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8487((class463)var1, (class463)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
