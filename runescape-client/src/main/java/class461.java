import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class class461 implements Comparable {
	@ObfuscatedName("ak")
	Object field4892;
	@ObfuscatedName("al")
	Object field4890;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1954274935841283343L
	)
	long field4891;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -7230775126662755803L
	)
	long field4889;

	class461(Object var1, Object var2) {
		this.field4892 = var1;
		this.field4890 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)I",
		garbageValue = "-899352699"
	)
	int method8502(class461 var1) {
		if (this.field4889 < var1.field4889) {
			return -1;
		} else {
			return this.field4889 > var1.field4889 ? 1 : 0;
		}
	}

	public int hashCode() {
		return this.field4890.hashCode();
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class461) {
			return this.field4890.equals(((class461)var1).field4890);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method8502((class461)var1);
	}
}
