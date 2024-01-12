import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class330 implements Comparator {
	class330() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lmj;I)I",
		garbageValue = "1955936536"
	)
	int method6294(class323 var1, class323 var2) {
		return var1.field3520 - var2.field3520;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6294((class323)var1, (class323)var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1680995991"
	)
	static int method6301(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
