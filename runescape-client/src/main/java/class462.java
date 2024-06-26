import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public final class class462 implements Comparable {
	@ObfuscatedName("aq")
	Object field4910;
	@ObfuscatedName("ad")
	Object field4908;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -7190560191872217359L
	)
	long field4907;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -7831916633328325349L
	)
	long field4909;

	class462(Object var1, Object var2) {
		this.field4910 = var1;
		this.field4908 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)I",
		garbageValue = "-454597826"
	)
	int method8440(class462 var1) {
		if (this.field4909 < var1.field4909) {
			return -1;
		} else {
			return this.field4909 > var1.field4909 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class462) {
			return this.field4908.equals(((class462)var1).field4908);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4908.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8440((class462)var1);
	}
}
