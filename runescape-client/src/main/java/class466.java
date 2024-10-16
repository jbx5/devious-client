import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class class466 implements Comparable {
	@ObfuscatedName("ap")
	Object field4970;
	@ObfuscatedName("aw")
	Object field4971;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -7023941384732440211L
	)
	long field4974;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1350957852148844265L
	)
	long field4973;

	class466(Object var1, Object var2) {
		this.field4970 = var1;
		this.field4971 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I)I",
		garbageValue = "1460852809"
	)
	int method8912(class466 var1) {
		if (this.field4973 < var1.field4973) {
			return -1;
		} else {
			return this.field4973 > var1.field4973 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class466) {
			return this.field4971.equals(((class466)var1).field4971);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4971.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8912((class466)var1);
	}
}
