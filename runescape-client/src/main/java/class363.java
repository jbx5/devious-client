import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("mi")
public final class class363 implements Comparable {
	@ObfuscatedName("s")
	Object field4272;

	@ObfuscatedName("h")
	Object field4271;

	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 8385483307841793077L)
	long field4270;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = -6217609528511420767L)
	long field4273;

	class363(Object var1, Object var2) {
		this.field4272 = var1;
		this.field4271 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lmi;S)I", garbageValue = "-16641")
	int method6513(class363 var1) {
		if (this.field4273 < var1.field4273) {
			return -1;
		} else {
			return this.field4273 > var1.field4273 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class363) {
			return this.field4271.equals(((class363) (var1)).field4271);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method6513(((class363) (var1)));
	}

	public int hashCode() {
		return this.field4271.hashCode();
	}
}