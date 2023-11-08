import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public final class class436 implements Comparable {
	@ObfuscatedName("at")
	Object field4655;
	@ObfuscatedName("ah")
	Object field4658;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 4214717301470683767L
	)
	long field4657;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 6253987156068296455L
	)
	long field4656;

	class436(Object var1, Object var2) {
		this.field4655 = var1;
		this.field4658 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)I",
		garbageValue = "1786312392"
	)
	int method8038(class436 var1) {
		if (this.field4656 < var1.field4656) {
			return -1;
		} else {
			return this.field4656 > var1.field4656 ? 1 : 0;
		}
	}

	public int compareTo(Object var1) {
		return this.method8038((class436)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class436) {
			return this.field4658.equals(((class436)var1).field4658);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4658.hashCode();
	}
}
