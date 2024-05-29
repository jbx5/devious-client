import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class428 implements Iterator {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class429 field4715;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 258225695
	)
	int field4716;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1135055625
	)
	int field4717;

	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	class428(class429 var1) {
		this.field4716 = 0;
		this.field4717 = this.field4715.field4722;
		this.field4715 = var1;
	}

	public Object next() {
		if (this.field4715.field4722 != this.field4717) {
			throw new ConcurrentModificationException();
		} else if (this.field4716 < this.field4715.field4721) {
			Object var1 = this.field4715.field4723[this.field4716].field4713;
			++this.field4716;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field4716 < this.field4715.field4721;
	}
}
