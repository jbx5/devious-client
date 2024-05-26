import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class240 implements Comparator {
	class240() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lim;Lim;S)I",
		garbageValue = "128"
	)
	int method4578(class232 var1, class232 var2) {
		return var1.method4488() - var2.method4488();
	}

	public int compare(Object var1, Object var2) {
		return this.method4578((class232)var1, (class232)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
