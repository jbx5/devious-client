import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class429 implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	class430 field4732;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 317340959
	)
	int field4733;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1536068071
	)
	int field4734;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	class429(class430 var1) {
		this.field4733 = 0;
		this.field4734 = this.field4732.field4739;
		this.field4732 = var1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4732.field4739 != this.field4734) {
			throw new ConcurrentModificationException();
		} else if (this.field4733 < this.field4732.field4737) {
			Object var1 = this.field4732.field4735[this.field4733].field4730;
			++this.field4733;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.field4733 < this.field4732.field4737;
	}
}
