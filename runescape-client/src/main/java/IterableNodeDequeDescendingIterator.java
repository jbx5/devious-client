import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	Node field4627;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	Node field4628;

	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4628 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ay")
	@Export("start")
	void start() {
		this.field4627 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4628 = null;
	}

	public Object next() {
		Node var1 = this.field4627;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4627 = null;
		} else {
			this.field4627 = var1.previous;
		}

		this.field4628 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4627 && this.field4627 != null;
	}

	public void remove() {
		if (this.field4628 == null) {
			throw new IllegalStateException();
		} else {
			this.field4628.remove();
			this.field4628 = null;
		}
	}
}
