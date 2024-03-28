import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	Node field4542;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ah")
	@Export("start")
	void start() {
		this.field4542 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4542 && this.field4542 != null;
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
		Node var1 = this.field4542;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4542 = null;
		} else {
			this.field4542 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
