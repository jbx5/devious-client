import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class407 implements Iterator {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static class470 field4517;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	class408 field4514;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1593717779
	)
	int field4515;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 342259157
	)
	int field4516;

	@ObfuscatedSignature(
		descriptor = "(Lpn;)V"
	)
	class407(class408 var1) {
		this.field4515 = 0;
		this.field4516 = this.field4514.field4523;
		this.field4514 = var1;
	}

	public boolean hasNext() {
		return this.field4515 < this.field4514.field4520;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4514.field4523 != this.field4516) {
			throw new ConcurrentModificationException();
		} else if (this.field4515 < this.field4514.field4520) {
			Object var1 = this.field4514.field4519[this.field4515].field4512;
			++this.field4515;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-524883043"
	)
	public static int method7558() {
		return ViewportMouse.ViewportMouse_entityCount;
	}
}
