import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class392 implements Iterator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	class393 field4452;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -354642565
	)
	int field4454;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 938762145
	)
	int field4453;

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	class392(class393 var1) {
		this.field4454 = 0;
		this.field4453 = this.field4452.field4459;
		this.field4452 = var1;
	}

	public boolean hasNext() {
		return this.field4454 < this.field4452.field4457;
	}

	public Object next() {
		if (this.field4452.field4459 != this.field4453) {
			throw new ConcurrentModificationException();
		} else if (this.field4454 < this.field4452.field4457) {
			Object var1 = this.field4452.field4455[this.field4454].field4450;
			++this.field4454;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
