import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("my")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lme;")
	@Export("queue")
	IterableDualNodeQueue queue;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lob;")
	@Export("head")
	DualNode head;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lob;")
	@Export("last")
	DualNode last = null;

	@ObfuscatedSignature(descriptor = "(Lme;)V")
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

	public boolean hasNext() {
		return this.queue.sentinel != this.head;
	}

	public void remove() {
		this.last.removeDual();
		this.last = null;
	}
}