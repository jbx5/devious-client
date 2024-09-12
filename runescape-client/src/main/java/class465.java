import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class465 implements Comparable {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -515103935
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ac")
	Object field4947;
	@ObfuscatedName("ae")
	Object field4948;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -7450097952003953423L
	)
	long field4949;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -5928809105467844723L
	)
	long field4950;

	class465(Object var1, Object var2) {
		this.field4947 = var1;
		this.field4948 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrt;B)I",
		garbageValue = "-3"
	)
	int method8772(class465 var1) {
		if (this.field4950 < var1.field4950) {
			return -1;
		} else {
			return this.field4950 > var1.field4950 ? 1 : 0;
		}
	}

	public int compareTo(Object var1) {
		return this.method8772((class465)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class465) {
			return this.field4948.equals(((class465)var1).field4948);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4948.hashCode();
	}
}
