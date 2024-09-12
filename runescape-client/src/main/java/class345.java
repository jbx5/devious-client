import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class345 implements Comparator {
	class345() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-1268957550"
	)
	int method6757(class338 var1, class338 var2) {
		return var1.field3680 - var2.field3680;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6757((class338)var1, (class338)var2);
	}
}
