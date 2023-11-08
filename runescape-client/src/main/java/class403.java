import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class403 implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	class404 field4478;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1176280827
	)
	int field4477;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -60441427
	)
	int field4476;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	class403(class404 var1) {
		this.field4477 = 0;
		this.field4476 = this.field4478.field4483;
		this.field4478 = var1;
	}

	public boolean hasNext() {
		return this.field4477 < this.field4478.field4485;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4478.field4483 != this.field4476) {
			throw new ConcurrentModificationException();
		} else if (this.field4477 < this.field4478.field4485) {
			Object var1 = this.field4478.field4481[this.field4477].field4474;
			++this.field4477;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "14"
	)
	static final int method7480(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
