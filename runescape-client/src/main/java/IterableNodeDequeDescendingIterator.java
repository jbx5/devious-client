import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("lx")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llk;")
	@Export("deque")
	IterableNodeDeque deque;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Loh;")
	Node field4125;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Loh;")
	@Export("last")
	Node last;

	@ObfuscatedSignature(descriptor = "(Llk;)V")
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llk;)V")
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("v")
	@Export("start")
	void start() {
		this.field4125 = (this.deque != null) ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field4125;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4125 = null;
		} else {
			this.field4125 = var1.previous;
		}
		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4125 && this.field4125 != null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}
}