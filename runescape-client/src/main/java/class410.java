import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class410 implements Iterator {
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -1593024751
	)
	static int field4556;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class411 field4558;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1806140175
	)
	int field4557;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -591196913
	)
	int field4559;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class410(class411 var1) {
		this.field4557 = 0;
		this.field4559 = this.field4558.field4561;
		this.field4558 = var1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4558.field4561 != this.field4559) {
			throw new ConcurrentModificationException();
		} else if (this.field4557 < this.field4558.field4563) {
			Object var1 = this.field4558.field4562[this.field4557].field4554;
			++this.field4557;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.field4557 < this.field4558.field4563;
	}
}
