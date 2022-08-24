import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("lw")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Llx;")
	@Export("deque")
	IterableNodeDeque deque;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lon;")
	Node field4127;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lon;")
	@Export("last")
	Node last = null;

	@ObfuscatedSignature(descriptor = "(Llx;)V")
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.setDeque(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Llx;)V")
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("h")
	@Export("start")
	void start() {
		this.field4127 = (this.deque != null) ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public Object next() {
		Node var1 = this.field4127;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4127 = null;
		} else {
			this.field4127 = var1.previous;
		}
		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4127 && this.field4127 != null;
	}
}