import net.runelite.mapping.ObfuscatedName;
import java.util.ConcurrentModificationException;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
@ObfuscatedName("mp")
public class class347 implements Iterator {
	@ObfuscatedName("d")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lmh;")
	class348 field4189;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -223501929)
	int field4187 = 0;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 267058179)
	int field4188;

	@ObfuscatedSignature(descriptor = "(Lmh;)V")
	class347(class348 var1) {
		this.field4188 = this.field4189.field4194;
		this.field4189 = var1;
	}

	public boolean hasNext() {
		return this.field4187 < this.field4189.field4193;
	}

	public Object next() {
		if (this.field4189.field4194 != this.field4188) {
			throw new ConcurrentModificationException();
		} else if (this.field4187 < this.field4189.field4193) {
			Object var1 = this.field4189.field4191[this.field4187].field4185;
			++this.field4187;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}