import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4657;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4655;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4655 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ad")
	@Export("start")
	void start() {
		this.field4657 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4655 = null;
	}

	public void remove() {
		this.field4655.remove();
		this.field4655 = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4657 && this.field4657 != null;
	}

	public Object next() {
		Node var1 = this.field4657;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4657 = null;
		} else {
			this.field4657 = var1.previous;
		}

		this.field4655 = var1;
		return var1;
	}
}
