import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	Node field4631;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("al")
	@Export("start")
	void start() {
		this.field4631 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field4631;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4631 = null;
		} else {
			this.field4631 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4631 && this.field4631 != null;
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
