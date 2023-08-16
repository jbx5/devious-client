import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class391 implements Iterator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	class392 field4442;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 150272453
	)
	int field4443;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1979527987
	)
	int field4444;

	@ObfuscatedSignature(
		descriptor = "(Lpa;)V"
	)
	class391(class392 var1) {
		this.field4443 = 0;
		this.field4444 = this.field4442.field4446;
		this.field4442 = var1;
	}

	public boolean hasNext() {
		return this.field4443 < this.field4442.field4450;
	}

	public Object next() {
		if (this.field4442.field4446 != this.field4444) {
			throw new ConcurrentModificationException();
		} else if (this.field4443 < this.field4442.field4450) {
			Object var1 = this.field4442.field4448[this.field4443].field4440;
			++this.field4443;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
