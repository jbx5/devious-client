import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	Node field4727;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	Node field4728;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4728 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("aw")
	@Export("start")
	void start() {
		this.field4727 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4728 = null;
	}

	public Object next() {
		Node var1 = this.field4727;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4727 = null;
		} else {
			this.field4727 = var1.previous;
		}

		this.field4728 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4727 && this.field4727 != null;
	}

	public void remove() {
		if (this.field4728 == null) {
			throw new IllegalStateException();
		} else {
			this.field4728.remove();
			this.field4728 = null;
		}
	}
}
