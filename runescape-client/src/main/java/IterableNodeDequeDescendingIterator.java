import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	Node field4097;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Loz;")

	@Export("last")
	Node last;

	@ObfuscatedSignature(descriptor = 
	"(Lld;)V")

	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lld;)V")

	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("o")
	@Export("start")
	void start() {
		this.field4097 = (this.deque != null) ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field4097;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4097 = null;
		} else {
			this.field4097 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}

	public boolean hasNext() {
		return (this.deque.sentinel != this.field4097) && (this.field4097 != null);
	}
}