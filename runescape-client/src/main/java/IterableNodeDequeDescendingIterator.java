import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	Node field4518;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lpo;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpo;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("aw")
	@Export("start")
	void start() {
		this.field4518 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4518 && this.field4518 != null;
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
		Node var1 = this.field4518;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4518 = null;
		} else {
			this.field4518 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
