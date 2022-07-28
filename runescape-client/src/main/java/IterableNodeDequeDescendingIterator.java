import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("la")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("deque")
	IterableNodeDeque deque;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lor;")
	Node field4146;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lor;")
	@Export("last")
	Node last = null;

	@ObfuscatedSignature(descriptor = "(Lln;)V")
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.setDeque(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lln;)V")
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("q")
	@Export("start")
	void start() {
		this.field4146 = (this.deque != null) ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4146 && this.field4146 != null;
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
		Node var1 = this.field4146;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4146 = null;
		} else {
			this.field4146 = var1.previous;
		}
		this.last = var1;
		return var1;
	}
}