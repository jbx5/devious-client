import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	Node field4169;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Llz;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null; // L: 9
		this.setDeque(var1); // L: 12
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llz;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1; // L: 16
		this.start(); // L: 17
	} // L: 18

	@ObfuscatedName("p")
	@Export("start")
	void start() {
		this.field4169 = this.deque != null ? this.deque.sentinel.previous : null; // L: 21
		this.last = null; // L: 22
	} // L: 23

	public Object next() {
		Node var1 = this.field4169; // L: 27
		if (var1 == this.deque.sentinel) { // L: 28
			var1 = null; // L: 29
			this.field4169 = null; // L: 30
		} else {
			this.field4169 = var1.previous; // L: 32
		}

		this.last = var1; // L: 33
		return var1; // L: 34
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4169 && this.field4169 != null; // L: 38
	}

	public void remove() {
		this.last.remove(); // L: 43
		this.last = null; // L: 44
	} // L: 45
}
