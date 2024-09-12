import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	Node field4677;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	Node field4678;

	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4678 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ae")
	@Export("start")
	void start() {
		this.field4677 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4678 = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4677 && this.field4677 != null;
	}

	public void remove() {
		if (this.field4678 == null) {
			throw new IllegalStateException();
		} else {
			this.field4678.remove();
			this.field4678 = null;
		}
	}

	public Object next() {
		Node var1 = this.field4677;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4677 = null;
		} else {
			this.field4677 = var1.previous;
		}

		this.field4678 = var1;
		return var1;
	}
}
