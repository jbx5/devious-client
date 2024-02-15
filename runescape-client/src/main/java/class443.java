import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public final class class443 implements Comparable {
	@ObfuscatedName("aq")
	Object field4722;
	@ObfuscatedName("aw")
	Object field4721;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -8486235404290202371L
	)
	long field4723;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 3666353477532767515L
	)
	long field4724;

	class443(Object var1, Object var2) {
		this.field4722 = var1;
		this.field4721 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "86"
	)
	int method8218(class443 var1) {
		if (this.field4724 < var1.field4724) {
			return -1;
		} else {
			return this.field4724 > var1.field4724 ? 1 : 0;
		}
	}

	public int hashCode() {
		return this.field4721.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8218((class443)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class443) {
			return this.field4721.equals(((class443)var1).field4721);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
