import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("mn")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lms;")
	@Export("queue")
	IterableDualNodeQueue queue;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Loa;")
	@Export("head")
	DualNode head;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Loa;")
	@Export("last")
	DualNode last = null;

	@ObfuscatedSignature(descriptor = "(Lms;)V")
	IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
		this.queue = var1;
		this.head = this.queue.sentinel.previousDual;
		this.last = null;
	}

	public Object next() {
		DualNode var1 = this.head;
		if (var1 == this.queue.sentinel) {
			var1 = null;
			this.head = null;
		} else {
			this.head = var1.previousDual;
		}
		this.last = var1;
		return var1;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.removeDual();
			this.last = null;
		}
	}

	public boolean hasNext() {
		return this.queue.sentinel != this.head;
	}
}