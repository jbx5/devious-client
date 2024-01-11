import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public final class class440 implements Comparable {
	@ObfuscatedName("am")
	Object field4693;
	@ObfuscatedName("ap")
	Object field4692;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8117989091018222727L
	)
	long field4694;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5202280088486027675L
	)
	long field4691;

	class440(Object var1, Object var2) {
		this.field4693 = var1;
		this.field4692 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)I",
		garbageValue = "1851234429"
	)
	int method8153(class440 var1) {
		if (this.field4691 < var1.field4691) {
			return -1;
		} else {
			return this.field4691 > var1.field4691 ? 1 : 0;
		}
	}

	public int compareTo(Object var1) {
		return this.method8153((class440)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class440) {
			return this.field4692.equals(((class440)var1).field4692);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4692.hashCode();
	}
}
