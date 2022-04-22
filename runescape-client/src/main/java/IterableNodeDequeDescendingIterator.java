import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llk;")

	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	Node field4083;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	@Export("last")
	Node last;

	@ObfuscatedSignature(descriptor = 
	"(Llk;)V")

	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llk;)V")

	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("c")
	@Export("start")
	void start() {
		this.field4083 = (this.deque != null) ? this.deque.sentinel.previous : null;
		this.last = null;
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
		Node var1 = this.field4083;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4083 = null;
		} else {
			this.field4083 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return (this.deque.sentinel != this.field4083) && (this.field4083 != null);
	}
}