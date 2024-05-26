import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class340 implements Comparator {
	class340() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmy;Lmy;B)I",
		garbageValue = "0"
	)
	int method6483(class333 var1, class333 var2) {
		return var1.field3639 - var2.field3639;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6483((class333)var1, (class333)var2);
	}
}
