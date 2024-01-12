import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	Node field4476;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lph;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lph;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ap")
	@Export("start")
	void start() {
		this.field4476 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field4476;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4476 = null;
		} else {
			this.field4476 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4476 && this.field4476 != null;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
