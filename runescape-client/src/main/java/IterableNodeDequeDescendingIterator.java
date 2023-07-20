import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	Node field4415;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lor;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lor;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ay")
	@Export("start")
	void start() {
		this.field4415 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4415 && this.field4415 != null;
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
		Node var1 = this.field4415;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4415 = null;
		} else {
			this.field4415 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
