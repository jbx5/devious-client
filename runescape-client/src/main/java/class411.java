import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class411 implements Iterator {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class412 field4574;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1456196905
	)
	int field4575;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2087093497
	)
	int field4577;

	@ObfuscatedSignature(
		descriptor = "(Lpt;)V"
	)
	class411(class412 var1) {
		this.field4575 = 0;
		this.field4577 = this.field4574.field4582;
		this.field4574 = var1;
	}

	public boolean hasNext() {
		return this.field4575 < this.field4574.field4580;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4574.field4582 != this.field4577) {
			throw new ConcurrentModificationException();
		} else if (this.field4575 < this.field4574.field4580) {
			Object var1 = this.field4574.field4584[this.field4575].field4573;
			++this.field4575;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Liq;",
		garbageValue = "-114"
	)
	public static FloorUnderlayDefinition method7472(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
