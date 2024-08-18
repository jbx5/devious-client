import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public final class class463 implements Comparable {
	@ObfuscatedName("ab")
	Object field4889;
	@ObfuscatedName("ay")
	Object field4887;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -1276993000611469905L
	)
	long field4888;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -4020752064076746135L
	)
	long field4886;

	class463(Object var1, Object var2) {
		this.field4889 = var1;
		this.field4887 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)I",
		garbageValue = "44"
	)
	int method8515(class463 var1) {
		if (this.field4886 < var1.field4886) {
			return -1;
		} else {
			return this.field4886 > var1.field4886 ? 1 : 0;
		}
	}

	public int hashCode() {
		return this.field4887.hashCode();
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class463) {
			return this.field4887.equals(((class463)var1).field4887);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method8515((class463)var1);
	}
}
